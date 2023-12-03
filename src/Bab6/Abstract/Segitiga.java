/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab6.Abstract;

import Bab3.Inheritance.*;

/**
 *
 * @author icornermalang
 */
public abstract class Segitiga {
    public double alas,tinggi,luas;
    public double Luas(){
        luas = 0.5*(alas *tinggi);
        return luas;
    }  
    abstract double Volume();
}
