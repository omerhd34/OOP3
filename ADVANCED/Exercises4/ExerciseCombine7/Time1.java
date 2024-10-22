package ADVANCED.Exercises4.ExerciseCombine7;

// Time1 sınıfı, saati 24 saatlik formatta tutar.

public class Time1 {
    private int hour;   // 0 - 23
    private int minute; // 0 - 59
    private int second; // 0 - 59

    // Evrensel zamanı kullanarak yeni bir zaman değeri ayarla;
    // saat, dakika veya saniye geçersizse bir istisna fırlat
    public void setTime(int h, int m, int s) {
        // saat, dakika ve saniyeyi doğrula
        if ((h >= 0 && h < 24) && (m >= 0 && m < 60) && (s >= 0 && s < 60)) {
            hour = h;
            minute = m;
            second = s;
        } else {
            throw new IllegalArgumentException("hour, minute and/or second was out of range");
        }
    } // setTime metodunun sonu

    // Evrensel zaman formatında (HH:MM:SS) String'e dönüştür
    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    } // toUniversalString metodunun sonu

    // Standart zaman formatında (H:MM:SS AM veya PM) String'e dönüştür
    public String toString() {
        return String.format("%d:%02d:%02d %s", ((hour == 0 || hour == 12) ? 12 : hour % 12), minute, second, (hour < 12 ? "AM" : "PM"));
    } // toString metodunun sonu
} // Time1 sınıfının sonu
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