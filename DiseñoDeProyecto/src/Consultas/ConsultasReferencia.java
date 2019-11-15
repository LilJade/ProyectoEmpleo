package Consultas;
import Entidades.Referencia;
import Modelo.conexionbd;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class ConsultasReferencia {
    private Connection con = new conexionbd().getconexion();
    
            public void insertarExperiencia(Referencia ref){
        try {
            CallableStatement st = con.prepareCall("CALL SP_I_Referencia(?,?,?,?,?,?,?,?)");
            
            st.setString("nombreRef", ref.getNombrereferente());
            st.setString("apellidoRef", ref.getApellidorefrente());
            st.setString("empresaRef", ref.getEmpresareferente());
            st.setString("cargoRef", ref.getCargoReferente());
            st.setString("telefonoRef", ref.getTelefonoReferente());
            st.setString("correoRef", ref.getCorreoReferente());
            st.setInt("ordenRef", ref.getOrden());
            st.setInt("idTrabajadorRef", ref.getIdTrabajador());
            
            st.execute();
            JOptionPane.showMessageDialog(null, "Registrado con Exito");
        } catch (Exception e) {
            System.out.println("Error de insercion: " + e.getMessage());
        }
    }
    
    public void actualizarExperiencia(Referencia ref){
        try {
            CallableStatement st = con.prepareCall("CALL SP_U_Referencia(?,?,?,?,?,?,?,?,?)");
            
            st.setString("nombreRef", ref.getNombrereferente());
            st.setString("apellidoRef", ref.getApellidorefrente());
            st.setString("empresaRef", ref.getEmpresareferente());
            st.setString("cargoRef", ref.getCargoReferente());
            st.setString("telefonoRef", ref.getTelefonoReferente());
            st.setString("correoRef", ref.getCorreoReferente());
            st.setInt("ordenRef", ref.getOrden());
            st.setInt("idTrabajadorRef", ref.getIdTrabajador());
            st.setInt("idRef", ref.getIdreferencia());
            st.execute();
            JOptionPane.showMessageDialog(null, "Actualizado con Exito");
        } catch (Exception e) {
            System.out.println("Error al actualizar registro: " + e.getMessage());
        }
    }
    
    public void eliminarEstudios(Referencia ref){
        try {
            CallableStatement st = con.prepareCall("CALL SP_D_Referencia(?)");
            
            st.setInt("idExp", ref.getIdreferencia());
            
            st.execute();
            
            JOptionPane.showMessageDialog(null, "Eliminado con Exito");
        } catch (Exception e) {
            System.out.println("Error al eliminar registro: " + e.getMessage());
        }
    }
}
