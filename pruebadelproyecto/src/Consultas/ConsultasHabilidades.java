package Consultas;

import java.sql.Connection;
import Modelo.conexionbd;
import Entidades.Habilidad;
import Entidades.Referencia;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ConsultasHabilidades {

    private Connection con = new conexionbd().getconexion();

    public ArrayList<Habilidad> mostrarHabilidades(int id) {

        ArrayList<Habilidad> habil = new ArrayList<>();

        try {
            CallableStatement st = con.prepareCall("SELECT * FROM Habilidad WHERE idTrabajador = '" + id + "'");
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                Habilidad h = new Habilidad();

                h.setIdHabilidad(rs.getInt("idHabilidad"));
                h.setHabilidad(rs.getString("Habilidad"));
                h.setIdTrabajador(rs.getInt("idTrabajador"));

                habil.add(h);
            }

        } catch (Exception e) {
            System.out.println("Error en la lista de habilidades: " + e.getMessage());
        }
        return habil;
    }

    public void insertarHabilidades(Habilidad h) {
        try {
            CallableStatement st = con.prepareCall("CALL SP_I_Habilidad(?,?)");
            st.setString("Habil", h.getHabilidad());
            st.setInt("idTrab", h.getIdTrabajador());

            st.executeQuery();
            JOptionPane.showMessageDialog(null, "Registrado con Exito");
        } catch (Exception e) {
            System.out.println("Error al ingresar habilidad: " + e.getMessage());
        }
    }

    public void actualizarHabilidades(Habilidad h) {
        try {
            CallableStatement st = con.prepareCall("CALL SP_U_Habilidad(?,?,?)");
            st.setInt("idHabil", h.getIdHabilidad());
            st.setString("Habil", h.getHabilidad());
            st.setInt("idTrab", h.getIdTrabajador());

            st.executeQuery();
            JOptionPane.showMessageDialog(null, "Actualizado con Exito");
        } catch (Exception e) {
            System.out.println("Error al ingresar habilidad: " + e.getMessage());
        }
    }

    public void eliminarHabilidades(Habilidad h) {
        try {
            CallableStatement st = con.prepareCall("CALL SP_D_Habilidad(?)");
            st.setInt("idHabil", h.getIdHabilidad());

            st.executeQuery();
            JOptionPane.showMessageDialog(null, "Eliminado con Exito");
        } catch (Exception e) {
            System.out.println("Error al ingresar habilidad: " + e.getMessage());
        }
    }

    public ArrayList<Habilidad> mostrarHabilidadesCrud(int id) {
        ArrayList<Habilidad> CrudHabilidades = new ArrayList<>();

        try {
            CallableStatement st = con.prepareCall("CALL SP_CM_Habilidad(?)");
            st.setInt("idTrab", id);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                Habilidad h = new Habilidad();
                h.setIdHabilidad(rs.getInt("idHabilidad"));
                h.setHabilidad(rs.getString("Habilidad"));
                h.setIdTrabajador(rs.getInt("idTrabajador"));
                CrudHabilidades.add(h);
            }
        } catch (Exception e) {
            System.out.println("Error al obtener la lista de registros... " + e.getMessage());
        }

        return CrudHabilidades;
    }
}
