package com.nhlstenden.lightning;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RgbLightningFlickeringTest
{
    private RgbLightningFlickering rgbLightningFlickering;

    @BeforeEach
    void beforeEach()
    {
        this.rgbLightningFlickering = new RgbLightningFlickering(LightningLength.LENGTH_5_METER);
    }

    @Test
    void turnOn_shouldReturnCorrectString()
    {
        assertEquals("I'm ready to have a little party.", this.rgbLightningFlickering.turnOn());
    }

    @Test
    void getPriceFor5Meters_shouldReturn49Euro50Cents()
    {
        assertEquals(49.50, this.rgbLightningFlickering.getPrice());
    }

    @Test
    void getProductInformation_shouldReturnCorrectString()
    {
        assertEquals("RGB flicking lights.", this.rgbLightningFlickering.getProductInformation());
    }
}