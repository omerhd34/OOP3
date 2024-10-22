package ADVANCED.Exercises4.ExerciseCombine5;

// Bir enum türünü kurucu ve açık örnek alanlar ile bildirme
// ve bu alanlar için erişimciler
public enum Book {
    // enum türünün sabitlerini bildir
    JHTP("Java How to Program", "2012"),
    CHTP("C How to Program", "2007"),
    IW3HTP("Internet & World Wide Web How to Program", "2008"),
    CPPHTP("C++ How to Program", "2012"),
    VBHTP("Visual Basic 2010 How to Program", "2011"),
    CSHARPHTP("Visual C# 2010 How to Program", "2011");

    // örnek alanlar
    private final String title;          // kitap başlığı
    private final String copyrightYear;  // telif yılı

    // enum kurucu
    Book(String bookTitle, String year) {
        title = bookTitle;
        copyrightYear = year;
    } // enum Book kurucusu sonu

    // başlık alanı için erişimci
    public String getTitle() {
        return title;
    } // getTitle metodu sonu

    // telif yılı alanı için erişimci
    public String getCopyrightYear() {
        return copyrightYear;
    } // getCopyrightYear metodu sonu
} // enum Book sonu
/*
All books:

JHTP      Java How to Program                          2012
CHTP      C How to Program                             2007
IW3HTP    Internet & World Wide Web How to Program     2008
CPPHTP    C++ How to Program                           2012
VBHTP     Visual Basic 2010 How to Program             2011
CSHARPHTP Visual C# 2010 How to Program                2011

Belirli bir aralıktaki enum sabitlerini göster:

JHTP      Java How to Program                          2012
CHTP      C How to Program                             2007
IW3HTP    Internet & World Wide Web How to Program     2008
CPPHTP    C++ How to Program                           2012

+----------------------------------------------+
|                    Book                      |
+----------------------------------------------+
| JHTP ("Java How to Program", "2012")         |
| CHTP ("C How to Program", "2007")            |
| IW3HTP ("Internet & Web How to Program", "2008") |
| CPPHTP ("C++ How to Program", "2012")        |
| VBHTP ("Visual Basic 2010 How to Program", "2011") |
| CSHARPHTP ("Visual C# 2010 How to Program", "2011") |
+----------------------------------------------+
| - title: String                              |
| - copyrightYear: String                      |
+----------------------------------------------+
| + Book(bookTitle: String, year: String)      |
| + getTitle(): String                         |
| + getCopyrightYear(): String                 |
+----------------------------------------------+


 */