/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swalayan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usui Takumi
 */
public class DataBarang {    
    private Connection connection;
    private Statement stmt;
    private ResultSet data;
    private boolean connect;
    
    public DataBarang(){
        connection  = null;
        connect     = false;
    }
    
    public boolean connectDB(){
        try {
            connection = DriverManager.getConnection("jdbc:ucanaccess://E:/Inventory.accdb","","");
            System.out.println("Connection Success DataBarang.connectDB");
            stmt = connection.createStatement();
            return true;
        } catch (SQLException errMsg) {
            System.out.println("Kesalahan DataBarang.connectDB : " + errMsg.getMessage());
            return false;
        }
    }
    
//    public boolean tambahBarang(String kode, String nama, String kategori, String harga, String stock, String ms, String rp){
//        connect = connectDB();
//        if(connect){ //kalau bisa konek
//            try {
//                String sql="INSERT INTO Inventory (Kode, NamaBRG, Kategori, Harga, Stock, MS, RP) VALUES"
//                    +"('"+kode+"',"
//                    +"'"+nama+"',"
//                    + "'"+kategori+"',"
//                    + "'"+harga+"',"
//                    + "'"+stock+"',"
//                    + "'"+ms+"',"
//                    +"'"+rp+"')";
//                int berhasil = stmt.executeUpdate(sql);
//                return true;
//            } catch (SQLException errMsg) {
//                System.out.println("Kesalahan DataBarang.tambahBarang : " + errMsg.getMessage());
//                return false;
//            }
//        } else return false;
//    }
    
    public Object[][] lihatBarang(){
        connect = connectDB();
        Object[][] dataBarang = new Object[10][7];
        if(connect){ //kalau bisa konek
            try {
                ResultSet rsBarang = stmt.executeQuery("SELECT * from Inventory");
//                for (Object[] dataBarang1 : dataBarang) {rsAkun.next();}
                for (int i = 0; i < dataBarang.length; i++) {
                    if(rsBarang.next()) {
                        dataBarang[i][0] = rsBarang.getString("Kode");
                        dataBarang[i][1] = rsBarang.getString("NamaBRG");
                        dataBarang[i][2] = rsBarang.getString("Kategori");
                        dataBarang[i][3] = rsBarang.getString("Harga");
                        dataBarang[i][4] = rsBarang.getString("Stock");
                        dataBarang[i][5] = rsBarang.getString("MS");
                        dataBarang[i][6] = rsBarang.getString("RP");
                    } else break;
                }
            } catch (SQLException errMsg) {
                System.out.println("Kesalahan DataBarang.lihatBarang : " + errMsg.getMessage());
                Logger.getLogger(AkunInventory.class.getName()).log(Level.SEVERE, null, errMsg);
            }
        }
        return dataBarang;
    }
    
//    public boolean ubahBarang(String kode, String nama, String kategori, String harga, String stock, String ms, String rp){
//        connect = connectDB();
//        if(connect){ //kalau bisa konek
//            try {
//                String sql="UPDATE Inventory SET "
//                    +"NamaBRG = '"+nama+"',"
//                    +"Kategori = '"+kategori+"',"
//                    +"Harga = '"+harga+"',"
//                    +"Stock = '"+stock+"',"
//                    +"MS = '"+ms+"',"
//                    +"RP = '"+rp+"' "
//                    +"WHERE Kode = '"+kode+"';";
//                
//                int berhasil = stmt.executeUpdate(sql);
//                return true;
//            } catch (SQLException errMsg) {
//                System.out.println("Kesalahan DataBarang.ubahBarang : " + errMsg.getMessage());
//                return false;
//            }
//        } else return false;
//    }
    
//    public boolean hapusBarang(String kode){
//        connect = connectDB();
//        if(connect){ //kalau bisa konek
//            try {
//                int berhasil = stmt.executeUpdate("DELETE FROM Inventory WHERE kode='"+kode+"';");
//                return true;
//            } catch (SQLException errMsg) {
//                System.out.println("Kesalahan DataBarang.hapusBarang : " + errMsg.getMessage());
//                return false;
//            }
//        } else return false;
//    }
    
    public int getTotal(String Kode, String Kategori, String Nama, String Harga, String Stock, String MS, String RP){
        connect = connectDB();
        if(connect) {
            try {
                int row = 0;
                String sql = "SELECT COUNT(*) AS total FROM Inventory WHERE " +
                        " Kode = '" + Kode + 
                        "' AND Kategori = '" + Kategori +
                        "' AND NamaBRG = '" + Nama +
                        "' AND Harga = '" + Harga + 
                        "' AND Stock = '" + Stock + 
                        "' AND MS = '" + MS + 
                        "' AND RP = '" + RP + 
                        "'";
                ResultSet rsBarang = stmt.executeQuery(sql);
                if(rsBarang.next())
                {
                    row = rsBarang.getInt("total");
                }
                return row;
            } catch (SQLException errMsg) {
                System.out.println("Kesalahan DataBarang.getTotal : " + errMsg.getMessage());
                return 0;
            }
        } else {
            return 0;
        }
    }
    
    //public int getTotal(String Kode, String Kategori, String Nama, String Harga, String Stock, String MS, String RP){
    public int getTotal2(String Kode){
        connect = connectDB();
        if(connect) {
            try {
                int row = 0;
                String sql = "SELECT COUNT(*) AS total FROM Inventory WHERE " +
                        " Kode = '" + Kode + "'";
                ResultSet rsBarang = stmt.executeQuery(sql);
                if(rsBarang.next())
                {
                    row = rsBarang.getInt("total");
                }
                return row;
            } catch (SQLException errMsg) {
                System.out.println("Kesalahan DataBarang.getTotal2 : " + errMsg.getMessage());
                return 0;
            }
        } else {
            return 0;
        }
    }
    
    public int getTotal3(){
        connect = connectDB();
        if(connect) {
            try {
                int row = 0;
                String sql = "SELECT COUNT(*) AS total FROM Inventory";
                ResultSet rsBarang = stmt.executeQuery(sql);
                if(rsBarang.next())
                {
                    row = rsBarang.getInt("total");
                }
                return row;
            } catch (SQLException errMsg) {
                System.out.println("Kesalahan DataBarang.getTotal2 : " + errMsg.getMessage());
                return 0;
            }
        } else {
            return 0;
        }
    }
    
    public boolean crdBarang(String sql){
        connect = connectDB();
        if(connect){ //kalau bisa konek
            try {
                int berhasil = stmt.executeUpdate(sql);
                return true;
            } catch (SQLException errMsg) {
                System.out.println("Kesalahan DataBarang.crdBarang : " + errMsg.getMessage());
                return false;
            }
        } else return false;
    }
}
