/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab5.OverloadingDanOverriding;

/**
 *
 * @author icornermalang
 */
public class penjumlahan {
    
    public void jumlah(int a, int b) {
        System.out.println("Jumlah 2 angka =" + (a + b));
    }
    
    //overloading perbedaan jumlah parameter
    public void jumlah(int a, int b, int c) {
        System.out.println("Jumlah 3 angka =" + (a + b + c));
    }
    
    //overloading perbedaan tipe data parameter
    public void jumlah(double a, int b) {
        System.out.println("Jumlah 2 angka (double+int)= " + (a + b));
    }
    
    public static void main(String[] args) {
        penjumlahan pjm = new penjumlahan();
        pjm.jumlah(2.5, 4);
        pjm.jumlah(7, 7);
        pjm.jumlah(10, 20, 40);
        
    }
}
