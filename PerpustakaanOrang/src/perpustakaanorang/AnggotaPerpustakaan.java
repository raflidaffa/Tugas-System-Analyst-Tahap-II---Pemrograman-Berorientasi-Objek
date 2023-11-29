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
public class AnggotaPerpustakaan {
    private int nomorAnggota;
    private String nama;
    private String alamat;
    private List<TransaksiPeminjaman> riwayatPeminjaman;
    

    public AnggotaPerpustakaan(int idAnggota, String nama, String alamat) {
        this.nomorAnggota = idAnggota;
        this.nama = nama;
        this.alamat = alamat;
        this.riwayatPeminjaman = new ArrayList<>();
    }

    public int getNomorAnggota() {
        return nomorAnggota;
    }

    public void setNomorAnggota(int nomorAnggota) {
        this.nomorAnggota = nomorAnggota;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public List<TransaksiPeminjaman> getRiwayatPeminjaman() {
        return riwayatPeminjaman;
    }

    public void setRiwayatPeminjaman(List<TransaksiPeminjaman> riwayatPeminjaman) {
        this.riwayatPeminjaman = riwayatPeminjaman;
    }
    
    public void daftarAnggota() {
        System.out.println("Pendaftaran berhasil atas nama \"" + nama + "\". Selamat bergabung!");
    }   
}
