package com.nhlstenden.lightning;

public class RgbLightning extends Lightning
{
    public RgbLightning(LightningLength lightningLength)
    {
        super(lightningLength);
    }

    @Override
    public String turnOn()
    {
        return "I'm giving a little bit more color in your life.";
    }

    @Override
    public double getPrice()
    {
        return 8.0 + (0.05 * this.length.lengthInCentimeters());
    }

    @Override
    public String getProductInformation()
    {
        return "RGB lightning.";
    }
}
