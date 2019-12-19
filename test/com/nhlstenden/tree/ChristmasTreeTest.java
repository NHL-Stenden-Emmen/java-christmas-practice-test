package com.nhlstenden.tree;

import com.nhlstenden.lightning.LightningLength;
import com.nhlstenden.lightning.WhiteLightning;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChristmasTreeTest
{
    private FakePlastic fakePlastic;

    @BeforeEach
    void beforeEach()
    {
        this.fakePlastic = new FakePlastic(10);
    }

    @Test
    void getHeight_shouldReturn10()
    {
        assertEquals(10, this.fakePlastic.getHeight());
    }

    @Test
    void turnOnLights_shouldReturnCorrectString()
    {
        WhiteLightning whiteLightning = new WhiteLightning(LightningLength.LENGTH_1_METER);
        this.fakePlastic.setLightning(whiteLightning);
        assertEquals("I'm just shining boring white.", this.fakePlastic.turnOnLightning());
    }

    @Test
    void turnOnLights_shouldReturnNoLightningString()
    {
        assertEquals("I have no lightning :(", this.fakePlastic.turnOnLightning());
    }
}