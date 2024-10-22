package ADVANCED.Exercises4.ExerciseCombine1;
// Date sınıfı bildirimi.
public class Date {
    private int month; // 1-12
    private int day;   // ay bazında 1-31
    private int year;  // herhangi bir yıl
    private static final int[] daysPerMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};  // her ayın gün sayısı

    // kurucu: doğru ay değerini doğrulamak için checkMonth çağrılır;
    // doğru gün değerini doğrulamak için checkDay çağrılır
    public Date(int theMonth, int theDay, int theYear) {
        month = checkMonth(theMonth); // ayı doğrula
        year = theYear;               // yılı doğrula (isteğe bağlı)
        day = checkDay(theDay);       // günü doğrula
        System.out.printf("Date nesne kurucusu şu tarih için oluşturuldu: %s\n", this);
    } // Date kurucu sonu

    // doğru ay değerini doğrulamak için yardımcı metot
    private int checkMonth(int testMonth) {
        if (testMonth > 0 && testMonth <= 12) // ayı doğrula
            return testMonth;
        else // ay geçersizse
            throw new IllegalArgumentException("Ay 1-12 aralığında olmalıdır.");
    } // checkMonth metodu sonu

    // ay ve yıla bağlı olarak doğru gün değerini doğrulamak için yardımcı metot
    private int checkDay(int testDay) {
        // günün ay aralığında olup olmadığını kontrol et
        if (testDay > 0 && testDay <= daysPerMonth[month]) return testDay;

        // artık yıl kontrolü
        if (month == 2 && testDay == 29 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) return testDay;

        throw new IllegalArgumentException("Belirtilen ay ve yıl için gün geçersiz.");
    } // checkDay metodu sonu
    // ay/gün/yıl formatında String döndür
    public String toString() {
        return String.format("%d/%d/%d", month, day, year);
    } // toString metodu sonu
} // Date sınıfı sonu
/*
Date nesne kurucusu şu tarih için oluşturuldu: 7/24/1949
Date nesne kurucusu şu tarih için oluşturuldu: 3/12/1988
Blue, Bob Hired: 3/12/1988 Birthday: 7/24/1949
+---------------------------------------------------+
|                      Date                        |
+---------------------------------------------------+
| - month: int                                      |
| - day: int                                        |
| - year: int                                       |
| - daysPerMonth: static final int[]                |
+---------------------------------------------------+
| + Date(theMonth: int, theDay: int, theYear: int)  |
| + checkMonth(testMonth: int): int                 |
| + checkDay(testDay: int): int                     |
| + toString(): String                              |
+---------------------------------------------------+

 */