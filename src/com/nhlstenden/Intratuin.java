package com.nhlstenden;

import com.nhlstenden.tree.ChristmasTree;

import java.util.ArrayList;

/**
 * This class is the most upper class. It hold all the products.
 */
public class Intratuin
{
    /**
     * All the products of the Intratuin.
     */
    private ArrayList<PriceLabel> products;

    public Intratuin()
    {
        this.products = new ArrayList<>();
    }

    /**
     * Add a new product to the Intratuin.
     * @param priceLabel The product to add.
     */
    public void addProduct(PriceLabel priceLabel)
    {
        this.products.add(priceLabel);
    }

    /**
     * Return all the products in Intratuin.
     * @return A list with all the products.
     */
    public ArrayList<PriceLabel> getProducts()
    {
        return this.products;
    }

    /**
     * Prints out all the product labels.
     */
    public void printAllProductDescriptions()
    {
        for (PriceLabel priceLabel : this.products)
        {
            System.out.println(priceLabel);
            System.out.println("Price " + priceLabel.getPrice());
        }
    }

    /**
     * Light up the Intratuin!
     */
    public void turnOnAllChristmasTrees()
    {
        for (ChristmasTree christmasTree : this.getChristmasTrees())
        {
            System.out.println(christmasTree.turnOnLightning());
        }
    }

    /**
     * Get a list of all the Christmas trees.
     * @return A list with only ChristmasTree objects.
     */
    private ArrayList<ChristmasTree> getChristmasTrees()
    {
        ArrayList<ChristmasTree> christmasTrees = new ArrayList<>();

        // Loop through the products
        for (PriceLabel priceLabel : this.products)
        {
            // Check if it is a Christmas tree
            if (priceLabel instanceof ChristmasTree)
            {
                // Add it to the list. You should cast it first
                // See https://stackoverflow.com/a/4186354/3178126
                christmasTrees.add((ChristmasTree) priceLabel);
            }
        }

        return christmasTrees;
    }
}
