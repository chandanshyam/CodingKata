package ChristmasLightsTest_Kata;

import ChristmasLights_Kata.Decoration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


public class LightsTest {

    Decoration decor;
    @BeforeEach
            public void setUp() {
    decor   = new Decoration();
    }


    @Test
    public void turnOnLights()
    {
        assertEquals(true,decor.turnOnLight(887, 9, 959, 629));
        assertEquals(0,decor.lightsGrid[886][9]);
    }

    @Test
    public void turnOffLights()
    {
        assertEquals(true, decor.turnOffLights(539,243,559,943));
        assertEquals(0,decor.lightsGrid[559][943]);
    }

    @Test
    public void toggleLights(){

        assertEquals(true, decor.toggleLights(720,196,897,994));
        assertEquals(true, decor.toggleLights(831,394,904,480));

        assertEquals(2, decor.lightsGrid[720][196]);
        assertNotEquals(2,decor.lightsGrid[719][196]);
    }



}
