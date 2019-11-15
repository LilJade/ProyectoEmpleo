package Consultas;

import Entidades.Estudio;
import Modelo.conexionbd;
import Formularios.frmP_Trabajador;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConsultasEstudio {

    private Connection con = new conexionbd().getconexion();
    frmP_Trabajador frmP_Tr;

    public void insertarEstudios(Estudio est){
        try {
            CallableStatement st = con.prepareCall("CALL SP_I_Estudio(?,?,?,?,?,?)");
            
            st.setString("institucionEst", est.getInstitucion());
            st.setString("tituloEst", est.getTitulo());
            st.setString("añoTerminado", est.getAñoTerminado());
            st.setString("ciudadEst", est.getCuidad());
            st.setInt("ordenEst", est.getOrden());
            st.setInt("idTrabajadorEst", est.getIdTrabajador());
            
            st.execute();
            JOptionPane.showMessageDialog(null, "Registrado con Exito");
        } catch (Exception e) {
            System.out.println("Error de insercion: " + e.getMessage());
        }
    }
    
    public void actualizarEstudios(Estudio est){
        try {
            CallableStatement st = con.prepareCall("CALL SP_U_Estudio(?,?,?,?,?,?,?)");
            
            st.setString("institucionEst", est.getInstitucion());
            st.setString("tituloEst", est.getTitulo());
            st.setString("añoTerminado", est.getAñoTerminado());
            st.setString("ciudadEst", est.getCuidad());
            st.setInt("ordenEst", est.getOrden());
            st.setInt("idTrabajadorEst", est.getIdTrabajador());
            st.setInt("idEstudioEst", est.getIdEstudio());
            
            st.execute();
            JOptionPane.showMessageDialog(null, "Actualizado con Exito");
        } catch (Exception e) {
            System.out.println("Error al actualizar registro: " + e.getMessage());
        }
    }
    
    public void eliminarEstudios(Estudio est){
        try {
            CallableStatement st = con.prepareCall("CALL SP_D_Estudio(?)");
            
            st.setInt("idEstudioEst", est.getIdEstudio());
            
            st.execute();
            
            JOptionPane.showMessageDialog(null, "Actualizado con Exito");
        } catch (Exception e) {
            System.out.println("Error al eliminar registro: " + e.getMessage());
        }
    }
    
    public void mostrarEstudios(int id) {
        try {
            CallableStatement st = con.prepareCall("CALL SP_M_Estudio(?)");

            st.setInt("idTrabajadorEst", id);

            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                int orden = rs.getInt("idEstudio");

                switch (orden) {
                    case 1: {
                            frmP_Tr.lblAño1.setText(String.valueOf(rs.getString("añoTerminado")));
                            frmP_Tr.lblCiudad1.setText(rs.getString("ciudad"));
                            frmP_Tr.lblTitulo1.setText(rs.getString("titulo"));
                            frmP_Tr.lblInstitucion1.setText(rs.getString("institucion"));
                        break;
                    }
                    case 2: {
                            frmP_Tr.lblAño2.setText(String.valueOf(rs.getString("añoTerminado")));
                            frmP_Tr.lblCiudad2.setText(rs.getString("ciudad"));
                            frmP_Tr.lblTitulo2.setText(rs.getString("titulo"));
                            frmP_Tr.lblInstitucion2.setText(rs.getString("institucion"));
                        break;
                    }

                    case 3: {
                            frmP_Tr.lblAño3.setText(String.valueOf(rs.getString("añoTerminado")));
                            frmP_Tr.lblCiudad3.setText(rs.getString("ciudad"));
                            frmP_Tr.lblTitulo3.setText(rs.getString("titulo"));
                            frmP_Tr.lblInstitucion3.setText(rs.getString("institucion"));
                        break;
                    }

                    case 4: {
                            frmP_Tr.lblAño4.setText(String.valueOf(rs.getString("añoTerminado")));
                            frmP_Tr.lblCiudad4.setText(rs.getString("ciudad"));
                            frmP_Tr.lblTitulo4.setText(rs.getString("titulo"));
                            frmP_Tr.lblInstitucion4.setText(rs.getString("institucion"));
                        break;
                    }

                    case 5: {
                            frmP_Tr.lblAño5.setText(String.valueOf(rs.getString("añoTerminado")));
                            frmP_Tr.lblCiudad5.setText(rs.getString("ciudad"));
                            frmP_Tr.lblTitulo5.setText(rs.getString("titulo"));
                            frmP_Tr.lblInstitucion5.setText(rs.getString("institucion"));
                        break;
                    }
                    
                    case  6:{
                            frmP_Tr.lblAño6.setText(String.valueOf(rs.getString("añoTerminado")));
                            frmP_Tr.lblCiudad6.setText(rs.getString("ciudad"));
                            frmP_Tr.lblTitulo6.setText(rs.getString("titulo"));
                            frmP_Tr.lblInstitucion6.setText(rs.getString("institucion"));
                        break;
                    }
                }
            }
        } catch (SQLException ex) {
            System.out.println("Error al extraer Estudio: " + ex.getMessage());
        }
    }
}
