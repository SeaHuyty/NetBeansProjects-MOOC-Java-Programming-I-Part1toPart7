
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String userInput = scanner.nextLine();
            if (userInput.equals("end")) {
                break;
            }
            int number = Integer.valueOf(userInput);
            System.out.println(number * number * number);
        }
    }
}
