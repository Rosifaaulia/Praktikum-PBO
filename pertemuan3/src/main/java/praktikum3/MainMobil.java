/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

/**
 *
 * @author ASUS -REYZEN 3
 */
public class MainMobil {
    public static void main(String [] args) {
        Mobil Sean = new Mobil ("Toyota", "Avanza", 2023, "Merah");
        Sean.displayInfo();
        Sean.startEngine();
        Sean.gantiWarna("Hitam");
        
        
        Mobil Via = new Mobil ("Honda", "civic", 2022, "Putih");
        Via.displayInfo();
        Via.startEngine();
        Via.gantiWarna("Merah");
    }
}
