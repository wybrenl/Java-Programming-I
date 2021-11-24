
import java.util.Scanner;

public class CheckingTheAge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Provide a number between 0 and 100");

        int value = Integer.valueOf(scan.nextLine());

        if (value % 3 == 0 && value % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (value % 3 == 0) {
            System.out.println("Fizz");
        } else if (value % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(value);
        }
    }
}
