import java.util.ArrayList;

public class Schedule {

    private ArrayList<Team> teams;
    private ArrayList<Match> matches;

    // Constructor
    public Schedule(ArrayList<Team> teams, ArrayList<Match> matches) {
        this.teams = teams;
        this.matches = matches;
    }

    // Add team
    public void addTeam(Team team) {
        teams.add(team);
    }

    // Remove team
    public void removeTeam(Team team) {
        teams.remove(team);
    }

    // Add match
    public void addMatch(Match match) {
        matches.add(match);
    }

    // Remove match
    public void removeMatch(Match match) {
        matches.remove(match);
    }

    // Update goals and points
    public void updateStatistics() {

        // Reset goals and points
        for (int i = 0; i < teams.size(); i++) {

            teams.get(i).setGoals(0);
            teams.get(i).setPoints(0);
        }

        // Calculate goals and points
        for (int i = 0; i < matches.size(); i++) {

            Match match = matches.get(i);

            // If the match has not started yet
            if (match.getGoals().size() == 0) {
                continue;
            }

            int homeGoals = match.getHomeGoals();
            int awayGoals = match.getAwayGoals();

            Team homeTeam = match.getHomeTeam();
            Team awayTeam = match.getAwayTeam();

            // Add goals
            homeTeam.setGoals(homeTeam.getGoals() + homeGoals);
            awayTeam.setGoals(awayTeam.getGoals() + awayGoals);

            // Add points
            if (homeGoals > awayGoals) {

                homeTeam.setPoints(homeTeam.getPoints() + 3);

            } else if (awayGoals > homeGoals) {

                awayTeam.setPoints(awayTeam.getPoints() + 3);

            } else {

                homeTeam.setPoints(homeTeam.getPoints() + 1);
                awayTeam.setPoints(awayTeam.getPoints() + 1);
            }
        }
    }

    // Sort teams
    public void sortTeams() {

        for (int i = 0; i < teams.size() - 1; i++) {

            for (int j = i + 1; j < teams.size(); j++) {

                Team team1 = teams.get(i);
                Team team2 = teams.get(j);

                if (team2.getPoints() > team1.getPoints()) {

                    teams.set(i, team2);
                    teams.set(j, team1);

                } else if (team2.getPoints() == team1.getPoints()
                        && team2.getGoals() > team1.getGoals()) {

                    teams.set(i, team2);
                    teams.set(j, team1);
                }
            }
        }
    }

    // Display league table
    public void displayTable() {

        updateStatistics();
        sortTeams();

        System.out.println("==============================");
        System.out.println("       SOCCER LEAGUE TABLE");
        System.out.println("==============================");

        System.out.println("Team\t\tGoals\tPoints");

        for (int i = 0; i < teams.size(); i++) {

            Team team = teams.get(i);

            System.out.println(
                    team.getName() + "\t\t" +
                            team.getGoals() + "\t" +
                            team.getPoints()
            );
        }
    }

    // Display match details
    public void displayMatch(int matchId) {

        for (int i = 0; i < matches.size(); i++) {

            Match match = matches.get(i);

            if (match.getMatchId() == matchId) {

                System.out.println("==============================");
                System.out.println("        MATCH DETAILS");
                System.out.println("==============================");

                System.out.println(match);

                System.out.println("Goals:");

                for (int j = 0; j < match.getGoals().size(); j++) {

                    Goal goal = match.getGoals().get(j);

                    System.out.println(goal);
                }

                return;
            }
        }

        System.out.println("Match not found.");
    }

    // Getters
    public ArrayList<Team> getTeams() {
        return teams;
    }

    public ArrayList<Match> getMatches() {
        return matches;
    }

    // Setters
    public void setTeams(ArrayList<Team> teams) {
        this.teams = teams;
    }

    public void setMatches(ArrayList<Match> matches) {
        this.matches = matches;
    }

    // toString
    @Override
    public String toString() {
        return "Teams: " + teams.size() +
                ", Matches: " + matches.size();
    }
}