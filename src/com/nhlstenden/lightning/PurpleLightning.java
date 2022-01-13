package com.nhlstenden.lightning;

public class PurpleLightning extends Lightning
{
    public PurpleLightning(LightningLength lightningLength)
    {
        super(lightningLength);
    }

    @Override
    public void turnOn()
    {
        for (LED led : this.leds)
        {
            led.setRedOn(true);
            led.setBlueOn(true);
        }
    }

    @Override
    public double getPrice()
    {
        return 9.50 + (0.08 * this.length.lengthInCentimeters());
    }

    @Override
    public String getProductInformation()
    {
        return "Purple lightning";
    }
}
