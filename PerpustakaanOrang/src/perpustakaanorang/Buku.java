/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaanorang;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ACER
 */
public class Buku {
    private int idBuku;
    private String judul;
    private String pengarang;
    private String nomorISBN;
    private boolean statusKetersediaan;
    private List<Buku> bukuList;

   public Buku() {
       this.bukuList = new ArrayList<>();
   }

    public Buku(int idBuku, String judul, String pengarang, String nomorISBN) {
        this.idBuku = idBuku;
        this.judul = judul;
        this.pengarang = pengarang;
        this.nomorISBN = nomorISBN;
        this.statusKetersediaan = true; 
        this.bukuList = new ArrayList<>();
    }

    public int getIdBuku() {
        return idBuku;
    }

    public void setIdBuku(int idBuku) {
        this.idBuku = idBuku;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public String getNomorISBN() {
        return nomorISBN;
    }

    public void setNomorISBN(String nomorISBN) {
        this.nomorISBN = nomorISBN;
    }

    public boolean isStatusKetersediaan() {
        return statusKetersediaan;
    }

    public void setStatusKetersediaan(boolean statusKetersediaan) {
        this.statusKetersediaan = statusKetersediaan;
    }  

    public List<Buku> getBukuList() {
        return bukuList;
    }

    public void setBukuList(List<Buku> bukuList) {
        this.bukuList = bukuList;
    }
       
    public void pinjamBuku() {
        if (statusKetersediaan) {
            statusKetersediaan = false; 
            System.out.println("Buku \"" + judul + "\" berhasil dipinjam.");
        } else {
            System.out.println("Maaf, buku \"" + judul + "\" tidak ada.");
        }
    }

    public void kembalikanBuku() {
        statusKetersediaan = true; 
        System.out.println("Buku \"" + judul + "\" berhasil dikembalikan.");
    }
    public Buku searchBukuByISBN(String nomorISBN) {
       for (Buku buku : bukuList) {
           if (buku.getNomorISBN().equals(nomorISBN)) {
               return buku;
           }
       }
       return null;
   }    
}
