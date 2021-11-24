
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        // Try your method here
    }

    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
        System.out.println("The numbers in range [" + lowerLimit + ", " + upperLimit + "]");
        for (Integer number : numbers) {
            if (number > lowerLimit && number < upperLimit) {
                System.out.println(number);
            }
        }
    }
}
