package com.nhlstenden.tree;

import com.nhlstenden.PriceLabel;
import com.nhlstenden.ball.ChristmasBall;
import com.nhlstenden.lightning.Lightning;

import java.util.ArrayList;

public abstract class ChristmasTree implements PriceLabel
{
    /**
     * Height in meters.
     */
    private int height;

    /**
     * The lightning in the tree.
     */
    protected Lightning lightning;

    /**
     * Balls in the Christmas tree!
     */
    protected ArrayList<ChristmasBall> balls;

    /**
     * Create a new Christmas tree with a variable height.
     * @param height The height of the tree in meters.
     */
    public ChristmasTree(int height)
    {
        this.height = height;
        this.balls = new ArrayList<>();
    }

    /**
     * Get the height of the tree.
     * @return The height in meters.
     */
    public int getHeight()
    {
        return this.height;
    }

    /**
     * Set the lightning for the Christmas tree.
     * @param lightning The lightning to add to the tree.
     */
    public void setLightning(Lightning lightning)
    {
        this.lightning = lightning;
    }

    /**
     * Add a Christmas ball to the tree.
     * @param christmasBall A Christmas tree.
     */
    public void addBall(ChristmasBall christmasBall)
    {
        this.balls.add(christmasBall);
    }

    /**
     * Turn on the lightning on the Christmas tree.
     */
    public void turnOnLightning()
    {
        if (null == this.lightning)
        {
            return;
        }

        this.lightning.turnOn();
    }

    /**
     * Get the price of all the decoration in the tree.
     * @return The price in euros.
     */
    protected double getDecorationPrice()
    {
        double totalPrice = 0.0;

        // Check if there is lightning in the tree
        if (null != this.lightning)
        {
            // Add the lightning price to the total price
            totalPrice += this.lightning.getPrice();
        }

        // Loop through all the Christmas balls
        for (ChristmasBall ball : this.balls)
        {
            // Add the price of the ball to the total price
            totalPrice += ball.getPrice();
        }

        return totalPrice;
    }
}
