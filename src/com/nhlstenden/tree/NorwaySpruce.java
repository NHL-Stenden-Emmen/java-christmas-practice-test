package com.nhlstenden.tree;

public class NorwaySpruce extends ChristmasTree
{
    public NorwaySpruce(int height)
    {
        super(height);
    }

    @Override
    public double getPrice()
    {
        return 20.0 + this.getDecorationPrice();
    }

    @Override
    public String getProductInformation()
    {
        return "A Norway spruce!";
    }
}
