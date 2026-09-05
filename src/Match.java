import java.util.ArrayList;

public class Match {

    private int matchId;
    private Team homeTeam;
    private Team awayTeam;
    private ArrayList<Goal> goals;

    // Constructor
    public Match(int matchId, Team homeTeam, Team awayTeam,
                 ArrayList<Goal> goals) {

        this.matchId = matchId;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.goals = goals;
    }

    // Add goal
    public void addGoal(Goal goal) {
        goals.add(goal);
    }

    // Remove goal
    public void removeGoal(Goal goal) {
        goals.remove(goal);
    }

    // Calculate home team goals
    public int getHomeGoals() {

        int count = 0;

        for (int i = 0; i < goals.size(); i++) {

            Goal goal = goals.get(i);

            for (int j = 0; j < homeTeam.getPlayers().size(); j++) {

                Player player = homeTeam.getPlayers().get(j);

                if (player.getName().equals(goal.getScorer().getName())) {
                    count++;
                }
            }
        }

        return count;
    }

    // Calculate away team goals
    public int getAwayGoals() {

        int count = 0;

        for (int i = 0; i < goals.size(); i++) {

            Goal goal = goals.get(i);

            for (int j = 0; j < awayTeam.getPlayers().size(); j++) {

                Player player = awayTeam.getPlayers().get(j);

                if (player.getName().equals(goal.getScorer().getName())) {
                    count++;
                }
            }
        }

        return count;
    }

    // Getters
    public int getMatchId() {
        return matchId;
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public Team getAwayTeam() {
        return awayTeam;
    }

    public ArrayList<Goal> getGoals() {
        return goals;
    }

    // Setters
    public void setMatchId(int matchId) {
        this.matchId = matchId;
    }

    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    public void setAwayTeam(Team awayTeam) {
        this.awayTeam = awayTeam;
    }

    public void setGoals(ArrayList<Goal> goals) {
        this.goals = goals;
    }

    // toString
    @Override
    public String toString() {
        return matchId + "\t" +
                homeTeam.getName() + "\t" +
                getHomeGoals() + " - " +
                getAwayGoals() + "\t" +
                awayTeam.getName();
    }
}