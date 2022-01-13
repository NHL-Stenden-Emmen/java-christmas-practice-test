package com.nhlstenden.lightning;

public class LED
{
    private boolean redOn;
    private boolean greenOn;
    private boolean blueOn;

    public LED()
    {
        this.redOn = false;
        this.greenOn = false;
        this.blueOn = false;
    }

    // Getters & Setters

    public boolean isRedOn()
    {
        return this.redOn;
    }

    public void setRedOn(boolean redOn)
    {
        this.redOn = redOn;
    }

    public boolean isGreenOn()
    {
        return this.greenOn;
    }

    public void setGreenOn(boolean greenOn)
    {
        this.greenOn = greenOn;
    }

    public boolean isBlueOn()
    {
        return this.blueOn;
    }

    public void setBlueOn(boolean blueOn)
    {
        this.blueOn = blueOn;
    }

    // Custom Methods

    public void turnOff()
    {
        this.redOn = false;
        this.greenOn = false;
        this.blueOn = false;
    }
}
