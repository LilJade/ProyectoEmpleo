package Consultas;

import Modelo.conexionbd;
import Entidades.Trabajador;
import Formularios.JDialog_P_Trabajador_DatosPersonales;
import Formularios.frmP_Trabajador;
import Formularios.frmP_Trabajador_DatosPersonales;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ConsultasTrabajador {

    private Connection con = new conexionbd().getconexion();
    public static int id = 0;
    public static int estilo = 0;
    frmP_Trabajador frmP_Tr;
    JDialog_P_Trabajador_DatosPersonales dp;

    public int ValidarTrabajador(Trabajador T) {
        int Resultado = 0;

        try {
            CallableStatement st = con.prepareCall("call SP_V_Trabajador(?,?)");

            st.setString("correoT", T.getCorreo());
            st.setString("passT", T.getPass());

            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                Resultado = 1;

                if (Resultado == 1) {
                    this.id = rs.getInt("idTrabajador");
                    return id;
                }
                return id;
            } else {
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecta!", "Mensaje del Sistema", 2);
                return id;
            }
        } catch (SQLException ex) {
            System.out.println("Error en la validacion del Trabajador: " + ex.getMessage());
            return id;
        }
    }

    public void insertar(Trabajador t) {
        try {
            CallableStatement st = con.prepareCall("call SP_I_Trabajador(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

            st.setString("nombresT", t.getNombres());
            st.setString("apellidosT", t.getApellidos());
            st.setString("descripcionT", t.getDescripcion());
            st.setInt("edadT", t.getEdad());
            st.setString("sexoT", t.getSexo());
            st.setString("direccionT", t.getDireccion());
            st.setString("celularT", t.getCelular());
            st.setString("telefonoFijoT", t.getTelefonoFijo());
            st.setString("duiT", t.getDui());
            st.setString("nitT", t.getNit());
            st.setString("correoT", t.getCorreo());
            st.setString("passT", t.getPass());
            st.setBytes("imgPerfilT", t.getImgPerfil());
            st.setInt("estiloT", t.getEstilo());

            st.execute();

            JOptionPane.showMessageDialog(null, "Registrado con Exito");

        } catch (Exception ex) {
            System.out.println("Error de insercion: " + ex.getMessage());
        }
    }

    public void editarDatosTrabajador(String id) {
        ImageIcon img = null;
        InputStream inp = null;
        try {
            CallableStatement st = con.prepareCall("SELECT * FROM Trabajador WHERE idTrabajador = " + id);

            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                int style = rs.getInt("estilo");

                if (style == 1) {
                    dp.txtNombresTrab.setText(rs.getString("nombres"));
                    dp.txtApellidosTrab.setText(rs.getString("apellidos"));
                    dp.txtDescrTrab.setText(rs.getString("descripcion"));
                    dp.txtEdadTrab.setText(String.valueOf(rs.getInt("edad")));
                    dp.txtSexoTrab.setText(rs.getString("sexo"));
                    dp.txtDireccionTrab.setText(rs.getString("direccion"));
                    dp.txtCelTrab.setText(rs.getString("celular"));
                    dp.txtTelefTrab.setText(rs.getString("telefonoFijo"));
                    dp.txtCorreoTrab.setText(rs.getString("correo"));
                    dp.txtContraseñaTrab.setText(rs.getString("pass"));
                    dp.txtEstilo.setText(String.valueOf(rs.getInt("estilo")));
                    try {
                        if (rs.getBinaryStream("imgPerfil") != null) {
                            inp = rs.getBinaryStream("imgPerfil");
                            BufferedImage bi = ImageIO.read(inp);
                            img = new ImageIcon(bi);
                            Icon icn = new ImageIcon(img.getImage().getScaledInstance(dp.lblImgPerfilTrab.getWidth(), dp.lblImgPerfilTrab.getHeight(), Image.SCALE_DEFAULT));

                            dp.lblImgPerfilTrab.setIcon(icn);
                        } else {
                            dp.lblImgPerfilTrab.setIcon(null);
                        }
                    } catch (IOException ex) {
                        dp.lblImgPerfilTrab.setIcon(null);
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error al consultar datos personales: " + e.getMessage());
        }
    }

    public int consultarEstiloTrabajador(int id) {
        try {
            CallableStatement st = con.prepareCall("SELECT * FROM Trabajador WHERE idTrabajador = '" + id + "'");

            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                this.estilo = rs.getInt("estilo");

                return estilo;
            }
        } catch (Exception e) {
            System.out.println("Sin resultados...");
            return estilo;
        }
        return estilo;
    }

    public void datosTrabajador(int id) {
        ImageIcon img = null;
        InputStream inp = null;

        try {
            CallableStatement st = con.prepareCall("SELECT * FROM Trabajador WHERE idTrabajador = " + id);

            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                int estilo = rs.getInt("estilo");
                if (estilo == 1) {
                    //Agregando foto de Perfil, si existe en la base.
                    try {
                        frmP_Tr.lblNombres_p1.setText(rs.getString("nombres") + " " + rs.getString("apellidos"));
                        frmP_Tr.txtA_descripcion_p1.setText(rs.getString("descripcion"));
                        frmP_Tr.lblEdad_ip_p1.setText("Edad: " + String.valueOf(rs.getInt("edad")));
                        frmP_Tr.lblSexo_ip_p1.setText("Genero: " + rs.getString("sexo"));
                        frmP_Tr.txtA_Direccion_ip_p1.setText(rs.getString("direccion"));
                        frmP_Tr.txtCelular_ip_p1.setText(rs.getString("celular"));
                        frmP_Tr.txtTelefono_ip_p1.setText(rs.getString("telefonoFijo"));
                        frmP_Tr.txtCorreo_ip_p1.setText(rs.getString("correo"));
                        if (rs.getBinaryStream("imgPerfil") != null) {
                            inp = rs.getBinaryStream("imgPerfil");
                            BufferedImage bi = ImageIO.read(inp);
                            img = new ImageIcon(bi);
                            Icon icn = new ImageIcon(img.getImage().getScaledInstance(frmP_Tr.lblFotoperfil_p1.getWidth(), frmP_Tr.lblFotoperfil_p1.getHeight(), Image.SCALE_DEFAULT));
                            frmP_Tr.lblFotoperfil_p1.setIcon(icn);
                        } else {
                            frmP_Tr.lblFotoperfil_p1.setIcon(null);
                        }
                    } catch (IOException ex) {
                        frmP_Tr.lblFotoperfil_p1.setIcon(null);
                    }
                } else if (estilo == 2) {
                    frmP_Tr.lblNombres2.setText(rs.getString("nombres") + " " + rs.getString("apellidos"));
                    frmP_Tr.txtA_Descripcion_ip_p2.setText(rs.getString("descripcion"));
                    frmP_Tr.txtEdad_ip_p2.setText(String.valueOf(rs.getInt("edad")));
                    frmP_Tr.txtSexo_ip_p2.setText(rs.getString("sexo"));
                    frmP_Tr.txtA_Direccion_ip_p2.setText(rs.getString("direccion"));
                    frmP_Tr.lblCelular_ip_p2.setText("Celular: " + rs.getString("celular"));
                    frmP_Tr.lblTelefono_ip2.setText("Telefono: " + rs.getString("telefonoFijo"));
                    frmP_Tr.lblCorreo_ip_p2.setText("Correo: " + rs.getString("correo"));
                    //Agregando foto de Perfil, si existe en la base.
                    try {
                        if (rs.getBinaryStream("imgPerfil") != null) {
                            inp = rs.getBinaryStream("imgPerfil");
                            BufferedImage bi = ImageIO.read(inp);
                            img = new ImageIcon(bi);
                            Icon icn = new ImageIcon(img.getImage().getScaledInstance(frmP_Tr.lblFotoperfil_p2.getWidth(), frmP_Tr.lblFotoperfil_p2.getHeight(), Image.SCALE_DEFAULT));

                            frmP_Tr.lblFotoperfil_p2.setIcon(icn);
                        } else {
                            frmP_Tr.lblFotoperfil_p2.setIcon(null);
                        }
                    } catch (IOException ex) {
                        frmP_Tr.lblFotoperfil_p2.setIcon(null);
                    }

                } else if (estilo == 3) {
                    frmP_Tr.lblNombres1.setText(rs.getString("nombres") + " " + rs.getString("apellidos"));
                    frmP_Tr.txtA_Descripcion_ip_p3.setText(rs.getString("descripcion"));
                    frmP_Tr.lblEdad_ip_p3.setText("Edad: " + String.valueOf(rs.getInt("edad")));
                    frmP_Tr.lblSexo_ip_p3.setText("Genero: " + rs.getString("sexo"));
                    frmP_Tr.lblDireccion_ip_p3.setText("Direccion: " + rs.getString("direccion"));
                    frmP_Tr.lblCelular_ip_p3.setText("Celular: " + rs.getString("celular"));
                    frmP_Tr.lblTelefono_ip3.setText("Telefono: " + rs.getString("telefonoFijo"));
                    frmP_Tr.lblCorreo_ip_p3.setText("Correo: " + rs.getString("correo"));
                    
                    //Agregando foto de Perfil, si existe en la base.
                    try {
                        if (rs.getBinaryStream("imgPerfil") != null) {
                            inp = rs.getBinaryStream("imgPerfil");
                            BufferedImage bi = ImageIO.read(inp);
                            img = new ImageIcon(bi);
                            Icon icn = new ImageIcon(img.getImage().getScaledInstance(frmP_Tr.lblFotoperfil_p3.getWidth(), frmP_Tr.lblFotoperfil_p3.getHeight(), Image.SCALE_DEFAULT));

                            frmP_Tr.lblFotoperfil_p3.setIcon(icn);
                        } else {
                            frmP_Tr.lblFotoperfil_p3.setIcon(null);
                        }
                    } catch (IOException ex) {
                        frmP_Tr.lblFotoperfil_p3.setIcon(null);
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error a consultar datos del trabajador: " + e.getMessage());
        }
    }

    public void actualizarDatosTrabajador(Trabajador t) {
        try {
            CallableStatement st = con.prepareCall("CALL SP_U_Trabajador(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            st.setInt("idTrabajador", t.getIdTrabajador());
            st.setString("nombresT", t.getNombres());
            st.setString("apellidosT", t.getApellidos());
            st.setString("descripcionT", t.getDescripcion());
            st.setInt("edadT", t.getEdad());
            st.setString("sexoT", t.getSexo());
            st.setString("direccionT", t.getDireccion());
            st.setString("celularT", t.getCelular());
            st.setString("telefonoFijoT", t.getTelefonoFijo());
            st.setString("duiT", t.getDui());
            st.setString("nitT", t.getNit());
            st.setString("correoT", t.getCorreo());
            st.setString("passT", t.getPass());
            st.setBytes("imgPerfilT", t.getImgPerfil());
            st.setInt("estiloT", t.getEstilo());

            st.execute();

            JOptionPane.showMessageDialog(null, "Actualizado con Exito");
        } catch (Exception e) {
            System.out.println("Error al actualizar datos: " + e.getMessage());
        }
    }
}
