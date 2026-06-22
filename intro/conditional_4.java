class conditional_4{
  public static void main(String args[]){
    int marks = 75;

if(marks >= 90) {
    System.out.println("Grade A");
}
else if(marks >= 70) {
    System.out.println("Grade B");
}
else if(marks >= 50) {
    System.out.println("Grade C");
}
else {
    System.out.println("Fail");
}



// ! Nested if
 int age = 22;
boolean hasLicense = true;

if(age >= 18) {

    if(hasLicense) {
        System.out.println("Can drive");
    }

}


//!Ternary operator 
int currAge = 18;

String result = (currAge >= 18) ? "Adult" : "Minor";

System.out.println(result);



//!Switch Case 
int day = 2;

switch (day) {

    case 1 :
        System.out.println("Monday");
        break;

    case 2:
        System.out.println("Tuesday");
        break;

    case 3:
        System.out.println("Wednesday");
        break;

    default:
        System.out.println("Invalid day");
}

//!Modern switch cASE AFTER java 14+
int day2 = 1;
switch(day2) {

    case 1 -> {
        System.out.println("Monday");
    }

    case 2 -> System.out.println("Tuesday");

    default -> System.out.println("Invalid");
}
  }

}



// Conditional Statements in Java

// Conditional statements are used to make decisions in a program.

// Java supports:

// if
// if-else
// else-if ladder
// Nested if
// Ternary Operator
// switch
// 1. if Statement

// Executes block only when condition is true.

// Syntax
// if(condition) {
//     // code
// }
// Example
// int age = 20;

// if(age >= 18) {
//     System.out.println("Eligible to vote");
// }
// 2. if-else Statement

// Used when there are two possible outcomes.

// Syntax
// if(condition) {
//     // true block
// } else {
//     // false block
// }
// Example
// int number = 5;

// if(number % 2 == 0) {
//     System.out.println("Even");
// } else {
//     System.out.println("Odd");
// }
// 3. else-if Ladder

// Used for multiple conditions.

// Syntax
// if(condition1) {

// } else if(condition2) {

// } else {

// }
// Example
// int marks = 75;

// if(marks >= 90) {
//     System.out.println("Grade A");
// }
// else if(marks >= 70) {
//     System.out.println("Grade B");
// }
// else if(marks >= 50) {
//     System.out.println("Grade C");
// }
// else {
//     System.out.println("Fail");
// }
// 4. Nested if

// An if statement inside another if.

// Example
// int age = 22;
// boolean hasLicense = true;

// if(age >= 18) {

//     if(hasLicense) {
//         System.out.println("Can drive");
//     }

// }
// Comparison Operators
// Operator	Meaning
// ==	Equal to
// !=	Not equal
// >	Greater than
// <	Less than
// >=	Greater than equal
// <=	Less than equal
// Logical Operators
// Operator	Meaning
// &&	AND
// `	
// !	NOT
// Example Using Logical Operators
// int age = 20;
// boolean citizen = true;

// if(age >= 18 && citizen) {
//     System.out.println("Eligible");
// }
// 5. Ternary Operator

// Shortcut for if-else.

// Syntax
// variable = (condition) ? value1 : value2;
// Example
// int age = 18;

// String result = (age >= 18) ? "Adult" : "Minor";

// System.out.println(result);
// Another Example
// int a = 10;
// int b = 20;

// int max = (a > b) ? a : b;

// System.out.println(max);
// Nested Ternary Operator
// int num = 0;

// String result = (num > 0) ? "Positive"
//                 : (num < 0) ? "Negative"
//                 : "Zero";

// System.out.println(result);
// 6. switch Statement

// Used instead of multiple if-else conditions.

// Works with:

// int
// char
// String
// enum
// Syntax
// switch(expression) {

//     case value1:
//         // code
//         break;

//     case value2:
//         // code
//         break;

//     default:
//         // code
// }
// Example 1
// int day = 2;

// switch(day) {

//     case 1:
//         System.out.println("Monday");
//         break;

//     case 2:
//         System.out.println("Tuesday");
//         break;

//     case 3:
//         System.out.println("Wednesday");
//         break;

//     default:
//         System.out.println("Invalid day");
// }
// Importance of break

// break stops execution after matching case.

// Without break, fall-through occurs.

// Example Without break
// int num = 1;

// switch(num) {

//     case 1:
//         System.out.println("One");

//     case 2:
//         System.out.println("Two");

// }
// Output
// One
// Two
// switch with String
// String fruit = "Apple";

// switch(fruit) {

//     case "Apple":
//         System.out.println("Red fruit");
//         break;

//     case "Banana":
//         System.out.println("Yellow fruit");
//         break;

//     default:
//         System.out.println("Unknown fruit");
// }
// Modern Switch (Java 14+)

// Uses arrow ->

// Example
// int day = 1;

// switch(day) {

//     case 1 -> System.out.println("Monday");

//     case 2 -> System.out.println("Tuesday");

//     default -> System.out.println("Invalid");
// }
// if-else vs switch
// if-else	switch
// Complex conditions possible	Only exact matching
// Slower for many conditions	Faster/readable
// Supports ranges	No range checking
// Important Interview Points
// Ternary operator returns a value.
// switch default block is optional.
// break prevents fall-through.
// switch cannot use float, double, boolean.
// if-else is better for range-based conditions.
// Complete Example Program
// public class Main {

//     public static void main(String[] args) {

//         int marks = 85;

//         if(marks >= 90) {
//             System.out.println("A");
//         }
//         else if(marks >= 70) {
//             System.out.println("B");
//         }
//         else {
//             System.out.println("C");
//         }

//         String result = (marks >= 40) ? "Pass" : "Fail";

//         System.out.println(result);

//         int day = 2;

//         switch(day) {

//             case 1:
//                 System.out.println("Monday");
//                 break;

//             case 2:
//                 System.out.println("Tuesday");
//                 break;

//             default:
//                 System.out.println("Invalid");
//         }
//     }
// }