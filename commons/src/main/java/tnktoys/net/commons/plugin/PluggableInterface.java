/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tnktoys.net.commons.plugin;

/**
 *
 * @author dell
 */
public interface PluggableInterface<R,P>  {
    boolean initialize();
    R execute(P param);
    boolean finished(); 
}
