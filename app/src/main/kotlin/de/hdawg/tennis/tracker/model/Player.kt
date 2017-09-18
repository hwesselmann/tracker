package de.hdawg.tennis.tracker.model

data class Player(val id: Int, val firstname: String, val lastname: String, val club : String = "", val yearOfBirth: Int = 0, val rightHanded: Boolean = true, val favourite: Boolean = false) {
    var matches: List<Match>? = null
}