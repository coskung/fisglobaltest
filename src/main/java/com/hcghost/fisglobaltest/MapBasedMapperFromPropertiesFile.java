/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hcghost.fisglobaltest;

import java.util.Locale;
    import java.util.Map;
import org.springframework.context.support.ResourceBundleMessageSource;
/**
 *
 * @author hcg
 */

public class MapBasedMapperFromPropertiesFile implements Mapper<String,String> {
    
    public String map(String s) {
        
    ResourceBundleMessageSource bean = new ResourceBundleMessageSource();
    bean.setBasename("mapping");
    String message = bean.getMessage(s, null, Locale.getDefault());
    System.out.println("message = "+message);
        
    //return map.get(s);
    return message;
    }

    private Map<String,String> map;

    public Map<String,String> getMapping() {
        return map;
    }

    public void setMapping(Map<String,String> map) {
        this.map = map;
    }
}
