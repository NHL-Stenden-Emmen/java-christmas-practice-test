package com.nhlstenden.tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FakePlasticTest
{
    private FakePlastic fakePlastic;

    @BeforeEach
    void beforeEach()
    {
        this.fakePlastic = new FakePlastic(1);
    }

    @Test
    void getPrice_shouldReturn10Euro()
    {
        assertEquals(10.0, this.fakePlastic.getPrice());
    }

    @Test
    void getProductInformation_shouldReturnCorrectString()
    {
        assertEquals("A fake one, ugh.", this.fakePlastic.getProductInformation());
    }
}