package de.hdawg.tennis.tracker

import de.hdawg.tennis.tracker.model.Player
import de.hdawg.tennis.tracker.service.PlayerService
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.Assert.assertTrue

class PlayerTest {

    @Test
    fun initializePlayer() {
        val player = Player(1,"Rafael", "Nadal", "none")
        assertTrue(player.id == 1 && player.firstname.equals("Rafael") && player.lastname.equals("Nadal"))
    }

    @Test
    fun savePlayer() {
        assertEquals(PlayerService.getAllPlayers().size, 0)
        val player = Player(1,"Rafael", "Nadal", "none")
        PlayerService.savePlayer(player)
        assertEquals(PlayerService.getAllPlayers().size, 1)
    }
}