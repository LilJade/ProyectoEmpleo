package Consultas;

import Entidades.Estudio;
import Modelo.conexionbd;
import Formularios.frmP_Trabajador;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ConsultasEstudio {

    private Connection con = new conexionbd().getconexion();
    frmP_Trabajador frmP_Tr;

    public ArrayList<Estudio> mostrarEstudiosCrud(int id){
        ArrayList<Estudio> CrudEstudios = new ArrayList<>();
        
        try {
            CallableStatement st = con.prepareCall("CALL SP_CM_Estudio(?)");
            st.setInt("idTrabajadorEst", id);
            ResultSet rs = st.executeQuery();
            
            while(rs.next()){
                Estudio est = new Estudio();
                
                est.setIdEstudio(rs.getInt("idEstudio"));
                est.setInstitucion(rs.getString("institucion"));
                est.setTitulo(rs.getString("titulo"));
                est.setAñoTerminado(rs.getString("añoTerminado"));
                est.setCuidad(rs.getString("ciudad"));
                est.setOrden(rs.getInt("orden"));
                est.setIdTrabajador(rs.getInt("idTrabajador"));
                CrudEstudios.add(est);
            }
        } catch (Exception e) {
            System.out.println("Error al obtener la lista de registros... " + e.getMessage());
        }
        
        return CrudEstudios;
    }
    
    public void insertarEstudios(Estudio est){
        try {
            CallableStatement st = con.prepareCall("CALL SP_I_Estudio(?,?,?,?,?)");
            
            st.setString("institucionEst", est.getInstitucion());
            st.setString("tituloEst", est.getTitulo());
            st.setString("añoTerminadoEst",est.getAñoTerminado());
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
            st.setString("añoTerminadoEst", est.getAñoTerminado());
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
                int estilo = rs.getInt("estilo");

                if (estilo == 1) {
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

                        case 6: {
                            frmP_Tr.lblAño6.setText(String.valueOf(rs.getString("añoTerminado")));
                            frmP_Tr.lblCiudad6.setText(rs.getString("ciudad"));
                            frmP_Tr.lblTitulo6.setText(rs.getString("titulo"));
                            frmP_Tr.lblInstitucion6.setText(rs.getString("institucion"));
                            break;
                        }
                    }
                } else if (estilo == 2) {
                    switch (orden) {
                        case 1: {
                            frmP_Tr.lblAño1_p2.setText(String.valueOf(rs.getString("añoTerminado")));
                            frmP_Tr.lblCiudad1_p2.setText(rs.getString("ciudad"));
                            frmP_Tr.lblTitulo1_p2.setText(rs.getString("titulo"));
                            frmP_Tr.lblInstitucion1_p2.setText(rs.getString("institucion"));
                            break;
                        }
                        case 2: {
                            frmP_Tr.lblAño2_p2.setText(String.valueOf(rs.getString("añoTerminado")));
                            frmP_Tr.lblCiudad2_p2.setText(rs.getString("ciudad"));
                            frmP_Tr.lblTitulo2_p2.setText(rs.getString("titulo"));
                            frmP_Tr.lblInstitucion2_p2.setText(rs.getString("institucion"));
                            break;
                        }

                        case 3: {
                            frmP_Tr.lblAño3_p2.setText(String.valueOf(rs.getString("añoTerminado")));
                            frmP_Tr.lblCiudad3_p2.setText(rs.getString("ciudad"));
                            frmP_Tr.lblTitulo3_p2.setText(rs.getString("titulo"));
                            frmP_Tr.lblInstitucion3_p2.setText(rs.getString("institucion"));
                            break;
                        }

                        case 4: {
                            frmP_Tr.lblAño4_p2.setText(String.valueOf(rs.getString("añoTerminado")));
                            frmP_Tr.lblCiudad4_p2.setText(rs.getString("ciudad"));
                            frmP_Tr.lblTitulo4_p2.setText(rs.getString("titulo"));
                            frmP_Tr.lblInstitucion4_p2.setText(rs.getString("institucion"));
                            break;
                        }

                        case 5: {
                            frmP_Tr.lblAño5_p2.setText(String.valueOf(rs.getString("añoTerminado")));
                            frmP_Tr.lblCiudad5_p2.setText(rs.getString("ciudad"));
                            frmP_Tr.lblTitulo5_p2.setText(rs.getString("titulo"));
                            frmP_Tr.lblInstitucion5_p2.setText(rs.getString("institucion"));
                            break;
                        }

                        case 6: {
                            frmP_Tr.lblAño6_p2.setText(String.valueOf(rs.getString("añoTerminado")));
                            frmP_Tr.lblCiudad6_p2.setText(rs.getString("ciudad"));
                            frmP_Tr.lblTitulo6_p2.setText(rs.getString("titulo"));
                            frmP_Tr.lblInstitucion6_p2.setText(rs.getString("institucion"));
                            break;
                        }
                    }
                } else if (estilo == 3) {
                    switch (orden) {
                        case 1: {
                            frmP_Tr.lblAño7.setText(String.valueOf(rs.getString("añoTerminado")));
                            frmP_Tr.lblCiudad7.setText(rs.getString("ciudad"));
                            frmP_Tr.lblTitulo7.setText(rs.getString("titulo"));
                            frmP_Tr.lblInstitucion7.setText(rs.getString("institucion"));
                            break;
                        }
                        case 2: {
                            frmP_Tr.lblAño8.setText(String.valueOf(rs.getString("añoTerminado")));
                            frmP_Tr.lblCiudad8.setText(rs.getString("ciudad"));
                            frmP_Tr.lblTitulo8.setText(rs.getString("titulo"));
                            frmP_Tr.lblInstitucion8.setText(rs.getString("institucion"));
                            break;
                        }

                        case 3: {
                            frmP_Tr.lblAño9.setText(String.valueOf(rs.getString("añoTerminado")));
                            frmP_Tr.lblCiudad9.setText(rs.getString("ciudad"));
                            frmP_Tr.lblTitulo9.setText(rs.getString("titulo"));
                            frmP_Tr.lblInstitucion9.setText(rs.getString("institucion"));
                            break;
                        }

                        case 4: {
                            frmP_Tr.lblAño10.setText(String.valueOf(rs.getString("añoTerminado")));
                            frmP_Tr.lblCiudad10.setText(rs.getString("ciudad"));
                            frmP_Tr.lblTitulo10.setText(rs.getString("titulo"));
                            frmP_Tr.lblInstitucion10.setText(rs.getString("institucion"));
                            break;
                        }

                        case 5: {
                            frmP_Tr.lblAño11.setText(String.valueOf(rs.getString("añoTerminado")));
                            frmP_Tr.lblCiudad11.setText(rs.getString("ciudad"));
                            frmP_Tr.lblTitulo11.setText(rs.getString("titulo"));
                            frmP_Tr.lblInstitucion11.setText(rs.getString("institucion"));
                            break;
                        }

                        case 6: {
                            frmP_Tr.lblAño12.setText(String.valueOf(rs.getString("añoTerminado")));
                            frmP_Tr.lblCiudad12.setText(rs.getString("ciudad"));
                            frmP_Tr.lblTitulo12.setText(rs.getString("titulo"));
                            frmP_Tr.lblInstitucion12.setText(rs.getString("institucion"));
                            break;
                        }
                    }
                }
            }
        } catch (SQLException ex) {
            System.out.println("Error al extraer Estudio: " + ex.getMessage());
        }
    }
}
