/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.responsiuts;

/**
 *
 * @author ASUS -REYZEN 3
 */
public class Produk {
    //atribut dengan akses modifier private
    private String namaProduk;
    private int harga;
    
    //constructor
    public Produk(String namaProduk, int harga) {
        this.namaProduk = namaProduk;
        this.harga = harga;
    }
    
    //getter dan setter untuk namaProduk
    public String getNamaProduk() {
        return namaProduk;
    }
    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }
    
    //getter dan setter untuk harga
    public int getHarga() {
        return harga;
    }
    public void setHarga(int harga) {
        this.harga = harga;
    }
    
    //method untuk menampilkan info
    public void tampilkanInfo() {
        System.out.println("Nama Produk: " + namaProduk);
        System.out.println("Harga: " + harga);
    }
}
