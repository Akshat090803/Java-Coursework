
import java.util.Scanner;

/*

String Input : Xplore
Character Input : r

output: 4


 */
public class GetCharIndex {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in);) {
            System.out.print("String Input: ");
            String strInput = sc.nextLine();
            System.out.print("Character Input: ");
            char charInput = sc.nextLine().charAt(0);
            //way 1 -> loop
            int charLoc = -1;

            for (int i = 0; i < strInput.length(); i++) {
                if (charInput == strInput.charAt(i)) {
                    charLoc = i;
                    break;
                }
            }

            System.out.println("Way 1 Output: " + charLoc);

            //!way -2 indexOf()
            System.out.println("Way 2 Output: " + strInput.indexOf(charInput));
        }

    }

}
