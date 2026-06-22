
class Employee {

    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println(id);
        System.out.println(name);
        System.out.println(salary);
    }
}

public class Classes_7 {

    public static void main(String[] args) {
        
      Employee emp1 = new Employee(1,"Akshat Jain",52000);
      Employee emp2 = new Employee(1,"Manuj Chadha",24000);

      emp2.id=2;
      emp1.display();
      emp2.display();
    }
}

//! Classes and Objects in Java
// Java is an Object-Oriented Programming (OOP) language.
// The two main concepts are:
// Class
// Object
// What is a Class?
//? A class is a blueprint/template for creating objects.
// It defines:
// variables (data)
// methods (behavior)
//? Real Life Example
// Class  → Car blueprint
// Object → Actual car
// ?Example of Class
// class Student {
//     int id;
//     String name;
//     void display() {
//         System.out.println(id + " " + name);
//     }
// }
//? What is an Object?
// An object is a real instance of a class.
// Objects occupy memory.
// Creating Object
// Syntax
// ClassName objectName = new ClassName();
// Example
// Student s1 = new Student();
// Here:
// Student → class
// s1 → object
// new → allocates memory
// Accessing Variables & Methods
//? Use dot . operator.
// Example
// s1.id = 101;
// s1.name = "Akshat";
// s1.display();
//! this Keyword
// this refers to current object.
// Example
// class Student {
//     int id;
//     void setId(int id) {
//         this.id = id;
//     }
// }
//? Constructor
// Special method used to initialize objects.
// Same name as class
// No return type
// Example
// class Student {
//     int id;
//     String name;
//     Student(int i, String n) {
//         id = i;
//         name = n;
//     }
//     void display() {
//         System.out.println(id + " " + name);
//     }
// }
// ?Types of Constructors
// Type	                    Description
// Default Constructor	      No parameters
// Parameterized Constructor	Takes parameters
//? Default Constructor
// Java automatically provides constructor if none is written.
// Example
// class Test {
//     int x;
//     Test() {
//         x = 10;
//     }
// }
//? Object Initialization Ways
// By reference variable
// By method
// By constructor
// ?Anonymous Object
// Object without reference variable.
// Example
// new Student();
//? Garbage Collection
// Objects without references are removed automatically by JVM.
// Important Interview Points
// Class is blueprint; object is instance.
// Object creation uses new keyword.
// Constructors initialize objects.
// this refers to current object.
// Multiple objects have separate memory.
// JVM automatically provides default constructor if none exists.
// Real World Analogy
// Real World	Java
// Blueprint	Class
// House built from blueprint	Object
