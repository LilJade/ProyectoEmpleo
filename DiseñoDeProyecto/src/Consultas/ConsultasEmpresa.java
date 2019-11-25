package Consultas;

import Entidades.Aspirantes;
import Entidades.Empleo;
import Modelo.conexionbd;
import Entidades.Empresa;
import Entidades.GiroComercial;
import Entidades.Trabajador;
import Entidades.cargar_Aspirantes;
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
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import sun.net.www.content.image.gif;

public class ConsultasEmpresa {

    private Connection con = new conexionbd().getconexion();
    public static int idE = 0;
    public static int idG = 0;

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

                    frme.txtNombre.setText(rs.getString("nombre"));
                    frme.txtAcronimo.setText(rs.getString("acronimo"));
                    frme.txtDireccion.setText(rs.getString("direccion"));
                    frme.txtDescripcion.setText(rs.getString("descripcion"));
                    frme.txtDireccion.setText(rs.getString("direccion"));
                    frme.txtCorreo.setText(rs.getString("correo"));
                    frme.txtTelefono.setText(rs.getString("telefono"));
                    frme.jc_girocomercial.setSelectedItem(rs.getString("CategoriaNombre"));
                    frme.txtDepartamento.setText(rs.getString("departamento"));
                    idG = rs.getInt("idGiroComercial");
                    frme.idgiro.setText(String.valueOf(idG));
                    idE = rs.getInt("idEmpresa");
                    frme.idempresa.setText(String.valueOf(idE));
                    frme.setVisible(true);
                   frmv.setVisible(false);

                    frme.cargarcombos();
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
            frmVisitante V = new frmVisitante();
            V.setVisible(true);
            frmP_Empresa frme = new frmP_Empresa();
            frme.dispose();
        } catch (SQLException | HeadlessException ex) {
            System.out.println("Error de insercion: " + ex.getMessage());
        }
    }

    public ArrayList<GiroComercial> mostrargirosEmpresa() {

        ArrayList<GiroComercial> idgiroempresa = new ArrayList<>();
        try {
            CallableStatement cb = con.prepareCall("select *from girocomercial where idgirocomercial='" + idG + "'");
            ResultSet rs = cb.executeQuery();
            while (rs.next()) {
                GiroComercial g = new GiroComercial();
                g.setIdGiroComercial(rs.getInt("idGiroComercial"));
                g.setCategoriaNombre(rs.getString("categoriaNombre"));

                idgiroempresa.add(g);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en la consulta :" + e);
        }
        return idgiroempresa;

    }

    public ArrayList<Empleo> Mostraempleos() {
        frmP_Empresa s = new frmP_Empresa();

        ArrayList<Empleo> empleo = new ArrayList<>();
        try {
            CallableStatement cb = con.prepareCall("select *from empleo where idEmpresa='" + idE + "'");
            ResultSet rs = cb.executeQuery();
            while (rs.next()) {
                Empleo p = new Empleo();

                int idem = rs.getInt("idEmpleo");

                p.setIdEmpleo(idem);

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

    public ArrayList<cargar_Aspirantes> MostraAspirantes() {

        ArrayList<cargar_Aspirantes> cargar_Aspirantes = new ArrayList<>();
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
                    + "where m.idEmpresa ='" + idE + "'");
            ResultSet rs = cb.executeQuery();
            while (rs.next()) {
                cargar_Aspirantes a = new cargar_Aspirantes();

                a.setNombreT(rs.getString("nombres"));
                a.setApellidoT(rs.getString("apellidos"));
                a.setRequisitosE(rs.getString("requisitos"));
                a.setNombreE(rs.getString("nombre"));
                cargar_Aspirantes.add(a);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en la consulta :" + e);
        }
        return cargar_Aspirantes;

    }
    //metodo actualizar empresa(alexis)

    public void Actualizar_empresa(Empresa e) {
        try {
            CallableStatement st = con.prepareCall("{call SP_U_Empresa(?,?,?,?,?,?,?,?,?,?,?)}");
            st.setInt("idE", e.getIdEmpresa());
            st.setString("nombreE", e.getNombre());
            st.setString("acronimoE", e.getAcronimo());
            st.setString("descripcionE", e.getDescripcion());
            st.setString("departamentoE", e.getDepartamento());
            st.setString("direccionE", e.getDireccion());
            st.setString("telefonoE", e.getTelefono());
            st.setString("correoE", e.getCorreo());
            st.setString("contraseñaE", e.getContraseña());
            st.setBytes("imgE", e.getImPerfil());
            st.setInt("idGiroComercialE", e.getIdGiroComercial());
            st.execute();

            JOptionPane.showMessageDialog(null, "Datos Actualizados:");

        } catch (SQLException ex) {
            System.out.println("Error al actualizar " + ex.getMessage());
        }
    }

    public void insertarEmpleo(Empleo o) {

        try {
            CallableStatement st = con.prepareCall("Call SP_I_Empleo(?,?,?,?,?)");

            st.setString("nombreE", o.getNombre());
            st.setString("descripcionE", o.getDescripcion());
            st.setString("requisitosE", o.getRequisitos());
            st.setDouble("salarioE", o.getSalario());
            st.setInt("idEmpresaE", o.getIdEmpresa());

            st.execute();

            JOptionPane.showMessageDialog(null, " Empleo Agregado:");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al Insertar Empleo:" + e);

        }
    }

    public void Actualizarempleo(Empleo r) {
        try {
            CallableStatement st = con.prepareCall("call SP_U_Empleo(?,?,?,?,?)");
            st.setInt("idEmpleoE", r.getIdEmpleo());
            st.setString("nombreE", r.getNombre());
            st.setString("descripcionE", r.getDescripcion());
            st.setString("requisitosE", r.getRequisitos());
            st.setDouble("salarioE", r.getSalario());
            st.execute();
            JOptionPane.showMessageDialog(null, "empleo actualizado");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "empleo actualizado" + e);

        }
    }
    
    public ArrayList<Empresa> mostrarEmpresasVisitante(){
        ArrayList<Empresa> mostrarEmpresaV = new ArrayList<>();
        
        try {
            CallableStatement st = con.prepareCall("SELECT idEmpresa, nombre, acronimo, departamento FROM Empresa");
            ResultSet rs = st.executeQuery();
            
            while(rs.next()){
                Empresa emp = new Empresa();
                emp.setIdEmpresa(rs.getInt("idEmpresa"));
                emp.setNombre(rs.getString("nombre"));
                emp.setAcronimo(rs.getString("acronimo"));
                emp.setDepartamento(rs.getString("departamento"));
                mostrarEmpresaV.add(emp);
            }
        } catch (Exception e) {
            System.out.println("Error al consultar los registros de empresas: " + e.getMessage());
        }
        return mostrarEmpresaV;
    }
    
        public ArrayList<Empresa> MostrarFotos(String id) {
        ArrayList<Empresa> mostrarFotoEmpV = new ArrayList<>();
        try {
            CallableStatement cb = con.prepareCall("SELECT imgPerfil FROM Empresa WHERE idEmpresa = '" + id + "'");
            ResultSet rs = cb.executeQuery();
            while (rs.next()) {
                Empresa emp = new Empresa();
                emp.setImPerfil(rs.getBytes("imgPerfil"));
                mostrarFotoEmpV.add(emp);
            }

        } catch (Exception e) {
            System.out.println("Error al consultar la imagen de la empresa: " + e.getMessage());
        }
        return mostrarFotoEmpV;
    }
        
        public ArrayList<Empresa> BuscarEmpresaV(String nombre){
        ArrayList<Empresa> buscarEmpV = new ArrayList<>();
            try {
                String filtro = ""+nombre+"_%";
                CallableStatement st = con.prepareCall("SELECT idEmpresa, nombre, acronimo, departamento FROM empresa WHERE nombre LIKE " + '"' + filtro + '"');
                ResultSet rs = st.executeQuery();
                
                while(rs.next()){
                    Empresa emp = new Empresa();
                    emp.setIdEmpresa(rs.getInt("idEmpresa"));
                    emp.setNombre(rs.getString("nombre"));
                    emp.setAcronimo(rs.getString("acronimo"));
                    emp.setDepartamento(rs.getString("departamento"));
                    buscarEmpV.add(emp);
                }
            } catch (Exception e) {
            System.out.println("Error al buscar entre registros de las empresas: " + e.getMessage());
            }
        return buscarEmpV;
        }
}
