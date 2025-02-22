/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary simpleDictionary;
    
    public TextUI(Scanner scanner, SimpleDictionary simpleDictionary) {
        this.scanner = scanner;
        this.simpleDictionary = simpleDictionary;
    }
    
    public void start() {
        while (true) {
            System.out.println("Command: ");
            String command = scanner.nextLine();
            if (command.equals("end")) {
                System.out.println("Bye Bye!");
                break;
            } else if (command.equals("add")) {
                System.out.println("Word: ");
                String word = scanner.nextLine();
                System.out.println("Translation: ");
                String translate = scanner.nextLine();
                simpleDictionary.add(word, translate);
            } else if (command.equals("search")) {
                System.out.println("To be translated: ");
                String wordToTranslate = scanner.nextLine();
                if (simpleDictionary.contains(wordToTranslate)) {
                    String translation = simpleDictionary.translate(wordToTranslate);
                    System.out.println("Translation: " + translation);
                } else {
                    System.out.println("Word " + wordToTranslate + " was not found");
                }
            } else {
                System.out.println("Unknown command");
            }
        }
    }
}
