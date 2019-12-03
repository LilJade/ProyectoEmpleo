package Consultas;

import Entidades.Experiencia;
import Formularios.frmP_Trabajador;
import Modelo.conexionbd;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ConsultasExperiencia {

    private Connection con = new conexionbd().getconexion();
    frmP_Trabajador frmP_Tr;

    public ArrayList<Experiencia> mostrarExperienciasCrud(int id) {
        ArrayList<Experiencia> CrudExperiencias = new ArrayList<>();

        try {
            CallableStatement st = con.prepareCall("CALL SP_CM_Experiencia(?)");
            st.setInt("idTrabajadorExp", id);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                Experiencia exp = new Experiencia();
                exp.setIdExperiencia(rs.getInt("idExperiencia"));
                exp.setNombreEmpresa(rs.getString("nombreEmpresa"));
                exp.setCargoOcupado(rs.getString("cargoOcupado"));
                exp.setDescripcion(rs.getString("descripcion"));
                exp.setFechaInicio(rs.getString("fechaInicio"));
                exp.setFechaFinal(rs.getString("fechaFinal"));
                exp.setOrden(rs.getInt("orden"));
                exp.setIdTrabajador(rs.getInt("idTrabajador"));
                CrudExperiencias.add(exp);
            }
        } catch (Exception e) {
            System.out.println("Error al obtener la lista de registros... " + e.getMessage());
        }

        return CrudExperiencias;
    }

    public void insertarExperiencia(Experiencia exp) {
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

    public void actualizarExperiencia(Experiencia exp) {
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

    public void eliminarEstudios(Experiencia exp) {
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
                            frmP_Tr.lblCargo1_p1.setText(rs.getString("cargoOcupado"));
                            frmP_Tr.lblInstitucionExp1_p1.setText(rs.getString("nombreEmpresa"));
                            frmP_Tr.añoExp1_p1.setText(String.valueOf(rs.getDate("fechaInicio")) + " - " + String.valueOf(rs.getDate("fechaFinal")));
                            frmP_Tr.descripcionExp1_p1.setText(rs.getString("descripcion"));
                            break;
                        }
                        case 2: {
                            frmP_Tr.lblCargo2_p1.setText(rs.getString("cargoOcupado"));
                            frmP_Tr.lblInstitucionExp2_p1.setText(rs.getString("nombreEmpresa"));
                            frmP_Tr.añoExp2_p1.setText(String.valueOf(rs.getDate("fechaInicio")) + " - " + String.valueOf(rs.getDate("fechaFinal")));
                            frmP_Tr.descripcionExp2_p1.setText(rs.getString("descripcion"));
                            break;
                        }
                        case 3: {
                            frmP_Tr.lblCargo3_p1.setText(rs.getString("cargoOcupado"));
                            frmP_Tr.lblInstitucionExp3_p1.setText(rs.getString("nombreEmpresa"));
                            frmP_Tr.añoExp3_p1.setText(String.valueOf(rs.getDate("fechaInicio")) + " - " + String.valueOf(rs.getDate("fechaFinal")));
                            frmP_Tr.descripcionExp3_p1.setText(rs.getString("descripcion"));
                            break;
                        }
                        case 4: {
                            frmP_Tr.lblCargo4_p1.setText(rs.getString("cargoOcupado"));
                            frmP_Tr.lblInstitucionExp4_p1.setText(rs.getString("nombreEmpresa"));
                            frmP_Tr.añoExp4_p1.setText(String.valueOf(rs.getDate("fechaInicio")) + " - " + String.valueOf(rs.getDate("fechaFinal")));
                            frmP_Tr.descripcionExp4_p1.setText(rs.getString("descripcion"));
                            break;
                        }
                        case 5: {
                            frmP_Tr.lblCargo5_p1.setText(rs.getString("cargoOcupado"));
                            frmP_Tr.lblInstitucionExp5_p1.setText(rs.getString("nombreEmpresa"));
                            frmP_Tr.añoExp5_p1.setText(String.valueOf(rs.getDate("fechaInicio")) + " - " + String.valueOf(rs.getDate("fechaFinal")));
                            frmP_Tr.descripcionExp5_p1.setText(rs.getString("descripcion"));
                            break;
                        }
                    }
                } else if (estilo == 2) {
                    switch (orden) {
                        case 1: {
                            frmP_Tr.lblCargo1_p2.setText(rs.getString("cargoOcupado"));
                            frmP_Tr.lblInstitucionExp1_p2.setText(rs.getString("nombreEmpresa"));
                            frmP_Tr.añoExp1_p2.setText(String.valueOf(rs.getDate("fechaInicio")) + " - " + String.valueOf(rs.getDate("fechaFinal")));
                            frmP_Tr.descripcionExp1_p2.setText(rs.getString("descripcion"));
                            break;
                        }
                        case 2: {
                            frmP_Tr.lblCargo2_p2.setText(rs.getString("cargoOcupado"));
                            frmP_Tr.lblInstitucionExp2_p2.setText(rs.getString("nombreEmpresa"));
                            frmP_Tr.añoExp2_p2.setText(String.valueOf(rs.getDate("fechaInicio")) + " - " + String.valueOf(rs.getDate("fechaFinal")));
                            frmP_Tr.descripcionExp2_p2.setText(rs.getString("descripcion"));
                            break;
                        }
                        case 3: {
                            frmP_Tr.lblCargo3_p2.setText(rs.getString("cargoOcupado"));
                            frmP_Tr.lblInstitucionExp3_p2.setText(rs.getString("nombreEmpresa"));
                            frmP_Tr.añoExp3_p2.setText(String.valueOf(rs.getDate("fechaInicio")) + " - " + String.valueOf(rs.getDate("fechaFinal")));
                            frmP_Tr.descripcionExp3_p2.setText(rs.getString("descripcion"));
                            break;
                        }
                        case 4: {
                            frmP_Tr.lblCargo4_p2.setText(rs.getString("cargoOcupado"));
                            frmP_Tr.lblInstitucionExp4_p2.setText(rs.getString("nombreEmpresa"));
                            frmP_Tr.añoExp4_p2.setText(String.valueOf(rs.getDate("fechaInicio")) + " - " + String.valueOf(rs.getDate("fechaFinal")));
                            frmP_Tr.descripcionExp4_p2.setText(rs.getString("descripcion"));
                            break;
                        }
                        case 5: {
                            frmP_Tr.lblCargo5_p2.setText(rs.getString("cargoOcupado"));
                            frmP_Tr.lblInstitucionExp5_p2.setText(rs.getString("nombreEmpresa"));
                            frmP_Tr.añoExp5_p2.setText(String.valueOf(rs.getDate("fechaInicio")) + " - " + String.valueOf(rs.getDate("fechaFinal")));
                            frmP_Tr.descripcionExp5_p2.setText(rs.getString("descripcion"));
                            break;
                        }
                    }
                } else if (estilo == 3) {
                    switch (orden) {
                        case 1: {
                            frmP_Tr.lblCargo1_p3.setText(rs.getString("cargoOcupado"));
                            frmP_Tr.lblInstitucionExp1_p3.setText(rs.getString("nombreEmpresa"));
                            frmP_Tr.añoExp1_p3.setText(String.valueOf(rs.getDate("fechaInicio")) + " - " + String.valueOf(rs.getDate("fechaFinal")));
                            frmP_Tr.descripcionExp1_p3.setText(rs.getString("descripcion"));
                            break;
                        }
                        case 2: {
                            frmP_Tr.lblCargo2_p3.setText(rs.getString("cargoOcupado"));
                            frmP_Tr.lblInstitucionExp2_p3.setText(rs.getString("nombreEmpresa"));
                            frmP_Tr.añoExp2_p3.setText(String.valueOf(rs.getDate("fechaInicio")) + " - " + String.valueOf(rs.getDate("fechaFinal")));
                            frmP_Tr.descripcionExp2_p3.setText(rs.getString("descripcion"));
                            break;
                        }
                        case 3: {
                            frmP_Tr.lblCargo3_p3.setText(rs.getString("cargoOcupado"));
                            frmP_Tr.lblInstitucionExp3_p3.setText(rs.getString("nombreEmpresa"));
                            frmP_Tr.añoExp3_p3.setText(String.valueOf(rs.getDate("fechaInicio")) + " - " + String.valueOf(rs.getDate("fechaFinal")));
                            frmP_Tr.descripcionExp3_p3.setText(rs.getString("descripcion"));
                            break;
                        }
                        case 4: {
                            frmP_Tr.lblCargo4_p3.setText(rs.getString("cargoOcupado"));
                            frmP_Tr.lblInstitucionExp4_p3.setText(rs.getString("nombreEmpresa"));
                            frmP_Tr.añoExp4_p3.setText(String.valueOf(rs.getDate("fechaInicio")) + " - " + String.valueOf(rs.getDate("fechaFinal")));
                            frmP_Tr.descripcionExp4_p3.setText(rs.getString("descripcion"));
                            break;
                        }
                        case 5: {
                            frmP_Tr.lblCargo5_p3.setText(rs.getString("cargoOcupado"));
                            frmP_Tr.lblInstitucionExp5_p3.setText(rs.getString("nombreEmpresa"));
                            frmP_Tr.añoExp5_p3.setText(String.valueOf(rs.getDate("fechaInicio")) + " - " + String.valueOf(rs.getDate("fechaFinal")));
                            frmP_Tr.descripcionExp5_p3.setText(rs.getString("descripcion"));
                            break;
                        }
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error al extraer experiencias: " + e.getMessage());
        }
    }

}
