/*
 * To change this license header, choose License Headers in Project Property.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tnktoys.net.commons.properties;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author fission
 */
public class Property {
    
    public static final Path DEFAULT_PROPERTY_PATH =  Paths.get(System.getProperty("user.home") + File.separator + "conf");
    
    public Property() {
        
    }
    private Path path = null;
    
}
