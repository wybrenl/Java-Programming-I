
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;

        while (true) {
            String user = scanner.nextLine();
            if (user.equals("")) {
                break;
            }

            String[] parts = user.split(",");
            if (Integer.valueOf(parts[1]) > oldest) {
                oldest = Integer.valueOf(parts[1]);
            }
        }
        System.out.println(oldest);
    }
}
