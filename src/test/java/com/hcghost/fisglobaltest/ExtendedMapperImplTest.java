/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hcghost.fisglobaltest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hcg
 */
public class ExtendedMapperImplTest {
    

    @Test(expected=NullPointerException.class)
    public void testGetLargestElementInEmptyCollection() {
         //test null collection
        
        Collection c = null;
        ExtendedMapperImpl instance = new ExtendedMapperImpl();
        Object expResult = null;
        Object result = instance.getLargestElement(c);
        assertEquals(expResult, result);
    }    
    
    
    /**
     * Test of getLargestElement method, of class ExtendedMapperImpl.
     */
    @Test
    public void testGetLargestElement() {
        System.out.println("getLargestElement");
        
        //test collection with single element (1)
        Collection<Integer> c;
        c = new ArrayList<>();
        ExtendedMapperImpl instance = new ExtendedMapperImpl();
        c.add(1);
        Object expResult = 1;
        Object result = instance.getLargestElement(c);
        assertEquals(expResult, result);

        //test collection with single element repeated (1,1)
        c.add(1);
        System.out.println("collection size:"+c.size());
        expResult = 1;
        result = instance.getLargestElement(c);
        assertEquals(expResult, result);
        
        //test collection with two different elements (1,1,0)
        c.add(0);
        System.out.println("collection size:"+c.size());
        expResult = 1;
        result = instance.getLargestElement(c);
        assertEquals(expResult, result);
    
        //test collection with three different elements (1,1,0,3)
        c.add(3);
        System.out.println("collection size:"+c.size());
        expResult = 3;
        result = instance.getLargestElement(c);
        assertEquals(expResult, result);
        
        //test collection with a negative element added (1,1,0,3,-5)
        c.add(-5);
        System.out.println("collection size:"+c.size());
        expResult = 3;
        result = instance.getLargestElement(c);
        assertEquals(expResult, result);
        
        
        //generate a random size less than 100, and random numbers of this size
        
        Collection<Integer> randomColl;
        randomColl = new ArrayList<>();
        Random randomGenerator = new Random();
        int randomSize=randomGenerator.nextInt(100);
        int max=0;
        for (int i = 0; i < randomSize; i++){
            int randomInt = randomGenerator.nextInt(100);
            randomColl.add(randomInt);
            if(randomInt>max)
               max=randomInt;
        }
        System.out.println("collection size:"+randomColl.size());
        expResult = max;
        result = instance.getLargestElement(randomColl);
        assertEquals(expResult, result);
        
    }


    
}
