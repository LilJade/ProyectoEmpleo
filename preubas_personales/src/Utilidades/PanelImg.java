package Utilidades;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PanelImg extends JPanel{
private Image fondo=null;

//Reemplazamos el metodo paintComponent para poder poder dibujar la imagen
//en el fondo del jPanel.
@Override
protected void paintComponent(Graphics g){
    super.paintComponent(g);
    g.drawImage(fondo,0,0,getWidth(),getHeight(),null);
}

//creamos el metodo para enviar la imagen de fondo al jPanel
public void setImage(String image){
    if (image!=null) {
        fondo=new ImageIcon(getClass().getResource(image)).getImage();
    }
  }
}