/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Consultas;
import static Consultas.ConsultasTrabajador.id;
import static Consultas.ConsultasEmpresa.idE;
import static Consultas.ConsultasEmpresa.idG;
import Entidades.cargar_Aspirantes;
import Formularios.frmP_Trabajador;
import Formularios.frmP_vista_empresas;
import Modelo.conexionbd;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Eli_Ingeniero
 */
public class ConsultasAspirantes {
     private Connection con = new conexionbd().getconexion();
      public static int idE = 0;
    public static  int idG= 0;
    int Resultado = 1;
    public int idEmpresavisitante;

    
    public void mostrarvista() {
        ImageIcon img = null;
        InputStream inp = null;
    frmP_Trabajador t= new frmP_Trabajador();
String idempresa=t.lblIdEmpresa.getText();
        try {
            CallableStatement st = con.prepareCall("SELECT e.idGiroComercial,e.idEmpresa,e.nombre,e.acronimo,e.idGiroComercial,e.descripcion,"
                    + "e.departamento,e.direccion,e.telefono,e.correo,e.contraseña,e.imgPerfil,c.categoriaNombre"
                    + " FROM Empresa as e inner join girocomercial as c "
                    + "where e.idEmpresa='"+idempresa+"'and e.idGiroComercial=c.idGiroComercial");
           
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                Resultado = 1;
           
                if (Resultado == 1) {
                    frmP_vista_empresas frmve = new frmP_vista_empresas();
                    
                    try {
                        if (rs.getBinaryStream("imgPerfil") != null) {
                            inp = rs.getBinaryStream("imgPerfil");
                            BufferedImage bm = ImageIO.read(inp);
                            img = new ImageIcon(bm);
                            Icon icono = new ImageIcon(img.getImage().getScaledInstance(frmve.lb_fotoEmpresa1.getWidth(), frmve.lb_fotoEmpresa1.getHeight(), Image.SCALE_DEFAULT));
                            frmve.lb_fotoEmpresa1.setIcon(icono);
                        } else {
                            frmve.lb_fotoEmpresa1.setIcon(null);
                        }
                        
                    } catch (IOException ex) {
                        frmve.lb_fotoEmpresa1.setIcon(null);
                    }
                    
                    frmve.txtNombre2.setText(rs.getString("nombre"));
                    frmve.txtAcronimo2.setText(rs.getString("acronimo"));
                    frmve.txtDireccion2.setText(rs.getString("direccion"));
                    frmve.txtDescripcion2.setText(rs.getString("descripcion"));
                    frmve.txtDireccion2.setText(rs.getString("direccion"));
                    frmve.txtCorreo2.setText(rs.getString("correo"));
                    frmve.txtTelefono2.setText(rs.getString("telefono"));
                    frmve.txtgirocomercial.setText(rs.getString("CategoriaNombre"));
                    frmve.txtDepartamento2.setText(rs.getString("departamento"));
                    idG = rs.getInt("idGiroComercial");
                    frmve.idgiro2.setText(String.valueOf(idG));
                    idE = rs.getInt("idEmpresa");
                    frmve.idempresa2.setText(String.valueOf(idE));
                    
                    
                }
           } else {
                JOptionPane.showMessageDialog(null, "no hay conexion con la empresa!", "Mensaje del Sistema", 2);
                
            }
        } catch (SQLException ex) {
            System.out.println("Error en el login de empresa: " + ex.getMessage());
        }
        
    }
    
}
