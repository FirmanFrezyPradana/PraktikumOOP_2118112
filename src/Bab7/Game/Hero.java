/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab7.Game;

/**
 *
 * @author icornermalang
 */
public class Hero {

    String name;
    double attactPower, health;

    Hero(String nameInput, double attactInput, double healtInput) {
        this.name = nameInput;
        this.attactPower = attactInput;
        this.health = healtInput;
    }
    
    //attact -> polimorfisme
    //misal diganti heeroStreng
    void attact(Hero enemy){
        //tanjiro akan enemy = zenitsu
        System.out.println(this.name+" attact "+enemy.name);
        //zenitsu akan menagambil damage sebesar attact power
        enemy.takeDamage(this.attactPower);
    }
    
    void takeDamage(double damage){
        System.out.println(this.name+" receive damage "+damage);
        this.health = this.health - damage;
    }
    

    void display() {
        System.out.println("\nName : " + name);
         System.out.println("Healt : " + health);
        System.out.println("Attact Power : " + attactPower); 
    }
    
    
}
