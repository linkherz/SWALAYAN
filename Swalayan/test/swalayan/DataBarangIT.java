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
public class DataBarangIT {
    
    public DataBarangIT() {
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
     * Test of connectDB method, of class DataBarang.
     */
    @Test
    public void testConnectDB() {
        System.out.println("connectDB");
        DataBarang instance = new DataBarang();
        boolean expResult = true;
        boolean result = instance.connectDB();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of lihatBarang method, of class DataBarang.
     */
    @Test
    public void testLihatBarang() {
        System.out.println("lihatBarang");
        DataBarang instance = new DataBarang();
        Object[][] expResult = null;
        Object[][] result = instance.lihatBarang();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of crdBarang method, of class DataBarang.
     */
    @Test
    public void testCrdBarang() {
        System.out.println("crdBarang");
        String sql = "";
        DataBarang instance = new DataBarang();
        boolean expResult = false;
        boolean result = instance.crdBarang(sql);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
