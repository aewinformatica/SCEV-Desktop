package com.aewinformatica.scev.desktop.model;

import com.aewinformatica.scev.desktop.model.shared.DefaultTableModel;
import org.springframework.stereotype.Component;

/**
 *
 * @author Jessica
 */

@Component
public class UsuarioTableModel extends DefaultTableModel<Usuario> {

    private String constNome = "Nome";
    private String constLogin = "Login";
    
    
    @Override
    public String[] getColumnLabels() {
        
                return new String[]{
        		constNome,
                        constLogin
                };
        
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
 
        Usuario usuario = entities.get(rowIndex);
        
        switch (columnIndex) {
	            case 0:
	                return usuario.getNome();
                    case 1:
                        return  usuario.getLogin();
	            default:
	                return "";
	        }
    }
    
}
