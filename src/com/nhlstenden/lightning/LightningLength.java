package com.nhlstenden.lightning;

/**
 * Predefined lengths for the Christmas lightning.
 */
public enum LightningLength
{
    LENGTH_1_METER,
    LENGTH_5_METER,
    LENGTH_10_METER,
    LENGTH_30_METER;

    /**
     * Get the length.
     *
     * @return Length in centimeters.
     */
    public int lengthInCentimeters()
    {
        switch (this)
        {
            case LENGTH_1_METER:
                return 100;
            case LENGTH_5_METER:
                return 500;
            case LENGTH_10_METER:
                return 1000;
            case LENGTH_30_METER:
                return 3000;
        }

        // Default value
        return 0;
    }
}
