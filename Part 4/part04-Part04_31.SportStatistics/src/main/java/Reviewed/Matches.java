
public class Matches {

    private String homeTeam;
    private String awayTeam;
    private int homeScore;
    private int awayScore;

    public Matches(String homeTeam, String awayTeam, int homeScore, int awayScore) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homeScore = homeScore;
        this.awayScore = awayScore;
    }

    public String getHomeTeam() {
        return this.homeTeam;
    }

    public String getAwayTeam() {
        return this.awayTeam;
    }

    public int getHomeScore() {
        return this.homeScore;
    }

    public int getAwayScore() {
        return this.awayScore;
    }

    public String toString() {
        return this.homeTeam + " vs " + this.awayTeam + " " + this.homeScore + ":" + this.awayScore;
    }
}
