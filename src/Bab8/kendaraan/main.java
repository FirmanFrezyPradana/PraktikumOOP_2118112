/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab8.kendaraan;

/**
 *
 * @author icornermalang
 */
public class main {

    public static void main(String[] args) {
        // Contoh penggunaan dengan objek Mobil
        Mobil mobil = new Mobil("Toyota");
        mobil.berjalan();
        mobil.carabegerak();
        mobil.kecepatanMax();
        System.out.println("========================");
        Pesawat pesawat = new Pesawat("Boeing 737");
        pesawat.carabegerak();
        pesawat.kecepatanMax();
        pesawat.berjalan();
        pesawat.terbang();
    }
}
