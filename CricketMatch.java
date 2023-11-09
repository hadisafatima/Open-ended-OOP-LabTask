public class CricketMatch {
    private String matchDay ;
    private Team team1 ;
    private Team team2 ;

    public CricketMatch(String matchDay, String team1, String team2 ,Player captain1 , Player captain2) {
        this.matchDay = matchDay;
        //Composition
        this.team1 = new Team(team1 , captain1);
        this.team2 = new Team(team2 , captain2);
    }

    public void matchStart(){
        System.out.println("Match between " + team1.getTeamName() + " and " + team2.getTeamName() + " will be started at " +
                matchDay );
    }
}


// Match class => matchDay (String) ; team1 and team2 (Team) [Composition]  ; void matchStart()
// Team class => teamName (String) ; captainName (Player) ; runsMade (float) ; wicketsLost (short) ; getStrikeRate() ;
//               printTeamInfo() ; getPlayers()
// Player class => playerName (String) ; age (short) ; jerseyNumber (short)
// Batter extends Player class => totalMatchesPlayed (short) ; totalRunsMade (int) ; totalFifties (short) ;
//                                totalHundreds (short) ; getBatterInfo() ;
// Bowler extends Player class => totalMatchesPlayed (Short) ; totalWicketsTaken (int) ; totalFifers (short) ;
//                                getBowlerInfo() ;