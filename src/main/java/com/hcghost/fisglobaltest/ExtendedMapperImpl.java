/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hcghost.fisglobaltest;

import java.util.Collection;
import java.util.Collections;


public class ExtendedMapperImpl<T> implements ExtendedMapper<T> {

    /**
    * getLargestElement method uses the default Collections.max(Collection) method.
    * This method iterates over the entire collection, hence it requires time 
    * proportional to the size of the collection.
    * Since no Comparator is given, natural ordering of the elements is used.
    * 
     */
    
    
    @Override
    public Object getLargestElement(Collection c) {
        return Collections.max(c);
    }

    @Override
    public Object map(Object valueToBeMapped) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
