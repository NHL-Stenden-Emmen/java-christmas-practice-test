package com.nhlstenden.lightning;

public class RgbWithApp extends Lightning
{
    public RgbWithApp(LightningLength lightningLength)
    {
        super(lightningLength);
    }

    @Override
    public String turnOn()
    {
        return "I'm completely future proof!";
    }

    @Override
    public double getPrice()
    {
        return 95.0 + (0.60 * this.length.lengthInCentimeters());
    }

    @Override
    public String getProductInformation()
    {
        return "Lightning with an app from Twinkly!";
    }
}
