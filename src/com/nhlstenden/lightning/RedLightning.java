package com.nhlstenden.lightning;

public class RedLightning extends Lightning
{
    public RedLightning(LightningLength lightningLength)
    {
        super(lightningLength);
    }

    @Override
    public void turnOn()
    {
        for (LED led : this.leds)
        {
            led.setRedOn(true);
        }
    }

    @Override
    public double getPrice()
    {
        return 8.0 + (0.05 * this.length.lengthInCentimeters());
    }

    @Override
    public String getProductInformation()
    {
        return "Red lightning";
    }
}
