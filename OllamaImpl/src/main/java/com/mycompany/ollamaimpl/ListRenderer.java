/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ollamaimpl;

import java.awt.Component;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.ListCellRenderer;

/**
 *
 * @author boolean
 */

public class ListRenderer implements ListCellRenderer {
    //Se implementa el ListCellRenderer para poder ponerle propiedades al jTextArea dentro del JList
        static JTextArea renderer = new JTextArea();
    @Override
    public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {  
        renderer.setText(value.toString());
        renderer.setFont(new Font(null,3,25));
        renderer.setLineWrap(true);
        renderer.setWrapStyleWord(true);
        //Estas propiedades son para el tipo de letra y que el texto se ajuste automaticamente a el jTextArea (Jlist)
        return renderer;
        
        
    }
    
    
    
}
