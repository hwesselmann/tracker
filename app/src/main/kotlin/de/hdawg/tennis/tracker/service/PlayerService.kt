package de.hdawg.tennis.tracker.service

import de.hdawg.tennis.tracker.model.Player

object PlayerService {
    private var playerList: MutableList<Player> = mutableListOf<Player>()

    fun getAllPlayers() : MutableList<Player> {
        return playerList
    }

    fun savePlayer(player: Player): Map<String, String> {
        val validationResult= player.validate()
        if(validationResult.size > 0) {
            // TODO throw some messages at the caller
        } else {
            playerList.add(player)
        }
        return validationResult
    }
}