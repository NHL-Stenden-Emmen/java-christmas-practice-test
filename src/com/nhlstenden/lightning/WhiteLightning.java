package com.nhlstenden.lightning;

public class WhiteLightning extends Lightning
{
    public WhiteLightning(LightningLength lightningLength)
    {
        super(lightningLength);
    }

    @Override
    public void turnOn()
    {
        for (LED led : this.leds)
        {
            led.setRedOn(true);
            led.setGreenOn(true);
            led.setBlueOn(true);
        }
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
