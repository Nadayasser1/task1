public class Goal {

    private int matchId;
    private Player scorer;
    private int minute;

    // Constructor
    public Goal(int matchId, Player scorer, int minute) {
        this.matchId = matchId;
        this.scorer = scorer;
        this.minute = minute;
    }

    // Getters
    public int getMatchId() {
        return matchId;
    }

    public Player getScorer() {
        return scorer;
    }

    public int getMinute() {
        return minute;
    }

    // Setters
    public void setMatchId(int matchId) {
        this.matchId = matchId;
    }

    public void setScorer(Player scorer) {
        this.scorer = scorer;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    // toString
    @Override
    public String toString() {
        return "Match ID: " + matchId +
                "\nScorer: " + scorer.getName() +
                "\nTeam: " + scorer.getTeamName() +
                "\nMinute: " + minute;
    }
}