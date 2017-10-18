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
    
    private static String username;
    
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
        String kode = "9";
        String nama = "tes";
        String kategori = "kategori";
        String harga = "100";
        String stock = "2";
        String ms = "4";
        String rp = "5";
        SistemInventory instance = new SistemInventory(username);
        boolean expResult = true;
        boolean result = instance.tambahBarang(kode, nama, kategori, harga, stock, ms, rp);
        assertEquals(expResult, result);
        // habis create harus dihapus
        //boolean hapus = instance.hapusBarang(kode);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of lihatBarang method, of class SistemInventory.
     */
    @Test
    public void testLihatBarang() {
        System.out.println("lihatBarang");
        SistemInventory instance = new SistemInventory(username);
        Object[][] expResult = null;
        Object[][] result = instance.lihatBarang();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of updateBarang method, of class SistemInventory.
     */
    @Test
    public void testUpdateBarang() {
        System.out.println("updateBarang");
        String kode = "9";
        String nama = "tesnya";
        String kategori = "kategorinya";
        String harga = "2";
        String stock = "20";
        String ms = "2";
        String rp = "200";
        SistemInventory instance = new SistemInventory(username);
        boolean expResult = true;
        boolean result = instance.updateBarang(kode, nama, kategori, harga, stock, ms, rp);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of hapusBarang method, of class SistemInventory.
     */
    @Test
    public void testHapusBarang() {
        System.out.println("hapusBarang");
        String kode = "9";
        SistemInventory instance = new SistemInventory(username);
        boolean expResult = true;
        boolean result = instance.hapusBarang(kode);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    
    }

    /**
     * Test of menampilkanHalamanBarang method, of class SistemInventory.
     */
    @Test
    public void testMenampilkanHalamanBarang() {
        System.out.println("menampilkanHalamanBarang");
        SistemInventory instance = new SistemInventory(username);
        instance.menampilkanHalamanBarang();
        // TODO review the generated test code and remove the default call to fail.

    }
    
}
