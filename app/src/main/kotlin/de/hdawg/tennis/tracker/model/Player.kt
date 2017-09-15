package de.hdawg.tennis.tracker.model

data class Player(var id: Int, var firstname: String, var lastname: String, var club : String) {
    var yearOfBirth: Int? = null
    var rightHanded: Boolean? = null
    var favourite: Boolean = false

    var matches: List<Match>? = null
}