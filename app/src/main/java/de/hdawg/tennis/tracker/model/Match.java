package de.hdawg.tennis.tracker.model;


import java.util.Date;
import java.util.List;

public abstract class Match {

    private Integer id;

    private ScoringRule scoringRule;
    private List<Set> sets;

    private String description;
    private Date date;

    private CourtTypes courtType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ScoringRule getScoringRule() {
        return scoringRule;
    }

    public void setScoringRule(ScoringRule scoringRule) {
        this.scoringRule = scoringRule;
    }

    public List<Set> getSets() {
        return sets;
    }

    public void setSets(List<Set> sets) {
        this.sets = sets;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public CourtTypes getCourtType() {
        return courtType;
    }

    public void setCourtType(CourtTypes courtType) {
        this.courtType = courtType;
    }
}
