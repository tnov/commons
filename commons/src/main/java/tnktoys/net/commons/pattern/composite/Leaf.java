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
public class Leaf extends Node {

    @Override
    public void addChild(Composite child) {
        throw new UnsupportedOperationException("unexpected execute method" );
    }

    @Override
    public void removeChild(Composite child) {
        throw new UnsupportedOperationException("unexpected execute method" );
    }

    @Override
    public Composite getChild(int i) {
        throw new UnsupportedOperationException("unexpected execute method" );
    }

    @Override
    public List<Composite> getChildren() {
        throw new UnsupportedOperationException("unexpected execute method" );
    }

    @Override
    public void clearChildren() {
        throw new UnsupportedOperationException("unexpected execute method" );
    }

    @Override
    public void setChildren(List<Composite> children) {
        throw new UnsupportedOperationException("unexpected execute method" );
    }

    @Override
    public void addChild(Composite child, int i) {
        throw new UnsupportedOperationException("unexpected execute method" );
    }

    @Override
    public void removeChild(int i) {
        throw new UnsupportedOperationException("unexpected execute method" );
    }

    @Override
    public boolean isLeaf() {
        return true;
    }
    
}
