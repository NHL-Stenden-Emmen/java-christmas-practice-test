package com.nhlstenden.lightning;

public class RgbLightningFlickering extends Lightning
{
    public RgbLightningFlickering(LightningLength lightningLength)
    {
        super(lightningLength);
    }

    @Override
    public String turnOn()
    {
        return "I'm ready to have a little party.";
    }

    @Override
    public double getPrice()
    {
        return 9.50 + (0.08 * this.length.lengthInCentimeters());
    }

    @Override
    public String getProductInformation()
    {
        return "RGB flicking lights.";
    }
}
