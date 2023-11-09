public class Batter extends Player{
    private short totalmatchesPlayed;
    private int totalrunsMade ;
    private short totalFifties ;
    private short totalHundreds ;
    private String bestScore ;

    public Batter(short totalmatchesPlayed, int totalrunsMade, short totalFifties, short totalHundreds , String bestScore  ,
                  String playerName , short age , short jerseyNumber) {
        super(playerName,age,jerseyNumber);
        this.totalmatchesPlayed = totalmatchesPlayed;
        this.totalrunsMade = totalrunsMade;
        this.totalFifties = totalFifties;
        this.totalHundreds = totalHundreds;
        this.bestScore = bestScore ;
    }

    public void getBatterInfo(){
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t" + super.getPlayerName().toUpperCase() + "\t\t\t\tAge : " + super.getAge() + "\t\t\t\tJerseyNumber :" +
                super.getJerseyNumber());
        for (int i=0 ; i<175 ; i++){ System.out.print("-") ;}

        System.out.println("\nTotal Matches\t || \tTotal Runs\t || \tTotal Fifties\t || \tTotal Hundreds\t || \tBest Score");
        System.out.println("   \t" + totalmatchesPlayed + " \t\t\t\t\t" + totalrunsMade + "   \t\t\t\t" + totalFifties +
                "\t\t\t\t\t\t" + totalHundreds + "\t\t\t\t\t\t" + bestScore);
    }
}

// Batter extends Player class => totalMatchesPlayed (short) ; totalRunsMade (int) ; totalFifties (short) ;
//                                totalHundreds (short) ; getBatterInfo() ;