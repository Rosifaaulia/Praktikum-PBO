/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas6;

/**
 *
 * @author ASUS -REYZEN 3
 */
public class Main {
    public static void main(String[] args) {
        KeranjangBelanja keranjang = new KeranjangBelanja();
        
        keranjang.tambahProduk(new Buku("Novel Si Anak Pintar", 125699));
        keranjang.tambahProduk(new Elektronik("TWS", 74200));
        keranjang.tambahProduk(new Pakaian("Jeans", 136700));
        
        System.out.println("Total belanja setelah mendapat diskon: " + keranjang.hitungTotalHarga());
    }
}
