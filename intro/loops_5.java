
public class loops_5 {

    public static void main(String[] args) {

        //!FOR Loop
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        //!Infinite for loop
        // for (;;) {
        //     System.out.println("Infinite");
        // }
        //!While Loop
        int i = 1;

        while (i <= 5) {

            System.out.println(i);

            i++;
        }

        //!do while loop
        int j = 1;

        do {

            System.out.println(j);

            j++;

        } while (j <= 5);

        //!Ranged for loop i.e, Enhanced for loop
        int numbers[] = {10, 20, 30, 40};

        for (int num : numbers) {

            System.out.println(num);
        }

    }
}

// Loops in Java
// Loops are used to execute a block of code repeatedly.
// Java provides:
// for loop
// while loop
// do-while loop
// Enhanced for-each loop
