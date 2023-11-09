public class Main {
    public static void main(String[] args) {

        String matchDay = "1-jan-2024";
        String team1 = "Pakistan Women Cricket Team";
        String team2 = "England Women Cricket Team" ;

        //info of team1 captain - allrounder
        String team1CaptainName = "Bismah Maroof" ;
        short team1CaptainAge = 32 ;
        short team1CaptainJerseyNumber = 3 ;
        short team1CaptainTotalMatchesPlayed = 138 ;
        int team1CaptainTotalruns = 2689 ;
        short team1CaptainTotalFifties = 12 ;
        short team1CaptainTotalHundreds = 0 ;
        int team1CaptainTotalWickets = 36 ;
        short team1CaptainTotalFifers = 0 ;
        String taeam1CaptainBestScore = "70*" ;
        String team1CaptainBestBowling = "3/21" ;

        //info of team2 captain - allrounder
        String team2CaptainName = "Tammy Beaumont" ;
        short team2CaptainAge = 32 ;
        short team2CaptainJerseyNumber = 5 ; ///
        short team2CaptainTotalMatchesPlayed = 99 ;
        int team2CaptainTotalruns = 1721 ;
        short team2CaptainTotalFifties = 10 ;
        short team2CaptainTotalHundreds = 1 ;
        String team2CaptainBestScore = "116" ;

        Player team1captainInfo = new AllRounder(team1CaptainName, team1CaptainAge, team1CaptainJerseyNumber,
                team1CaptainTotalMatchesPlayed,team1CaptainTotalruns, team1CaptainTotalFifties, team1CaptainTotalHundreds,
                team1CaptainTotalWickets, team1CaptainTotalFifers, taeam1CaptainBestScore, team1CaptainBestBowling) ;

        Player team2CaptainInfo = new Batter(team2CaptainTotalMatchesPlayed, team2CaptainTotalruns , team2CaptainTotalFifties ,
                team2CaptainTotalHundreds, team2CaptainBestScore, team2CaptainName, team2CaptainAge, team2CaptainJerseyNumber);


        CricketMatch cricketMatch = new CricketMatch(matchDay, team1, team2, team1captainInfo, team2CaptainInfo);

        String[] team1Players = {"Bismah Maroof (C)", "Munneba Ali", "Aliyah Riaz", "Fatima Sana", "Iram Javed", "Nida Dar",
        "Omaima Sohail (WK)", "Daina Baig", "Ayesha Naseem", "Sidra Nawaz", "Tauba Hassan"} ;
        String[] team2Players = {"Tammy Beaumont (C)", "Lauren Bell", "Sophia Dunkley", "Sophie Ecclestone", "Alice Capsey",
        "Amy Jones (WK)", "Katherine Brunt", "Freya Davies", "Nat Sciver", "Danni Wyatt", "Issy Wong"};

        cricketMatch.matchStart();
        System.out.println("\n\nINFORMATION OF BOTH CAPTAINS\n");
        System.out.println("Team 1");
        ((AllRounder) team1captainInfo).printAllrounderInfo();
        System.out.println("\nTeam 2");
        ((Batter) team2CaptainInfo).getBatterInfo();
        System.out.println("\n\nPlaying 11 of both Teams are:");
        System.out.println("\nPAKISTAN WOMEN");
        for (int i=0 ; i<11 ; i++) {
            System.out.println((i+1) + ") " + team1Players[i]);
        }

        System.out.println("\nENGLAND WOMEN");
        for (int i=0 ; i<11 ; i++) {
            System.out.println((i+1) + ") " + team2Players[i]);
        }

    }
}
