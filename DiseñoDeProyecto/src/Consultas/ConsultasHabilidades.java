package Consultas;

import java.sql.Connection;
import Modelo.conexionbd;
import Entidades.Habilidad;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

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
    
}
