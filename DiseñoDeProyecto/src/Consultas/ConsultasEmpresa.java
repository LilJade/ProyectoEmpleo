package Consultas;

import Modelo.conexionbd;
import Entidades.Empresa;
import Entidades.GiroComercial;
import Formularios.frmP_Empresa;
import Formularios.frmR_Empresa;
import Formularios.frmVisitante;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.*;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import sun.net.www.content.image.gif;


public class ConsultasEmpresa {

   // frmR_Empresa abrir = new frmR_Empresa();
    private Connection con = new conexionbd().getconexion();
   
    public void ValidarEmpresa(Empresa E) {
        ImageIcon img = null;
        InputStream inp = null;

        int Resultado = 1;
        try {

            CallableStatement st = con.prepareCall("call SP_V_Empresa(?,?)");
            st.setString("correoE", E.getCorreo());
            st.setString("contraseñaE", E.getContraseña());

            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                Resultado = 1;
                if (Resultado == 1) {
                    frmP_Empresa frme = new frmP_Empresa();
                    frmVisitante frmv = new frmVisitante();

                    try {
                        if (rs.getBinaryStream("imgPerfil") != null) {
                            inp = rs.getBinaryStream("imgPerfil");
                            BufferedImage bm = ImageIO.read(inp);
                            img = new ImageIcon(bm);
                            Icon icono = new ImageIcon(img.getImage().getScaledInstance(frme.lb_fotoEmpresa.getWidth(), frme.lb_fotoEmpresa.getHeight(), Image.SCALE_DEFAULT));
                            frme.lb_fotoEmpresa.setIcon(icono);
                        } else {
                            frme.lb_fotoEmpresa.setIcon(null);
                        }

                    } catch (IOException ex) {
                        frme.lb_fotoEmpresa.setIcon(null);

                    }

                    frme.lb_nombres.setText(rs.getString("nombre"));
                    frme.lb_acronimoE.setText(rs.getString("acronimo"));
                    frme.txt_direccion.setText(rs.getString("direccion"));
                    frme.jText_Descripcion.setText(rs.getString("descripcion"));
                    frme.txt_direccion.setText(rs.getString("direccion"));
                    frme.txt_correo.setText(rs.getString("correo"));
                    frme.telefono.setText(rs.getString("telefono"));
                    frme.setVisible(true);
                    frmv.hide();
                    frmv.setVisible(false);

                }

            } else {
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecta!", "Mensaje del Sistema", 2);

            }
        } catch (SQLException ex) {
            System.out.println("Error en el login de empresa: " + ex.getMessage());
        }

    }

    public void insertar(Empresa i) {
        try {
            CallableStatement st = con.prepareCall(" call SP_I_Empresa(?,?,?,?,?,?,?,?,?,?)");

            st.setString("nombreE", i.getNombre());
            st.setString("acronimoE", i.getAcronimo());
            st.setString("descripcionE", i.getDescripcion());
            st.setString("departamentoE", i.getDepartamento());
            st.setString("direccionE", i.getDireccion());
            st.setString("telefonoE", i.getTelefono());
            st.setString("correoE", i.getCorreo());
            st.setString("contraseñaE", i.getContraseña());
            st.setBytes("imgE", i.getImPerfil());
            st.setInt("idGiroComercialE", i.getIdGiroComercial());
            st.execute();

            JOptionPane.showMessageDialog(null, "Registrado con Exito");

        } catch (SQLException | HeadlessException ex) {
            System.out.println("Error de insercion: " + ex.getMessage());
        }
    }
    
    
 public ArrayList<GiroComercial> mostrargiros() {

        ArrayList<GiroComercial> liscombo = new ArrayList<>();
        try {
            CallableStatement cb = con.prepareCall("select *from girocomercial");
            ResultSet rs = cb.executeQuery();
            while (rs.next()) {
                GiroComercial g = new GiroComercial();
                g.setIdGiroComercial(rs.getInt("idGiroComercial"));
                g.setCategoriaNombre(rs.getString("categoriaNombre"));
               
               liscombo.add(g);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en la consulta :" + e);
        }
        return liscombo;

    }
    
   
}
