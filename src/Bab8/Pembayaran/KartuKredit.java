/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab8.Pembayaran;

/**
 *
 * @author icornermalang
 */
public class KartuKredit implements MetodePembayaran {

    private double saldoKredit;

    public KartuKredit(double saldoAwal) {
        this.saldoKredit = saldoAwal;
    }

    @Override
    public void prosesPembayaran(double jumlah) {
        if (saldoKredit >= jumlah) {
            System.out.println("Pembayaran sebesar " + jumlah + " diproses menggunakan Kartu Kredit.");
            saldoKredit -= jumlah;
        } else {
            System.out.println("Saldo Kartu Kredit tidak mencukupi.");
        }
    }

    @Override
    public double cekSaldo() {
        return saldoKredit;
    }
}
