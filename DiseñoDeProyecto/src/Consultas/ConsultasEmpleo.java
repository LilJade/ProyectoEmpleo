package Consultas;

import static Consultas.ConsultasEmpresa.idE;
import Entidades.Empleo;
import Formularios.FrmP_Empresa1;
import Modelo.conexionbd;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Eli_Ingeniero
 */
public class ConsultasEmpleo {

    private Connection con = new conexionbd().getconexion();

    public ArrayList<Empleo> Mostraempleos() {
        FrmP_Empresa1 s = new FrmP_Empresa1();

        ArrayList<Empleo> empleo = new ArrayList<>();
        try {
            CallableStatement cb = con.prepareCall("call SP_M_Empleos(?)");
            cb.setInt("idEmpresas", idE);
            ResultSet rs = cb.executeQuery();
            while (rs.next()) {
                Empleo p = new Empleo();

                int idem = rs.getInt("idEmpleo");

                p.setIdEmpleo(idem);

                p.setNombre(rs.getString("nombre"));

                p.setDescripcion(rs.getString("descripcion"));
                p.setRequisitos(rs.getString("requisitos"));
                p.setSalario(rs.getDouble("salario"));
                empleo.add(p);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en la consulta :" + e);
        }
        return empleo;

    }

    public void Actualizarempleo(Empleo r) {
        try {
            CallableStatement st = con.prepareCall("call SP_U_Empleo(?,?,?,?,?)");
            st.setInt("idEmpleoE", r.getIdEmpleo());
            st.setString("nombreE", r.getNombre());
            st.setString("descripcionE", r.getDescripcion());
            st.setString("requisitosE", r.getRequisitos());
            st.setDouble("salarioE", r.getSalario());
            st.execute();
            JOptionPane.showMessageDialog(null, "empleo actualizado");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error empleo actualizado" + e.getMessage());
        }
    }

    public void ActivarEmpleo(String id) {
        try {
            CallableStatement st = con.prepareCall("UPDATE empleo SET estado = 1 WHERE idEmpleo = " + id);
            st.execute();
            JOptionPane.showMessageDialog(null, "¡Oferta de empleo activada!");
        } catch (Exception e) {
            System.out.println("Error al activar empleo: " + e.getMessage());
        }
    }

    public void DesactivarEmpleo(String id) {
        try {
            CallableStatement st = con.prepareCall("UPDATE empleo SET estado = 0 WHERE idEmpleo = " + id);
            st.execute();
            JOptionPane.showMessageDialog(null, "¡Oferta de empleo desactivada!");
        } catch (Exception e) {
            System.out.println("Error al desactivar empleo: " + e.getMessage());
        }
    }

    public void insertarEmpleo(Empleo o) {

        try {
            CallableStatement st = con.prepareCall("Call SP_I_Empleo(?,?,?,?,?)");

            st.setString("nombreE", o.getNombre());
            st.setString("descripcionE", o.getDescripcion());
            st.setString("requisitosE", o.getRequisitos());
            st.setDouble("salarioE", o.getSalario());
            st.setInt("idEmpresaE", o.getIdEmpresa());

            st.execute();

            JOptionPane.showMessageDialog(null, " Empleo Agregado:");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al Insertar Empleo:" + e);

        }
    }

    public ArrayList<Empleo> Mostraempleosvisitante() {
      //  FrmP_Empresa1 s = new FrmP_Empresa1();

        ArrayList<Empleo> empleo = new ArrayList<>();
        try {
            CallableStatement cb = con.prepareCall("select *from empleo where idEmpresa='" + 1 + "'");
            cb.setInt("idEmpresas", 1);
            ResultSet rs = cb.executeQuery();
            while (rs.next()) {
                Empleo p = new Empleo();

                int idem = rs.getInt("idEmpleo");

                p.setIdEmpleo(idem);

                p.setNombre(rs.getString("nombre"));

                p.setDescripcion(rs.getString("descripcion"));
                p.setRequisitos(rs.getString("requisitos"));
                p.setSalario(rs.getDouble("salario"));
                empleo.add(p);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en la consulta :" + e);
        }
        return empleo;

    }

}
