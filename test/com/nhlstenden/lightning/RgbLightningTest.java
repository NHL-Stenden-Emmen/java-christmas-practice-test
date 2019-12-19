package com.nhlstenden.lightning;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RgbLightningTest
{
    private RgbLightning rgbLightning1Meter;

    @BeforeEach
    void beforeEach()
    {
        this.rgbLightning1Meter = new RgbLightning(LightningLength.LENGTH_1_METER);
    }

    @Test
    void turnOn_shouldReturnCorrectString()
    {
        assertEquals("I'm giving a little bit more color in your life.", this.rgbLightning1Meter.turnOn());
    }

    @Test
    void getPriceFor1Meter_shouldReturn13Euro()
    {
        assertEquals(13.0, this.rgbLightning1Meter.getPrice());
    }

    @Test
    void getPriceFor30Meter_shouldReturn158Euros()
    {
        RgbLightning rgbLightning = new RgbLightning(LightningLength.LENGTH_30_METER);
        assertEquals(158.0, rgbLightning.getPrice());
    }

    @Test
    void getProductInformation_shouldReturnCorrectString()
    {
        assertEquals("RGB lightning.", this.rgbLightning1Meter.getProductInformation());
    }
}