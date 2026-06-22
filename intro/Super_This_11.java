
class Human {
  public String name;
  public int age;

  public Human(){
    System.out.println("Base class default");
  }
  public Human(String name){
    this.name=name;
    System.out.println("Base class name parameterised .");
  }
  public Human(int age){
    this.age=age;
    System.out.println("Base class age parameterised .");
  }
  public Human(String name,int age){
    this.age=age;
    this.name=name;
    System.out.println("Base class full parameterised .");
  }

  public void showInfo(){
    System.out.println("Name : "+name+" Age: "+age);
  }


  
}

class Employee extends Human{

  public int empId;
  
  public Employee(){
    //super(); //it will automatically gets called for abse class
    super(); // we can call manually also;
     System.out.println("Child class default");
  }

  public Employee(int empID ,int age){
    super(age); //age parameterised constructor will called of base class
    this.empId=empID;
     System.out.println("Child class parameterised");
  }
  public Employee(int empID ,String name){
    super(name); //name parameterised constructor will called of base class
    this.empId=empID;
     System.out.println("Child class parameterised");
  }

  

  
}

public class Super_This_11 {

    public static void main(String args[]) {
  Employee emp1 = new Employee(); 
  System.out.println("------------");
  Employee emp2 = new Employee(1,32); 
   System.out.println("------------");
  Employee emp3 = new Employee(2,"Akshat"); 
  
    }
}

//! this and super in Java
// Both this and super are special keywords in Java.
// !They are mainly used in:
// constructors
// inheritance
// method calls
// variable access
// !1. this Keyword
//? this refers to the current object.
// Uses of this
// Refer current object variable
// Call current class method
// Call current class constructor (this())
// Pass current object as argument
// Return current object
// 1. Using this for Instance Variables
// Used when local variable and instance variable have same name.
// ?Example
// class Student {
//     int id;
//     Student(int id) {
//         this.id = id;
//     }
//     void display() {
//         System.out.println(id);
//     }
// }
// public class Main {
//     public static void main(String[] args) {
//         Student s = new Student(101);
//         s.display();
//     }
// }
// Output
// 101
// Why this Needed?
//! Without this:
// id = id;
// ?Java gets confused between:
// local variable
// instance variable
// So:
// this.id = id;
// means:
// current object's id = local variable id
// ?2. Calling Current Class Method
// class Test {
//     void show() {
//         System.out.println("Show");
//     }
//     void display() {
//         this.show();
//     }
// }
// 3. this() Constructor Calling
//! Used to call another constructor of same class.
// !Rule
// ?this() must be first statement.
// Example
// class Student {
//     Student() {
//         this(100);
//         System.out.println("Default Constructor");
//     }
//     Student(int id) {
//         System.out.println(id);
//     }
// }
// Output
// 100
// Default Constructor
// Constructor Chaining
// Using this() to call constructors.
// Example
// class Demo {
//     Demo() {
//         this(10);
//         System.out.println("A");
//     }
//     Demo(int x) {
//         this(10, 20);
//         System.out.println("B");
//     }
//     Demo(int x, int y) {
//         System.out.println("C");
//     }
// }
// Output
// C
// B
// A
// 4. Passing Current Object
// class Test {
//     void display(Test t) {
//         System.out.println("Method called");
//     }
//     void show() {
//         display(this);
//     }
// }
// 5. Returning Current Object
// class Test {
//     Test get() {
//         return this;
//     }
// }
// !super Keyword
// ?super refers to immediate parent class object.
// Used in inheritance.
//! Uses of super
// Access parent class variable
// Access parent class method
// Call parent constructor (super())
// Parent Variable Access
//! Example
// class Animal {
//     String color = "White";
// }
// class Dog extends Animal {
//     String color = "Black";
//     void printColor() {
//         System.out.println(super.color);
//         System.out.println(color);
//     }
// }
// Output
// White
// Black
// !Parent Method Access
// Example
// class Animal {
//     void sound() {
//         System.out.println("Animal sound");
//     }
// }
// class Dog extends Animal {
//     void sound() {
//         System.out.println("Dog bark");
//     }
//     void display() {
//         super.sound();
//         sound();
//     }
// }
// Output
// Animal sound
// Dog bark
//! super() Constructor Calling
// Calls parent class constructor.
// ?Rule
// super() must be first statement.
// Example
// class Animal {
//     Animal() {
//         System.out.println("Animal Constructor");
//     }
// }
// class Dog extends Animal {
//     Dog() {
//         super();
//         System.out.println("Dog Constructor");
//     }
// }
// Output
// Animal Constructor
// Dog Constructor
//! Important Point
// If you do not write super():
// Java automatically inserts it.
// Constructor Execution Order
// Parent constructor executes first
// ↓
// Child constructor executes
// Example
// class A {
//     A() {
//         System.out.println("A");
//     }
// }
// class B extends A {
//     B() {
//         System.out.println("B");
//     }
// }
// Output
// A
// B
// this() vs super()
// Feature	this()	super()
// Calls	Current class constructor	Parent constructor
// Used in	Same class	Inheritance
// Position	First statement	First statement
//! Important Rule
// ?Cannot use both together in same constructor.
// ?❌ Invalid:
// this();
// super();
// ?Because both must be first statement.
// this vs super
// Feature	this	super
// Refers to	Current object	Parent object
// Used in	Same class	Child class
// Constructor call	this()	super()
// Real Life Analogy
// this  → Myself
// super → My parent
// Important Interview Points
// this refers current object.
// super refers immediate parent object.
// this() calls current class constructor.
// super() calls parent constructor.
// Both must be first statement.
// Constructor chaining possible using this().
// Java automatically inserts super() if not written.
// Complete Example Program
// class Animal {
//     Animal() {
//         System.out.println("Animal Constructor");
//     }
// }
// class Dog extends Animal {
//     Dog() {
//         super();
//         System.out.println("Dog Constructor");
//     }
// }
// public class Main {
//     public static void main(String[] args) {
//         Dog d = new Dog();
//     }
// }
