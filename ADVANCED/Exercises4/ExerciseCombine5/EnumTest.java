package ADVANCED.Exercises4.ExerciseCombine5;

// Book enum türünü test ediyor.

import java.util.EnumSet;

public class EnumTest {
    public static void main(String[] args) {
        System.out.println("All books:\n");

        // Book enum'undaki tüm kitapları yazdır
        for (Book book : Book.values())
            System.out.printf("%-10s%-45s%s\n", book, book.getTitle(), book.getCopyrightYear());

        System.out.println("\nBelirli bir aralıktaki enum sabitlerini göster:\n");

        // İlk dört kitabı yazdır
        for (Book book : EnumSet.range(Book.JHTP, Book.CPPHTP))
            System.out.printf("%-10s%-45s%s\n", book, book.getTitle(), book.getCopyrightYear());
    } // main metodu sonu
} // EnumTest sınıfı sonu
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
 */