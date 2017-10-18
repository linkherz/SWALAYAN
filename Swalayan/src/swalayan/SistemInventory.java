/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swalayan;

import javax.swing.JFrame;

/**
 *
 * @author Usui Takumi
 */
public class SistemInventory {
    
    private String username;
    private DataBarang data;
    
    public SistemInventory(String u) {
        this.username = u;
        data = new DataBarang();
    }
    
    public boolean tambahBarang(String kode, String nama, String kategori, String harga, String stock, String ms, String rp){
        String sql="INSERT INTO Inventory (Kode, NamaBRG, Kategori, Harga, Stock, MS, RP) VALUES"
                +"('"+kode+"',"
                +"'"+nama+"',"
                + "'"+kategori+"',"
                + "'"+harga+"',"
                + "'"+stock+"',"
                + "'"+ms+"',"
                +"'"+rp+"')";
        
        boolean tambah = data.crdBarang(sql);
        return tambah;
    }
    
    public Object[][] lihatBarang(){
        Object[][] dataB = new Object[15][7];
        dataB = data.lihatBarang();
        return dataB;
    }
    
    public boolean updateBarang(String kode, String nama, String kategori, String harga, String stock, String ms, String rp){
        
        String sql="UPDATE Inventory SET "
                +"NamaBRG = '"+nama+"',"
                +"Kategori = '"+kategori+"',"
                +"Harga = '"+harga+"',"
                +"Stock = '"+stock+"',"
                +"MS = '"+ms+"',"
                +"RP = '"+rp+"' "
                +"WHERE Kode = '"+kode+"';";
        
        boolean update = data.crdBarang(sql);
        return update;
    }
    
    public boolean hapusBarang(String kode){
        String sql="DELETE FROM Inventory WHERE Kode = '"+kode+"';"; 
        
        boolean hapus = data.crdBarang(sql);
        return hapus;
    }
    
    public void menampilkanHalamanBarang(){
        HalamanBarang hlmB = new HalamanBarang(username);
        hlmB.setVisible(true);
        hlmB.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    
    public void menampilkanHalamanLogin(){
        HalamanLogin hlmL = new HalamanLogin();
        hlmL.setVisible(true);
        hlmL.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
}
