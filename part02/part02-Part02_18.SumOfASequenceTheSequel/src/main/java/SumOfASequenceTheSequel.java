
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("First Number?");
        int firstNumber = scanner.nextInt();
        
        System.out.println("Last Number?");
        int lastNumber = scanner.nextInt();
        
        int sum = 0;
        
        for (int i = firstNumber; i <= lastNumber; i++) {
            sum += i;
        }
        
        System.out.println("The sum is " + sum);
    }
}
