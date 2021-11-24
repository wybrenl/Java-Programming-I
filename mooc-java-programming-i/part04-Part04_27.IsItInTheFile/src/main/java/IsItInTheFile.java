
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //System.out.println("Name of the file:");
        String file = scanner.nextLine();

        //System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        Boolean found = false;

        try (Scanner scanner2 = new Scanner(Paths.get(file))) {
            while (scanner2.hasNextLine()) {
                String word = scanner2.nextLine();
                if (word.equals(searchedFor)) {
                    System.out.println("Found!");
                    found = true;
                    break;
            }
            } if (found == false) {
                System.out.println("Not found.");
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed");
        }

    }
}
