
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest = 0;
        String nameOfOldest = "";
        
        while (true) {
            String inputAge = scanner.nextLine();
            if (inputAge.isEmpty()) {
                break;
            }
            
            String[] parts = inputAge.split(",");
            
            int age = Integer.valueOf(parts[1]);
            if (age > oldest) {
                oldest = age;
                nameOfOldest = parts[0];
            }
        }
        System.out.println("Name of the oldest: " + nameOfOldest);
    }
}
