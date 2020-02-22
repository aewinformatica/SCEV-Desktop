package com.aewinformatica.scev.desktop.model.shared;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Jessica
 * 
 */


public abstract class DefaultTableModel<T> extends AbstractTableModel {

	private static final long serialVersionUID = 1L;

	protected List<T> entities = newArrayList();

    public abstract String[] getColumnLabels();

    @Override
    public int getRowCount() {
        return entities.size();
    }

    @Override
    public int getColumnCount() {
        return getColumnLabels().length;
    }

    @Override
    public String getColumnName(int column) {
        return getColumnLabels()[column];
    }

    public void addEntity(T entity) {
        entities.add(entity);
        fireTableDataChanged();
    }

    public void addEntities(List<T> entities) {
        this.entities.addAll(entities);
        fireTableDataChanged();
    }

    public T getEntityByRow(int rowIndex) {
        return entities.get(rowIndex);
    }

    public void removeRow(int row) {
        entities.remove(row);
        fireTableDataChanged();
    }

    public void clear() {
        entities.clear();
    }
    
  public static <E> ArrayList<E> newArrayList() {
    return new ArrayList<>();
  }
}
