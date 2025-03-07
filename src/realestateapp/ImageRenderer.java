package realestateapp;

import java.awt.Component;
import java.awt.Image;
import java.io.File;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;

public class ImageRenderer extends DefaultTableCellRenderer {
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        if (value instanceof String) 
        {
            File imageFile = new File((String) value);
            if (imageFile.exists()) 
            {
                ImageIcon icon = new ImageIcon((String) value);
                Image scaledImage = icon.getImage().getScaledInstance(120, 90, Image.SCALE_SMOOTH);
                return new JLabel(new ImageIcon(scaledImage));
            } 
            else 
            {
                System.out.println("Η εικόνα δεν βρέθηκε: " + value);
                return new JLabel(new ImageIcon("default.png"));
            }
        } 
        else if (value instanceof ImageIcon) 
        {
            ImageIcon icon = (ImageIcon) value;
            Image scaledImage = icon.getImage().getScaledInstance(120, 90, Image.SCALE_SMOOTH);
            return new JLabel(new ImageIcon(scaledImage));
        }

        return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
    }
}



