
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        ArrayList<Integer> numbers = new ArrayList<>();
        int number = 0;
        int sum = 0;
        while(true) {
            number = scanner.nextInt();
            if (number == -1) {
                break;
            }
            numbers.add(number);
            sum += number;
        }
        System.out.println("Average: " + (double)sum / numbers.size());
    }
}
