package de.hdawg.tennis.tracker.service

import de.hdawg.tennis.tracker.model.Player

object PlayerService {
    var playerList: MutableList<Player> = mutableListOf<Player>()

    fun savePlayer(player: Player): Unit {
        // TODO this is not really saving the player permanently, for now, it is just in memory
        playerList.add(player)
    }
}