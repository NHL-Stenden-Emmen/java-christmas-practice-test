package com.nhlstenden.lightning;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RgbWithAppTest
{
    private RgbWithApp rgbWithApp;

    @BeforeEach
    void beforeEach()
    {
        this.rgbWithApp = new RgbWithApp(LightningLength.LENGTH_10_METER);
    }

    @Test
    void turnOn_shouldReturnCorrectString()
    {
        assertEquals("I'm completely future proof!", this.rgbWithApp.turnOn());
    }

    @Test
    void getPrice_shouldReturn695Euro()
    {
        assertEquals(695.0, this.rgbWithApp.getPrice());
    }

    @Test
    void getProductInformation_shouldReturnCorrectString()
    {
        assertEquals("Lightning with an app from Twinkly!", this.rgbWithApp.getProductInformation());
    }
}