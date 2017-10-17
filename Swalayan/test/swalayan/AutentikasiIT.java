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
public class AutentikasiIT {
    
    public AutentikasiIT() {
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
     * Test of login method, of class Autentikasi.
     */
    @Test
    public void testLogin() {
        System.out.println("login");
        String user = "luqman";
        String pass = "321";
        Autentikasi instance = new Autentikasi();
        boolean expResult = true;
        boolean result = instance.login(user, pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of menampilkanHalamanSistemInventory method, of class Autentikasi.
     */
    @Test
    public void testMenampilkanHalamanSistemInventory() {
        System.out.println("menampilkanHalamanSistemInventory");
        String u = "user";
        Autentikasi instance = new Autentikasi();
        instance.menampilkanHalamanSistemInventory(u);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of menampilkanHalamanSistemAdminInventory method, of class Autentikasi.
     */
    @Test
    public void testMenampilkanHalamanSistemAdminInventory() {
        System.out.println("menampilkanHalamanSistemAdminInventory");
        String u = "admin";
        Autentikasi instance = new Autentikasi();
        instance.menampilkanHalamanSistemAdminInventory(u);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
