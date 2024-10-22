package ADVANCED.Exercises4.ExerciseCompine3;

// Overload edilmiş kurucularla Time2 sınıfı bildirimi.
public class Time2 {
    private int hour;   // 0 - 23
    private int minute; // 0 - 59
    private int second; // 0 - 59

    // Time2 no-argument constructor:
    // Her örnek değişkenini sıfıra başlatır
    public Time2() {
        this(0, 0, 0); // üç argümanlı Time2 kurucusunu çağır
    } // Time2 no-argument constructor sonu

    // Time2 kurucusu: yalnızca hour sağlanır, minute ve second varsayılan olarak 0 atanır
    public Time2(int h) {
        this(h, 0, 0); // üç argümanlı Time2 kurucusunu çağır
    } // Time2 tek argümanlı kurucu sonu

    // Time2 kurucusu: hour ve minute sağlanır, second varsayılan olarak 0 atanır
    public Time2(int h, int m) {
        this(h, m, 0); // üç argümanlı Time2 kurucusunu çağır
    } // Time2 iki argümanlı kurucu sonu

    // Time2 kurucusu: hour, minute ve second sağlanır
    public Time2(int h, int m, int s) {
        setTime(h, m, s); // zamanı doğrulamak için setTime'i çağır
    } // Time2 üç argümanlı kurucu sonu

    // Time2 kurucusu: başka bir Time2 nesnesi sağlanır
    public Time2(Time2 time) {
        // üç argümanlı Time2 kurucusunu çağır
        this(time.getHour(), time.getMinute(), time.getSecond());
    } // Time2 başka bir Time2 nesnesi ile kurucu sonu

    // Set Methods
    // Evrensel zamanı kullanarak yeni bir zaman değeri ayarla;
    // veriyi doğrula
    public void setTime(int h, int m, int s) {
        setHour(h);   // hour ayarla
        setMinute(m); // minute ayarla
        setSecond(s); // second ayarla
    } // setTime metodu sonu

    // hour'u doğrula ve ayarla
    public void setHour(int h) {
        if (h >= 0 && h < 24) {
            hour = h;
        } else {
            throw new IllegalArgumentException("hour must be 0-23");
        }
    } // setHour metodu sonu

    // minute'u doğrula ve ayarla
    public void setMinute(int m) {
        if (m >= 0 && m < 60) {
            minute = m;
        } else {
            throw new IllegalArgumentException("minute must be 0-59");
        }
    } // setMinute metodu sonu

    // second'u doğrula ve ayarla
    public void setSecond(int s) {
        if (s >= 0 && s < 60) {
            second = s;
        } else {
            throw new IllegalArgumentException("second must be 0-59");
        }
    } // setSecond metodu sonu

    // Get Methods
    // hour değerini döndür
    public int getHour() {
        return hour;
    } // getHour metodu sonu

    // minute değerini döndür
    public int getMinute() {
        return minute;
    } // getMinute metodu sonu

    // second değerini döndür
    public int getSecond() {
        return second;
    } // getSecond metodu sonu

    // Evrensel zaman (HH:MM:SS) formatında String'e dönüştür
    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    } // toUniversalString metodu sonu

    // Standart zaman formatında (HH:MM:SS AM or PM) String'e dönüştür
    public String toString() {
        return String.format("%d:%02d:%02d %s", ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12), getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
    } // toString metodu sonu
} // Time2 sınıfı sonu
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
|                      Time2                        |
+---------------------------------------------------+
| - hour: int                                       |
| - minute: int                                     |
| - second: int                                     |
+---------------------------------------------------+
| + Time2()                                         |
| + Time2(h: int)                                   |
| + Time2(h: int, m: int)                           |
| + Time2(h: int, m: int, s: int)                   |
| + Time2(time: Time2)                              |
| + setTime(h: int, m: int, s: int): void           |
| + setHour(h: int): void                           |
| + setMinute(m: int): void                         |
| + setSecond(s: int): void                         |
| + getHour(): int                                  |
| + getMinute(): int                                |
| + getSecond(): int                                |
| + toUniversalString(): String                     |
| + toString(): String                              |
+---------------------------------------------------+
 */