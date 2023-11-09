public class Team {
    private String teamName ;
    private Player captainName ; // Association


    public Team(String teamName, Player captainName) {
        this.teamName = teamName;
        this.captainName = captainName;
    }

    public String getTeamName() {
        return teamName;
    }

}

// Team class => teamName (String) ; captainName (Player) ; runsMade (float) ; wicketsLost (short) ; getStrikeRate() ;
//               printTeamInfo() ; getPlayers()