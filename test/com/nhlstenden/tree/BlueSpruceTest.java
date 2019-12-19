package com.nhlstenden.tree;

import com.nhlstenden.lightning.LightningLength;
import com.nhlstenden.lightning.RgbLightning;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BlueSpruceTest
{
    private BlueSpruce blueSpruce;

    @BeforeEach
    void beforeEach()
    {
        this.blueSpruce = new BlueSpruce(100);
    }

    @Test
    void getPriceDecoratedTree_shouldReturn183Euro()
    {
        RgbLightning rgbLightning = new RgbLightning(LightningLength.LENGTH_30_METER);
        this.blueSpruce.setLightning(rgbLightning);

        assertEquals(183.0, blueSpruce.getPrice());
    }

    @Test
    void getDefaultPrice_shouldReturn25Euro()
    {
        assertEquals(25.0, this.blueSpruce.getPrice());
    }

    @Test
    void getProductInformation_shouldReturnCorrectString()
    {
        assertEquals("A nice Blue spruce!", this.blueSpruce.getProductInformation());
    }
}