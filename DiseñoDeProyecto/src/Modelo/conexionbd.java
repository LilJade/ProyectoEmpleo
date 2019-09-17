package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class conexionbd {

    public static Connection con = null;

    public Connection getconexion() {
        try {
            String url = "jdbc:mysql://localhost:3306/nombre_basededatos";
            String user = "";
            String contraseña = "";

            con = DriverManager.getConnection(url, user, contraseña);
            System.out.println("conectado");
        } catch (Exception e) {
            System.out.println("" + e); 
        }

        return con;
    }
}
