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
public class Notifikasi {
    private int idNotifikasi;
    private int idAnggota;
    private String isiNotifikasi;
    private Date tanggalKirim;

    public Notifikasi(int idNotifikasi, int idAnggota, String isiNotifikasi, Date tanggalKirim) {
        this.idNotifikasi = idNotifikasi;
        this.idAnggota = idAnggota;
        this.isiNotifikasi = isiNotifikasi;
        this.tanggalKirim = tanggalKirim;
    }

    public void kirimNotifikasi() {
        System.out.println("Notifikasi terkirim pada anggota dengan ID :" + idAnggota);
    }

    public int getIdNotifikasi() {
        return idNotifikasi;
    }

    public void setIdNotifikasi(int idNotifikasi) {
        this.idNotifikasi = idNotifikasi;
    }

    public int getIdAnggota() {
        return idAnggota;
    }

    public void setIdAnggota(int idAnggota) {
        this.idAnggota = idAnggota;
    }

    public String getIsiNotifikasi() {
        return isiNotifikasi;
    }

    public void setIsiNotifikasi(String isiNotifikasi) {
        this.isiNotifikasi = isiNotifikasi;
    }

    public Date getTanggalKirim() {
        return tanggalKirim;
    }

    public void setTanggalKirim(Date tanggalKirim) {
        this.tanggalKirim = tanggalKirim;
    }
    
    
}
