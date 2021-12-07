import java.util.Scanner;

public class UserInterface {
    private TodoList taskList;
    private Scanner scannert;

    public UserInterface(TodoList list, Scanner scanner) {
        this.taskList = list;
        this.scannert = scanner;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scannert.nextLine();

            if (command.equals("add")) {
                System.out.print("To add: ");
                String task = scannert.nextLine();
                taskList.add(task);
                continue;
            }

            if (command.equals("list")) {
                taskList.print();
                continue;
            }

            if (command.equals("remove")) {
                System.out.print("Which one is removed? ");
                int id = Integer.valueOf(scannert.nextLine());
                taskList.remove(id);
                continue;
            }

            if (command.equals("stop")) {
                break;
            }
        }
    }
}
