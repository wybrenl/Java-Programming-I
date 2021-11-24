
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String file = scan.nextLine();
        String team = scan.nextLine();
        int games = 0;
        int wins = 0;
        int losses = 0;

        try(Scanner fileReader = new Scanner(Paths.get(file))) {
            while(fileReader.hasNextLine()) {
                String match = fileReader.nextLine();

                String[] data = match.split(",");
                String homeTeam = data[0];
                String awayTeam = data[1];
                int homePoints = Integer.valueOf(data[2]);
                int awayPoints = Integer.valueOf(data[3]);

                if (homeTeam.equals(team)) {
                    if (homePoints > awayPoints) {
                        games++;
                        wins++;
                    } else {
                        games++;
                        losses++;
                    }
                } else if (awayTeam.equals(team)) {
                    if (homePoints < awayPoints) {
                        games++;
                        wins++;
                    } else {
                        games++;
                        losses++;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("error: " + e.getMessage());
        }
        System.out.println("Games: " + games);   
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }

}
