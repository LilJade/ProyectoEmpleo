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

public class frmP_Trabajador extends javax.swing.JFrame {

    frmVisitante frmV;
    int indice = 0;
    private List<JLabel> lblHabilidades = new ArrayList<>();

    public frmP_Trabajador() {
        initComponents();
        this.lblId.setText(String.valueOf(frmVisitante.id));
        this.jp_Perfil1.setVisible(false);
        this.jp_Perfil2.setVisible(false);
        this.jp_Perfil3.setVisible(false);
        Estilo();
        Datos(frmVisitante.id);
        Estudio(frmVisitante.id);
        Experiencia(frmVisitante.id);
        Referencia(frmVisitante.id);
        Habilidades(frmVisitante.id);

        this.setBounds(0, 0, 1350, 900);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        scrollTxtA.setOpaque(false);
        scrollTxtA.getViewport().setOpaque(false);
        scrollTxtA.setBorder(null);
        scrollTxtA.setViewportBorder(null);

        jtxta_Descripcion.setBorder(null);
        jtxta_Descripcion.setBackground(new Color(0, 0, 0, 1));

        btnMiPerfil.setSelected(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jp_Titulos = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnMiPerfil = new javax.swing.JButton();
        btnBusqueda = new javax.swing.JButton();
        btnNotificaciones = new javax.swing.JButton();
        jp_Perfil = new javax.swing.JPanel();
        scroll1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jps_Perfil = new diu.swe.habib.JPanelSlider.JPanelSlider();
        jp_Perfiles = new javax.swing.JPanel();
        jp_Perfil1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblProfesion = new javax.swing.JLabel();
        lblNombres = new javax.swing.JLabel();
        jp_BarraIzquierda = new javax.swing.JPanel();
        lblFotoperfil = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        scrollTxtA = new javax.swing.JScrollPane();
        jtxta_Descripcion = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jp_Habilidades = new javax.swing.JPanel();
        btnConfigExps2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        jp_Estudios = new javax.swing.JPanel();
        jp_Est1 = new javax.swing.JPanel();
        lblInstitucion1 = new javax.swing.JLabel();
        lblAño1 = new javax.swing.JLabel();
        lblCiudad1 = new javax.swing.JLabel();
        lblTitulo1 = new javax.swing.JLabel();
        jp_Est2 = new javax.swing.JPanel();
        lblInstitucion2 = new javax.swing.JLabel();
        lblAño2 = new javax.swing.JLabel();
        lblCiudad2 = new javax.swing.JLabel();
        lblTitulo2 = new javax.swing.JLabel();
        jp_Est3 = new javax.swing.JPanel();
        lblInstitucion3 = new javax.swing.JLabel();
        lblAño3 = new javax.swing.JLabel();
        lblCiudad3 = new javax.swing.JLabel();
        lblTitulo3 = new javax.swing.JLabel();
        jp_Est4 = new javax.swing.JPanel();
        lblInstitucion5 = new javax.swing.JLabel();
        lblAño5 = new javax.swing.JLabel();
        lblCiudad5 = new javax.swing.JLabel();
        lblTitulo5 = new javax.swing.JLabel();
        jp_Est5 = new javax.swing.JPanel();
        lblInstitucion4 = new javax.swing.JLabel();
        lblAño4 = new javax.swing.JLabel();
        lblCiudad4 = new javax.swing.JLabel();
        lblTitulo4 = new javax.swing.JLabel();
        jp_Est6 = new javax.swing.JPanel();
        lblInstitucion6 = new javax.swing.JLabel();
        lblAño6 = new javax.swing.JLabel();
        lblCiudad6 = new javax.swing.JLabel();
        lblTitulo6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnConfigEstudios = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jp_Experiencias = new javax.swing.JPanel();
        jp_Exp1 = new javax.swing.JPanel();
        lblCargo1 = new javax.swing.JLabel();
        lblInstitucionExp1 = new javax.swing.JLabel();
        descripcionExp1 = new javax.swing.JLabel();
        añoExp1 = new javax.swing.JLabel();
        jp_Exp2 = new javax.swing.JPanel();
        lblCargo2 = new javax.swing.JLabel();
        lblInstitucionExp2 = new javax.swing.JLabel();
        descripcionExp2 = new javax.swing.JLabel();
        añoExp2 = new javax.swing.JLabel();
        jp_Exp3 = new javax.swing.JPanel();
        lblCargo3 = new javax.swing.JLabel();
        lblInstitucionExp3 = new javax.swing.JLabel();
        descripcionExp3 = new javax.swing.JLabel();
        añoExp3 = new javax.swing.JLabel();
        jp_Exp4 = new javax.swing.JPanel();
        lblCargo4 = new javax.swing.JLabel();
        lblInstitucionExp4 = new javax.swing.JLabel();
        descripcionExp4 = new javax.swing.JLabel();
        añoExp4 = new javax.swing.JLabel();
        jp_Exp5 = new javax.swing.JPanel();
        lblCargo5 = new javax.swing.JLabel();
        lblInstitucionExp5 = new javax.swing.JLabel();
        descripcionExp5 = new javax.swing.JLabel();
        añoExp5 = new javax.swing.JLabel();
        btnConfigExps = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        btnConfigExps1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        lblNombreRef1 = new javax.swing.JLabel();
        lblCargoRef1 = new javax.swing.JLabel();
        lblEmpresaRef1 = new javax.swing.JLabel();
        lblTelefonoRef1 = new javax.swing.JLabel();
        lblCorreoRef1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        lblNombreRef2 = new javax.swing.JLabel();
        lblCargoRef2 = new javax.swing.JLabel();
        lblEmpresaRef2 = new javax.swing.JLabel();
        lblTelefonoRef2 = new javax.swing.JLabel();
        lblCorreoRef2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        lblNombreRef3 = new javax.swing.JLabel();
        lblCargoRef3 = new javax.swing.JLabel();
        lblEmpresaRef3 = new javax.swing.JLabel();
        lblTelefonoRef3 = new javax.swing.JLabel();
        lblCorreoRef3 = new javax.swing.JLabel();
        jp_Perfil2 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        lblProfesion2 = new javax.swing.JLabel();
        lblNombres2 = new javax.swing.JLabel();
        lblFotoperfil2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jp_Ixquierda = new javax.swing.JPanel();
        btnConfigEstudios1 = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jp_Estudios2 = new javax.swing.JPanel();
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
        jp_Experiencias1 = new javax.swing.JPanel();
        jp_Exp6 = new javax.swing.JPanel();
        lblCargo6 = new javax.swing.JLabel();
        lblInstitucionExp6 = new javax.swing.JLabel();
        descripcionExp6 = new javax.swing.JLabel();
        añoExp6 = new javax.swing.JLabel();
        jp_Exp7 = new javax.swing.JPanel();
        lblCargo7 = new javax.swing.JLabel();
        lblInstitucionExp7 = new javax.swing.JLabel();
        descripcionExp7 = new javax.swing.JLabel();
        añoExp7 = new javax.swing.JLabel();
        jp_Exp8 = new javax.swing.JPanel();
        lblCargo8 = new javax.swing.JLabel();
        lblInstitucionExp8 = new javax.swing.JLabel();
        descripcionExp8 = new javax.swing.JLabel();
        añoExp8 = new javax.swing.JLabel();
        jp_Exp9 = new javax.swing.JPanel();
        lblCargo9 = new javax.swing.JLabel();
        lblInstitucionExp9 = new javax.swing.JLabel();
        descripcionExp9 = new javax.swing.JLabel();
        añoExp9 = new javax.swing.JLabel();
        jp_Exp10 = new javax.swing.JPanel();
        lblCargo10 = new javax.swing.JLabel();
        lblInstitucionExp10 = new javax.swing.JLabel();
        descripcionExp10 = new javax.swing.JLabel();
        añoExp10 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        btnConfigExps4 = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        btnConfigExps5 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        lblNombreRef4 = new javax.swing.JLabel();
        lblCargoRef4 = new javax.swing.JLabel();
        lblEmpresaRef4 = new javax.swing.JLabel();
        lblTelefonoRef4 = new javax.swing.JLabel();
        lblCorreoRef4 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        lblNombreRef5 = new javax.swing.JLabel();
        lblCargoRef5 = new javax.swing.JLabel();
        lblEmpresaRef5 = new javax.swing.JLabel();
        lblTelefonoRef5 = new javax.swing.JLabel();
        lblCorreoRef5 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        lblNombreRef6 = new javax.swing.JLabel();
        lblCargoRef6 = new javax.swing.JLabel();
        lblEmpresaRef6 = new javax.swing.JLabel();
        lblTelefonoRef6 = new javax.swing.JLabel();
        lblCorreoRef6 = new javax.swing.JLabel();
        jp_Perfil3 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jp_Estudios1 = new javax.swing.JPanel();
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
        btnConfigEstudios4 = new javax.swing.JButton();
        jSeparator12 = new javax.swing.JSeparator();
        jp_Experiencias4 = new javax.swing.JPanel();
        jp_Exp17 = new javax.swing.JPanel();
        lblCargo17 = new javax.swing.JLabel();
        lblInstitucionExp17 = new javax.swing.JLabel();
        descripcionExp17 = new javax.swing.JLabel();
        añoExp17 = new javax.swing.JLabel();
        jp_Exp18 = new javax.swing.JPanel();
        lblCargo18 = new javax.swing.JLabel();
        lblInstitucionExp18 = new javax.swing.JLabel();
        descripcionExp18 = new javax.swing.JLabel();
        añoExp18 = new javax.swing.JLabel();
        jp_Exp19 = new javax.swing.JPanel();
        lblCargo19 = new javax.swing.JLabel();
        lblInstitucionExp19 = new javax.swing.JLabel();
        descripcionExp19 = new javax.swing.JLabel();
        añoExp19 = new javax.swing.JLabel();
        jp_Exp20 = new javax.swing.JPanel();
        lblCargo20 = new javax.swing.JLabel();
        lblInstitucionExp20 = new javax.swing.JLabel();
        descripcionExp20 = new javax.swing.JLabel();
        añoExp20 = new javax.swing.JLabel();
        jp_Exp21 = new javax.swing.JPanel();
        lblCargo21 = new javax.swing.JLabel();
        lblInstitucionExp21 = new javax.swing.JLabel();
        descripcionExp21 = new javax.swing.JLabel();
        añoExp21 = new javax.swing.JLabel();
        btnConfigExps8 = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jSeparator13 = new javax.swing.JSeparator();
        btnConfigExps9 = new javax.swing.JButton();
        jPanel20 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        lblNombreRef10 = new javax.swing.JLabel();
        lblCargoRef10 = new javax.swing.JLabel();
        lblEmpresaRef10 = new javax.swing.JLabel();
        lblTelefonoRef10 = new javax.swing.JLabel();
        lblCorreoRef10 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        lblNombreRef11 = new javax.swing.JLabel();
        lblCargoRef11 = new javax.swing.JLabel();
        lblEmpresaRef11 = new javax.swing.JLabel();
        lblTelefonoRef11 = new javax.swing.JLabel();
        lblCorreoRef11 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        lblNombreRef12 = new javax.swing.JLabel();
        lblCargoRef12 = new javax.swing.JLabel();
        lblEmpresaRef12 = new javax.swing.JLabel();
        lblTelefonoRef12 = new javax.swing.JLabel();
        lblCorreoRef12 = new javax.swing.JLabel();
        lblFotoperfil1 = new javax.swing.JLabel();
        lblNombres1 = new javax.swing.JLabel();
        lblProfesion1 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jSeparator14 = new javax.swing.JSeparator();
        btnConfigEstudios5 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jp_Busqueda = new javax.swing.JPanel();
        jp_Notificaciones = new javax.swing.JPanel();

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

        jp_Titulos.setBackground(new java.awt.Color(93, 0, 93));
        jp_Titulos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo3.0.png"))); // NOI18N
        jLabel2.setText("Work Search Engine. ");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnMiPerfil.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnMiPerfil.setForeground(new java.awt.Color(255, 255, 255));
        btnMiPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/perfilMan.png"))); // NOI18N
        btnMiPerfil.setText("Mi Perfil. ");
        btnMiPerfil.setContentAreaFilled(false);
        btnMiPerfil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMiPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMiPerfilActionPerformed(evt);
            }
        });

        btnBusqueda.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnBusqueda.setForeground(new java.awt.Color(255, 255, 255));
        btnBusqueda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/search (1).png"))); // NOI18N
        btnBusqueda.setText("Búsqueda. ");
        btnBusqueda.setContentAreaFilled(false);
        btnBusqueda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusquedaActionPerformed(evt);
            }
        });

        btnNotificaciones.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnNotificaciones.setForeground(new java.awt.Color(255, 255, 255));
        btnNotificaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bell.png"))); // NOI18N
        btnNotificaciones.setText("Notificaciones. ");
        btnNotificaciones.setContentAreaFilled(false);
        btnNotificaciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNotificaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNotificacionesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jp_TitulosLayout = new javax.swing.GroupLayout(jp_Titulos);
        jp_Titulos.setLayout(jp_TitulosLayout);
        jp_TitulosLayout.setHorizontalGroup(
            jp_TitulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_TitulosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMiPerfil)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBusqueda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnNotificaciones)
                .addGap(142, 142, 142))
        );
        jp_TitulosLayout.setVerticalGroup(
            jp_TitulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_TitulosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_TitulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                    .addComponent(btnMiPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNotificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jp_Perfil.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        scroll1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        lblProfesion.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblProfesion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        lblNombres.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblNombres.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 319, Short.MAX_VALUE)
                        .addComponent(lblProfesion, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNombres, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblProfesion, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jp_BarraIzquierda.setBackground(new java.awt.Color(153, 204, 255));

        lblFotoperfil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFotoperfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/user_64_.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Mi Descripción.");

        scrollTxtA.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jtxta_Descripcion.setEditable(false);
        jtxta_Descripcion.setBackground(new java.awt.Color(153, 204, 255));
        jtxta_Descripcion.setColumns(20);
        jtxta_Descripcion.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jtxta_Descripcion.setForeground(new java.awt.Color(255, 255, 255));
        jtxta_Descripcion.setRows(5);
        jtxta_Descripcion.setAutoscrolls(false);
        jtxta_Descripcion.setBorder(null);
        jtxta_Descripcion.setOpaque(false);
        scrollTxtA.setViewportView(jtxta_Descripcion);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Habilidades.");

        jp_Habilidades.setBackground(new java.awt.Color(153, 204, 255));
        jp_Habilidades.setLayout(new java.awt.GridLayout(0, 1));

        btnConfigExps2.setBackground(new java.awt.Color(153, 255, 153));
        btnConfigExps2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnConfigExps2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/settings24.png"))); // NOI18N
        btnConfigExps2.setText("Gestionar...");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Personales.");

        javax.swing.GroupLayout jp_BarraIzquierdaLayout = new javax.swing.GroupLayout(jp_BarraIzquierda);
        jp_BarraIzquierda.setLayout(jp_BarraIzquierdaLayout);
        jp_BarraIzquierdaLayout.setHorizontalGroup(
            jp_BarraIzquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_BarraIzquierdaLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(lblFotoperfil, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jp_BarraIzquierdaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_BarraIzquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_BarraIzquierdaLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel1)
                        .addGap(0, 35, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_BarraIzquierdaLayout.createSequentialGroup()
                        .addComponent(scrollTxtA, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jp_BarraIzquierdaLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jp_BarraIzquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(btnConfigExps2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_BarraIzquierdaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jp_Habilidades, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jp_BarraIzquierdaLayout.setVerticalGroup(
            jp_BarraIzquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_BarraIzquierdaLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(lblFotoperfil, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollTxtA, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1011, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConfigExps2)
                .addGap(18, 18, 18)
                .addComponent(jp_Habilidades, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(228, 228, 228))
        );

        jp_Est1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblInstitucion1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblInstitucion1.setForeground(new java.awt.Color(51, 51, 51));
        lblInstitucion1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInstitucion1.setText("institucion");

        lblAño1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblAño1.setForeground(new java.awt.Color(51, 51, 51));
        lblAño1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAño1.setText("año");

        lblCiudad1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCiudad1.setForeground(new java.awt.Color(51, 51, 51));
        lblCiudad1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCiudad1.setText("ciudad");

        lblTitulo1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblTitulo1.setForeground(new java.awt.Color(51, 51, 51));
        lblTitulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo1.setText("titulo");

        javax.swing.GroupLayout jp_Est1Layout = new javax.swing.GroupLayout(jp_Est1);
        jp_Est1.setLayout(jp_Est1Layout);
        jp_Est1Layout.setHorizontalGroup(
            jp_Est1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Est1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_Est1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAño1, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                    .addComponent(lblCiudad1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp_Est1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblInstitucion1, javax.swing.GroupLayout.DEFAULT_SIZE, 777, Short.MAX_VALUE)
                    .addComponent(lblTitulo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        jp_Est1Layout.setVerticalGroup(
            jp_Est1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_Est1Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jp_Est1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAño1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_Est1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCiudad1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInstitucion1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jp_Est2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblInstitucion2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblInstitucion2.setForeground(new java.awt.Color(51, 51, 51));
        lblInstitucion2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInstitucion2.setText("institucion");

        lblAño2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblAño2.setForeground(new java.awt.Color(51, 51, 51));
        lblAño2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAño2.setText("año");

        lblCiudad2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCiudad2.setForeground(new java.awt.Color(51, 51, 51));
        lblCiudad2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCiudad2.setText("ciudad");

        lblTitulo2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblTitulo2.setForeground(new java.awt.Color(51, 51, 51));
        lblTitulo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo2.setText("titulo");

        javax.swing.GroupLayout jp_Est2Layout = new javax.swing.GroupLayout(jp_Est2);
        jp_Est2.setLayout(jp_Est2Layout);
        jp_Est2Layout.setHorizontalGroup(
            jp_Est2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Est2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_Est2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCiudad2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAño2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp_Est2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTitulo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblInstitucion2, javax.swing.GroupLayout.DEFAULT_SIZE, 777, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        jp_Est2Layout.setVerticalGroup(
            jp_Est2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Est2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_Est2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAño2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_Est2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCiudad2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInstitucion2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jp_Est3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblInstitucion3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblInstitucion3.setForeground(new java.awt.Color(51, 51, 51));
        lblInstitucion3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInstitucion3.setText("institucion");

        lblAño3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblAño3.setForeground(new java.awt.Color(51, 51, 51));
        lblAño3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAño3.setText("año");

        lblCiudad3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCiudad3.setForeground(new java.awt.Color(51, 51, 51));
        lblCiudad3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCiudad3.setText("ciudad");

        lblTitulo3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblTitulo3.setForeground(new java.awt.Color(51, 51, 51));
        lblTitulo3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo3.setText("titulo");

        javax.swing.GroupLayout jp_Est3Layout = new javax.swing.GroupLayout(jp_Est3);
        jp_Est3.setLayout(jp_Est3Layout);
        jp_Est3Layout.setHorizontalGroup(
            jp_Est3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Est3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_Est3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCiudad3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAño3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp_Est3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTitulo3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblInstitucion3, javax.swing.GroupLayout.DEFAULT_SIZE, 777, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        jp_Est3Layout.setVerticalGroup(
            jp_Est3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Est3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_Est3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAño3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitulo3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_Est3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCiudad3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInstitucion3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jp_Est4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblInstitucion5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblInstitucion5.setForeground(new java.awt.Color(51, 51, 51));
        lblInstitucion5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInstitucion5.setText("institucion");

        lblAño5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblAño5.setForeground(new java.awt.Color(51, 51, 51));
        lblAño5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAño5.setText("año");

        lblCiudad5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCiudad5.setForeground(new java.awt.Color(51, 51, 51));
        lblCiudad5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCiudad5.setText("ciudad");

        lblTitulo5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblTitulo5.setForeground(new java.awt.Color(51, 51, 51));
        lblTitulo5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo5.setText("titulo");

        javax.swing.GroupLayout jp_Est4Layout = new javax.swing.GroupLayout(jp_Est4);
        jp_Est4.setLayout(jp_Est4Layout);
        jp_Est4Layout.setHorizontalGroup(
            jp_Est4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Est4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_Est4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCiudad5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAño5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp_Est4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTitulo5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblInstitucion5, javax.swing.GroupLayout.DEFAULT_SIZE, 777, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        jp_Est4Layout.setVerticalGroup(
            jp_Est4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Est4Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jp_Est4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAño5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitulo5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_Est4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCiudad5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInstitucion5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jp_Est5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblInstitucion4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblInstitucion4.setForeground(new java.awt.Color(51, 51, 51));
        lblInstitucion4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInstitucion4.setText("institucion");

        lblAño4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblAño4.setForeground(new java.awt.Color(51, 51, 51));
        lblAño4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAño4.setText("año");

        lblCiudad4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCiudad4.setForeground(new java.awt.Color(51, 51, 51));
        lblCiudad4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCiudad4.setText("ciudad");

        lblTitulo4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblTitulo4.setForeground(new java.awt.Color(51, 51, 51));
        lblTitulo4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo4.setText("titulo");

        javax.swing.GroupLayout jp_Est5Layout = new javax.swing.GroupLayout(jp_Est5);
        jp_Est5.setLayout(jp_Est5Layout);
        jp_Est5Layout.setHorizontalGroup(
            jp_Est5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Est5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_Est5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAño4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCiudad4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp_Est5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTitulo4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblInstitucion4, javax.swing.GroupLayout.DEFAULT_SIZE, 777, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        jp_Est5Layout.setVerticalGroup(
            jp_Est5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Est5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_Est5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAño4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitulo4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_Est5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCiudad4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInstitucion4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jp_Est6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblInstitucion6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblInstitucion6.setForeground(new java.awt.Color(51, 51, 51));
        lblInstitucion6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInstitucion6.setText("institucion");

        lblAño6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblAño6.setForeground(new java.awt.Color(51, 51, 51));
        lblAño6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAño6.setText("año");

        lblCiudad6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCiudad6.setForeground(new java.awt.Color(51, 51, 51));
        lblCiudad6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCiudad6.setText("ciudad");

        lblTitulo6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblTitulo6.setForeground(new java.awt.Color(51, 51, 51));
        lblTitulo6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo6.setText("titulo");

        javax.swing.GroupLayout jp_Est6Layout = new javax.swing.GroupLayout(jp_Est6);
        jp_Est6.setLayout(jp_Est6Layout);
        jp_Est6Layout.setHorizontalGroup(
            jp_Est6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Est6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_Est6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCiudad6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAño6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp_Est6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTitulo6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblInstitucion6, javax.swing.GroupLayout.DEFAULT_SIZE, 777, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        jp_Est6Layout.setVerticalGroup(
            jp_Est6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Est6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_Est6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAño6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitulo6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_Est6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCiudad6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInstitucion6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jp_EstudiosLayout = new javax.swing.GroupLayout(jp_Estudios);
        jp_Estudios.setLayout(jp_EstudiosLayout);
        jp_EstudiosLayout.setHorizontalGroup(
            jp_EstudiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_Est1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jp_Est2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jp_Est3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jp_Est4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jp_Est5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jp_Est6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jp_EstudiosLayout.setVerticalGroup(
            jp_EstudiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_EstudiosLayout.createSequentialGroup()
                .addComponent(jp_Est1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_Est2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_Est3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_Est5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_Est4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_Est6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSeparator1.setBackground(new java.awt.Color(0, 0, 102));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setPreferredSize(new java.awt.Dimension(4, 2));

        btnConfigEstudios.setBackground(new java.awt.Color(153, 255, 153));
        btnConfigEstudios.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnConfigEstudios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/settings24.png"))); // NOI18N
        btnConfigEstudios.setText("Gestionar...");
        btnConfigEstudios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfigEstudiosActionPerformed(evt);
            }
        });

        jSeparator2.setBackground(new java.awt.Color(0, 0, 102));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        jp_Exp1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblCargo1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblCargo1.setForeground(new java.awt.Color(51, 51, 51));
        lblCargo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCargo1.setText("cargo desempeñado");

        lblInstitucionExp1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblInstitucionExp1.setForeground(new java.awt.Color(51, 51, 51));
        lblInstitucionExp1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInstitucionExp1.setText("institucion");

        descripcionExp1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        descripcionExp1.setForeground(new java.awt.Color(51, 51, 51));
        descripcionExp1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        descripcionExp1.setText("descripcion");

        añoExp1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        añoExp1.setForeground(new java.awt.Color(51, 51, 51));
        añoExp1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        añoExp1.setText("año");

        javax.swing.GroupLayout jp_Exp1Layout = new javax.swing.GroupLayout(jp_Exp1);
        jp_Exp1.setLayout(jp_Exp1Layout);
        jp_Exp1Layout.setHorizontalGroup(
            jp_Exp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Exp1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_Exp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descripcionExp1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCargo1, javax.swing.GroupLayout.DEFAULT_SIZE, 992, Short.MAX_VALUE)
                    .addGroup(jp_Exp1Layout.createSequentialGroup()
                        .addComponent(lblInstitucionExp1, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(añoExp1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jp_Exp1Layout.setVerticalGroup(
            jp_Exp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Exp1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCargo1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_Exp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInstitucionExp1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(añoExp1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(descripcionExp1, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        jp_Exp2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblCargo2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblCargo2.setForeground(new java.awt.Color(51, 51, 51));
        lblCargo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCargo2.setText("cargo desempeñado");

        lblInstitucionExp2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblInstitucionExp2.setForeground(new java.awt.Color(51, 51, 51));
        lblInstitucionExp2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInstitucionExp2.setText("institucion");

        descripcionExp2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        descripcionExp2.setForeground(new java.awt.Color(51, 51, 51));
        descripcionExp2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        descripcionExp2.setText("descripcion");

        añoExp2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        añoExp2.setForeground(new java.awt.Color(51, 51, 51));
        añoExp2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        añoExp2.setText("año");

        javax.swing.GroupLayout jp_Exp2Layout = new javax.swing.GroupLayout(jp_Exp2);
        jp_Exp2.setLayout(jp_Exp2Layout);
        jp_Exp2Layout.setHorizontalGroup(
            jp_Exp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Exp2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_Exp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descripcionExp2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCargo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jp_Exp2Layout.createSequentialGroup()
                        .addComponent(lblInstitucionExp2, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(añoExp2, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jp_Exp2Layout.setVerticalGroup(
            jp_Exp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Exp2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCargo2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_Exp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInstitucionExp2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(añoExp2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(descripcionExp2, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        jp_Exp3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblCargo3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblCargo3.setForeground(new java.awt.Color(51, 51, 51));
        lblCargo3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCargo3.setText("cargo desempeñado");

        lblInstitucionExp3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblInstitucionExp3.setForeground(new java.awt.Color(51, 51, 51));
        lblInstitucionExp3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInstitucionExp3.setText("institucion");

        descripcionExp3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        descripcionExp3.setForeground(new java.awt.Color(51, 51, 51));
        descripcionExp3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        descripcionExp3.setText("descripcion");

        añoExp3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        añoExp3.setForeground(new java.awt.Color(51, 51, 51));
        añoExp3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        añoExp3.setText("año");

        javax.swing.GroupLayout jp_Exp3Layout = new javax.swing.GroupLayout(jp_Exp3);
        jp_Exp3.setLayout(jp_Exp3Layout);
        jp_Exp3Layout.setHorizontalGroup(
            jp_Exp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Exp3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_Exp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descripcionExp3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCargo3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jp_Exp3Layout.createSequentialGroup()
                        .addComponent(lblInstitucionExp3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(añoExp3, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jp_Exp3Layout.setVerticalGroup(
            jp_Exp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Exp3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCargo3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_Exp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInstitucionExp3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(añoExp3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(descripcionExp3, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        jp_Exp4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblCargo4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblCargo4.setForeground(new java.awt.Color(51, 51, 51));
        lblCargo4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCargo4.setText("cargo desempeñado");

        lblInstitucionExp4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblInstitucionExp4.setForeground(new java.awt.Color(51, 51, 51));
        lblInstitucionExp4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInstitucionExp4.setText("institucion");

        descripcionExp4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        descripcionExp4.setForeground(new java.awt.Color(51, 51, 51));
        descripcionExp4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        descripcionExp4.setText("descripcion");

        añoExp4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        añoExp4.setForeground(new java.awt.Color(51, 51, 51));
        añoExp4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        añoExp4.setText("año");

        javax.swing.GroupLayout jp_Exp4Layout = new javax.swing.GroupLayout(jp_Exp4);
        jp_Exp4.setLayout(jp_Exp4Layout);
        jp_Exp4Layout.setHorizontalGroup(
            jp_Exp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Exp4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_Exp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descripcionExp4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCargo4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jp_Exp4Layout.createSequentialGroup()
                        .addComponent(lblInstitucionExp4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(añoExp4, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jp_Exp4Layout.setVerticalGroup(
            jp_Exp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Exp4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCargo4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_Exp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInstitucionExp4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(añoExp4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(descripcionExp4, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        jp_Exp5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblCargo5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblCargo5.setForeground(new java.awt.Color(51, 51, 51));
        lblCargo5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCargo5.setText("cargo desempeñado");

        lblInstitucionExp5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblInstitucionExp5.setForeground(new java.awt.Color(51, 51, 51));
        lblInstitucionExp5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInstitucionExp5.setText("institucion");

        descripcionExp5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        descripcionExp5.setForeground(new java.awt.Color(51, 51, 51));
        descripcionExp5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        descripcionExp5.setText("descripcion");

        añoExp5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        añoExp5.setForeground(new java.awt.Color(51, 51, 51));
        añoExp5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        añoExp5.setText("año");

        javax.swing.GroupLayout jp_Exp5Layout = new javax.swing.GroupLayout(jp_Exp5);
        jp_Exp5.setLayout(jp_Exp5Layout);
        jp_Exp5Layout.setHorizontalGroup(
            jp_Exp5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Exp5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_Exp5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descripcionExp5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCargo5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jp_Exp5Layout.createSequentialGroup()
                        .addComponent(lblInstitucionExp5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(añoExp5, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jp_Exp5Layout.setVerticalGroup(
            jp_Exp5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Exp5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCargo5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_Exp5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInstitucionExp5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(añoExp5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(descripcionExp5, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jp_ExperienciasLayout = new javax.swing.GroupLayout(jp_Experiencias);
        jp_Experiencias.setLayout(jp_ExperienciasLayout);
        jp_ExperienciasLayout.setHorizontalGroup(
            jp_ExperienciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_Exp1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jp_Exp2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jp_Exp3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jp_Exp4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jp_Exp5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jp_ExperienciasLayout.setVerticalGroup(
            jp_ExperienciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_ExperienciasLayout.createSequentialGroup()
                .addComponent(jp_Exp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_Exp2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_Exp3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_Exp4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_Exp5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnConfigExps.setBackground(new java.awt.Color(153, 255, 153));
        btnConfigExps.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnConfigExps.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/settings24.png"))); // NOI18N
        btnConfigExps.setText("Gestionar...");

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

        btnConfigExps1.setBackground(new java.awt.Color(153, 255, 153));
        btnConfigExps1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnConfigExps1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/settings24.png"))); // NOI18N
        btnConfigExps1.setText("Gestionar...");

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblNombreRef1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblNombreRef1.setForeground(new java.awt.Color(51, 51, 51));
        lblNombreRef1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreRef1.setText("Nombre del Referente");

        lblCargoRef1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCargoRef1.setForeground(new java.awt.Color(51, 51, 51));
        lblCargoRef1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCargoRef1.setText("Cargo del Referente");

        lblEmpresaRef1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblEmpresaRef1.setForeground(new java.awt.Color(51, 51, 51));
        lblEmpresaRef1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEmpresaRef1.setText("Empresa del Referente");

        lblTelefonoRef1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTelefonoRef1.setForeground(new java.awt.Color(51, 51, 51));
        lblTelefonoRef1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTelefonoRef1.setText("Telefono del Referente");

        lblCorreoRef1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCorreoRef1.setForeground(new java.awt.Color(51, 51, 51));
        lblCorreoRef1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCorreoRef1.setText("Correo del Referente");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblNombreRef1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCargoRef1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCorreoRef1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTelefonoRef1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblEmpresaRef1, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(lblNombreRef1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCargoRef1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmpresaRef1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCorreoRef1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefonoRef1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 13, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblNombreRef2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblNombreRef2.setForeground(new java.awt.Color(51, 51, 51));
        lblNombreRef2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreRef2.setText("Nombre del Referente");

        lblCargoRef2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCargoRef2.setForeground(new java.awt.Color(51, 51, 51));
        lblCargoRef2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCargoRef2.setText("Cargo del Referente");

        lblEmpresaRef2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblEmpresaRef2.setForeground(new java.awt.Color(51, 51, 51));
        lblEmpresaRef2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEmpresaRef2.setText("Empresa del Referente");

        lblTelefonoRef2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTelefonoRef2.setForeground(new java.awt.Color(51, 51, 51));
        lblTelefonoRef2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTelefonoRef2.setText("Telefono del Referente");

        lblCorreoRef2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCorreoRef2.setForeground(new java.awt.Color(51, 51, 51));
        lblCorreoRef2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCorreoRef2.setText("Correo del Referente");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblNombreRef2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCargoRef2, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCorreoRef2, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTelefonoRef2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblEmpresaRef2, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(lblNombreRef2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCargoRef2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmpresaRef2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCorreoRef2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefonoRef2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 13, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblNombreRef3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblNombreRef3.setForeground(new java.awt.Color(51, 51, 51));
        lblNombreRef3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreRef3.setText("Nombre del Referente");

        lblCargoRef3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCargoRef3.setForeground(new java.awt.Color(51, 51, 51));
        lblCargoRef3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCargoRef3.setText("Cargo del Referente");

        lblEmpresaRef3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblEmpresaRef3.setForeground(new java.awt.Color(51, 51, 51));
        lblEmpresaRef3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEmpresaRef3.setText("Empresa del Referente");

        lblTelefonoRef3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTelefonoRef3.setForeground(new java.awt.Color(51, 51, 51));
        lblTelefonoRef3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTelefonoRef3.setText("Telefono del Referente");

        lblCorreoRef3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCorreoRef3.setForeground(new java.awt.Color(51, 51, 51));
        lblCorreoRef3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCorreoRef3.setText("Correo del Referente");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblNombreRef3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCargoRef3, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCorreoRef3, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTelefonoRef3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblEmpresaRef3, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(lblNombreRef3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCargoRef3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmpresaRef3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCorreoRef3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefonoRef3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jp_BarraIzquierda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jp_Experiencias, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnConfigEstudios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnConfigExps, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnConfigExps1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator3)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 1018, Short.MAX_VALUE)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jp_Estudios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel25)
                                        .addComponent(jLabel26)
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel27))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(33, 33, 33))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConfigEstudios)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jp_Estudios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConfigExps)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jp_Experiencias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConfigExps1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jp_BarraIzquierda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(141, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jp_Perfil1Layout = new javax.swing.GroupLayout(jp_Perfil1);
        jp_Perfil1.setLayout(jp_Perfil1Layout);
        jp_Perfil1Layout.setHorizontalGroup(
            jp_Perfil1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Perfil1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 133, Short.MAX_VALUE))
        );
        jp_Perfil1Layout.setVerticalGroup(
            jp_Perfil1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel11.setBackground(new java.awt.Color(204, 255, 204));

        lblProfesion2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblProfesion2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        lblNombres2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblNombres2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblFotoperfil2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFotoperfil2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/user_64_.png"))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel9.setText("Mis Datos.");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFotoperfil2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(lblProfesion2, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(lblNombres2, javax.swing.GroupLayout.PREFERRED_SIZE, 752, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addGap(124, 124, 124))))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(lblNombres2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblProfesion2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(lblFotoperfil2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jp_Ixquierda.setBackground(new java.awt.Color(153, 255, 153));

        javax.swing.GroupLayout jp_IxquierdaLayout = new javax.swing.GroupLayout(jp_Ixquierda);
        jp_Ixquierda.setLayout(jp_IxquierdaLayout);
        jp_IxquierdaLayout.setHorizontalGroup(
            jp_IxquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 336, Short.MAX_VALUE)
        );
        jp_IxquierdaLayout.setVerticalGroup(
            jp_IxquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2622, Short.MAX_VALUE)
        );

        btnConfigEstudios1.setBackground(new java.awt.Color(153, 255, 153));
        btnConfigEstudios1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnConfigEstudios1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/settings24.png"))); // NOI18N
        btnConfigEstudios1.setText("Gestionar...");
        btnConfigEstudios1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfigEstudios1ActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jp_Estudios2Layout = new javax.swing.GroupLayout(jp_Estudios2);
        jp_Estudios2.setLayout(jp_Estudios2Layout);
        jp_Estudios2Layout.setHorizontalGroup(
            jp_Estudios2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_Est8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jp_Est9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jp_Est10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jp_Est11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jp_Est12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jp_Est13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jp_Estudios2Layout.setVerticalGroup(
            jp_Estudios2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Estudios2Layout.createSequentialGroup()
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

        lblCargo6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblCargo6.setForeground(new java.awt.Color(51, 51, 51));
        lblCargo6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCargo6.setText("cargo desempeñado");

        lblInstitucionExp6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblInstitucionExp6.setForeground(new java.awt.Color(51, 51, 51));
        lblInstitucionExp6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInstitucionExp6.setText("institucion");

        descripcionExp6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        descripcionExp6.setForeground(new java.awt.Color(51, 51, 51));
        descripcionExp6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        descripcionExp6.setText("descripcion");

        añoExp6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        añoExp6.setForeground(new java.awt.Color(51, 51, 51));
        añoExp6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        añoExp6.setText("año");

        javax.swing.GroupLayout jp_Exp6Layout = new javax.swing.GroupLayout(jp_Exp6);
        jp_Exp6.setLayout(jp_Exp6Layout);
        jp_Exp6Layout.setHorizontalGroup(
            jp_Exp6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Exp6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_Exp6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descripcionExp6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jp_Exp6Layout.createSequentialGroup()
                        .addComponent(lblInstitucionExp6, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(añoExp6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lblCargo6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jp_Exp6Layout.setVerticalGroup(
            jp_Exp6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Exp6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCargo6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_Exp6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInstitucionExp6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(añoExp6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(descripcionExp6, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        jp_Exp7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblCargo7.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblCargo7.setForeground(new java.awt.Color(51, 51, 51));
        lblCargo7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCargo7.setText("cargo desempeñado");

        lblInstitucionExp7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblInstitucionExp7.setForeground(new java.awt.Color(51, 51, 51));
        lblInstitucionExp7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInstitucionExp7.setText("institucion");

        descripcionExp7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        descripcionExp7.setForeground(new java.awt.Color(51, 51, 51));
        descripcionExp7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        descripcionExp7.setText("descripcion");

        añoExp7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        añoExp7.setForeground(new java.awt.Color(51, 51, 51));
        añoExp7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        añoExp7.setText("año");

        javax.swing.GroupLayout jp_Exp7Layout = new javax.swing.GroupLayout(jp_Exp7);
        jp_Exp7.setLayout(jp_Exp7Layout);
        jp_Exp7Layout.setHorizontalGroup(
            jp_Exp7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Exp7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_Exp7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descripcionExp7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCargo7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jp_Exp7Layout.createSequentialGroup()
                        .addComponent(lblInstitucionExp7, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(añoExp7, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jp_Exp7Layout.setVerticalGroup(
            jp_Exp7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Exp7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCargo7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_Exp7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInstitucionExp7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(añoExp7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(descripcionExp7, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        jp_Exp8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblCargo8.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblCargo8.setForeground(new java.awt.Color(51, 51, 51));
        lblCargo8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCargo8.setText("cargo desempeñado");

        lblInstitucionExp8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblInstitucionExp8.setForeground(new java.awt.Color(51, 51, 51));
        lblInstitucionExp8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInstitucionExp8.setText("institucion");

        descripcionExp8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        descripcionExp8.setForeground(new java.awt.Color(51, 51, 51));
        descripcionExp8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        descripcionExp8.setText("descripcion");

        añoExp8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        añoExp8.setForeground(new java.awt.Color(51, 51, 51));
        añoExp8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        añoExp8.setText("año");

        javax.swing.GroupLayout jp_Exp8Layout = new javax.swing.GroupLayout(jp_Exp8);
        jp_Exp8.setLayout(jp_Exp8Layout);
        jp_Exp8Layout.setHorizontalGroup(
            jp_Exp8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Exp8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_Exp8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descripcionExp8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCargo8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jp_Exp8Layout.createSequentialGroup()
                        .addComponent(lblInstitucionExp8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(añoExp8, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jp_Exp8Layout.setVerticalGroup(
            jp_Exp8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Exp8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCargo8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_Exp8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInstitucionExp8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(añoExp8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(descripcionExp8, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        jp_Exp9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblCargo9.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblCargo9.setForeground(new java.awt.Color(51, 51, 51));
        lblCargo9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCargo9.setText("cargo desempeñado");

        lblInstitucionExp9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblInstitucionExp9.setForeground(new java.awt.Color(51, 51, 51));
        lblInstitucionExp9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInstitucionExp9.setText("institucion");

        descripcionExp9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        descripcionExp9.setForeground(new java.awt.Color(51, 51, 51));
        descripcionExp9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        descripcionExp9.setText("descripcion");

        añoExp9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        añoExp9.setForeground(new java.awt.Color(51, 51, 51));
        añoExp9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        añoExp9.setText("año");

        javax.swing.GroupLayout jp_Exp9Layout = new javax.swing.GroupLayout(jp_Exp9);
        jp_Exp9.setLayout(jp_Exp9Layout);
        jp_Exp9Layout.setHorizontalGroup(
            jp_Exp9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Exp9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_Exp9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descripcionExp9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCargo9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jp_Exp9Layout.createSequentialGroup()
                        .addComponent(lblInstitucionExp9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(añoExp9, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jp_Exp9Layout.setVerticalGroup(
            jp_Exp9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Exp9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCargo9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_Exp9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInstitucionExp9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(añoExp9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(descripcionExp9, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        jp_Exp10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblCargo10.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblCargo10.setForeground(new java.awt.Color(51, 51, 51));
        lblCargo10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCargo10.setText("cargo desempeñado");

        lblInstitucionExp10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblInstitucionExp10.setForeground(new java.awt.Color(51, 51, 51));
        lblInstitucionExp10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInstitucionExp10.setText("institucion");

        descripcionExp10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        descripcionExp10.setForeground(new java.awt.Color(51, 51, 51));
        descripcionExp10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        descripcionExp10.setText("descripcion");

        añoExp10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        añoExp10.setForeground(new java.awt.Color(51, 51, 51));
        añoExp10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        añoExp10.setText("año");

        javax.swing.GroupLayout jp_Exp10Layout = new javax.swing.GroupLayout(jp_Exp10);
        jp_Exp10.setLayout(jp_Exp10Layout);
        jp_Exp10Layout.setHorizontalGroup(
            jp_Exp10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Exp10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_Exp10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descripcionExp10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCargo10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jp_Exp10Layout.createSequentialGroup()
                        .addComponent(lblInstitucionExp10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(añoExp10, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jp_Exp10Layout.setVerticalGroup(
            jp_Exp10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Exp10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCargo10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_Exp10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInstitucionExp10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(añoExp10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(descripcionExp10, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jp_Experiencias1Layout = new javax.swing.GroupLayout(jp_Experiencias1);
        jp_Experiencias1.setLayout(jp_Experiencias1Layout);
        jp_Experiencias1Layout.setHorizontalGroup(
            jp_Experiencias1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_Experiencias1Layout.createSequentialGroup()
                .addGroup(jp_Experiencias1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jp_Exp6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jp_Exp7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jp_Exp8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jp_Exp9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jp_Exp10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jp_Experiencias1Layout.setVerticalGroup(
            jp_Experiencias1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Experiencias1Layout.createSequentialGroup()
                .addComponent(jp_Exp6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_Exp7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_Exp8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_Exp9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_Exp10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel25.setOpaque(true);
        jLabel29.setBackground(new java.awt.Color(255, 255, 255));
        jLabel29.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 0, 102));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel29.setText("Experiencia Laboral.");

        btnConfigExps4.setBackground(new java.awt.Color(153, 255, 153));
        btnConfigExps4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnConfigExps4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/settings24.png"))); // NOI18N
        btnConfigExps4.setText("Gestionar...");

        jLabel25.setOpaque(true);
        jLabel30.setBackground(new java.awt.Color(255, 255, 255));
        jLabel30.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 0, 102));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel30.setText("Referencias.");

        jSeparator6.setBackground(new java.awt.Color(0, 0, 102));
        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));

        btnConfigExps5.setBackground(new java.awt.Color(153, 255, 153));
        btnConfigExps5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnConfigExps5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/settings24.png"))); // NOI18N
        btnConfigExps5.setText("Gestionar...");

        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblNombreRef4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblNombreRef4.setForeground(new java.awt.Color(51, 51, 51));
        lblNombreRef4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreRef4.setText("Nombre del Referente");

        lblCargoRef4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCargoRef4.setForeground(new java.awt.Color(51, 51, 51));
        lblCargoRef4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCargoRef4.setText("Cargo del Referente");

        lblEmpresaRef4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblEmpresaRef4.setForeground(new java.awt.Color(51, 51, 51));
        lblEmpresaRef4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEmpresaRef4.setText("Empresa del Referente");

        lblTelefonoRef4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTelefonoRef4.setForeground(new java.awt.Color(51, 51, 51));
        lblTelefonoRef4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTelefonoRef4.setText("Telefono del Referente");

        lblCorreoRef4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCorreoRef4.setForeground(new java.awt.Color(51, 51, 51));
        lblCorreoRef4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCorreoRef4.setText("Correo del Referente");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblNombreRef4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCargoRef4, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCorreoRef4, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTelefonoRef4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblEmpresaRef4, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(lblNombreRef4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCargoRef4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmpresaRef4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCorreoRef4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefonoRef4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 13, Short.MAX_VALUE))
        );

        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblNombreRef5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblNombreRef5.setForeground(new java.awt.Color(51, 51, 51));
        lblNombreRef5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreRef5.setText("Nombre del Referente");

        lblCargoRef5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCargoRef5.setForeground(new java.awt.Color(51, 51, 51));
        lblCargoRef5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCargoRef5.setText("Cargo del Referente");

        lblEmpresaRef5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblEmpresaRef5.setForeground(new java.awt.Color(51, 51, 51));
        lblEmpresaRef5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEmpresaRef5.setText("Empresa del Referente");

        lblTelefonoRef5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTelefonoRef5.setForeground(new java.awt.Color(51, 51, 51));
        lblTelefonoRef5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTelefonoRef5.setText("Telefono del Referente");

        lblCorreoRef5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCorreoRef5.setForeground(new java.awt.Color(51, 51, 51));
        lblCorreoRef5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCorreoRef5.setText("Correo del Referente");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblNombreRef5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCargoRef5, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCorreoRef5, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTelefonoRef5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblEmpresaRef5, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(lblNombreRef5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCargoRef5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmpresaRef5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCorreoRef5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefonoRef5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 13, Short.MAX_VALUE))
        );

        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblNombreRef6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblNombreRef6.setForeground(new java.awt.Color(51, 51, 51));
        lblNombreRef6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreRef6.setText("Nombre del Referente");

        lblCargoRef6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCargoRef6.setForeground(new java.awt.Color(51, 51, 51));
        lblCargoRef6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCargoRef6.setText("Cargo del Referente");

        lblEmpresaRef6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblEmpresaRef6.setForeground(new java.awt.Color(51, 51, 51));
        lblEmpresaRef6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEmpresaRef6.setText("Empresa del Referente");

        lblTelefonoRef6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTelefonoRef6.setForeground(new java.awt.Color(51, 51, 51));
        lblTelefonoRef6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTelefonoRef6.setText("Telefono del Referente");

        lblCorreoRef6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCorreoRef6.setForeground(new java.awt.Color(51, 51, 51));
        lblCorreoRef6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCorreoRef6.setText("Correo del Referente");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblNombreRef6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCargoRef6, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCorreoRef6, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTelefonoRef6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblEmpresaRef6, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addComponent(lblNombreRef6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCargoRef6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmpresaRef6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCorreoRef6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefonoRef6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
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
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addGap(674, 674, 674))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnConfigExps5, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnConfigExps4, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnConfigEstudios1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jp_Estudios2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addComponent(jp_Experiencias1, javax.swing.GroupLayout.PREFERRED_SIZE, 984, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel30)
                                .addComponent(jSeparator6)
                                .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jp_Ixquierda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConfigEstudios1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jp_Estudios2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(btnConfigExps4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jp_Experiencias1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(btnConfigExps5)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jp_Ixquierda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jp_Perfil2Layout = new javax.swing.GroupLayout(jp_Perfil2);
        jp_Perfil2.setLayout(jp_Perfil2Layout);
        jp_Perfil2Layout.setHorizontalGroup(
            jp_Perfil2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addContainerGap(17, Short.MAX_VALUE))
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
                .addContainerGap(17, Short.MAX_VALUE))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(lblCiudad11, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE))
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
                .addContainerGap(17, Short.MAX_VALUE))
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
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jp_Estudios1Layout = new javax.swing.GroupLayout(jp_Estudios1);
        jp_Estudios1.setLayout(jp_Estudios1Layout);
        jp_Estudios1Layout.setHorizontalGroup(
            jp_Estudios1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_Est7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jp_Est20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jp_Est21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jp_Est24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jp_Est23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jp_Est22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jp_Estudios1Layout.setVerticalGroup(
            jp_Estudios1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Estudios1Layout.createSequentialGroup()
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

        btnConfigEstudios4.setBackground(new java.awt.Color(153, 255, 153));
        btnConfigEstudios4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnConfigEstudios4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/settings24.png"))); // NOI18N
        btnConfigEstudios4.setText("Gestionar...");
        btnConfigEstudios4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfigEstudios4ActionPerformed(evt);
            }
        });

        jSeparator12.setBackground(new java.awt.Color(0, 0, 102));
        jSeparator12.setForeground(new java.awt.Color(0, 0, 0));

        jp_Exp17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblCargo17.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblCargo17.setForeground(new java.awt.Color(51, 51, 51));
        lblCargo17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCargo17.setText("cargo desempeñado");

        lblInstitucionExp17.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblInstitucionExp17.setForeground(new java.awt.Color(51, 51, 51));
        lblInstitucionExp17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInstitucionExp17.setText("institucion");

        descripcionExp17.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        descripcionExp17.setForeground(new java.awt.Color(51, 51, 51));
        descripcionExp17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        descripcionExp17.setText("descripcion");

        añoExp17.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        añoExp17.setForeground(new java.awt.Color(51, 51, 51));
        añoExp17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        añoExp17.setText("año");

        javax.swing.GroupLayout jp_Exp17Layout = new javax.swing.GroupLayout(jp_Exp17);
        jp_Exp17.setLayout(jp_Exp17Layout);
        jp_Exp17Layout.setHorizontalGroup(
            jp_Exp17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Exp17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_Exp17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descripcionExp17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCargo17, javax.swing.GroupLayout.DEFAULT_SIZE, 1063, Short.MAX_VALUE)
                    .addGroup(jp_Exp17Layout.createSequentialGroup()
                        .addComponent(lblInstitucionExp17, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(añoExp17, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jp_Exp17Layout.setVerticalGroup(
            jp_Exp17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Exp17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCargo17, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_Exp17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInstitucionExp17, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(añoExp17, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(descripcionExp17, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        jp_Exp18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblCargo18.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblCargo18.setForeground(new java.awt.Color(51, 51, 51));
        lblCargo18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCargo18.setText("cargo desempeñado");

        lblInstitucionExp18.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblInstitucionExp18.setForeground(new java.awt.Color(51, 51, 51));
        lblInstitucionExp18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInstitucionExp18.setText("institucion");

        descripcionExp18.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        descripcionExp18.setForeground(new java.awt.Color(51, 51, 51));
        descripcionExp18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        descripcionExp18.setText("descripcion");

        añoExp18.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        añoExp18.setForeground(new java.awt.Color(51, 51, 51));
        añoExp18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        añoExp18.setText("año");

        javax.swing.GroupLayout jp_Exp18Layout = new javax.swing.GroupLayout(jp_Exp18);
        jp_Exp18.setLayout(jp_Exp18Layout);
        jp_Exp18Layout.setHorizontalGroup(
            jp_Exp18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Exp18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_Exp18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descripcionExp18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCargo18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jp_Exp18Layout.createSequentialGroup()
                        .addComponent(lblInstitucionExp18, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(añoExp18, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jp_Exp18Layout.setVerticalGroup(
            jp_Exp18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Exp18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCargo18, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_Exp18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInstitucionExp18, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(añoExp18, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(descripcionExp18, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        jp_Exp19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblCargo19.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblCargo19.setForeground(new java.awt.Color(51, 51, 51));
        lblCargo19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCargo19.setText("cargo desempeñado");

        lblInstitucionExp19.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblInstitucionExp19.setForeground(new java.awt.Color(51, 51, 51));
        lblInstitucionExp19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInstitucionExp19.setText("institucion");

        descripcionExp19.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        descripcionExp19.setForeground(new java.awt.Color(51, 51, 51));
        descripcionExp19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        descripcionExp19.setText("descripcion");

        añoExp19.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        añoExp19.setForeground(new java.awt.Color(51, 51, 51));
        añoExp19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        añoExp19.setText("año");

        javax.swing.GroupLayout jp_Exp19Layout = new javax.swing.GroupLayout(jp_Exp19);
        jp_Exp19.setLayout(jp_Exp19Layout);
        jp_Exp19Layout.setHorizontalGroup(
            jp_Exp19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Exp19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_Exp19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descripcionExp19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCargo19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jp_Exp19Layout.createSequentialGroup()
                        .addComponent(lblInstitucionExp19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(añoExp19, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jp_Exp19Layout.setVerticalGroup(
            jp_Exp19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Exp19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCargo19, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_Exp19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInstitucionExp19, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(añoExp19, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(descripcionExp19, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        jp_Exp20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblCargo20.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblCargo20.setForeground(new java.awt.Color(51, 51, 51));
        lblCargo20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCargo20.setText("cargo desempeñado");

        lblInstitucionExp20.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblInstitucionExp20.setForeground(new java.awt.Color(51, 51, 51));
        lblInstitucionExp20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInstitucionExp20.setText("institucion");

        descripcionExp20.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        descripcionExp20.setForeground(new java.awt.Color(51, 51, 51));
        descripcionExp20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        descripcionExp20.setText("descripcion");

        añoExp20.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        añoExp20.setForeground(new java.awt.Color(51, 51, 51));
        añoExp20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        añoExp20.setText("año");

        javax.swing.GroupLayout jp_Exp20Layout = new javax.swing.GroupLayout(jp_Exp20);
        jp_Exp20.setLayout(jp_Exp20Layout);
        jp_Exp20Layout.setHorizontalGroup(
            jp_Exp20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Exp20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_Exp20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descripcionExp20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCargo20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jp_Exp20Layout.createSequentialGroup()
                        .addComponent(lblInstitucionExp20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(añoExp20, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jp_Exp20Layout.setVerticalGroup(
            jp_Exp20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Exp20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCargo20, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_Exp20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInstitucionExp20, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(añoExp20, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(descripcionExp20, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        jp_Exp21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblCargo21.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblCargo21.setForeground(new java.awt.Color(51, 51, 51));
        lblCargo21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCargo21.setText("cargo desempeñado");

        lblInstitucionExp21.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblInstitucionExp21.setForeground(new java.awt.Color(51, 51, 51));
        lblInstitucionExp21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInstitucionExp21.setText("institucion");

        descripcionExp21.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        descripcionExp21.setForeground(new java.awt.Color(51, 51, 51));
        descripcionExp21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        descripcionExp21.setText("descripcion");

        añoExp21.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        añoExp21.setForeground(new java.awt.Color(51, 51, 51));
        añoExp21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        añoExp21.setText("año");

        javax.swing.GroupLayout jp_Exp21Layout = new javax.swing.GroupLayout(jp_Exp21);
        jp_Exp21.setLayout(jp_Exp21Layout);
        jp_Exp21Layout.setHorizontalGroup(
            jp_Exp21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Exp21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_Exp21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descripcionExp21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCargo21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jp_Exp21Layout.createSequentialGroup()
                        .addComponent(lblInstitucionExp21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(añoExp21, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jp_Exp21Layout.setVerticalGroup(
            jp_Exp21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Exp21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCargo21, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_Exp21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInstitucionExp21, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(añoExp21, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(descripcionExp21, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jp_Experiencias4Layout = new javax.swing.GroupLayout(jp_Experiencias4);
        jp_Experiencias4.setLayout(jp_Experiencias4Layout);
        jp_Experiencias4Layout.setHorizontalGroup(
            jp_Experiencias4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_Exp17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jp_Exp18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jp_Exp19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jp_Exp20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jp_Exp21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jp_Experiencias4Layout.setVerticalGroup(
            jp_Experiencias4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Experiencias4Layout.createSequentialGroup()
                .addComponent(jp_Exp17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_Exp18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_Exp19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_Exp20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_Exp21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnConfigExps8.setBackground(new java.awt.Color(153, 255, 153));
        btnConfigExps8.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnConfigExps8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/settings24.png"))); // NOI18N
        btnConfigExps8.setText("Gestionar...");

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

        btnConfigExps9.setBackground(new java.awt.Color(153, 255, 153));
        btnConfigExps9.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnConfigExps9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/settings24.png"))); // NOI18N
        btnConfigExps9.setText("Gestionar...");

        jPanel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblNombreRef10.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblNombreRef10.setForeground(new java.awt.Color(51, 51, 51));
        lblNombreRef10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreRef10.setText("Nombre del Referente");

        lblCargoRef10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCargoRef10.setForeground(new java.awt.Color(51, 51, 51));
        lblCargoRef10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCargoRef10.setText("Cargo del Referente");

        lblEmpresaRef10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblEmpresaRef10.setForeground(new java.awt.Color(51, 51, 51));
        lblEmpresaRef10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEmpresaRef10.setText("Empresa del Referente");

        lblTelefonoRef10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTelefonoRef10.setForeground(new java.awt.Color(51, 51, 51));
        lblTelefonoRef10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTelefonoRef10.setText("Telefono del Referente");

        lblCorreoRef10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCorreoRef10.setForeground(new java.awt.Color(51, 51, 51));
        lblCorreoRef10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCorreoRef10.setText("Correo del Referente");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblNombreRef10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCargoRef10, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCorreoRef10, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTelefonoRef10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblEmpresaRef10, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addComponent(lblNombreRef10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCargoRef10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmpresaRef10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCorreoRef10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefonoRef10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 13, Short.MAX_VALUE))
        );

        jPanel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblNombreRef11.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblNombreRef11.setForeground(new java.awt.Color(51, 51, 51));
        lblNombreRef11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreRef11.setText("Nombre del Referente");

        lblCargoRef11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCargoRef11.setForeground(new java.awt.Color(51, 51, 51));
        lblCargoRef11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCargoRef11.setText("Cargo del Referente");

        lblEmpresaRef11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblEmpresaRef11.setForeground(new java.awt.Color(51, 51, 51));
        lblEmpresaRef11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEmpresaRef11.setText("Empresa del Referente");

        lblTelefonoRef11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTelefonoRef11.setForeground(new java.awt.Color(51, 51, 51));
        lblTelefonoRef11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTelefonoRef11.setText("Telefono del Referente");

        lblCorreoRef11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCorreoRef11.setForeground(new java.awt.Color(51, 51, 51));
        lblCorreoRef11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCorreoRef11.setText("Correo del Referente");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblNombreRef11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCargoRef11, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCorreoRef11, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTelefonoRef11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblEmpresaRef11, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addComponent(lblNombreRef11, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCargoRef11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmpresaRef11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCorreoRef11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefonoRef11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 13, Short.MAX_VALUE))
        );

        jPanel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblNombreRef12.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblNombreRef12.setForeground(new java.awt.Color(51, 51, 51));
        lblNombreRef12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreRef12.setText("Nombre del Referente");

        lblCargoRef12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCargoRef12.setForeground(new java.awt.Color(51, 51, 51));
        lblCargoRef12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCargoRef12.setText("Cargo del Referente");

        lblEmpresaRef12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblEmpresaRef12.setForeground(new java.awt.Color(51, 51, 51));
        lblEmpresaRef12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEmpresaRef12.setText("Empresa del Referente");

        lblTelefonoRef12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTelefonoRef12.setForeground(new java.awt.Color(51, 51, 51));
        lblTelefonoRef12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTelefonoRef12.setText("Telefono del Referente");

        lblCorreoRef12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCorreoRef12.setForeground(new java.awt.Color(51, 51, 51));
        lblCorreoRef12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCorreoRef12.setText("Correo del Referente");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblNombreRef12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCargoRef12, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCorreoRef12, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTelefonoRef12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblEmpresaRef12, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addComponent(lblNombreRef12, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCargoRef12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmpresaRef12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCorreoRef12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefonoRef12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        lblFotoperfil1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFotoperfil1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/user_64_.png"))); // NOI18N

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

        btnConfigEstudios5.setBackground(new java.awt.Color(153, 255, 153));
        btnConfigEstudios5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnConfigEstudios5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/settings24.png"))); // NOI18N
        btnConfigEstudios5.setText("Gestionar...");
        btnConfigEstudios5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfigEstudios5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1089, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 187, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, 1089, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConfigEstudios5, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 1089, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConfigEstudios4, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jp_Estudios1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(lblFotoperfil1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblNombres1, javax.swing.GroupLayout.PREFERRED_SIZE, 835, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblProfesion1, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel8Layout.createSequentialGroup()
                            .addGap(149, 149, 149)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jp_Experiencias4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnConfigExps8, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator12, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel36, javax.swing.GroupLayout.Alignment.LEADING))
                                .addComponent(jLabel35)
                                .addComponent(jLabel38)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnConfigExps9, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jSeparator13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1089, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel37, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(0, 240, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(lblNombres1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblProfesion1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addComponent(lblFotoperfil1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConfigEstudios5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(btnConfigEstudios4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_Estudios1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConfigExps8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_Experiencias4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConfigExps9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jp_Perfil3Layout = new javax.swing.GroupLayout(jp_Perfil3);
        jp_Perfil3.setLayout(jp_Perfil3Layout);
        jp_Perfil3Layout.setHorizontalGroup(
            jp_Perfil3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jp_Perfil3Layout.setVerticalGroup(
            jp_Perfil3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jp_PerfilesLayout = new javax.swing.GroupLayout(jp_Perfiles);
        jp_Perfiles.setLayout(jp_PerfilesLayout);
        jp_PerfilesLayout.setHorizontalGroup(
            jp_PerfilesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1480, Short.MAX_VALUE)
            .addGroup(jp_PerfilesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jp_Perfil1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jp_PerfilesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jp_PerfilesLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jp_Perfil2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(93, 93, 93)))
            .addGroup(jp_PerfilesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jp_PerfilesLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jp_Perfil3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jp_PerfilesLayout.setVerticalGroup(
            jp_PerfilesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2876, Short.MAX_VALUE)
            .addGroup(jp_PerfilesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jp_Perfil1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jp_PerfilesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jp_PerfilesLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jp_Perfil2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jp_PerfilesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jp_PerfilesLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jp_Perfil3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jps_Perfil.add(jp_Perfiles, "card2");

        javax.swing.GroupLayout jp_BusquedaLayout = new javax.swing.GroupLayout(jp_Busqueda);
        jp_Busqueda.setLayout(jp_BusquedaLayout);
        jp_BusquedaLayout.setHorizontalGroup(
            jp_BusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1480, Short.MAX_VALUE)
        );
        jp_BusquedaLayout.setVerticalGroup(
            jp_BusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2863, Short.MAX_VALUE)
        );

        jps_Perfil.add(jp_Busqueda, "card3");

        javax.swing.GroupLayout jp_NotificacionesLayout = new javax.swing.GroupLayout(jp_Notificaciones);
        jp_Notificaciones.setLayout(jp_NotificacionesLayout);
        jp_NotificacionesLayout.setHorizontalGroup(
            jp_NotificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1480, Short.MAX_VALUE)
        );
        jp_NotificacionesLayout.setVerticalGroup(
            jp_NotificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2863, Short.MAX_VALUE)
        );

        jps_Perfil.add(jp_Notificaciones, "card4");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jps_Perfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jps_Perfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        scroll1.setViewportView(jPanel1);

        javax.swing.GroupLayout jp_PerfilLayout = new javax.swing.GroupLayout(jp_Perfil);
        jp_Perfil.setLayout(jp_PerfilLayout);
        jp_PerfilLayout.setHorizontalGroup(
            jp_PerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scroll1, javax.swing.GroupLayout.DEFAULT_SIZE, 1323, Short.MAX_VALUE)
        );
        jp_PerfilLayout.setVerticalGroup(
            jp_PerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scroll1, javax.swing.GroupLayout.DEFAULT_SIZE, 2802, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_Titulos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jp_Perfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jp_Titulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_Perfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMiPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMiPerfilActionPerformed
        if (!btnMiPerfil.isSelected()) {
            btnMiPerfil.setSelected(true);
            btnBusqueda.setSelected(false);
            btnNotificaciones.setSelected(false);
            jps_Perfil.nextPanel(10, jp_Perfiles, jps_Perfil.left);
        }
    }//GEN-LAST:event_btnMiPerfilActionPerformed

    private void btnBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusquedaActionPerformed
        if (!btnBusqueda.isSelected()) {
            btnMiPerfil.setSelected(false);
            btnBusqueda.setSelected(true);
            btnNotificaciones.setSelected(false);
            jps_Perfil.nextPanel(10, jp_Busqueda, jps_Perfil.left);
        }
    }//GEN-LAST:event_btnBusquedaActionPerformed

    private void btnNotificacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNotificacionesActionPerformed
        if (!btnNotificaciones.isSelected()) {
            btnMiPerfil.setSelected(false);
            btnBusqueda.setSelected(false);
            btnNotificaciones.setSelected(true);
            jps_Perfil.nextPanel(10, jp_Notificaciones, jps_Perfil.left);
        }
    }//GEN-LAST:event_btnNotificacionesActionPerformed

    private void btnConfigEstudiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfigEstudiosActionPerformed

    }//GEN-LAST:event_btnConfigEstudiosActionPerformed

    private void btnConfigEstudios1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfigEstudios1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConfigEstudios1ActionPerformed

    private void btnConfigEstudios4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfigEstudios4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConfigEstudios4ActionPerformed

    private void btnConfigEstudios5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfigEstudios5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConfigEstudios5ActionPerformed

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
            jp_Habilidades.add(lbl);
            lblHabilidades.add(lbl);
            indice++;
            jp_Habilidades.updateUI();
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
            java.util.logging.Logger.getLogger(frmP_Trabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmP_Trabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmP_Trabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmP_Trabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmP_Trabajador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel añoExp1;
    public static javax.swing.JLabel añoExp10;
    public static javax.swing.JLabel añoExp17;
    public static javax.swing.JLabel añoExp18;
    public static javax.swing.JLabel añoExp19;
    public static javax.swing.JLabel añoExp2;
    public static javax.swing.JLabel añoExp20;
    public static javax.swing.JLabel añoExp21;
    public static javax.swing.JLabel añoExp3;
    public static javax.swing.JLabel añoExp4;
    public static javax.swing.JLabel añoExp5;
    public static javax.swing.JLabel añoExp6;
    public static javax.swing.JLabel añoExp7;
    public static javax.swing.JLabel añoExp8;
    public static javax.swing.JLabel añoExp9;
    private javax.swing.JButton btnBusqueda;
    private javax.swing.JButton btnConfigEstudios;
    private javax.swing.JButton btnConfigEstudios1;
    private javax.swing.JButton btnConfigEstudios4;
    private javax.swing.JButton btnConfigEstudios5;
    private javax.swing.JButton btnConfigExps;
    private javax.swing.JButton btnConfigExps1;
    private javax.swing.JButton btnConfigExps2;
    private javax.swing.JButton btnConfigExps4;
    private javax.swing.JButton btnConfigExps5;
    private javax.swing.JButton btnConfigExps8;
    private javax.swing.JButton btnConfigExps9;
    private javax.swing.JButton btnMiPerfil;
    private javax.swing.JButton btnNotificaciones;
    public static javax.swing.JLabel descripcionExp1;
    public static javax.swing.JLabel descripcionExp10;
    public static javax.swing.JLabel descripcionExp17;
    public static javax.swing.JLabel descripcionExp18;
    public static javax.swing.JLabel descripcionExp19;
    public static javax.swing.JLabel descripcionExp2;
    public static javax.swing.JLabel descripcionExp20;
    public static javax.swing.JLabel descripcionExp21;
    public static javax.swing.JLabel descripcionExp3;
    public static javax.swing.JLabel descripcionExp4;
    public static javax.swing.JLabel descripcionExp5;
    public static javax.swing.JLabel descripcionExp6;
    public static javax.swing.JLabel descripcionExp7;
    public static javax.swing.JLabel descripcionExp8;
    public static javax.swing.JLabel descripcionExp9;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JPanel jp_BarraIzquierda;
    private javax.swing.JPanel jp_Busqueda;
    private javax.swing.JPanel jp_Est1;
    private javax.swing.JPanel jp_Est10;
    private javax.swing.JPanel jp_Est11;
    private javax.swing.JPanel jp_Est12;
    private javax.swing.JPanel jp_Est13;
    private javax.swing.JPanel jp_Est2;
    private javax.swing.JPanel jp_Est20;
    private javax.swing.JPanel jp_Est21;
    private javax.swing.JPanel jp_Est22;
    private javax.swing.JPanel jp_Est23;
    private javax.swing.JPanel jp_Est24;
    private javax.swing.JPanel jp_Est3;
    private javax.swing.JPanel jp_Est4;
    private javax.swing.JPanel jp_Est5;
    private javax.swing.JPanel jp_Est6;
    private javax.swing.JPanel jp_Est7;
    private javax.swing.JPanel jp_Est8;
    private javax.swing.JPanel jp_Est9;
    private javax.swing.JPanel jp_Estudios;
    private javax.swing.JPanel jp_Estudios1;
    private javax.swing.JPanel jp_Estudios2;
    private javax.swing.JPanel jp_Exp1;
    private javax.swing.JPanel jp_Exp10;
    private javax.swing.JPanel jp_Exp17;
    private javax.swing.JPanel jp_Exp18;
    private javax.swing.JPanel jp_Exp19;
    private javax.swing.JPanel jp_Exp2;
    private javax.swing.JPanel jp_Exp20;
    private javax.swing.JPanel jp_Exp21;
    private javax.swing.JPanel jp_Exp3;
    private javax.swing.JPanel jp_Exp4;
    private javax.swing.JPanel jp_Exp5;
    private javax.swing.JPanel jp_Exp6;
    private javax.swing.JPanel jp_Exp7;
    private javax.swing.JPanel jp_Exp8;
    private javax.swing.JPanel jp_Exp9;
    private javax.swing.JPanel jp_Experiencias;
    private javax.swing.JPanel jp_Experiencias1;
    private javax.swing.JPanel jp_Experiencias4;
    public static javax.swing.JPanel jp_Habilidades;
    private javax.swing.JPanel jp_Ixquierda;
    private javax.swing.JPanel jp_Notificaciones;
    private javax.swing.JPanel jp_Perfil;
    private javax.swing.JPanel jp_Perfil1;
    private javax.swing.JPanel jp_Perfil2;
    private javax.swing.JPanel jp_Perfil3;
    private javax.swing.JPanel jp_Perfiles;
    private javax.swing.JPanel jp_Titulos;
    private diu.swe.habib.JPanelSlider.JPanelSlider jps_Perfil;
    public static javax.swing.JTextArea jtxta_Descripcion;
    public static javax.swing.JLabel lblAño1;
    public static javax.swing.JLabel lblAño10;
    public static javax.swing.JLabel lblAño11;
    public static javax.swing.JLabel lblAño12;
    public static javax.swing.JLabel lblAño1_p2;
    public static javax.swing.JLabel lblAño2;
    public static javax.swing.JLabel lblAño2_p2;
    public static javax.swing.JLabel lblAño3;
    public static javax.swing.JLabel lblAño3_p2;
    public static javax.swing.JLabel lblAño4;
    public static javax.swing.JLabel lblAño4_p2;
    public static javax.swing.JLabel lblAño5;
    public static javax.swing.JLabel lblAño5_p2;
    public static javax.swing.JLabel lblAño6;
    public static javax.swing.JLabel lblAño6_p2;
    public static javax.swing.JLabel lblAño7;
    public static javax.swing.JLabel lblAño8;
    public static javax.swing.JLabel lblAño9;
    public static javax.swing.JLabel lblCargo1;
    public static javax.swing.JLabel lblCargo10;
    public static javax.swing.JLabel lblCargo17;
    public static javax.swing.JLabel lblCargo18;
    public static javax.swing.JLabel lblCargo19;
    public static javax.swing.JLabel lblCargo2;
    public static javax.swing.JLabel lblCargo20;
    public static javax.swing.JLabel lblCargo21;
    public static javax.swing.JLabel lblCargo3;
    public static javax.swing.JLabel lblCargo4;
    public static javax.swing.JLabel lblCargo5;
    public static javax.swing.JLabel lblCargo6;
    public static javax.swing.JLabel lblCargo7;
    public static javax.swing.JLabel lblCargo8;
    public static javax.swing.JLabel lblCargo9;
    public static javax.swing.JLabel lblCargoRef1;
    public static javax.swing.JLabel lblCargoRef10;
    public static javax.swing.JLabel lblCargoRef11;
    public static javax.swing.JLabel lblCargoRef12;
    public static javax.swing.JLabel lblCargoRef2;
    public static javax.swing.JLabel lblCargoRef3;
    public static javax.swing.JLabel lblCargoRef4;
    public static javax.swing.JLabel lblCargoRef5;
    public static javax.swing.JLabel lblCargoRef6;
    public static javax.swing.JLabel lblCiudad1;
    public static javax.swing.JLabel lblCiudad10;
    public static javax.swing.JLabel lblCiudad11;
    public static javax.swing.JLabel lblCiudad12;
    public static javax.swing.JLabel lblCiudad1_p2;
    public static javax.swing.JLabel lblCiudad2;
    public static javax.swing.JLabel lblCiudad2_p2;
    public static javax.swing.JLabel lblCiudad3;
    public static javax.swing.JLabel lblCiudad3_p2;
    public static javax.swing.JLabel lblCiudad4;
    public static javax.swing.JLabel lblCiudad4_p2;
    public static javax.swing.JLabel lblCiudad5;
    public static javax.swing.JLabel lblCiudad5_p2;
    public static javax.swing.JLabel lblCiudad6;
    public static javax.swing.JLabel lblCiudad6_p2;
    public static javax.swing.JLabel lblCiudad7;
    public static javax.swing.JLabel lblCiudad8;
    public static javax.swing.JLabel lblCiudad9;
    public static javax.swing.JLabel lblCorreoRef1;
    public static javax.swing.JLabel lblCorreoRef10;
    public static javax.swing.JLabel lblCorreoRef11;
    public static javax.swing.JLabel lblCorreoRef12;
    public static javax.swing.JLabel lblCorreoRef2;
    public static javax.swing.JLabel lblCorreoRef3;
    public static javax.swing.JLabel lblCorreoRef4;
    public static javax.swing.JLabel lblCorreoRef5;
    public static javax.swing.JLabel lblCorreoRef6;
    public static javax.swing.JLabel lblEmpresaRef1;
    public static javax.swing.JLabel lblEmpresaRef10;
    public static javax.swing.JLabel lblEmpresaRef11;
    public static javax.swing.JLabel lblEmpresaRef12;
    public static javax.swing.JLabel lblEmpresaRef2;
    public static javax.swing.JLabel lblEmpresaRef3;
    public static javax.swing.JLabel lblEmpresaRef4;
    public static javax.swing.JLabel lblEmpresaRef5;
    public static javax.swing.JLabel lblEmpresaRef6;
    public static javax.swing.JLabel lblFotoperfil;
    public static javax.swing.JLabel lblFotoperfil1;
    public static javax.swing.JLabel lblFotoperfil2;
    public static javax.swing.JLabel lblId;
    public static javax.swing.JLabel lblInstitucion1;
    public static javax.swing.JLabel lblInstitucion10;
    public static javax.swing.JLabel lblInstitucion11;
    public static javax.swing.JLabel lblInstitucion12;
    public static javax.swing.JLabel lblInstitucion1_p2;
    public static javax.swing.JLabel lblInstitucion2;
    public static javax.swing.JLabel lblInstitucion2_p2;
    public static javax.swing.JLabel lblInstitucion3;
    public static javax.swing.JLabel lblInstitucion3_p2;
    public static javax.swing.JLabel lblInstitucion4;
    public static javax.swing.JLabel lblInstitucion4_p2;
    public static javax.swing.JLabel lblInstitucion5;
    public static javax.swing.JLabel lblInstitucion5_p2;
    public static javax.swing.JLabel lblInstitucion6;
    public static javax.swing.JLabel lblInstitucion6_p2;
    public static javax.swing.JLabel lblInstitucion7;
    public static javax.swing.JLabel lblInstitucion8;
    public static javax.swing.JLabel lblInstitucion9;
    public static javax.swing.JLabel lblInstitucionExp1;
    public static javax.swing.JLabel lblInstitucionExp10;
    public static javax.swing.JLabel lblInstitucionExp17;
    public static javax.swing.JLabel lblInstitucionExp18;
    public static javax.swing.JLabel lblInstitucionExp19;
    public static javax.swing.JLabel lblInstitucionExp2;
    public static javax.swing.JLabel lblInstitucionExp20;
    public static javax.swing.JLabel lblInstitucionExp21;
    public static javax.swing.JLabel lblInstitucionExp3;
    public static javax.swing.JLabel lblInstitucionExp4;
    public static javax.swing.JLabel lblInstitucionExp5;
    public static javax.swing.JLabel lblInstitucionExp6;
    public static javax.swing.JLabel lblInstitucionExp7;
    public static javax.swing.JLabel lblInstitucionExp8;
    public static javax.swing.JLabel lblInstitucionExp9;
    public static javax.swing.JLabel lblNombreRef1;
    public static javax.swing.JLabel lblNombreRef10;
    public static javax.swing.JLabel lblNombreRef11;
    public static javax.swing.JLabel lblNombreRef12;
    public static javax.swing.JLabel lblNombreRef2;
    public static javax.swing.JLabel lblNombreRef3;
    public static javax.swing.JLabel lblNombreRef4;
    public static javax.swing.JLabel lblNombreRef5;
    public static javax.swing.JLabel lblNombreRef6;
    public static javax.swing.JLabel lblNombres;
    public static javax.swing.JLabel lblNombres1;
    public static javax.swing.JLabel lblNombres2;
    public static javax.swing.JLabel lblProfesion;
    public static javax.swing.JLabel lblProfesion1;
    public static javax.swing.JLabel lblProfesion2;
    public static javax.swing.JLabel lblTelefonoRef1;
    public static javax.swing.JLabel lblTelefonoRef10;
    public static javax.swing.JLabel lblTelefonoRef11;
    public static javax.swing.JLabel lblTelefonoRef12;
    public static javax.swing.JLabel lblTelefonoRef2;
    public static javax.swing.JLabel lblTelefonoRef3;
    public static javax.swing.JLabel lblTelefonoRef4;
    public static javax.swing.JLabel lblTelefonoRef5;
    public static javax.swing.JLabel lblTelefonoRef6;
    public static javax.swing.JLabel lblTitulo1;
    public static javax.swing.JLabel lblTitulo10;
    public static javax.swing.JLabel lblTitulo11;
    public static javax.swing.JLabel lblTitulo12;
    public static javax.swing.JLabel lblTitulo1_p2;
    public static javax.swing.JLabel lblTitulo2;
    public static javax.swing.JLabel lblTitulo2_p2;
    public static javax.swing.JLabel lblTitulo3;
    public static javax.swing.JLabel lblTitulo3_p2;
    public static javax.swing.JLabel lblTitulo4;
    public static javax.swing.JLabel lblTitulo4_p2;
    public static javax.swing.JLabel lblTitulo5;
    public static javax.swing.JLabel lblTitulo5_p2;
    public static javax.swing.JLabel lblTitulo6;
    public static javax.swing.JLabel lblTitulo6_p2;
    public static javax.swing.JLabel lblTitulo7;
    public static javax.swing.JLabel lblTitulo8;
    public static javax.swing.JLabel lblTitulo9;
    private javax.swing.JScrollPane scroll1;
    private javax.swing.JScrollPane scrollTxtA;
    // End of variables declaration//GEN-END:variables
}
