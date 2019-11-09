package Consultas;

import Entidades.Habilidad;
import Modelo.conexionbd;
import Entidades.Trabajador;
import Formularios.frmP_Trabajador;
import Formularios.frmVisitante;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class ConsultasTrabajador {

    private Connection con = new conexionbd().getconexion();
    int indice = 0;
    private List<JLabel> lblHabilidades = new ArrayList<>();

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

                    //Agregando Habilidades.
                    ArrayList<Habilidad> hbld = mostrarHabilidades(rs.getInt("idTrabajador"));
                    Iterator i = hbld.iterator();
                    while (i.hasNext()) {
                        Habilidad h;
                        h = (Habilidad) i.next();
                        //Creando JLabels
                        String name = "lbl" + indice;
                        JLabel lbl = new JLabel();
                        lbl.setFont(new java.awt.Font("Dialog", 1, 20));
                        lbl.setForeground(new java.awt.Color(255, 255, 255));
                        lbl.setName(name);
                        lbl.setText("✔ " + h.getHabilidad());
                        frmPTr.jp_Habilidades.add(lbl);
                        lblHabilidades.add(lbl);
                        indice++;
                        frmPTr.jp_Habilidades.updateUI();
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

    public ArrayList<Habilidad> mostrarHabilidades(int id) {

        ArrayList<Habilidad> habil = new ArrayList<>();
        try {
            CallableStatement st = con.prepareCall("SELECT h.idHabilidad, h.habilidad, h.idTrabajador FROM Habilidad AS h INNER JOIN Trabajador AS t ON t.idTrabajador = h.idTrabajador WHERE t.idTrabajador = '" + id + "'");
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                Habilidad h = new Habilidad();

                h.setIdHabilidad(rs.getInt("idHabilidad"));
                h.setHabilidad(rs.getString("Habilidad"));
                h.setIdTrabajador(rs.getInt("idTrabajador"));

                habil.add(h);
            }
        } catch (Exception e) {
            System.out.println("Error en la lista de habilidades: " + e.getMessage());
        }
        return habil;
    }
}
