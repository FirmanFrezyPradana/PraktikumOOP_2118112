/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab8.Pembayaran;

/**
 *
 * @author icornermalang
 */
public class DompetDigital implements MetodePembayaran {

    private double saldoDompet;

    public DompetDigital(double saldoAwal) {
        this.saldoDompet = saldoAwal;
    }

    @Override
    public void prosesPembayaran(double jumlah) {
        if (saldoDompet >= jumlah) {
            System.out.println("Pembayaran sebesar " + jumlah + " diproses menggunakan Dompet Digital.");
            saldoDompet -= jumlah;
        } else {
            System.out.println("Saldo Dompet Digital tidak mencukupi.");
        }
    }

    @Override
    public double cekSaldo() {
        return saldoDompet;
    }
}
