
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> personalDetails = new ArrayList<>();
        
        while (true) {
            String userInput = scanner.nextLine();
            
            if (userInput.isEmpty()) {
                break;
            }
            
            personalDetails.add(userInput);
        }
        
        int sum = 0;
        String longestName = "";
        int longestLength = 0;
        
        for (int i = 0; i < personalDetails.size(); i++) {
            String personDetails = personalDetails.get(i);
            
            String[] person = personDetails.split(",");
            
            sum += Integer.valueOf(person[1]);
            
            if (person[0].length() > longestLength) {
                longestLength = person[0].length();
                longestName = person[0];
            }
        }
        
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + (double)sum / personalDetails.size());
    }
}
