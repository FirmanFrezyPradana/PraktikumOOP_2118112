/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab7.Pembayaran;

/**
 *
 * @author icornermalang
 */
public class main_pembayaran {
    public static void main(String[] args) {
        // Upcasting: Objek dari kelas turunan diubah menjadi objek dari kelas induk
        Pembayaran payment;
        payment = new P0001();
        payment.tampilkanMember();
        
        //buat object tiap pembayaran
        Cash cash = new Cash();
        Kredit kredit = new Kredit();
        Emoney emoney = new Emoney();

        if (payment instanceof P0001) {
            P0001 p0001 = (P0001) payment;
            System.out.println("Jenis Mmber: " + p0001.member(p0001));
            System.out.println("Total Pembelian: " + p0001.hitPembayaran(500000));
            
//            pembayaran dengan cash
//            p0001.bayar = 600000;
//            p0001.jenisPembayaran(cash);
            
            
//            pembayaran dengan kartu kerdit
//            p0001.InputPinKredit = "P0001";
//            p0001.jenisPembayaran(kredit);

//            pembayaran dengan Qris
//            p0001.jenisPembayaran(emoney);
               
//            pembayaran dengan menggunaakan saldo
            System.out.println("sisa saldo: " + p0001.potSaldo());
        }
    }
}
