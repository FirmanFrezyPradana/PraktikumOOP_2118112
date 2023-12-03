/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab7.Game;

/**
 *
 * @author icornermalang
 */
public class HeroStrength extends Hero {

    String type = "Strength";

    //ketika di exstends class anaka wajib memiliki constructor berparameter untuk mendapatkan methos yang ada di induk
    HeroStrength(String nameInput, double attactInput, double healtInput) {
        super(nameInput, attactInput, healtInput);
    }

    @Override
    void display() {
        super.display();
        System.out.println("Type :" + this.type);
    }

    @Override
    void takeDamage(double damage) {
        System.out.println(this.name + " receive half damage " + damage +" -> "+0.5*damage);
        this.health = this.health - 0.5*damage;
    }
}
