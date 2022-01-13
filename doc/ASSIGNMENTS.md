# Case Intratuin

## Assignment 1
Make the classes for the Christmas trees, Christmas lights and Christmas balls. Also implement the functionality to 
turn on the Christmas lights within a Christmas tree.

## Assignment 2
Make the Intratuin class. This class should hold all the products that have a price tag.

## Assignment 3
Make a method in Intratuin that returns all the information of products in the store: their price and information about the product.

If you would print it, it should be formatted like this:

```text
---- Intratuin Stock ----
{Description} - {Price}
```

The following is an example of how it could look like:

```text
---- Intratuin Stock ----
White Christmas Lights (5m) - €20
Nordmann - €30
Nordway Spruce (with Red Christmas Lights (3m)) - €63
```

## Assignment 4
Every morning an employee has to turn on all the Christmas trees to attract customers to the store. Make a method in 
Intratuin that turns on all the Christmas trees.

## Assignment 5
At some day one of the Christmas balls suppliers provides the Intratuin with Christmas balls that are way to big. 
To prevent that these balls are being registered within the application, an exception should be thrown when a Christmas 
ball has a bigger diameter than 30 centimeters.

1.	Make a `ChristmasBallToBigException` and prevent that balls bigger dan 30 centimeters are being created.
2.	Make a Unit test for the Christmas ball to test the exception.