
import java.util.HashSet;
import java.util.Scanner;

/*
String Input: experience
Output: exprinc
 */
public class RemoveDuplicates {
  public static void main(String[] args) {
      try(Scanner sc = new Scanner(System.in)){
       
        System.out.print("String Input: ");
        String strInput = sc.nextLine();

        boolean freqArr [] = new boolean[26];

        StringBuilder strOutput = new StringBuilder();
        
        for(int i =0; i<strInput.length();i++){
          int idx=strInput.charAt(i)-'a';
          if(!freqArr[idx]){
               freqArr[idx]=true;
               strOutput.append(strInput.charAt(i));
          }
        }

        System.out.println("Output: "+strOutput.toString());
       
        strOutput.setLength(0);

       //! way 2 (This works with every type of character lower case, upper case, special char)
       
        // A HashSet automatically tracks unique items and handles any character type
        HashSet<Character> seen = new HashSet<>();

        for (int i = 0; i < strInput.length(); i++) {
            char ch = strInput.charAt(i);
            // .add() returns true if the item wasn't in the set yet
            if (seen.add(ch)) {
                strOutput.append(ch);
            }
        }

        System.out.println("Output way 2: " + strOutput.toString());
        
      }
  }
}