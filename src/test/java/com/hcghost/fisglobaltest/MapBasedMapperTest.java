/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hcghost.fisglobaltest;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hcg
 */
public class MapBasedMapperTest {
    
    public MapBasedMapperTest() {
    }
    

    /**
     * Test of map method, of class MapBasedMapper.
     */
    @Test
    public void testMap() {
        System.out.println("map");
        String s = "Test";
        MapBasedMapper instance = new MapBasedMapper();
        String expResult = "Passed";
        String result = instance.map(s);
        assertEquals(expResult, result);
        
        String expResultFail = "Failed";
        assertNotSame(expResultFail, result);
    }

    
}
