
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<String> people = new ArrayList<String>();

        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            if (identifier.isEmpty()) {
                break;
            }
            
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            
            String concate = identifier + " " + name;
            
            if (!(people.contains(identifier))) {
                people.add(concate);
            }
        }
        System.out.println("==Items==");
        for (String person: people) {
            String[] pieces = person.split(" ");
            System.out.println(pieces[0] + ": " + pieces[1]);
        }
    }
}
