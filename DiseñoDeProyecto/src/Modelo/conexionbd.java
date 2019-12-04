package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;

public class conexionbd {

    public static Connection con = null;

    public Connection getconexion() {
        try {
            String url = "jdbc:mysql://localhost:3306/proyectoempleo";
            String user = "root";
            String contraseña = "liljade09";

            con = DriverManager.getConnection(url, user, contraseña);
        } catch (Exception e) {
            System.out.println("Error en clase Conexion: " + e.getMessage()); 
        }

        return con;
    }
}