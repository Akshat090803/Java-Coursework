
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;


//! Vector and Array List are same
//!difference is that Vector syncrhronizes operation (thread safe)and Array list have Asynchronise operation (thread unsafe)
//!due to synchronization , vector have to put lock on each operation making it less effecient

//!Capacity Growth
// ArrayList
// 10 → 15 → 22 → ...
// Vector (Default)
// 10 → 20 → 40 → 80
// Vector doubles its capacity by default.
public class VectorExample {

    public static void main(String[] args) {

        //!Array list creation
        // Collection<Integer> collectionWay = new Vector<>();
        // List<Integer> listWay = new Vector<>();
        Vector<Integer> vectorWay = new Vector<>();
    
        //!Initialization way
        //1 Default Constructor
        // Vector<String> list = new Vector<>();

        //2. Specify Initial Capacity
        // Vector<String> list = new Vector<>(20);

        //3. From Another Collection
        // List<String> names = List.of("Akshat", "Rahul", "Amit");
        // Vector<String> list = new Vector<>(names);

        //4. Using List.of() (Java 9+)
        // Vector<String> list = new Vector<>(List.of("A", "B", "C"));

        //5. Double Brace Initialization (Not Recommended)
        // Vector<String> list = new Vector<>() {
        //     {
        //         add("A");
        //         add("B");
        //     }
        // };
        //Creates anonymous inner class and extra memory overhead.

        //!6. 
        // int arr[]={2,3,4,5};
        // Vector<Integer> list = new Vector<>(arr);
        //?this will give error as ArrayList<>() expects a collection object
        //int arr[] is declared using primitive int . int []
        //?if we create using wrappper class Integer[] we can use Arrays.asList() to create arraylist
        // Integer arr[]={2,3,4,5};
        // Vector<Integer> list = new Vector<>(Arrays.asList(arr));
        //this works


 
        //!Common methods
          Vector<String> list = new Vector<>();
        //   list.ensureCapacity(20); //?Pre-allocates memory.

        //? Adding Elements

        //add(E e)
        list.add("Java");


        //add(int index, E element)
        list.add(0,"Spring");
         
        //  addFirst(E e)
        list.addFirst("Manuj");
        System.out.println("AddFirst: "+list.toString());

        //addLast(E e)
        list.addLast("jain");
        System.out.println("AddLast: "+list.toString());

        //addAll(Collection)
         Vector<String> list2 = new Vector<>(List.of("A", "B", "C"));
         list.addAll(list2);
         list.addAll(List.of("D","E","F"));

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
// Vector<Integer> copy = (Vector<Integer>) v.clone();

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
Vector<Integer> intList = new Vector<>(List.of(1,19,2,4,8,5));
Vector<String> strList = new Vector<>(List.of("a","x","b","f","d","c"));

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
Vector<Integer> revList = new Vector<>(List.of(1,19,2,4,8,5));

//?1. In-Place Reversal (Modifying the Original List)
Collections.reverse(revList);

//?2. Stream Reversal (Creating a New List)
//If your original list is immutable (like one made with List.of()), or if you simply do not want to alter the original data, you can use a Stream.


    }
}





// !ArrayList vs Vector
// Feature	               Vector	                  ArrayList
// Thread Safe          	Yes                            No
// Performance	            Slower	                     Faster
// Introduced	             JDK 1.0	                JDK 1.2
// Capacity Growth	          2x	                      1.5x
// Legacy Class	              Yes	                       No
// Synchronization	       Built-in	                    External