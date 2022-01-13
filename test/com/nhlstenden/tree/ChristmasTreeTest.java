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
}