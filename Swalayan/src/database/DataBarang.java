/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swalayanControl;

/**
 *
 * @author USER
 */
class DataBarang {
    private String kodeBarang;
    private String namaBarang;
    private String Kategori;
    private String Harga;
    private String Stock;
    private String jumlahMS;
    private String jumlahRP;
    public DataBarang(){}

    public DataBarang(String kode, String namabrg, String kategori, String harga, String stock, String jumlahms, String jumlahrp) {
        this.kodeBarang = kode;
        this.namaBarang = namabrg;
        this.Kategori = kategori;
        this.Harga = harga;
        this.Stock = stock;
        this.jumlahMS = jumlahms;
        this.jumlahRP = jumlahrp;
    }
    
    
    public String getkodeBarang() {
        return kodeBarang;
    }

   
    public void setkodeBarang(String kodeBarang) {
        this.kodeBarang = kodeBarang;
    }

    public String getnamaBarang() {
        return namaBarang;
    }

    public void setnamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public String getKategori() {
        return Kategori;
    }

    public void setKategori(String Kategori) {
        this.Kategori = Kategori;
    }

    public String getHarga() {
        return Harga;
    }

   
    public void setHarga(String Harga) {
        this.Harga = Harga;
    }
    
    public String getStock() {
        return Stock;
    }
    
    public void setStock (String Stock) {
        this.Stock = Stock;
    }
    
    public String getjumlahMS(){
        return jumlahMS;
    }
    
    public void setjumlahMS(String jumlahMs) {
        this.jumlahMS = jumlahMs;
    }
    
    public String getjumlahRP(){
        return jumlahRP;
    }
    
    public void setjumlahRP (String jumlahRP){
        this.jumlahRP = jumlahRP;
    }
}
