package ADVANCED.Exercises4.ExerciseCombine6;

// statik üye gösterimi.
public class EmployeeTest {
    public static void main(String[] args) {
        // Employee oluşturulmadan önce sayının 0 olduğunu göster
        System.out.printf("Employees before instantiation: %d\n", Employee.getCount());

        // İki Employee oluştur, sayaç 2 olmalı
        Employee e1 = new Employee("Susan", "Baker");
        Employee e2 = new Employee("Bob", "Blue");

        // İki Employee oluşturulduktan sonra sayının 2 olduğunu göster
        System.out.println("\nEmployees after instantiation: ");
        System.out.printf("via e1.getCount(): %d\n", e1.getCount());
        System.out.printf("via e2.getCount(): %d\n", e2.getCount());
        System.out.printf("via Employee.getCount(): %d\n", Employee.getCount());

        // Employee'lerin isimlerini al
        System.out.printf("\nEmployee 1: %s %s\nEmployee 2: %s %s\n", e1.getFirstName(), e1.getLastName(), e2.getFirstName(), e2.getLastName());

        // Bu örnekte, her Employee için sadece bir referans var,
        // bu nedenle aşağıdaki iki ifade, bu nesnelerin çöp toplanmaya uygun olduğunu gösteriyor
        e1 = null;
        e2 = null;
    } // main metodu sonu
} // EmployeeTest sınıfı sonu
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