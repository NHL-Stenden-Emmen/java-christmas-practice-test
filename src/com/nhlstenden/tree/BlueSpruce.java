package com.nhlstenden.tree;

public class BlueSpruce extends ChristmasTree
{
    public BlueSpruce(int height)
    {
        super(height);
    }

    @Override
    public double getPrice()
    {
        return 25.0 + this.getDecorationPrice();
    }

    @Override
    public String getProductInformation()
    {
        return "A nice Blue spruce!";
    }
}
