/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.responsiuts;

/**
 *
 * @author ASUS -REYZEN 3
 */
public class Elektronik extends Produk {
    private int garansi;
    
    //constructor
    public Elektronik(String namaProduk, int harga, int garansi) {
        super(namaProduk, harga);
        this.garansi = garansi;
    }
    
    //getter dan setter untuk garansi
    public int getGaransi() {
        return garansi;
    }
    public void setGaransi(int garansi) {
        this.garansi = garansi;
    }
    
    //override method
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Garansi Produk: " + garansi + " tahun");
    }
}
