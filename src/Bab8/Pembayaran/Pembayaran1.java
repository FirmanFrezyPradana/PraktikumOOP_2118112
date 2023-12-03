/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab8.Pembayaran;

/**
 *
 * @author icornermalang
 */
public class Pembayaran1 {

    public static void main(String[] args) {
        MetodePembayaran kartuKredit = new KartuKredit(5000000);
        MetodePembayaran dompetDigital = new DompetDigital(100000);

        // Menggunakan metode pembayaran
        kartuKredit.prosesPembayaran(500000);
        dompetDigital.prosesPembayaran(30000);

        // Mengecek saldo setelah pembayaran
        System.out.println("Saldo Kartu Kredit: " + kartuKredit.cekSaldo());
        System.out.println("Saldo Dompet Digital: " + dompetDigital.cekSaldo());
    }
}
