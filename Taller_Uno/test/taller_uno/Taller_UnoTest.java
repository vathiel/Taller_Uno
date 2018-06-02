/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller_uno;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author BrayanHR09
 */
public class Taller_UnoTest {
    
    public Taller_UnoTest() {
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
     * Test of main method, of class Taller_Uno.
     */
 /**   @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Taller_Uno.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
*/
    /**
     * Test of contCaracteres method, of class Taller_Uno.
     */
    @Test
    public void testContCaracteres() {
        System.out.println("contCaracteres");
        String frase = "hola mundo";
        int expResult = 10;
        int result = Taller_Uno.contCaracteres(frase);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result !=expResult){
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of contEspacios method, of class Taller_Uno.
     */
    @Test
    public void testContEspacios() {
        System.out.println("contEspacios");
        String frase = "hola mundo";
        int expResult = 1;
        int result = Taller_Uno.contEspacios(frase);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result !=expResult){
            fail("The test case is a prototype.");
        }
        
    }

    /**
     * Test of contPalabras method, of class Taller_Uno.
     */
    @Test
    public void testContPalabras() {
        System.out.println("contPalabras");
        String frase = "hola mundo";
        int expResult = 2;
        int result = Taller_Uno.contPalabras(frase);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result !=expResult){
            fail("The test case is a prototype.");
        }
    }
    
}
