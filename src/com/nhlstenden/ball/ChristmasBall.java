package com.nhlstenden.ball;

import com.nhlstenden.PriceLabel;
import com.nhlstenden.exception.ChristmasBallToBigException;

public class ChristmasBall implements PriceLabel
{
    /**
     * The color of the ball.
     */
    private Color color;

    /**
     * The diameter of the ball in centimeters.
     */
    private double diameter;

    /**
     * Make a new Christmas ball.
     * @param color The color of the ball.
     * @param diameter The diameter of the ball. <= 30.0
     * @throws ChristmasBallToBigException when the ball is to big!
     */
    public ChristmasBall(Color color, double diameter) throws ChristmasBallToBigException
    {
        if (diameter > 30.0)
        {
            throw new ChristmasBallToBigException();
        }

        this.color = color;
        this.diameter = diameter;
    }

    /**
     * Get the color of the ball.
     * @return The color of the ball.
     */
    public Color getColor()
    {
        return color;
    }

    /**
     * Get the diameter of the ball.
     * @return The diameter in cm.
     */
    public double getDiameter()
    {
        return this.diameter;
    }

    @Override
    public double getPrice()
    {
        switch (this.color)
        {
            case RED:
                return 1.10;
            case BLUE:
                return 1.0;
            case GOLD:
                return 1.50;
            case WHITE:
                return 0.80;
        }

        return 0.0;
    }

    @Override
    public String getProductInformation()
    {
        return "Christmas Ball with color " + this.color;
    }
}
