/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab2.Constructor;

/**
 *
 * @author icornermalang
 */
public class pembayaran {
    int totalHarga, discount,Total;

    // Constructor untuk perhitungan pembayaran tanpa potongan harga
    public pembayaran(int totalHarga) {
        this.totalHarga = totalHarga;
        this.discount = 0;
        this.Total = totalHarga;
    }

    // Constructor untuk perhitungan pembayaran dengan potongan harga
    public pembayaran(int totalHarga, int discount) {
        this.totalHarga = totalHarga;
        this.discount = discount;
        this.Total = totalHarga - discount;
    }

    // Metode untuk mendapatkan total pembayaran
    public double getTotalpembayaran() {
        return Total;
    }
    
    public static void main(String[] args) {   
        // Menggunakan konstruktor tanpa potongan harga
        pembayaran pembayaran1 = new pembayaran(50000);
        System.out.println("Total pembayaran 1: " + pembayaran1.getTotalpembayaran());

        // Menggunakan konstruktor dengan potongan harga
        pembayaran pembayaran2 = new pembayaran(250000, 50000);
        System.out.println("Total pembayaran 2: " + pembayaran2.getTotalpembayaran());
    }
}
