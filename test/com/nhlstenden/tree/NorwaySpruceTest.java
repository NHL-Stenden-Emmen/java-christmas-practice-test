package com.nhlstenden.tree;

import com.nhlstenden.ball.ChristmasBall;
import com.nhlstenden.ball.Color;
import com.nhlstenden.exception.ChristmasBallToBigException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NorwaySpruceTest
{
    private NorwaySpruce norwaySpruce;

    @BeforeEach
    void beforeEach()
    {
        this.norwaySpruce = new NorwaySpruce(100);
    }

    @Test
    void getDecoratedTreePrice_shouldReturn21Euro() throws ChristmasBallToBigException
    {
        ChristmasBall christmasBall = new ChristmasBall(Color.BLUE, 20.0);
        norwaySpruce.addBall(christmasBall);

        assertEquals(21.0, this.norwaySpruce.getPrice());
    }

    @Test
    void getDefaultPrice_shouldReturn20Euro()
    {
        assertEquals(20.0, this.norwaySpruce.getPrice());
    }

    @Test
    void getProductInformation_shouldReturnCorrectString()
    {
        assertEquals("A Norway spruce!", this.norwaySpruce.getProductInformation());
    }
}