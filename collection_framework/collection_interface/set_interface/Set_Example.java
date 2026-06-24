import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


//? hashSet vs LinkedHashSet vs TreeSet
// Set<String> hash = new HashSet<>(Set.of("Banana", "Apple", "Cherry"));
// Set<String> linked = new LinkedHashSet<>(Set.of("Banana", "Apple", "Cherry"));
// Set<String> tree = new TreeSet<>(Set.of("Banana", "Apple", "Cherry"));

// System.out.println("HashSet:       " + hash);   // ?Output: [Apple, Cherry, Banana] (Unpredictable)
// System.out.println("LinkedHashSet: " + linked); //? Output: [Banana, Apple, Cherry] (Insertion Order)
// System.out.println("TreeSet:       " + tree);   //? Output: [Apple, Banana, Cherry] (Alphabetical Order)


public class Set_Example {
    public static void main(String[] args) {
        // HashSet example  (Items are in hash table and assessed using hashCodes)
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");
        hashSet.add("Date");
        System.out.println("HashSet: " + hashSet); // ? (items are in random orders)

        hashSet.remove("Banana");
        System.out.println("After remove Banana: " + hashSet);
        System.out.println("Contains Apple: " + hashSet.contains("Apple"));

        // TreeSet example  (Uses BST tree)
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Elderberry");
        treeSet.add("Fig");
        treeSet.add("Grape");
        treeSet.add("Apple");
        System.out.println("TreeSet: " + treeSet); //?(Items are in Sorted Order)
        System.out.println("TreeSet contains Grape: " + treeSet.contains("Grape"));

        // LinkedHashSet example (uses linked list Nodes)
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Apple");
        linkedHashSet.add("Fig");
        linkedHashSet.add("Honeydew");
        System.out.println("LinkedHashSet: " + linkedHashSet); //? (items insertion order is preserved)

        // containsAll example  (Check A is subset of B or not)
        System.out.println("HashSet contains all elements of LinkedHashSet: "
                + hashSet.containsAll(linkedHashSet));
         

         //perform A union B
          Set<String> addAllExample = new HashSet<>(hashSet);
        addAllExample.addAll(treeSet);
        System.out.println("addAll with TreeSet: " + addAllExample); 

        // retainAll example (Performs A intersection B)
        Set<String> retainExample = new HashSet<>(hashSet);
        retainExample.retainAll(treeSet);
        System.out.println("retainAll with TreeSet: " + retainExample);

        // removeAll example  (Performs A - B)
        Set<String> removeExample = new HashSet<>(linkedHashSet);
        removeExample.removeAll(treeSet);
        System.out.println("removeAll TreeSet from LinkedHashSet: " + removeExample);




        //! Note if want to create HashSet of objects our custom class like student class
        //? Set<Student> studentSet = new HashSet<>();
        //! then we have to overrirde equals() and hashCode() method in Student class
        //?else set will treat all objects as unique and hence duplicate items will present
        // Student s1 = new Student("Akshat",1);
        // Student s2 = new Student("Akshat",1);
        // studentSet.add(s1);
        // studentSet.add(s2);
        //?without overriding the eqauls()a\ and hashCode(), both s1 and s2 will present in inside the set even though they are same;

        Set<Student> studentSet = new HashSet<>();
         Student s1 = new Student("Akshat",1);
        Student s2 = new Student("Akshat",1);
        studentSet.add(s1);
        studentSet.add(s2);

         Student s3 = new Student("Akshat",3);
         studentSet.add(s3);

        System.out.println("StudentSet: "+studentSet); //? only (s1 or s2) and s3 will print


        
    }
}






//? Feature             HashSet                 LinkedHashSet                          TreeSet
//Structure      Hashtable [HashMap]      Hash table + Linked list        Red-Black tree [TreeMap]
// Ordering      Chaotic / Unordered         Insertion order                      Sorted order
// Add/Remove          O(1)                        O(1)                           (O(\log n)\)
// Memory Overhead     Low                High (due to double-linked pointers)      Medium
// Null Elements    Allows one null element  Allows one null element     Throws NullPointerException