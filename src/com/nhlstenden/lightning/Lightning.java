package com.nhlstenden.lightning;

import com.nhlstenden.PriceLabel;

public abstract class Lightning implements PriceLabel
{
    /**
     * The predefined length.
     */
    protected LightningLength length;

    /**
     * Create new lightning.
     * @param lightningLength The predefined length.
     */
    public Lightning(LightningLength lightningLength)
    {
        this.length = lightningLength;
    }

    /**
     * Turn on those Christmas lights!
     * @return The result when turning on the lights.
     */
    public abstract String turnOn();
}
