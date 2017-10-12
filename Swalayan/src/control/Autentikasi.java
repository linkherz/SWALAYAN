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
    
    public void verifikasi(){

        String User = database.query("Select Username FROM Account","username");
        String Password = database.query("Select Password FROM Account","password");
                
        if((User.equals(user)) && (Password.equals(password)))
            return true;
        else return false;
        
    }
    
    public void halamanSystem(){
        HalamanSistemInventory guiInv = new HalamanSistemInventory();
        guiInv.setVisible(true);
    }
    
    public void halamanAdmin(){
        HalamanAdminInventory guiAdm = new HalamanAdminInventory();
        guiAdm.setVisible(true);
    }
    
    public void logOut(){
        HalamanLogin guiLout = new HalamanLogin();
        guiLout.setVisible(true);
    }
}
