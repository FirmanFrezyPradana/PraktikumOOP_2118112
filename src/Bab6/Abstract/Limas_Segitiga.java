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
public class Limas_Segitiga extends Segitiga{
    double vol,t;  
    @Override
    double Volume() {
        vol = Luas() * t * 0.333;
        return vol;
    }

}
