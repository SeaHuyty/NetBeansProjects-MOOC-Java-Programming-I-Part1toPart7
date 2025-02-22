import java.util.ArrayList;
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> text = new ArrayList<>();
        
        while (true) {
            String message = scanner.nextLine();
            if (message.isEmpty()) {
                break;
            }
            text.add(message);
        }
        
        for (int i = 0; i < text.size(); i++) {
            String message = text.get(i);
            String[] pieces = message.split(" ");
            
            for (String piece: pieces) {
                System.out.println(piece);
            }
        }
    }
}
