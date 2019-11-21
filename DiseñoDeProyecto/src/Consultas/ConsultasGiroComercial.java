package Consultas;
import Entidades.GiroComercial;
import Modelo.conexionbd;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class ConsultasGiroComercial {
    
    private Connection con = new conexionbd().getconexion();
    
      public ArrayList<GiroComercial> mostrargiros() {

        ArrayList<GiroComercial> liscombo = new ArrayList<>();
        try {
            CallableStatement cb = con.prepareCall("select *from girocomercial");
            ResultSet rs = cb.executeQuery();
            while (rs.next()) {
                GiroComercial g = new GiroComercial();
                g.setIdGiroComercial(rs.getInt("idGiroComercial"));
                g.setCategoriaNombre(rs.getString("categoriaNombre"));

                liscombo.add(g);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en la consulta :" + e);
        }
        return liscombo;

    }

}
