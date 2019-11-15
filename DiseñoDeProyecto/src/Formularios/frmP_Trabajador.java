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
        jp_Perfil3 = new javax.swing.JPanel();
        jp_Busqueda = new javax.swing.JPanel();
        jp_Notificaciones = new javax.swing.JPanel();

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
                .addContainerGap(104, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jp_Perfil1Layout = new javax.swing.GroupLayout(jp_Perfil1);
        jp_Perfil1.setLayout(jp_Perfil1Layout);
        jp_Perfil1Layout.setHorizontalGroup(
            jp_Perfil1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Perfil1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 115, Short.MAX_VALUE))
        );
        jp_Perfil1Layout.setVerticalGroup(
            jp_Perfil1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jp_Perfil2Layout = new javax.swing.GroupLayout(jp_Perfil2);
        jp_Perfil2.setLayout(jp_Perfil2Layout);
        jp_Perfil2Layout.setHorizontalGroup(
            jp_Perfil2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1462, Short.MAX_VALUE)
        );
        jp_Perfil2Layout.setVerticalGroup(
            jp_Perfil2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2826, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jp_Perfil3Layout = new javax.swing.GroupLayout(jp_Perfil3);
        jp_Perfil3.setLayout(jp_Perfil3Layout);
        jp_Perfil3Layout.setHorizontalGroup(
            jp_Perfil3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1462, Short.MAX_VALUE)
        );
        jp_Perfil3Layout.setVerticalGroup(
            jp_Perfil3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2826, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jp_PerfilesLayout = new javax.swing.GroupLayout(jp_Perfiles);
        jp_Perfiles.setLayout(jp_PerfilesLayout);
        jp_PerfilesLayout.setHorizontalGroup(
            jp_PerfilesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1462, Short.MAX_VALUE)
            .addGroup(jp_PerfilesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jp_Perfil1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jp_PerfilesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jp_Perfil2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jp_PerfilesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jp_Perfil3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jp_PerfilesLayout.setVerticalGroup(
            jp_PerfilesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2826, Short.MAX_VALUE)
            .addGroup(jp_PerfilesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jp_Perfil1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jp_PerfilesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jp_Perfil2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jp_PerfilesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jp_Perfil3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jps_Perfil.add(jp_Perfiles, "card2");

        javax.swing.GroupLayout jp_BusquedaLayout = new javax.swing.GroupLayout(jp_Busqueda);
        jp_Busqueda.setLayout(jp_BusquedaLayout);
        jp_BusquedaLayout.setHorizontalGroup(
            jp_BusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1462, Short.MAX_VALUE)
        );
        jp_BusquedaLayout.setVerticalGroup(
            jp_BusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2826, Short.MAX_VALUE)
        );

        jps_Perfil.add(jp_Busqueda, "card3");

        javax.swing.GroupLayout jp_NotificacionesLayout = new javax.swing.GroupLayout(jp_Notificaciones);
        jp_Notificaciones.setLayout(jp_NotificacionesLayout);
        jp_NotificacionesLayout.setHorizontalGroup(
            jp_NotificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1462, Short.MAX_VALUE)
        );
        jp_NotificacionesLayout.setVerticalGroup(
            jp_NotificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2826, Short.MAX_VALUE)
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmP_Trabajador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel añoExp1;
    public static javax.swing.JLabel añoExp2;
    public static javax.swing.JLabel añoExp3;
    public static javax.swing.JLabel añoExp4;
    public static javax.swing.JLabel añoExp5;
    private javax.swing.JButton btnBusqueda;
    private javax.swing.JButton btnConfigEstudios;
    private javax.swing.JButton btnConfigExps;
    private javax.swing.JButton btnConfigExps1;
    private javax.swing.JButton btnConfigExps2;
    private javax.swing.JButton btnMiPerfil;
    private javax.swing.JButton btnNotificaciones;
    public static javax.swing.JLabel descripcionExp1;
    public static javax.swing.JLabel descripcionExp2;
    public static javax.swing.JLabel descripcionExp3;
    public static javax.swing.JLabel descripcionExp4;
    public static javax.swing.JLabel descripcionExp5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPanel jp_BarraIzquierda;
    private javax.swing.JPanel jp_Busqueda;
    private javax.swing.JPanel jp_Est1;
    private javax.swing.JPanel jp_Est2;
    private javax.swing.JPanel jp_Est3;
    private javax.swing.JPanel jp_Est4;
    private javax.swing.JPanel jp_Est5;
    private javax.swing.JPanel jp_Est6;
    private javax.swing.JPanel jp_Estudios;
    private javax.swing.JPanel jp_Exp1;
    private javax.swing.JPanel jp_Exp2;
    private javax.swing.JPanel jp_Exp3;
    private javax.swing.JPanel jp_Exp4;
    private javax.swing.JPanel jp_Exp5;
    private javax.swing.JPanel jp_Experiencias;
    public static javax.swing.JPanel jp_Habilidades;
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
    public static javax.swing.JLabel lblAño2;
    public static javax.swing.JLabel lblAño3;
    public static javax.swing.JLabel lblAño4;
    public static javax.swing.JLabel lblAño5;
    public static javax.swing.JLabel lblAño6;
    public static javax.swing.JLabel lblCargo1;
    public static javax.swing.JLabel lblCargo2;
    public static javax.swing.JLabel lblCargo3;
    public static javax.swing.JLabel lblCargo4;
    public static javax.swing.JLabel lblCargo5;
    public static javax.swing.JLabel lblCargoRef1;
    public static javax.swing.JLabel lblCargoRef2;
    public static javax.swing.JLabel lblCargoRef3;
    public static javax.swing.JLabel lblCiudad1;
    public static javax.swing.JLabel lblCiudad2;
    public static javax.swing.JLabel lblCiudad3;
    public static javax.swing.JLabel lblCiudad4;
    public static javax.swing.JLabel lblCiudad5;
    public static javax.swing.JLabel lblCiudad6;
    public static javax.swing.JLabel lblCorreoRef1;
    public static javax.swing.JLabel lblCorreoRef2;
    public static javax.swing.JLabel lblCorreoRef3;
    public static javax.swing.JLabel lblEmpresaRef1;
    public static javax.swing.JLabel lblEmpresaRef2;
    public static javax.swing.JLabel lblEmpresaRef3;
    public static javax.swing.JLabel lblFotoperfil;
    public static javax.swing.JLabel lblId;
    public static javax.swing.JLabel lblInstitucion1;
    public static javax.swing.JLabel lblInstitucion2;
    public static javax.swing.JLabel lblInstitucion3;
    public static javax.swing.JLabel lblInstitucion4;
    public static javax.swing.JLabel lblInstitucion5;
    public static javax.swing.JLabel lblInstitucion6;
    public static javax.swing.JLabel lblInstitucionExp1;
    public static javax.swing.JLabel lblInstitucionExp2;
    public static javax.swing.JLabel lblInstitucionExp3;
    public static javax.swing.JLabel lblInstitucionExp4;
    public static javax.swing.JLabel lblInstitucionExp5;
    public static javax.swing.JLabel lblNombreRef1;
    public static javax.swing.JLabel lblNombreRef2;
    public static javax.swing.JLabel lblNombreRef3;
    public static javax.swing.JLabel lblNombres;
    public static javax.swing.JLabel lblProfesion;
    public static javax.swing.JLabel lblTelefonoRef1;
    public static javax.swing.JLabel lblTelefonoRef2;
    public static javax.swing.JLabel lblTelefonoRef3;
    public static javax.swing.JLabel lblTitulo1;
    public static javax.swing.JLabel lblTitulo2;
    public static javax.swing.JLabel lblTitulo3;
    public static javax.swing.JLabel lblTitulo4;
    public static javax.swing.JLabel lblTitulo5;
    public static javax.swing.JLabel lblTitulo6;
    private javax.swing.JScrollPane scroll1;
    private javax.swing.JScrollPane scrollTxtA;
    // End of variables declaration//GEN-END:variables
}
