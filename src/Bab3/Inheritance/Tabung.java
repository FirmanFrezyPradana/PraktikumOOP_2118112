/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab3.Inheritance;

/**
 *
 * @author icornermalang
 */
public class Tabung {

    int t,r;
    double volume, luasPermukaan,phi;

    public Tabung() {
        r = 7;
        phi = 3.14;
        t = 20;
    }

    void Keterangan() {
        System.out.println("mengitung Volume Tabung");
    }

    double HitvolumeTabung() {
        //π x r2 x t.
        volume = ((phi*r*r) * t);
        return volume;
    }
}


//    //implementasi pemanggilan constructor super() 
//    double luasPermukaanTabung(){
//    //luas permukaan tabung = luas alas + luas aselimut+ luas tutup
//        luasPermukaan = (2 * phi * r * (r+t));
//        return luasPermukaan;
//    }
//}
//public class Tabung extends Lingkaran {
//    int t;
//    double volume;
//
//    public Tabung(){
//        t=20;
//    }
//    void Keterangan(){
//        Deskripsi();
//        System.out.println("mengitung Volume Tabung");
//    }
//    double volume(){
//       volume = (luas()*t);
//       return volume;
//    }  
//}

