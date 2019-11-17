package Consultas;

import Entidades.Aspirantes;
import Entidades.Empleo;
import Modelo.conexionbd;
import Entidades.Empresa;
import Entidades.GiroComercial;
import Entidades.Trabajador;
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
    private Connection con = new conexionbd().getconexion();
 public static int idE = 0;
    public void ValidarEmpresa(Empresa E) {
        ImageIcon img = null;
        InputStream inp = null;

        int Resultado = 1;
        try {

            CallableStatement st = con.prepareCall("SELECT e.idEmpresa,e.nombre,e.acronimo,e.idGiroComercial,e.descripcion,e.departamento,e.direccion, \n"
                    + "e.telefono,e.correo,e.contraseña,e.imgPerfil,c.categoriaNombre\n" + "FROM Empresa as e\n" + ""
                    + "inner join girocomercial as c\n"
                    + "WHERE e.idGiroComercial = c.idGiroComercial and correo = "
                    + "'" + E.getCorreo() + "' and contraseña ='" + E.getContraseña() + "'");

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

                    frme.txtnombres.setText(rs.getString("nombre"));
                    frme.acronimo.setText(rs.getString("acronimo"));
                    frme.txt_direccion.setText(rs.getString("direccion"));
                    frme.jText_Descripcion.setText(rs.getString("descripcion"));
                    frme.txt_direccion.setText(rs.getString("direccion"));
                    frme.txt_correo.setText(rs.getString("correo"));
                    frme.telefono.setText(rs.getString("telefono"));
                    frme.txtgiro_comercial1.setText(rs.getString("CategoriaNombre"));
                    frme.departamento.setText(rs.getString("departamento"));
                    int id = rs.getInt("idGiroComercial");
                    frme.idgiro.setText(String.valueOf(id));
                   idE = rs.getInt("idEmpresa");
                    frme.idempresa.setText(String.valueOf(idE));
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

    public ArrayList<Empleo> Mostraempleos() {
        frmP_Empresa s = new frmP_Empresa();

        ArrayList<Empleo> empleo = new ArrayList<>();
        try {
            CallableStatement cb = con.prepareCall("select *from empleo where idEmpresa='"+idE+"'");
            ResultSet rs = cb.executeQuery();
            while (rs.next()) {
                Empleo p = new Empleo();

                p.setNombre(rs.getString("nombre"));

                p.setDescripcion(rs.getString("descripcion"));
                p.setRequisitos(rs.getString("requisitos"));
                p.setSalario(rs.getDouble("salario"));
                empleo.add(p);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en la consulta :" + e);
        }
        return empleo;

    }
    
     public ArrayList<Aspirantes> MostraAspirantes() {

        ArrayList<Aspirantes> Aspirantes = new ArrayList<>();
        try {
            CallableStatement cb = con.prepareCall("select  t.nombres,t.apellidos,e.nombre,e.requisitos  \n"
                    + "from Aspirantes as a\n"
                    + "inner join Trabajador as t\n"
                    + "on\n"
                    + " a.idTrabajador = t.idTrabajador\n"
                    + "inner join Empleo as e\n"
                    + "on e.idEmpleo = a.idEmpleo\n"
                    + "inner join Empresa as m\n"
                    + "on e.idEmpresa = m.idEmpresa\n"
                    + "where m.idEmpresa ='"+idE+"'");
            ResultSet rs = cb.executeQuery();
            while (rs.next()) {
                Aspirantes p = new Aspirantes();
               Empleo e= new Empleo();
                Trabajador t= new Trabajador();
                
            t.setNombres(rs.getString("nombres"));
                t.setApellidos(rs.getString("apellidos"));
                e.setNombre(rs.getString("nombre"));
               e.setRequisitos(rs.getString("requisitos"));
                
                

                Aspirantes.add(p);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en la consulta :" + e);
        }
        return Aspirantes;

    }

}
