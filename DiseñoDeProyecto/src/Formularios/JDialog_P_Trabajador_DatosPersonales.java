package Formularios;

import Consultas.ConsultasTrabajador;
import Entidades.Trabajador;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import java.io.File;
import java.nio.file.Files;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import rojerusan.RSAnimation;

public class JDialog_P_Trabajador_DatosPersonales extends javax.swing.JDialog {

    ConsultasTrabajador cTr = new ConsultasTrabajador();
    File file;

    public JDialog_P_Trabajador_DatosPersonales(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
//        txtEstilo.setText(String.valueOf());
        txtIdTrabajador.setText(String.valueOf(frmVisitante.id));
        System.out.println("id: " + frmVisitante.id);
        txtIdTrabajador.setVisible(false);
        RSAnimation.setMoverDerecha(-700, 500, 0, 2, this);

        btnCambiarImg.setVisible(false);
        txtNombresTrab.setEnabled(false);
        txtApellidosTrab.setEnabled(false);
        txtDescrTrab.setEnabled(false);
        txtDireccionTrab.setEnabled(false);
        txtEdadTrab.setEnabled(false);
        txtSexoTrab.setEnabled(false);
        txtCorreoTrab.setEnabled(false);
        txtContraseñaTrab.setEnabled(false);
        txtTelefTrab.setEnabled(false);
        txtCelTrab.setEnabled(false);
        jLabel9.setVisible(false);
        txConfirContraseñaTrab.setVisible(false);
        btnEditar.setEnabled(true);
        btnCancelar.setEnabled(false);
        btnGuardar.setEnabled(false);
        txtUrl.setVisible(false);
        cTr.editarDatosTrabajador(String.valueOf(frmVisitante.id));
        lblCambio.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtIdTrabajador = new javax.swing.JTextField();
        btnAtras = new javax.swing.JButton();
        txtEstilo = new javax.swing.JTextField();
        lblCambio = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnGuardar1 = new javax.swing.JButton();
        txtNombresTrab = new javax.swing.JTextField();
        txtApellidosTrab = new javax.swing.JTextField();
        txtDescrTrab = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtSexoTrab = new javax.swing.JTextField();
        txtEdadTrab = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblImgPerfilTrab = new javax.swing.JLabel();
        txtDireccionTrab = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtTelefTrab = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtCelTrab = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtCorreoTrab = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnCambiarImg = new javax.swing.JButton();
        txtContraseñaTrab = new javax.swing.JPasswordField();
        txConfirContraseñaTrab = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        txtUrl = new javax.swing.JTextField();

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/experiencia_laboral64.png"))); // NOI18N

        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(48, 62, 71), 2));
        jTable1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "EXPERIENCIA 1", "EXPERIENCIA 2", "EXPERIENCIA 3", "EXPERIENCIA 4", "EXPERIECIA 5"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(48, 62, 71));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(247, 211, 3), 2));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("INFORMACION PERSONAL");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 400, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/experiencia_laboral64.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 60, 60));
        jPanel1.add(txtIdTrabajador, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 20, 51, 30));

        btnAtras.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btnAtras.setForeground(new java.awt.Color(240, 240, 240));
        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/regresar_24.png"))); // NOI18N
        btnAtras.setText("ATRÁS");
        btnAtras.setContentAreaFilled(false);
        btnAtras.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAtras.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnAtras.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        jPanel1.add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 0, 111, 60));
        jPanel1.add(txtEstilo, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, 51, 30));

        lblCambio.setText("jLabel4");
        jPanel1.add(lblCambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 20, -1, -1));

        jPanel2.setBackground(new java.awt.Color(48, 62, 71));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(247, 211, 3), 2));

        btnGuardar.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(240, 240, 240));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/actualizar_24.png"))); // NOI18N
        btnGuardar.setText("GUARDAR CAMBIOS");
        btnGuardar.setContentAreaFilled(false);
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(240, 240, 240));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar_24.png"))); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancelar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnCancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnEditar.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(240, 240, 240));
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/insertar_24.png"))); // NOI18N
        btnEditar.setText("EDITAR MI INFORMACIÓN");
        btnEditar.setContentAreaFilled(false);
        btnEditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEditar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnEditar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnGuardar1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btnGuardar1.setForeground(new java.awt.Color(240, 240, 240));
        btnGuardar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/actualizar_24.png"))); // NOI18N
        btnGuardar1.setText("CAMBIAR FOTO DE PERFIL");
        btnGuardar1.setContentAreaFilled(false);
        btnGuardar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardar1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnGuardar1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGuardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardar1)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar)
                .addGap(18, 18, 18)
                .addComponent(btnGuardar)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnGuardar1, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        txtNombresTrab.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        txtNombresTrab.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombresTrabKeyTyped(evt);
            }
        });

        txtApellidosTrab.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        txtApellidosTrab.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidosTrabKeyTyped(evt);
            }
        });

        txtDescrTrab.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        txtDescrTrab.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDescrTrabKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Mis nombres: ");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setText("Mis Apellidos: ");

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setText("Yo me describo:");

        txtSexoTrab.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        txtSexoTrab.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSexoTrabKeyTyped(evt);
            }
        });

        txtEdadTrab.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        txtEdadTrab.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEdadTrabKeyTyped(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel14.setText("Mi genero: ");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Mi edad: ");

        txtDireccionTrab.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        txtDireccionTrab.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDireccionTrabKeyTyped(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel15.setText("Mi dirección:");

        txtTelefTrab.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        txtTelefTrab.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefTrabKeyTyped(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel16.setText("Mi numero de Telefono: ");

        txtCelTrab.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        txtCelTrab.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCelTrabKeyTyped(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel17.setText("Mi numero de Celular: ");

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel18.setText("Mi foto de perfil: ");

        txtCorreoTrab.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        txtCorreoTrab.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCorreoTrabKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("Mi Correo Electronico:");
        jLabel7.setToolTipText("");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("Mi Contraseña:");
        jLabel8.setToolTipText("");

        btnCambiarImg.setText("Elegir una imagen de perfil");
        btnCambiarImg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCambiarImgMouseClicked(evt);
            }
        });
        btnCambiarImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarImgActionPerformed(evt);
            }
        });

        txtContraseñaTrab.setText("jPasswordField1");
        txtContraseñaTrab.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContraseñaTrabKeyTyped(evt);
            }
        });

        txConfirContraseñaTrab.setText("jPasswordField1");
        txConfirContraseñaTrab.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txConfirContraseñaTrabKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setText("Confirmar mi Contraseña:");
        jLabel9.setToolTipText("");

        txtUrl.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1174, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombresTrab, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtApellidosTrab, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtDescrTrab)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtEdadTrab))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSexoTrab, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14)))
                            .addComponent(jLabel16)
                            .addComponent(txtTelefTrab, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)
                            .addComponent(txtCelTrab, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblImgPerfilTrab, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addGap(23, 23, 23)))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDireccionTrab)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtCorreoTrab, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtUrl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(btnCambiarImg))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtContraseñaTrab)
                                            .addComponent(txConfirContraseñaTrab, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombresTrab)
                    .addComponent(txtApellidosTrab)
                    .addComponent(txtDescrTrab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDireccionTrab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTelefTrab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCelTrab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtContraseñaTrab)
                                    .addComponent(txtCorreoTrab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txConfirContraseñaTrab, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtUrl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnCambiarImg))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(jLabel14)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtEdadTrab)
                                    .addComponent(txtSexoTrab))
                                .addGap(4, 4, 4))
                            .addComponent(lblImgPerfilTrab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(5, 5, 5)))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        try {
            //btnAtras
            frmP_Trabajador.Datos(Integer.parseInt(txtIdTrabajador.getText()));
            RSAnimation.setMoverIzquierda(500, -900, 0, 2, this);
            Thread.sleep(1000);
            this.dispose();
        } catch (InterruptedException ex) {
            Logger.getLogger(JDialog_P_Trabajador_DatosPersonales.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        btnCambiarImg.setVisible(true);
        txtNombresTrab.setEnabled(true);
        txtApellidosTrab.setEnabled(true);
        txtDescrTrab.setEnabled(true);
        txtDireccionTrab.setEnabled(true);
        txtEdadTrab.setEnabled(true);
        txtSexoTrab.setEnabled(true);
        txtCorreoTrab.setEnabled(true);
        txtContraseñaTrab.setEnabled(true);
        txtTelefTrab.setEnabled(true);
        txtCelTrab.setEnabled(true);
        jLabel9.setVisible(true);
        txConfirContraseñaTrab.setVisible(true);
        btnEditar.setEnabled(false);
        btnCancelar.setEnabled(true);
        btnGuardar.setEnabled(true);

        String pass = txtContraseñaTrab.getText();
        txConfirContraseñaTrab.setText(pass);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        btnCambiarImg.setVisible(false);
        txtNombresTrab.setEnabled(false);
        txtApellidosTrab.setEnabled(false);
        txtDescrTrab.setEnabled(false);
        txtDireccionTrab.setEnabled(false);
        txtEdadTrab.setEnabled(false);
        txtSexoTrab.setEnabled(false);
        txtCorreoTrab.setEnabled(false);
        txtContraseñaTrab.setEnabled(false);
        txtTelefTrab.setEnabled(false);
        txtCelTrab.setEnabled(false);
        jLabel9.setVisible(false);
        txConfirContraseñaTrab.setVisible(false);
        btnEditar.setEnabled(true);
        btnCancelar.setEnabled(false);
        btnGuardar.setEnabled(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (!txtCorreoTrab.getText().contains("@") || !txtCorreoTrab.getText().contains(".com")){
            JOptionPane.showMessageDialog(null,"Formato de correo invalido. Asegurese de escribirlo bien.");
        }else{
           if (txtContraseñaTrab.getText().length() < 8) {
            JOptionPane.showMessageDialog(null,"La contraseña no puede contener menos de 8 caracteres.");
           }else{
        Trabajador eT = new Trabajador();
        if (lblCambio.getText().equals("1")) {
            try {
                eT.setIdTrabajador(Integer.parseInt(txtIdTrabajador.getText()));
                byte[] sq = Files.readAllBytes(file.toPath());//se hace la convercion de File a Bytes
                eT.setImgPerfil(sq);
                cTr.actualizarDatosTrabajadorF(eT);
                lblCambio.setText("");
                btnCambiarImg.setVisible(false);
            } catch (IOException ex) {
                Logger.getLogger(JDialog_P_Trabajador_DatosPersonales.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            if (txConfirContraseñaTrab.getText().equals(txtContraseñaTrab.getText())) {

                eT.setIdTrabajador(Integer.parseInt(txtIdTrabajador.getText()));
                eT.setNombres(txtNombresTrab.getText());
                eT.setApellidos(txtApellidosTrab.getText());
                eT.setDescripcion(txtDescrTrab.getText());
                eT.setEdad(Integer.parseInt(txtEdadTrab.getText()));
                eT.setSexo(txtSexoTrab.getText());
                eT.setDireccion(txtDireccionTrab.getText());
                eT.setCelular(txtCelTrab.getText());
                eT.setTelefonoFijo(txtTelefTrab.getText());
                eT.setCorreo(txtCorreoTrab.getText());
                eT.setPass(txtContraseñaTrab.getText());
                eT.setEstilo(Integer.parseInt(txtEstilo.getText()));

//                byte[] sq = Files.readAllBytes(file.toPath());//se hace la convercion de File a Bytes
//                eT.setImgPerfil(sq);
                cTr.actualizarDatosTrabajadorSF(eT);

                System.out.println("Cambios Guardados!");
                btnEditar.setEnabled(true);
                btnCancelar.setEnabled(false);
                btnGuardar.setEnabled(false);

            } else {
               JOptionPane.showMessageDialog(null, "La contraseña no coincide. Asegurate de escribir bien tu contraseña.");
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed
    }
    }
    private void btnCambiarImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarImgActionPerformed

    }//GEN-LAST:event_btnCambiarImgActionPerformed

    private void btnCambiarImgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCambiarImgMouseClicked
        JFileChooser archivo = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Imagenes", "jpg", "png", "jpeg");
        archivo.setFileFilter(filtro);
        archivo.setDialogTitle("Elegir Imagen de Perfil");
        int ventana = archivo.showOpenDialog(null);
        if (ventana == JFileChooser.APPROVE_OPTION) {
            file = archivo.getSelectedFile();
            txtUrl.setText(String.valueOf(file));
            Image foto = getToolkit().getImage(txtUrl.getText());
            foto = foto.getScaledInstance(lblImgPerfilTrab.getWidth(), lblImgPerfilTrab.getHeight(), Image.SCALE_DEFAULT);

            lblImgPerfilTrab.setIcon(new ImageIcon(foto));
            lblCambio.setText("1");
            btnGuardar.setEnabled(true);
        }
    }//GEN-LAST:event_btnCambiarImgMouseClicked

    private void btnGuardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardar1ActionPerformed
        btnCambiarImg.setVisible(true);
        txtNombresTrab.setEnabled(false);
        txtApellidosTrab.setEnabled(false);
        txtDescrTrab.setEnabled(false);
        txtDireccionTrab.setEnabled(false);
        txtEdadTrab.setEnabled(false);
        txtSexoTrab.setEnabled(false);
        txtCorreoTrab.setEnabled(false);
        txtContraseñaTrab.setEnabled(false);
        txtTelefTrab.setEnabled(false);
        txtCelTrab.setEnabled(false);
        jLabel9.setVisible(false);
        txConfirContraseñaTrab.setVisible(false);
        btnEditar.setEnabled(false);
        btnCancelar.setEnabled(true);
        btnGuardar.setEnabled(false);
    }//GEN-LAST:event_btnGuardar1ActionPerformed

    private void txtNombresTrabKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombresTrabKeyTyped
        if (txtNombresTrab.getText().length() >= 50) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }

        if (!Character.isLetter(evt.getKeyChar()) && evt.getKeyChar() != ' ') {
            evt.consume();
        }
        if (evt.getKeyChar() == ' ' && txtNombresTrab.getText().contains(" "));
        else{
            if (txtNombresTrab.getText().length() <= 0) {
            if (evt.getKeyChar() == ' ') {
                evt.consume();
            } else {
                if (evt.getKeyChar() == ' ') {
                    evt.consume();
                }
            }
        }
    }//GEN-LAST:event_txtNombresTrabKeyTyped
    }
    private void txtApellidosTrabKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidosTrabKeyTyped
        if (txtApellidosTrab.getText().length() >= 50) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();

        }

        if (!Character.isLetter(evt.getKeyChar()) && evt.getKeyChar() != ' ') {
            evt.consume();
        }
        if (evt.getKeyChar() == ' ' && txtApellidosTrab.getText().contains(" "));
        else{
            if (txtApellidosTrab.getText().length() <= 0) {
            if (evt.getKeyChar() == ' ') {
                evt.consume();
            } else {
                if (evt.getKeyChar() == ' ') {
                    evt.consume();
                }
            }
        }
    }//GEN-LAST:event_txtApellidosTrabKeyTyped
    }
    private void txtEdadTrabKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEdadTrabKeyTyped
        if (txtEdadTrab.getText().length() >= 2) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();

        }

        if (!Character.isDigit(evt.getKeyChar()) && evt.getKeyChar() != ' ') {
            evt.consume();
        }
        if (evt.getKeyChar() == ' ' && txtEdadTrab.getText().contains(" "));
        else{
            if (txtEdadTrab.getText().length() <= 0) {
            if (evt.getKeyChar() == ' ') {
                evt.consume();
            } else {
                if (evt.getKeyChar() == ' ') {
                    evt.consume();
                }
            }
        }

    }//GEN-LAST:event_txtEdadTrabKeyTyped
    }
    private void txtSexoTrabKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSexoTrabKeyTyped
        if (txtSexoTrab.getText().length() >= 15) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();

        }

        if (!Character.isLetter(evt.getKeyChar()) && evt.getKeyChar() != ' ') {
            evt.consume();
        }
        if (evt.getKeyChar() == ' ' && txtSexoTrab.getText().contains(" "));
        else{
            if (txtSexoTrab.getText().length() <= 0) {
            if (evt.getKeyChar() == ' ') {
                evt.consume();
            } else {
                if (evt.getKeyChar() == ' ') {
                    evt.consume();
                }
            }
        }
    }//GEN-LAST:event_txtSexoTrabKeyTyped
    }
    private void txtTelefTrabKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefTrabKeyTyped
        if (txtTelefTrab.getText().length() >= 8) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();

        }
        if (!Character.isDigit(evt.getKeyChar())
                && evt.getKeyChar() != ' ') {
            evt.consume();
        }
        if (evt.getKeyChar() == '-' && txtTelefTrab.getText().contains("-")) {
            evt.consume();
    }//GEN-LAST:event_txtTelefTrabKeyTyped
    else{
    if (txtTelefTrab.getText().length() <= 0) {
            if (evt.getKeyChar() == ' ') {
                evt.consume();
            } else {
                if (evt.getKeyChar() == ' ') {
                    evt.consume();
                }
            }
        }
        }
    }
    private void txtCelTrabKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCelTrabKeyTyped
        if (txtCelTrab.getText().length() >= 8) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();

        }
        if (!Character.isDigit(evt.getKeyChar())
                && evt.getKeyChar() != ' ') {
            evt.consume();
        }
        if (evt.getKeyChar() == '-' && txtCelTrab.getText().contains("-")) {
            evt.consume();
        } else{
                    if (txtCelTrab.getText().length() <= 0) {
            if (evt.getKeyChar() == ' ') {
                evt.consume();
            } else {
                if (evt.getKeyChar() == ' ') {
                    evt.consume();
                }
            }
        }
        }
    }//GEN-LAST:event_txtCelTrabKeyTyped

    private void txtCorreoTrabKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoTrabKeyTyped
        
        if (txtContraseñaTrab.getText().length() >= 150) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();

        }
        if (!Character.isLetter(evt.getKeyChar()) && evt.getKeyChar() != '.' && !Character.isDigit(evt.getKeyChar())
                && evt.getKeyChar() != '@') {
            evt.consume();
        }
        if (evt.getKeyChar() == '.' && txtCorreoTrab.getText().contains(".")) {
            evt.consume();
        }
        if (evt.getKeyChar() == '@' && txtCorreoTrab.getText().contains("@")) {
            evt.consume();
        }else{
            if (txtCorreoTrab.getText().length() <= 0) {
            if (evt.getKeyChar() == ' ') {
                evt.consume();
            } else {
                if (evt.getKeyChar() == ' ') {
                    evt.consume();
                }
            }
        }
    }//GEN-LAST:event_txtCorreoTrabKeyTyped
    }
    private void txtContraseñaTrabKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContraseñaTrabKeyTyped
       if (txtContraseñaTrab.getText().length() >= 50) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
       }else{
                    if (txtContraseñaTrab.getText().length() <= 0) {
            if (evt.getKeyChar() == ' ') {
                evt.consume();
            } else {
                if (evt.getKeyChar() == ' ') {
                    evt.consume();
                }
            }
        }     
    }//GEN-LAST:event_txtContraseñaTrabKeyTyped
    }
    private void txConfirContraseñaTrabKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txConfirContraseñaTrabKeyTyped
        if (txtContraseñaTrab.getText().length() >= 50) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }else{ 
            if (txtContraseñaTrab.getText().length() <= 0) {
            if (evt.getKeyChar() == ' ') {
                evt.consume();
            } else {
                if (evt.getKeyChar() == ' ') {
                    evt.consume();
                }
            }
        }
    }//GEN-LAST:event_txConfirContraseñaTrabKeyTyped
    }
    private void txtDescrTrabKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescrTrabKeyTyped
         if (txtDescrTrab.getText().length() <= 0) {
            if (evt.getKeyChar() == ' ') {
                evt.consume();
            } else {
                if (evt.getKeyChar() == ' ') {
                    evt.consume();
                }
            }
        }
    }//GEN-LAST:event_txtDescrTrabKeyTyped

    private void txtDireccionTrabKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionTrabKeyTyped
      if (txtDireccionTrab.getText().length() <= 0) {
            if (evt.getKeyChar() == ' ') {
                evt.consume();
            } else {
                if (evt.getKeyChar() == ' ') {
                    evt.consume();
                }
            }
        }
    }//GEN-LAST:event_txtDireccionTrabKeyTyped
    
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
            java.util.logging.Logger.getLogger(JDialog_P_Trabajador_DatosPersonales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialog_P_Trabajador_DatosPersonales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialog_P_Trabajador_DatosPersonales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialog_P_Trabajador_DatosPersonales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialog_P_Trabajador_DatosPersonales dialog = new JDialog_P_Trabajador_DatosPersonales(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnCambiarImg;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnGuardar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblCambio;
    public static javax.swing.JLabel lblImgPerfilTrab;
    private javax.swing.JPasswordField txConfirContraseñaTrab;
    public static javax.swing.JTextField txtApellidosTrab;
    public static javax.swing.JTextField txtCelTrab;
    public static javax.swing.JPasswordField txtContraseñaTrab;
    public static javax.swing.JTextField txtCorreoTrab;
    public static javax.swing.JTextField txtDescrTrab;
    public static javax.swing.JTextField txtDireccionTrab;
    public static javax.swing.JTextField txtEdadTrab;
    public static javax.swing.JTextField txtEstilo;
    public static javax.swing.JTextField txtIdTrabajador;
    public static javax.swing.JTextField txtNombresTrab;
    public static javax.swing.JTextField txtSexoTrab;
    public static javax.swing.JTextField txtTelefTrab;
    public static javax.swing.JTextField txtUrl;
    // End of variables declaration//GEN-END:variables
}
