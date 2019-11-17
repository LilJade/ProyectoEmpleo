package Consultas;
import Entidades.Experiencia;
import Formularios.frmP_Trabajador;
import Modelo.conexionbd;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class ConsultasExperiencia {
    private Connection con = new conexionbd().getconexion();
    frmP_Trabajador frmP_Tr;
    
        public void insertarExperiencia(Experiencia exp){
        try {
            CallableStatement st = con.prepareCall("CALL SP_I_Experiencia(?,?,?,?,?,?,?)");
            
            st.setString("nombreEmpresaExp", exp.getNombreEmpresa());
            st.setString("cargoOcupadoExp", exp.getCargoOcupado());
            st.setString("descripcionExp", exp.getDescripcion());
            st.setString("fechaInicioExp", exp.getFechaInicio());
            st.setString("fechaFinalExp", exp.getFechaFinal());
            st.setInt("ordenExp", exp.getOrden());
            st.setInt("idTrabajadorExp", exp.getIdTrabajador());
            
            st.execute();
            JOptionPane.showMessageDialog(null, "Registrado con Exito");
        } catch (Exception e) {
            System.out.println("Error de insercion: " + e.getMessage());
        }
    }
    
    public void actualizarExperiencia(Experiencia exp){
        try {
            CallableStatement st = con.prepareCall("CALL SP_U_Experiencia(?,?,?,?,?,?,?,?)");
            
            st.setString("nombreEmpresaExp", exp.getNombreEmpresa());
            st.setString("cargoOcupadoExp", exp.getCargoOcupado());
            st.setString("descripcionExp", exp.getDescripcion());
            st.setString("fechaInicioExp", exp.getFechaInicio());
            st.setString("fechaFinalExp", exp.getFechaFinal());
            st.setInt("ordenExp", exp.getOrden());
            st.setInt("idTrabajadorExp", exp.getIdTrabajador());
            st.setInt("idExp", exp.getIdExperiencia());
            
            st.execute();
            JOptionPane.showMessageDialog(null, "Actualizado con Exito");
        } catch (Exception e) {
            System.out.println("Error al actualizar registro: " + e.getMessage());
        }
    }
    
    public void eliminarEstudios(Experiencia exp){
        try {
            CallableStatement st = con.prepareCall("CALL SP_D_Experiencia(?)");
            
            st.setInt("idExp", exp.getIdExperiencia());
            
            st.execute();
            
            JOptionPane.showMessageDialog(null, "Eliminado con Exito");
        } catch (Exception e) {
            System.out.println("Error al eliminar registro: " + e.getMessage());
        }
    }
    
    public void mostrarExperiencias(int id) {
        try {
            CallableStatement st = con.prepareCall("call SP_M_Experiencia(?)");

            st.setInt("idTrabajadorExp", id);

            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                int orden = rs.getInt("idExperiencia");
                int estilo = rs.getInt("estilo");

                if (estilo == 1) {
                    switch (orden) {
                        case 1: {
                            frmP_Tr.lblCargo1.setText(rs.getString("cargoOcupado"));
                            frmP_Tr.lblInstitucionExp1.setText(rs.getString("nombreEmpresa"));
                            frmP_Tr.añoExp1.setText(String.valueOf(rs.getDate("fechaInicio")) + " - " + String.valueOf(rs.getDate("fehaFinal")));
                            frmP_Tr.descripcionExp1.setText(rs.getString("descripcion"));
                            break;
                        }
                        case 2: {
                            frmP_Tr.lblCargo2.setText(rs.getString("cargoOcupado"));
                            frmP_Tr.lblInstitucionExp2.setText(rs.getString("nombreEmpresa"));
                            frmP_Tr.añoExp2.setText(String.valueOf(rs.getDate("fechaInicio")) + " - " + String.valueOf(rs.getDate("fehaFinal")));
                            frmP_Tr.descripcionExp2.setText(rs.getString("descripcion"));
                            break;
                        }
                        case 3: {
                            frmP_Tr.lblCargo3.setText(rs.getString("cargoOcupado"));
                            frmP_Tr.lblInstitucionExp3.setText(rs.getString("nombreEmpresa"));
                            frmP_Tr.añoExp3.setText(String.valueOf(rs.getDate("fechaInicio")) + " - " + String.valueOf(rs.getDate("fehaFinal")));
                            frmP_Tr.descripcionExp3.setText(rs.getString("descripcion"));
                            break;
                        }
                        case 4: {
                            frmP_Tr.lblCargo4.setText(rs.getString("cargoOcupado"));
                            frmP_Tr.lblInstitucionExp4.setText(rs.getString("nombreEmpresa"));
                            frmP_Tr.añoExp4.setText(String.valueOf(rs.getDate("fechaInicio")) + " - " + String.valueOf(rs.getDate("fehaFinal")));
                            frmP_Tr.descripcionExp4.setText(rs.getString("descripcion"));
                            break;
                        }
                        case 5: {
                            frmP_Tr.lblCargo5.setText(rs.getString("cargoOcupado"));
                            frmP_Tr.lblInstitucionExp5.setText(rs.getString("nombreEmpresa"));
                            frmP_Tr.añoExp5.setText(String.valueOf(rs.getDate("fechaInicio")) + " - " + String.valueOf(rs.getDate("fehaFinal")));
                            frmP_Tr.descripcionExp5.setText(rs.getString("descripcion"));
                            break;
                        }
                    }
                } else if (estilo == 2) {
                    switch (orden) {
                        case 1: {
                            frmP_Tr.lblCargo6.setText(rs.getString("cargoOcupado"));
                            frmP_Tr.lblInstitucionExp6.setText(rs.getString("nombreEmpresa"));
                            frmP_Tr.añoExp6.setText(String.valueOf(rs.getDate("fechaInicio")) + " - " + String.valueOf(rs.getDate("fehaFinal")));
                            frmP_Tr.descripcionExp6.setText(rs.getString("descripcion"));
                            break;
                        }
                        case 2: {
                            frmP_Tr.lblCargo7.setText(rs.getString("cargoOcupado"));
                            frmP_Tr.lblInstitucionExp7.setText(rs.getString("nombreEmpresa"));
                            frmP_Tr.añoExp7.setText(String.valueOf(rs.getDate("fechaInicio")) + " - " + String.valueOf(rs.getDate("fehaFinal")));
                            frmP_Tr.descripcionExp7.setText(rs.getString("descripcion"));
                            break;
                        }
                        case 3: {
                            frmP_Tr.lblCargo8.setText(rs.getString("cargoOcupado"));
                            frmP_Tr.lblInstitucionExp8.setText(rs.getString("nombreEmpresa"));
                            frmP_Tr.añoExp8.setText(String.valueOf(rs.getDate("fechaInicio")) + " - " + String.valueOf(rs.getDate("fehaFinal")));
                            frmP_Tr.descripcionExp8.setText(rs.getString("descripcion"));
                            break;
                        }
                        case 4: {
                            frmP_Tr.lblCargo9.setText(rs.getString("cargoOcupado"));
                            frmP_Tr.lblInstitucionExp9.setText(rs.getString("nombreEmpresa"));
                            frmP_Tr.añoExp9.setText(String.valueOf(rs.getDate("fechaInicio")) + " - " + String.valueOf(rs.getDate("fehaFinal")));
                            frmP_Tr.descripcionExp9.setText(rs.getString("descripcion"));
                            break;
                        }
                        case 5: {
                            frmP_Tr.lblCargo10.setText(rs.getString("cargoOcupado"));
                            frmP_Tr.lblInstitucionExp10.setText(rs.getString("nombreEmpresa"));
                            frmP_Tr.añoExp10.setText(String.valueOf(rs.getDate("fechaInicio")) + " - " + String.valueOf(rs.getDate("fehaFinal")));
                            frmP_Tr.descripcionExp10.setText(rs.getString("descripcion"));
                            break;
                        }
                    }
                } else if (estilo == 3) {
                    switch (orden) {
                        case 1: {
                            frmP_Tr.lblCargo17.setText(rs.getString("cargoOcupado"));
                            frmP_Tr.lblInstitucionExp17.setText(rs.getString("nombreEmpresa"));
                            frmP_Tr.añoExp17.setText(String.valueOf(rs.getDate("fechaInicio")) + " - " + String.valueOf(rs.getDate("fehaFinal")));
                            frmP_Tr.descripcionExp17.setText(rs.getString("descripcion"));
                            break;
                        }
                        case 2: {
                            frmP_Tr.lblCargo18.setText(rs.getString("cargoOcupado"));
                            frmP_Tr.lblInstitucionExp18.setText(rs.getString("nombreEmpresa"));
                            frmP_Tr.añoExp18.setText(String.valueOf(rs.getDate("fechaInicio")) + " - " + String.valueOf(rs.getDate("fehaFinal")));
                            frmP_Tr.descripcionExp18.setText(rs.getString("descripcion"));
                            break;
                        }
                        case 3: {
                            frmP_Tr.lblCargo19.setText(rs.getString("cargoOcupado"));
                            frmP_Tr.lblInstitucionExp19.setText(rs.getString("nombreEmpresa"));
                            frmP_Tr.añoExp19.setText(String.valueOf(rs.getDate("fechaInicio")) + " - " + String.valueOf(rs.getDate("fehaFinal")));
                            frmP_Tr.descripcionExp19.setText(rs.getString("descripcion"));
                            break;
                        }
                        case 4: {
                            frmP_Tr.lblCargo20.setText(rs.getString("cargoOcupado"));
                            frmP_Tr.lblInstitucionExp20.setText(rs.getString("nombreEmpresa"));
                            frmP_Tr.añoExp20.setText(String.valueOf(rs.getDate("fechaInicio")) + " - " + String.valueOf(rs.getDate("fehaFinal")));
                            frmP_Tr.descripcionExp20.setText(rs.getString("descripcion"));
                            break;
                        }
                        case 5: {
                            frmP_Tr.lblCargo21.setText(rs.getString("cargoOcupado"));
                            frmP_Tr.lblInstitucionExp21.setText(rs.getString("nombreEmpresa"));
                            frmP_Tr.añoExp21.setText(String.valueOf(rs.getDate("fechaInicio")) + " - " + String.valueOf(rs.getDate("fehaFinal")));
                            frmP_Tr.descripcionExp21.setText(rs.getString("descripcion"));
                            break;
                        }
                    }
                }
            }
        } catch (Exception e) {
        }
    }
    
}
