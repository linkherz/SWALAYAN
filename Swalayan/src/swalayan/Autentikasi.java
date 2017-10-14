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
public class Autentikasi {
    
    private AkunInventory akunInventory;
    
    public Autentikasi(){
        akunInventory = new AkunInventory();
    }
    
    public boolean login(String user, String pass){
        System.out.println("A : "+user+"-"+pass);
        
        String username = akunInventory.getAkun(user, pass, "Username");
        String password = akunInventory.getAkun(user, pass, "Password");
        String role     = akunInventory.getAkun(user, pass, "Role");
           
        if((username.equals(user)) && (password.equals(pass))) {
            if(role.equalsIgnoreCase("admin")) menampilkanHalamanSistemAdminInventory(user);
            else menampilkanHalamanSistemInventory(user);
            
            return true;
        }
        else return false;
    }
    
    public void menampilkanHalamanSistemInventory(String u){
        System.out.println("role : user");
        HalamanSistemInventory hlmSI = new HalamanSistemInventory(u);
        hlmSI.setVisible(true);
        hlmSI.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    
    public void menampilkanHalamanSistemAdminInventory(String u){
        System.out.println("role : admin");
        HalamanAdminInventory hlmAI = new HalamanAdminInventory();
        hlmAI.setVisible(true);
        hlmAI.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
}
