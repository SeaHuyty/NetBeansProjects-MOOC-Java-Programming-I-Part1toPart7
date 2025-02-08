
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        
        double squareRoot = Math.sqrt(firstNumber + secondNumber);
        
        System.out.println(squareRoot);
    }
}
