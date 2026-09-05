//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.

    // Create Players List for Team A
    ArrayList<Player> playersA = new ArrayList<>();

    Player p1 = new Player("Ahmed", 1, "Team A");
    Player p2 = new Player("Omar", 2, "Team A");
    Player p3 = new Player("Ali", 3, "Team A");
    Player p4 = new Player("Mohamed", 4, "Team A");
    Player p5 = new Player("Hassan", 5, "Team A");
    Player p6 = new Player("Khaled", 6, "Team A");
    Player p7 = new Player("Mahmoud", 7, "Team A");
    Player p8 = new Player("Youssef", 8, "Team A");
    Player p9 = new Player("Mostafa", 9, "Team A");
    Player p10 = new Player("Tarek", 10, "Team A");
    Player p11 = new Player("Amr", 11, "Team A");

    playersA.add(p1);
    playersA.add(p2);
    playersA.add(p3);
    playersA.add(p4);
    playersA.add(p5);
    playersA.add(p6);
    playersA.add(p7);
    playersA.add(p8);
    playersA.add(p9);
    playersA.add(p10);
    playersA.add(p11);

    // Create Team A
    Team teamA = new Team("Team A", playersA, 0, 0);


    // Create Players List for Team B
    ArrayList<Player> playersB = new ArrayList<>();

    Player p12 = new Player("Adam", 1, "Team B");
    Player p13 = new Player("Karim", 2, "Team B");
    Player p14 = new Player("Ibrahim", 3, "Team B");
    Player p15 = new Player("Samir", 4, "Team B");
    Player p16 = new Player("Wael", 5, "Team B");
    Player p17 = new Player("Ayman", 6, "Team B");
    Player p18 = new Player("Sayed", 7, "Team B");
    Player p19 = new Player("Fady", 8, "Team B");
    Player p20 = new Player("Mina", 9, "Team B");
    Player p21 = new Player("Sherif", 10, "Team B");
    Player p22 = new Player("Hany", 11, "Team B");

    playersB.add(p12);
    playersB.add(p13);
    playersB.add(p14);
    playersB.add(p15);
    playersB.add(p16);
    playersB.add(p17);
    playersB.add(p18);
    playersB.add(p19);
    playersB.add(p20);
    playersB.add(p21);
    playersB.add(p22);

    // Create Team B
    Team teamB = new Team("Team B", playersB, 0, 0);


    // Create empty Goals List
    ArrayList<Goal> goals = new ArrayList<>();

    // Create Match
    Match match1 = new Match(1, teamA, teamB, goals);


    // Create Teams and Matches Lists
    ArrayList<Team> teams = new ArrayList<>();
    ArrayList<Match> matches = new ArrayList<>();

    teams.add(teamA);
    teams.add(teamB);

    matches.add(match1);


    // Create Schedule
    Schedule schedule = new Schedule(teams, matches);


    // ==============================
    // BEFORE THE MATCH
    // ==============================

    System.out.println("========================================");
    System.out.println("          BEFORE THE MATCH");
    System.out.println("========================================");

    System.out.println("\nLeague Table:");

    schedule.displayTable();


    // Display Team A Players
    System.out.println("\nTeam A Players:");

    for (int i = 0; i < teamA.getPlayers().size(); i++) {

        Player player = teamA.getPlayers().get(i);

        System.out.println((i + 1) + ". " + player.getName());
    }


    // Display Team B Players
    System.out.println("\nTeam B Players:");

    for (int i = 0; i < teamB.getPlayers().size(); i++) {

        Player player = teamB.getPlayers().get(i);

        System.out.println((i + 1) + ". " + player.getName());
    }


    // ==============================
    // START THE MATCH
    // ==============================

    // Create Goals
    Goal goal1 = new Goal(1, p1, 15);
    Goal goal2 = new Goal(1, p13, 40);
    Goal goal3 = new Goal(1, p5, 70);

    // Add Goals to Match
    match1.addGoal(goal1);
    match1.addGoal(goal2);
    match1.addGoal(goal3);


    // ==============================
    // MATCH RESULT
    // ==============================

    System.out.println("\n========================================");
    System.out.println("           MATCH RESULT");
    System.out.println("========================================");

    System.out.println("\n" + match1);

    System.out.println("\nGoals:");

    for (int i = 0; i < match1.getGoals().size(); i++) {

        Goal goal = match1.getGoals().get(i);

        System.out.println(
                (i + 1) + ". " +
                        goal.getScorer().getName() +
                        " - " +
                        goal.getScorer().getTeamName() +
                        " - " +
                        goal.getMinute() +
                        " minute"
        );
    }


    // ==============================
    // LEAGUE TABLE AFTER THE MATCH
    // ==============================

    System.out.println("\n========================================");
    System.out.println("       LEAGUE TABLE AFTER MATCH");
    System.out.println("========================================");

    schedule.displayTable();
}
