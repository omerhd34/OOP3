package ADVANCED.Exercises4.ExerciseCombine1;

// Bileşimin gösterimi.
public class EmployeeTest {
    public static void main(String[] args) {
        Date birth = new Date(7, 24, 1949);  // Doğum tarihi
        Date hire = new Date(3, 12, 1988);   // İşe başlama tarihi

        // Employee nesnesi oluştur
        Employee employee = new Employee("Bob", "Blue", birth, hire);

        // Employee nesnesini yazdır
        System.out.println(employee);
    } // main metodu sonu
} // EmployeeTest sınıfı sonu
/*
Date nesne kurucusu şu tarih için oluşturuldu: 7/24/1949
Date nesne kurucusu şu tarih için oluşturuldu: 3/12/1988
Blue, Bob Hired: 3/12/1988 Birthday: 7/24/1949
*/