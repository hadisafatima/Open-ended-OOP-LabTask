public abstract class Player {
    private String playerName ;
    private short age ;
    private short jerseyNumber ;

    public Player(String playerName, short age, short jerseyNumber) {
        this.playerName = playerName;
        this.age = age;
        this.jerseyNumber = jerseyNumber;
    }

    public String getPlayerName() {
        return playerName;
    }

    public short getAge() {
        return age;
    }

    public short getJerseyNumber() {
        return jerseyNumber;
    }
}

// Player class => playerName (String) ; age (short) ; jerseyNumber (short)
