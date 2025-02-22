
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Give the first number:");
        int firstNumber = scan.nextInt();
        
        System.out.println("Give the second number:");
        int secondNumber = scan.nextInt();
        
        if (firstNumber > secondNumber) {
            System.out.println("Greater Number is: " + firstNumber);
        } else if (firstNumber < secondNumber) {
            System.out.println("Greater Number is: " + secondNumber);
        } else {
            System.out.println("The numbers are equal!");
        }
    }
}
