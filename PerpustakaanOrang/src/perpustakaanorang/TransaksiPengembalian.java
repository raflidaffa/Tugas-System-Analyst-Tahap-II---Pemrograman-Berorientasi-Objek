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
public class TransaksiPengembalian {
    private int idTransaksi;
    private int idTransaksiPeminjaman;
    private Date tanggalPengembalian;

    public TransaksiPengembalian(int idTransaksi, int idTransaksiPeminjaman, Date tanggalPengembalian) {
        this.idTransaksi = idTransaksi;
        this.idTransaksiPeminjaman = idTransaksiPeminjaman;
        this.tanggalPengembalian = tanggalPengembalian;
    }

    public void hitungDenda() {
        System.out.println("Denda dihitung untuk transaksi pengembalian dengan ID: " + idTransaksi);
    }

    public int getIdTransaksi() {
        return idTransaksi;
    }

    public void setIdTransaksi(int idTransaksi) {
        this.idTransaksi = idTransaksi;
    }

    public int getIdTransaksiPeminjaman() {
        return idTransaksiPeminjaman;
    }

    public void setIdTransaksiPeminjaman(int idTransaksiPeminjaman) {
        this.idTransaksiPeminjaman = idTransaksiPeminjaman;
    }

    public Date getTanggalPengembalian() {
        return tanggalPengembalian;
    }

    public void setTanggalPengembalian(Date tanggalPengembalian) {
        this.tanggalPengembalian = tanggalPengembalian;
    }
    
    
}
