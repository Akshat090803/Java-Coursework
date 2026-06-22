import java.util.Arrays;
public class Strings_9 {
  public static void main(String[] args) {
      
      //!Strings 
      //?In Java, strings are objects. and String is a class
      // Method 1: String Literal
      String s1 = "Akshat"; // Stored in String Pool.
      //Method 2: Using new Keyword
      String s2 = new String("Jain"); // Creates object in heap memory.


      //! String Memory Concept
      String s3 = "Java";
      String s4 = "Java";
      //?In java strings are object.
      //In first we think that s3 and s4 will have two different objects
      //But Only one object created in String Pool.
      //?and hence s3 == s4 will give true
      


      String s5 = "Hello";
      
      System.out.println(s5.length());
      System.out.println(s5.charAt(1));
      // System.out.println(s5[1]);  //?this will not work
      System.out.println(s5.substring(0, 5));


      //! Sort String
          String input = "dcba";
        
        // 1. Convert to char array
        char[] charArray = input.toCharArray();
        
        // 2. Sort the array
        Arrays.sort(charArray);
        
        // 3. Convert back to String
        String sorted = new String(charArray);
        
        System.out.println(sorted); 
  }
} 



//! Strings in Java

//? A String is a sequence of characters.

// Example:

// String name = "Akshat";

// In Java, strings are objects.

// Why String is Special?

// Strings are:

// widely used
// immutable
// optimized using String Pool
// Ways to Create String
// Method 1: String Literal
// String s1 = "Hello";

// Stored in String Pool.

// Method 2: Using new Keyword
// String s2 = new String("Hello");

// Creates object in heap memory.

// String Memory Concept
// String s1 = "Java";
// String s2 = "Java";

// Only one object created in String Pool.

// Visualization
// String Pool
// -------------
// "Java"

// s1 ----|
// s2 ----|
// What is String Pool?

// Special memory area inside heap for string literals.

// Helps save memory.

//! Immutability of String

//? Strings cannot be changed after creation.

// Example
// String s = "Hello";

// s.concat(" World");

// System.out.println(s);
// Output
// Hello

// Because original string remains unchanged.

// Correct Way
// s = s.concat(" World");
// !Common String Methods
//? 1. length()
// String s = "Java";

// System.out.println(s.length());
// Output
// 4
//? 2. charAt()
// String s = "Java";

// System.out.println(s.charAt(1));
// Output
// a
// ?3. substring()
// String s = "Programming";

// System.out.println(s.substring(3, 6));
// Output
// gra

// ?End index excluded.

// ?4. equals()

// Compares content.

// String a = "Java";
// String b = "Java";

// System.out.println(a.equals(b));
//! == vs equals()
//? ==
// Checks reference/address.

//? equals()
// Checks actual content.

//! Example
// String a = new String("Java");
// String b = new String("Java");

// System.out.println(a == b);
// System.out.println(a.equals(b));
// Output
// false
// true
// ?5. compareTo()
// Lexicographical comparison.
// System.out.println("abc".compareTo("abd"));
// Negative value returned.

// ?6. toUpperCase() / toLowerCase()
// String s = "java";

// System.out.println(s.toUpperCase());
//? 7. trim()

// Removes extra spaces.

// String s = "  hello  ";

// System.out.println(s.trim());
// ?8. replace()
// String s = "Java";

// System.out.println(s.replace('a', 'o'));
// Output
// Jovo
