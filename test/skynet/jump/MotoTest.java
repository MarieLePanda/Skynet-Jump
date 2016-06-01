/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skynet.jump;

import java.util.HashMap;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lucas
 */
public class MotoTest {
    
    public MotoTest() {
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
     * Test of speed method, of class Moto.
     */
    @Test
    public void testSpeed0To1Speed() {
        int expResultSpeed = 1;
        Road road = new Road(16, 2, 16);
        Moto instance = new Moto(0, 0, road);
        instance.speed();
        int resultSpeed = instance.speed;
        assertEquals(expResultSpeed, resultSpeed);
    }

    /**
     * Test of speed method, of class Moto.
     */
    @Test
    public void testSpeed1To1Possition() {
        int expResult = 1;
        Road road = new Road(16, 2, 16);
        Moto instance = new Moto(0, 0, road);
        instance.speed();
        int result = instance.possition;
        assertEquals(expResult, result);
    }

    /**
     * Test of speed method, of class Moto.
     */
    @Test
    public void testSpeed10To11Speed() {
        int expResultSpeed = 11;
        Road road = new Road(16, 2, 16);
        Moto instance = new Moto(10, 0, road);
        instance.speed();
        int resultSpeed = instance.speed;
        assertEquals(expResultSpeed, resultSpeed);
    }
    
    /**
     * Test of speed method, of class Moto.
     */
    @Test
    public void testSpeed10To11Possition() {
        int expResult = 11;
        Road road = new Road(16, 2, 16);
        Moto instance = new Moto(10, 0, road);
        instance.speed();
        int result = instance.possition;
        assertEquals(expResult, result);
    }

    /**
     * Test of speed method, of class Moto.
     */
    @Test
    public void testSpeed50To50Speed() {
        int expResult = 50;
        Road road = new Road(16, 2, 16);
        Moto instance = new Moto(50, 0, road);
        instance.speed();
        int result = instance.speed;
        assertEquals(expResult, result);
    }

    /**
     * Test of speed method, of class Moto.
     */
    @Test
    public void testSpeed50To50Possition() {
        int expResult = 100;
        Road road = new Road(16, 2, 16);
        Moto instance = new Moto(50, 50, road);
        instance.speed();
        int result = instance.possition;
        assertEquals(expResult, result);
    }

    /**
     * Test of slow method, of class Moto.
     */
    @Test
    public void testSlow1To0Speed() {
        int expResult = 0;
        Road road = new Road(16, 2, 16);
        Moto instance = new Moto(1, 0, road);
        instance.slow();
        int result = instance.speed;
        assertEquals(expResult, result);
    }

    /**
     * Test of slow method, of class Moto.
     */
    @Test
    public void testSlow1To0Possition() {
        int expResult = 1;
        Road road = new Road(16, 2, 16);
        Moto instance = new Moto(1, 1, road);
        instance.slow();
        int result = instance.possition;
        assertEquals(expResult, result);
    }

    
    /**
     * Test of slow method, of class Moto.
     */
    @Test
    public void testSlow0To0Speed() {
        int expResult = 0;
        Road road = new Road(16, 2, 16);
        Moto instance = new Moto(1, 0, road);
        instance.slow();
        int result = instance.speed;
        assertEquals(expResult, result);
    }

    /**
     * Test of slow method, of class Moto.
     */
    @Test
    public void testSlow0To0Possition() {
        int expResult = 1;
        Road road = new Road(16, 2, 16);
        Moto instance = new Moto(0, 1, road);
        instance.slow();
        int result = instance.possition;
        assertEquals(expResult, result);
    }
    
    /**
     * Test of slow method, of class Moto.
     */
    @Test
    public void testSlow10To9Speed() {
        int expResult = 9;  
        Road road = new Road(16, 2, 16);
        Moto instance = new Moto(10, 0, road);
        instance.slow();
        int result = instance.speed;
        assertEquals(expResult, result);
    }

    /**
     * Test of slow method, of class Moto.
     */
    @Test
    public void testSlow10To9Possition() {
        int expResult = 9;
        Road road = new Road(16, 2, 16);
        Moto instance = new Moto(10, 0, road);
        instance.slow();
        int result = instance.possition;
        assertEquals(expResult, result);
    }
    
    /**
     * Test of jump method, of class Moto.
     */
    @Test
    public void testJumpSpeed() {
        int expResult = 25;
        Road road = new Road(16, 2, 16);
        Moto instance = new Moto(25, 0, road);
        instance.jump();
        int result = instance.speed;
        assertEquals(expResult, result);
    }

     /**
     * Test of jump method, of class Moto.
     */
    @Test
    public void testJumpPossition() {
        int expResult = 25;
        Road road = new Road(16, 2, 16);
        Moto instance = new Moto(25, 0, road);
        instance.jump();
        int result = instance.possition;
        assertEquals(expResult, result);
    }

    /**
     * Test of nothing method, of class Moto.
     */
    @Test
    public void testNothingSpeed() {
        int expResult = 25;
        Road road = new Road(16, 2, 16);
        Moto instance = new Moto(25, 0, road);
        instance.nothing();
        int result = instance.speed;
        assertEquals(expResult, result);
    }
    
    /**
     * Test of nothing method, of class Moto.
     */
    @Test
    public void testNothingPossition() {
        int expResult = 25;
        Road road = new Road(16, 2, 16);
        Moto instance = new Moto(25, 0, road);
        instance.nothing();
        int result = instance.possition;
        assertEquals(expResult, result);
    }


    /**
     * Test of canJump method, of class Moto.
     */
    @Test
    public void testCanPassTheGap() {
        boolean result;
        Road road = new Road(3, 2, 3);
        Moto instance = new Moto(6, 0, road); 
        result = instance.canJump();
        assertTrue(result);
        
        instance.possition = 1;
        instance.speed = 5;
        result = instance.canJump();
        assertTrue(result);
        
        instance.possition = 2;
        instance.speed = 4;
        result = instance.canJump();
        assertTrue(result);
        
        instance.possition = 3;
        instance.speed = 3;
        result = instance.canJump();
        assertTrue(result);        
    }
    
    
    /**
     * Test of canJump method, of class Moto.
     */
    @Test
    public void testCanNotPassTheGap() {
        boolean result;
        Road road = new Road(3, 2, 3);
        Moto instance = new Moto(4, 0, road); 
        result = instance.canJump();
        assertFalse(result);
        
        instance.possition = 0;
        instance.speed = 4;
        result = instance.canJump();
        assertFalse(result);
        
        instance.possition = 1;
        instance.speed = 1;
        result = instance.canJump();
        assertFalse(result);
        
        instance.possition = 2;
        instance.speed = 0;
        result = instance.canJump();
        assertFalse(result);        
    }
    
    /**
     * Test of canJump method, of class Moto.
     */
    @Test
    public void testIStopOnThePlateform() {
        boolean result;
        Road road = new Road(3, 2, 3);
        Moto instance = new Moto(6, 0, road); 
        result = instance.canJump();
        assertTrue(result);
        
        instance.possition = 1;
        instance.speed = 5;
        result = instance.canJump();
        assertTrue(result);
        
        instance.possition = 2;
        instance.speed = 4;
        result = instance.canJump();
        assertTrue(result);
        
        instance.possition = 3;
        instance.speed = 4;
        result = instance.canJump();
        assertTrue(result);        
    }

    /**
     * Test of canJump method, of class Moto.
     */
    @Test
    public void testIDontStopOnThePlateform() {
        boolean result;
        Road road = new Road(3, 2, 3);
        Moto instance = new Moto(16, 0, road); 
        result = instance.canJump();
        assertFalse(result);
        
        instance.possition = 1;
        instance.speed = 8;
        result = instance.canJump();
        assertFalse(result);
        
        instance.possition = 2;
        instance.speed = 8;
        result = instance.canJump();
        assertFalse(result);
        
        instance.possition = 3;
        instance.speed = 10;
        result = instance.canJump();
        assertFalse(result);        
    }
    
    /**
     * Test of move method, of class Moto.
     */
    @Test
    public void testMoveLarge() {
        Road road = new Road(16, 2, 16);
        Moto bike = new Moto(0, 0, road);
        while(bike.possition < 18){
            bike.move();
        }
        assertTrue(bike.possition >= 18 && bike.possition < 34);
    }

     /**
     * Test of move method, of class Moto.
     */
    @Test
    public void testMoveClose() {
        Road road = new Road(7, 3, 11);
        Moto bike = new Moto(0, 0, road);
        while(bike.possition < 7){
            bike.move();
        }
        assertTrue(bike.possition >= 7 && bike.possition < 21);
    }

     /**
     * Test of move method, of class Moto.
     */
    @Test
    public void testMoveBigJump() {
        Road road = new Road(21, 5, 16);
        Moto bike = new Moto(1, 0, road);
        while(bike.possition < 26){
            bike.move();
        }
        assertTrue(bike.possition >= 26 && bike.possition < 42);
    }

    /**
     * Test of move method, of class Moto.
     */
    @Test
    public void testMoveLongBridge() {
        Road road = new Road(21, 2, 5);
        Moto bike = new Moto(1, 0, road);
        while(bike.possition < 21){
            bike.move();
        }
        assertTrue(bike.possition >= 21 && bike.possition < 28);
    }

     /**
     * Test of move method, of class Moto.
     */
    @Test
    public void testMoveQuickStart1() {
        Road road = new Road(7, 2, 13);
        Moto bike = new Moto(6, 0, road);
        while(bike.possition < 7){
            bike.move();
            assertFalse(bike.possition >= 7 && bike.possition <= 9);
        }
        assertTrue(bike.possition >= 7 && bike.possition < 22);
    }

}
