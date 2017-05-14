/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tnktoys.net.commons.Composite;

import java.util.List;

/**
 *
 * @author fission
 */
public interface Composite {
    public boolean isLeaf();
    public List<Composite> getChildren();
    public Composite  getChild(int i);
    public void removeChild(int i);
    public void removeChild(Composite child);
    public void addChild(Composite child);
    public void addChild(Composite child,int i);
    public void setChildren(List<Composite> children);
    public void clearChildren();
}
