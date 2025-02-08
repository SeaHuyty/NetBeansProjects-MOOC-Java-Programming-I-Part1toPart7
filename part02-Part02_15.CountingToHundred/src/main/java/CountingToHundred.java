
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number = scanner.nextInt();
        
        for (int i = number; i <= 100; i++) {
            System.out.println(i);
        }
    }
}
