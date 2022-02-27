
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics_new {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("File:");
        String fileName = scanner.nextLine();
        ArrayList<Matches> games = readDatabase(fileName);
        System.out.println("Team:");
        String team = scanner.nextLine();
        System.out.println("Games: " + gamesPlayed(games, team));
        System.out.println("Wins: " + gamesWon(games, team));
        System.out.println("Losses: " + gamesLost(games, team));
    }

    public static ArrayList<Matches> readDatabase(String fileName) {
        ArrayList<Matches> games = new ArrayList<>();
        try (Scanner scanner = new Scanner(Paths.get(fileName))) {
            while (scanner.hasNextLine()) {
                String oneLine = scanner.nextLine();
                String array[] = oneLine.split(",");
                String homeTeam = array[0];
                String awayTeam = array[1];
                int homeScore = Integer.valueOf(array[2]);
                int awayScore = Integer.valueOf(array[3]);
                games.add(new Matches(homeTeam, awayTeam, homeScore, awayScore));
            }
        } catch (Exception e) {
            System.out.println("Error in file " + e.getMessage());
        }
        return games;
    }

    public static void printGames(ArrayList<Matches> gamez) {
        System.out.println(gamez);
    }

    public static int gamesPlayed(ArrayList<Matches> teams, String team) {
        int iterator = 0;
        for (Matches match : teams) {
            if (match.getHomeTeam().equals(team) || match.getAwayTeam().equals(team)) {
                iterator++;
            }
        }
        return iterator;
    }

    public static int gamesWon(ArrayList<Matches> teams, String team) {
        int iterator = 0;
        for (Matches match : teams) {
            int homeScore = match.getHomeScore();
            int awayScore = match.getAwayScore();
            if (match.getHomeTeam().equals(team)) {
                if (homeScore > awayScore) {
                    iterator++;
                }
            } else if (match.getAwayTeam().equals(team)) {
                if (awayScore > homeScore) {
                    iterator++;
                }
            }
        }
        return iterator;
    }

    public static int gamesLost(ArrayList<Matches> teams, String team) {
        int iterator = 0;
        for (Matches match : teams) {
            int homeScore = match.getHomeScore();
            int awayScore = match.getAwayScore();
            if (match.getHomeTeam().equals(team)) {
                if (homeScore < awayScore) {
                    iterator++;
                }
            } else if (match.getAwayTeam().equals(team)) {
                if (awayScore < homeScore) {
                    iterator++;
                }
            }
        }
        return iterator;
    }
}
