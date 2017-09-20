package de.hdawg.tennis.tracker

import de.hdawg.tennis.tracker.model.Player
import de.hdawg.tennis.tracker.service.PlayerService
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.Assert.assertTrue

class PlayerTest {

    @Test
    fun initializePlayer() {
        val player = Player(1,"Rafael", "Nadal")
        assertTrue(player.id == 1 && player.firstname.equals("Rafael") && player.lastname.equals("Nadal"))
    }

    @Test
    fun savePlayerSuccessful() {
        assertEquals(PlayerService.getAllPlayers().size, 0)
        val player = Player(1,"Rafael", "Nadal")
        val validationResult = PlayerService.savePlayer(player)
        assertEquals(validationResult.size, 0)
        assertEquals(PlayerService.getAllPlayers().size, 1)
    }

    @Test
    fun savePlayerUnsuccessful() {
        assertEquals(PlayerService.getAllPlayers().size, 1)
        val player = Player(id = 1,firstname = "Roger", lastname = "", yearOfBirth = 1)
        val validationResult = PlayerService.savePlayer(player)
        assertEquals(validationResult.size, 2)
        assertEquals(PlayerService.getAllPlayers().size, 1)
    }
}