/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hcghost.fisglobaltest;

    import java.util.Map;
/**
 *
 * @author hcg
 */

public class MapBasedMapper implements Mapper<String,String> {
    public String map(String s) {
        //task 4.b method map should return “Passed” when given parameter “Test”
        // I haven't used s.equalsIgnoreCase(), just to be sure about case sensitivity.
        
        if(s.compareTo("Test")==0)
            return "Passed";
        
       return map.get(s);
    }

    private Map<String,String> map;

    public Map<String,String> getMapping() {
        return map;
    }

    public void setMapping(Map<String,String> map) {
        this.map = map;
    }
}
