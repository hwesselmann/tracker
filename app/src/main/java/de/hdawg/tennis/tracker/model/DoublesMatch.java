package de.hdawg.tennis.tracker.model;

public class DoublesMatch extends Match {
    private Player playerHomeOne;
    private Player playerHomeTwo;

    private Player playerAwayOne;
    private Player playerAwayTwo;

    public Player getPlayerHomeOne() {
        return playerHomeOne;
    }

    public void setPlayerHomeOne(Player playerHomeOne) {
        this.playerHomeOne = playerHomeOne;
    }

    public Player getPlayerHomeTwo() {
        return playerHomeTwo;
    }

    public void setPlayerHomeTwo(Player playerHomeTwo) {
        this.playerHomeTwo = playerHomeTwo;
    }

    public Player getPlayerAwayOne() {
        return playerAwayOne;
    }

    public void setPlayerAwayOne(Player playerAwayOne) {
        this.playerAwayOne = playerAwayOne;
    }

    public Player getPlayerAwayTwo() {
        return playerAwayTwo;
    }

    public void setPlayerAwayTwo(Player playerAwayTwo) {
        this.playerAwayTwo = playerAwayTwo;
    }
}
