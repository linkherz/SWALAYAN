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
import swalayan.HalamanAdminInventory;
import swalayan.HalamanLogin;
import swalayan.HalamanSistemInventory;
import swalayanControl.AkunInventory;


/**
 *
 * @author USER
 */

public class Autentikasi {
    private ArrayList<AkunInventory> list = new ArrayList<AkunInventory>();
        String [] title ={""};
    private Connection connection;
    private Statement statment;
    private ResultSet resultAutentikasi;
    private String user;
    private String pass;
    
        public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
    
    public Autentikasi() {
        try {
            connection = DriverManager.getConnection("jdbc:ucanaccess://" + "D:/Kuliah/Semester 5/KPPL/Inventory.accdb;","", "");
            System.out.println("Berhasil Konek");
            
            statment = connection.createStatement();
            resultAutentikasi = statment.executeQuery("SELECT * FROM Account");
            while (resultAutentikasi.next() == true){
                list.add(new AkunInventory(resultAutentikasi.getString("Username"),
                        resultAutentikasi.getString("Password"),
                        resultAutentikasi.getString("Nama"),
                        resultAutentikasi.getString("Role")));
            }
        } catch (SQLException errMsg){
            System.out.println(errMsg.getMessage());
        }
    }
    
    public void verifikasi(){
        AkunInventory verify = new AkunInventory();
        String sql ;
        
        sql = "SELECT *" +"FROM Account" + 
                "WHERE ('" + user + "',"
                + "'" + pass + "');";
        
        System.out.println(sql);
        verify.setUsername(user);
        verify.setPassword(pass);
        this.list.add(verify);
        
//        if (role.contains("admin")) {
//            halamanAdmin();
//        }else if (role.contains("personal")) {
//            halamanSystem();
//        }
    }
    private void halamanSystem(){
        HalamanSistemInventory guiInv = new HalamanSistemInventory();
        guiInv.setVisible(true);
    }
    private void halamanAdmin(){
        HalamanAdminInventory guiAdm = new HalamanAdminInventory();
        guiAdm.setVisible(true);
    }
    public void logOut(){
        HalamanLogin guiLout = new HalamanLogin();
        guiLout.setVisible(true);
    }
}
