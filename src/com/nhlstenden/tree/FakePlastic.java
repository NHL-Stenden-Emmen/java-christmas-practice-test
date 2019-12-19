package com.nhlstenden.tree;

public class FakePlastic extends ChristmasTree
{
    public FakePlastic(int height)
    {
        super(height);
    }

    @Override
    public double getPrice()
    {
        return 10.0 + this.getDecorationPrice();
    }

    @Override
    public String getProductInformation()
    {
        return "A fake one, ugh.";
    }
}
