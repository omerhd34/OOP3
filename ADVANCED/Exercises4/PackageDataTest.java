package ADVANCED.Exercises4;

// Package-access members of a class are accessible by other classes
// in the same package.
public class PackageDataTest {
    public static void main(String[] args) {
        PackageData packageData = new PackageData(); // PackageData nesnesi oluştur

        // packageData'nın String temsilini ekrana yazdır
        System.out.printf("After instantiation:\n%s\n", packageData);

        // packageData nesnesindeki package-access verilerini değiştir
        packageData.number = 77;
        packageData.string = "Goodbye";

        // packageData'nın güncellenmiş String temsilini ekrana yazdır
        System.out.printf("\nAfter changing values:\n%s\n", packageData);
    } // main metodu sonu
} // class PackageDataTest sonu

// package-access üye değişkenleri olan bir sınıf
class PackageData {
    int number; // package-access instance variable
    String string; // package-access instance variable

    // Yapıcı (Constructor)
    public PackageData() {
        number = 0;
        string = "Hello";
    } // PackageData constructor sonu

    // PackageData nesnesinin String temsilini döndür
    public String toString() {
        return String.format("number: %d; string: %s", number, string);
    } // toString metodu sonu
} // class PackageData sonu
/*
After instantiation:
number: 0; string: Hello

After changing values:
number: 77; string: Goodbye

+---------------------+
|     PackageData      |
+---------------------+
| - number: int        |
| - string: String     |
+---------------------+
| +PackageData()       |
| +toString(): String  |
+---------------------+

 */