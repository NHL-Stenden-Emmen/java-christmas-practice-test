package com.nhlstenden;

import com.nhlstenden.tree.FakePlastic;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntratuinTest
{
    private Intratuin intratuin;

    @BeforeEach
    void beforeEach()
    {
        this.intratuin = new Intratuin();
    }

    @Test
    void addProduct_shouldHaveOneProduct()
    {
        FakePlastic fakePlastic = new FakePlastic(1);
        this.intratuin.addProduct(fakePlastic);

        assertEquals(1, this.intratuin.getProducts().size());
    }
}