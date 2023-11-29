/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaanorang;

/**
 *
 * @author ACER
 */
public class Admin {
    private int idAdmin;
    private String namaAdmin;

    public Admin(int idAdmin, String namaAdmin) {
        this.idAdmin = idAdmin;
        this.namaAdmin = namaAdmin;
    }

    public void kelolaBuku() {
        System.out.println("Admin \"" + namaAdmin + "\" menambahkan buku baru.");
    }

    public void kelolaAnggota() {
        System.out.println("Admin \"" + namaAdmin + "\" mengelola anggota perpustakaan.");
    }

    public int getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }

    public String getNamaAdmin() {
        return namaAdmin;
    }

    public void setNamaAdmin(String namaAdmin) {
        this.namaAdmin = namaAdmin;
    }
}
