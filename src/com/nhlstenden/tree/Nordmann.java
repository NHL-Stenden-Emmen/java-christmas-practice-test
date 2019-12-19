package com.nhlstenden.tree;

public class Nordmann extends ChristmasTree
{
    public Nordmann(int height)
    {
        super(height);
    }

    @Override
    public double getPrice()
    {
        return 30.0 + this.getDecorationPrice();
    }

    @Override
    public String getProductInformation()
    {
        return "A real Nordmann!";
    }
}
