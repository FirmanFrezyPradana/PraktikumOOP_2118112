/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab5.PenerapanTunjangan;

/**
 *
 * @author icornermalang
 */
public class karyawan {

    public double gajiDasar;

    public karyawan(double gajiDasar) {
        this.gajiDasar = gajiDasar;
    }

    public double hitungTunjangan() {
        return gajiDasar * 0.1;
    }
}

