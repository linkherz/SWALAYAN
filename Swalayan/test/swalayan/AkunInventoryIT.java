/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swalayan;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usui Takumi
 */
public class AkunInventoryIT {
    
    public AkunInventoryIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of connectDB method, of class AkunInventory.
     */
    @Test
    public void testConnectDB() {
        System.out.println("connectDB");
        AkunInventory instance = new AkunInventory();
        boolean expResult = true;
        boolean result = instance.connectDB();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getAkun method, of class AkunInventory.
     */
    @Test
    public void testGetAkun() {
        System.out.println("getAkun");
        String username = "na_rendra";
        String password = "456";
        String dicari = "Role";
        AkunInventory instance = new AkunInventory();
        String expResult = "admin";
        String result = instance.getAkun(username, password, dicari);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }
    @Test
    public void testGetAkun2() {
        System.out.println("getAkun2");
        String username = "dimcan";
        String password = "789";
        String dicari = "Role";
        AkunInventory instance = new AkunInventory();
        String expResult = "user";
        String result = instance.getAkun(username, password, dicari);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of tambahAkun method, of class AkunInventory.
     */
    @Test
    public void testTambahAkun() {
        System.out.println("tambahAkun");
        String sql = "INSERT INTO Account VALUES ('kppwqze', '156', 'nama', 'user');";
        AkunInventory instance = new AkunInventory();
        boolean expResult = true;
        boolean result = instance.tambahAkun(sql);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
    public void testTambahAkun2() {
        System.out.println("tambahAkun2");
        String sql = "INSERT INTO Account VALUES ('kppwqze', '156', 'nama', 'user');";
        AkunInventory instance = new AkunInventory();
        boolean expResult = false;
        boolean result = instance.tambahAkun(sql);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
    public void testTambahAkun3() {
        System.out.println("tambahAkun3");
        String sql = "INSERT INTO Account VALUES ('kppwqze', '156', 'kfssel', 'user', '19');";
        AkunInventory instance = new AkunInventory();
        boolean expResult = false;
        boolean result = instance.tambahAkun(sql);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of ubahAkun method, of class AkunInventory.
     */
    @Test
    public void testUbahAkun() {
        System.out.println("ubahAkun");
        String sql = "UPDATE Account SET Password = '456' WHERE Username = 'na_rendra';";
        AkunInventory instance = new AkunInventory();
        boolean expResult = true;
        boolean result = instance.ubahAkun(sql);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of hapusAkun method, of class AkunInventory.
     */
    @Test
    public void testHapusAkun() {
        System.out.println("hapusAkun");
        String sql = "DELETE FROM Account WHERE Username='kppwqze';";
        AkunInventory instance = new AkunInventory();
        boolean expResult = true;
        boolean result = instance.hapusAkun(sql);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
}
