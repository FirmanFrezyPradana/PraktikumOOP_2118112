/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab6.RewardPegawai;

/**
 *
 * @author icornermalang
 */
public class Gaji_reward extends gaji_abs_reward {

    public double menit,waktu;
    public double tun_bonus;
    public double anak;
    public double tun_anak;
    public double gapok;

    @Override
    double tunjangan_anak() {
        //apabila anak karyawan 1, dapat tunjangan 10% dari gaji pokok
        if (anak == 1) {
            tun_anak = gapok * 0.1;
        }
        //apabila anak karyawan lebih dari 1, dapat tunjangan 20% dari gaji pokok
        if (anak >= 2) {
            tun_anak = gapok * 0.2;
        }

        return tun_anak;

    }

    @Override
    double lembur() {
        // bonus lembur didapat dari berapa jam dia lembur, di kali 25.000
        waktu = menit / 60;
        tun_bonus = waktu * 25000;

        return tun_bonus;
    }

}
