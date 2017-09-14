package de.hdawg.tennis.tracker.model

class ScoringRule {
    var id: Int? = null

    var ruleName: String? = null

    var setsToWin: Int? = null
    var pointsToWin: Int? = null
    var matchTieBreakPointsToWin: Int? = null

    var noAd: Boolean? = null
    var decisiveSetAsTieBreak: Boolean? = null

    var setStartsAtPoints: Int? = null
}
