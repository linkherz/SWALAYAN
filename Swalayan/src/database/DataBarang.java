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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */
class DataBarang {
   
    Connection connection;
    Statement statement;
    ResultSet resultset;
    boolean connect;
    
    public DataBarang(){
    
    }
    
    public boolean nyambung(){
         try {
            
             connection = DriverManager.getConnection("jdbc:ucanaccess://"+"F:/Inventory.accdb;","","");
             statement = connection.createStatement();
            
            return true;
            
        } catch (SQLException errMsg) {
           System.out.println("ada kesalahan : "+ errMsg.getMessage());
           return false;
        }
    }
    
    public boolean InputBarang(String sql){
        connect = nyambung();
        
        if(connect){
            try{
               int berhasil = statement.executeUpdate(sql);

                return true;

            }
            catch (SQLException errMsg) {
               System.out.println("ada kesalahan : "+ errMsg.getMessage());

            return false;
            }
        } else return false;
    }
    
    public Object[] LihatTabel(int index){
        connect=nyambung();
        
        Object[] data = new Object[7];
        
        if(connect){
            try {
                ResultSet rsLogTransaksi = statement.executeQuery("SELECT * from Inventory");
                rsLogTransaksi.next();
                        data[0]=rsLogTransaksi.getString("Kode");
                        data[1]=rsLogTransaksi.getString("NamaBRG");
                        data[2]=rsLogTransaksi.getString("Kategori");
                        data[3]=rsLogTransaksi.getString("Harga");
                        data[4]=rsLogTransaksi.getString("Stock");
                        data[5]=rsLogTransaksi.getString("JumlahMS");
                        data[6]=rsLogTransaksi.getString("JumlahRP");
            } catch (SQLException ex) {
                Logger.getLogger(Test2DB.class.getName()).log(Level.SEVERE, null, ex);
            }
        } return data;
    }
    
}
