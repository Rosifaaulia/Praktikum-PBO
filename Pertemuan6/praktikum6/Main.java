/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6;

/**
 *
 * @author ASUS -REYZEN 3
 */
public class Main {
    public static void main(String[] args) {
        Hewan kucing = new Kucing();
        kucing.bersuara(); //Output: Hewan bersuara
        kucing.makan("ikan"); //Memanggil method makan dari kelas hewan
        kucing.makan("ikan", 2); //Memanggil method makan yang di overload
        
        Anjing anjing = new Anjing();
        anjing.bersuara(); //output: woff!
        anjing.makan("daging", 3); //Memanggil method makan() yang di overload pada kelas Hewan
    }
}
