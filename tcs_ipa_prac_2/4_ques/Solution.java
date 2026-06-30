// Create class Inventory with below attributes:

// inventoryId - String
// maximumQuantity - int
// currentQuantity - int
// threshold - int

// Create class Solution and implement static method "Replenish" in the Solution class.
// This method will take array of Inventory objects and a limit int as parameters.
// And will return another array of Inventory objects where the limit int is greater than or equal to the original array of 
// Inventory object's threshold attribute.

// Write necessary getters and setters.

// Before calling "Replenish" method in the main method, read values for four Inventory objects referring the attributes in above 
// sequence along with a int limit.Then call the "Replenish" method and write logic in main method to print "Critical Filling",
// if the threshold attribute is greater than 75. Else if the threshold attribute is between 50 and 75 then print 
// "Moderate Filling". Else print "Non-Critical Filling"

// Input
// ---------------------------
// 1
// 100
// 50
// 50
// 2
// 200
// 60
// 40
// 3
// 150
// 35
// 45
// 4
// 80
// 45
// 40
// 45

// Output
// ----------------------------
// 2 Non-Critical Filling
// 3 Non-Critical Filling
// 4 Non-Critical Filling

import java.util.ArrayList;
import java.util.Scanner;

class Inventory {
    private String inventoryId;
    private int maximumQuantity;
    private int currentQuantity;
    private int threshold;

    // Parameterized Constructor
    public Inventory(String inventoryId, int maximumQuantity, int currentQuantity, int threshold) {
        this.inventoryId = inventoryId;
        this.maximumQuantity = maximumQuantity;
        this.currentQuantity = currentQuantity;
        this.threshold = threshold;
    }

    // Getters and Setters
    public String getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(String inventoryId) {
        this.inventoryId = inventoryId;
    }

    public int getMaximumQuantity() {
        return maximumQuantity;
    }

    public void setMaximumQuantity(int maximumQuantity) {
        this.maximumQuantity = maximumQuantity;
    }

    public int getCurrentQuantity() {
        return currentQuantity;
    }

    public void setCurrentQuantity(int currentQuantity) {
        this.currentQuantity = currentQuantity;
    }

    public int getThreshold() {
        return threshold;
    }

    public void setThreshold(int threshold) {
        this.threshold = threshold;
    }
}

public class Solution {

  //!way -1 count matching elements than create arr of size count than insert matched ele 
  // first count how many elements match our condition, create a new array of that exact size, and then fill it.
    public static Inventory[] Replenish(Inventory[] invArr, int limit) {
        // Step 1: Count how many items match the limit criteria to size our new array
        int count = 0;
        for (Inventory inv : invArr) {
            if (limit >= inv.getThreshold()) {
                count++;
            }
        }

        // Step 2: Create a fixed-size result array based on the exact count
        Inventory[] resArr = new Inventory[count];
        int index = 0;

        // Step 3: Fill the result array with matching items
        for (Inventory inv : invArr) {
            if (limit >= inv.getThreshold()) {
                resArr[index++] = inv;
            }
        }

        return resArr;
    }


    //!way 2 use ArrayList 
public static Inventory[] ReplenishWay2(Inventory[] invArr, int limit) {
    ArrayList<Inventory> list = new ArrayList<>();

    // 1. Loop only once and add matching items to the ArrayList
    for (Inventory inv : invArr) {
        if (limit >= inv.getThreshold()) {
            list.add(inv);
        }
    }

    // 2. Convert the ArrayList directly back to an Inventory array
    return list.toArray(new Inventory[0]);
}

    public static void main(String[] args) {
        Inventory[] invArr = new Inventory[4];
        Scanner sc = new Scanner(System.in);

        // Reading attributes using sc.next() to avoid buffer handling completely
        for (int i = 0; i < 4; i++) {
            String inventoryId = sc.next();
            int maximumQuantity = sc.nextInt();
            int currentQuantity = sc.nextInt();
            int threshold = sc.nextInt();
            invArr[i] = new Inventory(inventoryId, maximumQuantity, currentQuantity, threshold);
        }

        // Reading the final limit parameter
        int limit = sc.nextInt();
        sc.close();

        // Process matching inventory objects
        Inventory[] matchingItems = Replenish(invArr, limit);

        // Printing results with the conditional statements
        for (Inventory inv : matchingItems) {
            int th = inv.getThreshold();
            if (th > 75) {
                System.out.println(inv.getInventoryId() + " Critical Filling");
            } else if (th >= 50 && th <= 75) {
                System.out.println(inv.getInventoryId() + " Moderate Filling");
            } else {
                System.out.println(inv.getInventoryId() + " Non-Critical Filling");
            }
        }
    }
}
