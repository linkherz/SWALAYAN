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

/**
 *
 * @author Usui Takumi
 */
public class AkunInventory {
    Connection connection;
    Statement stmt;
    ResultSet akun;
    boolean connect;
    
    public AkunInventory(){
//        akun        = null;
//        stmt        = null;
        connection  = null;
        connect     = false;
    }
    
    public boolean connectDB(){
        try {
            connection = DriverManager.getConnection("jdbc:ucanaccess://E:/Inventory.accdb","","");
            System.out.println("Connection Success AkunInventory.connectDB");
            stmt = connection.createStatement();
            return true;
        } catch (SQLException errMsg) {
            System.out.println("Kesalahan AkunInventory.connectDB : " + errMsg.getMessage());
            return false;
        }
    }
    
    public String getAkun(String username, String password, String dicari) {
        boolean connect = connectDB();
        String sql = "SELECT * FROM Account WHERE Username = '"+username+"' AND Password = '"+password+"'";
        //String sql = "SELECT * FROM Account WHERE Username = 'user' AND Password = 'user'";
        System.out.println(sql);
        if(connect){
            try {
                akun = stmt.executeQuery(sql);
                akun.next();
                String x = akun.getString(dicari);
                System.out.println(x);
                return x;
            } catch (SQLException errMsg) {
                System.out.println("Kesalahan AkunInventory.getAkun : " + errMsg.getMessage());
                errMsg.printStackTrace();
                return "";
            }
        }
        return "";
    }
    
    public boolean tambahAkun(String sql){
        connect = connectDB();
        if(connect){ //kalau bisa konek
            try {
                int berhasil = stmt.executeUpdate(sql);
                return true;
            } catch (SQLException errMsg) {
                System.out.println("Kesalahan AkunInventory.tembahAkun : " + errMsg.getMessage());
                return false;
            }
        } else return false;
    }
    
//    public Object[][] lihatAkun(int index){
//        connect = connectDB();
//        Object[][] dataAkun = new Object[10][4];
//        if(connect){ //kalau bisa konek
//            try {
//                ResultSet rsAkun = stmt.executeQuery("SELECT * from InventoryAccount");
//                for (int i = 0; i < dataAkun.length; i++) rsAkun.next();
//                for (int i = 0; i < dataAkun.length; i++) {
//                    if(rsAkun.next()) {
//                        dataAkun[i][0] = rsAkun.getString("Username");
//                        dataAkun[i][1] = rsAkun.getString("Password");
//                        dataAkun[i][2] = rsAkun.getString("Nama");
//                        dataAkun[i][3] = rsAkun.getString("Role");
//                    } else break;
//                }
//            } catch (SQLException errMsg) {
//                System.out.println("Kesalahan AkunInventory.lihatAkun : " + errMsg.getMessage());
//                Logger.getLogger(AkunInventory.class.getName()).log(Level.SEVERE, null, errMsg);
//            }
//        }
//        return dataAkun;
//    }
    
    public boolean ubahAkun(String sql){
        connect = connectDB();
        if(connect){ //kalau bisa konek
            try {
                int berhasil = stmt.executeUpdate(sql);
                return true;
            } catch (SQLException errMsg) {
                System.out.println("Kesalahan AkunInventory.ubahAkun : " + errMsg.getMessage());
                return false;
            }
        } else return false;
    }
    
    public boolean hapusAkun(String sql){
        connect = connectDB();
        if(connect){ //kalau bisa konek
            try {
                int berhasil = stmt.executeUpdate(sql);
                return true;
            } catch (SQLException errMsg) {
                System.out.println("Kesalahan AkunInventory.hapusAkun : " + errMsg.getMessage());
                return false;
            }
        } else return false;
    }
}
