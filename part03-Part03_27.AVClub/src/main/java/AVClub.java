import java.util.ArrayList;
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<String> text = new ArrayList<>();
        
        while (true) {
            String userInput = scanner.nextLine();
            if (userInput.isEmpty()) {
                break;
            }
            text.add(userInput);
        }
        
        for (int i = 0; i < text.size(); i++) {
            String message = text.get(i);
            
            String[] pieces = message.split(" ");
            
            for (String piece: pieces) {
                if (piece.contains("av")) {
                    System.out.println(piece);
                }
            }
        }
        
    }
}
