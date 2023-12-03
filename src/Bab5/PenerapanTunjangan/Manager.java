/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab5.PenerapanTunjangan;

/**
 *
 * @author icornermalang
 */
public class Manager  extends karyawan{

    public Manager(double gaji) {
        super(gaji);
    }

    public double hitungTunjangan() {
        return gajiDasar * 0.2 + 400000;
    }
}
