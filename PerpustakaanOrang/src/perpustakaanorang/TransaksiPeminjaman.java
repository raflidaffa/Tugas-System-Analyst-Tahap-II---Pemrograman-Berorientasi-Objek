/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaanorang;

import java.util.Date;

/**
 *
 * @author ACER
 */
public class TransaksiPeminjaman {
    private int idTransaksi;
    private int idAnggota;
    private int idBuku;
    private Date tanggalPeminjaman;
    private int durasiPeminjaman;

    public TransaksiPeminjaman (int idTransaksi, int idAnggota, int idBuku, Date tanggalPeminjaman, int durasiPeminjaman) {
        this.idTransaksi = idTransaksi;
        this.idAnggota = idAnggota;
        this.idBuku = idBuku;
        this.tanggalPeminjaman = tanggalPeminjaman;
        this.durasiPeminjaman = durasiPeminjaman;
    }

    public void hitungDenda() {
        System.out.println("Denda untuk anggota dengan ID : " + idTransaksi);
    }

    public int getIdTransaksi() {
        return idTransaksi;
    }

    public void setIdTransaksi(int idTransaksi) {
        this.idTransaksi = idTransaksi;
    }

    public int getIdAnggota() {
        return idAnggota;
    }

    public void setIdAnggota(int idAnggota) {
        this.idAnggota = idAnggota;
    }

    public int getIdBuku() {
        return idBuku;
    }

    public void setIdBuku(int idBuku) {
        this.idBuku = idBuku;
    }

    public Date getTanggalPeminjaman() {
        return tanggalPeminjaman;
    }

    public void setTanggalPeminjaman(Date tanggalPeminjaman) {
        this.tanggalPeminjaman = tanggalPeminjaman;
    }

    public int getDurasiPeminjaman() {
        return durasiPeminjaman;
    }

    public void setDurasiPeminjaman(int durasiPeminjaman) {
        this.durasiPeminjaman = durasiPeminjaman;
    }
    
    
}
