package Consultas;
import Entidades.Referencia;
import Formularios.frmP_Trabajador;
import Formularios.frmV_Trabajador;
import Modelo.conexionbd;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ConsultasReferencia {

    private Connection con = new conexionbd().getconexion();
    frmP_Trabajador frmP_Tr;
    frmV_Trabajador frmV_Tr;

    public ArrayList<Referencia> mostrarReferenciasCrud(int id) {
        ArrayList<Referencia> CrudReferencias = new ArrayList<>();

        try {
            CallableStatement st = con.prepareCall("CALL SP_CM_Referencia(?)");
            st.setInt("idTrabajadorRef", id);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                Referencia ref = new Referencia();
                ref.setIdreferencia(rs.getInt("idReferencia"));
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
    
    //METODO INSERTAR REFERENCIA
    public void insertarReferencia(Referencia ref) {
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

    
    //METODO ACTUALIZAR REFERENCIA
    public void actualizarReferencia(Referencia ref) {
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

    //METODO ELIMINAR REFRENCIA
    public void eliminarReferencia(Referencia ref) {
        try {
            CallableStatement st = con.prepareCall("CALL SP_D_Referencia(?)");

            st.setInt("idRef", ref.getIdreferencia());

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
                int orden = rs.getInt("orden");
                int estilo = rs.getInt("estilo");

                if (estilo == 1) {
                    switch (orden) {
                        case 1: {
                            frmP_Tr.lblNombreRef1_p1.setText(rs.getString("nombreReferente") + " " + rs.getString("apellidoReferente"));
                            frmP_Tr.lblEmpresaRef1_p1.setText(rs.getString("empresaReferente"));
                            frmP_Tr.lblCargoRef1_p1.setText(rs.getString("cargoReferente"));
                            frmP_Tr.lblCorreoRef1_p1.setText(rs.getString("correoReferente"));
                            frmP_Tr.lblTelefonoRef1_p1.setText(rs.getString("telefonoReferente"));
                            break;
                        }
                        case 2: {
                            frmP_Tr.lblNombreRef2_p1.setText(rs.getString("nombreReferente") + " " + rs.getString("apellidoReferente"));
                            frmP_Tr.lblEmpresaRef2_p1.setText(rs.getString("empresaReferente"));
                            frmP_Tr.lblCargoRef2_p1.setText(rs.getString("cargoReferente"));
                            frmP_Tr.lblCorreoRef2_p1.setText(rs.getString("correoReferente"));
                            frmP_Tr.lblTelefonoRef2_p1.setText(rs.getString("telefonoReferente"));
                            break;
                        }
                        case 3: {
                            frmP_Tr.lblNombreRef3_p1.setText(rs.getString("nombreReferente") + " " + rs.getString("apellidoReferente"));
                            frmP_Tr.lblEmpresaRef3_p1.setText(rs.getString("empresaReferente"));
                            frmP_Tr.lblCargoRef3_p1.setText(rs.getString("cargoReferente"));
                            frmP_Tr.lblCorreoRef3_p1.setText(rs.getString("correoReferente"));
                            frmP_Tr.lblTelefonoRef3_p1.setText(rs.getString("telefonoReferente"));
                            break;
                        }
                    }
                } else if (estilo == 2) {
                    switch (orden) {
                        case 1: {
                            frmP_Tr.lblNombreRef1_p2.setText(rs.getString("nombreReferente") + " " + rs.getString("apellidoReferente"));
                            frmP_Tr.lblEmpresaRef1_p2.setText(rs.getString("empresaReferente"));
                            frmP_Tr.lblCargoRef1_p2.setText(rs.getString("cargoReferente"));
                            frmP_Tr.lblCorreoRef1_p2.setText(rs.getString("correoReferente"));
                            frmP_Tr.lblTelefonoRef1_p2.setText(rs.getString("telefonoReferente"));
                            break;
                        }
                        case 2: {
                            frmP_Tr.lblNombreRef2_p2.setText(rs.getString("nombreReferente") + " " + rs.getString("apellidoReferente"));
                            frmP_Tr.lblEmpresaRef2_p2.setText(rs.getString("empresaReferente"));
                            frmP_Tr.lblCargoRef2_p2.setText(rs.getString("cargoReferente"));
                            frmP_Tr.lblCorreoRef2_p2.setText(rs.getString("correoReferente"));
                            frmP_Tr.lblTelefonoRef2_p2.setText(rs.getString("telefonoReferente"));
                            break;
                        }
                        case 3: {
                            frmP_Tr.lblNombreRef3_p2.setText(rs.getString("nombreReferente") + " " + rs.getString("apellidoReferente"));
                            frmP_Tr.lblEmpresaRef3_p2.setText(rs.getString("empresaReferente"));
                            frmP_Tr.lblCargoRef3_p2.setText(rs.getString("cargoReferente"));
                            frmP_Tr.lblCorreoRef3_p2.setText(rs.getString("correoReferente"));
                            frmP_Tr.lblTelefonoRef3_p2.setText(rs.getString("telefonoReferente"));
                            break;
                        }
                    }
                } else if (estilo == 3) {
                    switch (orden) {
                        case 1: {
                            frmP_Tr.lblNombreRef1_p3.setText(rs.getString("nombreReferente") + " " + rs.getString("apellidoReferente"));
                            frmP_Tr.lblEmpresaRef1_p3.setText(rs.getString("empresaReferente"));
                            frmP_Tr.lblCargoRef1_p3.setText(rs.getString("cargoReferente"));
                            frmP_Tr.lblCorreoRef1_p3.setText(rs.getString("correoReferente"));
                            frmP_Tr.lblTelefonoRef1_p3.setText(rs.getString("telefonoReferente"));
                            break;
                        }
                        case 2: {
                            frmP_Tr.lblNombreRef2_p3.setText(rs.getString("nombreReferente") + " " + rs.getString("apellidoReferente"));
                            frmP_Tr.lblEmpresaRef2_p3.setText(rs.getString("empresaReferente"));
                            frmP_Tr.lblCargoRef2_p3.setText(rs.getString("cargoReferente"));
                            frmP_Tr.lblCorreoRef2_p3.setText(rs.getString("correoReferente"));
                            frmP_Tr.lblTelefonoRef2_p3.setText(rs.getString("telefonoReferente"));
                            break;
                        }
                        case 3: {
                            frmP_Tr.lblNombreRef3_p3.setText(rs.getString("nombreReferente") + " " + rs.getString("apellidoReferente"));
                            frmP_Tr.lblEmpresaRef3_p3.setText(rs.getString("empresaReferente"));
                            frmP_Tr.lblCargoRef3_p3.setText(rs.getString("cargoReferente"));
                            frmP_Tr.lblCorreoRef3_p3.setText(rs.getString("correoReferente"));
                            frmP_Tr.lblTelefonoRef3_p3.setText(rs.getString("telefonoReferente"));
                            break;
                        }
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error al rescatar estudios: " + e.getMessage());
        }
    }

    public void mostrarReferenciasV(int id) {
        try {
            CallableStatement st = con.prepareCall("CALL SP_M_Referencia(?)");

            st.setInt("idTrabajadorRef", id);

            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                int orden = rs.getInt("orden");
                int estilo = rs.getInt("estilo");

                if (estilo == 1) {
                    switch (orden) {
                        case 1: {
                            frmV_Tr.lblNombreRef1_p1.setText(rs.getString("nombreReferente") + " " + rs.getString("apellidoReferente"));
                            frmV_Tr.lblEmpresaRef1_p1.setText(rs.getString("empresaReferente"));
                            frmV_Tr.lblCargoRef1_p1.setText(rs.getString("cargoReferente"));
                            frmV_Tr.lblCorreoRef1_p1.setText(rs.getString("correoReferente"));
                            frmV_Tr.lblTelefonoRef1_p1.setText(rs.getString("telefonoReferente"));
                            break;
                        }
                        case 2: {
                            frmV_Tr.lblNombreRef2_p1.setText(rs.getString("nombreReferente") + " " + rs.getString("apellidoReferente"));
                            frmV_Tr.lblEmpresaRef2_p1.setText(rs.getString("empresaReferente"));
                            frmV_Tr.lblCargoRef2_p1.setText(rs.getString("cargoReferente"));
                            frmV_Tr.lblCorreoRef2_p1.setText(rs.getString("correoReferente"));
                            frmV_Tr.lblTelefonoRef2_p1.setText(rs.getString("telefonoReferente"));
                            break;
                        }
                        case 3: {
                            frmV_Tr.lblNombreRef3_p1.setText(rs.getString("nombreReferente") + " " + rs.getString("apellidoReferente"));
                            frmV_Tr.lblEmpresaRef3_p1.setText(rs.getString("empresaReferente"));
                            frmV_Tr.lblCargoRef3_p1.setText(rs.getString("cargoReferente"));
                            frmV_Tr.lblCorreoRef3_p1.setText(rs.getString("correoReferente"));
                            frmV_Tr.lblTelefonoRef3_p1.setText(rs.getString("telefonoReferente"));
                            break;
                        }
                    }
                } else if (estilo == 2) {
                    switch (orden) {
                        case 1: {
                            frmV_Tr.lblNombreRef1_p2.setText(rs.getString("nombreReferente") + " " + rs.getString("apellidoReferente"));
                            frmV_Tr.lblEmpresaRef1_p2.setText(rs.getString("empresaReferente"));
                            frmV_Tr.lblCargoRef1_p2.setText(rs.getString("cargoReferente"));
                            frmV_Tr.lblCorreoRef1_p2.setText(rs.getString("correoReferente"));
                            frmV_Tr.lblTelefonoRef1_p2.setText(rs.getString("telefonoReferente"));
                            break;
                        }
                        case 2: {
                            frmV_Tr.lblNombreRef2_p2.setText(rs.getString("nombreReferente") + " " + rs.getString("apellidoReferente"));
                            frmV_Tr.lblEmpresaRef2_p2.setText(rs.getString("empresaReferente"));
                            frmV_Tr.lblCargoRef2_p2.setText(rs.getString("cargoReferente"));
                            frmV_Tr.lblCorreoRef2_p2.setText(rs.getString("correoReferente"));
                            frmV_Tr.lblTelefonoRef2_p2.setText(rs.getString("telefonoReferente"));
                            break;
                        }
                        case 3: {
                            frmV_Tr.lblNombreRef3_p2.setText(rs.getString("nombreReferente") + " " + rs.getString("apellidoReferente"));
                            frmV_Tr.lblEmpresaRef3_p2.setText(rs.getString("empresaReferente"));
                            frmV_Tr.lblCargoRef3_p2.setText(rs.getString("cargoReferente"));
                            frmV_Tr.lblCorreoRef3_p2.setText(rs.getString("correoReferente"));
                            frmV_Tr.lblTelefonoRef3_p2.setText(rs.getString("telefonoReferente"));
                            break;
                        }
                    }
                } else if (estilo == 3) {
                    switch (orden) {
                        case 1: {
                            frmV_Tr.lblNombreRef1_p3.setText(rs.getString("nombreReferente") + " " + rs.getString("apellidoReferente"));
                            frmV_Tr.lblEmpresaRef1_p3.setText(rs.getString("empresaReferente"));
                            frmV_Tr.lblCargoRef1_p3.setText(rs.getString("cargoReferente"));
                            frmV_Tr.lblCorreoRef1_p3.setText(rs.getString("correoReferente"));
                            frmV_Tr.lblTelefonoRef1_p3.setText(rs.getString("telefonoReferente"));
                            break;
                        }
                        case 2: {
                            frmV_Tr.lblNombreRef2_p3.setText(rs.getString("nombreReferente") + " " + rs.getString("apellidoReferente"));
                            frmV_Tr.lblEmpresaRef2_p3.setText(rs.getString("empresaReferente"));
                            frmV_Tr.lblCargoRef2_p3.setText(rs.getString("cargoReferente"));
                            frmV_Tr.lblCorreoRef2_p3.setText(rs.getString("correoReferente"));
                            frmV_Tr.lblTelefonoRef2_p3.setText(rs.getString("telefonoReferente"));
                            break;
                        }
                        case 3: {
                            frmV_Tr.lblNombreRef3_p3.setText(rs.getString("nombreReferente") + " " + rs.getString("apellidoReferente"));
                            frmV_Tr.lblEmpresaRef3_p3.setText(rs.getString("empresaReferente"));
                            frmV_Tr.lblCargoRef3_p3.setText(rs.getString("cargoReferente"));
                            frmV_Tr.lblCorreoRef3_p3.setText(rs.getString("correoReferente"));
                            frmV_Tr.lblTelefonoRef3_p3.setText(rs.getString("telefonoReferente"));
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
