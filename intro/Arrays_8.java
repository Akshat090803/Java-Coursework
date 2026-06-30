// 
import java.util.Arrays;
public class Arrays_8 {

    public static void main(String args[]) {

        //!
        int arr1[] = {2, 3, 4, 5};
        for (int i : arr1) {
            System.out.print(i + " ");
        }
        System.out.println();

        //!
        int arr2[] = new int[3];
        arr2[0] = 4;
        arr2[1] = 5;
        arr2[2] = 8;

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        //! 
        int arr3[] = new int[]{7, 3, 5, 8, 1};
        for (int i : arr3) {
            System.out.print(i + " ");
        }
        System.out.println();

        //!
        int arr4[];
        arr4 = new int[]{4, 5, 6, 7};

        //!
        int arr5[];
        arr5 = new int[5];

        //!
        int arr6[][] = {
            {1, 2, 3},
            {4, 5, 6}
        };

        //!
        int arr7[][] = new int[3][4];

        //! jagged arr
        int arr8[][] = new int[3][];
        arr8[0] = new int[2];
        arr8[1] = new int[4];
        arr8[2] = new int[1];


        //!
        int arr[] = {5, 2, 8, 1};

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        int index = Arrays.binarySearch(arr, 5);

        System.out.println(index);

        Arrays.fill(arr, 10);

        System.out.println(Arrays.toString(arr));

    }
}

// !Arrays in Java
//? An array is a collection of similar type of elements stored in contiguous memory locations.
// ?Arrays are used to store multiple values in a single variable.
// Declaration of Array
// Syntax
// datatype arrayName[];
// OR
// datatype[] arrayName;
//? int arr[] = {10, 20, 30};
//? int arr[] = new int[3];
// !Multidimensional Arrays
//? Array inside another array.
// 2D Array Declaration
// int arr[][] = new int[2][3];
// int arr[][] = {
//     {1, 2, 3},
//     {4, 5, 6}
// };
//!Jagged Array
// Rows can have different column sizes.
// int arr[][] = new int[3][];
// arr[0] = new int[2];
// arr[1] = new int[4];
// arr[2] = new int[1];
//!Important
// int arr[4] = {10, 20, 30, 40}; // ?Invalid
// int arr[] = new int[4];  //? valid
//! Important Interview Points
// Arrays are fixed in size.
// Array indices start from 0.
// Arrays store same datatype elements.
// length is property, not method.
// Arrays are objects in Java.
// Memory allocated dynamically using new.


// !Default Values in Arrays
// Type	Default Value
// int	0
// double	0.0
// boolean	false
// char	'\u0000'
// String/Object	null



//!Important Interview Points
// Arrays.sort() sorts ascending only.
// Primitive arrays cannot use Collections.reverse().
// Arrays.toString() useful for printing arrays.
// binarySearch() requires sorted array.
// copyOfRange() excludes ending index.

//? Commonly Used Array Methods
// Method	Purpose
// sort()	Sorting
// toString()	Print array
// equals()	Compare arrays
// fill()	Fill values
// binarySearch()	Search element
// copyOf()	Copy full array
// copyOfRange()	Copy range