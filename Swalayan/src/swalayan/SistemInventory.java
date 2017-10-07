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
    
    public void menampilkanHalamanBarang(){
        HalamanBarang hlmB = new HalamanBarang();
        hlmB.setVisible(true);
        hlmB.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
}
