/* (Rectangle Class) Create a class Rectangle with attributes length and width, each of which defaults to 1. Provide methods that calculate the rectangle’s perimeter and area. It has
set and get methods for both length and width. The set methods should verify that length and width are each floating-point numbers larger than 0.0 and less than 20.0. Write a program to
test class Rectangle.
(Rectangle Sınıfı) Uzunluk ve genişlik niteliklerine sahip bir Rectangle sınıfı oluşturun; her birinin varsayılan değeri 1'dir. Dikdörtgenin çevresini ve alanını hesaplayan yöntemler
sağlayın. Hem uzunluk hem de genişlik için set ve get yöntemleri vardır. Set yöntemleri, uzunluk ve genişliğin her birinin 0,0'dan büyük ve 20,0'dan küçük kayan nokta sayıları olduğunu
doğrulamalıdır. Rectangle sınıfını test etmek için bir program yazın.
 */
package ADVANCED.Exercises4.Exercises.ExerciseCombine1;

public class RectangleTest {
    public static void main(String[] args) {
        // Create a Rectangle object with default values
        Rectangle rectangle1 = new Rectangle();
        System.out.printf("Rectangle 1 - Length: %.2f, Width: %.2f, Perimeter: %.2f, Area: %.2f%n", rectangle1.getLength(), rectangle1.getWidth(), rectangle1.getPerimeter(), rectangle1.getArea());

        // Create a Rectangle object with custom values
        Rectangle rectangle2 = new Rectangle(10.5, 5.3);
        System.out.printf("Rectangle 2 - Length: %.2f, Width: %.2f, Perimeter: %.2f, Area: %.2f%n", rectangle2.getLength(), rectangle2.getWidth(), rectangle2.getPerimeter(), rectangle2.getArea());

        // Modify the rectangle dimensions using setters
        rectangle2.setLength(15.0);
        rectangle2.setWidth(7.5);
        System.out.printf("Rectangle 2 (Modified) - Length: %.2f, Width: %.2f, Perimeter: %.2f, Area: %.2f%n", rectangle2.getLength(), rectangle2.getWidth(), rectangle2.getPerimeter(), rectangle2.getArea());

        // Testing exception by setting invalid dimensions
        try {
            rectangle2.setLength(21.0); // This should throw an exception
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
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