/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hcghost.fisglobaltest;

import java.util.Collection;

/**
 *
 * @author hcg
 * @param <T>
 * ExtendedMapper extends the Mapper interface with an extra method 
 * to accept a java.util.Collection and return an object of the type as 
 * contained in the collection
 */

public interface ExtendedMapper<T> extends Mapper{
    
    /**
     *
     * @param c
     * @return
     */
    public Object getLargestElement(Collection c);
}



