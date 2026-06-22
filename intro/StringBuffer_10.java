
public class StringBuffer_10 {

    public static void main(String args[]) {
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println(sb);
        //!They are mutable
        //?append
        sb.append(" world");
        System.out.println(sb);

//? insert
        sb.insert(11, " India");
        System.out.println(sb);

        //?replace
        sb.replace(0, 5, "Hi");
        System.out.println(sb);

        //?delete
        sb.delete(0, 3);
        System.out.println(sb);

        //?delete char at 
        sb.deleteCharAt(0);
        System.out.println(sb);

        //?reverse
        sb.reverse();
        System.out.println(sb);

//?substr
        System.out.println(sb.substring(0, 3));
        System.out.println(sb);

//?length
        System.out.println(sb.length());

// ? re assign
        sb=new StringBuffer("ka");
            System.out.println(sb);

// ? update length
            sb.setLength(0);
                System.out.println(sb);


                //! String StringBuilder
    StringBuilder sbuild = new StringBuilder("Hello");
    sbuild.append(" Java");

System.out.println(sbuild);
    }
}

// !StringBuffer

// Mutable sequence of characters.

// Unlike String, contents can change.

// Why StringBuffer?

// Since String is immutable:

// many modifications create new objects
// memory inefficient

// StringBuffer solves this.


//! StringBuilder

// Almost same as StringBuffer.

// Difference:

// not synchronized
// faster



// stringBuffer vs StringBuilder
// Feature	StringBuffer	StringBuilder
// Thread-safe	✅ Yes	❌ No
// Synchronized	✅ Yes	❌ No
// Performance	Slower	Faster
// Mutable	✅ Yes	✅ Yes


//! Which One to Use?
// Situation	Best Choice
// Constant text	String
// Frequent modifications	StringBuilder
// Multithreading	StringBuffer



// !Important Interview Points
// String is immutable.
// StringBuffer and StringBuilder are mutable.
// String literals stored in String Pool.
// equals() compares content.
// == compares references.
// StringBuilder is faster than StringBuffer.
// StringBuffer is thread-safe.
// Quick Difference Table
// Feature	String	StringBuffer	StringBuilder
// Mutable	❌ No	✅ Yes	✅ Yes
// Thread-safe	❌ No	✅ Yes	❌ No
// Performance	Medium	Slow	Fast
// Storage	String Pool/Heap	Heap	Heap