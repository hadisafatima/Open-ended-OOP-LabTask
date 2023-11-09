public class AllRounder extends Player {
    private short totalmatchesPlayed;
    private int totalrunsMade ;
    private short totalFifties ;
    private short totalHundreds ;
    private int totalWicketsTaken ;
    private short totalFifers ;
    private String bestScore ;
    private String bestBowling ;

    public AllRounder(String playerName, short age, short jerseyNumber, short totalmatchesPlayed, int totalrunsMade,
                      short totalFifties, short totalHundreds, int totalWicketsTaken, short totalFifers, String bestScore,
                      String bestBowling) {
        super(playerName, age, jerseyNumber);
        this.totalmatchesPlayed = totalmatchesPlayed;
        this.totalrunsMade = totalrunsMade;
        this.totalFifties = totalFifties;
        this.totalHundreds = totalHundreds;
        this.totalWicketsTaken = totalWicketsTaken;
        this.totalFifers = totalFifers;
        this.bestScore = bestScore;
        this.bestBowling = bestBowling;
    }

    public void printAllrounderInfo(){
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t" + super.getPlayerName().toUpperCase() + "\t\t\t\tAge : " + super.getAge() + "\t\t\t\tJerseyNumber :" +
                super.getJerseyNumber());
        for (int i=0 ; i<175 ; i++){ System.out.print("-") ;}
        System.out.println("\nTotal Matches\t || \tTotal Runs\t || \tTotal Fifties\t || \tTotal Hundreds\t || \tBest Score\t " +
                "|| \t total Wickets\t || \t Total Fifers\t || \t Best Bowling" );
        System.out.println("   \t" + totalmatchesPlayed + " \t\t\t\t\t" + totalrunsMade + "   \t\t\t\t" + totalFifties +
                "\t\t\t\t\t\t" + totalHundreds + "\t\t\t\t\t\t" + bestScore  + "  \t\t\t\t\t" + totalWicketsTaken + "\t\t\t\t\t\t" +
                totalFifers + "\t\t\t\t\t" + bestBowling);
    }

}
