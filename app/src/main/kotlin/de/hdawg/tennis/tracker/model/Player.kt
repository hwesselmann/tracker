package de.hdawg.tennis.tracker.model

data class Player(val id: Int?, val firstname: String, val lastname: String, val club : String = "", val yearOfBirth: Int = 0, val rightHanded: Boolean = true, val favourite: Boolean = false) {
    var matches: List<Match>? = null

    fun validate(): Map<String, String> {
        val validationResult = mutableMapOf<String, String>()

        if(firstname.length < 1) validationResult.put("firstname", "firstname cannot be empty")
        if(lastname.length < 1) validationResult.put("lastname", "lastname cannot be empty")
        if(yearOfBirth > 0 && Math.log10(Math.abs(yearOfBirth.toDouble())).toInt() + 1 != 4) validationResult.put("yearOfBirth", "year of birth must be in form yyyy")

        return validationResult
    }
}