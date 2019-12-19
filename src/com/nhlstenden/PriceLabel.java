package com.nhlstenden;

/**
 * The PriceLabel interface defines everything that is needed for making a price label.
 */
public interface PriceLabel
{
    /**
     * The price of the product.
     * @return The price in euros.
     */
    double getPrice();

    /**
     * Get the product information.
     * @return The information of the product.
     */
    String getProductInformation();
}
