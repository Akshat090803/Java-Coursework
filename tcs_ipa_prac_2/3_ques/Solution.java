
import java.util.Scanner;


// Question:
// Create a class Institution with below attributes:
// institutionId - int
// institutionName - String
// noOfStudentsPlaced - int
// noOfStudentsCleared- int
// location - String
// grade - String
// Write getters, setters for the above attributes.
// Create constructor which takes parameter in the above sequence except grade.
// Create class Solution with main method.
// Implement two static methods - FindNumClearancedByLoc and UpdateInstitutionGrade in Solution class.
// FindNumClearancedByLoc method:
// ----------------------------------------------
// This method will take two input parameters - array of Institution objects and string parameter location.
// The method will return the sum of the noOfStudentsCleared attribute from institution objects for the location passed as  parameter. If no institution with the given location is present in the array of institution objects, then the method 
// should return 0.
// UpdateInstitutionGrade method:
// -----------------------------------------------
// This method will take a String parameter institutionName, along with the array of Institution objects.
// The method will return the institution object, if the input String parameter matches with the institutionName attribute of the  institution object. Before returning the object, the grade should be arrived based on the rating calculation mentioned below. 
// This grade value should be assigned to the object.If any of the above conditions are not met, then the method should return 
// null.
// The grade attribute should be calculated as follows:
// Rating=(noOfStudentsPlaced * 100)/noOfStudentsCleared
// If the rating greater than equal to 80 , then grade should be 'A'.
// Else, then grade should be 'B'
// *Note:*
// --------------------------------------------
// No institution object would have the same value for institutionName attribute.
// All institution object would have the noOfStudentsPlaced value lesser than noOfStudentsCleared value.
// All the searches should be case insensitive.
// The above mentioned static methods should be called from the main method.
// For FindNumClearancedByLoc method - The main method should print the noOfClearance as it is, if the returned value is  greater than 0, or it should print "There are no cleared students in this particular location".
// For UpdateInstitutionGrade method - The main method should print the institutionName and grade of the returned Institution 
// object. The instituationName and grade should be concatinated with :: while printing. eg:- TCS::A, where TCS is the 
// institution name and A is the grade.
// If the returned value is nullthen it should print "No Institute is available with the specified name".
// Before calling these static methods in main, use Scanner object to read the values of four Phone objects referring attributes 
// in the above mentioned attribute sequence (except grade attribute). Next, read the value for location and institutionName.
// Input
// -------------------------------------------
// 111
// Amrita
// 5000
// 10000
// Chennai
// 222
// Karunya
// 16000
// 20000
// Coimbatore
// 333
// AppleTech
// 10000
// 12000
// Chennai
// 444
// Aruna
// 6000
// 10000
// Vellore
// Chennai
// Karunya
// Output
// ----------------------------------------
// 22000
// Karunya::A
class Institution {
    // institutionId - int
// institutionName - String
// noOfStudentsPlaced - int
// noOfStudentsCleared- int
// location - String
// grade - String

    private int institutionId;
    private String institutionName;
    private int noOfStudentsPlaced;
    private int noOfStudentsCleared;
    private String location;
    private String grade;

    
    public Institution() {
    }

    public Institution(int institutionId, String institutionName, int noOfStudentsPlaced, int noOfStudentsCleared,
            String location) {
        this.institutionId = institutionId;
        this.institutionName = institutionName;
        this.noOfStudentsPlaced = noOfStudentsPlaced;
        this.noOfStudentsCleared = noOfStudentsCleared;
        this.location = location;
    }

    public int getInstitutionId() {
        return institutionId;
    }

    public void setInstitutionId(int institutionId) {
        this.institutionId = institutionId;
    }

    public String getInstitutionName() {
        return institutionName;
    }

    public void setInstitutionName(String institutionName) {
        this.institutionName = institutionName;
    }

    public int getNoOfStudentsPlaced() {
        return noOfStudentsPlaced;
    }

    public void setNoOfStudentsPlaced(int noOfStudentsPlaced) {
        this.noOfStudentsPlaced = noOfStudentsPlaced;
    }

    public int getNoOfStudentsCleared() {
        return noOfStudentsCleared;
    }

    public void setNoOfStudentsCleared(int noOfStudentsCleared) {
        this.noOfStudentsCleared = noOfStudentsCleared;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

}

public class Solution {

    public static int FindNumClearancedByLoc(Institution arr[], String location) {
        int studentsClearedCount = 0;
        for (Institution i : arr) {
            if (i.getLocation().equalsIgnoreCase(location)) {
                studentsClearedCount += i.getNoOfStudentsCleared();
            }
        }
        return studentsClearedCount;
    }

    public static Institution UpdateInstitutionGrade(String institutionName, Institution arr[]) {

        Institution matchedInstitution = null;
        for (Institution i : arr) {
            if (i.getInstitutionName().equalsIgnoreCase(institutionName)) {
                matchedInstitution = i;
                break;
            }
        }

        if (matchedInstitution != null) {
            int rating = (matchedInstitution.getNoOfStudentsPlaced() * 100) / matchedInstitution.getNoOfStudentsCleared();
            String grade = rating >= 80 ? "A" : "B";
          
            matchedInstitution.setGrade(grade);
        }

        return matchedInstitution;
    }

    public static void main(String[] args) {

        Institution[] institutionsArr = new Institution[4];
        Scanner sc = new Scanner(System.in);
        

        for (int i = 0; i < institutionsArr.length; i++) {
            int institutionId = sc.nextInt();
            sc.nextLine();
            String institutionName = sc.nextLine();
            int noOfStudentsPlaced = sc.nextInt();
            int noOfStudentsCleared = sc.nextInt();
             sc.nextLine();
            String location =  sc.nextLine();
            //  sc.nextLine();

             institutionsArr[i] = new Institution(institutionId, institutionName, noOfStudentsPlaced, noOfStudentsCleared, location);
        }


        String location = sc.nextLine();

        
        String instituteName = sc.nextLine();

        int cleared = FindNumClearancedByLoc(institutionsArr, location);
        Institution i = UpdateInstitutionGrade(instituteName, institutionsArr);
    sc.close();

        if(cleared > 0) System.out.println(cleared);
        else System.out.println("There are no cleared students in this particular location");

        if(i==null) System.out.println("No Institute is available with the specified");
        else System.out.println(i.getInstitutionName()+"::"+i.getGrade());
        


    }

}
