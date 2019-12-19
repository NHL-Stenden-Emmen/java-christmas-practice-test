package com.nhlstenden.tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NordmannTest
{
    private Nordmann nordmann;

    @BeforeEach
    void beforeEach()
    {
        this.nordmann = new Nordmann(1);
    }

    @Test
    void getDefaultPrice_shouldReturn30Euro()
    {
        assertEquals(30.0, this.nordmann.getPrice());
    }

    @Test
    void getProductInformation_shouldReturnCorrectString()
    {
        assertEquals("A real Nordmann!", this.nordmann.getProductInformation());
    }
}