import java.util.*;


// Enter Sting : Welcome to my Java Programming
// output: Programming Java my to Welcome

public class ReverseWords {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter string: ");
            String input = sc.nextLine();
            
            //! Way 1
            // Split by one or more spaces to handle accidental double spaces
            String[] words = input.trim().split("\\s+");
            StringBuilder reversed = new StringBuilder();

            // Loop backward through the array of words
            for (int i = words.length - 1; i >= 0; i--) {
                reversed.append(words[i]);
                
                // Add a space between words, but NOT after the last word
                if (i > 0) {
                    reversed.append(" ");
                }
            }

            System.out.println("Reversed Words way1 : " + reversed.toString());

            //! Way 2
            // 1. Split into an array and convert it to a modifiable List
            List<String> wordsList = Arrays.asList(input.trim().split("\\s+"));

            // 2. Reverse the list in place
            Collections.reverse(wordsList);

            // 3. Join the elements back into a string separated by spaces
            String result = String.join(" ", wordsList);

            System.out.println("Reversed Words way 2: " + result);
        }
    }
}
