/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swalayanControl;

import database.DataBarang;

/**
 *
 * @author USER
 */
public class SistemInvrntory {
    
    private DataBarang database;
    
    public SistemInvrntory(){
        
        database = new DataBarang();
        
    }
    
    public void Barang(){
        HalamanBarang guiBrg = new HalamanBarang();
        guiBrg.setVisible(true);
    
    }
    
    public boolean Buat(String kode,String nama,String kategori,String harga,String stock,String ms,String rp){
        boolean Sql = false;
        
        String sql="Insert Into Inventory (Kode, NamaBRG, Kategori, Harga, Stock, JumlahMS, JumlahRP) Values"
                +"('"+kode+"',"
                +"'"+nama+"',"
                + "'"+kategori+"',"
                + "'"+harga+"',"
                + "'"+stock+"',"
                + "'"+ms+"',"
                +"'"+rp+"')";
        
        Sql = database.InputBarang(sql);
        
        return false;     
    }
    
    public Object[] LihatLog(int index){
                
        Object[] data = new Object[5];
      
        data = database.LihatTabel(index);
                
        return data;
    }
    
}   
