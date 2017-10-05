/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swalayanControl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import swalayan.HalamanBarang;

/**
 *
 * @author USER
 */
public class SistemInvrntory {
    ArrayList<DataBarang> list = new ArrayList<DataBarang>();
        String [] title ={""};
    
    private Connection connection;
    private Statement statment;
    private ResultSet resultSistemInventory;
    private String kode;
    private String namabarang;
    private String kategori;
    private String harga;
    private String stock;
    private String jumlahms;
    private String jumlahrp;

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNamabarang() {
        return namabarang;
    }

    public void setNamabarang(String namabarang) {
        this.namabarang = namabarang;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getJumlahms() {
        return jumlahms;
    }

    public void setJumlahms(String jumlahms) {
        this.jumlahms = jumlahms;
    }

    public String getJumlahrp() {
        return jumlahrp;
    }

    public void setJumlahrp(String jumlahrp) {
        this.jumlahrp = jumlahrp;
    }
    
    public SistemInvrntory(){
        try {
        connection = DriverManager.getConnection("jdbc:ucanaccess://" + "D:/Kuliah/Semester 5/KPPL/Inventory.accdb;","", "");
            System.out.println("Berhasil Konek");
            
            statment = connection.createStatement();
            resultSistemInventory = statment.executeQuery("SELECT * FROM Inventory");
            while (resultSistemInventory.next() == true){
                list.add(new DataBarang(resultSistemInventory.getString("kodeBarang"),
                        resultSistemInventory.getString("namaBarang"),
                        resultSistemInventory.getString("Kategori"),
                        resultSistemInventory.getString("Harga"),
                        resultSistemInventory.getString("Stock"),
                        resultSistemInventory.getString("jumlahMS"),
                        resultSistemInventory.getString("jumlahRP")));
            }
        }   catch (SQLException errMsg){
            System.out.println(errMsg.getMessage());
            }
    }
    public void Barang(){
        HalamanBarang guiBrg = new HalamanBarang();
        guiBrg.setVisible(true);
    }
    public void Buat(){
        String sql ;
        
        sql = "INSERT INTO Inventory (Kode, NamaBRG, Kategori, Harga, Stock, JumlahMS, JumlahRP)" 
                + "VALUES ('" + kode + "',"
                + "'" + namabarang + "',"
                + "'" + kategori + "',"
                + "'" + harga + "',"
                + "'" + stock + "',"
                + "'" + jumlahms + "',"
                + "'" + jumlahrp + "');";
        
        System.out.println(sql);
        try {
        int berhasil = statment.executeUpdate(sql);
        }catch (SQLException errMsg){
            System.out.println(errMsg.getMessage());
        }
        DataBarang barang = new DataBarang();
        barang.setkodeBarang(kode);
        barang.setnamaBarang(namabarang);
        barang.setKategori(kategori);
        barang.setHarga(harga);
        barang.setStock(stock);
        barang.setjumlahMS(jumlahms);
        barang.setjumlahRP(jumlahrp);
        this.list.add(barang);
    }
}
