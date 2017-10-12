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
/**
 *
 * @author USER
 */
class AkunInventory {
    
    Connection connect = null;
    Statement statement;
    ResultSet resultset;
    
    public AkunInventory(){
    }
    
     public boolean nyambung(){
         try {
            connection = DriverManager.getConnection("jdbc:ucanaccess://"+"E:/Inventory.accdb;","","");
            
             statement = connect.createStatement();
            
            return true;
            
            } catch (SQLException errMsg) {   
             System.out.println("ada kesalahan : "+ errMsg.getMessage());
               
             return false;
            }
    }
    
    public String query(String sql,String dicari){
        boolean connect = nyambung();
                
        if(connect){
            try {
                resultset = statement.executeQuery(sql);
                while (resultset.next() == true){
                String a = resultset.getString(dicari);
                return a;
                }               

                } catch (SQLException errMsg) {    
                 System.out.println("ada kesalahan : "+ errMsg.getMessage());

                 return "";
                }
        }
        return"";
    }
    
}
