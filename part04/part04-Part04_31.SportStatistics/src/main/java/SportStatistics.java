
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String fileName = scan.nextLine();
        System.out.println("Team:");
        String teamName = scan.nextLine();
        int gameCounter = 0;
        int winCounter = 0;
        int lossCounter = 0;
        try (Scanner readFile = new Scanner(Paths.get(fileName))) {
            while (readFile.hasNextLine()) {
                String row = readFile.nextLine();
                String[] pieces = row.split(",");
                if (pieces[0].equals(teamName)) {
                    gameCounter++;
                    if (Integer.valueOf(pieces[2]) > Integer.valueOf(pieces[3])) {
                        winCounter++;
                    } else {
                        lossCounter++;
                    }
                } else if (pieces[1].equals(teamName)) {
                    gameCounter++;
                    if (Integer.valueOf(pieces[3]) > Integer.valueOf(pieces[2])) {
                        winCounter++;
                    } else {
                        lossCounter++;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Games: " + gameCounter);
        System.out.println("Wins: " + winCounter);
        System.out.println("Losses: " + lossCounter);
    }

}
