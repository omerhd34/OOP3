package ADVANCED.Exercises4;

// Math sınıfı metotlarının statik olarak içe aktarımı.
import static java.lang.Math.*;

public class StaticImportTest {
    public static void main(String[] args) {
        System.out.printf("sqrt( 900.0 ) = %.1f\n", sqrt(900.0)); // karekök
        System.out.printf("ceil( -9.8 ) = %.1f\n", ceil(-9.8));   // yukarı yuvarla
        System.out.printf("E = %f\n", E);                          // doğal logaritmanın tabanı
        System.out.printf("PI = %f\n", PI);                        // pi sabiti
    } // main metodunun sonu
} // StaticImportTest sınıfının sonu
/*
sqrt( 900.0 ) = 30,0
ceil( -9.8 ) = -9,0
E = 2,718282
PI = 3,141593
*/
