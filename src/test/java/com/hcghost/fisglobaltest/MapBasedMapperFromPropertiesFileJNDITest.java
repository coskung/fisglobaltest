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
public class MapBasedMapperFromPropertiesFileJNDITest {
    
    public MapBasedMapperFromPropertiesFileJNDITest() {
    }
    
   

    /**
     * Test of map method, of class MapBasedMapperFromPropertiesFile.
     */
    @Test
    public void testMap() {
        
        /**
         * mapping.properties content:
         * Test=Passed Read From Property File
         * AnotherTest=Failed
         */
        
        String s = "Test";
        MapBasedMapperFromPropertiesFileJNDI instance = new MapBasedMapperFromPropertiesFileJNDI();
        String expResult = "Passed Read From Property File";
        String result = instance.map(s);
        assertEquals(expResult, result);
        
        String expResultFail = "Failed";
        assertNotSame(expResultFail, result);
        
        s = "AnotherTest";
        result = instance.map(s);
        assertEquals(expResultFail, result);
    }
    
}
