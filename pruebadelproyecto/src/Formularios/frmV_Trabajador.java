package Formularios;

import Consultas.ConsultasEstudio;
import Consultas.ConsultasExperiencia;
import Consultas.ConsultasHabilidades;
import Consultas.ConsultasReferencia;
import Consultas.ConsultasTrabajador;
import Entidades.Habilidad;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JLabel;


public class frmV_Trabajador extends javax.swing.JFrame {

    frmVisitante frmV;
    int indice = 0;
    private List<JLabel> lblHabilidades = new ArrayList<>();

    public frmV_Trabajador() {
        initComponents();
//        this.lblId.setText(String.valueOf(frmVisitante.id));
        this.jp_Perfil1.setVisible(true);
        this.jp_Perfil2.setVisible(false);
        this.jp_Perfil3.setVisible(false);
//        Estilo();
//        Datos(frmVisitante.id);
//        Estudio(frmVisitante.id);
//        Experiencia(frmVisitante.id);
//        Referencia(frmVisitante.id);
//        Habilidades(frmVisitante.id);

        this.setBounds(0, 0, 1350, 900);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jp_Perfil = new javax.swing.JPanel();
        scroll_Perfiles = new javax.swing.JScrollPane();
        jp_AllPerfiles = new javax.swing.JPanel();
        jp_Perfil1 = new javax.swing.JPanel();
        jp_Contenedor_p1 = new javax.swing.JPanel();
        jp_Cabecera_p1 = new javax.swing.JPanel();
        lblProfesion_p1 = new javax.swing.JLabel();
        lblNombres_p1 = new javax.swing.JLabel();
        jp_BarraIzquierda_p1 = new javax.swing.JPanel();
        lblFotoperfil_p1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jpHabilidades_p1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        lblTelefono_ip = new javax.swing.JLabel();
        lblTelefono_ip1 = new javax.swing.JLabel();
        lblTelefono_ip2 = new javax.swing.JLabel();
        txtTelefono_ip_p1 = new javax.swing.JTextField();
        txtCelular_ip_p1 = new javax.swing.JTextField();
        txtCorreo_ip_p1 = new javax.swing.JTextField();
        lblTelefono_ip3 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtA_Direccion_ip_p1 = new javax.swing.JTextArea();
        lblId = new javax.swing.JLabel();
        jp_DatosPersonales_p1 = new javax.swing.JPanel();
        lblEdad_ip_p1 = new javax.swing.JLabel();
        lblSexo_ip_p1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtA_descripcion_p1 = new javax.swing.JTextArea();
        lblDescripcion_p1 = new javax.swing.JLabel();
        jp_Estudios_p1 = new javax.swing.JPanel();
        jp_Est1_p1 = new javax.swing.JPanel();
        lblInstitucion1_p1 = new javax.swing.JLabel();
        lblAño1_p1 = new javax.swing.JLabel();
        lblCiudad1_p1 = new javax.swing.JLabel();
        lblTitulo1_p1 = new javax.swing.JLabel();
        jp_Est2_p1 = new javax.swing.JPanel();
        lblInstitucion2_p1 = new javax.swing.JLabel();
        lblAño2_p1 = new javax.swing.JLabel();
        lblCiudad2_p1 = new javax.swing.JLabel();
        lblTitulo2_p1 = new javax.swing.JLabel();
        jp_Est3_p1 = new javax.swing.JPanel();
        lblInstitucion3_p1 = new javax.swing.JLabel();
        lblAño3_p1 = new javax.swing.JLabel();
        lblCiudad3_p1 = new javax.swing.JLabel();
        lblTitulo3_p1 = new javax.swing.JLabel();
        jp_Est4_p1 = new javax.swing.JPanel();
        lblInstitucion5_p1 = new javax.swing.JLabel();
        lblAño5_p1 = new javax.swing.JLabel();
        lblCiudad5_p1 = new javax.swing.JLabel();
        lblTitulo5_p1 = new javax.swing.JLabel();
        jp_Est5_p1 = new javax.swing.JPanel();
        lblInstitucion4_p1 = new javax.swing.JLabel();
        lblAño4_p1 = new javax.swing.JLabel();
        lblCiudad4_p1 = new javax.swing.JLabel();
        lblTitulo4_p1 = new javax.swing.JLabel();
        jp_Est6_p1 = new javax.swing.JPanel();
        lblInstitucion6_p1 = new javax.swing.JLabel();
        lblAño6_p1 = new javax.swing.JLabel();
        lblCiudad6_p1 = new javax.swing.JLabel();
        lblTitulo6_p1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jp_Experiencias_p1 = new javax.swing.JPanel();
        jp_Exp1_p1 = new javax.swing.JPanel();
        lblCargo1_p1 = new javax.swing.JLabel();
        lblInstitucionExp1_p1 = new javax.swing.JLabel();
        descripcionExp1_p1 = new javax.swing.JLabel();
        añoExp1_p1 = new javax.swing.JLabel();
        jp_Exp2_p1 = new javax.swing.JPanel();
        lblCargo2_p1 = new javax.swing.JLabel();
        lblInstitucionExp2_p1 = new javax.swing.JLabel();
        descripcionExp2_p1 = new javax.swing.JLabel();
        añoExp2_p1 = new javax.swing.JLabel();
        jp_Exp3_p1 = new javax.swing.JPanel();
        lblCargo3_p1 = new javax.swing.JLabel();
        lblInstitucionExp3_p1 = new javax.swing.JLabel();
        descripcionExp3_p1 = new javax.swing.JLabel();
        añoExp3_p1 = new javax.swing.JLabel();
        jp_Exp4_p1 = new javax.swing.JPanel();
        lblCargo4_p1 = new javax.swing.JLabel();
        lblInstitucionExp4_p1 = new javax.swing.JLabel();
        descripcionExp4_p1 = new javax.swing.JLabel();
        añoExp4_p1 = new javax.swing.JLabel();
        jp_Exp5_p1 = new javax.swing.JPanel();
        lblCargo5_p1 = new javax.swing.JLabel();
        lblInstitucionExp5_p1 = new javax.swing.JLabel();
        descripcionExp5_p1 = new javax.swing.JLabel();
        añoExp5_p1 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jp_Referencias_p1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        lblNombreRef1_p1 = new javax.swing.JLabel();
        lblCargoRef1_p1 = new javax.swing.JLabel();
        lblEmpresaRef1_p1 = new javax.swing.JLabel();
        lblTelefonoRef1_p1 = new javax.swing.JLabel();
        lblCorreoRef1_p1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        lblNombreRef2_p1 = new javax.swing.JLabel();
        lblCargoRef2_p1 = new javax.swing.JLabel();
        lblEmpresaRef2_p1 = new javax.swing.JLabel();
        lblTelefonoRef2_p1 = new javax.swing.JLabel();
        lblCorreoRef2_p1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        lblNombreRef3_p1 = new javax.swing.JLabel();
        lblCargoRef3_p1 = new javax.swing.JLabel();
        lblEmpresaRef3_p1 = new javax.swing.JLabel();
        lblTelefonoRef3_p1 = new javax.swing.JLabel();
        lblCorreoRef3_p1 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jp_Perfil2 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jp_Cabecera = new javax.swing.JPanel();
        lblProfesion2 = new javax.swing.JLabel();
        lblNombres2 = new javax.swing.JLabel();
        lblFotoperfil_p2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblTelefono_ip_p2 = new javax.swing.JLabel();
        lblCelular_ip_p2 = new javax.swing.JLabel();
        lblCorreo_ip_p2 = new javax.swing.JLabel();
        jp_Ixquierda = new javax.swing.JPanel();
        jpHabilidades_p2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lblCiudad1_p6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblCiudad1_p7 = new javax.swing.JLabel();
        lblCiudad1_p8 = new javax.swing.JLabel();
        lblCiudad1_p9 = new javax.swing.JLabel();
        txtSexo_ip_p2 = new javax.swing.JTextField();
        txtEdad_ip_p2 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtA_Direccion_ip_p2 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtA_Descripcion_ip_p2 = new javax.swing.JTextArea();
        jSeparator4 = new javax.swing.JSeparator();
        jp_Estudios_p2 = new javax.swing.JPanel();
        jp_Est8 = new javax.swing.JPanel();
        lblInstitucion1_p2 = new javax.swing.JLabel();
        lblAño1_p2 = new javax.swing.JLabel();
        lblCiudad1_p2 = new javax.swing.JLabel();
        lblTitulo1_p2 = new javax.swing.JLabel();
        jp_Est9 = new javax.swing.JPanel();
        lblInstitucion2_p2 = new javax.swing.JLabel();
        lblAño2_p2 = new javax.swing.JLabel();
        lblCiudad2_p2 = new javax.swing.JLabel();
        lblTitulo2_p2 = new javax.swing.JLabel();
        jp_Est10 = new javax.swing.JPanel();
        lblInstitucion3_p2 = new javax.swing.JLabel();
        lblAño3_p2 = new javax.swing.JLabel();
        lblCiudad3_p2 = new javax.swing.JLabel();
        lblTitulo3_p2 = new javax.swing.JLabel();
        jp_Est11 = new javax.swing.JPanel();
        lblInstitucion5_p2 = new javax.swing.JLabel();
        lblAño5_p2 = new javax.swing.JLabel();
        lblCiudad5_p2 = new javax.swing.JLabel();
        lblTitulo5_p2 = new javax.swing.JLabel();
        jp_Est12 = new javax.swing.JPanel();
        lblInstitucion4_p2 = new javax.swing.JLabel();
        lblAño4_p2 = new javax.swing.JLabel();
        lblCiudad4_p2 = new javax.swing.JLabel();
        lblTitulo4_p2 = new javax.swing.JLabel();
        jp_Est13 = new javax.swing.JPanel();
        lblInstitucion6_p2 = new javax.swing.JLabel();
        lblAño6_p2 = new javax.swing.JLabel();
        lblCiudad6_p2 = new javax.swing.JLabel();
        lblTitulo6_p2 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jp_Experiencias_p2 = new javax.swing.JPanel();
        jp_Exp6 = new javax.swing.JPanel();
        lblCargo1_p2 = new javax.swing.JLabel();
        lblInstitucionExp1_p2 = new javax.swing.JLabel();
        descripcionExp1_p2 = new javax.swing.JLabel();
        añoExp1_p2 = new javax.swing.JLabel();
        jp_Exp7 = new javax.swing.JPanel();
        lblCargo2_p2 = new javax.swing.JLabel();
        lblInstitucionExp2_p2 = new javax.swing.JLabel();
        descripcionExp2_p2 = new javax.swing.JLabel();
        añoExp2_p2 = new javax.swing.JLabel();
        jp_Exp8 = new javax.swing.JPanel();
        lblCargo3_p2 = new javax.swing.JLabel();
        lblInstitucionExp3_p2 = new javax.swing.JLabel();
        descripcionExp3_p2 = new javax.swing.JLabel();
        añoExp3_p2 = new javax.swing.JLabel();
        jp_Exp9 = new javax.swing.JPanel();
        lblCargo4_p2 = new javax.swing.JLabel();
        lblInstitucionExp4_p2 = new javax.swing.JLabel();
        descripcionExp4_p2 = new javax.swing.JLabel();
        añoExp4_p2 = new javax.swing.JLabel();
        jp_Exp10 = new javax.swing.JPanel();
        lblCargo5_p2 = new javax.swing.JLabel();
        lblInstitucionExp5_p2 = new javax.swing.JLabel();
        descripcionExp5_p2 = new javax.swing.JLabel();
        añoExp5_p2 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jp_Referencias_p2 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        lblNombreRef1_p2 = new javax.swing.JLabel();
        lblCargoRef1_p2 = new javax.swing.JLabel();
        lblEmpresaRef1_p2 = new javax.swing.JLabel();
        lblTelefonoRef1_p2 = new javax.swing.JLabel();
        lblCorreoRef1_p2 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        lblNombreRef2_p2 = new javax.swing.JLabel();
        lblCargoRef2_p2 = new javax.swing.JLabel();
        lblEmpresaRef2_p2 = new javax.swing.JLabel();
        lblTelefonoRef2_p2 = new javax.swing.JLabel();
        lblCorreoRef2_p2 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        lblNombreRef3_p2 = new javax.swing.JLabel();
        lblCargoRef3_p2 = new javax.swing.JLabel();
        lblEmpresaRef3_p2 = new javax.swing.JLabel();
        lblTelefonoRef6 = new javax.swing.JLabel();
        lblCorreoRef3_p2 = new javax.swing.JLabel();
        jp_Perfil3 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jp_Estudios_p3 = new javax.swing.JPanel();
        jp_Est7 = new javax.swing.JPanel();
        lblInstitucion7 = new javax.swing.JLabel();
        lblAño7 = new javax.swing.JLabel();
        lblCiudad7 = new javax.swing.JLabel();
        lblTitulo7 = new javax.swing.JLabel();
        jp_Est20 = new javax.swing.JPanel();
        lblInstitucion8 = new javax.swing.JLabel();
        lblAño8 = new javax.swing.JLabel();
        lblCiudad8 = new javax.swing.JLabel();
        lblTitulo8 = new javax.swing.JLabel();
        jp_Est21 = new javax.swing.JPanel();
        lblInstitucion9 = new javax.swing.JLabel();
        lblAño9 = new javax.swing.JLabel();
        lblCiudad9 = new javax.swing.JLabel();
        lblTitulo9 = new javax.swing.JLabel();
        jp_Est22 = new javax.swing.JPanel();
        lblInstitucion10 = new javax.swing.JLabel();
        lblAño10 = new javax.swing.JLabel();
        lblCiudad10 = new javax.swing.JLabel();
        lblTitulo10 = new javax.swing.JLabel();
        jp_Est23 = new javax.swing.JPanel();
        lblInstitucion11 = new javax.swing.JLabel();
        lblAño11 = new javax.swing.JLabel();
        lblCiudad11 = new javax.swing.JLabel();
        lblTitulo11 = new javax.swing.JLabel();
        jp_Est24 = new javax.swing.JPanel();
        lblInstitucion12 = new javax.swing.JLabel();
        lblAño12 = new javax.swing.JLabel();
        lblCiudad12 = new javax.swing.JLabel();
        lblTitulo12 = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jp_Experiencias_p3 = new javax.swing.JPanel();
        jp_Exp17 = new javax.swing.JPanel();
        lblCargo1_p3 = new javax.swing.JLabel();
        lblInstitucionExp1_p3 = new javax.swing.JLabel();
        descripcionExp1_p3 = new javax.swing.JLabel();
        añoExp1_p3 = new javax.swing.JLabel();
        jp_Exp18 = new javax.swing.JPanel();
        lblCargo2_p3 = new javax.swing.JLabel();
        lblInstitucionExp2_p3 = new javax.swing.JLabel();
        descripcionExp2_p3 = new javax.swing.JLabel();
        añoExp2_p3 = new javax.swing.JLabel();
        jp_Exp19 = new javax.swing.JPanel();
        lblCargo3_p3 = new javax.swing.JLabel();
        lblInstitucionExp3_p3 = new javax.swing.JLabel();
        descripcionExp3_p3 = new javax.swing.JLabel();
        añoExp3_p3 = new javax.swing.JLabel();
        jp_Exp20 = new javax.swing.JPanel();
        lblCargo4_p3 = new javax.swing.JLabel();
        lblInstitucionExp4_p3 = new javax.swing.JLabel();
        descripcionExp4_p3 = new javax.swing.JLabel();
        añoExp4_p3 = new javax.swing.JLabel();
        jp_Exp21 = new javax.swing.JPanel();
        lblCargo5_p3 = new javax.swing.JLabel();
        lblInstitucionExp5_p3 = new javax.swing.JLabel();
        descripcionExp5_p3 = new javax.swing.JLabel();
        añoExp5_p3 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jSeparator13 = new javax.swing.JSeparator();
        jp_Referencias_p3 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        lblNombreRef1_p3 = new javax.swing.JLabel();
        lblCargoRef1_p3 = new javax.swing.JLabel();
        lblEmpresaRef1_p3 = new javax.swing.JLabel();
        lblTelefonoRef1_p3 = new javax.swing.JLabel();
        lblCorreoRef1_p3 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        lblNombreRef2_p3 = new javax.swing.JLabel();
        lblCargoRef2_p3 = new javax.swing.JLabel();
        lblEmpresaRef2_p3 = new javax.swing.JLabel();
        lblTelefonoRef2_p3 = new javax.swing.JLabel();
        lblCorreoRef2_p3 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        lblNombreRef3_p3 = new javax.swing.JLabel();
        lblCargoRef3_p3 = new javax.swing.JLabel();
        lblEmpresaRef3_p3 = new javax.swing.JLabel();
        lblTelefonoRef3_p3 = new javax.swing.JLabel();
        lblCorreoRef3_p3 = new javax.swing.JLabel();
        lblFotoperfil_p3 = new javax.swing.JLabel();
        lblNombres1 = new javax.swing.JLabel();
        lblProfesion1 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jSeparator14 = new javax.swing.JSeparator();
        jPanel9 = new javax.swing.JPanel();
        lblTelefono_ip_p3 = new javax.swing.JLabel();
        lblCelular_ip_p3 = new javax.swing.JLabel();
        lblCorreo_ip_p3 = new javax.swing.JLabel();
        lblDireccion_ip_p3 = new javax.swing.JLabel();
        lblEdad_ip_p3 = new javax.swing.JLabel();
        lblSexo_ip_p3 = new javax.swing.JLabel();
        lblTelefono_ip10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtA_Descripcion_ip_p3 = new javax.swing.JTextArea();
        jLabel39 = new javax.swing.JLabel();
        jSeparator15 = new javax.swing.JSeparator();
        jp_Habilidades_p3 = new javax.swing.JPanel();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jp_Perfil.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        scroll_Perfiles.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jp_Contenedor_p1.setBackground(new java.awt.Color(255, 255, 255));
        jp_Contenedor_p1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jp_Cabecera_p1.setBackground(new java.awt.Color(204, 204, 204));

        lblProfesion_p1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblProfesion_p1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        lblNombres_p1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblNombres_p1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jp_Cabecera_p1Layout = new javax.swing.GroupLayout(jp_Cabecera_p1);
        jp_Cabecera_p1.setLayout(jp_Cabecera_p1Layout);
        jp_Cabecera_p1Layout.setHorizontalGroup(
            jp_Cabecera_p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Cabecera_p1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_Cabecera_p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombres_p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jp_Cabecera_p1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblProfesion_p1, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jp_Cabecera_p1Layout.setVerticalGroup(
            jp_Cabecera_p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_Cabecera_p1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNombres_p1, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblProfesion_p1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jp_BarraIzquierda_p1.setBackground(new java.awt.Color(153, 204, 255));

        lblFotoperfil_p1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFotoperfil_p1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/user_64_.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Habilidades.");

        jpHabilidades_p1.setBackground(new java.awt.Color(153, 204, 255));
        jpHabilidades_p1.setLayout(new java.awt.GridLayout(0, 1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Contacto.");

        lblTelefono_ip.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lblTelefono_ip.setForeground(new java.awt.Color(255, 255, 255));
        lblTelefono_ip.setText("Teléfono: ");

        lblTelefono_ip1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lblTelefono_ip1.setForeground(new java.awt.Color(255, 255, 255));
        lblTelefono_ip1.setText("Celular: ");

        lblTelefono_ip2.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lblTelefono_ip2.setForeground(new java.awt.Color(255, 255, 255));
        lblTelefono_ip2.setText("Correo Electrónico: ");

        txtTelefono_ip_p1.setBackground(new java.awt.Color(153, 204, 255));
        txtTelefono_ip_p1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtTelefono_ip_p1.setForeground(new java.awt.Color(255, 255, 255));

        txtCelular_ip_p1.setBackground(new java.awt.Color(153, 204, 255));
        txtCelular_ip_p1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtCelular_ip_p1.setForeground(new java.awt.Color(255, 255, 255));

        txtCorreo_ip_p1.setBackground(new java.awt.Color(153, 204, 255));
        txtCorreo_ip_p1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtCorreo_ip_p1.setForeground(new java.awt.Color(255, 255, 255));

        lblTelefono_ip3.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lblTelefono_ip3.setForeground(new java.awt.Color(255, 255, 255));
        lblTelefono_ip3.setText("Dirección: ");

        txtA_Direccion_ip_p1.setBackground(new java.awt.Color(153, 204, 255));
        txtA_Direccion_ip_p1.setColumns(20);
        txtA_Direccion_ip_p1.setForeground(new java.awt.Color(255, 255, 255));
        txtA_Direccion_ip_p1.setRows(5);
        jScrollPane5.setViewportView(txtA_Direccion_ip_p1);

        javax.swing.GroupLayout jp_BarraIzquierda_p1Layout = new javax.swing.GroupLayout(jp_BarraIzquierda_p1);
        jp_BarraIzquierda_p1.setLayout(jp_BarraIzquierda_p1Layout);
        jp_BarraIzquierda_p1Layout.setHorizontalGroup(
            jp_BarraIzquierda_p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_BarraIzquierda_p1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(lblFotoperfil_p1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jp_BarraIzquierda_p1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_BarraIzquierda_p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCorreo_ip_p1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTelefono_ip1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTelefono_ip2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTelefono_ip_p1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTelefono_ip, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCelular_ip_p1)
                    .addComponent(lblTelefono_ip3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_BarraIzquierda_p1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(73, 73, 73))
            .addGroup(jp_BarraIzquierda_p1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_BarraIzquierda_p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_BarraIzquierda_p1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel3)
                        .addGap(30, 30, 30))
                    .addComponent(jpHabilidades_p1, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jp_BarraIzquierda_p1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5)
                .addContainerGap())
        );
        jp_BarraIzquierda_p1Layout.setVerticalGroup(
            jp_BarraIzquierda_p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_BarraIzquierda_p1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(lblFotoperfil_p1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(lblTelefono_ip, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTelefono_ip_p1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(lblTelefono_ip1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCelular_ip_p1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(lblTelefono_ip2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCorreo_ip_p1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(lblTelefono_ip3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jLabel3)
                .addGap(58, 58, 58)
                .addComponent(jpHabilidades_p1, javax.swing.GroupLayout.PREFERRED_SIZE, 1081, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(504, Short.MAX_VALUE))
        );

        lblEdad_ip_p1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblEdad_ip_p1.setForeground(new java.awt.Color(51, 51, 51));
        lblEdad_ip_p1.setText("Edad: ");

        lblSexo_ip_p1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblSexo_ip_p1.setForeground(new java.awt.Color(51, 51, 51));
        lblSexo_ip_p1.setText("Sexo: ");

        txtA_descripcion_p1.setColumns(20);
        txtA_descripcion_p1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtA_descripcion_p1.setRows(5);
        jScrollPane1.setViewportView(txtA_descripcion_p1);

        lblDescripcion_p1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblDescripcion_p1.setForeground(new java.awt.Color(51, 51, 51));
        lblDescripcion_p1.setText("Mi Descripción: ");

        javax.swing.GroupLayout jp_DatosPersonales_p1Layout = new javax.swing.GroupLayout(jp_DatosPersonales_p1);
        jp_DatosPersonales_p1.setLayout(jp_DatosPersonales_p1Layout);
        jp_DatosPersonales_p1Layout.setHorizontalGroup(
            jp_DatosPersonales_p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_DatosPersonales_p1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_DatosPersonales_p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_DatosPersonales_p1Layout.createSequentialGroup()
                        .addGroup(jp_DatosPersonales_p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblSexo_ip_p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblEdad_ip_p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(61, 61, 61))
                    .addGroup(jp_DatosPersonales_p1Layout.createSequentialGroup()
                        .addComponent(lblDescripcion_p1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 728, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jp_DatosPersonales_p1Layout.setVerticalGroup(
            jp_DatosPersonales_p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_DatosPersonales_p1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_DatosPersonales_p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jp_DatosPersonales_p1Layout.createSequentialGroup()
                        .addComponent(lblDescripcion_p1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblEdad_ip_p1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblSexo_ip_p1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))
                .addContainerGap())
        );

        jp_Est1_p1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblInstitucion1_p1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblInstitucion1_p1.setForeground(new java.awt.Color(51, 51, 51));
        lblInstitucion1_p1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInstitucion1_p1.setText("institucion");

        lblAño1_p1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblAño1_p1.setForeground(new java.awt.Color(51, 51, 51));
        lblAño1_p1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAño1_p1.setText("año");

        lblCiudad1_p1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCiudad1_p1.setForeground(new java.awt.Color(51, 51, 51));
        lblCiudad1_p1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCiudad1_p1.setText("ciudad");

        lblTitulo1_p1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblTitulo1_p1.setForeground(new java.awt.Color(51, 51, 51));
        lblTitulo1_p1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo1_p1.setText("titulo");

        javax.swing.GroupLayout jp_Est1_p1Layout = new javax.swing.GroupLayout(jp_Est1_p1);
        jp_Est1_p1.setLayout(jp_Est1_p1Layout);
        jp_Est1_p1Layout.setHorizontalGroup(
            jp_Est1_p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Est1_p1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_Est1_p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAño1_p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCiudad1_p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp_Est1_p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblInstitucion1_p1, javax.swing.GroupLayout.DEFAULT_SIZE, 777, Short.MAX_VALUE)
                    .addComponent(lblTitulo1_p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        jp_Est1_p1Layout.setVerticalGroup(
            jp_Est1_p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_Est1_p1Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jp_Est1_p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAño1_p1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitulo1_p1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_Est1_p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCiudad1_p1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInstitucion1_p1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jp_Est2_p1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblInstitucion2_p1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblInstitucion2_p1.setForeground(new java.awt.Color(51, 51, 51));
        lblInstitucion2_p1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInstitucion2_p1.setText("institucion");

        lblAño2_p1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblAño2_p1.setForeground(new java.awt.Color(51, 51, 51));
        lblAño2_p1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAño2_p1.setText("año");

        lblCiudad2_p1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCiudad2_p1.setForeground(new java.awt.Color(51, 51, 51));
        lblCiudad2_p1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCiudad2_p1.setText("ciudad");

        lblTitulo2_p1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblTitulo2_p1.setForeground(new java.awt.Color(51, 51, 51));
        lblTitulo2_p1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo2_p1.setText("titulo");

        javax.swing.GroupLayout jp_Est2_p1Layout = new javax.swing.GroupLayout(jp_Est2_p1);
        jp_Est2_p1.setLayout(jp_Est2_p1Layout);
        jp_Est2_p1Layout.setHorizontalGroup(
            jp_Est2_p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Est2_p1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_Est2_p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCiudad2_p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAño2_p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp_Est2_p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTitulo2_p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblInstitucion2_p1, javax.swing.GroupLayout.DEFAULT_SIZE, 777, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        jp_Est2_p1Layout.setVerticalGroup(
            jp_Est2_p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Est2_p1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_Est2_p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAño2_p1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitulo2_p1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_Est2_p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCiudad2_p1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInstitucion2_p1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jp_Est3_p1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblInstitucion3_p1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblInstitucion3_p1.setForeground(new java.awt.Color(51, 51, 51));
        lblInstitucion3_p1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInstitucion3_p1.setText("institucion");

        lblAño3_p1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblAño3_p1.setForeground(new java.awt.Color(51, 51, 51));
        lblAño3_p1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAño3_p1.setText("año");

        lblCiudad3_p1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCiudad3_p1.setForeground(new java.awt.Color(51, 51, 51));
        lblCiudad3_p1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCiudad3_p1.setText("ciudad");

        lblTitulo3_p1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblTitulo3_p1.setForeground(new java.awt.Color(51, 51, 51));
        lblTitulo3_p1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo3_p1.setText("titulo");

        javax.swing.GroupLayout jp_Est3_p1Layout = new javax.swing.GroupLayout(jp_Est3_p1);
        jp_Est3_p1.setLayout(jp_Est3_p1Layout);
        jp_Est3_p1Layout.setHorizontalGroup(
            jp_Est3_p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Est3_p1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_Est3_p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCiudad3_p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAño3_p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp_Est3_p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTitulo3_p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblInstitucion3_p1, javax.swing.GroupLayout.DEFAULT_SIZE, 777, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        jp_Est3_p1Layout.setVerticalGroup(
            jp_Est3_p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Est3_p1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_Est3_p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAño3_p1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitulo3_p1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_Est3_p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCiudad3_p1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInstitucion3_p1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jp_Est4_p1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblInstitucion5_p1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblInstitucion5_p1.setForeground(new java.awt.Color(51, 51, 51));
        lblInstitucion5_p1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInstitucion5_p1.setText("institucion");

        lblAño5_p1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblAño5_p1.setForeground(new java.awt.Color(51, 51, 51));
        lblAño5_p1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAño5_p1.setText("año");

        lblCiudad5_p1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCiudad5_p1.setForeground(new java.awt.Color(51, 51, 51));
        lblCiudad5_p1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCiudad5_p1.setText("ciudad");

        lblTitulo5_p1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblTitulo5_p1.setForeground(new java.awt.Color(51, 51, 51));
        lblTitulo5_p1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo5_p1.setText("titulo");

        javax.swing.GroupLayout jp_Est4_p1Layout = new javax.swing.GroupLayout(jp_Est4_p1);
        jp_Est4_p1.setLayout(jp_Est4_p1Layout);
        jp_Est4_p1Layout.setHorizontalGroup(
            jp_Est4_p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Est4_p1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_Est4_p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCiudad5_p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAño5_p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp_Est4_p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTitulo5_p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblInstitucion5_p1, javax.swing.GroupLayout.DEFAULT_SIZE, 777, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        jp_Est4_p1Layout.setVerticalGroup(
            jp_Est4_p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Est4_p1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jp_Est4_p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAño5_p1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitulo5_p1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_Est4_p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCiudad5_p1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInstitucion5_p1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jp_Est5_p1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblInstitucion4_p1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblInstitucion4_p1.setForeground(new java.awt.Color(51, 51, 51));
        lblInstitucion4_p1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInstitucion4_p1.setText("institucion");

        lblAño4_p1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblAño4_p1.setForeground(new java.awt.Color(51, 51, 51));
        lblAño4_p1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAño4_p1.setText("año");

        lblCiudad4_p1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCiudad4_p1.setForeground(new java.awt.Color(51, 51, 51));
        lblCiudad4_p1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCiudad4_p1.setText("ciudad");

        lblTitulo4_p1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblTitulo4_p1.setForeground(new java.awt.Color(51, 51, 51));
        lblTitulo4_p1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo4_p1.setText("titulo");

        javax.swing.GroupLayout jp_Est5_p1Layout = new javax.swing.GroupLayout(jp_Est5_p1);
        jp_Est5_p1.setLayout(jp_Est5_p1Layout);
        jp_Est5_p1Layout.setHorizontalGroup(
            jp_Est5_p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Est5_p1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_Est5_p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAño4_p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCiudad4_p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp_Est5_p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTitulo4_p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblInstitucion4_p1, javax.swing.GroupLayout.DEFAULT_SIZE, 777, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        jp_Est5_p1Layout.setVerticalGroup(
            jp_Est5_p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Est5_p1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_Est5_p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAño4_p1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitulo4_p1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_Est5_p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCiudad4_p1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInstitucion4_p1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jp_Est6_p1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblInstitucion6_p1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblInstitucion6_p1.setForeground(new java.awt.Color(51, 51, 51));
        lblInstitucion6_p1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInstitucion6_p1.setText("institucion");

        lblAño6_p1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblAño6_p1.setForeground(new java.awt.Color(51, 51, 51));
        lblAño6_p1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAño6_p1.setText("año");

        lblCiudad6_p1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCiudad6_p1.setForeground(new java.awt.Color(51, 51, 51));
        lblCiudad6_p1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCiudad6_p1.setText("ciudad");

        lblTitulo6_p1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblTitulo6_p1.setForeground(new java.awt.Color(51, 51, 51));
        lblTitulo6_p1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo6_p1.setText("titulo");

        javax.swing.GroupLayout jp_Est6_p1Layout = new javax.swing.GroupLayout(jp_Est6_p1);
        jp_Est6_p1.setLayout(jp_Est6_p1Layout);
        jp_Est6_p1Layout.setHorizontalGroup(
            jp_Est6_p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Est6_p1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_Est6_p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCiudad6_p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAño6_p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp_Est6_p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTitulo6_p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblInstitucion6_p1, javax.swing.GroupLayout.DEFAULT_SIZE, 777, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        jp_Est6_p1Layout.setVerticalGroup(
            jp_Est6_p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Est6_p1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_Est6_p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAño6_p1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitulo6_p1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_Est6_p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCiudad6_p1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInstitucion6_p1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jp_Estudios_p1Layout = new javax.swing.GroupLayout(jp_Estudios_p1);
        jp_Estudios_p1.setLayout(jp_Estudios_p1Layout);
        jp_Estudios_p1Layout.setHorizontalGroup(
            jp_Estudios_p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_Est1_p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jp_Est2_p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jp_Est3_p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jp_Est4_p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jp_Est5_p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jp_Est6_p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jp_Estudios_p1Layout.setVerticalGroup(
            jp_Estudios_p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Estudios_p1Layout.createSequentialGroup()
                .addComponent(jp_Est1_p1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_Est2_p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_Est3_p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_Est5_p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_Est4_p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_Est6_p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSeparator1.setBackground(new java.awt.Color(0, 0, 102));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setPreferredSize(new java.awt.Dimension(4, 2));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 102));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        jp_Exp1_p1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblCargo1_p1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblCargo1_p1.setForeground(new java.awt.Color(51, 51, 51));
        lblCargo1_p1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCargo1_p1.setText("cargo desempeñado");

        lblInstitucionExp1_p1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblInstitucionExp1_p1.setForeground(new java.awt.Color(51, 51, 51));
        lblInstitucionExp1_p1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInstitucionExp1_p1.setText("institucion");

        descripcionExp1_p1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        descripcionExp1_p1.setForeground(new java.awt.Color(51, 51, 51));
        descripcionExp1_p1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        descripcionExp1_p1.setText("descripcion");

        añoExp1_p1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        añoExp1_p1.setForeground(new java.awt.Color(51, 51, 51));
        añoExp1_p1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        añoExp1_p1.setText("año");

        javax.swing.GroupLayout jp_Exp1_p1Layout = new javax.swing.GroupLayout(jp_Exp1_p1);
        jp_Exp1_p1.setLayout(jp_Exp1_p1Layout);
        jp_Exp1_p1Layout.setHorizontalGroup(
            jp_Exp1_p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Exp1_p1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_Exp1_p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descripcionExp1_p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCargo1_p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jp_Exp1_p1Layout.createSequentialGroup()
                        .addComponent(lblInstitucionExp1_p1, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(añoExp1_p1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jp_Exp1_p1Layout.setVerticalGroup(
            jp_Exp1_p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Exp1_p1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCargo1_p1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_Exp1_p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInstitucionExp1_p1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(añoExp1_p1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(descripcionExp1_p1, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        jp_Exp2_p1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblCargo2_p1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblCargo2_p1.setForeground(new java.awt.Color(51, 51, 51));
        lblCargo2_p1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCargo2_p1.setText("cargo desempeñado");

        lblInstitucionExp2_p1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblInstitucionExp2_p1.setForeground(new java.awt.Color(51, 51, 51));
        lblInstitucionExp2_p1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInstitucionExp2_p1.setText("institucion");

        descripcionExp2_p1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        descripcionExp2_p1.setForeground(new java.awt.Color(51, 51, 51));
        descripcionExp2_p1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        descripcionExp2_p1.setText("descripcion");

        añoExp2_p1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        añoExp2_p1.setForeground(new java.awt.Color(51, 51, 51));
        añoExp2_p1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        añoExp2_p1.setText("año");

        javax.swing.GroupLayout jp_Exp2_p1Layout = new javax.swing.GroupLayout(jp_Exp2_p1);
        jp_Exp2_p1.setLayout(jp_Exp2_p1Layout);
        jp_Exp2_p1Layout.setHorizontalGroup(
            jp_Exp2_p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Exp2_p1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_Exp2_p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descripcionExp2_p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCargo2_p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jp_Exp2_p1Layout.createSequentialGroup()
                        .addComponent(lblInstitucionExp2_p1, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(añoExp2_p1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jp_Exp2_p1Layout.setVerticalGroup(
            jp_Exp2_p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Exp2_p1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCargo2_p1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_Exp2_p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInstitucionExp2_p1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(añoExp2_p1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(descripcionExp2_p1, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        jp_Exp3_p1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblCargo3_p1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblCargo3_p1.setForeground(new java.awt.Color(51, 51, 51));
        lblCargo3_p1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCargo3_p1.setText("cargo desempeñado");

        lblInstitucionExp3_p1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblInstitucionExp3_p1.setForeground(new java.awt.Color(51, 51, 51));
        lblInstitucionExp3_p1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInstitucionExp3_p1.setText("institucion");

        descripcionExp3_p1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        descripcionExp3_p1.setForeground(new java.awt.Color(51, 51, 51));
        descripcionExp3_p1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        descripcionExp3_p1.setText("descripcion");

        añoExp3_p1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        añoExp3_p1.setForeground(new java.awt.Color(51, 51, 51));
        añoExp3_p1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        añoExp3_p1.setText("año");

        javax.swing.GroupLayout jp_Exp3_p1Layout = new javax.swing.GroupLayout(jp_Exp3_p1);
        jp_Exp3_p1.setLayout(jp_Exp3_p1Layout);
        jp_Exp3_p1Layout.setHorizontalGroup(
            jp_Exp3_p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Exp3_p1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_Exp3_p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descripcionExp3_p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCargo3_p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jp_Exp3_p1Layout.createSequentialGroup()
                        .addComponent(lblInstitucionExp3_p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(añoExp3_p1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jp_Exp3_p1Layout.setVerticalGroup(
            jp_Exp3_p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Exp3_p1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCargo3_p1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_Exp3_p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInstitucionExp3_p1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(añoExp3_p1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(descripcionExp3_p1, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        jp_Exp4_p1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblCargo4_p1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblCargo4_p1.setForeground(new java.awt.Color(51, 51, 51));
        lblCargo4_p1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCargo4_p1.setText("cargo desempeñado");

        lblInstitucionExp4_p1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblInstitucionExp4_p1.setForeground(new java.awt.Color(51, 51, 51));
        lblInstitucionExp4_p1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInstitucionExp4_p1.setText("institucion");

        descripcionExp4_p1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        descripcionExp4_p1.setForeground(new java.awt.Color(51, 51, 51));
        descripcionExp4_p1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        descripcionExp4_p1.setText("descripcion");

        añoExp4_p1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        añoExp4_p1.setForeground(new java.awt.Color(51, 51, 51));
        añoExp4_p1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        añoExp4_p1.setText("año");

        javax.swing.GroupLayout jp_Exp4_p1Layout = new javax.swing.GroupLayout(jp_Exp4_p1);
        jp_Exp4_p1.setLayout(jp_Exp4_p1Layout);
        jp_Exp4_p1Layout.setHorizontalGroup(
            jp_Exp4_p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Exp4_p1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_Exp4_p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descripcionExp4_p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCargo4_p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jp_Exp4_p1Layout.createSequentialGroup()
                        .addComponent(lblInstitucionExp4_p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(añoExp4_p1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jp_Exp4_p1Layout.setVerticalGroup(
            jp_Exp4_p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Exp4_p1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCargo4_p1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_Exp4_p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInstitucionExp4_p1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(añoExp4_p1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(descripcionExp4_p1, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        jp_Exp5_p1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblCargo5_p1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblCargo5_p1.setForeground(new java.awt.Color(51, 51, 51));
        lblCargo5_p1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCargo5_p1.setText("cargo desempeñado");

        lblInstitucionExp5_p1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblInstitucionExp5_p1.setForeground(new java.awt.Color(51, 51, 51));
        lblInstitucionExp5_p1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInstitucionExp5_p1.setText("institucion");

        descripcionExp5_p1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        descripcionExp5_p1.setForeground(new java.awt.Color(51, 51, 51));
        descripcionExp5_p1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        descripcionExp5_p1.setText("descripcion");

        añoExp5_p1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        añoExp5_p1.setForeground(new java.awt.Color(51, 51, 51));
        añoExp5_p1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        añoExp5_p1.setText("año");

        javax.swing.GroupLayout jp_Exp5_p1Layout = new javax.swing.GroupLayout(jp_Exp5_p1);
        jp_Exp5_p1.setLayout(jp_Exp5_p1Layout);
        jp_Exp5_p1Layout.setHorizontalGroup(
            jp_Exp5_p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Exp5_p1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_Exp5_p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descripcionExp5_p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCargo5_p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jp_Exp5_p1Layout.createSequentialGroup()
                        .addComponent(lblInstitucionExp5_p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(añoExp5_p1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jp_Exp5_p1Layout.setVerticalGroup(
            jp_Exp5_p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Exp5_p1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCargo5_p1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_Exp5_p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInstitucionExp5_p1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(añoExp5_p1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(descripcionExp5_p1, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jp_Experiencias_p1Layout = new javax.swing.GroupLayout(jp_Experiencias_p1);
        jp_Experiencias_p1.setLayout(jp_Experiencias_p1Layout);
        jp_Experiencias_p1Layout.setHorizontalGroup(
            jp_Experiencias_p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_Exp1_p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jp_Exp2_p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jp_Exp3_p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jp_Exp4_p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jp_Exp5_p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jp_Experiencias_p1Layout.setVerticalGroup(
            jp_Experiencias_p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Experiencias_p1Layout.createSequentialGroup()
                .addComponent(jp_Exp1_p1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_Exp2_p1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_Exp3_p1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_Exp4_p1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_Exp5_p1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel25.setOpaque(true);
        jLabel25.setBackground(new java.awt.Color(255, 255, 255));
        jLabel25.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 102));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel25.setText("Formación Académica.");

        jLabel25.setOpaque(true);
        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 102));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel26.setText("Experiencia Laboral.");

        jLabel25.setOpaque(true);
        jLabel27.setBackground(new java.awt.Color(255, 255, 255));
        jLabel27.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 0, 102));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel27.setText("Referencias.");

        jSeparator3.setBackground(new java.awt.Color(0, 0, 102));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblNombreRef1_p1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblNombreRef1_p1.setForeground(new java.awt.Color(51, 51, 51));
        lblNombreRef1_p1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreRef1_p1.setText("Nombre del Referente");

        lblCargoRef1_p1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCargoRef1_p1.setForeground(new java.awt.Color(51, 51, 51));
        lblCargoRef1_p1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCargoRef1_p1.setText("Cargo del Referente");

        lblEmpresaRef1_p1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblEmpresaRef1_p1.setForeground(new java.awt.Color(51, 51, 51));
        lblEmpresaRef1_p1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEmpresaRef1_p1.setText("Empresa del Referente");

        lblTelefonoRef1_p1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTelefonoRef1_p1.setForeground(new java.awt.Color(51, 51, 51));
        lblTelefonoRef1_p1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTelefonoRef1_p1.setText("Telefono del Referente");

        lblCorreoRef1_p1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCorreoRef1_p1.setForeground(new java.awt.Color(51, 51, 51));
        lblCorreoRef1_p1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCorreoRef1_p1.setText("Correo del Referente");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblNombreRef1_p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCargoRef1_p1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCorreoRef1_p1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTelefonoRef1_p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblEmpresaRef1_p1, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(lblNombreRef1_p1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCargoRef1_p1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmpresaRef1_p1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCorreoRef1_p1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefonoRef1_p1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 13, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblNombreRef2_p1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblNombreRef2_p1.setForeground(new java.awt.Color(51, 51, 51));
        lblNombreRef2_p1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreRef2_p1.setText("Nombre del Referente");

        lblCargoRef2_p1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCargoRef2_p1.setForeground(new java.awt.Color(51, 51, 51));
        lblCargoRef2_p1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCargoRef2_p1.setText("Cargo del Referente");

        lblEmpresaRef2_p1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblEmpresaRef2_p1.setForeground(new java.awt.Color(51, 51, 51));
        lblEmpresaRef2_p1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEmpresaRef2_p1.setText("Empresa del Referente");

        lblTelefonoRef2_p1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTelefonoRef2_p1.setForeground(new java.awt.Color(51, 51, 51));
        lblTelefonoRef2_p1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTelefonoRef2_p1.setText("Telefono del Referente");

        lblCorreoRef2_p1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCorreoRef2_p1.setForeground(new java.awt.Color(51, 51, 51));
        lblCorreoRef2_p1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCorreoRef2_p1.setText("Correo del Referente");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblNombreRef2_p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCargoRef2_p1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCorreoRef2_p1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTelefonoRef2_p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblEmpresaRef2_p1, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(lblNombreRef2_p1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCargoRef2_p1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmpresaRef2_p1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCorreoRef2_p1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefonoRef2_p1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 13, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblNombreRef3_p1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblNombreRef3_p1.setForeground(new java.awt.Color(51, 51, 51));
        lblNombreRef3_p1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreRef3_p1.setText("Nombre del Referente");

        lblCargoRef3_p1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCargoRef3_p1.setForeground(new java.awt.Color(51, 51, 51));
        lblCargoRef3_p1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCargoRef3_p1.setText("Cargo del Referente");

        lblEmpresaRef3_p1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblEmpresaRef3_p1.setForeground(new java.awt.Color(51, 51, 51));
        lblEmpresaRef3_p1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEmpresaRef3_p1.setText("Empresa del Referente");

        lblTelefonoRef3_p1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTelefonoRef3_p1.setForeground(new java.awt.Color(51, 51, 51));
        lblTelefonoRef3_p1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTelefonoRef3_p1.setText("Telefono del Referente");

        lblCorreoRef3_p1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCorreoRef3_p1.setForeground(new java.awt.Color(51, 51, 51));
        lblCorreoRef3_p1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCorreoRef3_p1.setText("Correo del Referente");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblNombreRef3_p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCargoRef3_p1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCorreoRef3_p1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTelefonoRef3_p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblEmpresaRef3_p1, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(lblNombreRef3_p1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCargoRef3_p1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmpresaRef3_p1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCorreoRef3_p1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefonoRef3_p1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jp_Referencias_p1Layout = new javax.swing.GroupLayout(jp_Referencias_p1);
        jp_Referencias_p1.setLayout(jp_Referencias_p1Layout);
        jp_Referencias_p1Layout.setHorizontalGroup(
            jp_Referencias_p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jp_Referencias_p1Layout.setVerticalGroup(
            jp_Referencias_p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Referencias_p1Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel25.setOpaque(true);
        jLabel31.setBackground(new java.awt.Color(255, 255, 255));
        jLabel31.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 0, 102));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel31.setText("Información Personal.");

        jSeparator7.setBackground(new java.awt.Color(0, 0, 102));
        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator7.setPreferredSize(new java.awt.Dimension(4, 2));

        javax.swing.GroupLayout jp_Contenedor_p1Layout = new javax.swing.GroupLayout(jp_Contenedor_p1);
        jp_Contenedor_p1.setLayout(jp_Contenedor_p1Layout);
        jp_Contenedor_p1Layout.setHorizontalGroup(
            jp_Contenedor_p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Contenedor_p1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jp_BarraIzquierda_p1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jp_Contenedor_p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jp_Referencias_p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator3)
                    .addComponent(jp_Experiencias_p1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jp_DatosPersonales_p1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jp_Cabecera_p1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel27)
                    .addComponent(jSeparator2)
                    .addComponent(jLabel26)
                    .addComponent(jp_Estudios_p1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel25)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel31)
                    .addComponent(jSeparator7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_Contenedor_p1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33))
        );
        jp_Contenedor_p1Layout.setVerticalGroup(
            jp_Contenedor_p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Contenedor_p1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(jp_Contenedor_p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jp_BarraIzquierda_p1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jp_Contenedor_p1Layout.createSequentialGroup()
                        .addComponent(jp_Cabecera_p1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jp_DatosPersonales_p1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(jp_Estudios_p1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jp_Experiencias_p1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(jp_Referencias_p1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jp_Perfil1Layout = new javax.swing.GroupLayout(jp_Perfil1);
        jp_Perfil1.setLayout(jp_Perfil1Layout);
        jp_Perfil1Layout.setHorizontalGroup(
            jp_Perfil1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_Contenedor_p1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jp_Perfil1Layout.setVerticalGroup(
            jp_Perfil1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_Contenedor_p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jp_Cabecera.setBackground(new java.awt.Color(204, 255, 204));

        lblProfesion2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblProfesion2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        lblNombres2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblNombres2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblFotoperfil_p2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFotoperfil_p2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/user_64_.png"))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel9.setText("Contacto.");

        lblTelefono_ip_p2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTelefono_ip_p2.setForeground(new java.awt.Color(51, 51, 51));
        lblTelefono_ip_p2.setText("Telefono: ");

        lblCelular_ip_p2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCelular_ip_p2.setForeground(new java.awt.Color(51, 51, 51));
        lblCelular_ip_p2.setText("Celular: ");

        lblCorreo_ip_p2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCorreo_ip_p2.setForeground(new java.awt.Color(51, 51, 51));
        lblCorreo_ip_p2.setText("Correo: ");

        javax.swing.GroupLayout jp_CabeceraLayout = new javax.swing.GroupLayout(jp_Cabecera);
        jp_Cabecera.setLayout(jp_CabeceraLayout);
        jp_CabeceraLayout.setHorizontalGroup(
            jp_CabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_CabeceraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFotoperfil_p2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jp_CabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_CabeceraLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lblNombres2, javax.swing.GroupLayout.PREFERRED_SIZE, 752, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jp_CabeceraLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblProfesion2, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jp_CabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_CabeceraLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addGap(105, 105, 105))
                    .addGroup(jp_CabeceraLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jp_CabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTelefono_ip_p2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCelular_ip_p2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCorreo_ip_p2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jp_CabeceraLayout.setVerticalGroup(
            jp_CabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_CabeceraLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(lblNombres2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblProfesion2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
            .addGroup(jp_CabeceraLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lblFotoperfil_p2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_CabeceraLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(32, 32, 32)
                .addComponent(lblTelefono_ip_p2)
                .addGap(18, 18, 18)
                .addComponent(lblCelular_ip_p2)
                .addGap(18, 18, 18)
                .addComponent(lblCorreo_ip_p2)
                .addGap(54, 54, 54))
        );

        jp_Ixquierda.setBackground(new java.awt.Color(153, 255, 153));

        jpHabilidades_p2.setBackground(new java.awt.Color(153, 255, 153));
        jpHabilidades_p2.setLayout(new java.awt.GridLayout(0, 1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setText("Habilidades.");

        lblCiudad1_p6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCiudad1_p6.setForeground(new java.awt.Color(51, 51, 51));
        lblCiudad1_p6.setText("Género: ");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel10.setText("Información Personal.");

        lblCiudad1_p7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCiudad1_p7.setForeground(new java.awt.Color(51, 51, 51));
        lblCiudad1_p7.setText("Edad: ");

        lblCiudad1_p8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCiudad1_p8.setForeground(new java.awt.Color(51, 51, 51));
        lblCiudad1_p8.setText("Dirección: ");

        lblCiudad1_p9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCiudad1_p9.setForeground(new java.awt.Color(51, 51, 51));
        lblCiudad1_p9.setText("Descripción: ");

        txtSexo_ip_p2.setBackground(new java.awt.Color(153, 255, 153));
        txtSexo_ip_p2.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N

        txtEdad_ip_p2.setBackground(new java.awt.Color(153, 255, 153));
        txtEdad_ip_p2.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N

        txtA_Direccion_ip_p2.setBackground(new java.awt.Color(153, 255, 153));
        txtA_Direccion_ip_p2.setColumns(20);
        txtA_Direccion_ip_p2.setRows(5);
        jScrollPane3.setViewportView(txtA_Direccion_ip_p2);

        txtA_Descripcion_ip_p2.setBackground(new java.awt.Color(153, 255, 153));
        txtA_Descripcion_ip_p2.setColumns(20);
        txtA_Descripcion_ip_p2.setRows(5);
        jScrollPane4.setViewportView(txtA_Descripcion_ip_p2);

        javax.swing.GroupLayout jp_IxquierdaLayout = new javax.swing.GroupLayout(jp_Ixquierda);
        jp_Ixquierda.setLayout(jp_IxquierdaLayout);
        jp_IxquierdaLayout.setHorizontalGroup(
            jp_IxquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_IxquierdaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_IxquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtSexo_ip_p2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCiudad1_p6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCiudad1_p7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCiudad1_p8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCiudad1_p9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtEdad_ip_p2)
                    .addComponent(jScrollPane4)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_IxquierdaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addGap(52, 52, 52))
                    .addComponent(jpHabilidades_p2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jp_IxquierdaLayout.setVerticalGroup(
            jp_IxquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_IxquierdaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(64, 64, 64)
                .addComponent(lblCiudad1_p6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtSexo_ip_p2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(lblCiudad1_p7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtEdad_ip_p2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(lblCiudad1_p8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(lblCiudad1_p9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118)
                .addComponent(jLabel4)
                .addGap(58, 58, 58)
                .addComponent(jpHabilidades_p2, javax.swing.GroupLayout.PREFERRED_SIZE, 1081, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(381, Short.MAX_VALUE))
        );

        jSeparator4.setBackground(new java.awt.Color(0, 0, 102));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator4.setPreferredSize(new java.awt.Dimension(4, 2));

        jp_Est8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblInstitucion1_p2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblInstitucion1_p2.setForeground(new java.awt.Color(51, 51, 51));
        lblInstitucion1_p2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInstitucion1_p2.setText("institucion");

        lblAño1_p2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblAño1_p2.setForeground(new java.awt.Color(51, 51, 51));
        lblAño1_p2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAño1_p2.setText("año");

        lblCiudad1_p2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCiudad1_p2.setForeground(new java.awt.Color(51, 51, 51));
        lblCiudad1_p2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCiudad1_p2.setText("ciudad");

        lblTitulo1_p2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblTitulo1_p2.setForeground(new java.awt.Color(51, 51, 51));
        lblTitulo1_p2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo1_p2.setText("titulo");

        javax.swing.GroupLayout jp_Est8Layout = new javax.swing.GroupLayout(jp_Est8);
        jp_Est8.setLayout(jp_Est8Layout);
        jp_Est8Layout.setHorizontalGroup(
            jp_Est8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Est8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_Est8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAño1_p2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCiudad1_p2, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp_Est8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblInstitucion1_p2, javax.swing.GroupLayout.DEFAULT_SIZE, 777, Short.MAX_VALUE)
                    .addComponent(lblTitulo1_p2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        jp_Est8Layout.setVerticalGroup(
            jp_Est8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_Est8Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jp_Est8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAño1_p2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitulo1_p2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_Est8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCiudad1_p2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInstitucion1_p2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jp_Est9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblInstitucion2_p2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblInstitucion2_p2.setForeground(new java.awt.Color(51, 51, 51));
        lblInstitucion2_p2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInstitucion2_p2.setText("institucion");

        lblAño2_p2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblAño2_p2.setForeground(new java.awt.Color(51, 51, 51));
        lblAño2_p2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAño2_p2.setText("año");

        lblCiudad2_p2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCiudad2_p2.setForeground(new java.awt.Color(51, 51, 51));
        lblCiudad2_p2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCiudad2_p2.setText("ciudad");

        lblTitulo2_p2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblTitulo2_p2.setForeground(new java.awt.Color(51, 51, 51));
        lblTitulo2_p2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo2_p2.setText("titulo");

        javax.swing.GroupLayout jp_Est9Layout = new javax.swing.GroupLayout(jp_Est9);
        jp_Est9.setLayout(jp_Est9Layout);
        jp_Est9Layout.setHorizontalGroup(
            jp_Est9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Est9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_Est9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCiudad2_p2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAño2_p2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp_Est9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTitulo2_p2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblInstitucion2_p2, javax.swing.GroupLayout.DEFAULT_SIZE, 777, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        jp_Est9Layout.setVerticalGroup(
            jp_Est9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Est9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_Est9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAño2_p2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitulo2_p2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_Est9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCiudad2_p2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInstitucion2_p2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jp_Est10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblInstitucion3_p2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblInstitucion3_p2.setForeground(new java.awt.Color(51, 51, 51));
        lblInstitucion3_p2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInstitucion3_p2.setText("institucion");

        lblAño3_p2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblAño3_p2.setForeground(new java.awt.Color(51, 51, 51));
        lblAño3_p2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAño3_p2.setText("año");

        lblCiudad3_p2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCiudad3_p2.setForeground(new java.awt.Color(51, 51, 51));
        lblCiudad3_p2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCiudad3_p2.setText("ciudad");

        lblTitulo3_p2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblTitulo3_p2.setForeground(new java.awt.Color(51, 51, 51));
        lblTitulo3_p2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo3_p2.setText("titulo");

        javax.swing.GroupLayout jp_Est10Layout = new javax.swing.GroupLayout(jp_Est10);
        jp_Est10.setLayout(jp_Est10Layout);
        jp_Est10Layout.setHorizontalGroup(
            jp_Est10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Est10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_Est10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCiudad3_p2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAño3_p2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp_Est10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTitulo3_p2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblInstitucion3_p2, javax.swing.GroupLayout.DEFAULT_SIZE, 777, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        jp_Est10Layout.setVerticalGroup(
            jp_Est10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Est10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_Est10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAño3_p2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitulo3_p2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_Est10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCiudad3_p2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInstitucion3_p2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jp_Est11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblInstitucion5_p2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblInstitucion5_p2.setForeground(new java.awt.Color(51, 51, 51));
        lblInstitucion5_p2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInstitucion5_p2.setText("institucion");

        lblAño5_p2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblAño5_p2.setForeground(new java.awt.Color(51, 51, 51));
        lblAño5_p2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAño5_p2.setText("año");

        lblCiudad5_p2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCiudad5_p2.setForeground(new java.awt.Color(51, 51, 51));
        lblCiudad5_p2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCiudad5_p2.setText("ciudad");

        lblTitulo5_p2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblTitulo5_p2.setForeground(new java.awt.Color(51, 51, 51));
        lblTitulo5_p2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo5_p2.setText("titulo");

        javax.swing.GroupLayout jp_Est11Layout = new javax.swing.GroupLayout(jp_Est11);
        jp_Est11.setLayout(jp_Est11Layout);
        jp_Est11Layout.setHorizontalGroup(
            jp_Est11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Est11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_Est11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCiudad5_p2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAño5_p2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp_Est11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTitulo5_p2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblInstitucion5_p2, javax.swing.GroupLayout.DEFAULT_SIZE, 777, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        jp_Est11Layout.setVerticalGroup(
            jp_Est11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Est11Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jp_Est11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAño5_p2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitulo5_p2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_Est11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCiudad5_p2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInstitucion5_p2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jp_Est12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblInstitucion4_p2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblInstitucion4_p2.setForeground(new java.awt.Color(51, 51, 51));
        lblInstitucion4_p2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInstitucion4_p2.setText("institucion");

        lblAño4_p2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblAño4_p2.setForeground(new java.awt.Color(51, 51, 51));
        lblAño4_p2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAño4_p2.setText("año");

        lblCiudad4_p2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCiudad4_p2.setForeground(new java.awt.Color(51, 51, 51));
        lblCiudad4_p2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCiudad4_p2.setText("ciudad");

        lblTitulo4_p2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblTitulo4_p2.setForeground(new java.awt.Color(51, 51, 51));
        lblTitulo4_p2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo4_p2.setText("titulo");

        javax.swing.GroupLayout jp_Est12Layout = new javax.swing.GroupLayout(jp_Est12);
        jp_Est12.setLayout(jp_Est12Layout);
        jp_Est12Layout.setHorizontalGroup(
            jp_Est12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Est12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_Est12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAño4_p2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCiudad4_p2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp_Est12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTitulo4_p2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblInstitucion4_p2, javax.swing.GroupLayout.DEFAULT_SIZE, 777, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        jp_Est12Layout.setVerticalGroup(
            jp_Est12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Est12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_Est12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAño4_p2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitulo4_p2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_Est12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCiudad4_p2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInstitucion4_p2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jp_Est13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblInstitucion6_p2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblInstitucion6_p2.setForeground(new java.awt.Color(51, 51, 51));
        lblInstitucion6_p2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInstitucion6_p2.setText("institucion");

        lblAño6_p2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblAño6_p2.setForeground(new java.awt.Color(51, 51, 51));
        lblAño6_p2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAño6_p2.setText("año");

        lblCiudad6_p2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCiudad6_p2.setForeground(new java.awt.Color(51, 51, 51));
        lblCiudad6_p2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCiudad6_p2.setText("ciudad");

        lblTitulo6_p2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblTitulo6_p2.setForeground(new java.awt.Color(51, 51, 51));
        lblTitulo6_p2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo6_p2.setText("titulo");

        javax.swing.GroupLayout jp_Est13Layout = new javax.swing.GroupLayout(jp_Est13);
        jp_Est13.setLayout(jp_Est13Layout);
        jp_Est13Layout.setHorizontalGroup(
            jp_Est13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Est13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_Est13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCiudad6_p2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAño6_p2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp_Est13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTitulo6_p2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblInstitucion6_p2, javax.swing.GroupLayout.DEFAULT_SIZE, 777, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        jp_Est13Layout.setVerticalGroup(
            jp_Est13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Est13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_Est13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAño6_p2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitulo6_p2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_Est13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCiudad6_p2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInstitucion6_p2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jp_Estudios_p2Layout = new javax.swing.GroupLayout(jp_Estudios_p2);
        jp_Estudios_p2.setLayout(jp_Estudios_p2Layout);
        jp_Estudios_p2Layout.setHorizontalGroup(
            jp_Estudios_p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_Est8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jp_Est9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jp_Est10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jp_Est11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jp_Est12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jp_Est13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jp_Estudios_p2Layout.setVerticalGroup(
            jp_Estudios_p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Estudios_p2Layout.createSequentialGroup()
                .addComponent(jp_Est8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_Est9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_Est10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_Est12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_Est11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_Est13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel25.setOpaque(true);
        jLabel28.setBackground(new java.awt.Color(255, 255, 255));
        jLabel28.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 0, 102));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel28.setText("Formación Académica.");

        jSeparator5.setBackground(new java.awt.Color(0, 0, 102));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));

        jp_Exp6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblCargo1_p2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblCargo1_p2.setForeground(new java.awt.Color(51, 51, 51));
        lblCargo1_p2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCargo1_p2.setText("cargo desempeñado");

        lblInstitucionExp1_p2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblInstitucionExp1_p2.setForeground(new java.awt.Color(51, 51, 51));
        lblInstitucionExp1_p2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInstitucionExp1_p2.setText("institucion");

        descripcionExp1_p2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        descripcionExp1_p2.setForeground(new java.awt.Color(51, 51, 51));
        descripcionExp1_p2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        descripcionExp1_p2.setText("descripcion");

        añoExp1_p2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        añoExp1_p2.setForeground(new java.awt.Color(51, 51, 51));
        añoExp1_p2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        añoExp1_p2.setText("año");

        javax.swing.GroupLayout jp_Exp6Layout = new javax.swing.GroupLayout(jp_Exp6);
        jp_Exp6.setLayout(jp_Exp6Layout);
        jp_Exp6Layout.setHorizontalGroup(
            jp_Exp6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Exp6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_Exp6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descripcionExp1_p2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jp_Exp6Layout.createSequentialGroup()
                        .addComponent(lblInstitucionExp1_p2, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(añoExp1_p2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lblCargo1_p2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jp_Exp6Layout.setVerticalGroup(
            jp_Exp6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Exp6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCargo1_p2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_Exp6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInstitucionExp1_p2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(añoExp1_p2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(descripcionExp1_p2, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        jp_Exp7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblCargo2_p2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblCargo2_p2.setForeground(new java.awt.Color(51, 51, 51));
        lblCargo2_p2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCargo2_p2.setText("cargo desempeñado");

        lblInstitucionExp2_p2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblInstitucionExp2_p2.setForeground(new java.awt.Color(51, 51, 51));
        lblInstitucionExp2_p2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInstitucionExp2_p2.setText("institucion");

        descripcionExp2_p2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        descripcionExp2_p2.setForeground(new java.awt.Color(51, 51, 51));
        descripcionExp2_p2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        descripcionExp2_p2.setText("descripcion");

        añoExp2_p2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        añoExp2_p2.setForeground(new java.awt.Color(51, 51, 51));
        añoExp2_p2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        añoExp2_p2.setText("año");

        javax.swing.GroupLayout jp_Exp7Layout = new javax.swing.GroupLayout(jp_Exp7);
        jp_Exp7.setLayout(jp_Exp7Layout);
        jp_Exp7Layout.setHorizontalGroup(
            jp_Exp7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Exp7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_Exp7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descripcionExp2_p2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCargo2_p2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jp_Exp7Layout.createSequentialGroup()
                        .addComponent(lblInstitucionExp2_p2, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(añoExp2_p2, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jp_Exp7Layout.setVerticalGroup(
            jp_Exp7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Exp7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCargo2_p2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_Exp7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInstitucionExp2_p2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(añoExp2_p2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(descripcionExp2_p2, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        jp_Exp8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblCargo3_p2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblCargo3_p2.setForeground(new java.awt.Color(51, 51, 51));
        lblCargo3_p2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCargo3_p2.setText("cargo desempeñado");

        lblInstitucionExp3_p2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblInstitucionExp3_p2.setForeground(new java.awt.Color(51, 51, 51));
        lblInstitucionExp3_p2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInstitucionExp3_p2.setText("institucion");

        descripcionExp3_p2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        descripcionExp3_p2.setForeground(new java.awt.Color(51, 51, 51));
        descripcionExp3_p2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        descripcionExp3_p2.setText("descripcion");

        añoExp3_p2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        añoExp3_p2.setForeground(new java.awt.Color(51, 51, 51));
        añoExp3_p2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        añoExp3_p2.setText("año");

        javax.swing.GroupLayout jp_Exp8Layout = new javax.swing.GroupLayout(jp_Exp8);
        jp_Exp8.setLayout(jp_Exp8Layout);
        jp_Exp8Layout.setHorizontalGroup(
            jp_Exp8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Exp8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_Exp8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descripcionExp3_p2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCargo3_p2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jp_Exp8Layout.createSequentialGroup()
                        .addComponent(lblInstitucionExp3_p2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(añoExp3_p2, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jp_Exp8Layout.setVerticalGroup(
            jp_Exp8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Exp8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCargo3_p2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_Exp8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInstitucionExp3_p2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(añoExp3_p2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(descripcionExp3_p2, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        jp_Exp9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblCargo4_p2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblCargo4_p2.setForeground(new java.awt.Color(51, 51, 51));
        lblCargo4_p2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCargo4_p2.setText("cargo desempeñado");

        lblInstitucionExp4_p2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblInstitucionExp4_p2.setForeground(new java.awt.Color(51, 51, 51));
        lblInstitucionExp4_p2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInstitucionExp4_p2.setText("institucion");

        descripcionExp4_p2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        descripcionExp4_p2.setForeground(new java.awt.Color(51, 51, 51));
        descripcionExp4_p2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        descripcionExp4_p2.setText("descripcion");

        añoExp4_p2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        añoExp4_p2.setForeground(new java.awt.Color(51, 51, 51));
        añoExp4_p2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        añoExp4_p2.setText("año");

        javax.swing.GroupLayout jp_Exp9Layout = new javax.swing.GroupLayout(jp_Exp9);
        jp_Exp9.setLayout(jp_Exp9Layout);
        jp_Exp9Layout.setHorizontalGroup(
            jp_Exp9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Exp9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_Exp9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descripcionExp4_p2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCargo4_p2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jp_Exp9Layout.createSequentialGroup()
                        .addComponent(lblInstitucionExp4_p2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(añoExp4_p2, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jp_Exp9Layout.setVerticalGroup(
            jp_Exp9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Exp9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCargo4_p2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_Exp9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInstitucionExp4_p2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(añoExp4_p2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(descripcionExp4_p2, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        jp_Exp10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblCargo5_p2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblCargo5_p2.setForeground(new java.awt.Color(51, 51, 51));
        lblCargo5_p2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCargo5_p2.setText("cargo desempeñado");

        lblInstitucionExp5_p2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblInstitucionExp5_p2.setForeground(new java.awt.Color(51, 51, 51));
        lblInstitucionExp5_p2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInstitucionExp5_p2.setText("institucion");

        descripcionExp5_p2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        descripcionExp5_p2.setForeground(new java.awt.Color(51, 51, 51));
        descripcionExp5_p2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        descripcionExp5_p2.setText("descripcion");

        añoExp5_p2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        añoExp5_p2.setForeground(new java.awt.Color(51, 51, 51));
        añoExp5_p2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        añoExp5_p2.setText("año");

        javax.swing.GroupLayout jp_Exp10Layout = new javax.swing.GroupLayout(jp_Exp10);
        jp_Exp10.setLayout(jp_Exp10Layout);
        jp_Exp10Layout.setHorizontalGroup(
            jp_Exp10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Exp10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_Exp10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descripcionExp5_p2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCargo5_p2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jp_Exp10Layout.createSequentialGroup()
                        .addComponent(lblInstitucionExp5_p2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(añoExp5_p2, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jp_Exp10Layout.setVerticalGroup(
            jp_Exp10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Exp10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCargo5_p2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_Exp10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInstitucionExp5_p2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(añoExp5_p2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(descripcionExp5_p2, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jp_Experiencias_p2Layout = new javax.swing.GroupLayout(jp_Experiencias_p2);
        jp_Experiencias_p2.setLayout(jp_Experiencias_p2Layout);
        jp_Experiencias_p2Layout.setHorizontalGroup(
            jp_Experiencias_p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_Experiencias_p2Layout.createSequentialGroup()
                .addGroup(jp_Experiencias_p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jp_Exp6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jp_Exp7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jp_Exp8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jp_Exp9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jp_Exp10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jp_Experiencias_p2Layout.setVerticalGroup(
            jp_Experiencias_p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Experiencias_p2Layout.createSequentialGroup()
                .addComponent(jp_Exp6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_Exp7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_Exp8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_Exp9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_Exp10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel25.setOpaque(true);
        jLabel29.setBackground(new java.awt.Color(255, 255, 255));
        jLabel29.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 0, 102));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel29.setText("Experiencia Laboral.");

        jLabel25.setOpaque(true);
        jLabel30.setBackground(new java.awt.Color(255, 255, 255));
        jLabel30.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 0, 102));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel30.setText("Referencias.");

        jSeparator6.setBackground(new java.awt.Color(0, 0, 102));
        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));

        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblNombreRef1_p2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblNombreRef1_p2.setForeground(new java.awt.Color(51, 51, 51));
        lblNombreRef1_p2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreRef1_p2.setText("Nombre del Referente");

        lblCargoRef1_p2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCargoRef1_p2.setForeground(new java.awt.Color(51, 51, 51));
        lblCargoRef1_p2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCargoRef1_p2.setText("Cargo del Referente");

        lblEmpresaRef1_p2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblEmpresaRef1_p2.setForeground(new java.awt.Color(51, 51, 51));
        lblEmpresaRef1_p2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEmpresaRef1_p2.setText("Empresa del Referente");

        lblTelefonoRef1_p2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTelefonoRef1_p2.setForeground(new java.awt.Color(51, 51, 51));
        lblTelefonoRef1_p2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTelefonoRef1_p2.setText("Telefono del Referente");

        lblCorreoRef1_p2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCorreoRef1_p2.setForeground(new java.awt.Color(51, 51, 51));
        lblCorreoRef1_p2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCorreoRef1_p2.setText("Correo del Referente");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblNombreRef1_p2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCargoRef1_p2, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCorreoRef1_p2, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTelefonoRef1_p2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblEmpresaRef1_p2, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(lblNombreRef1_p2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCargoRef1_p2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmpresaRef1_p2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCorreoRef1_p2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefonoRef1_p2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 13, Short.MAX_VALUE))
        );

        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblNombreRef2_p2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblNombreRef2_p2.setForeground(new java.awt.Color(51, 51, 51));
        lblNombreRef2_p2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreRef2_p2.setText("Nombre del Referente");

        lblCargoRef2_p2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCargoRef2_p2.setForeground(new java.awt.Color(51, 51, 51));
        lblCargoRef2_p2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCargoRef2_p2.setText("Cargo del Referente");

        lblEmpresaRef2_p2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblEmpresaRef2_p2.setForeground(new java.awt.Color(51, 51, 51));
        lblEmpresaRef2_p2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEmpresaRef2_p2.setText("Empresa del Referente");

        lblTelefonoRef2_p2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTelefonoRef2_p2.setForeground(new java.awt.Color(51, 51, 51));
        lblTelefonoRef2_p2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTelefonoRef2_p2.setText("Telefono del Referente");

        lblCorreoRef2_p2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCorreoRef2_p2.setForeground(new java.awt.Color(51, 51, 51));
        lblCorreoRef2_p2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCorreoRef2_p2.setText("Correo del Referente");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblNombreRef2_p2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCargoRef2_p2, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCorreoRef2_p2, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTelefonoRef2_p2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblEmpresaRef2_p2, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(lblNombreRef2_p2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCargoRef2_p2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmpresaRef2_p2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCorreoRef2_p2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefonoRef2_p2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 13, Short.MAX_VALUE))
        );

        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblNombreRef3_p2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblNombreRef3_p2.setForeground(new java.awt.Color(51, 51, 51));
        lblNombreRef3_p2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreRef3_p2.setText("Nombre del Referente");

        lblCargoRef3_p2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCargoRef3_p2.setForeground(new java.awt.Color(51, 51, 51));
        lblCargoRef3_p2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCargoRef3_p2.setText("Cargo del Referente");

        lblEmpresaRef3_p2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblEmpresaRef3_p2.setForeground(new java.awt.Color(51, 51, 51));
        lblEmpresaRef3_p2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEmpresaRef3_p2.setText("Empresa del Referente");

        lblTelefonoRef6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTelefonoRef6.setForeground(new java.awt.Color(51, 51, 51));
        lblTelefonoRef6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTelefonoRef6.setText("Telefono del Referente");

        lblCorreoRef3_p2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCorreoRef3_p2.setForeground(new java.awt.Color(51, 51, 51));
        lblCorreoRef3_p2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCorreoRef3_p2.setText("Correo del Referente");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblNombreRef3_p2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCargoRef3_p2, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCorreoRef3_p2, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTelefonoRef6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblEmpresaRef3_p2, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addComponent(lblNombreRef3_p2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCargoRef3_p2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmpresaRef3_p2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCorreoRef3_p2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefonoRef6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jp_Referencias_p2Layout = new javax.swing.GroupLayout(jp_Referencias_p2);
        jp_Referencias_p2.setLayout(jp_Referencias_p2Layout);
        jp_Referencias_p2Layout.setHorizontalGroup(
            jp_Referencias_p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jp_Referencias_p2Layout.setVerticalGroup(
            jp_Referencias_p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Referencias_p2Layout.createSequentialGroup()
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jp_Cabecera, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel28)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel29)
                            .addComponent(jp_Experiencias_p2, javax.swing.GroupLayout.PREFERRED_SIZE, 984, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator5)
                            .addComponent(jLabel30)
                            .addComponent(jSeparator6)
                            .addComponent(jp_Referencias_p2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jp_Estudios_p2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jp_Ixquierda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jp_Cabecera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jp_Estudios_p2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jp_Experiencias_p2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jp_Referencias_p2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jp_Ixquierda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(499, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jp_Perfil2Layout = new javax.swing.GroupLayout(jp_Perfil2);
        jp_Perfil2.setLayout(jp_Perfil2Layout);
        jp_Perfil2Layout.setHorizontalGroup(
            jp_Perfil2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Perfil2Layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 201, Short.MAX_VALUE))
        );
        jp_Perfil2Layout.setVerticalGroup(
            jp_Perfil2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jp_Est7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblInstitucion7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblInstitucion7.setForeground(new java.awt.Color(51, 51, 51));
        lblInstitucion7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInstitucion7.setText("institucion");

        lblAño7.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblAño7.setForeground(new java.awt.Color(51, 51, 51));
        lblAño7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAño7.setText("año");

        lblCiudad7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCiudad7.setForeground(new java.awt.Color(51, 51, 51));
        lblCiudad7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCiudad7.setText("ciudad");

        lblTitulo7.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblTitulo7.setForeground(new java.awt.Color(51, 51, 51));
        lblTitulo7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo7.setText("titulo");

        javax.swing.GroupLayout jp_Est7Layout = new javax.swing.GroupLayout(jp_Est7);
        jp_Est7.setLayout(jp_Est7Layout);
        jp_Est7Layout.setHorizontalGroup(
            jp_Est7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Est7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_Est7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAño7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCiudad7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp_Est7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblInstitucion7, javax.swing.GroupLayout.DEFAULT_SIZE, 777, Short.MAX_VALUE)
                    .addComponent(lblTitulo7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        jp_Est7Layout.setVerticalGroup(
            jp_Est7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_Est7Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jp_Est7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAño7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitulo7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_Est7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCiudad7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInstitucion7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jp_Est20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblInstitucion8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblInstitucion8.setForeground(new java.awt.Color(51, 51, 51));
        lblInstitucion8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInstitucion8.setText("institucion");

        lblAño8.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblAño8.setForeground(new java.awt.Color(51, 51, 51));
        lblAño8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAño8.setText("año");

        lblCiudad8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCiudad8.setForeground(new java.awt.Color(51, 51, 51));
        lblCiudad8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCiudad8.setText("ciudad");

        lblTitulo8.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblTitulo8.setForeground(new java.awt.Color(51, 51, 51));
        lblTitulo8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo8.setText("titulo");

        javax.swing.GroupLayout jp_Est20Layout = new javax.swing.GroupLayout(jp_Est20);
        jp_Est20.setLayout(jp_Est20Layout);
        jp_Est20Layout.setHorizontalGroup(
            jp_Est20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Est20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_Est20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCiudad8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAño8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp_Est20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTitulo8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblInstitucion8, javax.swing.GroupLayout.DEFAULT_SIZE, 777, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        jp_Est20Layout.setVerticalGroup(
            jp_Est20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Est20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_Est20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAño8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitulo8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_Est20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCiudad8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInstitucion8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jp_Est21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblInstitucion9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblInstitucion9.setForeground(new java.awt.Color(51, 51, 51));
        lblInstitucion9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInstitucion9.setText("institucion");

        lblAño9.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblAño9.setForeground(new java.awt.Color(51, 51, 51));
        lblAño9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAño9.setText("año");

        lblCiudad9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCiudad9.setForeground(new java.awt.Color(51, 51, 51));
        lblCiudad9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCiudad9.setText("ciudad");

        lblTitulo9.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblTitulo9.setForeground(new java.awt.Color(51, 51, 51));
        lblTitulo9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo9.setText("titulo");

        javax.swing.GroupLayout jp_Est21Layout = new javax.swing.GroupLayout(jp_Est21);
        jp_Est21.setLayout(jp_Est21Layout);
        jp_Est21Layout.setHorizontalGroup(
            jp_Est21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Est21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_Est21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCiudad9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAño9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp_Est21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTitulo9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblInstitucion9, javax.swing.GroupLayout.DEFAULT_SIZE, 777, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        jp_Est21Layout.setVerticalGroup(
            jp_Est21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Est21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_Est21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAño9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitulo9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_Est21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCiudad9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInstitucion9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jp_Est22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblInstitucion10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblInstitucion10.setForeground(new java.awt.Color(51, 51, 51));
        lblInstitucion10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInstitucion10.setText("institucion");

        lblAño10.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblAño10.setForeground(new java.awt.Color(51, 51, 51));
        lblAño10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAño10.setText("año");

        lblCiudad10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCiudad10.setForeground(new java.awt.Color(51, 51, 51));
        lblCiudad10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCiudad10.setText("ciudad");

        lblTitulo10.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblTitulo10.setForeground(new java.awt.Color(51, 51, 51));
        lblTitulo10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo10.setText("titulo");

        javax.swing.GroupLayout jp_Est22Layout = new javax.swing.GroupLayout(jp_Est22);
        jp_Est22.setLayout(jp_Est22Layout);
        jp_Est22Layout.setHorizontalGroup(
            jp_Est22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Est22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_Est22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCiudad10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAño10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp_Est22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTitulo10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblInstitucion10, javax.swing.GroupLayout.DEFAULT_SIZE, 777, Short.MAX_VALUE))
                .addContainerGap())
        );
        jp_Est22Layout.setVerticalGroup(
            jp_Est22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Est22Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jp_Est22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAño10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitulo10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_Est22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCiudad10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInstitucion10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jp_Est23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblInstitucion11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblInstitucion11.setForeground(new java.awt.Color(51, 51, 51));
        lblInstitucion11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInstitucion11.setText("institucion");

        lblAño11.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblAño11.setForeground(new java.awt.Color(51, 51, 51));
        lblAño11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAño11.setText("año");

        lblCiudad11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCiudad11.setForeground(new java.awt.Color(51, 51, 51));
        lblCiudad11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCiudad11.setText("ciudad");

        lblTitulo11.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblTitulo11.setForeground(new java.awt.Color(51, 51, 51));
        lblTitulo11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo11.setText("titulo");

        javax.swing.GroupLayout jp_Est23Layout = new javax.swing.GroupLayout(jp_Est23);
        jp_Est23.setLayout(jp_Est23Layout);
        jp_Est23Layout.setHorizontalGroup(
            jp_Est23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Est23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_Est23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAño11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCiudad11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp_Est23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTitulo11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblInstitucion11, javax.swing.GroupLayout.DEFAULT_SIZE, 777, Short.MAX_VALUE))
                .addContainerGap())
        );
        jp_Est23Layout.setVerticalGroup(
            jp_Est23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Est23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_Est23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAño11, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitulo11, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_Est23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCiudad11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInstitucion11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jp_Est24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblInstitucion12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblInstitucion12.setForeground(new java.awt.Color(51, 51, 51));
        lblInstitucion12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInstitucion12.setText("institucion");

        lblAño12.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblAño12.setForeground(new java.awt.Color(51, 51, 51));
        lblAño12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAño12.setText("año");

        lblCiudad12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCiudad12.setForeground(new java.awt.Color(51, 51, 51));
        lblCiudad12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCiudad12.setText("ciudad");

        lblTitulo12.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblTitulo12.setForeground(new java.awt.Color(51, 51, 51));
        lblTitulo12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo12.setText("titulo");

        javax.swing.GroupLayout jp_Est24Layout = new javax.swing.GroupLayout(jp_Est24);
        jp_Est24.setLayout(jp_Est24Layout);
        jp_Est24Layout.setHorizontalGroup(
            jp_Est24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Est24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_Est24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCiudad12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAño12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp_Est24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTitulo12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblInstitucion12, javax.swing.GroupLayout.DEFAULT_SIZE, 777, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        jp_Est24Layout.setVerticalGroup(
            jp_Est24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Est24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_Est24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAño12, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitulo12, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_Est24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCiudad12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInstitucion12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jp_Estudios_p3Layout = new javax.swing.GroupLayout(jp_Estudios_p3);
        jp_Estudios_p3.setLayout(jp_Estudios_p3Layout);
        jp_Estudios_p3Layout.setHorizontalGroup(
            jp_Estudios_p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_Est7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jp_Est20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jp_Est21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jp_Est24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jp_Est23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jp_Est22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jp_Estudios_p3Layout.setVerticalGroup(
            jp_Estudios_p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Estudios_p3Layout.createSequentialGroup()
                .addComponent(jp_Est7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_Est20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_Est21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_Est22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_Est23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_Est24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSeparator11.setBackground(new java.awt.Color(0, 0, 102));
        jSeparator11.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator11.setPreferredSize(new java.awt.Dimension(4, 2));

        jSeparator12.setBackground(new java.awt.Color(0, 0, 102));
        jSeparator12.setForeground(new java.awt.Color(0, 0, 0));

        jp_Exp17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblCargo1_p3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblCargo1_p3.setForeground(new java.awt.Color(51, 51, 51));
        lblCargo1_p3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCargo1_p3.setText("cargo desempeñado");

        lblInstitucionExp1_p3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblInstitucionExp1_p3.setForeground(new java.awt.Color(51, 51, 51));
        lblInstitucionExp1_p3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInstitucionExp1_p3.setText("institucion");

        descripcionExp1_p3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        descripcionExp1_p3.setForeground(new java.awt.Color(51, 51, 51));
        descripcionExp1_p3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        descripcionExp1_p3.setText("descripcion");

        añoExp1_p3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        añoExp1_p3.setForeground(new java.awt.Color(51, 51, 51));
        añoExp1_p3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        añoExp1_p3.setText("año");

        javax.swing.GroupLayout jp_Exp17Layout = new javax.swing.GroupLayout(jp_Exp17);
        jp_Exp17.setLayout(jp_Exp17Layout);
        jp_Exp17Layout.setHorizontalGroup(
            jp_Exp17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Exp17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_Exp17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descripcionExp1_p3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCargo1_p3, javax.swing.GroupLayout.DEFAULT_SIZE, 1078, Short.MAX_VALUE)
                    .addGroup(jp_Exp17Layout.createSequentialGroup()
                        .addComponent(lblInstitucionExp1_p3, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(añoExp1_p3, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jp_Exp17Layout.setVerticalGroup(
            jp_Exp17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Exp17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCargo1_p3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_Exp17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInstitucionExp1_p3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(añoExp1_p3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(descripcionExp1_p3, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addContainerGap())
        );

        jp_Exp18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblCargo2_p3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblCargo2_p3.setForeground(new java.awt.Color(51, 51, 51));
        lblCargo2_p3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCargo2_p3.setText("cargo desempeñado");

        lblInstitucionExp2_p3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblInstitucionExp2_p3.setForeground(new java.awt.Color(51, 51, 51));
        lblInstitucionExp2_p3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInstitucionExp2_p3.setText("institucion");

        descripcionExp2_p3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        descripcionExp2_p3.setForeground(new java.awt.Color(51, 51, 51));
        descripcionExp2_p3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        descripcionExp2_p3.setText("descripcion");

        añoExp2_p3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        añoExp2_p3.setForeground(new java.awt.Color(51, 51, 51));
        añoExp2_p3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        añoExp2_p3.setText("año");

        javax.swing.GroupLayout jp_Exp18Layout = new javax.swing.GroupLayout(jp_Exp18);
        jp_Exp18.setLayout(jp_Exp18Layout);
        jp_Exp18Layout.setHorizontalGroup(
            jp_Exp18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Exp18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_Exp18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descripcionExp2_p3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCargo2_p3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jp_Exp18Layout.createSequentialGroup()
                        .addComponent(lblInstitucionExp2_p3, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(añoExp2_p3, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jp_Exp18Layout.setVerticalGroup(
            jp_Exp18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Exp18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCargo2_p3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_Exp18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInstitucionExp2_p3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(añoExp2_p3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(descripcionExp2_p3, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addContainerGap())
        );

        jp_Exp19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblCargo3_p3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblCargo3_p3.setForeground(new java.awt.Color(51, 51, 51));
        lblCargo3_p3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCargo3_p3.setText("cargo desempeñado");

        lblInstitucionExp3_p3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblInstitucionExp3_p3.setForeground(new java.awt.Color(51, 51, 51));
        lblInstitucionExp3_p3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInstitucionExp3_p3.setText("institucion");

        descripcionExp3_p3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        descripcionExp3_p3.setForeground(new java.awt.Color(51, 51, 51));
        descripcionExp3_p3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        descripcionExp3_p3.setText("descripcion");

        añoExp3_p3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        añoExp3_p3.setForeground(new java.awt.Color(51, 51, 51));
        añoExp3_p3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        añoExp3_p3.setText("año");

        javax.swing.GroupLayout jp_Exp19Layout = new javax.swing.GroupLayout(jp_Exp19);
        jp_Exp19.setLayout(jp_Exp19Layout);
        jp_Exp19Layout.setHorizontalGroup(
            jp_Exp19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Exp19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_Exp19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descripcionExp3_p3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCargo3_p3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jp_Exp19Layout.createSequentialGroup()
                        .addComponent(lblInstitucionExp3_p3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(añoExp3_p3, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jp_Exp19Layout.setVerticalGroup(
            jp_Exp19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Exp19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCargo3_p3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_Exp19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInstitucionExp3_p3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(añoExp3_p3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(descripcionExp3_p3, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addContainerGap())
        );

        jp_Exp20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblCargo4_p3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblCargo4_p3.setForeground(new java.awt.Color(51, 51, 51));
        lblCargo4_p3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCargo4_p3.setText("cargo desempeñado");

        lblInstitucionExp4_p3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblInstitucionExp4_p3.setForeground(new java.awt.Color(51, 51, 51));
        lblInstitucionExp4_p3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInstitucionExp4_p3.setText("institucion");

        descripcionExp4_p3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        descripcionExp4_p3.setForeground(new java.awt.Color(51, 51, 51));
        descripcionExp4_p3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        descripcionExp4_p3.setText("descripcion");

        añoExp4_p3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        añoExp4_p3.setForeground(new java.awt.Color(51, 51, 51));
        añoExp4_p3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        añoExp4_p3.setText("año");

        javax.swing.GroupLayout jp_Exp20Layout = new javax.swing.GroupLayout(jp_Exp20);
        jp_Exp20.setLayout(jp_Exp20Layout);
        jp_Exp20Layout.setHorizontalGroup(
            jp_Exp20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Exp20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_Exp20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descripcionExp4_p3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCargo4_p3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jp_Exp20Layout.createSequentialGroup()
                        .addComponent(lblInstitucionExp4_p3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(añoExp4_p3, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jp_Exp20Layout.setVerticalGroup(
            jp_Exp20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Exp20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCargo4_p3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_Exp20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInstitucionExp4_p3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(añoExp4_p3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(descripcionExp4_p3, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addContainerGap())
        );

        jp_Exp21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblCargo5_p3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblCargo5_p3.setForeground(new java.awt.Color(51, 51, 51));
        lblCargo5_p3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCargo5_p3.setText("cargo desempeñado");

        lblInstitucionExp5_p3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblInstitucionExp5_p3.setForeground(new java.awt.Color(51, 51, 51));
        lblInstitucionExp5_p3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInstitucionExp5_p3.setText("institucion");

        descripcionExp5_p3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        descripcionExp5_p3.setForeground(new java.awt.Color(51, 51, 51));
        descripcionExp5_p3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        descripcionExp5_p3.setText("descripcion");

        añoExp5_p3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        añoExp5_p3.setForeground(new java.awt.Color(51, 51, 51));
        añoExp5_p3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        añoExp5_p3.setText("año");

        javax.swing.GroupLayout jp_Exp21Layout = new javax.swing.GroupLayout(jp_Exp21);
        jp_Exp21.setLayout(jp_Exp21Layout);
        jp_Exp21Layout.setHorizontalGroup(
            jp_Exp21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Exp21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_Exp21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descripcionExp5_p3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCargo5_p3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jp_Exp21Layout.createSequentialGroup()
                        .addComponent(lblInstitucionExp5_p3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(añoExp5_p3, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jp_Exp21Layout.setVerticalGroup(
            jp_Exp21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Exp21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCargo5_p3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_Exp21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInstitucionExp5_p3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(añoExp5_p3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(descripcionExp5_p3, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jp_Experiencias_p3Layout = new javax.swing.GroupLayout(jp_Experiencias_p3);
        jp_Experiencias_p3.setLayout(jp_Experiencias_p3Layout);
        jp_Experiencias_p3Layout.setHorizontalGroup(
            jp_Experiencias_p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_Exp17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jp_Exp18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jp_Exp19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jp_Exp20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jp_Exp21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jp_Experiencias_p3Layout.setVerticalGroup(
            jp_Experiencias_p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Experiencias_p3Layout.createSequentialGroup()
                .addComponent(jp_Exp17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_Exp18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_Exp19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_Exp20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_Exp21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel25.setOpaque(true);
        jLabel35.setBackground(new java.awt.Color(255, 255, 255));
        jLabel35.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(0, 0, 102));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel35.setText("Formación Académica.");

        jLabel25.setOpaque(true);
        jLabel36.setBackground(new java.awt.Color(255, 255, 255));
        jLabel36.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(0, 0, 102));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel36.setText("Experiencia Laboral.");

        jLabel25.setOpaque(true);
        jLabel37.setBackground(new java.awt.Color(255, 255, 255));
        jLabel37.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(0, 0, 102));
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel37.setText("Referencias.");

        jSeparator13.setBackground(new java.awt.Color(0, 0, 102));
        jSeparator13.setForeground(new java.awt.Color(0, 0, 0));

        jPanel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblNombreRef1_p3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblNombreRef1_p3.setForeground(new java.awt.Color(51, 51, 51));
        lblNombreRef1_p3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreRef1_p3.setText("Nombre del Referente");

        lblCargoRef1_p3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCargoRef1_p3.setForeground(new java.awt.Color(51, 51, 51));
        lblCargoRef1_p3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCargoRef1_p3.setText("Cargo del Referente");

        lblEmpresaRef1_p3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblEmpresaRef1_p3.setForeground(new java.awt.Color(51, 51, 51));
        lblEmpresaRef1_p3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEmpresaRef1_p3.setText("Empresa del Referente");

        lblTelefonoRef1_p3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTelefonoRef1_p3.setForeground(new java.awt.Color(51, 51, 51));
        lblTelefonoRef1_p3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTelefonoRef1_p3.setText("Telefono del Referente");

        lblCorreoRef1_p3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCorreoRef1_p3.setForeground(new java.awt.Color(51, 51, 51));
        lblCorreoRef1_p3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCorreoRef1_p3.setText("Correo del Referente");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblNombreRef1_p3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCargoRef1_p3, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCorreoRef1_p3, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTelefonoRef1_p3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblEmpresaRef1_p3, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addComponent(lblNombreRef1_p3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCargoRef1_p3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmpresaRef1_p3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCorreoRef1_p3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefonoRef1_p3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 13, Short.MAX_VALUE))
        );

        jPanel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblNombreRef2_p3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblNombreRef2_p3.setForeground(new java.awt.Color(51, 51, 51));
        lblNombreRef2_p3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreRef2_p3.setText("Nombre del Referente");

        lblCargoRef2_p3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCargoRef2_p3.setForeground(new java.awt.Color(51, 51, 51));
        lblCargoRef2_p3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCargoRef2_p3.setText("Cargo del Referente");

        lblEmpresaRef2_p3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblEmpresaRef2_p3.setForeground(new java.awt.Color(51, 51, 51));
        lblEmpresaRef2_p3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEmpresaRef2_p3.setText("Empresa del Referente");

        lblTelefonoRef2_p3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTelefonoRef2_p3.setForeground(new java.awt.Color(51, 51, 51));
        lblTelefonoRef2_p3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTelefonoRef2_p3.setText("Telefono del Referente");

        lblCorreoRef2_p3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCorreoRef2_p3.setForeground(new java.awt.Color(51, 51, 51));
        lblCorreoRef2_p3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCorreoRef2_p3.setText("Correo del Referente");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblNombreRef2_p3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCargoRef2_p3, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCorreoRef2_p3, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTelefonoRef2_p3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblEmpresaRef2_p3, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addComponent(lblNombreRef2_p3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCargoRef2_p3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmpresaRef2_p3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCorreoRef2_p3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefonoRef2_p3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 13, Short.MAX_VALUE))
        );

        jPanel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblNombreRef3_p3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblNombreRef3_p3.setForeground(new java.awt.Color(51, 51, 51));
        lblNombreRef3_p3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreRef3_p3.setText("Nombre del Referente");

        lblCargoRef3_p3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCargoRef3_p3.setForeground(new java.awt.Color(51, 51, 51));
        lblCargoRef3_p3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCargoRef3_p3.setText("Cargo del Referente");

        lblEmpresaRef3_p3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblEmpresaRef3_p3.setForeground(new java.awt.Color(51, 51, 51));
        lblEmpresaRef3_p3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEmpresaRef3_p3.setText("Empresa del Referente");

        lblTelefonoRef3_p3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTelefonoRef3_p3.setForeground(new java.awt.Color(51, 51, 51));
        lblTelefonoRef3_p3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTelefonoRef3_p3.setText("Telefono del Referente");

        lblCorreoRef3_p3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCorreoRef3_p3.setForeground(new java.awt.Color(51, 51, 51));
        lblCorreoRef3_p3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCorreoRef3_p3.setText("Correo del Referente");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblNombreRef3_p3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCargoRef3_p3, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCorreoRef3_p3, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTelefonoRef3_p3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblEmpresaRef3_p3, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addComponent(lblNombreRef3_p3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCargoRef3_p3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmpresaRef3_p3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCorreoRef3_p3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefonoRef3_p3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jp_Referencias_p3Layout = new javax.swing.GroupLayout(jp_Referencias_p3);
        jp_Referencias_p3.setLayout(jp_Referencias_p3Layout);
        jp_Referencias_p3Layout.setHorizontalGroup(
            jp_Referencias_p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jp_Referencias_p3Layout.setVerticalGroup(
            jp_Referencias_p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Referencias_p3Layout.createSequentialGroup()
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        lblFotoperfil_p3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFotoperfil_p3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/user_64_.png"))); // NOI18N

        lblNombres1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblNombres1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblProfesion1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblProfesion1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jLabel25.setOpaque(true);
        jLabel38.setBackground(new java.awt.Color(255, 255, 255));
        jLabel38.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(0, 0, 102));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel38.setText("Contacto.");

        jSeparator14.setBackground(new java.awt.Color(0, 0, 102));
        jSeparator14.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator14.setPreferredSize(new java.awt.Dimension(4, 2));

        lblTelefono_ip_p3.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lblTelefono_ip_p3.setForeground(new java.awt.Color(51, 51, 51));
        lblTelefono_ip_p3.setText("Teléfono: ");

        lblCelular_ip_p3.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lblCelular_ip_p3.setForeground(new java.awt.Color(51, 51, 51));
        lblCelular_ip_p3.setText("Celular: ");

        lblCorreo_ip_p3.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lblCorreo_ip_p3.setForeground(new java.awt.Color(51, 51, 51));
        lblCorreo_ip_p3.setText("Correo: ");

        lblDireccion_ip_p3.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lblDireccion_ip_p3.setForeground(new java.awt.Color(51, 51, 51));
        lblDireccion_ip_p3.setText("Direccion: ");

        lblEdad_ip_p3.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lblEdad_ip_p3.setForeground(new java.awt.Color(51, 51, 51));
        lblEdad_ip_p3.setText("Edad:");

        lblSexo_ip_p3.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lblSexo_ip_p3.setForeground(new java.awt.Color(51, 51, 51));
        lblSexo_ip_p3.setText("Sexo: ");

        lblTelefono_ip10.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lblTelefono_ip10.setForeground(new java.awt.Color(51, 51, 51));
        lblTelefono_ip10.setText("Mi descripcion: ");

        txtA_Descripcion_ip_p3.setColumns(20);
        txtA_Descripcion_ip_p3.setRows(5);
        jScrollPane2.setViewportView(txtA_Descripcion_ip_p3);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDireccion_ip_p3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblCorreo_ip_p3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCelular_ip_p3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTelefono_ip_p3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(lblEdad_ip_p3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblSexo_ip_p3, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(lblTelefono_ip10)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane2))))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEdad_ip_p3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSexo_ip_p3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefono_ip10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(lblTelefono_ip_p3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblCelular_ip_p3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblCorreo_ip_p3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDireccion_ip_p3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel25.setOpaque(true);
        jLabel39.setBackground(new java.awt.Color(255, 255, 255));
        jLabel39.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(0, 0, 102));
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel39.setText("Habilidades.");

        jSeparator15.setBackground(new java.awt.Color(0, 0, 102));
        jSeparator15.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jp_Habilidades_p3Layout = new javax.swing.GroupLayout(jp_Habilidades_p3);
        jp_Habilidades_p3.setLayout(jp_Habilidades_p3Layout);
        jp_Habilidades_p3Layout.setHorizontalGroup(
            jp_Habilidades_p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jp_Habilidades_p3Layout.setVerticalGroup(
            jp_Habilidades_p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFotoperfil_p3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombres1, javax.swing.GroupLayout.PREFERRED_SIZE, 835, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProfesion1, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel38)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator13)
                            .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jp_Estudios_p3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator15)
                            .addComponent(jp_Habilidades_p3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jp_Experiencias_p3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator12)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel35)
                                    .addComponent(jLabel37)
                                    .addComponent(jLabel39)
                                    .addComponent(jLabel36))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jp_Referencias_p3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(115, 115, 115))))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(lblFotoperfil_p3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblNombres1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblProfesion1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)))
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jp_Estudios_p3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jp_Habilidades_p3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jp_Experiencias_p3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jp_Referencias_p3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
        );

        javax.swing.GroupLayout jp_Perfil3Layout = new javax.swing.GroupLayout(jp_Perfil3);
        jp_Perfil3.setLayout(jp_Perfil3Layout);
        jp_Perfil3Layout.setHorizontalGroup(
            jp_Perfil3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Perfil3Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 168, Short.MAX_VALUE))
        );
        jp_Perfil3Layout.setVerticalGroup(
            jp_Perfil3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jp_AllPerfilesLayout = new javax.swing.GroupLayout(jp_AllPerfiles);
        jp_AllPerfiles.setLayout(jp_AllPerfilesLayout);
        jp_AllPerfilesLayout.setHorizontalGroup(
            jp_AllPerfilesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1508, Short.MAX_VALUE)
            .addGroup(jp_AllPerfilesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jp_AllPerfilesLayout.createSequentialGroup()
                    .addGap(2, 2, 2)
                    .addComponent(jp_Perfil1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(2, 2, 2)))
            .addGroup(jp_AllPerfilesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jp_Perfil2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jp_AllPerfilesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jp_Perfil3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jp_AllPerfilesLayout.setVerticalGroup(
            jp_AllPerfilesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2900, Short.MAX_VALUE)
            .addGroup(jp_AllPerfilesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jp_AllPerfilesLayout.createSequentialGroup()
                    .addGap(2, 2, 2)
                    .addComponent(jp_Perfil1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(2, 2, 2)))
            .addGroup(jp_AllPerfilesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jp_Perfil2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jp_AllPerfilesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jp_Perfil3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        scroll_Perfiles.setViewportView(jp_AllPerfiles);

        javax.swing.GroupLayout jp_PerfilLayout = new javax.swing.GroupLayout(jp_Perfil);
        jp_Perfil.setLayout(jp_PerfilLayout);
        jp_PerfilLayout.setHorizontalGroup(
            jp_PerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scroll_Perfiles, javax.swing.GroupLayout.DEFAULT_SIZE, 1323, Short.MAX_VALUE)
        );
        jp_PerfilLayout.setVerticalGroup(
            jp_PerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scroll_Perfiles)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_Perfil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_Perfil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void Estilo(){
        int estilo = frmVisitante.estilo;
        if(estilo == 1){
            jp_Perfil1.setVisible(true);
            jp_Perfil2.setVisible(false);
            jp_Perfil3.setVisible(false);
        } else if(estilo == 2){
            jp_Perfil1.setVisible(false);
            jp_Perfil2.setVisible(true);
            jp_Perfil3.setVisible(false);
        }else if(estilo == 3){
            jp_Perfil1.setVisible(false);
            jp_Perfil2.setVisible(false);
            jp_Perfil3.setVisible(true);
        }
    }
    
    public void Datos(int id) {
        ConsultasTrabajador cTr = new ConsultasTrabajador();
        cTr.datosTrabajador(id);
    }

    public void Estudio(int id) {
        ConsultasEstudio cEst = new ConsultasEstudio();
        cEst.mostrarEstudios(id);
    }

    public void Experiencia(int id) {
        ConsultasExperiencia cExp = new ConsultasExperiencia();
        cExp.mostrarExperiencias(id);
    }

    public void Referencia(int id) {
        ConsultasReferencia cRef = new ConsultasReferencia();
        cRef.mostrarReferencias(id);
    }

    void Habilidades(int id) {
        ConsultasHabilidades cHab = new ConsultasHabilidades();
        ArrayList<Habilidad> hbld = cHab.mostrarHabilidades(id);
        Iterator i = hbld.iterator();

        while (i.hasNext()) {
            Habilidad h;
            h = (Habilidad) i.next();
            //Creando LJLabels
            String name = "lbl" + indice;
            JLabel lbl = new JLabel();
            lbl.setFont(new java.awt.Font("Dialog", 1, 20));
            lbl.setForeground(new java.awt.Color(255, 255, 255));
            lbl.setName(name);
            lbl.setText("✔ " + h.getHabilidad());
            jpHabilidades_p1.add(lbl);
            lblHabilidades.add(lbl);
            indice++;
            jpHabilidades_p1.updateUI();
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmV_Trabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmV_Trabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmV_Trabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmV_Trabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmV_Trabajador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel añoExp1_p1;
    public static javax.swing.JLabel añoExp1_p2;
    public static javax.swing.JLabel añoExp1_p3;
    public static javax.swing.JLabel añoExp2_p1;
    public static javax.swing.JLabel añoExp2_p2;
    public static javax.swing.JLabel añoExp2_p3;
    public static javax.swing.JLabel añoExp3_p1;
    public static javax.swing.JLabel añoExp3_p2;
    public static javax.swing.JLabel añoExp3_p3;
    public static javax.swing.JLabel añoExp4_p1;
    public static javax.swing.JLabel añoExp4_p2;
    public static javax.swing.JLabel añoExp4_p3;
    public static javax.swing.JLabel añoExp5_p1;
    public static javax.swing.JLabel añoExp5_p2;
    public static javax.swing.JLabel añoExp5_p3;
    public static javax.swing.JLabel descripcionExp1_p1;
    public static javax.swing.JLabel descripcionExp1_p2;
    public static javax.swing.JLabel descripcionExp1_p3;
    public static javax.swing.JLabel descripcionExp2_p1;
    public static javax.swing.JLabel descripcionExp2_p2;
    public static javax.swing.JLabel descripcionExp2_p3;
    public static javax.swing.JLabel descripcionExp3_p1;
    public static javax.swing.JLabel descripcionExp3_p2;
    public static javax.swing.JLabel descripcionExp3_p3;
    public static javax.swing.JLabel descripcionExp4_p1;
    public static javax.swing.JLabel descripcionExp4_p2;
    public static javax.swing.JLabel descripcionExp4_p3;
    public static javax.swing.JLabel descripcionExp5_p1;
    public static javax.swing.JLabel descripcionExp5_p2;
    public static javax.swing.JLabel descripcionExp5_p3;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    public static javax.swing.JPanel jpHabilidades_p1;
    public static javax.swing.JPanel jpHabilidades_p2;
    private javax.swing.JPanel jp_AllPerfiles;
    private javax.swing.JPanel jp_BarraIzquierda_p1;
    private javax.swing.JPanel jp_Cabecera;
    private javax.swing.JPanel jp_Cabecera_p1;
    private javax.swing.JPanel jp_Contenedor_p1;
    private javax.swing.JPanel jp_DatosPersonales_p1;
    private javax.swing.JPanel jp_Est10;
    private javax.swing.JPanel jp_Est11;
    private javax.swing.JPanel jp_Est12;
    private javax.swing.JPanel jp_Est13;
    private javax.swing.JPanel jp_Est1_p1;
    private javax.swing.JPanel jp_Est20;
    private javax.swing.JPanel jp_Est21;
    private javax.swing.JPanel jp_Est22;
    private javax.swing.JPanel jp_Est23;
    private javax.swing.JPanel jp_Est24;
    private javax.swing.JPanel jp_Est2_p1;
    private javax.swing.JPanel jp_Est3_p1;
    private javax.swing.JPanel jp_Est4_p1;
    private javax.swing.JPanel jp_Est5_p1;
    private javax.swing.JPanel jp_Est6_p1;
    private javax.swing.JPanel jp_Est7;
    private javax.swing.JPanel jp_Est8;
    private javax.swing.JPanel jp_Est9;
    private javax.swing.JPanel jp_Estudios_p1;
    private javax.swing.JPanel jp_Estudios_p2;
    private javax.swing.JPanel jp_Estudios_p3;
    private javax.swing.JPanel jp_Exp10;
    private javax.swing.JPanel jp_Exp17;
    private javax.swing.JPanel jp_Exp18;
    private javax.swing.JPanel jp_Exp19;
    private javax.swing.JPanel jp_Exp1_p1;
    private javax.swing.JPanel jp_Exp20;
    private javax.swing.JPanel jp_Exp21;
    private javax.swing.JPanel jp_Exp2_p1;
    private javax.swing.JPanel jp_Exp3_p1;
    private javax.swing.JPanel jp_Exp4_p1;
    private javax.swing.JPanel jp_Exp5_p1;
    private javax.swing.JPanel jp_Exp6;
    private javax.swing.JPanel jp_Exp7;
    private javax.swing.JPanel jp_Exp8;
    private javax.swing.JPanel jp_Exp9;
    private javax.swing.JPanel jp_Experiencias_p1;
    private javax.swing.JPanel jp_Experiencias_p2;
    private javax.swing.JPanel jp_Experiencias_p3;
    public static javax.swing.JPanel jp_Habilidades_p3;
    private javax.swing.JPanel jp_Ixquierda;
    private javax.swing.JPanel jp_Perfil;
    private javax.swing.JPanel jp_Perfil1;
    private javax.swing.JPanel jp_Perfil2;
    private javax.swing.JPanel jp_Perfil3;
    private javax.swing.JPanel jp_Referencias_p1;
    private javax.swing.JPanel jp_Referencias_p2;
    private javax.swing.JPanel jp_Referencias_p3;
    public static javax.swing.JLabel lblAño10;
    public static javax.swing.JLabel lblAño11;
    public static javax.swing.JLabel lblAño12;
    public static javax.swing.JLabel lblAño1_p1;
    public static javax.swing.JLabel lblAño1_p2;
    public static javax.swing.JLabel lblAño2_p1;
    public static javax.swing.JLabel lblAño2_p2;
    public static javax.swing.JLabel lblAño3_p1;
    public static javax.swing.JLabel lblAño3_p2;
    public static javax.swing.JLabel lblAño4_p1;
    public static javax.swing.JLabel lblAño4_p2;
    public static javax.swing.JLabel lblAño5_p1;
    public static javax.swing.JLabel lblAño5_p2;
    public static javax.swing.JLabel lblAño6_p1;
    public static javax.swing.JLabel lblAño6_p2;
    public static javax.swing.JLabel lblAño7;
    public static javax.swing.JLabel lblAño8;
    public static javax.swing.JLabel lblAño9;
    public static javax.swing.JLabel lblCargo1_p1;
    public static javax.swing.JLabel lblCargo1_p2;
    public static javax.swing.JLabel lblCargo1_p3;
    public static javax.swing.JLabel lblCargo2_p1;
    public static javax.swing.JLabel lblCargo2_p2;
    public static javax.swing.JLabel lblCargo2_p3;
    public static javax.swing.JLabel lblCargo3_p1;
    public static javax.swing.JLabel lblCargo3_p2;
    public static javax.swing.JLabel lblCargo3_p3;
    public static javax.swing.JLabel lblCargo4_p1;
    public static javax.swing.JLabel lblCargo4_p2;
    public static javax.swing.JLabel lblCargo4_p3;
    public static javax.swing.JLabel lblCargo5_p1;
    public static javax.swing.JLabel lblCargo5_p2;
    public static javax.swing.JLabel lblCargo5_p3;
    public static javax.swing.JLabel lblCargoRef1_p1;
    public static javax.swing.JLabel lblCargoRef1_p2;
    public static javax.swing.JLabel lblCargoRef1_p3;
    public static javax.swing.JLabel lblCargoRef2_p1;
    public static javax.swing.JLabel lblCargoRef2_p2;
    public static javax.swing.JLabel lblCargoRef2_p3;
    public static javax.swing.JLabel lblCargoRef3_p1;
    public static javax.swing.JLabel lblCargoRef3_p2;
    public static javax.swing.JLabel lblCargoRef3_p3;
    public static javax.swing.JLabel lblCelular_ip_p2;
    public static javax.swing.JLabel lblCelular_ip_p3;
    public static javax.swing.JLabel lblCiudad10;
    public static javax.swing.JLabel lblCiudad11;
    public static javax.swing.JLabel lblCiudad12;
    public static javax.swing.JLabel lblCiudad1_p1;
    public static javax.swing.JLabel lblCiudad1_p2;
    public static javax.swing.JLabel lblCiudad1_p6;
    public static javax.swing.JLabel lblCiudad1_p7;
    public static javax.swing.JLabel lblCiudad1_p8;
    public static javax.swing.JLabel lblCiudad1_p9;
    public static javax.swing.JLabel lblCiudad2_p1;
    public static javax.swing.JLabel lblCiudad2_p2;
    public static javax.swing.JLabel lblCiudad3_p1;
    public static javax.swing.JLabel lblCiudad3_p2;
    public static javax.swing.JLabel lblCiudad4_p1;
    public static javax.swing.JLabel lblCiudad4_p2;
    public static javax.swing.JLabel lblCiudad5_p1;
    public static javax.swing.JLabel lblCiudad5_p2;
    public static javax.swing.JLabel lblCiudad6_p1;
    public static javax.swing.JLabel lblCiudad6_p2;
    public static javax.swing.JLabel lblCiudad7;
    public static javax.swing.JLabel lblCiudad8;
    public static javax.swing.JLabel lblCiudad9;
    public static javax.swing.JLabel lblCorreoRef1_p1;
    public static javax.swing.JLabel lblCorreoRef1_p2;
    public static javax.swing.JLabel lblCorreoRef1_p3;
    public static javax.swing.JLabel lblCorreoRef2_p1;
    public static javax.swing.JLabel lblCorreoRef2_p2;
    public static javax.swing.JLabel lblCorreoRef2_p3;
    public static javax.swing.JLabel lblCorreoRef3_p1;
    public static javax.swing.JLabel lblCorreoRef3_p2;
    public static javax.swing.JLabel lblCorreoRef3_p3;
    public static javax.swing.JLabel lblCorreo_ip_p2;
    public static javax.swing.JLabel lblCorreo_ip_p3;
    public static javax.swing.JLabel lblDescripcion_p1;
    public static javax.swing.JLabel lblDireccion_ip_p3;
    public static javax.swing.JLabel lblEdad_ip_p1;
    public static javax.swing.JLabel lblEdad_ip_p3;
    public static javax.swing.JLabel lblEmpresaRef1_p1;
    public static javax.swing.JLabel lblEmpresaRef1_p2;
    public static javax.swing.JLabel lblEmpresaRef1_p3;
    public static javax.swing.JLabel lblEmpresaRef2_p1;
    public static javax.swing.JLabel lblEmpresaRef2_p2;
    public static javax.swing.JLabel lblEmpresaRef2_p3;
    public static javax.swing.JLabel lblEmpresaRef3_p1;
    public static javax.swing.JLabel lblEmpresaRef3_p2;
    public static javax.swing.JLabel lblEmpresaRef3_p3;
    public static javax.swing.JLabel lblFotoperfil_p1;
    public static javax.swing.JLabel lblFotoperfil_p2;
    public static javax.swing.JLabel lblFotoperfil_p3;
    public static javax.swing.JLabel lblId;
    public static javax.swing.JLabel lblInstitucion10;
    public static javax.swing.JLabel lblInstitucion11;
    public static javax.swing.JLabel lblInstitucion12;
    public static javax.swing.JLabel lblInstitucion1_p1;
    public static javax.swing.JLabel lblInstitucion1_p2;
    public static javax.swing.JLabel lblInstitucion2_p1;
    public static javax.swing.JLabel lblInstitucion2_p2;
    public static javax.swing.JLabel lblInstitucion3_p1;
    public static javax.swing.JLabel lblInstitucion3_p2;
    public static javax.swing.JLabel lblInstitucion4_p1;
    public static javax.swing.JLabel lblInstitucion4_p2;
    public static javax.swing.JLabel lblInstitucion5_p1;
    public static javax.swing.JLabel lblInstitucion5_p2;
    public static javax.swing.JLabel lblInstitucion6_p1;
    public static javax.swing.JLabel lblInstitucion6_p2;
    public static javax.swing.JLabel lblInstitucion7;
    public static javax.swing.JLabel lblInstitucion8;
    public static javax.swing.JLabel lblInstitucion9;
    public static javax.swing.JLabel lblInstitucionExp1_p1;
    public static javax.swing.JLabel lblInstitucionExp1_p2;
    public static javax.swing.JLabel lblInstitucionExp1_p3;
    public static javax.swing.JLabel lblInstitucionExp2_p1;
    public static javax.swing.JLabel lblInstitucionExp2_p2;
    public static javax.swing.JLabel lblInstitucionExp2_p3;
    public static javax.swing.JLabel lblInstitucionExp3_p1;
    public static javax.swing.JLabel lblInstitucionExp3_p2;
    public static javax.swing.JLabel lblInstitucionExp3_p3;
    public static javax.swing.JLabel lblInstitucionExp4_p1;
    public static javax.swing.JLabel lblInstitucionExp4_p2;
    public static javax.swing.JLabel lblInstitucionExp4_p3;
    public static javax.swing.JLabel lblInstitucionExp5_p1;
    public static javax.swing.JLabel lblInstitucionExp5_p2;
    public static javax.swing.JLabel lblInstitucionExp5_p3;
    public static javax.swing.JLabel lblNombreRef1_p1;
    public static javax.swing.JLabel lblNombreRef1_p2;
    public static javax.swing.JLabel lblNombreRef1_p3;
    public static javax.swing.JLabel lblNombreRef2_p1;
    public static javax.swing.JLabel lblNombreRef2_p2;
    public static javax.swing.JLabel lblNombreRef2_p3;
    public static javax.swing.JLabel lblNombreRef3_p1;
    public static javax.swing.JLabel lblNombreRef3_p2;
    public static javax.swing.JLabel lblNombreRef3_p3;
    public static javax.swing.JLabel lblNombres1;
    public static javax.swing.JLabel lblNombres2;
    public static javax.swing.JLabel lblNombres_p1;
    public static javax.swing.JLabel lblProfesion1;
    public static javax.swing.JLabel lblProfesion2;
    public static javax.swing.JLabel lblProfesion_p1;
    public static javax.swing.JLabel lblSexo_ip_p1;
    public static javax.swing.JLabel lblSexo_ip_p3;
    public static javax.swing.JLabel lblTelefonoRef1_p1;
    public static javax.swing.JLabel lblTelefonoRef1_p2;
    public static javax.swing.JLabel lblTelefonoRef1_p3;
    public static javax.swing.JLabel lblTelefonoRef2_p1;
    public static javax.swing.JLabel lblTelefonoRef2_p2;
    public static javax.swing.JLabel lblTelefonoRef2_p3;
    public static javax.swing.JLabel lblTelefonoRef3_p1;
    public static javax.swing.JLabel lblTelefonoRef3_p3;
    public static javax.swing.JLabel lblTelefonoRef6;
    public static javax.swing.JLabel lblTelefono_ip;
    public static javax.swing.JLabel lblTelefono_ip1;
    public static javax.swing.JLabel lblTelefono_ip10;
    public static javax.swing.JLabel lblTelefono_ip2;
    public static javax.swing.JLabel lblTelefono_ip3;
    public static javax.swing.JLabel lblTelefono_ip_p2;
    public static javax.swing.JLabel lblTelefono_ip_p3;
    public static javax.swing.JLabel lblTitulo10;
    public static javax.swing.JLabel lblTitulo11;
    public static javax.swing.JLabel lblTitulo12;
    public static javax.swing.JLabel lblTitulo1_p1;
    public static javax.swing.JLabel lblTitulo1_p2;
    public static javax.swing.JLabel lblTitulo2_p1;
    public static javax.swing.JLabel lblTitulo2_p2;
    public static javax.swing.JLabel lblTitulo3_p1;
    public static javax.swing.JLabel lblTitulo3_p2;
    public static javax.swing.JLabel lblTitulo4_p1;
    public static javax.swing.JLabel lblTitulo4_p2;
    public static javax.swing.JLabel lblTitulo5_p1;
    public static javax.swing.JLabel lblTitulo5_p2;
    public static javax.swing.JLabel lblTitulo6_p1;
    public static javax.swing.JLabel lblTitulo6_p2;
    public static javax.swing.JLabel lblTitulo7;
    public static javax.swing.JLabel lblTitulo8;
    public static javax.swing.JLabel lblTitulo9;
    private javax.swing.JScrollPane scroll_Perfiles;
    public static javax.swing.JTextArea txtA_Descripcion_ip_p2;
    public static javax.swing.JTextArea txtA_Descripcion_ip_p3;
    private javax.swing.JTextArea txtA_Direccion_ip_p1;
    public static javax.swing.JTextArea txtA_Direccion_ip_p2;
    public static javax.swing.JTextArea txtA_descripcion_p1;
    public static javax.swing.JTextField txtCelular_ip_p1;
    public static javax.swing.JTextField txtCorreo_ip_p1;
    public static javax.swing.JTextField txtEdad_ip_p2;
    public static javax.swing.JTextField txtSexo_ip_p2;
    public static javax.swing.JTextField txtTelefono_ip_p1;
    // End of variables declaration//GEN-END:variables
}
