package Consultas;
import Entidades.Referencia;
import Formularios.frmP_Trabajador;
import Modelo.conexionbd;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ConsultasReferencia {

    private Connection con = new conexionbd().getconexion();
    frmP_Trabajador frmP_Tr;

    public ArrayList<Referencia> mostrarExperienciasCrud(int id) {
        ArrayList<Referencia> CrudReferencias = new ArrayList<>();

        try {
            CallableStatement st = con.prepareCall("CALL SP_CM_Referencia(?)");
            st.setInt("idTrabajadorRef", id);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                Referencia ref = new Referencia();
                ref.setNombrereferente(rs.getString("nombreReferente"));
                ref.setApellidorefrente(rs.getString("apellidoReferente"));
                ref.setEmpresareferente(rs.getString("empresaReferente"));
                ref.setCargoReferente(rs.getString("cargoReferente"));
                ref.setTelefonoReferente(rs.getString("telefonoReferente"));
                ref.setCorreoReferente(rs.getString("correoReferente"));
                ref.setOrden(rs.getInt("orden"));
                ref.setIdTrabajador(rs.getInt("idTrabajador"));
                CrudReferencias.add(ref);
            }
        } catch (Exception e) {
            System.out.println("Error al obtener la lista de registros... " + e.getMessage());
        }

        return CrudReferencias;
    }
    
    public void insertarExperiencia(Referencia ref) {
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

    public void actualizarExperiencia(Referencia ref) {
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

    public void eliminarReferencia(Referencia ref) {
        try {
            CallableStatement st = con.prepareCall("CALL SP_D_Referencia(?)");

            st.setInt("idExp", ref.getIdreferencia());

            st.execute();

            JOptionPane.showMessageDialog(null, "Eliminado con Exito");
        } catch (Exception e) {
            System.out.println("Error al eliminar registro: " + e.getMessage());
        }
    }

    public void mostrarReferencias(int id) {
        try {
            CallableStatement st = con.prepareCall("CALL SP_M_Referencia(?)");

            st.setInt("idTrabajadorRef", id);

            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                int orden = rs.getInt("idReferencia");
                int estilo = rs.getInt("estilo");

                if (estilo == 1) {
                    switch (orden) {
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
                } else if (estilo == 2) {
                    switch (orden) {
                        case 1: {
                            frmP_Tr.lblNombreRef4.setText(rs.getString("nombreReferente") + " " + rs.getString("apellidoReferente"));
                            frmP_Tr.lblEmpresaRef4.setText(rs.getString("empresaReferente"));
                            frmP_Tr.lblCargoRef4.setText(rs.getString("cargoReferente"));
                            frmP_Tr.lblCorreoRef4.setText(rs.getString("correoReferente"));
                            frmP_Tr.lblTelefonoRef4.setText(rs.getString("telefonoReferente"));
                            break;
                        }
                        case 2: {
                            frmP_Tr.lblNombreRef5.setText(rs.getString("nombreReferente") + " " + rs.getString("apellidoReferente"));
                            frmP_Tr.lblEmpresaRef5.setText(rs.getString("empresaReferente"));
                            frmP_Tr.lblCargoRef5.setText(rs.getString("cargoReferente"));
                            frmP_Tr.lblCorreoRef5.setText(rs.getString("correoReferente"));
                            frmP_Tr.lblTelefonoRef5.setText(rs.getString("telefonoReferente"));
                            break;
                        }
                        case 3: {
                            frmP_Tr.lblNombreRef6.setText(rs.getString("nombreReferente") + " " + rs.getString("apellidoReferente"));
                            frmP_Tr.lblEmpresaRef6.setText(rs.getString("empresaReferente"));
                            frmP_Tr.lblCargoRef6.setText(rs.getString("cargoReferente"));
                            frmP_Tr.lblCorreoRef6.setText(rs.getString("correoReferente"));
                            frmP_Tr.lblTelefonoRef6.setText(rs.getString("telefonoReferente"));
                            break;
                        }
                    }
                } else if (estilo == 3) {
                    switch (orden) {
                        case 1: {
                            frmP_Tr.lblNombreRef10.setText(rs.getString("nombreReferente") + " " + rs.getString("apellidoReferente"));
                            frmP_Tr.lblEmpresaRef10.setText(rs.getString("empresaReferente"));
                            frmP_Tr.lblCargoRef10.setText(rs.getString("cargoReferente"));
                            frmP_Tr.lblCorreoRef10.setText(rs.getString("correoReferente"));
                            frmP_Tr.lblTelefonoRef10.setText(rs.getString("telefonoReferente"));
                            break;
                        }
                        case 2: {
                            frmP_Tr.lblNombreRef11.setText(rs.getString("nombreReferente") + " " + rs.getString("apellidoReferente"));
                            frmP_Tr.lblEmpresaRef11.setText(rs.getString("empresaReferente"));
                            frmP_Tr.lblCargoRef11.setText(rs.getString("cargoReferente"));
                            frmP_Tr.lblCorreoRef11.setText(rs.getString("correoReferente"));
                            frmP_Tr.lblTelefonoRef11.setText(rs.getString("telefonoReferente"));
                            break;
                        }
                        case 3: {
                            frmP_Tr.lblNombreRef12.setText(rs.getString("nombreReferente") + " " + rs.getString("apellidoReferente"));
                            frmP_Tr.lblEmpresaRef12.setText(rs.getString("empresaReferente"));
                            frmP_Tr.lblCargoRef12.setText(rs.getString("cargoReferente"));
                            frmP_Tr.lblCorreoRef12.setText(rs.getString("correoReferente"));
                            frmP_Tr.lblTelefonoRef12.setText(rs.getString("telefonoReferente"));
                            break;
                        }
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error al rescatar estudios: " + e.getMessage());
        }
    }
}
