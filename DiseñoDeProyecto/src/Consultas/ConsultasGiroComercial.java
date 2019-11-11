package Consultas;
import Modelo.conexionbd;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JComboBox;

public class ConsultasGiroComercial {
    
    private Connection con = new conexionbd().getconexion();
    
    public void mostrarGCs(JComboBox jcmb){
        try {
            CallableStatement st = con.prepareCall("select * from GiroComercial");
            
            ResultSet rs = st.executeQuery();
            
            while(rs.next()){
                jcmb.addItem(rs.getString("categoriaNombre"));
            }
            
        } catch (Exception e) {
        }
    }
    
}
