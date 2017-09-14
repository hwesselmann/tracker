package de.hdawg.tennis.tracker.model

class Player {

    var id: Int? = null

    var firstname: String? = null
    var lastname: String? = null
    var club: String? = null
    var yearOfBirth: Int? = null
    var rightHanded: Boolean? = null
    var favourite: Boolean? = null

    var matches: List<Match>? = null
}