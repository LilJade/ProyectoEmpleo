/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Consultas.ConsultasAspirantes;
import Consultas.ConsultasEmpleo;
import Consultas.ConsultasEmpresa;
import Entidades.Empleo;
import Entidades.GiroComercial;
import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Eli_Ingeniero
 */
public class frmP_vista_empresas extends javax.swing.JFrame {

    /**
     * Creates new form frmPerfil_vista_empresqa
     */
    public frmP_vista_empresas() {
        initComponents();
       
        txtNombre2.setEditable(false);
        txtAcronimo2.setEditable(false);
        txtDireccion2.setEditable(false);
        txtCorreo2.setEditable(false);
        txtTelefono2.setEditable(false);
        txtDepartamento2.setEditable(false);
      idgiro2.setVisible(false);
      idempresa2.setVisible(false);
//       cargarTabla();
        txtDescripcion2.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        lb_fotoEmpresa1 = new javax.swing.JLabel();
        btnCambiarFoto = new javax.swing.JButton();
        jpGestiones = new javax.swing.JPanel();
        titulos = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        btn_salir = new javax.swing.JButton();
        jpDatos_empresa = new javax.swing.JPanel();
        txtNombre2 = new javax.swing.JTextField();
        txtAcronimo2 = new javax.swing.JTextField();
        idgiro2 = new javax.swing.JTextField();
        idempresa2 = new javax.swing.JTextField();
        txtDireccion2 = new javax.swing.JTextField();
        jbn_ubicacion2 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jButton14 = new javax.swing.JButton();
        txtCorreo2 = new javax.swing.JTextField();
        jButton15 = new javax.swing.JButton();
        txtTelefono2 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtDepartamento2 = new javax.swing.JTextField();
        jButton17 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtDescripcion2 = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        empleos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtgirocomercial = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(0, 0));

        jPanel4.setBackground(new java.awt.Color(102, 0, 102));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_fotoEmpresa1.setBackground(new java.awt.Color(51, 51, 255));
        lb_fotoEmpresa1.setForeground(new java.awt.Color(51, 51, 255));
        lb_fotoEmpresa1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_fotoEmpresa1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/folder de trabajo.png"))); // NOI18N
        jPanel4.add(lb_fotoEmpresa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 157, 106));

        btnCambiarFoto.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCambiarFoto.setForeground(new java.awt.Color(255, 255, 255));
        btnCambiarFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/añadirfoto_64.png"))); // NOI18N
        btnCambiarFoto.setText("Cambiar Foto");
        btnCambiarFoto.setBorder(null);
        btnCambiarFoto.setContentAreaFilled(false);
        btnCambiarFoto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCambiarFoto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCambiarFoto.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnCambiarFoto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCambiarFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarFotoActionPerformed(evt);
            }
        });
        jPanel4.add(btnCambiarFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(-120, 180, 160, -1));

        jpGestiones.setBackground(new java.awt.Color(102, 0, 102));
        jpGestiones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulos.setBackground(new java.awt.Color(102, 0, 102));

        logo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        logo.setForeground(new java.awt.Color(255, 255, 255));
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo3.0.png"))); // NOI18N
        logo.setText("Work Search Engine. ");
        logo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btn_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar_24.png"))); // NOI18N
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout titulosLayout = new javax.swing.GroupLayout(titulos);
        titulos.setLayout(titulosLayout);
        titulosLayout.setHorizontalGroup(
            titulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titulosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        titulosLayout.setVerticalGroup(
            titulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titulosLayout.createSequentialGroup()
                .addGroup(titulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logo)
                    .addComponent(btn_salir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpDatos_empresa.setBackground(new java.awt.Color(102, 153, 255));

        txtNombre2.setEditable(false);
        txtNombre2.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        txtNombre2.setForeground(new java.awt.Color(39, 86, 179));
        txtNombre2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtAcronimo2.setEditable(false);
        txtAcronimo2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txtAcronimo2.setForeground(new java.awt.Color(39, 86, 179));
        txtAcronimo2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtDireccion2.setEditable(false);
        txtDireccion2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtDireccion2.setForeground(new java.awt.Color(39, 86, 179));

        jbn_ubicacion2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ic_location_on_128_28437.png"))); // NOI18N
        jbn_ubicacion2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbn_ubicacion2MouseClicked(evt);
            }
        });
        jbn_ubicacion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbn_ubicacion2ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(26, 99, 66));
        jLabel15.setText("Direccion de  empresa ");

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(26, 99, 66));
        jLabel16.setText("Giro Comercial");

        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ic_attach_money_128_28210.png"))); // NOI18N

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(26, 99, 66));
        jLabel17.setText("Correo electronico ");

        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/GMail_icon-icons.com_76886.png"))); // NOI18N
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        txtCorreo2.setEditable(false);
        txtCorreo2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtCorreo2.setForeground(new java.awt.Color(39, 86, 179));

        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/phone_icon-icons.com_48251.png"))); // NOI18N
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        txtTelefono2.setEditable(false);
        txtTelefono2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtTelefono2.setForeground(new java.awt.Color(39, 86, 179));
        txtTelefono2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefono2ActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(26, 99, 66));
        jLabel18.setText("Telefono ");

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(26, 99, 66));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Descripcion...");

        txtDepartamento2.setEditable(false);
        txtDepartamento2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtDepartamento2.setForeground(new java.awt.Color(39, 86, 179));
        txtDepartamento2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDepartamento2ActionPerformed(evt);
            }
        });

        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Empresa_32.png"))); // NOI18N

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(26, 99, 66));
        jLabel21.setText("Departamento");
        jLabel21.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel21.setMaximumSize(new java.awt.Dimension(168, 24));
        jLabel21.setMinimumSize(new java.awt.Dimension(168, 24));

        txtDescripcion2.setEditable(false);
        txtDescripcion2.setColumns(20);
        txtDescripcion2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtDescripcion2.setForeground(new java.awt.Color(39, 86, 179));
        txtDescripcion2.setRows(5);
        jScrollPane3.setViewportView(txtDescripcion2);

        empleos.setBackground(new java.awt.Color(102, 51, 255));
        empleos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(empleos);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Empleos ");
        jLabel1.setToolTipText("");

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpDatos_empresaLayout = new javax.swing.GroupLayout(jpDatos_empresa);
        jpDatos_empresa.setLayout(jpDatos_empresaLayout);
        jpDatos_empresaLayout.setHorizontalGroup(
            jpDatos_empresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDatos_empresaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtNombre2)
                .addContainerGap())
            .addGroup(jpDatos_empresaLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jpDatos_empresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpDatos_empresaLayout.createSequentialGroup()
                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpDatos_empresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpDatos_empresaLayout.createSequentialGroup()
                                .addComponent(txtTelefono2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(224, 224, 224)
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jpDatos_empresaLayout.createSequentialGroup()
                        .addGroup(jpDatos_empresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpDatos_empresaLayout.createSequentialGroup()
                                .addComponent(jbn_ubicacion2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jpDatos_empresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(txtDireccion2, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jpDatos_empresaLayout.createSequentialGroup()
                                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jpDatos_empresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCorreo2, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jpDatos_empresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpDatos_empresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jpDatos_empresaLayout.createSequentialGroup()
                                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtDepartamento2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jpDatos_empresaLayout.createSequentialGroup()
                                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jpDatos_empresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtgirocomercial)))))
                        .addContainerGap(81, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpDatos_empresaLayout.createSequentialGroup()
                .addGroup(jpDatos_empresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpDatos_empresaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jpDatos_empresaLayout.createSequentialGroup()
                        .addGroup(jpDatos_empresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpDatos_empresaLayout.createSequentialGroup()
                                .addGap(192, 192, 192)
                                .addComponent(txtAcronimo2, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addGap(61, 61, 61)
                                .addComponent(idempresa2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpDatos_empresaLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 958, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idgiro2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16))
            .addGroup(jpDatos_empresaLayout.createSequentialGroup()
                .addGap(390, 390, 390)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpDatos_empresaLayout.setVerticalGroup(
            jpDatos_empresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDatos_empresaLayout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(txtNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jpDatos_empresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpDatos_empresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(idgiro2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(idempresa2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtAcronimo2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1))
                .addGap(28, 28, 28)
                .addGroup(jpDatos_empresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpDatos_empresaLayout.createSequentialGroup()
                        .addGroup(jpDatos_empresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(jpDatos_empresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpDatos_empresaLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jpDatos_empresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jbn_ubicacion2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDireccion2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpDatos_empresaLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(txtgirocomercial, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jpDatos_empresaLayout.createSequentialGroup()
                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)))
                .addGap(18, 18, 18)
                .addGroup(jpDatos_empresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpDatos_empresaLayout.createSequentialGroup()
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpDatos_empresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDepartamento2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpDatos_empresaLayout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpDatos_empresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCorreo2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(41, 41, 41)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpDatos_empresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpDatos_empresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTelefono2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jpDatos_empresa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jpGestiones, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(titulos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulos, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 899, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jpGestiones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jpDatos_empresa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//public void mostrar(){
//    ConsultasAspirantes ce=new ConsultasAspirantes();
//   ce.mostrarvista
//}
    frmP_Trabajador T= new frmP_Trabajador();
    
  public   void cargarTabla() {
        String titulos[] = {"Id", "Empleo", "Descripcion", "Requisitos", "Salario"};
        DefaultTableModel df = new DefaultTableModel(null, titulos);
        ConsultasAspirantes  mo = new ConsultasAspirantes();
        ArrayList<Empleo> PS = mo.Mostraempleosvisitante();
        Iterator i = PS.iterator();
        String filas[] = new String[5];
        while (i.hasNext()) {
            Empleo p;

            p = (Empleo) i.next();

            int id = p.getIdEmpleo();
            filas[0] = String.valueOf(id);
            filas[1] = p.getNombre();
            filas[2] = p.getDescripcion();
            filas[3] = p.getRequisitos();
            double salario = p.getSalario();
            filas[4] = String.valueOf(salario);

            df.addRow(filas);
        }
        empleos.setModel(df);
}
    private void btnCambiarFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarFotoActionPerformed

    }//GEN-LAST:event_btnCambiarFotoActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed

        this.dispose();
    }//GEN-LAST:event_btn_salirActionPerformed

    private void jbn_ubicacion2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbn_ubicacion2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jbn_ubicacion2MouseClicked

    private void jbn_ubicacion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbn_ubicacion2ActionPerformed
        txtDireccion2.selectAll();

        txtDireccion2.copy();        // TODO add your handling code here:
    }//GEN-LAST:event_jbn_ubicacion2ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        txtCorreo2.selectAll();
        txtCorreo2.copy();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        txtTelefono2.selectAll();
        txtTelefono2.copy();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    private void txtTelefono2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefono2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefono2ActionPerformed

    private void txtDepartamento2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDepartamento2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDepartamento2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
cargarTabla();       // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(frmP_vista_empresas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmP_vista_empresas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmP_vista_empresas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmP_vista_empresas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmP_vista_empresas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCambiarFoto;
    private javax.swing.JButton btn_salir;
    public javax.swing.JTable empleos;
    public javax.swing.JTextField idempresa2;
    public javax.swing.JTextField idgiro2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton17;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton jbn_ubicacion2;
    private javax.swing.JPanel jpDatos_empresa;
    private javax.swing.JPanel jpGestiones;
    public javax.swing.JLabel lb_fotoEmpresa1;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel titulos;
    public javax.swing.JTextField txtAcronimo2;
    public javax.swing.JTextField txtCorreo2;
    public javax.swing.JTextField txtDepartamento2;
    public javax.swing.JTextArea txtDescripcion2;
    public javax.swing.JTextField txtDireccion2;
    public javax.swing.JTextField txtNombre2;
    public javax.swing.JTextField txtTelefono2;
    public javax.swing.JTextField txtgirocomercial;
    // End of variables declaration//GEN-END:variables
}
