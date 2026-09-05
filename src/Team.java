import java.util.ArrayList;

public class Team {

    private String name;
    private ArrayList<Player> players;
    private int goals;
    private int points;

    // Constructor
    public Team(String name, ArrayList<Player> players, int goals, int points) {
        this.name = name;
        this.players = players;
        this.goals = goals;
        this.points = points;
    }

    // Add player
    public void addPlayer(Player player) {
        players.add(player);
    }

    // Remove player
    public void removePlayer(Player player) {
        players.remove(player);
    }

    // Getters
    public String getName() {
        return name;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public int getGoals() {
        return goals;
    }

    public int getPoints() {
        return points;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    // toString
    @Override
    public String toString() {
        return "Team Name: " + name +
                "\nGoals: " + goals +
                "\nPoints: " + points +
                "\nPlayers: " + players;
    }
}