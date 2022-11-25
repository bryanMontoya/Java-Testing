package co.com.proteccion.player;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PlayerTest {

    @Test
    public void losesRollNumTooLow() {
        //Dice dice = new Dice(6);
        //Se simula el dado
        Dice dice = Mockito.mock(Dice.class);
        Mockito.when(dice.roll()).thenReturn(2);

        Player player = new Player(dice, 3);

        assertFalse(player.play());
    }

    @Test
    public void win() {
        Dice dice = Mockito.mock(Dice.class);
        Mockito.when(dice.roll()).thenReturn(4);

        Player player = new Player(dice, 3);

        assertTrue(player.play());
    }
}