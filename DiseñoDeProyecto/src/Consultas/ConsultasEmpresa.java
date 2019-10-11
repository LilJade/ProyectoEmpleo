package Consultas;
import Modelo.conexionbd;
import Entidades.Empresa;
import Formularios.frmEmpresa;
import java.awt.HeadlessException;
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;

public class ConsultasEmpresa {
  frmEmpresa abrir=new frmEmpresa();  
    private Connection con = new conexionbd().getconexion();
    
    public void ValidarEmpresa(Empresa E){
    
        int Resultado = 0;
        try{
            
            CallableStatement st = con.prepareCall("call SP_V_Empresa(?,?)");
            st.setString("correoE", E.getCorreo());
            st.setString("contraseñaE", E.getContraseña());
            
            ResultSet rs = st.executeQuery();
            if(rs.next()){
                Resultado = 1;
                 abrir.setVisible(true);
            } else {
            JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecta!", "Mensaje del Sistema", 2); 
           
            }
        } catch(SQLException ex){
            System.out.println("Error en el login de empresa: " + ex.getMessage());
        }
            
    }
    
       public void insertar(Empresa i) {
        try {
            CallableStatement st = con.prepareCall(" call SP_I_Empresa_C(?,?,?,?,?,?,?,?,?,?)");

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
}
