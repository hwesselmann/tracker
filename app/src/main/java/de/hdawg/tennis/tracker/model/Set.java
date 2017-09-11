package de.hdawg.tennis.tracker.model;

import java.util.List;

public class Set {
    private Integer id;

    private Integer setNumber;
    private Integer scoreHome;
    private Integer scoreAway;

    private Boolean retiredHome;
    private Boolean retiredAway;

    private List<Game> games;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSetNumber() {
        return setNumber;
    }

    public void setSetNumber(Integer setNumber) {
        this.setNumber = setNumber;
    }

    public Integer getScoreHome() {
        return scoreHome;
    }

    public void setScoreHome(Integer scoreHome) {
        this.scoreHome = scoreHome;
    }

    public Integer getScoreAway() {
        return scoreAway;
    }

    public void setScoreAway(Integer scoreAway) {
        this.scoreAway = scoreAway;
    }

    public Boolean getRetiredHome() {
        return retiredHome;
    }

    public void setRetiredHome(Boolean retiredHome) {
        this.retiredHome = retiredHome;
    }

    public Boolean getRetiredAway() {
        return retiredAway;
    }

    public void setRetiredAway(Boolean retiredAway) {
        this.retiredAway = retiredAway;
    }

    public List<Game> getGames() {
        return games;
    }

    public void setGames(List<Game> games) {
        this.games = games;
    }
}
