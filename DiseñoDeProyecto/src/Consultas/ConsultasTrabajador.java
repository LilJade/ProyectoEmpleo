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
    
      public void insertar(Trabajador i) {
        try {
            CallableStatement st = con.prepareCall(" call SP_I_Trabajador(?,?,?,?,?,?,?,?,?,?,?,?,?)");

            st.setString("nombresT", i.getNombres());
            st.setString("apellidosT", i.getApellidos());
            st.setInt("edadT", i.getEdad());
            st.setString("sexoT", i.getSexo());
            st.setString("direccionT", i.getDireccion());
            st.setString("celularT", i.getCelular());
            st.setString("telefonoFijoT", i.getTelefonoFijo());
            st.setString("duiT", i.getDui());
            st.setString("nitT", i.getNit());
            st.setString("correoT", i.getCorreo());
            st.setString("passT", i.getPass());
            
            st.setBytes("imgPerfilT", i.getImgPerfil());
            st.setString("descripcionT", i.getDescripcion());
            st.execute();
            
            JOptionPane.showMessageDialog(null, "Registrado con Exito");

        } catch (Exception ex) {
           System.out.println("Error de insercion: " + ex.getMessage());
        }
    }
}
