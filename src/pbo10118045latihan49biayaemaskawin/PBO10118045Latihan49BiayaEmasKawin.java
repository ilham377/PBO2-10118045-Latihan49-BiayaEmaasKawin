/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10118045latihan49biayaemaskawin;

/**
 *
 * @author
 *  Nama              : Muhammad Ilham Apriyadi
 *  Kelas             : IF2
 *  NIM               : 10118045
 *  Deskripsi Program : harga total yg harus dibayar Hendi
 */
public class PBO10118045Latihan49BiayaEmasKawin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EmasKawin emas = new EmasKawin(15.7 , 570000);
        
        System.out.println("Berat Emas = "+emas.getBerat());
        System.out.println("Harga Emas Bulan Oktober = Rp. "+emas.getHarga());
        System.out.println("Total yang harus dibayar = Rp. "+emas.hitung(emas.getBerat(), emas.getHarga()));
    }
    
}
