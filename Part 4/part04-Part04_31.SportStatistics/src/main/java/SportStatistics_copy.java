
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics_copy {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("File: ");
        String fileName = scan.nextLine();
        ArrayList<String> teams = new ArrayList<>();

        try (Scanner scannerFile = new Scanner(Paths.get(fileName))) {

            while (scannerFile.hasNextLine()) {
                String nextLine = scannerFile.nextLine();
                teams.add(nextLine);
            }
        } catch (Exception e) {
            System.out.println("Error when reading file " + e.getMessage());
        }
        System.out.println("Team:");
        String teamPicked = scan.nextLine();
        int iteratorGames = 0;
        int iteratorWins = 0;
        int iteratorLosses = 0;
        for (String line : teams) {
            String[] tempArray = line.split(",");
            if (tempArray[0].equals(teamPicked) || tempArray[1].equals(teamPicked)) {
                iteratorGames++;
            }
            int homeScore = Integer.valueOf(tempArray[2]);
            int awayScore = Integer.valueOf(tempArray[3]);
            if (tempArray[0].equals(teamPicked)) {
                if (homeScore > awayScore) {
                    iteratorWins++;
                } else {
                    iteratorLosses++;
                }
            }
            if (tempArray[1].equals(teamPicked)) {
                if (homeScore > awayScore) {
                    iteratorLosses++;
                } else {
                    iteratorWins++;
                }
            }
        }
        System.out.println("Games: " + iteratorGames);
        System.out.println("Wins: " + iteratorWins);
        System.out.print("Losses: " + iteratorLosses);
    }
}
