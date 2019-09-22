package Consultas;
import Modelo.conexionbd;
import Entidades.Trabajador;
import java.sql.*;
import javax.swing.JOptionPane;

public class ConsultasTrabajador {
    
    private Connection con = new conexionbd().getconexion();
    
    public void ValidarTrabajador(Trabajador T){
    
        int Resultado = 0; 
        try {
            CallableStatement st = con.prepareCall("call SP_V_Trabajador(?,?)");
            
            st.setString("correoT", T.getCorreo());
            st.setString("passT", T.getPass());
            
            ResultSet rs = st.executeQuery();
            
            if(rs.next()){
                Resultado = 1;
            } else {
            JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecta!", "Mensaje del Sistema", 2);
            }
        } catch (SQLException ex) {
            System.out.println("Error en la validacion del Trabajador: " + ex.getMessage());

        }
    }
}
