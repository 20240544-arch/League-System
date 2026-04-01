 package com.mycompany.leaguesystem;

public class LeagueSystem {

    public static void main(String[] args) {
        System.out.println("=====================================");
        System.out.println("        League System Test - 20240544");
        System.out.println("=====================================\n");

        // 1. Test creating a league
        League egyptianLeague = new League();
        System.out.println("[+] League created successfully.");

        // 2. Test creating a coach, stadium, and team
        Coach ahlyCoach = new Coach();
        Stadium cairoStadium = new Stadium();
        Team ahlyTeam = new Team();
        System.out.println("[+] Team, Coach, and Stadium created successfully.");

        // 3. Test inheritance and polymorphism for players
        System.out.println("\n--- Testing Player Roles ---");
        
        Player player1 = new Goalie();
        System.out.print("Player 1 (Goalie): ");
        player1.doRole();

        Player player2 = new BigShooters();
        System.out.print("Player 2 (Big Shooter): ");
        player2.doRole();

        Player player3 = new Wings();
        System.out.print("Player 3 (Wing): ");
        player3.doRole();

        Player player4 = new CircleRunners();
        System.out.print("Player 4 (Circle Runner): ");
        player4.doRole();

        // 4. Test creating referees and a match
        Refree mainRef = new CourtReferee();
        Refree lineRef = new GoalLineReferee();
        System.out.println("\n[+] Referees assigned (Court Referee & Goal Line Referee).");

        Match finalMatch = new Match();
        System.out.println("[+] Match created successfully.");

        System.out.println("\n=====================================");
        System.out.println("       Test Passed Successfully! \u2705  ");
        System.out.println("=====================================");
    }
}