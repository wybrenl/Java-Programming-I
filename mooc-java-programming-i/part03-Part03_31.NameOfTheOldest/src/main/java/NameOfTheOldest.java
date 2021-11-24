
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        int oldest = 0;

        while (true) {
            String user = scanner.nextLine();
            if (user.equals("")) {
                break;
            }

            String[] parts = user.split(",");
            if (Integer.valueOf(parts[1]) > oldest) {
                oldest = Integer.valueOf(parts[1]);
                name = parts[0];
            }
        }
        System.out.println(name);


    }
}
