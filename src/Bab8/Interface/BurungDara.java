/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab8.Interface;

/**
 *
 * @author icornermalang
 */
public class BurungDara extends Hewan implements nafas, terbang  {
    @Override
    public void bernafas() {
        setNafas("bisa bernafas");
    }

    @Override
    public void terbang() {
        setTerbang("bisa terbang");
    }
}
