
import java.util.*;

/*Write a Java program to check if a given number is an Armstrong number or not.

Here's an example of the expected input and output:

Input number: 153
Output: "Yes, the number is an Armstrong number."

*/

// int -> string use String.valueOf(int x); or Integer.toString(int x);
// string -> int use Integer.parseint( str);
// string -> Integer wrapper obj use Integer.valueOf()
public class Armstrong {
  public static void main(String[] args) {
         
        
         System.out.print("Input number: ");
         Scanner sc = new Scanner(System.in);
         int num  = sc.nextInt();
        
         System.out.println("Number: "+num);

        //  int len = String.valueOf(Math.abs(num)).length();
        //  int len = (num == 0) ? 1 : (int) Math.log10(Math.abs(num)) + 1;
        int len = Integer.toString(Math.abs(num)).length();

        int armsFormed =0;
        int numCopy=num;
        while(num!=0){
          int digit = num%10;
          armsFormed+=Math.pow(digit, len);
          num/=10;
        }


        if(armsFormed==numCopy)System.out.println("Yes, the number is an Armstrong number.");
        else System.out.println("the number is not an Armstrong number.");

        


  }
}