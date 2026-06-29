
import java.util.Scanner;

/*
Q-> print last char of every word in a string
Condition: ignore whitespaces and digits
Input: Hey3 Java Learners
Output: as 
 */

public class LastChar {
  public static void main(String[] args) {
      
      try (Scanner sc = new Scanner(System.in)) {
        System.out.print("Enter string: ");
          String str = sc.nextLine();

          //! way 1
          String ot = "";
          for(int i =0; i <str.length();i++){
            char ch = str.charAt(i);
            if(ch==' ' && i>0){
              char prevCh = str.charAt(i-1);
              if((prevCh>='a' && prevCh<='z') || (prevCh>='A' && prevCh<='Z')){
                ot+=prevCh;
              }
            }
          }

          char lastCh = str.charAt(str.length()-1);
          if((lastCh>='a' && lastCh<='z') || (lastCh>='A' && lastCh<='Z')){
                ot+=lastCh;
              }
          System.out.println("Output way 1 : "+ot);


          //! way 2
          ot="";
          String strArr [] = str.split(" "); //"Hey3 Java Learners" -> ["Hey3", "Java", "Learners"]

          for(String s : strArr){
                 if (!s.isEmpty()) { // Safety check to prevent crashes
        char ch = s.charAt(s.length() - 1);
        
        // Only append if the literal last character is a letter
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            ot += ch;
        }
    }
          }

           System.out.println("Output way 2 : "+ot);

      } 
  }
}