/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tnktoys.net.commons.database;

import java.util.List;

/**
 *
 * @author fission
 */
public interface Query<R,P> {
    public List<R> select(List<P> in);
    public int update(List<P> in);
    public int insert(List<P> in);
    public int delete(List<P> in);
}
