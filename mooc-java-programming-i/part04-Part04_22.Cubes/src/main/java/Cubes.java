
import java.util.Scanner;
import java.lang.Math;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            } else {
                System.out.println(Math.round(Math.pow(Integer.valueOf(input), 3)));
            }
        }

    }
}
