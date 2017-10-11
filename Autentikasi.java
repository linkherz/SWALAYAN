/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swalayanControl;

import swalayanControl.AkunInventory;


/**
 *
 * @author USER
 */

public class Autentikasi {
    private AkunInventory database;
    
    public Autentikasi() {
        database = new AkunInventory();
        
    }
    
    public boolean Autentikasi(String user, String password) {
        
        String User = database.ambilData("Select Username FROM Account","username");
        String Password = database.ambilData("Select Password FROM Account","password");
        
         System.out.println(User);
         System.out.println(Password);
        
        if((User.equals(user)) && (Password.equals(password)))
            return true;
        else return false;
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
