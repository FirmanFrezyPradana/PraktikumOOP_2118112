/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab5.PenerapanTunjangan;

/**
 *
 * @author icornermalang
 */
public class Tunjangan {

    // Metode overload untuk menghitung tunjangan berdasarkan gaji dasar
    public double hitungTunjangan(int gajiDasar) {
        return gajiDasar * 0.1;
    }

    // Metode overload untuk menghitung tunjangan berdasarkan gaji dasar dan tahun pengalaman
    public double hitungTunjangan(int gajiDasar, int tahunPengalaman) {
        double tunjangan = gajiDasar * 0.1;
        if (tahunPengalaman >= 5) {
            tunjangan += 100000;
        }
        return tunjangan;
    }

    // Metode overload untuk menghitung tunjangan berdasarkan gaji dasar, tahun pengalaman, dan jenis pekerjaan
    public double hitungTunjangan(int gajiDasar, int tahunPengalaman, String jenisPekerjaan) {
        double tunjangan = gajiDasar * 0.1;
        if (tahunPengalaman >= 5) {
            tunjangan += 300000;
        }
        if (jenisPekerjaan.equalsIgnoreCase("manager")) {
            tunjangan += 500000;
        }
        return tunjangan;
    }
}

