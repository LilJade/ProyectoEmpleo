package Consultas;

import Modelo.conexionbd;
import Entidades.Empresa;
import Entidades.cargar_Aspirantes;
import Formularios.FrmP_Empresa1;
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

public class ConsultasEmpresa {
    
    private Connection con = new conexionbd().getconexion();
    public static int idE = 0;
    public static  int idG= 0;
    int Resultado = 1;
    public int idEmpresavisitante;

    static int idEmp = 0;

    public int ValidarEmpresa(Empresa E) {
        ImageIcon img = null;
        InputStream inp = null;
        try {
            
            CallableStatement st = con.prepareCall("call SP_V_Empresa(?,?)");
            
            st.setString("correoE", E.getCorreo());
            st.setString("contraseñaE", E.getContraseña());
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                Resultado = 1;
                if (Resultado == 1) {
                    FrmP_Empresa1 frme = new FrmP_Empresa1();
                    frmVisitante frmv = new frmVisitante();
                    
                    try {
                        if (rs.getBinaryStream("imgPerfil") != null) {
                            inp = rs.getBinaryStream("imgPerfil");
                            BufferedImage bm = ImageIO.read(inp);
                            img = new ImageIcon(bm);
                            Icon icono = new ImageIcon(img.getImage().getScaledInstance(frme.lb_fotoEmpresas1.getWidth(), frme.lb_fotoEmpresas1.getHeight(), Image.SCALE_DEFAULT));
                            frme.lb_fotoEmpresas1.setIcon(icono);
                        } else {
                            frme.lb_fotoEmpresas1.setIcon(null);
                        }
                        
                    } catch (IOException ex) {
                        frme.lb_fotoEmpresas1.setIcon(null);
                        
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
                    frme.txtContraseña.setText(rs.getString("contraseña"));
                    idG = rs.getInt("idGiroComercial");
                    frme.idgiro.setText(String.valueOf(idG));
                    idE = rs.getInt("idEmpresa");
                    frme.lblidempresa.setText(String.valueOf(idE));
                    frme.txtIdEmpresa.setText(String.valueOf(rs.getInt("idEmpresa")));
                   frme.txtgirocomercial.setText(rs.getString("CategoriaNombre"));
                    frme.setVisible(true);
                    frmv.setVisible(false);
                    this.idEmp = rs.getInt("idEmpresa");
                    System.out.println("idEmp");
                    return idEmp;
                }
                
            } else {
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecta!", "Mensaje del Sistema", 2);
                
            }
        } catch (SQLException ex) {
            System.out.println("Error en el login de empresa: " + ex.getMessage());
        }
        System.out.println("empresa: " + idEmp);
        return idEmp;
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
            FrmP_Empresa1 frme = new FrmP_Empresa1();
            frme.dispose();
        } catch (SQLException | HeadlessException ex) {
            System.out.println("Error de insercion: " + ex.getMessage());
        }
    }
    
   
            
    
    //metodo actualizar empresa(alexis)

    public void Actualizar_empresa(Empresa e) {
        try {
            CallableStatement st = con.prepareCall("{call SP_U_Empresa(?,?,?,?,?,?,?,?,?,?)}");
            st.setInt("idE", e.getIdEmpresa());
            st.setString("nombreE", e.getNombre());
            st.setString("acronimoE", e.getAcronimo());
            st.setString("descripcionE", e.getDescripcion());
            st.setString("departamentoE", e.getDepartamento());
            st.setString("direccionE", e.getDireccion());
            st.setString("telefonoE", e.getTelefono());
            st.setString("correoE", e.getCorreo());
            st.setString("contraseñaE", e.getContraseña());
            
            st.setInt("idGiroComercialE", e.getIdGiroComercial());
            st.execute();
            
            JOptionPane.showMessageDialog(null, "Datos Actualizados: algunos datos se actualizaran hasta iniciar nuevamente");
            
        } catch (SQLException ex) {
            System.out.println("Error al actualizar " + ex.getMessage());
        }
    }
    
    
    public void actualizar_empresafoto(Empresa e){
        try{
            CallableStatement st=con.prepareCall("call SP_U_fotoEmpresa(?,?)");
            st.setInt("idEmpresaE", e.getIdEmpresa());
            st.setBytes("imgperfilE", e.getImPerfil());
            st.execute();
            JOptionPane.showMessageDialog(null,"foto actualizada");
        }catch(Exception ex){
            System.out.println("erro"+ex);
        }
    }
    
   
    
   
    
    public ArrayList<Empresa> mostrarEmpresasVisitante() {
        ArrayList<Empresa> mostrarEmpresaV = new ArrayList<>();
        
        try {
            CallableStatement st = con.prepareCall("SELECT idEmpresa, nombre, acronimo, departamento FROM Empresa");
            ResultSet rs = st.executeQuery();
            
            while (rs.next()) {
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
    
    
    
    
    public ArrayList<Empresa> BuscarEmpresaV(String nombre) {
        ArrayList<Empresa> buscarEmpV = new ArrayList<>();
        try {
            String filtro = "" + nombre + "_%";
            CallableStatement st = con.prepareCall("SELECT idEmpresa, nombre, acronimo, departamento FROM empresa WHERE nombre LIKE " + '"' + filtro + '"');
            ResultSet rs = st.executeQuery();
            
            while (rs.next()) {
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
public ArrayList<cargar_Aspirantes> MostraAspirantes() {
        
        ArrayList<cargar_Aspirantes> cargar_Asp = new ArrayList<>();
        try {
            CallableStatement cb = con.prepareCall("call SP_M_Aspirantes(?)");
            cb.setInt("idE", idE);
            ResultSet rs = cb.executeQuery();
            while (rs.next()) {
                cargar_Aspirantes a = new cargar_Aspirantes();
                a.setIdTrabajador(rs.getInt("idTrabajador"));
                a.setNombreT(rs.getString("nombres"));
                a.setApellidoT(rs.getString("apellidos"));
                a.setRequisitosE(rs.getString("requisitos"));
                a.setNombreE(rs.getString("nombre"));
                a.setEstilo(rs.getInt("estilo"));
                cargar_Asp.add(a);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en la consulta :" + e);
        }
        return cargar_Asp;
        
    }
}
