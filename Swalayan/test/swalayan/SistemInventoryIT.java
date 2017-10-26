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
        DataBarang ins = new DataBarang();
        SistemInventory instance = new SistemInventory(username);
        int awal = 0, akhir = 0;
        System.out.println("tambahBarang");
        String kode = "10";
        String nama = "Tes";
        String kategori = "ATK";
        String harga = "50000";
        String stock = "3";
        String ms = "0";
        String rp = "2";
        awal = ins.getTotal(kode, kategori, nama, harga, stock, ms, rp);
        boolean expResult = true;
        boolean result = instance.tambahBarang(kode, nama, kategori, harga, stock, ms, rp);
        akhir = ins.getTotal(kode, kategori, nama, harga, stock, ms, rp);
        System.out.println("a"+akhir);
        assertEquals(akhir, awal+1);
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
        String exp = "1", res = "";
        Object[][] result = instance.lihatBarang();
        res = result[0][0].toString();
        assertEquals(exp, res);
        // TODO review the generated test code and remove the default call to fail;
    }

    /**
     * Test of updateBarang method, of class SistemInventory.
     */
    @Test
    public void testUpdateBarang() {
        DataBarang ins = new DataBarang();
        SistemInventory instance = new SistemInventory(username);
        int awal = 0, akhir = 0;
        System.out.println("updateBarang");
        String kode = "4";
        String nama = "Buku";
        String kategori = "ATKs";
        String harga = "4500";
        String stock = "10";
        String ms = "2";
        String rp = "200";
        awal = ins.getTotal(kode, kategori, nama, harga, stock, ms, rp);
        boolean expResult = true;
        boolean result = instance.updateBarang(kode, nama, kategori, harga, stock, ms, rp);
        akhir = ins.getTotal(kode, kategori, nama, harga, stock, ms, rp);
        //System.out.println(awal+"-"+akhir);
        assertEquals(akhir, awal+1);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of hapusBarang method, of class SistemInventory.
     */
    @Test
    public void testHapusBarang() {
        DataBarang ins = new DataBarang();
        SistemInventory instance = new SistemInventory(username);
        int awal = 0, akhir = 0;
        int awal2 = 0, akhir2 = 0;
        System.out.println("hapusBarang");
        String kode = "10";
        awal = ins.getTotal2(kode);
        awal2 = ins.getTotal3();
        boolean expResult = true;
        boolean result = instance.hapusBarang(kode);
        akhir = ins.getTotal2(kode);
        akhir2 = ins.getTotal3();
//        System.out.println("-"+awal);
//        System.out.println("-"+akhir);
        assertEquals(akhir, awal-1);
        assertEquals(akhir2, awal2-1);
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
