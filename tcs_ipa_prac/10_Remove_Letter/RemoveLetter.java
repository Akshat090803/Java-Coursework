
import java.util.Scanner;


//letter: l
//output: Heo
public class RemoveLetter{
     
     public static void main(String[] args) {
         try (Scanner sc = new Scanner(System.in)){
              
              System.out.print("Input: ");
              String str=sc.nextLine();
              System.out.print("Letter: ");
              char letter = sc.nextLine().charAt(0);
             
               String output="";
               //!way 1;
               for(int i =0;i<str.length();i++){
                if(str.charAt(i)!=letter) output+=str.charAt(i);
               }

               System.out.println("Output way 1 : "+output);
               

             

               //!way 2  replaceAll()
               //   output=str.replaceAll(String.valueOf(letter),""); //? both replaceAll and replace() will replace all occurence of substring letter with ""
                 output=str.replace(String.valueOf(letter),"");

                  System.out.println("Output way 2 : "+output);

               
         } 
     }
}