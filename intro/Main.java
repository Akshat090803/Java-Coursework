//! In Java, functions are called methods.
//? A method is a block of code that performs a specific task.
// returnType methodName(parameters) {

//     // code

//     return value;
// }
class Functions_6 {

  //! static method , can be called directly without object creation
  static void Staticgreet (){
    System.out.println("Static Method Good evening");
  }

  //! non static method , needs object to be created to called
  void nonStaticGreet(){
    System.out.println("Non Static Greet");
  }


  //! Method With Parameters
  //? in Java parameters are passed by value
  static void add(int num1,int num2){
    System.out.println(num1 + num2);
  }

  //!Method with return returnType
  static int square(int n) {
        return n * n;
    }


    //! Method Overloading
    //? Same method name with different parameters.

    static void multiply (int num1, int num2){
      System.out.println(num1 * num2);
    }

    static void multiply (int num1,int num2,int num3){
      System.out.println(num1 * num2 * num3);
    }

    

    //! Recursive func
    static int factorial(int n) {

        if(n == 1)
            return 1;

        return n * factorial(n - 1);   
}



  public static void main (String args[]){
      
    //! static method
    Staticgreet();

    //!Non Static method
    Functions_6 obj1 = new Functions_6();
    obj1.nonStaticGreet();


    //?
    add(3,4);

    //?
     int sqr = square(4);
     System.out.println(sqr);

    //? Overlaoding 
    multiply(2,3);
    multiply(2,3,4);


    //? Recursion
    int fact = factorial(5);
    System.out.println(fact);

  }
}



// !Why Use Methods?

//? Methods help:

// Reuse code
// Reduce repetition
// Improve readability
// Make debugging easier


//! Parameters vs Arguments
//? Parameters -	Variables in method definition
// ?Arguments -	Actual values passed

//! Important Interview Points
// Java methods are stored in stack memory during execution.
// main() is the entry point of Java program.
// Only one value can be returned directly.
// Method overloading is compile-time polymorphism.
// void means no return value.
// Java does not support true call by reference.


//! Java does not support true call by reference. than how we write function for swapping the number
//? Java is always pass-by-value, meaning a copy of the variable is passed to the method.
//? So for primitive types like int, actual swapping inside a method does not affect original variables.

// !Correct Ways to Swap in Java
//? Method 1: Using Array (Most Common for Learning)
// Arrays are objects, and object references are passed by value.
// So changes inside method affect original array.
// static void swap(int arr[]) {

//         int temp = arr[0];
//         arr[0] = arr[1];
//         arr[1] = temp;
//     }

//?Method 2: Using Wrapper Class/Object
// class Numbers {

//     int a, b;

//     Numbers(int a, int b) {
//         this.a = a;
//         this.b = b;
//     }
// }

// public class Main {

//     static void swap(Numbers obj) {

//         int temp = obj.a;
//         obj.a = obj.b;
//         obj.b = temp;
//     }

//     public static void main(String[] args) {

//         Numbers n = new Numbers(10, 20);

//         swap(n);

//         System.out.println(n.a + " " + n.b);
//     }
// }