package de.hdawg.tennis.tracker.model;

public class ScoringRule {
    private Integer id;

    private String ruleName;

    private Integer setsToWin;
    private Integer pointsToWin;
    private Integer matchTieBreakPointsToWin;

    private Boolean noAd;
    private Boolean decisiveSetAsTieBreak;

    private Integer setStartsAtPoints;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    public Integer getSetsToWin() {
        return setsToWin;
    }

    public void setSetsToWin(Integer setsToWin) {
        this.setsToWin = setsToWin;
    }

    public Integer getPointsToWin() {
        return pointsToWin;
    }

    public void setPointsToWin(Integer pointsToWin) {
        this.pointsToWin = pointsToWin;
    }

    public Integer getMatchTieBreakPointsToWin() {
        return matchTieBreakPointsToWin;
    }

    public void setMatchTieBreakPointsToWin(Integer matchTieBreakPointsToWin) {
        this.matchTieBreakPointsToWin = matchTieBreakPointsToWin;
    }

    public Boolean getNoAd() {
        return noAd;
    }

    public void setNoAd(Boolean noAd) {
        this.noAd = noAd;
    }

    public Boolean getDecisiveSetAsTieBreak() {
        return decisiveSetAsTieBreak;
    }

    public void setDecisiveSetAsTieBreak(Boolean decisiveSetAsTieBreak) {
        this.decisiveSetAsTieBreak = decisiveSetAsTieBreak;
    }

    public Integer getSetStartsAtPoints() {
        return setStartsAtPoints;
    }

    public void setSetStartsAtPoints(Integer setStartsAtPoints) {
        this.setStartsAtPoints = setStartsAtPoints;
    }
}
