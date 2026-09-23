/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author ASUS -REYZEN 3
 */
public class Mobil extends Kendaraan {
    private int jumlahPintu; 
    
   //Constructor
    public Mobil(String nama, int kecepatanMaks, String jenisMesin, int jumlahPintu) {
        super(nama, kecepatanMaks, jenisMesin); //memanggil constructor dari kelas induk
        this.jumlahPintu = jumlahPintu;
    }
    
    //method untuk menampilkan informasi mobil
    public void tampilkanInfoMobil() {
        //dapat mengakses kecepatanMaks karena protected
        System.out.println("Kecepatan Maksimum Mobil: " + kecepatanMaks + "km/h");
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }
}
