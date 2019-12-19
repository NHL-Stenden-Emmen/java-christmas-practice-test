package com.nhlstenden.lightning;

public class WhiteLightning extends Lightning
{
    public WhiteLightning(LightningLength lightningLength)
    {
        super(lightningLength);
    }

    @Override
    public String turnOn()
    {
        return "I'm just shining boring white.";
    }

    @Override
    public double getPrice()
    {
        return 5.0 + (0.03 * this.length.lengthInCentimeters());
    }

    @Override
    public String getProductInformation()
    {
        return "White lightning.";
    }
}
