package Utilidades;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class EstiloTabla extends DefaultTableCellRenderer {
Color background;
Color foreground;

public EstiloTabla (Color background,Color foreground) {
super();
this.background = background;
this.foreground = foreground;
}

@Override
public Component getTableCellRendererComponent(JTable table, Object value,boolean isSelected, boolean hasFocus, int row, int column) {
Component comp = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
comp.setBackground(background);
comp.setForeground(foreground);
this.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
//this.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 51)));
comp.setFont(new Font("Arial", 1, 12));
return comp;
}
}
