package com.nhlstenden.ball;

import com.nhlstenden.exception.ChristmasBallToBigException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChristmasBallTest
{
    @Test
    void createSmallChristmasBall_ballShouldBeMade()
    {
        assertDoesNotThrow(() -> new ChristmasBall(Color.RED, 30.0));
    }

    @Test
    void createToBigChristmasBall_ballShouldThrowException()
    {
        assertThrows(ChristmasBallToBigException.class, () -> new ChristmasBall(Color.RED, 30.1));
    }

    @Test
    void getDiameter_shouldReturn10() throws ChristmasBallToBigException
    {
        ChristmasBall christmasBall = new ChristmasBall(Color.RED, 10.0);
        assertEquals(10.0, christmasBall.getDiameter());
    }

    @Test
    void getColor_shouldReturnBlue() throws ChristmasBallToBigException
    {
        ChristmasBall christmasBall = new ChristmasBall(Color.BLUE, 10.0);
        assertEquals(Color.BLUE, christmasBall.getColor());
    }

    @Test
    void getPriceBlue_shouldReturn1Euro() throws ChristmasBallToBigException
    {
        ChristmasBall christmasBall = new ChristmasBall(Color.BLUE, 10.0);
        assertEquals(1.0, christmasBall.getPrice());
    }

    @Test
    void getPriceRed_shouldReturn1Euro10Cents() throws ChristmasBallToBigException
    {
        ChristmasBall christmasBall = new ChristmasBall(Color.RED, 10.0);
        assertEquals(1.10, christmasBall.getPrice());
    }

    @Test
    void getPriceWhite_shouldReturn80Cents() throws ChristmasBallToBigException
    {
        ChristmasBall christmasBall = new ChristmasBall(Color.WHITE, 10.0);
        assertEquals(0.80, christmasBall.getPrice());
    }

    @Test
    void getPriceGold_shouldReturn1Euro50Cents() throws ChristmasBallToBigException
    {
        ChristmasBall christmasBall = new ChristmasBall(Color.GOLD, 10.0);
        assertEquals(1.50, christmasBall.getPrice());
    }

    @Test
    void getProductDescription_shouldReturnCorrectString() throws ChristmasBallToBigException
    {
        ChristmasBall christmasBall = new ChristmasBall(Color.GOLD, 10.0);
        assertEquals("Christmas Ball with color GOLD", christmasBall.getProductInformation());
    }
}