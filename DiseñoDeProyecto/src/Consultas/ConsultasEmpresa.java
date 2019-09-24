package Consultas;
import Modelo.conexionbd;
import Entidades.Empresa;
import Formularios.frmEmpresa;
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
}
