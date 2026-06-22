
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;


// Before Java 21, addFirst(), addLast(), removeFirst(), and removeLast() belonged strictly to the Deque interface (which LinkedList implements, but ArrayList does not).In Java 21, a new interface called SequencedCollection was introduced as a parent interface for both List and Deque. Because ArrayList implements List, it now automatically inherits all of these methods!         SequencedCollection  <-- (New in Java 21: defines addFirst, removeFirst, etc.)
//             /           \
//          List          Deque

//           |              |
//       ArrayList      LinkedList

public class LinkedListExample {

    public static void main(String[] args) {

      //!Methods of LinkedList and ArrayList are almost same
      //?thats why used the arrayList.java file code and replace ArrayList <> by LinkedList<>

        //!Linked list creation
        // Collection<Integer> collectionWay = new LinkedList<>();
        // List<Integer> listWay = new LinkedList<>();
        LinkedList<Integer> linkedListWay = new LinkedList<>();

        //!Initialization way
        //1 Default Constructor
        // LinkedList<String> list = new LinkedList<>();

        //2. Specify Initial Capacity
        // LinkedList<String> list = new LinkedList<>(20);

        //3. From Another Collection
        // List<String> names = List.of("Akshat", "Rahul", "Amit");
        // LinkedList<String> list = new LinkedList<>(names);

        //4. Using List.of() (Java 9+)
        // LinkedList<String> list = new LinkedList<>(List.of("A", "B", "C"));

        // /-----------------
        // From Another LinkedList
// LinkedList<Integer> list1 = new LinkedList<>();
// list1.add(10);
// list1.add(20);
// LinkedList<Integer> list2 = new LinkedList<>(list1);

        //5. Double Brace Initialization (Not Recommended)
        // LinkedList<String> list = new LinkedList<>() {
        //     {
        //         add("A");
        //         add("B");
        //     }
        // };
        //Creates anonymous inner class and extra memory overhead.

        //!6. 
        // int arr[]={2,3,4,5};
        // LinkedList<Integer> list = new LinkedList<>(arr);
        //?this will give error as LinkedList<>() expects a collection object
        //int arr[] is declared using primitive int . int []
        //?if we create using wrappper class Integer[] we can use Arrays.asList() to create arraylist
        // Integer arr[]={2,3,4,5};
        // LinkedList<Integer> list = new LinkedList<>(Arrays.asList(arr));
        //this works


 
        //!Common methods
          LinkedList<String> list = new LinkedList<>();
        //   list.ensureCapacity(20); //?Pre-allocates memory.

        //? Adding Elements

        //add(E e)
        list.add("Java");


        //add(int index, E element)
        list.add(0,"Spring");
        
         //  addFirst(E e)
        list.addFirst("Manuj");

        //addLast(E e)
        list.addLast("jain");

        //addAll(Collection)
         LinkedList<String> list2 = new LinkedList<>(List.of("A", "B", "C"));
         list.addAll(list2);
         list.addAll(List.of("D","E","F"));

         //addAll(index, Collection)
         list.addAll(1, List.of("X", "Y","Anthropic"));

         //offer(E e) -> add the ele at the end of the linked list
         list.offer("ro");

         //? Retrieving Elements
        
        //get(int index)
        String name = list.get(0);
              
              // getFirst()
String first = list.getFirst();

// getLast()
String last = list.getLast();


// peek() - return the first element (heAD)
String value = list.peek();
System.out.println("Peak ele (head): "+value);



// Returns first element.
// Returns null if empty.

// peekFirst()
list.peekFirst();

// peekLast()
list.peekLast();

// element()
list.element();

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

    //poll() returns and  remove the first  ele of linked list
    System.out.println("List before poll: "+list.toString());
    String dltEle = list.poll();
    System.out.println("Deleted ele: "+dltEle);
     System.out.println("List After poll: "+list.toString());



    //? Searching

    // contains(Object)
    System.out.println("is Java present: "+list.contains("Java"));

    //indexOf(Object)
    //return index of first occurrence or -1 if not present
    System.out.println("Index of x"+ list.indexOf("x"));

  //  lastIndexOf(Object o)
list.lastIndexOf("Java");

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
  //  Iterator<String> itr = list.iterator();
      ListIterator<String>it = list.listIterator();

while(it.hasNext()) {
    System.out.println(it.next());
     int nextIdx = it.nextIndex();    // Get next index
}

if (it.hasPrevious()) {
    String prev = it.previous();     // Returns "A" again and moves pointer back
    int prevIdx = it.previousIndex();
}

// Iterator is one-way: The Iterator interface only allows you to move forward through a list using .next(). It does not have a .previous() method.
// ListIterator is bi-directional: The ListIterator interface extends Iterator. It adds extra capabilities specifically for lists, allowing you to move both forward and backward using .next() and .previous().

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


 
 //!This will not work in LinkedList 
// ? Capacity Related Methods
// These are specific to ArrayList.

// ensureCapacity(int)
// list.ensureCapacity(100);

// trimToSize()
// list.trimToSize();


// !Sorting
// ?sort() -> requires a Comparator argument to define the sorting logic.
list.sort(String::compareTo);

  //?Sorting in Natural Order (Ascending)
//   To sort numbers or strings in their standard ascending order, pass Comparator.naturalOrder().
LinkedList<Integer> intList = new LinkedList<>(List.of(1,19,2,4,8,5));
LinkedList<String> strList = new LinkedList<>(List.of("a","x","b","f","d","c"));

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


//!Reversing the arraylist
//There are two main ways to reverse an ArrayList in Java: in-place (modifying the original list) or using Streams (keeping the original list unchanged)
LinkedList<Integer> revList = new LinkedList<>(List.of(1,19,2,4,8,5));

//?1. In-Place Reversal (Modifying the Original List)
Collections.reverse(revList);
System.out.println("Reversed list: "+revList.toString());

//?2. Stream Reversal (Creating a New List)
//If your original list is immutable (like one made with List.of()), or if you simply do not want to alter the original data, you can use a Stream.


    }
}
