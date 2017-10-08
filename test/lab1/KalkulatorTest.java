/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author krymu
 */
public class KalkulatorTest {
    
    public KalkulatorTest() {
    }


    /**
     * Test of checkIfValid method, of class Kalkulator.
     */
    @Test
    public void testCheckIfValid1() {
        System.out.println("checkIfValid1");
        String pesel = "96061708210";
        Boolean expResult = true;
        Boolean result = Kalkulator.checkIfValid(pesel);
        assertEquals(expResult, result);
    }
     @Test
    public void testCheckIfValid2() {
        System.out.println("checkIfValid2");
        String pesel = "9606170821";
        Boolean expResult = false;
        Boolean result = Kalkulator.checkIfValid(pesel);
        assertEquals(expResult, result);
    }
     @Test
    public void testCheckIfValid3() {
        System.out.println("checkIfValid3");
        String pesel = "960617082103";
        Boolean expResult = false;
        Boolean result = Kalkulator.checkIfValid(pesel);
        assertEquals(expResult, result);
    }
        public void testCheckIfValid4() {
        System.out.println("checkIfValid4");
        String pesel = "44051401358";
        Boolean expResult = false;
        Boolean result = Kalkulator.checkIfValid(pesel);
        assertEquals(expResult, result);
    }

    /**
     * Test of showGender method, of class Kalkulator.
     */
    @Test
    public void testShowGender() {
        System.out.println("showGender");
        String pesel = "96061708210";
        Kalkulator.showGender(pesel);
    }

    /**
     * Test of showBirthday method, of class Kalkulator.
     */
    @Test
    public void testShowBirthday() {
        System.out.println("showBirthday");
        String pesel = "96061708210";
        Kalkulator.showBirthday(pesel);
        
    }
    
}
