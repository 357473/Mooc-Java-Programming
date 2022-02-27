
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File: ");
        String fileName = scanner.nextLine();
        ArrayList<Games> games = readFromFile(fileName);
        //printGames(games);
        System.out.print("Team: ");
        String teamPicked = scanner.nextLine();
        System.out.println("Games: " + gamesPlayed(teamPicked, games).size());
        System.out.println("Wins: " + gamesWon(teamPicked, games).size());
        System.out.println("Losses: " + gamesLost(teamPicked, games).size());
    }

    // method reading data from a file
    public static ArrayList<Games> readFromFile(String fileName) {
        ArrayList<Games> gameData = new ArrayList<>();
        try (Scanner scannerFile = new Scanner(Paths.get(fileName))) {
            while (scannerFile.hasNextLine()) {
                String nextLine = scannerFile.nextLine();
                String arrayGames[] = nextLine.split(",");
                String homeTeam = arrayGames[0];
                String awayTeam = arrayGames[1];
                int homeScore = Integer.valueOf(arrayGames[2]);
                int awayScore = Integer.valueOf(arrayGames[3]);
                gameData.add(new Games(homeTeam, awayTeam, homeScore, awayScore));
            }
        } catch (Exception e) {
            System.out.println("Error when reading file " + e.getMessage());
        }
        return gameData;
    }

    // method printing games results
    public static ArrayList<Games> printGames(ArrayList<Games> games) {
        for (Games gamesData : games) {
            System.out.println(gamesData);
        }
        return games;
    }

    // method counting games
    public static ArrayList<Games> gamesPlayed(String teamPicked, ArrayList<Games> games) {
        ArrayList<Games> gamesTotal = new ArrayList<>();
        for (Games gamesTeam : games) {
            if (gamesTeam.getHomeTeam().equals(teamPicked) || gamesTeam.getAwayTeam().equals(teamPicked)) {
                gamesTotal.add(gamesTeam);
            }
        }
        return gamesTotal;
    }

    // method counting number of wins
    public static ArrayList<Games> gamesWon(String teamPicked, ArrayList<Games> games) {
        ArrayList<Games> gamesPlayedWon = new ArrayList<>();
        for (Games gamesPlayed : games) {
            int homeScore = gamesPlayed.getHomeScore();
            int awayScore = gamesPlayed.getAwayScore();
            if (gamesPlayed.getHomeTeam().equals(teamPicked)) {
                if (homeScore > awayScore) {
                    gamesPlayedWon.add(gamesPlayed);
                }
            } else if (gamesPlayed.getAwayTeam().equals(teamPicked)) {
                if (awayScore > homeScore) {
                    gamesPlayedWon.add(gamesPlayed);
                }
            }
        }
        return gamesPlayedWon;
    }
    // method counting number of losses

    public static ArrayList<Games> gamesLost(String teamPicked, ArrayList<Games> games) {
        ArrayList<Games> gamesPlayedLost = new ArrayList<>();
        for (Games gamesPlayed : games) {
            int homeScore = gamesPlayed.getHomeScore();
            int awayScore = gamesPlayed.getAwayScore();
            if (gamesPlayed.getHomeTeam().equals(teamPicked)) {
                if (homeScore < awayScore) {
                    gamesPlayedLost.add(gamesPlayed);
                }
            } else if (gamesPlayed.getAwayTeam().equals(teamPicked)) {
                if (awayScore < homeScore) {
                    gamesPlayedLost.add(gamesPlayed);
                }
            }
        }
        return gamesPlayedLost;
    }
}
