//This password generator ask user whether include or not different kind of characters
//such as lower case, upper case etc.
// this is done by if blogs
//characters are gathered in letterpool variable and these variables
// added to password variable randomly in a for loop.
import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in); // this is for getting integers
        Scanner scanner2 = new Scanner(System.in); // this is for getting strings

        //Field
        String lowerCases = "abcdefghijklmnoprstuvyzqwx";
        String upperCases = lowerCases.toUpperCase();
        String digits = "0123456789";
        String specialCases = "!#$%&'()*+,-./:;<=>?<>";
        String password = "";
        String letterpool = "";
        int passwordLength;
        String wantLowerCases;
        String wantUpperCases;
        String wantDigits;
        String wantSpecialCases;

        System.out.print("Enter the length of the password: ");
        passwordLength = scanner1.nextInt();

        System.out.print("Want lower cases? (y/n): ");
        wantLowerCases = scanner2.nextLine();

        if (wantLowerCases.equals("y")){
            letterpool = letterpool + lowerCases;
        }

        System.out.print("Want upper cases? (y/n): ");
        wantUpperCases = scanner2.nextLine();

        if (wantUpperCases.equals("y")){
            letterpool = letterpool + upperCases;
        }

        System.out.print("Want digits? (y/n): ");
        wantDigits = scanner2.nextLine();

        if (wantDigits.equals("y")){
            letterpool = letterpool + digits;
        }

        System.out.print("Want special characters? (y/n): ");
        wantSpecialCases = scanner2.nextLine();

        if (wantSpecialCases.equals("y")){
            letterpool = letterpool + specialCases;
        }

        for (int i = 0; i <passwordLength ; i++) {
            Random rand = new Random();
            int r = rand.nextInt(letterpool.length());
            password = password + letterpool.charAt(r);
        }

        System.out.println(password);
    }
}
