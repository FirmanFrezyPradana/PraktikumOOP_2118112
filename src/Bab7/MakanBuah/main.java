/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab7.MakanBuah;

/**
 *
 * @author icornermalang
 */
public class main {
    public static void main(String[] args) {
        // Membuat objek Manusia
        Manusia manusia = new Manusia();

        // Membuat objek Apel dan Pisang
        Buah apel = new Apel();
        Buah pisang = new Pisang();

        // Memanggil metode makanBuah() pada Manusia untuk objek Apel dan Pisang
        manusia.makanBuah(apel);    // Output: Makan apel dengan di gigit.
        manusia.makanBuah(pisang);  // Output: Kupas pisang sebelum dimakan.
    }
}
