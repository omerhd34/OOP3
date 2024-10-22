package ADVANCED.Exercises4.ExerciseCompine3;

// Time2 nesnelerini başlatmak için aşırı yüklenmiş kurucular kullanılır.
public class Time2Test {
    public static void main(String[] args) {
        // Time2 nesneleri oluştur ve başlat
        Time2 t1 = new Time2();                // 00:00:00
        Time2 t2 = new Time2(2);               // 02:00:00
        Time2 t3 = new Time2(21, 34);          // 21:34:00
        Time2 t4 = new Time2(12, 25, 42);      // 12:25:42
        Time2 t5 = new Time2(t4);              // 12:25:42

        System.out.println("Kurucu ile oluşturuldu:");
        System.out.println("t1: tüm argümanlar varsayılan");
        System.out.printf("   %s\n", t1.toUniversalString());
        System.out.printf("   %s\n", t1.toString());

        System.out.println("t2: saat belirtildi; dakika ve saniye varsayılan");
        System.out.printf("   %s\n", t2.toUniversalString());
        System.out.printf("   %s\n", t2.toString());

        System.out.println("t3: saat ve dakika belirtildi; saniye varsayılan");
        System.out.printf("   %s\n", t3.toUniversalString());
        System.out.printf("   %s\n", t3.toString());

        System.out.println("t4: saat, dakika ve saniye belirtildi");
        System.out.printf("   %s\n", t4.toUniversalString());
        System.out.printf("   %s\n", t4.toString());

        System.out.println("t5: Time2 nesnesi t4 belirtildi");
        System.out.printf("   %s\n", t5.toUniversalString());
        System.out.printf("   %s\n", t5.toString());

        // geçersiz değerlerle t6 başlatmayı dene
        try {
            Time2 t6 = new Time2(27, 74, 99); // geçersiz değerler
        } catch (IllegalArgumentException e) {
            System.out.printf("\nt6 başlatılırken bir istisna oluştu: %s\n", e.getMessage());
        }
    } // main metodu sonu
} // Time2Test sınıfı sonu

/*
Kurucu ile oluşturuldu:
t1: tüm argümanlar varsayılan
   00:00:00
   12:00:00 AM
t2: saat belirtildi; dakika ve saniye varsayılan
   02:00:00
   2:00:00 AM
t3: saat ve dakika belirtildi; saniye varsayılan
   21:34:00
   9:34:00 PM
t4: saat, dakika ve saniye belirtildi
   12:25:42
   12:25:42 PM
t5: Time2 nesnesi t4 belirtildi
   12:25:42
   12:25:42 PM

t6 başlatılırken bir istisna oluştu: hour must be 0-23
+---------------------------------------------------+
|                    Time2Test                      |
+---------------------------------------------------+
| + main(args: String[]): void                      |
+---------------------------------------------------+
| - t1: Time2                                       |
| - t2: Time2                                       |
| - t3: Time2                                       |
| - t4: Time2                                       |
| - t5: Time2                                       |
| - t6: Time2 (try-catch içinde oluşturuluyor)      |
+---------------------------------------------------+
 */