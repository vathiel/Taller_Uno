/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package talleruno;

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
public class TallerUnoTest {
    
    public TallerUnoTest() {
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
     * Test of main method, of class TallerUno.
     */
   /**   @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        TallerUno.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
*/
    /**
     * Test of contCaracteres method, of class TallerUno.
     */
    @Test
    public void testContCaracteres() {
        System.out.println("contCaracteres");
        String frase = "hola mundo";
        int expResult = 10;
        int result = TallerUno.contCaracteres(frase);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result !=expResult){
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of contEspacios method, of class TallerUno.
     */
    @Test
    public void testContEspacios() {
        System.out.println("contEspacios");
        String frase = "hola mundo";
        int expResult = 1;
        int result = TallerUno.contEspacios(frase);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result !=expResult){
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of contPalabras method, of class TallerUno.
     */
    @Test
    public void testContPalabras() {
        System.out.println("contPalabras");
        String frase = "hola mundo";
        int expResult = 2;
        int result = TallerUno.contPalabras(frase);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result !=expResult){
            fail("The test case is a prototype.");
        }
    }
    
}
