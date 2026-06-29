// Question: 1
// Create a class TravelAgencies with below attributes:

// regNo – int
// agencyName – String
// pakageType – String
// price – int
// flightFacility – boolean

// Write getters, setters for the above attributes . Create constructor which takes parameter in the above sequence.

// Create class Solution with main method. Implement two static methods – findAgencyWithHighestPackagePrice and 
// agencyDetailsforGivenIdAndType in Solution class.

// findAgencyWithHighestPackagePrice method:

// This method will take array of TravelAgencies objects as an input parameter and return the highest package  price from the given array of objects.

// agencyDetailsForGivenldAndType method:

// This method will take three input parameters -array of TravelAgencies objects, int parameter regNo and String parameter packageType. The method will return the TravelAgencies object based on below conditions.

// FlightFacility should be available.
// The input parameters(regNo and packageType) should matched with the regNo and packageType of TravelAgencies object.
// If any of the above conditions are not met, then the method should return null. Note : Same Travel agency can 
// have more than one package type. Travel agency and package type combination is unique. All the searches should 
// be case insensitive.

// The above mentioned static methods should be called from the main method.


// For findAgencyWithHighestPackagePrice method – The main method should print the highestPackagePrice as it is. 
// For agencyDetailsForGivenldAndType method -The main method should print the AgencyName and price of the returned 
// object.The AgencyName and price should be concatinated with : while printing.
// ---------
// Input
// ---------
// 123
// A2Z Agency
// Platinum
// 50000
// true
// 345
// SSS Agency
// Gold
// 30000
// false
// 987
// Cox and Kings
// Diamond
// 40000
// true
// 888
// Global Tours
// Silver
// 20000
// false
// 987
// Diamond
// -------------------------------
// Output
// -------------------------------
// 50000
// Cox and Kings:40000

import java.util.List;
import java.util.Scanner;

class  TravelAgencies{
 

private int regNo;
private  String agencyName;
private String packageType;
private int price;
private boolean flightFacility;

     public TravelAgencies(){}

    public TravelAgencies( int regNo, String agencyName, String packageType, int price, boolean flightFacility ) {
        this.agencyName = agencyName;
        this.flightFacility = flightFacility;
        this.packageType = packageType;
        this.price = price;
        this.regNo = regNo;
    }

  



    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public String getPackageType() {
        return packageType;
    }

    public void setPackageType(String packageType) {
        this.packageType = packageType;
    }

    public int getRegNo() {
        return regNo;
    }

    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isFlightFacility() {
        return flightFacility;
    }

    public void setFlightFacility(boolean flightFacility) {
        this.flightFacility = flightFacility;
    }


}

public class Ques {

  public static int findAgencyWithHighestPackagePrice(TravelAgencies [] ta){
     int maxPackagePrice = 0;
     for(TravelAgencies t : ta){
      maxPackagePrice = Math.max(maxPackagePrice, t.getPrice());
     }
    return maxPackagePrice;
  }

  public  static TravelAgencies agencyDetailsForGivenldAndType(TravelAgencies [] ta , int regNo, String packageType){

    TravelAgencies matchedAgency = null;
    
    for(TravelAgencies t : ta){
      if(t.isFlightFacility() && (t.getRegNo() == regNo) && (t.getPackageType().equalsIgnoreCase(packageType))){
        matchedAgency=t;
        break;
      }
    }

    return matchedAgency;
  }
   
  public static void main(String[] args) {

    TravelAgencies [] agenciesArr = new TravelAgencies[4];
    
    Scanner sc = new Scanner(System.in);
    for(int i =0 ; i<4; i++){
        agenciesArr[i] = new TravelAgencies();
      // int regNo, String agencyName, String packageType, int price, boolean flightFacility 
         System.out.print("RegNo: ");
         agenciesArr[i].setRegNo(sc.nextInt());
         sc.nextLine();
         System.out.print("Agency Name: ");
         agenciesArr[i].setAgencyName(sc.nextLine());

          System.out.print("Package Type: ");
         agenciesArr[i].setPackageType(sc.nextLine());

          System.out.print("Price: ");
         agenciesArr[i].setPrice(sc.nextInt());

         System.out.print("Flight Facility : ");
         agenciesArr[i].setFlightFacility(sc.nextBoolean());

         System.out.println("----------------------------------");

    }


    int  highestPricePackage = findAgencyWithHighestPackagePrice(agenciesArr);
    
    System.out.print("Enter reg No : ");
    int regNo = sc.nextInt();

    sc.nextLine();
     System.out.print("Enter package name: ");
    String packageName = sc.nextLine();
    TravelAgencies matchedAgency = agencyDetailsForGivenldAndType(agenciesArr, regNo, packageName);
    
    System.out.println("Output:");
    System.out.println(highestPricePackage );
    if(matchedAgency != null){
        System.out.println(matchedAgency.getAgencyName()+" : "+matchedAgency.getPrice());
    }

    sc.close();
  }
}
