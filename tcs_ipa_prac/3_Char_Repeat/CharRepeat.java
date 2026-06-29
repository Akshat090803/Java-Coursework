
import java.util.Scanner;

// aabbbcc = a2b3c2
// abbccc = a1b2c3

public class CharRepeat{
  public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter: ");
            String str = sc.nextLine();

            char currChar;
            // String ans="";
             StringBuilder ans = new StringBuilder(); // Uses a mutable character array
            int read =0 ;
            int write = 0;

            while(read < str.length()){
               
               currChar = str.charAt(read);

               while(read < str.length() && str.charAt(read) == currChar){
                read++;
               }

               int count = read-write;
              //  ans+=currChar;
              //  ans+=count;
               ans.append(currChar); // More efficient than +=
            ans.append(count);
               write=read;

            }

            System.out.println(str+" = "+ans);

  }
}