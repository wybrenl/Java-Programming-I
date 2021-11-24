
public class Main {

    public static void main(String[] args) {
        // test your program here!
        SimpleDate today = new SimpleDate(1, 1, 2000);

        for (int i = 0; i < 365; i++) {
            today.advance();
        }

        System.out.println(today);

        today.advance(20);

        System.out.println(today);
    }
}
