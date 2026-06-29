
import java.util.Scanner;

//Input: Hello I am
//output : ma I olleH
public class ReverseString{
  public static void main(String[] args) {
    
  Scanner sc = new Scanner(System.in);

      System.out.print("Enter: ");
      String str = sc.nextLine();

      String output ="";


      //!Way 1 
      for(int i = str.length()-1 ; i>=0; i--){
        char ch = str.charAt(i);
        output+=ch;
      }

      System.out.println("Reversed way 1: "+output);

      output="";

      //! way 2 two pointer swap  (Second best way)
      // strings in Java are immutable (unchangeable), you cannot swap the characters directly inside the str variable itself
      //To use the two-pointer approach in Java, you must first convert the string into a mutable character array (char[]), perform the swaps, and then convert it back into a String
       char[] charArr = str.toCharArray();
        int left = 0;
        int right = charArr.length - 1;
        while (left < right) {
            char temp = charArr[left];
            charArr[left] = charArr[right];
            charArr[right] = temp;
            left++;
            right--;
        }
        
        // output = charArr.toString(); //?calling .toString() on a raw array in Java just prints a useless memory hash code (like [C@74a14482) instead of the actual text
      output = new String(charArr);

      System.out.println("Reversed way 2: "+output);

      //! way 3   (Best way)
      // The perfect production way:
        output  = new StringBuilder(str).reverse().toString();

        System.out.println("Reversed way 3: "+output);




    
  }
}