
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Where to?");
        int numberTo = scanner.nextInt();
        
        System.out.println("Where from?");
        int numberFrom = scanner.nextInt();
        
        for (int i = numberFrom; i <= numberTo; i++) {
            System.out.println(i);
        }
    }
}
