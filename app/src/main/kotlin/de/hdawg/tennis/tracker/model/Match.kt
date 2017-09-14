package de.hdawg.tennis.tracker.model


import java.util.Date

abstract class Match {

    var id: Int? = null

    var scoringRule: ScoringRule? = null
    var sets: List<Set>? = null

    var description: String? = null
    var date: Date? = null

    var courtType: CourtTypes? = null
}
