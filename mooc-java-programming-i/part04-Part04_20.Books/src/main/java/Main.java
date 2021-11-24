import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String name = scanner.nextLine();
            if (name.equals("")) {
                break;
            }

            int pages = Integer.valueOf(scanner.nextLine());
            int year = Integer.valueOf(scanner.nextLine());

            books.add(new Book(name, pages, year));
        }

        String print = scanner.nextLine();
        
        for (Book book : books) {
            if (print.equals("everything")) {
                System.out.println(book);
            } else if (print.equals("name")) {
                System.out.println(book.getName());
            } else {
                System.out.println("invalid input");
            }
        }

    }
}
