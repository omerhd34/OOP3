/* (Rectangle Class) Create a class Rectangle with attributes length and width, each of which defaults to 1. Provide methods that calculate the rectangle’s perimeter and area. It has
set and get methods for both length and width. The set methods should verify that length and width are each floating-point numbers larger than 0.0 and less than 20.0. Write a program to
test class Rectangle.
(Rectangle Sınıfı) Uzunluk ve genişlik niteliklerine sahip bir Rectangle sınıfı oluşturun; her birinin varsayılan değeri 1'dir. Dikdörtgenin çevresini ve alanını hesaplayan yöntemler
sağlayın. Hem uzunluk hem de genişlik için set ve get yöntemleri vardır. Set yöntemleri, uzunluk ve genişliğin her birinin 0,0'dan büyük ve 20,0'dan küçük kayan nokta sayıları olduğunu
doğrulamalıdır. Rectangle sınıfını test etmek için bir program yazın.
 */

package ADVANCED.Exercises4.Exercises.ExerciseCombine1;

public class Rectangle {
    // Private attributes
    private double length;
    private double width;

    // Default constructor, initializes length and width to 1
    public Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
    }

    // Constructor with parameters
    public Rectangle(double length, double width) {
        setLength(length); // use setter for validation
        setWidth(width);   // use setter for validation
    }

    // Set method for length with validation
    public void setLength(double length) {
        if (length > 0.0 && length < 20.0) {
            this.length = length;
        } else {
            throw new IllegalArgumentException("Length must be between 0.0 and 20.0");
        }
    }

    // Set method for width with validation
    public void setWidth(double width) {
        if (width > 0.0 && width < 20.0) {
            this.width = width;
        } else {
            throw new IllegalArgumentException("Width must be between 0.0 and 20.0");
        }
    }

    // Get method for length
    public double getLength() {
        return this.length;
    }

    // Get method for width
    public double getWidth() {
        return this.width;
    }

    // Method to calculate perimeter
    public double getPerimeter() {
        return 2 * (length + width);
    }

    // Method to calculate area
    public double getArea() {
        return length * width;
    }
}
/*
Rectangle 1 - Length: 1,00, Width: 1,00, Perimeter: 4,00, Area: 1,00
Rectangle 2 - Length: 10,50, Width: 5,30, Perimeter: 31,60, Area: 55,65
Rectangle 2 (Modified) - Length: 15,00, Width: 7,50, Perimeter: 45,00, Area: 112,50
Exception caught: Length must be between 0.0 and 20.0

+---------------------------------+
|           Rectangle             |
+---------------------------------+
| - length: double                |
| - width: double                 |
+---------------------------------+
| + Rectangle()                   |
| + Rectangle(length: double,     |
|   width: double)                |
| + setLength(length: double): void|
| + setWidth(width: double): void  |
| + getLength(): double            |
| + getWidth(): double             |
| + getPerimeter(): double         |
| + getArea(): double              |
+---------------------------------+

 */