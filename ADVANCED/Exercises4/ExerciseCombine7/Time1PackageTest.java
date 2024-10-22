package ADVANCED.Exercises4.ExerciseCombine7;

public class Time1PackageTest {
    public static void main(String[] args) {
        // Bir Time1 nesnesi oluştur ve başlat
        Time1 time = new Time1();   // Time1 kurucusunu çağırır

        // Zamanın String gösterimlerini ekrana yazdır
        System.out.println("The initial universal time is: ");
        System.out.println(time.toUniversalString());
        System.out.println("The initial standard time is: ");
        System.out.println(time.toString());
        System.out.println(); // boş bir satır ekrana yazdır

        // Zamanı değiştir ve güncellenmiş zamanı ekrana yazdır
        time.setTime(13, 27, 6);
        System.out.println("Universal time after setTime is: ");
        System.out.println(time.toUniversalString());
        System.out.println("Standard time after setTime is: ");
        System.out.println(time.toString());
        System.out.println(); // boş bir satır ekrana yazdır

        // Geçersiz değerlerle zamanı ayarlamaya çalış
        try {
            time.setTime(99, 99, 99); // tüm değerler geçersiz
        } catch (IllegalArgumentException e) {
            System.out.printf("Exception: %s\n\n", e.getMessage());
        }

        // Geçersiz ayar girişiminden sonra zamanı ekrana yazdır
        System.out.println("After attempting invalid settings:");
        System.out.println("Universal time: ");
        System.out.println(time.toUniversalString());
        System.out.println("Standard time: ");
        System.out.println(time.toString());
    } // main metodunun sonu
} // Time1PackageTest sınıfının sonu

/*
The initial universal time is: 00:00:00
The initial standard time is: 12:00:00 AM

Universal time after setTime is: 13:27:06
Standard time after setTime is: 1:27:06 PM

Exception: hour, minute and/or second was out of range

After attempting invalid settings:
Universal time: 13:27:06
Standard time: 1:27:06 PM

+--------------------------------+
|            Time1               |
+--------------------------------+
| - hour: int                    |
| - minute: int                  |
| - second: int                  |
+--------------------------------+
| + setTime(h: int, m: int, s: int): void |
| + toUniversalString(): String   |
| + toString(): String            |
+--------------------------------+

 */