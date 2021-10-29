# Case Intratuin

It’s the time of the year again: Christmas! And of course, you can not celebrate Christmas without a nice decorated 
Christmas tree. The Intratuin sells a lot of Christmas trees and articles. You are going to keep track of all their 
products, including decorated show model Christmas trees that are in the showroom of Intratuin.

There are three different types of Christmas trees: Norway spruce, Nordmann and the fake plastic one. Every tree has a 
different height and different price.

Every tree can be decorated with a different type of light string. One tree can have only one type of light string. 
Lights are available in predefined lengths: 1m, 5m, 10m, 30m. There are different types of lights available. These types 
are white, red and purple with a mobile app. The different types behave differently. All the strings consists of RGB 
LEDs. In every string fits 10 LEDs in 1 meter. A LED consists of a red, green and blue diode. If a diode is turned on 
it is marked as true, false otherwise. When the white string is turned on all the diode are turned on. For the red 
string al the red diodes, and for the purple one all the red and blue ones.

A Christmas tree also has Christmas balls. A ball has a diameter (in cm), a certain color and a price. The diameter is 
variable. When the ball is created the diameter should be provided. When a diameter bigger than 30cm is provided it 
should throw an exception: `ChristmasBallTooBigException`. The balls are available in predefined colors: blue, red, gold 
and white.

Every product (tree, lights and balls) should have a price label. This is **mandatory**! The price label should return the 
price and a label containing the product information. You should use the prices as found in Table 1. Don’t forget that 
if a Christmas tree is decorated, the price of the decoration should be included in the price of the tree.

|Product Group|Type|Price|
|-------------|----|-----|
|Christmas Tree|Nordway Spruce|&euro; 20,-|
|Christmas Tree|Nordmann|&euro; 30,-|
|Christmas Tree|Fake Plastic|&euro; 10,-|
|Christmas Lights|White|&euro; 5 + 0,03 * length in cm|
|Christmas Lights|White|&euro; 8 + 0,05 * length in cm|
|Christmas Lights|White|&euro; 9,50 + 0,08 * length in cm|
|Christmas Ball|Blue|&euro; 1,-|
|Christmas Ball|Red|&euro; 1,10|
|Christmas Ball|Gold|&euro; 1,50|
|Christmas Ball|White|&euro; 0,80|

> :warning: Remark! Make sure only the class Intratuin is responsible for printing.