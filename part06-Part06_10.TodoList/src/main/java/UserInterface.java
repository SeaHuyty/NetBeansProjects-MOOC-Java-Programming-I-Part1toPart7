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

public class UserInterface {
    private TodoList todoList;
    private Scanner scanner;
    
    public UserInterface(TodoList list, Scanner scanner) {
        this.todoList = list;
        this.scanner = scanner;
    }
    
    public void start() {
        while (true) {
            System.out.println("Command: ");
            String command = scanner.nextLine();
            if (command.equals("stop")) {
                break;
            } else if (command.equals("list")) {
                todoList.print();
            } else if (command.equals("add")) {
                System.out.println("To add: ");
                String toAdd = scanner.nextLine();
                todoList.add(toAdd);
            } else if (command.equals("remove")) {
                System.out.println("Which one is removed? ");
                int number = Integer.valueOf(scanner.nextLine());
                todoList.remove(number);
            }
        }
    }
}
