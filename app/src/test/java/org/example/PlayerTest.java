package org.example;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class PlayerTest {

    @Test public void testPlayerInitializations() {
        Player player = new Player();
        assertNotNull("Player name should not be null", player.name);
        assertEquals("Player name should be 'user'", "user", player.name);
        assertNotNull("Player deck should not be null",player.Deck);
        assertEquals("Player deck should contain 8 monsters",8, player.Deck.length);

        for (Monster monster : player.Deck) {
            assertNotNull("Each monster in the deck should not be null",monster);
            assertNotNull("Each monster should have a name", monster.name);
            assertTrue("Each monster's rarity should be between 0 and 4", monster.rare >= 0 && monster.rare <= 4);
        }
    }

    @Test public void testToString() {
        Player player = new Player();
        String playerString = player.toString();
        assertNotNull("Player toString should not be null", playerString);
        assertTrue("Player toString should contain 'Deck:user'", playerString.contains("Deck:user"));
        
        for (Monster monster : player.Deck) {
            String monsterInfo = monster.name + ":レア度[" + monster.rare + "]";
            assertTrue("Player toString should contain " + monsterInfo, playerString.contains(monsterInfo));
        }
    }
}
