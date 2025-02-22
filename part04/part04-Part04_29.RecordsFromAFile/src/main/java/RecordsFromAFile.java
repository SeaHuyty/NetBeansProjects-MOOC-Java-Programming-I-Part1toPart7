
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file: ");
        String fileName = scanner.nextLine();
        try (Scanner readFile = new Scanner(Paths.get(fileName))) {
            while (readFile.hasNextLine()) {
                String info = readFile.nextLine();
                String[] parts = info.split(",");
                if (Integer.valueOf(parts[1]) == 1) {
                    System.out.println(parts[0] + ", age: 1 year");
                } else {
                    System.out.println(parts[0] + ", age: " + parts[1] + " years");
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
