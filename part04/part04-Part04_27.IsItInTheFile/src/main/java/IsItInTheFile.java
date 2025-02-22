
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        
        int identifier = 0;
        try (Scanner readFile = new Scanner(Paths.get(file))) {
            while (readFile.hasNextLine()) {
                String row = readFile.nextLine();
                if (row.equals(searchedFor)) {
                    System.out.println("Found!");
                    identifier = 1;
                }
            }
            if (identifier == 0) {
                System.out.println("Not found.");
            }
            
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }
    }
}
