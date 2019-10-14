package Consultas;
import Modelo.conexionbd;
import Entidades.Trabajador;
import Formularios.frmP_Trabajador;
import Formularios.frmVisitante;
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
                
                if(Resultado == 1){
                    frmP_Trabajador frmPTr = new frmP_Trabajador();
                    frmVisitante frmV = new frmVisitante();
                    
                    frmPTr.lblSaludo.setText("Bienvenido " + rs.getString("nombres"));
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
