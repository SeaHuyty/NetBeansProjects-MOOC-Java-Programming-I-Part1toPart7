
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        int numberCounter = 0;
        
        while (true) {
            System.out.println("Give a number:");
            
            int number = scanner.nextInt();
            
            if (number == 0) {
                break;
            } else if (number > 0) { 
                sum += number;
                numberCounter++;
            }
        }
        
        if (numberCounter == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            double average = (double)sum / numberCounter;

            System.out.println("Average of the numbers: " + average);
        }
    }
}
