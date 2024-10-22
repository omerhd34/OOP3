package ADVANCED.Exercises4.ExerciseCombine6;

// Bellekte bulunan Employee nesnelerinin sayısını korumak için kullanılan statik değişken.
public class Employee {
    private String firstName;
    private String lastName;
    private static int count = 0; // Oluşturulan Employee nesnelerinin sayısı

    // Employee nesnesini başlat, statik sayacı 1 artır ve
    // kurucunun çağrıldığını belirten String'i çıktı olarak ver
    public Employee(String first, String last) {
        firstName = first;
        lastName = last;

        ++count; // Employee sayısını artır
        System.out.printf("Employee constructor: %s %s; count = %d\n", firstName, lastName, count);
    } // Employee kurucusu sonu

    // ilk ismi al
    public String getFirstName() {
        return firstName;
    } // getFirstName metodu sonu

    // soyadını al
    public String getLastName() {
        return lastName;
    } // getLastName metodu sonu

    // statik count değerini almak için statik metod
    public static int getCount() {
        return count;
    } // getCount metodu sonu
} // Employee sınıfı sonu
/*
Employees before instantiation: 0
Employee constructor: Susan Baker; count = 1
Employee constructor: Bob Blue; count = 2

Employees after instantiation:
via e1.getCount(): 2
via e2.getCount(): 2
via Employee.getCount(): 2

Employee 1: Susan Baker
Employee 2: Bob Blue

+---------------------------------------------------+
|                    Employee                       |
+---------------------------------------------------+
| - firstName: String                               |
| - lastName: String                                |
| - count: static int                               |
+---------------------------------------------------+
| + Employee(first: String, last: String)           |
| + getFirstName(): String                          |
| + getLastName(): String                           |
| + static getCount(): int                          |
+---------------------------------------------------+

 */