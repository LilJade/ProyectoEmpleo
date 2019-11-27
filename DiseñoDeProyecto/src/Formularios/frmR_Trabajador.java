package Formularios;

import Utilidades.*;
import Consultas.ConsultasTrabajador;
import Entidades.Trabajador;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import sun.misc.Cleaner;

public class frmR_Trabajador extends javax.swing.JFrame {

    public frmR_Trabajador() {
        initComponents();
        CambiarPanel();
        btnRegistrar.setEnabled(false);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(0, 0, 51));

        lbEnunciado.setText("Un estilo moderno.");
        lblEstilo.setText("0");
        lblEstilo.setVisible(false);
        btnRegistrar.setBackground(new Color(0, 0, 44));
        txturlF.setVisible(false);

        jp_estilo1N.setImage("/Imagenes/Estilo1.png");
        jp_estilo2N.setImage("/Imagenes/Estilo2.png");
        jp_estilo3N.setImage("/Imagenes/Estilo3.png");

        jps_estilos.add(jp_estilo1N);
        jps_estilos.add(jp_estilo2N);
        jps_estilos.add(jp_estilo3N);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txturl = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jpsContraseña = new javax.swing.JPasswordField();
        txtNombre = new javax.swing.JTextField();
        btnCargar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jps_estilos = new diu.swe.habib.JPanelSlider.JPanelSlider();
        lblEstilo = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbEnunciado = new javax.swing.JLabel();
        btnEstilo = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        jpsContraseña1 = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        lblContraseña = new javax.swing.JLabel();
        lblConfirmarC = new javax.swing.JLabel();
        lblFoto = new javax.swing.JLabel();
        txturlF = new javax.swing.JTextField();
        lblMensajeEs = new javax.swing.JLabel();

        txturl.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 51));
        setUndecorated(true);

        jSeparator1.setBackground(new java.awt.Color(26, 99, 66));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Correo Electronico");

        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });
        txtCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCorreoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCorreoKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(26, 99, 66));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Contraseña");

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Nombre");

        btnRegistrar.setBackground(new java.awt.Color(93, 0, 93));
        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/user_64_.png"))); // NOI18N
        btnRegistrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnRegistrar.setContentAreaFilled(false);
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Confirmar Registro");

        jpsContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jpsContraseñaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jpsContraseñaKeyTyped(evt);
            }
        });

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        btnCargar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregar_foto.png"))); // NOI18N
        btnCargar.setContentAreaFilled(false);
        btnCargar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCargar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCargarMouseClicked(evt);
            }
        });
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });

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

        jps_estilos.setPreferredSize(new java.awt.Dimension(500, 245));

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Elige el estilo que deseas ver en tu perfil");

        jLabel5.setPreferredSize(new java.awt.Dimension(40, 40));

        lbEnunciado.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lbEnunciado.setForeground(new java.awt.Color(255, 255, 255));
        lbEnunciado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnEstilo.setBackground(new java.awt.Color(255, 255, 255));
        btnEstilo.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btnEstilo.setForeground(new java.awt.Color(255, 255, 255));
        btnEstilo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/NNSuccess.png"))); // NOI18N
        btnEstilo.setText("Seleccionar");
        btnEstilo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnEstilo.setContentAreaFilled(false);
        btnEstilo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEstilo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstiloActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Apellido");

        txtApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidosActionPerformed(evt);
            }
        });
        txtApellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtApellidosKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidosKeyTyped(evt);
            }
        });

        jpsContraseña1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpsContraseña1ActionPerformed(evt);
            }
        });
        jpsContraseña1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jpsContraseña1KeyReleased(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(26, 99, 66));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Confirmar contraseña");

        lblCorreo.setForeground(new java.awt.Color(204, 0, 0));

        lblNombre.setForeground(new java.awt.Color(204, 0, 0));

        lblApellido.setForeground(new java.awt.Color(204, 0, 0));

        lblContraseña.setForeground(new java.awt.Color(204, 0, 0));

        lblConfirmarC.setForeground(new java.awt.Color(204, 0, 0));

        lblFoto.setForeground(new java.awt.Color(204, 0, 0));

        txturlF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txturlFKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(112, 112, 112))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblApellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txturlF, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jpsContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(9, 9, 9)
                                    .addComponent(jLabel2)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jpsContraseña1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblConfirmarC, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(0, 6, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbEnunciado, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnEstilo, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jps_estilos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(118, 118, 118)))
                    .addComponent(btnCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(btnCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEstilo, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(178, 178, 178)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124)
                .addComponent(lblMensajeEs, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(396, 396, 396)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jps_estilos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(104, 104, 104)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(124, 124, 124)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jpsContraseña1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jpsContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(btnCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txturlF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(97, 97, 97)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbEnunciado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEstilo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblConfirmarC, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 32, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(lblMensajeEs, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4))
                    .addComponent(lblEstilo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    File file;//variable donde se guarda la imagen 
    ConsultasTrabajador cT = new ConsultasTrabajador();
    Trabajador eT = new Trabajador();

    private void CambiarPanel() {

        btnC1.setBackground(new Color(255, 204, 0));
        btnC2.setBackground(new Color(255, 204, 0));
        btnC3.setBackground(new Color(255, 204, 0));
        btnC4.setBackground(new Color(255, 204, 0));
        btnC1.setVisible(true);
        btnC2.setVisible(false);
        btnC3.setVisible(false);
        btnC4.setVisible(false);

        btnC1.setBounds(1010, 230, 60, 60);
        btnC1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/right-arrow32.png")));
        this.add(btnC1);
        btnC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC1ActionPerformed(evt);
            }
        }
        );

        btnC2.setBounds(1010, 230, 60, 60);
        btnC2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/right-arrow32.png")));
        this.add(btnC2);
        btnC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC2ActionPerformed(evt);
            }
        }
        );

        btnC3.setBounds(435, 230, 60, 60);
        btnC3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/left-arrow32.png")));
        this.add(btnC3);
        btnC3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC3ActionPerformed(evt);
            }
        }
        );

        btnC4.setBounds(435, 230, 60, 60);
        btnC4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/left-arrow32.png")));
        this.add(btnC4);
        btnC4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC4ActionPerformed(evt);
            }
        }
        );
    }

    private void btnC1ActionPerformed(java.awt.event.ActionEvent evt) {
        btnC1.setVisible(false);
        btnC2.setVisible(true);
        btnC3.setVisible(true);
        btnC4.setVisible(false);
        jps_estilos.nextPanel(10, jp_estilo2N, jps_estilos.left);
        lbEnunciado.setText("Un estilo casual.");
    }

    private void btnC2ActionPerformed(java.awt.event.ActionEvent evt) {
        btnC1.setVisible(false);
        btnC2.setVisible(false);
        btnC3.setVisible(false);
        btnC4.setVisible(true);
        jps_estilos.nextPanel(10, jp_estilo3N, jps_estilos.left);
        lbEnunciado.setText("Un estilo clásico.");
    }

    private void btnC3ActionPerformed(java.awt.event.ActionEvent evt) {
        btnC1.setVisible(true);
        btnC2.setVisible(false);
        btnC3.setVisible(false);
        btnC4.setVisible(false);
        jps_estilos.nextPanel(10, jp_estilo1N, jps_estilos.right);
        lbEnunciado.setText("Un estilo moderno.");
    }

    private void btnC4ActionPerformed(java.awt.event.ActionEvent evt) {
        btnC1.setVisible(false);
        btnC2.setVisible(true);
        btnC3.setVisible(true);
        btnC4.setVisible(false);
        jps_estilos.nextPanel(10, jp_estilo2N, jps_estilos.right);
        lbEnunciado.setText("Un estilo casual.");
    }

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

        if (jpsContraseña.getText().equals(jpsContraseña1.getText())) {
            try {
                eT.setCorreo(txtCorreo.getText());
                eT.setNombres(txtNombre.getText());
                eT.setApellidos(txtApellidos.getText());
                eT.setPass(jpsContraseña.getText());
                eT.setEstilo(Integer.parseInt(lblEstilo.getText()));

                byte[] sq = Files.readAllBytes(file.toPath());//se hace la convercion de File a Bytes
                eT.setImgPerfil(sq);
                cT.insertar(eT);
            } catch (IOException ex) {
                Logger.getLogger(frmR_Trabajador.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            lblConfirmarC.setText("La contraseña no coincide");
        }

    }//GEN-LAST:event_btnRegistrarActionPerformed


    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed

    }//GEN-LAST:event_btnCargarActionPerformed

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        int dialog = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null, "Desea salir ? ", "exit", dialog);
        if (result == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnCancelarMouseClicked

    private void btnCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseEntered
        //cambio de color en los botones.
        btnCancelar.setBackground(Color.red);
    }//GEN-LAST:event_btnCancelarMouseEntered

    private void btnCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseExited
        btnCancelar.setBackground(new Color(93, 0, 93));
    }//GEN-LAST:event_btnCancelarMouseExited

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        frmVisitante V = new frmVisitante();
        V.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed
//evento del boton para seleccionar la imagen 
    private void btnCargarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCargarMouseClicked
        JFileChooser archivo = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Imagenes", "jpg", "png", "jpeg");
        archivo.setFileFilter(filtro);
        archivo.setDialogTitle("Elegir Imagen de Perfil");
        int ventana = archivo.showOpenDialog(null);
        if (ventana == JFileChooser.APPROVE_OPTION) {
            file = archivo.getSelectedFile();
            txturlF.setText(String.valueOf(file));
            Image foto = getToolkit().getImage(txturlF.getText());
            foto = foto.getScaledInstance(btnCargar.getWidth(), btnCargar.getHeight(), Image.SCALE_DEFAULT);

            btnCargar.setIcon(new ImageIcon(foto));

        }
    }//GEN-LAST:event_btnCargarMouseClicked

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void btnEstiloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstiloActionPerformed
        if (lblEstilo.getText().equals("0")) {
            if (lbEnunciado.getText().equals("Un estilo moderno.")) {
                lblEstilo.setText("1");
                btnEstilo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/SSuccess.png")));
            } else if (lbEnunciado.getText().equals("Un estilo casual.")) {
                lblEstilo.setText("2");
                btnEstilo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/SSuccess.png")));
            } else if (lbEnunciado.getText().equals("Un estilo clásico.")) {
                lblEstilo.setText("3");
                btnEstilo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/SSuccess.png")));
            }
        } else {
            int r = JOptionPane.showConfirmDialog(null, "Ya elegiste un estilo para tu perfil.\n¿Deseas cambiar de estilo?", "Estilos", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (r == 0) {
                lblEstilo.setText("0");
                btnEstilo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/NNSuccess.png")));
            }
        }
    }//GEN-LAST:event_btnEstiloActionPerformed

    private void txtApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidosActionPerformed

    private void txtCorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoKeyTyped
        if (txtCorreo.getText().length() >= 150) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
            lblCorreo.setText("Limite permitido de caracteres 150");
        } else {
            lblCorreo.setText("");
        }
        if (!Character.isLetter(evt.getKeyChar()) && evt.getKeyChar() != '.' && !Character.isDigit(evt.getKeyChar())
                && evt.getKeyChar() != '@') {
            evt.consume();
        }
        if (evt.getKeyChar() == '.' && txtCorreo.getText().contains(".")) {
            evt.consume();
        }
        if (evt.getKeyChar() == '@' && txtCorreo.getText().contains("@")) {
            evt.consume();
        }

    }//GEN-LAST:event_txtCorreoKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        if (txtNombre.getText().length() >= 50) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
            lblNombre.setText("Limite permitido de caracteres 50");
        } else {
            lblNombre.setText("");
        }

        if (!Character.isLetter(evt.getKeyChar()) && evt.getKeyChar() != ' ') {
            evt.consume();
        }
        if (evt.getKeyChar() == ' ' && txtNombre.getText().contains(" "));

    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtApellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidosKeyTyped
        if (txtApellidos.getText().length() >= 50) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
            lblApellido.setText("Limite permitido de caracteres 50");
        } else {
            lblApellido.setText("");
        }

        if (!Character.isLetter(evt.getKeyChar()) && evt.getKeyChar() != ' ') {
            evt.consume();
        }
        if (evt.getKeyChar() == ' ' && txtApellidos.getText().contains(" "));

    }//GEN-LAST:event_txtApellidosKeyTyped

    private void jpsContraseñaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jpsContraseñaKeyTyped
        if (jpsContraseña.getText().length() >= 50) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
            lblContraseña.setText("Limite permitido de caracteres 50");
        } else {
            lblContraseña.setText("");
        }

    }//GEN-LAST:event_jpsContraseñaKeyTyped

    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased
        ValidacionRegistro();
    }//GEN-LAST:event_txtNombreKeyReleased

    private void txtApellidosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidosKeyReleased
        ValidacionRegistro();
    }//GEN-LAST:event_txtApellidosKeyReleased

    private void txtCorreoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoKeyReleased
        ValidacionRegistro();
    }//GEN-LAST:event_txtCorreoKeyReleased

    private void jpsContraseñaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jpsContraseñaKeyReleased
        ValidacionRegistro();
    }//GEN-LAST:event_jpsContraseñaKeyReleased

    private void jpsContraseña1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jpsContraseña1KeyReleased
        ValidacionRegistro();
    }//GEN-LAST:event_jpsContraseña1KeyReleased

    private void jpsContraseña1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpsContraseña1ActionPerformed

    }//GEN-LAST:event_jpsContraseña1ActionPerformed

    private void txturlFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txturlFKeyReleased
    //ValidacionRegistro();
    }//GEN-LAST:event_txturlFKeyReleased

    public void ValidacionRegistro() {
        if (txtCorreo.getText().isEmpty()) {
            lblCorreo.setText("Campo Requerido");
        } else if (!txtCorreo.getText().contains("@") || !txtCorreo.getText().contains(".com")) {
            lblCorreo.setText("Correo Invalido");
        } else {
            lblCorreo.setText("");
        }
        if (txtCorreo.getText().contains("Correo Invalido") || txtCorreo.getText()
                .contains("Campo Requerido")) {
            btnRegistrar.setEnabled(false);
        } else {
            btnRegistrar.setEnabled(true);
        }
        if (txtNombre.getText().isEmpty()) {
            lblNombre.setText("Campo Requerido");
        } else {
            lblNombre.setText("");
        }
        if (txtApellidos.getText().isEmpty()) {
            lblApellido.setText("Campo Requerido");
        } else {
            lblApellido.setText("");
        }
        if (jpsContraseña.getText().isEmpty()) {
            lblContraseña.setText("Campo Requerido");
        } else {
            lblContraseña.setText("");
        }
        if (jpsContraseña1.getText().isEmpty()) {
            lblConfirmarC.setText("Confirme su contraseña");
        } else {
            lblConfirmarC.setText("");
        }
        if (jpsContraseña.getText().length() < 8) {
            lblContraseña.setText("La contraseña debe contener entre 8~50 caracteres");
            btnRegistrar.setEnabled(false);
        } else {
            btnRegistrar.setEnabled(true);
//     }if(txturlF.getText().isEmpty()){
//            lblFoto.setText("Por favor seleccione una foto");
//            btnRegistrar.setEnabled(false);
//        }else if(!txturlF.getText().isEmpty()){
//            lblFoto.setText("");
//            btnRegistrar.setEnabled(true);
//        }if(lblEstilo.getText().equals(0)){
//            lblMensajeEs.setText("Por favor seleccione un estilo");
//            btnRegistrar.setEnabled(false);
//        }else{
//            lblMensajeEs.setText("");
//            btnRegistrar.setEnabled(true);
        }

        if (txtCorreo.getText().isEmpty() || txtNombre.getText().isEmpty()
                || jpsContraseña.getText().isEmpty() || txtApellidos.getText().isEmpty()
                || jpsContraseña1.getText().isEmpty() || !lblCorreo.getText().isEmpty()
                || !lblNombre.getText().isEmpty() || !lblApellido.getText().isEmpty()
                || !lblContraseña.getText().isEmpty() || !lblConfirmarC.getText().isEmpty()
                /*|| txturlF.getText().isEmpty() || !lblFoto.getText().isEmpty()
                || lblEstilo.getText().equals(0)|| !lblMensajeEs.getText().isEmpty() */) {
            btnRegistrar.setEnabled(false);
        } else {
            btnRegistrar.setEnabled(true);

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
            java.util.logging.Logger.getLogger(frmR_Trabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmR_Trabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmR_Trabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmR_Trabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmR_Trabajador().setVisible(true);
            }
        });
    }

    JButton btnC4 = new BtnCirculo("");
    JButton btnC3 = new BtnCirculo("");
    JButton btnC2 = new BtnCirculo("");
    JButton btnC1 = new BtnCirculo("");
    PanelImg jp_estilo3N = new PanelImg();
    PanelImg jp_estilo2N = new PanelImg();
    PanelImg jp_estilo1N = new PanelImg();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCargar;
    private javax.swing.JButton btnEstilo;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPasswordField jpsContraseña;
    private javax.swing.JPasswordField jpsContraseña1;
    private diu.swe.habib.JPanelSlider.JPanelSlider jps_estilos;
    private javax.swing.JLabel lbEnunciado;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblConfirmarC;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblEstilo;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JLabel lblMensajeEs;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txturl;
    private javax.swing.JTextField txturlF;
    // End of variables declaration//GEN-END:variables
}
