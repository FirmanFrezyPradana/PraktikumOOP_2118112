/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab3.Inheritance.constructorSuper;

/**
 *
 * @author icornermalang
 */
public class Tabung extends Lingkaran {
    
    int t;
    double volume, luasPermukaan;

    public Tabung(int r , int t) { 
        super(r);
        this.t = t;
    }

    void Keterangan() {
        Deskripsi();
        System.out.println("mengitung Volume Tabung");
    }

    double HitvolumeTabung() {
        volume = (HitluasLingkaran() * t);
        return volume;
    }

}
