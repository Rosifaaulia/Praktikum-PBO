/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas5;

/**
 *
 * @author ASUS -REYZEN 3
 */
public class Anjing extends Hewan {
    public String suara;
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Anjing bersuara: " + suara);
    }
}
