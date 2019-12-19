package com.nhlstenden.lightning;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WhiteLightningTest
{
    private WhiteLightning whiteLightning;

    @BeforeEach
    void beforeEach()
    {
        this.whiteLightning = new WhiteLightning(LightningLength.LENGTH_1_METER);
    }

    @Test
    void getPrice_shouldReturn8Euro()
    {
        assertEquals(8.0, this.whiteLightning.getPrice());
    }

    @Test
    void getProductInformation_shouldReturnCorrectString()
    {
        assertEquals("White lightning.", this.whiteLightning.getProductInformation());
    }
}