import java.util.*;

// Print the vowels in sequence as it is if they appears at first index of a string
//Input : Hello I am a student
//output: Iaa
public class FirstIndexVowel{

  public static void main(String args[]){
    try(Scanner sc = new Scanner (System.in)){
    System.out.print("Input: ");
    String str = sc.nextLine();

    String ot="";
    HashSet<Character> vowelSet = new HashSet<>(Set.of('a','e','i','o','u','A','E','I','O','U'));

    //!way 1
    //for first word char

    if(vowelSet.contains(str.charAt(0))) ot+=str.charAt(0);
    for(int i=1;i<str.length();i++){
          char ch=str.charAt(i);
          if(ch==' ' && (i+1)<str.length() && vowelSet.contains(str.charAt(i+1))){
               ot+=str.charAt(i+1);
          }
    }
      
      System.out.println("Output Way 1: "+ot);
     

     ot="";

    //  !way 2
    String strArr[]= str.split(" ");
    for(String s :strArr){
       if(vowelSet.contains(s.charAt(0))) ot+=s.charAt(0);
    }

    System.out.println("Output Way 2: "+ot);

    }
  }
}