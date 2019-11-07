/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10118045latihan49biayaemaskawin;

/**
 *
 * @author Ilham
 */
public class EmasKawin {
    private double berat,harga,total;

    public EmasKawin(double berat, double harga) {
        this.berat = berat;
        this.harga = harga;
    }

    public double getBerat() {
        return berat;
    }

    public double getHarga() {
        return harga;
    }
    
    public double hitung (double berat, double harga){
        total = berat * harga;
        return total;
    }
    
    
}
