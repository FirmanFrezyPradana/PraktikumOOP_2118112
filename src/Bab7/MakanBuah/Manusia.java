/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab7.MakanBuah;

/**
 *
 * @author icornermalang
 */
// Kelas Manusia dengan metode makanBuah() yang menerima objek buah sebagai parameter
public class Manusia {
    // Metode makanBuah() yang memanfaatkan polimorfisme
    void makanBuah(Buah buah) {
        buah.caraMakanBuah();  // Polimorfisme: memanggil metode makanBuah() sesuai dengan tipe objek
    }
}
