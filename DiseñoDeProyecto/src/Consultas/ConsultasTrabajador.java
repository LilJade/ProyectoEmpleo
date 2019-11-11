package Consultas;
import Modelo.conexionbd;
import Entidades.Trabajador;
import Formularios.frmP_Trabajador;
import Formularios.frmVisitante;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ConsultasTrabajador {

    private Connection con = new conexionbd().getconexion();

    public void ValidarTrabajador(Trabajador T) {
        ImageIcon img = null;
        InputStream inp = null;
        int Resultado = 0;

        try {
            CallableStatement st = con.prepareCall("call SP_V_Trabajador(?,?)");

            st.setString("correoT", T.getCorreo());
            st.setString("passT", T.getPass());

            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                Resultado = 1;

                if (Resultado == 1) {
                    frmP_Trabajador frmPTr = new frmP_Trabajador();
                    frmVisitante frmV = new frmVisitante();

                    //enviando id a un label en frmP_Trabajador (No util).
                    frmPTr.lblId.setText(String.valueOf(rs.getInt("idTrabajador")));

                    //Agregando foto de Perfil, si existe en la base.
                    try {
                        if (rs.getBinaryStream("imgPerfil") != null) {
                            inp = rs.getBinaryStream("imgPerfil");
                            BufferedImage bi = ImageIO.read(inp);
                            img = new ImageIcon(bi);
                            Icon icn = new ImageIcon(img.getImage().getScaledInstance(frmPTr.lblFotoperfil.getWidth(), frmPTr.lblFotoperfil.getHeight(), Image.SCALE_DEFAULT));

                            frmPTr.lblFotoperfil.setIcon(icn);
                        } else {
                            frmPTr.lblFotoperfil.setIcon(null);
                        }
                    } catch (IOException ex) {
                        frmPTr.lblFotoperfil.setIcon(null);
                    }

                    //Agregando nombres y descripcion del usuario
                    frmPTr.lblNombres.setText(rs.getString("nombres") + " " + rs.getString("apellidos"));
                    frmPTr.jtxta_Descripcion.setText(rs.getString("descripcion"));

                    frmPTr.setVisible(true);
                    frmV.hide();
                    frmV.setVisible(false);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecta!", "Mensaje del Sistema", 2);
            }
        } catch (SQLException ex) {
            System.out.println("Error en la validacion del Trabajador: " + ex.getMessage());
        }
    }

    public void insertar(Trabajador t) {
        try {
            CallableStatement st = con.prepareCall("call SP_I_Trabajador(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

            st.setString("nombresT", t.getNombres());
            st.setString("apellidosT", t.getApellidos());
            st.setString("descripcionT", t.getDescripcion());
            st.setInt("edadT", t.getEdad());
            st.setString("sexoT", t.getSexo());
            st.setString("direccionT", t.getDireccion());
            st.setString("celularT", t.getCelular());
            st.setString("telefonoFijoT", t.getTelefonoFijo());
            st.setString("duiT", t.getDui());
            st.setString("nitT", t.getNit());
            st.setString("correoT", t.getCorreo());
            st.setString("passT", t.getPass());
            st.setBytes("imgPerfilT", t.getImgPerfil());
            st.setInt("estiloT", t.getEstilo());

            st.execute();

            JOptionPane.showMessageDialog(null, "Registrado con Exito");

        } catch (Exception ex) {
            System.out.println("Error de insercion: " + ex.getMessage());
        }
    }
}
