
import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }

            numbers.add(number);
        }
        
        System.out.println("From where?");
        int fromWhere = scanner.nextInt();
        
        System.out.println("To where?");
        int toWhere = scanner.nextInt();
        
        for (int i = fromWhere; i <= toWhere; i++) {
            System.out.println(numbers.get(i));
        }

    }
}
