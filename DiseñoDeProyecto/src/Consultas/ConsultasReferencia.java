package Consultas;
import Entidades.Referencia;
import Formularios.frmP_Trabajador;
import Modelo.conexionbd;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class ConsultasReferencia {
    private Connection con = new conexionbd().getconexion();
    frmP_Trabajador frmP_Tr;
    
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
    
    public void eliminarReferencia(Referencia ref){
        try {
            CallableStatement st = con.prepareCall("CALL SP_D_Referencia(?)");
            
            st.setInt("idExp", ref.getIdreferencia());
            
            st.execute();
            
            JOptionPane.showMessageDialog(null, "Eliminado con Exito");
        } catch (Exception e) {
            System.out.println("Error al eliminar registro: " + e.getMessage());
        }
    }
    
    public void mostrarReferencias(int id){
        try {
            CallableStatement st = con.prepareCall("CALL SP_M_Referencia(?)");
            
            st.setInt("idTrabajadorRef", id);
            
            ResultSet rs = st.executeQuery();
            
            while(rs.next()){
                int orden = rs.getInt("idReferencia");
                
                switch(orden){
                    case 1: {
                        frmP_Tr.lblNombreRef1.setText(rs.getString("nombreReferente") + " " + rs.getString("apellidoReferente"));
                        frmP_Tr.lblEmpresaRef1.setText(rs.getString("empresaReferente"));
                        frmP_Tr.lblCargoRef1.setText(rs.getString("cargoReferente"));
                        frmP_Tr.lblCorreoRef1.setText(rs.getString("correoReferente"));
                        frmP_Tr.lblTelefonoRef1.setText(rs.getString("telefonoReferente"));
                        break;
                    }
                    case 2: {
                        frmP_Tr.lblNombreRef2.setText(rs.getString("nombreReferente") + " " + rs.getString("apellidoReferente"));
                        frmP_Tr.lblEmpresaRef2.setText(rs.getString("empresaReferente"));
                        frmP_Tr.lblCargoRef2.setText(rs.getString("cargoReferente"));
                        frmP_Tr.lblCorreoRef2.setText(rs.getString("correoReferente"));
                        frmP_Tr.lblTelefonoRef2.setText(rs.getString("telefonoReferente"));
                        break;
                    }
                    case 3: {
                        frmP_Tr.lblNombreRef3.setText(rs.getString("nombreReferente") + " " + rs.getString("apellidoReferente"));
                        frmP_Tr.lblEmpresaRef3.setText(rs.getString("empresaReferente"));
                        frmP_Tr.lblCargoRef3.setText(rs.getString("cargoReferente"));
                        frmP_Tr.lblCorreoRef3.setText(rs.getString("correoReferente"));
                        frmP_Tr.lblTelefonoRef3.setText(rs.getString("telefonoReferente"));
                        break;
                    }
                }
                
            }
        } catch (Exception e) {
        }
    }
}
