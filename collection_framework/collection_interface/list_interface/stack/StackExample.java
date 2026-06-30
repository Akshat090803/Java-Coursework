
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;


//!Stack extends Vector class
//!all method of List,arraylist,vector works (ince Stack extends Vector, it inherits all Vector methods as well.)

//! Stack-Specific Methods 
//?These are stack specific methods. will work on Stack<Type> s1 = new Stack<>(); only ,not on List<> , LinkedList <>, ArrayList<> 

// Method	Description
// push(E item)	Push element onto top
// pop()	Remove and return top element
// peek()	View top element
// empty()	Check stack is empty
// search(Object o)	Position from top


//! Stack vs Deque (See bottom )

public class StackExample {

    public static void main(String[] args) {

        //!Array list creation
        // Collection<Integer> collectionWay = new Stack<>();
        // List<Integer> listWay = new Stack<>();
        Stack<Integer> vectorWay = new Stack<>();
    
        //!Initialization way
        //1 Default Constructor
        // Stack<String> list = new Stack<>();

        //2. Specify Initial Capacity
        // Stack<String> list = new Stack<>(20);

        //3. From Another Collection
        // List<String> names = List.of("Akshat", "Rahul", "Amit");
        // Stack<String> list = new Stack<>(names);

        //4. Using List.of() (Java 9+)
        // Stack<String> list = new Stack<>(List.of("A", "B", "C"));
        // /? The code throws a compilation error because Java's Stack class does not have a constructor that accepts a collection.Unlike other collections like ArrayList, you cannot pass List.of() directly into new Stack<>().

        // //!Soln-> create the stack first and then add the elements.
        // Stack<String> list2 = new Stack<>();
        // list2.addAll(List.of("A", "B", "C"));
        //! soln2 use Deque

        //5. Double Brace Initialization (Not Recommended)
        // Stack<String> list = new Stack<>() {
        //     {
        //         add("A");
        //         add("B");
        //     }
        // };
        //Creates anonymous inner class and extra memory overhead.

        //!6. 
        // int arr[]={2,3,4,5};
        // Stack<Integer> list = new Stack<>(arr);
        //?this will give error as ArrayList<>() expects a collection object
        //int arr[] is declared using primitive int . int []
        //?if we create using wrappper class Integer[] we can use Arrays.asList() to create arraylist
        // Integer arr[]={2,3,4,5};
        // Stack<Integer> list = new Stack<>(Arrays.asList(arr));
        //this works

//------------------------------------------------------------------------------
             //! Stack specific methods ..........
//------------------------------------------------------------------------------

Stack<Integer> stack = new Stack<>();

// 1. push()
stack.push(10);
stack.push(20);
System.out.println("Stack push : "+stack);
//? output -> [10,20]

// 2. pop()
// Removes top element.
stack.push(30);
System.out.println("Stack before pop : "+stack); //[10,20,30]
System.out.println(stack.pop()); //Output 30
System.out.println("Stack After pop : "+stack); //[10,20]

//3 . peek()
// Returns top element without removing.
System.out.println(stack.peek()); // 20

// 4. empty()
Stack<Integer> stackE = new Stack<>();
System.out.println(stackE.empty()); //true
stackE.push(10);
System.out.println(stackE.empty()); //false

// 5. search()
// Returns 1-based position from top.

stack.clear();
stack.push(10);
stack.push(20);
stack.push(30);
System.out.println(stack.search(30)); // 1
System.out.println(stack.search(20)); // 2
System.out.println(stack.search(10)); // 3

 
        //!Common methods
          Stack<String> list = new Stack<>();
        //   list.ensureCapacity(20); //?Pre-allocates memory.

        //? Adding Elements

        //add(E e)
        list.add("Java");


        //add(int index, E element)
        list.add(0,"Spring");
         
         System.out.println("Before AddFirst: "+list.toString());

        //  addFirst(E e)
        list.addFirst("Manuj");
        System.out.println("AddFirst: "+list.toString());

        //addLast(E e)
        list.addLast("jain");
        System.out.println("AddLast: "+list.toString());

        //!addAll(Collection)
        //? this will throw err
        //  Stack<String> list2 = new Stack<>(List.of("A", "B", "C")); //? The code throws a compilation error because Java's Stack class does not have a constructor that accepts a collection.Unlike other collections like ArrayList, you cannot pass List.of() directly into new Stack<>().

        //!Soln-> create the stack first and then add the elements.
        Stack<String> list2 = new Stack<>();
        list2.addAll(List.of("A", "B", "C"));
         list.addAll(list2);
         list.addAll(List.of("D","E","F"));
        
        //!Soln 2 -> : Use List instead of Stack
        //?In modern Java, it is generally recommended to use Deque (like ArrayDeque) instead of the legacy Stack class, as it is faster and supports collection constructors.

        Deque<String> listDq = new ArrayDeque<>(List.of("A", "B", "C"));
        
            
         //addAll(index, Collection)
         list.addAll(1, List.of("X", "Y","Anthropic"));
          

         //? Retrieving Elements
        
        //get(int index)
        String name = list.get(0);
         


       //? Updating Elements
       list.set(0, "Hibernate");

       //? Removing Elements

       //remove(int index)
       list.remove(0);

    //    remove(Object o)
       list.remove("Java");

       //removeFirst()
       System.out.println("Before removeFirst: "+list.toString());
       list.removeFirst();
       System.out.println("After removeFirst: "+list.toString());

    //    removeLast()
list.removeLast();

       //removeAll(Collection) 

       list.removeAll(List.of("A", "B"));

       //removeIf(Predicate)
       list.removeIf((e)->e.startsWith("A"));

       //clear
    //    list.clear();



    //? Searching

    // contains(Object)
    System.out.println("is Java present: "+list.contains("Java"));

    //indexOf(Object)
    //return index of first occurrence or -1 if not present
    System.out.println("Index of x"+ list.indexOf("x"));

//lastIndexOf()
      list.lastIndexOf("Java");

//       Cloning
// Stack<Integer> copy = (Stack<Integer>) v.clone();

   //? Size and Empty Check

   //size();
   System.out.println("Size: "+list.size());

   //isEmpty()
   boolean isEmpty = list.isEmpty();


     
     //? traversing

    //  1. Traditional For Loop
for(int i = 0; i < list.size(); i++) {
    System.out.println(list.get(i));
}

// 2. Enhanced For Loop
for(String s : list) {
    System.out.println(s);
}

   //3 Iterator
   Iterator<String> itr = list.iterator();
//    ListIterator<String>itr2 = list.listIterator();

while(itr.hasNext()) {
    System.out.println(itr.next());

}

     //foreach
     list.forEach(System.out::println);
      list.forEach((e)->System.out.println(e));

// 6. Stream
list.stream()
    .forEach(System.out::println);



    //? Conversion Methods
    // toArray()
Object[] arr = list.toArray();

//! toArray(T[])
// String[] arr2 = list.toArray();//? this is invalid . incompatible types: Object[] cannot be converted to String[]
String[] arr3 = list.toArray(new String[0]);
String[] arr4 = list.toArray(String[]::new);


 
// ? Capacity Related Methods

// These are specific to ArrayList.

// ensureCapacity(int)
list.ensureCapacity(100);
// Pre-allocates memory.

// trimToSize()
list.trimToSize();
// Reduces capacity to current size.

// !Sorting
// ?sort() -> requires a Comparator argument to define the sorting logic.
list.sort(String::compareTo);

  //?Sorting in Natural Order (Ascending)
//   To sort numbers or strings in their standard ascending order, pass Comparator.naturalOrder().

Stack<Integer> intList = new Stack<>();
intList.addAll(List.of(1,19,2,4,8,5));
Stack<String> strList = new Stack<>();
strList.addAll(List.of("a","x","b","f","d","c"));

intList.sort(null); //defaults ot naturalorder() ascending
intList.sort(Comparator.naturalOrder());
strList.sort(Comparator.naturalOrder());
 System.out.println("Sorted Asc int list: "+ intList.toString());
 System.out.println("Sorted Asc str list: "+ strList.toString());

//?  Sorting in Reverse Order (Descending)
intList.sort(Comparator.reverseOrder());
strList.sort(Comparator.reverseOrder());
 System.out.println("Sorted Desc int list: "+ intList.toString());
 System.out.println("Sorted Desc str list: "+ strList.toString());


//? Sorting with a Custom Lambda
intList.sort((a, b) -> Integer.compare(a, b)); 
intList.sort((a,b)->a.compareTo(b));
strList.sort((a,b)->a.compareTo(b));
 System.out.println("Sorted Asc int list: "+ intList.toString());
 System.out.println("Sorted Asc str list: "+ strList.toString());



// ?or

//? Using collections odler way

//Ascending order
Collections.sort(list);

//Sorting with a Custom Lambda / Comparator
//ascending
Collections.sort(list,(a,b)->a.compareTo(b));
// /descending
Collections.sort(list, (a, b) -> b.compareTo(a));

//! Sorting with Stream (doesnt modify original list returns new one) 
//?Unlike list.sort() or Collections.sort(), stream sorting does not modify the original list. Instead, it processes the elements and outputs a brand new, sorted collection.

//? 1. Sorting in Natural Order (Ascending)
List<Integer> list4 = List.of(5, 3, 4, 2);

List<Integer> sortedList = list4.stream()
                               .sorted()
                               .toList(); 

//? 2. Sorting in Reverse Order (Descending)
List<Integer> sortedListDesc = list4.stream()
                                   .sorted(Comparator.reverseOrder())
                                   .toList(); 
                                
//? 3. Sorting with Your Custom Lambda
List<Integer> customSorted = list4.stream()
                                 .sorted((a, b) -> a.compareTo(b))
                                 .toList(); 


//!Reversing the stack
//There are two main ways to reverse an ArrayList in Java: in-place (modifying the original list) or using Streams (keeping the original list unchanged)
Stack<Integer> revList = new Stack<>();
revList.addAll(List.of(1,19,2,4,8,5));

//?1. In-Place Reversal (Modifying the Original List)
Collections.reverse(revList);

//?2. Stream Reversal (Creating a New List)
//If your original list is immutable (like one made with List.of()), or if you simply do not want to alter the original data, you can use a Stream.


    }
}


//!Stack vs Deque in Java

// In modern Java, Deque is preferred over Stack for implementing stack behavior.


// Quick Comparison
// Feature	Stack	Deque
// Package	java.util.Stack	java.util.Deque
// Implementation	Extends Vector	Interface
// Introduced	JDK 1.0	JDK 1.6
// Thread Safety	Synchronized	Usually not synchronized
// Performance	Slower	Faster
// Supports Stack Operations	✅	✅
// Supports Queue Operations	❌	✅
// Recommended by Java Docs	❌	✅


//? Mapping of Operations
// Stack Method	        Deque Equivalent
// push(e)	              push(e)
// pop()	                 pop()
// peek()               	peek()
// empty()              	isEmpty()


//! Why Deque is Better
//? 1. No Legacy Design

// Stack was introduced in JDK 1.0.

// Stack → Vector → Legacy Collection

// Deque was designed later with cleaner APIs.

//? 2. Better Performance

// Stack inherits synchronized methods from Vector.

// public synchronized E elementAt(int index)

// Synchronization adds overhead.

// ArrayDeque is not synchronized.

// Therefore:

// ArrayDeque > Stack

// for single-threaded applications.

//? 3. More Flexible

// Deque can act as:

// Stack (LIFO)
// Deque<Integer> d = new ArrayDeque<>();

// d.push(10);
// d.push(20);

// d.pop();
// Queue (FIFO)
// Deque<Integer> d = new ArrayDeque<>();

// d.offer(10);
// d.offer(20);

// d.poll();

// One data structure supports both.

//? 4. Java Documentation Recommendation

// The official Java documentation for Stack states:

// A more complete and consistent set of LIFO stack operations is provided by the Deque interface and its implementations.

// Internal Working
// Stack
// Stack
//    ↓
// Vector
//    ↓
// Resizable Array
// ArrayDeque
// ArrayDeque
//    ↓
// Circular Resizable Array

// Circular arrays allow efficient insertion/removal from both ends.

//? Null Handling
// Stack
// Stack<String> s = new Stack<>();
// s.push(null);   // Allowed
// ArrayDeque
// Deque<String> d = new ArrayDeque<>();
// d.push(null);   // NullPointerException

// ArrayDeque does not allow null.

//? Thread Safety
// Stack
// Stack<Integer> stack = new Stack<>();

// Methods are synchronized.

// ArrayDeque
// Deque<Integer> stack = new ArrayDeque<>();

// Not synchronized.

// For concurrent use:

// Deque<Integer> stack = new LinkedList<>();

// or use concurrent collections like ConcurrentLinkedDeque