/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tnktoys.net.commons.pattern.composite;

import java.util.List;

/**
 *
 * @author fission
 */
public abstract class Node  implements Composite {
    
    protected boolean  isLeaf = false;
    protected List<Composite> children = null;

    @Override
    public boolean isLeaf() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeChild(int i) {
        synchronized (children) {
            int size = children.size();
            for(int cnt = size-1 ; cnt >= 0 ; cnt--) {
                if (cnt == i) {
                    children.remove(i);
                    break;
                }
            }
        }
    }

    @Override
    public void addChild(Composite child , int i) {
        synchronized (children) {
            children.add(i,child);
        }
    }

    @Override
    public void setChildren(List<Composite> children) {
        this.children = children;
    }

    @Override
    public void clearChildren() {
        this.children.clear();
    }

    @Override
    public List<Composite> getChildren() {
        return children;
    }

    @Override
    public Composite getChild(int i) {
        return children.get(i);
    }

    @Override
    public void removeChild(Composite child ) {
        children.remove(child);
    }

    @Override
    public  void addChild(Composite child) {
        children.add(child);
    }
}
