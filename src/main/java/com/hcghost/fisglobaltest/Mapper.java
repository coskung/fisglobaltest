/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hcghost.fisglobaltest;

/**
 *
 * @author hcg
 * @param <K>
 * @param <V>
 */
public interface Mapper<K,V> {

    /**
     *
     * @param valueToBeMapped
     * @return
     */
    public V map (K valueToBeMapped);
}
