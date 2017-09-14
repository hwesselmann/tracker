package de.hdawg.tennis.tracker.model

class Set {
    var id: Int? = null

    var setNumber: Int? = null
    var scoreHome: Int? = null
    var scoreAway: Int? = null

    var retiredHome: Boolean? = null
    var retiredAway: Boolean? = null

    var games: List<Game>? = null
}
