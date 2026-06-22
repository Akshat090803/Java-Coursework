// ! 4 types mainly
//? Integer (4 bytes)- subtypes -> byte (1 byte),short (2 byte),long (8 byte)
//?float - float (4 byte) , double (8 byte)
//? char - characters (2byte size as in java char supports UNICODE not  Ascii)
//?boolean - true or false (0 and 1 not supported)

class primitive_variables_2 {

  public static void main(String a[]){
        
        //integers
        int num1 = 45;
        int num2 = 0b101; //binary form
        int num3 = 0x2b; // hexa decimal

        //byte
        byte num4 = 34;
        // byte num5 = 129; // give imcompataible type error as byte is of 1 byte size and store int b/w -128 to 127

        //short
        short num6 = 789;

        //long 
        long num7 = 67573524L;

         
         //!we can seprate 0's with _ for readbaility
         int num8= 10_00_00_000;


         //float
         float num9 = 12.4f;

         //double 
         double num10=45.2334;

         double num11 = 12e10; //exponential 1.2*10^11

         //char
         char grade = 'Y';
         char g='3';

         //boolean 
         boolean b = true;

         System.out.println(num1);
         System.out.println(num2);
         System.out.println(num3);
         System.out.println(num4);
        //  System.out.println(num5);
         System.out.println(num6);
         System.out.println(num7);
         System.out.println(num8);
         System.out.println(num9);
         System.out.println(num10);
         System.out.println(num11);
         System.out.println(grade);
         System.out.println(g);
         System.out.println(b);
        



  }
}






// Primitive Variables in Java

// Java provides 8 primitive data types.
// Primitive variables store actual values directly in memory.

//? 1. byte

// Used for small integer values.

// byte age = 25;
// Details
// Size: 1 byte
// Range: -128 to 127
// Default value: 0
// Uses
// Saving memory
// Arrays with many numbers
//? 2. short

// Stores slightly larger integers.

// short marks = 32000;
// Details
// Size: 2 bytes
// Range: -32,768 to 32,767
// Default value: 0
//? 3. int

// Most commonly used integer type.

// int salary = 50000;
// Details
// Size: 4 bytes
// Range: -2^31 to 2^31-1
// Default value: 0
// Uses
// Loop counters
// Calculations
// General integer storage
//? 4. long

// Used for very large integer values.

// long population = 9000000000L;
// Important

// Always use L at the end.

// Details
// Size: 8 bytes
// Default value: 0L
//? 5. float

// Stores decimal numbers.

// float price = 99.5f;
// Important

// Use f at the end.

// Details
// Size: 4 bytes
// Precision: ~6–7 decimal digits
// Default value: 0.0f
//? 6. double

// More precise decimal type.

// double pi = 3.1415926535;
// Details
// Size: 8 bytes
// Precision: ~15 digits
// Default value: 0.0d
// Preferred for decimal calculations
//? 7. char

// Stores a single character.

// char grade = 'A';
// Important

// Use single quotes ' '.

// Details
// Size: 2 bytes
// Stores Unicode characters
// Default value: '\u0000'
//? 8. boolean

// Stores true or false.

// boolean isJavaFun = true;
// Details
// Values: true or false
// Default value: false