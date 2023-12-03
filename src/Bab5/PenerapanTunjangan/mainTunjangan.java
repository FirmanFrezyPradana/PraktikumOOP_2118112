/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab5.PenerapanTunjangan;

/**
 *
 * @author icornermalang
 */
public class mainTunjangan {
    public static void main(String[] args) {
        Tunjangan hitTunjangan = new Tunjangan();

        double tunjanganKaryawanBaru = hitTunjangan.hitungTunjangan(4000000);
        System.out.println("Tunjangan dari karyawan baru : " + tunjanganKaryawanBaru);

        double tunjanganKaryawanLama = hitTunjangan.hitungTunjangan(6000000, 7);
        System.out.println("Tunjangan dari karyawan lama  : " + tunjanganKaryawanLama);

        double tunjanganjabatan = hitTunjangan.hitungTunjangan(9000000, 3, "manager");
        System.out.println("Tunjangan dari pengalaman dan jabatan :" + tunjanganjabatan);
    }
}
