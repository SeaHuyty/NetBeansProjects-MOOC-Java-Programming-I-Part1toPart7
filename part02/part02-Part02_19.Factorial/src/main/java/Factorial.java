
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give a number:");
        int number = scanner.nextInt();
        
        int sum = 1;
        
        for (int i = 1; i <= number; i++) {
            sum *= i;
        }
        
        System.out.println("Factorial: " + sum);
    }
}
