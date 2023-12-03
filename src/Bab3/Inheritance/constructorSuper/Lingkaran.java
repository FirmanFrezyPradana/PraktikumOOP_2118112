/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab3.Inheritance.constructorSuper;

/**
 *
 * @author icornermalang
 */
public class Lingkaran {
    
    int r;
    double phi,luas;
    
    public Lingkaran(int r){
        this.r = r;
        phi = 3.14;
    }
    void Deskripsi(){
        System.out.println("Ini adalah hasil menghitung");
    }
    double HitluasLingkaran(){
        luas=(phi*r*r);
        return luas; 
    }
}

//    double jariJari,phi=3.14;
//
//    public Lingkaran(double jariJari) {
//        this.jariJari = jariJari;
//    }
//
//    public double hitungLuas() {
//        return phi * jariJari * jariJari;
//    }
//}
