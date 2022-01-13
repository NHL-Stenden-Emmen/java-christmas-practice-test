package com.nhlstenden.lightning;

import com.nhlstenden.PriceLabel;

import java.util.ArrayList;

public abstract class Lightning implements PriceLabel
{
    /**
     * The predefined length.
     */
    protected LightningLength length;

    /**
     * All the LEDS on the string.
     */
    protected ArrayList<LED> leds;

    /**
     * Create new lightning.
     * @param lightningLength The predefined length.
     */
    public Lightning(LightningLength lightningLength)
    {
        this.length = lightningLength;
        this.leds = new ArrayList<>();

        // cm to meters, 10 leds per meter
        int amountOfLeds = this.length.lengthInCentimeters() / 100 * 10;
        for (int i = 0; i < amountOfLeds; i++)
        {
            this.leds.add(new LED());
        }
    }

    /**
     * Turn on those Christmas lights!
     */
    public abstract void turnOn();
}
