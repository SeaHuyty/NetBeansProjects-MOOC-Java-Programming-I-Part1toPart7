
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        // Try your method here
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(1);
        numbers.add(7);
        numbers.add(9);
        numbers.add(2);
        numbers.add(6);
        
        System.out.println("The numbers in the range [1, 2]");
        printNumbersInRange(numbers, 1, 2);

        System.out.println("The numbers in the range [6, 999]");
        printNumbersInRange(numbers, 6, 999);
    }
    
    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
        for (int number: numbers) {
            if (number >= lowerLimit && number <= upperLimit) {
                System.out.println(number);
            }
        }
    }
    
}
