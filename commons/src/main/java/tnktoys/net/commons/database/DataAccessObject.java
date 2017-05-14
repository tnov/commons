/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tnktoys.net.commons.database;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fission
 */
public abstract class DataAccessObject {

    private Table table = new Table();
    private List<Column> columnList = new ArrayList<>();
    
    
    protected Table getTableInfo() {
        return table;
    }
    protected List<Column> getColumnList() {
        return columnList;
    }
}
