
import java.util.Scanner;

/**
 String Input: DataBaSe
 output: 5
 */

public class CountLowerCase {
  public static void main(String[] args) {
       try(Scanner sc = new Scanner(System.in);) {
           System.out.print("String Input: ");
          String strInput = sc.nextLine();

          int lowerCount =0;
          for(int i =0; i<strInput.length();i++){
               if(strInput.charAt(i)>='a' && strInput.charAt(i)<='z') lowerCount++;
          }

          System.out.println("Output: "+lowerCount);
       } 
  }
}