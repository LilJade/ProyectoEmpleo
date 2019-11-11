package Consultas;
import Formularios.frmP_Trabajador;
import Modelo.conexionbd;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;

public class ConsultasExperiencia {
    private Connection con = new conexionbd().getconexion();
    frmP_Trabajador frmP_Tr;
    
    public void mostrarExperiencias(int id){
        try {
            CallableStatement st = con.prepareCall("call SP_M_Experiencia(?)");
            
            st.setInt("idTrabajadorExp", id);
            
            ResultSet rs = st.executeQuery();
            
            while(rs.next()){
                int orden = rs.getInt("idExperiencia");
                
                switch(orden){
                    case 1:{
                        frmP_Tr.lblCargo1.setText(rs.getString("cargoOcupado"));
                        frmP_Tr.lblInstitucionExp1.setText(rs.getString("nombreEmpresa"));
                        frmP_Tr.añoExp1.setText(String.valueOf(rs.getDate("fechaInicio")) + " - " + String.valueOf(rs.getDate("fehaFinal")));
                        frmP_Tr.descripcionExp1.setText(rs.getString("descripcion"));
                        break;
                    }
                    case 2:{
                        frmP_Tr.lblCargo2.setText(rs.getString("cargoOcupado"));
                        frmP_Tr.lblInstitucionExp2.setText(rs.getString("nombreEmpresa"));
                        frmP_Tr.añoExp2.setText(String.valueOf(rs.getDate("fechaInicio")) + " - " + String.valueOf(rs.getDate("fehaFinal")));
                        frmP_Tr.descripcionExp2.setText(rs.getString("descripcion"));
                        break;
                    }
                    case 3:{
                        frmP_Tr.lblCargo3.setText(rs.getString("cargoOcupado"));
                        frmP_Tr.lblInstitucionExp3.setText(rs.getString("nombreEmpresa"));
                        frmP_Tr.añoExp3.setText(String.valueOf(rs.getDate("fechaInicio")) + " - " + String.valueOf(rs.getDate("fehaFinal")));
                        frmP_Tr.descripcionExp3.setText(rs.getString("descripcion"));
                        break;
                    }
                    case 4:{
                        frmP_Tr.lblCargo4.setText(rs.getString("cargoOcupado"));
                        frmP_Tr.lblInstitucionExp4.setText(rs.getString("nombreEmpresa"));
                        frmP_Tr.añoExp4.setText(String.valueOf(rs.getDate("fechaInicio")) + " - " + String.valueOf(rs.getDate("fehaFinal")));
                        frmP_Tr.descripcionExp4.setText(rs.getString("descripcion"));
                        break;
                    }
                    case 5:{
                        frmP_Tr.lblCargo5.setText(rs.getString("cargoOcupado"));
                        frmP_Tr.lblInstitucionExp5.setText(rs.getString("nombreEmpresa"));
                        frmP_Tr.añoExp5.setText(String.valueOf(rs.getDate("fechaInicio")) + " - " + String.valueOf(rs.getDate("fehaFinal")));
                        frmP_Tr.descripcionExp5.setText(rs.getString("descripcion"));
                        break;
                    }
                }
            }
        } catch (Exception e) {
        }
    }
    
}
