import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dict;

    public TextUI(Scanner scanner, SimpleDictionary dict) {
        this.scanner = scanner;
        this.dict = dict;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();
    
            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }

            if (command.equals("add")) {
                System.out.print("Word: ");
                String word = scanner.nextLine();
                System.out.print("Translation: ");
                String translation = scanner.nextLine();
                dict.add(word, translation);
                continue;
            }

            if (command.equals("search")) {
                System.out.print("To be translated: ");
                String translate = scanner.nextLine();
                String translated = dict.translate(translate);
                if (! (translated == null)) {
                    System.out.println("Translation: " + translated);
                    continue;
                } else {
                    System.out.println("Word " + translate + " was not found");
                    continue;
                }
            }                
            System.out.println("Unknown command");
        }
        
    }
}
