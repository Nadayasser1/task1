public class Player {

    private String name;
    private int ID;
    private String teamName;

    // Constructor
    public Player(String name, int ID, String teamName) {
        this.name = name;
        this.ID = ID;
        this.teamName = teamName;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }

    public String getTeamName() {
        return teamName;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    // toString
    @Override
    public String toString() {
        return "Player Name: " + name +
                "\nID: " + ID +
                "\nTeam: " + teamName;
    }
}