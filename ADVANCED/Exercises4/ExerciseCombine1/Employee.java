package ADVANCED.Exercises4.ExerciseCombine1;

// Diğer nesnelere referanslarla Employee sınıfı.
public class Employee {
    private String firstName;
    private String lastName;
    private Date birthDate;
    private Date hireDate;

    // isim, doğum tarihi ve işe giriş tarihini başlatmak için kurucu
    public Employee(String first, String last, Date dateOfBirth, Date dateOfHire) {
        firstName = first;
        lastName = last;
        birthDate = dateOfBirth;
        hireDate = dateOfHire;
    } // Employee kurucu sonu

    // Employee nesnesini String formata dönüştür
    public String toString() {
        return String.format("%s, %s Hired: %s Birthday: %s", lastName, firstName, hireDate, birthDate);
    } // toString metodu sonu
} // Employee sınıfı sonu
/*
Date nesne kurucusu şu tarih için oluşturuldu: 7/24/1949
Date nesne kurucusu şu tarih için oluşturuldu: 3/12/1988
Blue, Bob Hired: 3/12/1988 Birthday: 7/24/1949

+---------------------------------------------------+
|                     Employee                      |
+---------------------------------------------------+
| - firstName: String                                |
| - lastName: String                                 |
| - birthDate: Date                                  |
| - hireDate: Date                                   |
+---------------------------------------------------+
| + Employee(first: String, last: String,            |
|            dateOfBirth: Date, dateOfHire: Date)    |
| + toString(): String                               |
+---------------------------------------------------+
*/