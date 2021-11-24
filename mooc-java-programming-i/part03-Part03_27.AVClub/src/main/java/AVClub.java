
import java.util.Scanner;
import java.util.ArrayList;


public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<String> list = new ArrayList<>();

        while (true) {
            //System.out.println("write input:");
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            } else {
                String[] pieces = input.split(" ");
                for (int i = 0; i < pieces.length; i++) {
                    list.add(pieces[i]);
                }
            }
        }
        
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).contains("av")) {
                System.out.println(list.get(i));
            } else {
                continue;
            }
        }
    }
}
