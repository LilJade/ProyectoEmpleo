package Formularios;

import java.awt.Color;
import java.awt.Font;
import AppPackage.AnimationClass;
import Consultas.ConsultasEmpresa;
import Consultas.ConsultasTrabajador;
import Entidades.Empresa;
import Entidades.Trabajador;
import Utilidades.EstiloTabla;
import com.placeholder.PlaceHolder;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmVisitante extends javax.swing.JFrame {

    //instancia y creacion de objetos clases correspondientes  
    ConsultasEmpresa cEmpresa = new ConsultasEmpresa();
    ConsultasTrabajador cTrabajador = new ConsultasTrabajador();
    Empresa eEmpresa = new Empresa();
    Trabajador eTrabajador = new Trabajador();
    frmR_Empresa formEmpresa = new frmR_Empresa();

    PlaceHolder holder;

    public static int id = 0;
    public static int estilo = 0;

    public frmVisitante() {
        initComponents();
        btnEntrar.setEnabled(false);

        idEmp.setVisible(false);
        lblNombreEmpresa.setText("");

        this.setLocationRelativeTo(null);
        this.setTitle("Work Search Engine v0.1");
        btnAyuda.setToolTipText("Ayuda");
        btnCancelar.setToolTipText("Cerrar");
        lbMinimizar.setToolTipText("Minimizar");
        holder = new PlaceHolder(txtUsuario, "CORREO ELECTRONICO");
        holder = new PlaceHolder(txtContraseña, "CONTRASEÑA");
        this.lbOjo2.setVisible(false);

        /*prueba*/
//        PromptSupport.setPrompt("Escriba aqui", txtUsuario);
//        PromptSupport.setPrompt("Contraseña", txtContraseña);
        Font fuente = new Font("Arial Narrow", 3, 19);
        txtUsuario.setFont(fuente);
        txtUsuario.setForeground(new java.awt.Color(26, 99, 66));
        txtContraseña.setFont(fuente);
        txtContraseña.setForeground(new java.awt.Color(26, 99, 66));

        jtblMostrarEmpresas.getColumnModel().getColumn(0).setHeaderRenderer(new EstiloTabla(new Color(0, 0, 51), Color.WHITE));
        jtblMostrarEmpresas.getColumnModel().getColumn(1).setHeaderRenderer(new EstiloTabla(new Color(0, 0, 51), Color.WHITE));
        jtblMostrarEmpresas.getColumnModel().getColumn(2).setHeaderRenderer(new EstiloTabla(new Color(0, 0, 51), Color.WHITE));
        jtblMostrarEmpresas.getColumnModel().getColumn(3).setHeaderRenderer(new EstiloTabla(new Color(0, 0, 51), Color.WHITE));

        CargarTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rdgEntidad = new javax.swing.ButtonGroup();
        jpOpcion = new javax.swing.JPanel();
        btnEmpresa = new javax.swing.JButton();
        btnAdolescente = new javax.swing.JButton();
        btnAdulto = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        btnLista = new javax.swing.JButton();
        jpVista = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblMostrarEmpresas = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        lblImgEmpresa = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lblNombreEmpresa = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        idEmp = new javax.swing.JLabel();
        jpnlTitular = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        lbMinimizar = new javax.swing.JLabel();
        btnAyuda = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        pnlSesion = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JPasswordField();
        txtUsuario = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        lbOjo1 = new javax.swing.JLabel();
        lbOjo2 = new javax.swing.JLabel();
        rtnEmpresa = new javax.swing.JRadioButton();
        rtnTrabajador = new javax.swing.JRadioButton();
        lblUsuario2 = new javax.swing.JLabel();
        lblContraseña = new javax.swing.JLabel();
        lblContraseña2 = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        btnEditarFoto = new javax.swing.JButton();
        jpnlAcercaDe = new javax.swing.JPanel();
        btnEntrar = new javax.swing.JButton();

        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpOpcion.setBackground(new java.awt.Color(0, 0, 51));
        jpOpcion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(132, 206, 255), 4));
        jpOpcion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEmpresa.setBackground(new java.awt.Color(247, 211, 3));
        btnEmpresa.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        btnEmpresa.setForeground(new java.awt.Color(204, 204, 0));
        btnEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Empresa_32.png"))); // NOI18N
        btnEmpresa.setText("Empresa");
        btnEmpresa.setBorder(null);
        btnEmpresa.setContentAreaFilled(false);
        btnEmpresa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEmpresa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEmpresa.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Empresa_32.png"))); // NOI18N
        btnEmpresa.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/empresa_64.png"))); // NOI18N
        btnEmpresa.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnEmpresa.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEmpresa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEmpresaMouseClicked(evt);
            }
        });
        btnEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpresaActionPerformed(evt);
            }
        });
        jpOpcion.add(btnEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(-85, 150, 100, 90));

        btnAdolescente.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        btnAdolescente.setForeground(new java.awt.Color(255, 153, 0));
        btnAdolescente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/estudiante_32.png"))); // NOI18N
        btnAdolescente.setText("Estudiante");
        btnAdolescente.setBorder(null);
        btnAdolescente.setContentAreaFilled(false);
        btnAdolescente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdolescente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAdolescente.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/estudiante_32.png"))); // NOI18N
        btnAdolescente.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/estudiante_64.png"))); // NOI18N
        btnAdolescente.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnAdolescente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jpOpcion.add(btnAdolescente, new org.netbeans.lib.awtextra.AbsoluteConstraints(-85, 350, 100, 90));

        btnAdulto.setBackground(new java.awt.Color(40, 20, 67));
        btnAdulto.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        btnAdulto.setForeground(new java.awt.Color(255, 153, 0));
        btnAdulto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/empleado_32.png"))); // NOI18N
        btnAdulto.setText("Adulto");
        btnAdulto.setBorder(null);
        btnAdulto.setContentAreaFilled(false);
        btnAdulto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdulto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAdulto.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/empleado_32.png"))); // NOI18N
        btnAdulto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/empleado_64.png"))); // NOI18N
        btnAdulto.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnAdulto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAdulto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdultoActionPerformed(evt);
            }
        });
        jpOpcion.add(btnAdulto, new org.netbeans.lib.awtextra.AbsoluteConstraints(-85, 250, 100, 90));

        jSeparator3.setForeground(new java.awt.Color(132, 206, 255));
        jpOpcion.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 220, 20));

        btnLista.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btnLista.setForeground(new java.awt.Color(255, 255, 255));
        btnLista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/user_32_.png"))); // NOI18N
        btnLista.setText("REGISTRAR");
        btnLista.setBorder(null);
        btnLista.setContentAreaFilled(false);
        btnLista.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLista.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLista.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/user_32_.png"))); // NOI18N
        btnLista.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/user_64_.png"))); // NOI18N
        btnLista.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnLista.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnListaMouseClicked(evt);
            }
        });
        btnLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaActionPerformed(evt);
            }
        });
        jpOpcion.add(btnLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 190, 90));

        getContentPane().add(jpOpcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 230, 530));

        jpVista.setBackground(new java.awt.Color(0, 0, 51));
        jpVista.setForeground(new java.awt.Color(26, 99, 66));
        jpVista.setToolTipText("");
        jpVista.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtblMostrarEmpresas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 51)));
        jtblMostrarEmpresas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtblMostrarEmpresas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtblMostrarEmpresasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtblMostrarEmpresas);

        jpVista.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 640, 360));

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));

        lblImgEmpresa.setText("jLabel3");

        jButton1.setBackground(new java.awt.Color(0, 0, 51));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Visitar el Perfil de la Empresa");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblNombreEmpresa.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        lblNombreEmpresa.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreEmpresa.setText("Empresa");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Nombre de la Empresa:");

        idEmp.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        idEmp.setForeground(new java.awt.Color(255, 255, 255));
        idEmp.setText("id: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(idEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
                    .addComponent(lblNombreEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(lblImgEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblImgEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 20, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(idEmp))
                        .addGap(18, 18, 18)
                        .addComponent(lblNombreEmpresa)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jpVista.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 640, 170));

        getContentPane().add(jpVista, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 650, 530));

        jpnlTitular.setBackground(new java.awt.Color(93, 0, 93));
        jpnlTitular.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa_24.png"))); // NOI18N
        jpnlTitular.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 20, -1, 30));

        btnCancelar.setBackground(new java.awt.Color(93, 0, 93));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar_24.png"))); // NOI18N
        btnCancelar.setBorder(null);
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCancelarMouseExited(evt);
            }
        });
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jpnlTitular.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 10, 30, 30));

        jSeparator4.setBackground(new java.awt.Color(255, 153, 0));
        jSeparator4.setForeground(new java.awt.Color(255, 153, 0));
        jpnlTitular.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 320, 10));

        lbMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/minimizar_24.png"))); // NOI18N
        lbMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbMinimizarMouseClicked(evt);
            }
        });
        jpnlTitular.add(lbMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 10, 30, 30));

        btnAyuda.setForeground(new java.awt.Color(251, 120, 32));
        btnAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ayuda_24.png"))); // NOI18N
        btnAyuda.setBorder(null);
        btnAyuda.setContentAreaFilled(false);
        btnAyuda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAyuda.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAyuda.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnAyuda.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAyuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAyudaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAyudaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAyudaMouseExited(evt);
            }
        });
        btnAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAyudaActionPerformed(evt);
            }
        });
        jpnlTitular.add(btnAyuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 40, -1));

        txtBuscar.setBackground(new java.awt.Color(93, 0, 93));
        txtBuscar.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        txtBuscar.setForeground(new java.awt.Color(255, 153, 0));
        txtBuscar.setBorder(null);
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });
        jpnlTitular.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 320, 30));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 0));
        jLabel3.setText("Buscar: ");
        jpnlTitular.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, -1));

        getContentPane().add(jpnlTitular, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 60));

        pnlSesion.setBackground(new java.awt.Color(248, 248, 244));
        pnlSesion.setDoubleBuffered(false);
        pnlSesion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(26, 99, 66));
        jLabel1.setText("USUARIO:");
        pnlSesion.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(26, 99, 66));
        jLabel2.setText("CONTRASEÑA:");
        pnlSesion.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(26, 99, 66));
        pnlSesion.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 230, 10));

        jSeparator2.setBackground(new java.awt.Color(26, 99, 66));
        pnlSesion.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 230, 10));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuario_24.png"))); // NOI18N
        pnlSesion.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 30, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bloquear_24.png"))); // NOI18N
        pnlSesion.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 30, 30));

        txtContraseña.setBackground(new java.awt.Color(248, 248, 244));
        txtContraseña.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        txtContraseña.setForeground(new java.awt.Color(26, 99, 66));
        txtContraseña.setBorder(null);
        txtContraseña.setDisabledTextColor(new java.awt.Color(26, 99, 66));
        txtContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtContraseñaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContraseñaKeyTyped(evt);
            }
        });
        pnlSesion.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 190, 30));

        txtUsuario.setBackground(new java.awt.Color(248, 248, 244));
        txtUsuario.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(26, 99, 66));
        txtUsuario.setBorder(null);
        txtUsuario.setDisabledTextColor(new java.awt.Color(26, 99, 66));
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyTyped(evt);
            }
        });
        pnlSesion.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 200, 30));
        pnlSesion.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, 150, 60, 30));

        jSeparator7.setBackground(new java.awt.Color(26, 99, 66));
        jSeparator7.setForeground(new java.awt.Color(26, 99, 66));
        pnlSesion.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 90, 10));

        lbOjo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ojo_16.png"))); // NOI18N
        lbOjo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbOjo1MousePressed(evt);
            }
        });
        pnlSesion.add(lbOjo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, 20, 20));

        lbOjo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ojo.tachado_16.png"))); // NOI18N
        lbOjo2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbOjo2MousePressed(evt);
            }
        });
        pnlSesion.add(lbOjo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, -1, -1));

        rdgEntidad.add(rtnEmpresa);
        rtnEmpresa.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        rtnEmpresa.setForeground(new java.awt.Color(26, 99, 66));
        rtnEmpresa.setText("Empresa");
        pnlSesion.add(rtnEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        rdgEntidad.add(rtnTrabajador);
        rtnTrabajador.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        rtnTrabajador.setForeground(new java.awt.Color(26, 99, 66));
        rtnTrabajador.setText("Trabajador");
        pnlSesion.add(rtnTrabajador, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, -1, -1));

        lblUsuario2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lblUsuario2.setForeground(new java.awt.Color(255, 0, 51));
        pnlSesion.add(lblUsuario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 240, 20));

        lblContraseña.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lblContraseña.setForeground(new java.awt.Color(255, 0, 0));
        pnlSesion.add(lblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 260, 20));

        lblContraseña2.setForeground(new java.awt.Color(255, 0, 51));
        pnlSesion.add(lblContraseña2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 230, 20));

        lblUsuario.setForeground(new java.awt.Color(255, 0, 0));
        pnlSesion.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 230, 20));

        jSeparator8.setBackground(new java.awt.Color(26, 99, 66));
        jSeparator8.setForeground(new java.awt.Color(26, 99, 66));
        pnlSesion.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 90, 10));

        btnEditarFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuarioNEW_128.png"))); // NOI18N
        btnEditarFoto.setBorder(null);
        btnEditarFoto.setContentAreaFilled(false);
        btnEditarFoto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEditarFoto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEditarFoto.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnEditarFoto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        pnlSesion.add(btnEditarFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 140, 130));

        getContentPane().add(pnlSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, -20, 320, 530));

        jpnlAcercaDe.setBackground(new java.awt.Color(93, 0, 93));
        jpnlAcercaDe.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEntrar.setBackground(new java.awt.Color(93, 0, 93));
        btnEntrar.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        btnEntrar.setForeground(new java.awt.Color(255, 255, 255));
        btnEntrar.setText("Entrar");
        btnEntrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(38, 153, 102), 3));
        btnEntrar.setContentAreaFilled(false);
        btnEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        jpnlAcercaDe.add(btnEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 220, 60));

        getContentPane().add(jpnlAcercaDe, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 510, 320, 80));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyudaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAyudaActionPerformed

    private void btnAyudaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAyudaMouseEntered

    }//GEN-LAST:event_btnAyudaMouseEntered

    private void btnAyudaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAyudaMouseExited

    }//GEN-LAST:event_btnAyudaMouseExited

    private void btnCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseEntered
        //cambio de color en los botones.
        btnCancelar.setBackground(Color.red);

    }//GEN-LAST:event_btnCancelarMouseEntered

    private void btnCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseExited
        btnCancelar.setBackground(new Color(93, 0, 93));
    }//GEN-LAST:event_btnCancelarMouseExited

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        int dialog = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null, "Desea salir ? ", "exit", dialog);
        if (result == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnCancelarMouseClicked

    private void lbMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbMinimizarMouseClicked
        this.setState(frmVisitante.ICONIFIED);
    }//GEN-LAST:event_lbMinimizarMouseClicked

    private void btnAyudaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAyudaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAyudaMouseClicked

    private void lbOjo1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbOjo1MousePressed
        lbOjo2.setVisible(true);
        lbOjo1.setVisible(false);
        txtContraseña.setEchoChar((char) 0);
    }//GEN-LAST:event_lbOjo1MousePressed

    private void lbOjo2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbOjo2MousePressed
        lbOjo1.setVisible(true);
        lbOjo2.setVisible(false);
        txtContraseña.setEchoChar('*');
    }//GEN-LAST:event_lbOjo2MousePressed

    private void btnListaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnListaMouseClicked
        //---------------------->
        AnimationClass empresa = new AnimationClass();
        empresa.jButtonXRight(-85, 70, 5, 5, btnEmpresa);
        AnimationClass adulto = new AnimationClass();
        adulto.jButtonXRight(-85, 70, 5, 5, btnAdulto);
        AnimationClass adolescente = new AnimationClass();
        adolescente.jButtonXRight(-85, 70, 5, 5, btnAdolescente);
        //<---------
        AnimationClass empressa = new AnimationClass();
        empressa.jButtonXLeft(70, -85, 5, 5, btnEmpresa);
        AnimationClass adultoo = new AnimationClass();
        adultoo.jButtonXLeft(70, -85, 5, 5, btnAdulto);
        AnimationClass adolescentee = new AnimationClass();
        adolescentee.jButtonXLeft(70, -85, 5, 5, btnAdolescente);
    }//GEN-LAST:event_btnListaMouseClicked

    private void btnListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnListaActionPerformed

    public void buscandoEmpresa(String nombre) {
        String title[] = {"Id", "Nombre De Empresa", "Acronimo", "Departamento"};
        DefaultTableModel df = new DefaultTableModel(null, title);
        ConsultasEmpresa cEmp = new ConsultasEmpresa();
        ArrayList<Empresa> ResultadoBusqueda = cEmp.BuscarEmpresaV(nombre);
        Iterator i = ResultadoBusqueda.iterator();
        String filas[] = new String[5];

        while (i.hasNext()) {
            Empresa emp;
            emp = (Empresa) i.next();
            filas[0] = String.valueOf(emp.getIdEmpresa());
            filas[1] = emp.getNombre();
            filas[2] = emp.getAcronimo();
            filas[3] = emp.getDepartamento();
            df.addRow(filas);
        }

        jtblMostrarEmpresas.setModel(df);
    }

    public void CargarTable() {
        String titulos[] = {"Id", "Nombre De Empresa", "Acronimo", "Departamento"};
        DefaultTableModel df = new DefaultTableModel(null, titulos);
        ConsultasEmpresa cEmp = new ConsultasEmpresa();
        ArrayList<Empresa> PS = cEmp.mostrarEmpresasVisitante();
        Iterator i = PS.iterator();
        String filas[] = new String[5];
        while (i.hasNext()) {
            Empresa emp;

            emp = (Empresa) i.next();
            filas[0] = String.valueOf(emp.getIdEmpresa());
            filas[1] = emp.getNombre();
            filas[2] = emp.getAcronimo();
            filas[3] = emp.getDepartamento();
            df.addRow(filas);
        }
        jtblMostrarEmpresas.setModel(df);
    }


    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed

        //if (!txtUsuario.getText().equals("CORREO ELECTRONICO") || !txtUsuario.getText().isEmpty()) {
        if (rtnEmpresa.isSelected()) {
            eEmpresa.setCorreo(txtUsuario.getText());
            eEmpresa.setContraseña(txtContraseña.getText());
            cEmpresa.ValidarEmpresa(eEmpresa);

        } else if (rtnTrabajador.isSelected()) {
            eTrabajador.setCorreo(txtUsuario.getText());
            eTrabajador.setPass(txtContraseña.getText());
            this.id = cTrabajador.ValidarTrabajador(eTrabajador);

            if (id != 0) {
                this.estilo = cTrabajador.consultarEstiloTrabajador(this.id);
                frmP_Trabajador frmP_Tr = new frmP_Trabajador();
                frmP_Tr.setVisible(true);
                this.dispose();
            }

        } else {
            JOptionPane.showMessageDialog(null, "Por favor elige entre ingresar como Empresa o como Trabajador.");
        }
        //} else {
        //JOptionPane.showMessageDialog(null, "Asegurate de rellenar los campos necesarios!");
        //}

    }//GEN-LAST:event_btnEntrarActionPerformed

    private void txtUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyTyped
        if (txtUsuario.getText().length() >= 150) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
            lblUsuario.setText("Limite permitido de caracteres 150");
        } else {
            lblUsuario.setText("");
        }
    }//GEN-LAST:event_txtUsuarioKeyTyped

    private void txtContraseñaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContraseñaKeyTyped
        if (txtContraseña.getText().length() >= 50) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
            lblContraseña.setText("Limite permitido de caracteres 50");
        } else {
            lblContraseña.setText("");
        }
    }//GEN-LAST:event_txtContraseñaKeyTyped

    //validacion Login
    public void ValidacionLogin() {
        if (!txtUsuario.getText().equals("") && !txtContraseña.getText().equals("")
                && !txtUsuario.getText().equals("CORREO ELECTRONICO") && !txtContraseña.getText().equals("CONTRASEÑA")) {
            btnEntrar.setEnabled(true);
        } else {
            btnEntrar.setEnabled(false);
        }
    }

    //validacion txtUsuario
    private void txtUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyReleased

        if (txtUsuario.getText().equals("") || txtUsuario.getText().equals("CORREO ELECTRONICO")) {
            lblUsuario2.setText("Campo Requerido");
        } else {
            lblUsuario2.setText("");
        }

        ValidacionLogin();
    }//GEN-LAST:event_txtUsuarioKeyReleased

    //validacion txtContraseña
    private void txtContraseñaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContraseñaKeyReleased

        if (txtContraseña.getText().equals("") || txtContraseña.getText().equals("CONTRASEÑA")) {
            lblContraseña2.setText("Campo Requerido");
        } else {
            lblContraseña2.setText("");
        }

        ValidacionLogin();
    }//GEN-LAST:event_txtContraseñaKeyReleased

    private void btnAdultoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdultoActionPerformed

        frmR_Trabajador V = new frmR_Trabajador();
        V.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAdultoActionPerformed

    private void btnEmpresaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEmpresaMouseClicked
        frmR_Empresa V = new frmR_Empresa();
        V.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnEmpresaMouseClicked

    private void btnEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpresaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEmpresaActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void jtblMostrarEmpresasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtblMostrarEmpresasMouseClicked
        lblImgEmpresa.setIcon(null);
        lblImgEmpresa.repaint();
        //  lblfoto.setText("SIN IMAGEN");\
        ConsultasEmpresa cEmp = new ConsultasEmpresa();
        String id = String.valueOf(jtblMostrarEmpresas.getModel().getValueAt(jtblMostrarEmpresas.getSelectedRow(), 0));
        idEmp.setText(id);
        ArrayList<Empresa> PS = cEmp.MostrarFotos(id);
        Iterator i = PS.iterator();
        while (i.hasNext()) {
            Empresa emp;
            emp = (Empresa) i.next();
            byte[] img = emp.getImPerfil();
            System.err.println(img);
            if (img != null) {
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(lblImgEmpresa.getWidth(), lblImgEmpresa.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                lblImgEmpresa.setIcon(newImage);
            } else {
                lblImgEmpresa.setText("SIN IMAGEN");
            }
        }
        String nombreEmp = String.valueOf(jtblMostrarEmpresas.getModel().getValueAt(jtblMostrarEmpresas.getSelectedRow(), 1));
//        String acronimoEmp = String.valueOf(jtblMostrarEmpresas.getModel().getValueAt(jtblMostrarEmpresas.getSelectedRow(), 2));
//        String departEmp = String.valueOf(jtblMostrarEmpresas.getModel().getValueAt(jtblMostrarEmpresas.getSelectedRow(), 3));

        lblNombreEmpresa.setText(nombreEmp);

        CargarTable();
    }//GEN-LAST:event_jtblMostrarEmpresasMouseClicked

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        String busq = txtBuscar.getText();

        buscandoEmpresa(busq);
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (lblNombreEmpresa.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Selecciona la empresa que deseas visitar.", "¡Te invitamos a registrarte!", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Para poder acceder a los perfiles de las empresas debes estar registrado.", "¡Te invitamos a registrarte!", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(frmVisitante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmVisitante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmVisitante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmVisitante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new frmVisitante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdolescente;
    private javax.swing.JButton btnAdulto;
    private javax.swing.JButton btnAyuda;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditarFoto;
    private javax.swing.JButton btnEmpresa;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnLista;
    private javax.swing.JLabel idEmp;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JPanel jpOpcion;
    private javax.swing.JPanel jpVista;
    private javax.swing.JPanel jpnlAcercaDe;
    private javax.swing.JPanel jpnlTitular;
    private javax.swing.JTable jtblMostrarEmpresas;
    private javax.swing.JLabel lbMinimizar;
    private javax.swing.JLabel lbOjo1;
    private javax.swing.JLabel lbOjo2;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblContraseña2;
    public static javax.swing.JLabel lblImgEmpresa;
    public static javax.swing.JLabel lblNombreEmpresa;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lblUsuario2;
    private javax.swing.JPanel pnlSesion;
    private javax.swing.ButtonGroup rdgEntidad;
    private javax.swing.JRadioButton rtnEmpresa;
    private javax.swing.JRadioButton rtnTrabajador;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
