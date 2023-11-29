/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package perpustakaanorang;

import java.util.List;

/**
 *
 * @author ACER
 */
public class PerpustakaanOrang {
    public static void main(String[] args) {
        Buku buku1 = new Buku(1, "Bumi", "Tere Liye", "9786020627526");
        Buku buku2 = new Buku(2, "Dilan", "Pidi Baiq", "9786027870864");
        AnggotaPerpustakaan anggota1 = new AnggotaPerpustakaan(1, "Rafli Daffa Pratama", "Bumi Manti II");
        anggota1.daftarAnggota(); 
        AnggotaPerpustakaan anggota2 = new AnggotaPerpustakaan(2, "M. Hafiz Zidane", "Kampung Baru");
        anggota2.daftarAnggota(); 
        AnggotaPerpustakaan anggota3 = new AnggotaPerpustakaan(3, "M. Akbar Baihaqi", "Garuntang");
        anggota3.daftarAnggota(); 
          
        buku1.pinjamBuku(); 
        buku1.kembalikanBuku(); 
        buku2.pinjamBuku(); 
        
        
        buku1.getBukuList().add(buku1);
        
       Buku book = buku1.searchBukuByISBN("9786020627526");
       if (book != null) {
           System.out.println("Found book: " + book.getJudul());
       } else {
           System.out.println("Book not found");
       }
    }
}
    

