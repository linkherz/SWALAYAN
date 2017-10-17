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
public class SistemInventoryIT {
    
    public SistemInventoryIT() {
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
     * Test of tambahBarang method, of class SistemInventory.
     */
    @Test
    public void testTambahBarang() {
        System.out.println("tambahBarang");
        String kode = "";
        String nama = "";
        String kategori = "";
        String harga = "";
        String stock = "";
        String ms = "";
        String rp = "";
        SistemInventory instance = null;
        boolean expResult = false;
        boolean result = instance.tambahBarang(kode, nama, kategori, harga, stock, ms, rp);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of lihatBarang method, of class SistemInventory.
     */
    @Test
    public void testLihatBarang() {
        System.out.println("lihatBarang");
        SistemInventory instance = null;
        Object[][] expResult = null;
        Object[][] result = instance.lihatBarang();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateBarang method, of class SistemInventory.
     */
    @Test
    public void testUpdateBarang() {
        System.out.println("updateBarang");
        String kode = "";
        String nama = "";
        String kategori = "";
        String harga = "";
        String stock = "";
        String ms = "";
        String rp = "";
        SistemInventory instance = null;
        boolean expResult = false;
        boolean result = instance.updateBarang(kode, nama, kategori, harga, stock, ms, rp);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hapusBarang method, of class SistemInventory.
     */
    @Test
    public void testHapusBarang() {
        System.out.println("hapusBarang");
        String kode = "";
        SistemInventory instance = null;
        boolean expResult = false;
        boolean result = instance.hapusBarang(kode);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of menampilkanHalamanBarang method, of class SistemInventory.
     */
    @Test
    public void testMenampilkanHalamanBarang() {
        System.out.println("menampilkanHalamanBarang");
        SistemInventory instance = null;
        instance.menampilkanHalamanBarang();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
