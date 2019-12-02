package Formularios;

import Consultas.ConsultasExperiencia;
import Entidades.Experiencia;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import rojerusan.RSAnimation;

public class JDialog_P_Trabajador_Experiencia extends javax.swing.JDialog {

    public JDialog_P_Trabajador_Experiencia(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        txtIdTrabajador.setText(String.valueOf(frmVisitante.id));
        txtIdExp.setVisible(false);
        txtIdTrabajador.setVisible(false);
        txtOrden.setVisible(false);
        lblMuestra.setVisible(false);

        Muestrame();
        RSAnimation.setMoverDerecha(-700, 500, 0, 2, this);
        btnInsertar.setEnabled(true);
        btnActualizar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnOrdenar.setEnabled(true);

        btnCancelarOrd.setEnabled(false);
        btnCancelarOrd.setVisible(false);
        btnPos1.setVisible(false);
        btnPos2.setVisible(false);
        btnPos3.setVisible(false);
        btnPos4.setVisible(false);
        btnPos5.setVisible(false);

        btnPos7.setVisible(false);
    }
//MOSTRAR DATOS EN LA JTABLE

    void Muestrame() {
        String Titulos[] = {"idExp", "Nombre de la Empresa", "Cargo Ocupado", "Descripcion", "Fecha Inicial", "Fecha Final", "orden", "idTrabajador"};
        DefaultTableModel model = new DefaultTableModel(null, Titulos){

            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        ConsultasExperiencia cex = new ConsultasExperiencia();
        Experiencia ex = new Experiencia();
        ArrayList<Experiencia> PS = cex.mostrarExperienciasCrud(frmVisitante.id);
        Iterator i = PS.iterator();
        String filas[] = new String[8];
        while (i.hasNext()) {
            Experiencia ps;
            ex = (Experiencia) i.next();
            filas[0] = String.valueOf(ex.getIdExperiencia());
            filas[1] = ex.getNombreEmpresa();
            filas[2] = ex.getCargoOcupado();
            filas[3] = ex.getDescripcion();
            filas[4] = String.valueOf(ex.getFechaInicio());
            filas[5] = String.valueOf(ex.getFechaFinal());
            filas[6] = String.valueOf(ex.getOrden());
            filas[7] = String.valueOf(ex.getIdTrabajador());
            model.addRow(filas);

        }
        jTableExperienciaTrabajador.setModel(model);
        //CODIGO PARA OCULTAR COLUMNAS EN UNA JTABLE
        jTableExperienciaTrabajador.getColumnModel().getColumn(0).setMaxWidth(0);
//        jTableExperienciaTrabajador.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(0);
        jTableExperienciaTrabajador.getColumnModel().getColumn(6).setMaxWidth(0);
//        jTableExperienciaTrabajador.getTableHeader().getColumnModel().getColumn(6).setMaxWidth(0);
        jTableExperienciaTrabajador.getColumnModel().getColumn(7).setMaxWidth(0);
//        jTableExperienciaTrabajador.getTableHeader().getColumnModel().getColumn(7).setMaxWidth(0);        
        //jTableExperienciaTrabajador.removeColumn(jTableExperienciaTrabajador.getColumnModel().getColumn(0));
        jTableExperienciaTrabajador.getTableHeader().setReorderingAllowed(false);
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
        btnPos7 = new javax.swing.JButton();
        btnCancelarOrd = new javax.swing.JButton();
        btnPos1 = new javax.swing.JButton();
        btnPos2 = new javax.swing.JButton();
        btnPos3 = new javax.swing.JButton();
        btnPos4 = new javax.swing.JButton();
        btnPos5 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableExperienciaTrabajador = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnActualizar = new javax.swing.JButton();
        btnOrdenar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        btnInsertar = new javax.swing.JButton();
        txtNombreEmpresa = new javax.swing.JTextField();
        txtCargoOcup = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jDateChooserInicio = new com.toedter.calendar.JDateChooser();
        jDateChooserFinal = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblMuestra = new javax.swing.JLabel();
        txtIdExp = new javax.swing.JTextField();
        txtOrden = new javax.swing.JTextField();
        txtIdTrabajador = new javax.swing.JTextField();

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
        jLabel1.setText("EXPERIENCIAS LABORALES");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 400, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/experiencia_laboral64.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 60, 60));

        btnPos7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnPos7.setText("DESMARCAR");
        btnPos7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPos7ActionPerformed(evt);
            }
        });
        jPanel1.add(btnPos7, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 40, -1, -1));

        btnCancelarOrd.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btnCancelarOrd.setForeground(new java.awt.Color(240, 240, 240));
        btnCancelarOrd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/regresar_24.png"))); // NOI18N
        btnCancelarOrd.setText("CANCELAR");
        btnCancelarOrd.setContentAreaFilled(false);
        btnCancelarOrd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancelarOrd.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnCancelarOrd.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCancelarOrd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarOrdMouseClicked(evt);
            }
        });
        btnCancelarOrd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarOrdActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelarOrd, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 10, -1, -1));

        btnPos1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnPos1.setText("POSICIÓN 1");
        btnPos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPos1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnPos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, -1, -1));

        btnPos2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnPos2.setText("POSICIÓN 2");
        btnPos2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPos2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnPos2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 40, -1, -1));

        btnPos3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnPos3.setText("POSICIÓN 3");
        btnPos3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPos3ActionPerformed(evt);
            }
        });
        jPanel1.add(btnPos3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, -1, -1));

        btnPos4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnPos4.setText("POSICIÓN 4");
        btnPos4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPos4ActionPerformed(evt);
            }
        });
        jPanel1.add(btnPos4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 40, -1, -1));

        btnPos5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnPos5.setText("POSICIÓN 5");
        btnPos5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPos5ActionPerformed(evt);
            }
        });
        jPanel1.add(btnPos5, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 10, -1, -1));

        jTableExperienciaTrabajador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID_EXPERIENCIA", "NOMBRE_EMPRESA", "CARGO_OCUPADO", "DESCRIPCION", "FECHA_INICIO", "FECHA_FINAL", "ORDEN", "ID_TRABAJADOR"
            }
        ));
        jTableExperienciaTrabajador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableExperienciaTrabajadorMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableExperienciaTrabajador);

        jPanel2.setBackground(new java.awt.Color(48, 62, 71));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(247, 211, 3), 2));

        btnActualizar.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(240, 240, 240));
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/actualizar_24.png"))); // NOI18N
        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.setContentAreaFilled(false);
        btnActualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnActualizar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnActualizar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnOrdenar.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btnOrdenar.setForeground(new java.awt.Color(240, 240, 240));
        btnOrdenar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ordenar_24.png"))); // NOI18N
        btnOrdenar.setText("ORDENAR");
        btnOrdenar.setContentAreaFilled(false);
        btnOrdenar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnOrdenar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnOrdenar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(240, 240, 240));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar_24.png"))); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

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

        btnInsertar.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btnInsertar.setForeground(new java.awt.Color(240, 240, 240));
        btnInsertar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/insertar_24.png"))); // NOI18N
        btnInsertar.setText("INSERTAR");
        btnInsertar.setContentAreaFilled(false);
        btnInsertar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnInsertar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnInsertar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(btnInsertar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addComponent(btnActualizar)
                .addGap(95, 95, 95)
                .addComponent(btnEliminar)
                .addGap(94, 94, 94)
                .addComponent(btnOrdenar)
                .addGap(140, 140, 140)
                .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnOrdenar)
                    .addComponent(btnEliminar)
                    .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInsertar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtNombreEmpresa.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N

        txtCargoOcup.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N

        txtDescripcion.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Nombre de la empresa: ");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setText("Cargo ocupado:");

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setText("Descripción:");

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setText("Inicio de Trabajo: ");

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel13.setText("Fin de Trabajo: ");

        lblMuestra.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblMuestra.setText("Fin de Trabajo: ");

        txtIdExp.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N

        txtOrden.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane2)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombreEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(txtCargoOcup, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jDateChooserInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jDateChooserFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(lblMuestra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtIdExp, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdTrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtIdTrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtIdExp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(jLabel13)))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCargoOcup)
                                    .addComponent(txtNombreEmpresa)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblMuestra))
                                .addGap(1, 1, 1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jDateChooserFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jDateChooserInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        try {
            frmP_Trabajador.Experiencia(Integer.parseInt(txtIdTrabajador.getText()));
            //btnAtras
            RSAnimation.setMoverIzquierda(500, -900, 0, 2, this);
            Thread.sleep(1000);
            this.dispose();
        } catch (InterruptedException ex) {
            Logger.getLogger(JDialog_P_Trabajador_Experiencia.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        if (txtNombreEmpresa.getText().equals("") || txtCargoOcup.getText().equals("") || txtDescripcion.getText().equals("")
                || jDateChooserInicio.getDate() == null || jDateChooserFinal.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Asegurate de rellenar todos los campos!", "You can do it!", JOptionPane.INFORMATION_MESSAGE);
            Muestrame();
        } else {
            //BOTON INSERTAR UNA EXPERIENCIA LABORAL
            ConsultasExperiencia expe = new ConsultasExperiencia();
            Experiencia ex = new Experiencia();

            ex.setNombreEmpresa(txtNombreEmpresa.getText());
            ex.setCargoOcupado(txtCargoOcup.getText());
            ex.setDescripcion(txtDescripcion.getText());

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String date = sdf.format(jDateChooserInicio.getDate());
            ex.setFechaInicio(date);

            SimpleDateFormat sdffinal = new SimpleDateFormat("yyyy-MM-dd");
            String datefinal = sdffinal.format(jDateChooserFinal.getDate());
            ex.setFechaFinal(datefinal);

            if (txtOrden.getText().isEmpty()) {

            } else {
                ex.setOrden(Integer.parseInt(txtOrden.getText()));
            }

            ex.setIdTrabajador(Integer.parseInt(txtIdTrabajador.getText()));

            expe.insertarExperiencia(ex);
            Muestrame();
            Limpiame();
        }

    }//GEN-LAST:event_btnInsertarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        //BOTON ELIMINAR EXPERIENCIA LABORAL
        ConsultasExperiencia cex = new ConsultasExperiencia();
        Experiencia ex = new Experiencia();

        ex.setIdExperiencia(Integer.parseInt(txtIdExp.getText()));
        cex.eliminarEstudios(ex);
        Muestrame();
        Limpiame();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void jTableExperienciaTrabajadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableExperienciaTrabajadorMouseClicked
        // CODIGO PARA QUE CARGUEN EN LAS TXT
        btnInsertar.setEnabled(true);
        btnActualizar.setEnabled(true);
        btnEliminar.setEnabled(true);
        btnOrdenar.setEnabled(true);

        int selec = jTableExperienciaTrabajador.rowAtPoint(evt.getPoint());
        txtIdExp.setText(String.valueOf(jTableExperienciaTrabajador.getValueAt(selec, 0)));
        txtNombreEmpresa.setText(String.valueOf(jTableExperienciaTrabajador.getValueAt(selec, 1)));
        txtCargoOcup.setText(String.valueOf(jTableExperienciaTrabajador.getValueAt(selec, 2)));
        txtDescripcion.setText(String.valueOf(jTableExperienciaTrabajador.getValueAt(selec, 3)));

        try {
            int srow = jTableExperienciaTrabajador.getSelectedRow();
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse((String) jTableExperienciaTrabajador.getValueAt(srow, 4));
            jDateChooserInicio.setDate(date);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        try {
            int srow = jTableExperienciaTrabajador.getSelectedRow();
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse((String) jTableExperienciaTrabajador.getValueAt(srow, 5));
            jDateChooserFinal.setDate(date);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        txtOrden.setText(String.valueOf(jTableExperienciaTrabajador.getValueAt(selec, 6)));
        txtIdTrabajador.setText(String.valueOf(jTableExperienciaTrabajador.getValueAt(selec, 7)));

        if (txtOrden.getText().equals("1")) {
            btnPos1.setEnabled(false);
            btnPos2.setEnabled(true);
            btnPos3.setEnabled(true);
            btnPos4.setEnabled(true);
            btnPos5.setEnabled(true);
        }
        if (txtOrden.getText().equals("2")) {
            btnPos1.setEnabled(true);
            btnPos2.setEnabled(false);
            btnPos3.setEnabled(true);
            btnPos4.setEnabled(true);
            btnPos5.setEnabled(true);
        }
        if (txtOrden.getText().equals("3")) {
            btnPos1.setEnabled(true);
            btnPos2.setEnabled(true);
            btnPos3.setEnabled(false);
            btnPos4.setEnabled(true);
            btnPos5.setEnabled(true);
        }
        if (txtOrden.getText().equals("4")) {
            btnPos1.setEnabled(true);
            btnPos2.setEnabled(true);
            btnPos3.setEnabled(true);
            btnPos4.setEnabled(false);
            btnPos5.setEnabled(true);
        }
        if (txtOrden.getText().equals("5")) {
            btnPos1.setEnabled(true);
            btnPos2.setEnabled(true);
            btnPos3.setEnabled(true);
            btnPos4.setEnabled(true);
            btnPos5.setEnabled(false);
        }
        if (txtOrden.getText().equals("6")) {
            btnPos1.setEnabled(true);
            btnPos2.setEnabled(true);
            btnPos3.setEnabled(true);
            btnPos4.setEnabled(true);
            btnPos5.setEnabled(true);
        }

        if (txtOrden.getText().equals("") || txtOrden.getText().equals("0")) {
            lblMuestra.setVisible(false);
            btnPos1.setEnabled(true);
            btnPos2.setEnabled(true);
            btnPos3.setEnabled(true);
            btnPos4.setEnabled(true);
            btnPos5.setEnabled(true);
        } else {
            lblMuestra.setVisible(true);
            lblMuestra.setText("Este registro se muestra en la posicion: " + txtOrden.getText());
        }
    }//GEN-LAST:event_jTableExperienciaTrabajadorMouseClicked

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        if (txtNombreEmpresa.getText().equals("") || txtCargoOcup.getText().equals("") || txtDescripcion.getText().equals("")
                || jDateChooserInicio.getDate() == null || jDateChooserFinal.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Asegurate de rellenar todos los campos!", "You can do it!", JOptionPane.INFORMATION_MESSAGE);
            Muestrame();
        } else {
            // BOTON ACTUALIZAR
            ConsultasExperiencia cex = new ConsultasExperiencia();
            Experiencia ex = new Experiencia();

            ex.setNombreEmpresa(txtNombreEmpresa.getText());
            ex.setCargoOcupado(txtCargoOcup.getText());
            ex.setDescripcion(txtDescripcion.getText());

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String date = sdf.format(jDateChooserInicio.getDate());
            ex.setFechaInicio(date);

            SimpleDateFormat sdff = new SimpleDateFormat("yyyy-MM-dd");
            String datef = sdff.format(jDateChooserFinal.getDate());
            ex.setFechaFinal(date);

            ex.setOrden(Integer.parseInt(txtOrden.getText()));
            ex.setIdTrabajador(Integer.parseInt(txtIdTrabajador.getText()));

            ex.setIdExperiencia(Integer.parseInt(txtIdExp.getText()));

            cex.actualizarExperiencia(ex);
//        cex.insertarExperiencia(ex);

            Muestrame();
            Limpiame();
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnPos7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPos7ActionPerformed
        if (txtNombreEmpresa.getText().equals("") || txtCargoOcup.getText().equals("") || txtDescripcion.getText().equals("")
                || jDateChooserInicio.getDate() == null || jDateChooserFinal.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Asegurate de rellenar todos los campos!", "You can do it!", JOptionPane.INFORMATION_MESSAGE);
            Muestrame();
        } else {
            // BOTON ACTUALIZAR
            ConsultasExperiencia cex = new ConsultasExperiencia();
            Experiencia ex = new Experiencia();

            ex.setNombreEmpresa(txtNombreEmpresa.getText());
            ex.setCargoOcupado(txtCargoOcup.getText());
            ex.setDescripcion(txtDescripcion.getText());

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String date = sdf.format(jDateChooserInicio.getDate());
            ex.setFechaInicio(date);

            SimpleDateFormat sdff = new SimpleDateFormat("yyyy-MM-dd");
            String datef = sdff.format(jDateChooserFinal.getDate());
            ex.setFechaFinal(date);

            ex.setOrden(0);
            ex.setIdTrabajador(Integer.parseInt(txtIdTrabajador.getText()));

            ex.setIdExperiencia(Integer.parseInt(txtIdExp.getText()));

            cex.actualizarExperiencia(ex);
//        cex.insertarExperiencia(ex);

            Muestrame();
            Limpiame();
        }
    }//GEN-LAST:event_btnPos7ActionPerformed

    private void btnCancelarOrdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarOrdMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarOrdMouseClicked

    private void btnCancelarOrdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarOrdActionPerformed
        btnCancelarOrd.setEnabled(false);
        btnCancelarOrd.setVisible(false);
        btnPos1.setEnabled(false);
        btnPos1.setVisible(false);
        btnPos2.setEnabled(false);
        btnPos2.setVisible(false);
        btnPos3.setEnabled(false);
        btnPos3.setVisible(false);
        btnPos4.setEnabled(false);
        btnPos4.setVisible(false);
        btnPos5.setEnabled(false);
        btnPos5.setVisible(false);
        btnPos7.setEnabled(false);
        btnPos7.setVisible(false);
    }//GEN-LAST:event_btnCancelarOrdActionPerformed

    private void btnPos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPos1ActionPerformed
        DefaultTableModel df = (DefaultTableModel) jTableExperienciaTrabajador.getModel();
        for (int i = 0; i < df.getRowCount(); i++) {
            if (String.valueOf(df.getValueAt(i, 6)).equals("1") || String.valueOf(df.getValueAt(i, 6)).equals("2") || String.valueOf(df.getValueAt(i, 6)).equals("3")
                    || String.valueOf(df.getValueAt(i, 6)).equals("4") || String.valueOf(df.getValueAt(i, 6)).equals("5")) {
                if (String.valueOf(df.getValueAt(i, 6)).equals("1")) {
                    JOptionPane.showMessageDialog(null, "Esta posicion ya esta ocupada\n"
                            + "Si deseas seleccionar este campo como la nueva posicion 1 "
                            + "\nentonces desmarca la anterior.", "You can do it!", JOptionPane.INFORMATION_MESSAGE);
                    break;
                }
            } else {
                if (txtNombreEmpresa.getText().equals("") || txtCargoOcup.getText().equals("") || txtDescripcion.getText().equals("")
                        || jDateChooserInicio.getDate() == null || jDateChooserFinal.getDate() == null) {
                    JOptionPane.showMessageDialog(null, "Asegurate de rellenar todos los campos!", "You can do it!", JOptionPane.INFORMATION_MESSAGE);
                    Muestrame();
                } else {
                    // BOTON ACTUALIZAR
                    ConsultasExperiencia cex = new ConsultasExperiencia();
                    Experiencia ex = new Experiencia();

                    ex.setNombreEmpresa(txtNombreEmpresa.getText());
                    ex.setCargoOcupado(txtCargoOcup.getText());
                    ex.setDescripcion(txtDescripcion.getText());

                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    String date = sdf.format(jDateChooserInicio.getDate());
                    ex.setFechaInicio(date);

                    SimpleDateFormat sdff = new SimpleDateFormat("yyyy-MM-dd");
                    String datef = sdff.format(jDateChooserFinal.getDate());
                    ex.setFechaFinal(date);

                    ex.setOrden(1);
                    ex.setIdTrabajador(Integer.parseInt(txtIdTrabajador.getText()));

                    ex.setIdExperiencia(Integer.parseInt(txtIdExp.getText()));

                    cex.actualizarExperiencia(ex);

                    Muestrame();
                    Limpiame();
                    break;
                }
            }
        }
    }//GEN-LAST:event_btnPos1ActionPerformed

    private void btnPos2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPos2ActionPerformed
        DefaultTableModel df = (DefaultTableModel) jTableExperienciaTrabajador.getModel();
        for (int i = 0; i < df.getRowCount(); i++) {
            if (String.valueOf(df.getValueAt(i, 6)).equals("1") || String.valueOf(df.getValueAt(i, 6)).equals("2") || String.valueOf(df.getValueAt(i, 6)).equals("3")
                    || String.valueOf(df.getValueAt(i, 6)).equals("4") || String.valueOf(df.getValueAt(i, 6)).equals("5")) {
                if (String.valueOf(df.getValueAt(i, 6)).equals("2")) {
                    JOptionPane.showMessageDialog(null, "Esta posicion ya esta ocupada\n"
                            + "Si deseas seleccionar este campo como la nueva posicion 2 "
                            + "\nentonces desmarca la anterior.", "You can do it!", JOptionPane.INFORMATION_MESSAGE);
                    break;
                }
            } else {
                if (txtNombreEmpresa.getText().equals("") || txtCargoOcup.getText().equals("") || txtDescripcion.getText().equals("")
                        || jDateChooserInicio.getDate() == null || jDateChooserFinal.getDate() == null) {
                    JOptionPane.showMessageDialog(null, "Asegurate de rellenar todos los campos!", "You can do it!", JOptionPane.INFORMATION_MESSAGE);
                    Muestrame();
                } else {
                    // BOTON ACTUALIZAR
                    ConsultasExperiencia cex = new ConsultasExperiencia();
                    Experiencia ex = new Experiencia();

                    ex.setNombreEmpresa(txtNombreEmpresa.getText());
                    ex.setCargoOcupado(txtCargoOcup.getText());
                    ex.setDescripcion(txtDescripcion.getText());

                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    String date = sdf.format(jDateChooserInicio.getDate());
                    ex.setFechaInicio(date);

                    SimpleDateFormat sdff = new SimpleDateFormat("yyyy-MM-dd");
                    String datef = sdff.format(jDateChooserFinal.getDate());
                    ex.setFechaFinal(date);

                    ex.setOrden(2);
                    ex.setIdTrabajador(Integer.parseInt(txtIdTrabajador.getText()));

                    ex.setIdExperiencia(Integer.parseInt(txtIdExp.getText()));

                    cex.actualizarExperiencia(ex);
//        cex.insertarExperiencia(ex);

                    Muestrame();
                    Limpiame();
                    break;
                }
            }
        }
    }//GEN-LAST:event_btnPos2ActionPerformed

    private void btnPos3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPos3ActionPerformed
        DefaultTableModel df = (DefaultTableModel) jTableExperienciaTrabajador.getModel();
        for (int i = 0; i < df.getRowCount(); i++) {
            if (String.valueOf(df.getValueAt(i, 6)).equals("1") || String.valueOf(df.getValueAt(i, 6)).equals("2") || String.valueOf(df.getValueAt(i, 6)).equals("3")
                    || String.valueOf(df.getValueAt(i, 6)).equals("4") || String.valueOf(df.getValueAt(i, 6)).equals("5")) {
                if (String.valueOf(df.getValueAt(i, 6)).equals("3")) {
                    JOptionPane.showMessageDialog(null, "Esta posicion ya esta ocupada\n"
                            + "Si deseas seleccionar este campo como la nueva posicion 3 "
                            + "\nentonces desmarca la anterior.", "You can do it!", JOptionPane.INFORMATION_MESSAGE);
                    break;
                }
            } else {
                if (txtNombreEmpresa.getText().equals("") || txtCargoOcup.getText().equals("") || txtDescripcion.getText().equals("")
                        || jDateChooserInicio.getDate() == null || jDateChooserFinal.getDate() == null) {
                    JOptionPane.showMessageDialog(null, "Asegurate de rellenar todos los campos!", "You can do it!", JOptionPane.INFORMATION_MESSAGE);
                    Muestrame();
                } else {
                    // BOTON ACTUALIZAR
                    ConsultasExperiencia cex = new ConsultasExperiencia();
                    Experiencia ex = new Experiencia();

                    ex.setNombreEmpresa(txtNombreEmpresa.getText());
                    ex.setCargoOcupado(txtCargoOcup.getText());
                    ex.setDescripcion(txtDescripcion.getText());

                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    String date = sdf.format(jDateChooserInicio.getDate());
                    ex.setFechaInicio(date);

                    SimpleDateFormat sdff = new SimpleDateFormat("yyyy-MM-dd");
                    String datef = sdff.format(jDateChooserFinal.getDate());
                    ex.setFechaFinal(date);

                    ex.setOrden(3);
                    ex.setIdTrabajador(Integer.parseInt(txtIdTrabajador.getText()));

                    ex.setIdExperiencia(Integer.parseInt(txtIdExp.getText()));

                    cex.actualizarExperiencia(ex);
//        cex.insertarExperiencia(ex);

                    Muestrame();
                    Limpiame();
                    break;
                }
            }
        }
    }//GEN-LAST:event_btnPos3ActionPerformed

    private void btnPos4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPos4ActionPerformed
        DefaultTableModel df = (DefaultTableModel) jTableExperienciaTrabajador.getModel();
        for (int i = 0; i < df.getRowCount(); i++) {
            if (String.valueOf(df.getValueAt(i, 6)).equals("1") || String.valueOf(df.getValueAt(i, 6)).equals("2") || String.valueOf(df.getValueAt(i, 6)).equals("3")
                    || String.valueOf(df.getValueAt(i, 6)).equals("4") || String.valueOf(df.getValueAt(i, 6)).equals("5")) {
                if (String.valueOf(df.getValueAt(i, 6)).equals("4")) {
                    JOptionPane.showMessageDialog(null, "Esta posicion ya esta ocupada\n"
                            + "Si deseas seleccionar este campo como la nueva posicion 4 "
                            + "\nentonces desmarca la anterior.", "You can do it!", JOptionPane.INFORMATION_MESSAGE);
                    break;
                }
            } else {
                if (txtNombreEmpresa.getText().equals("") || txtCargoOcup.getText().equals("") || txtDescripcion.getText().equals("")
                        || jDateChooserInicio.getDate() == null || jDateChooserFinal.getDate() == null) {
                    JOptionPane.showMessageDialog(null, "Asegurate de rellenar todos los campos!", "You can do it!", JOptionPane.INFORMATION_MESSAGE);
                    Muestrame();
                } else {
                    // BOTON ACTUALIZAR
                    ConsultasExperiencia cex = new ConsultasExperiencia();
                    Experiencia ex = new Experiencia();

                    ex.setNombreEmpresa(txtNombreEmpresa.getText());
                    ex.setCargoOcupado(txtCargoOcup.getText());
                    ex.setDescripcion(txtDescripcion.getText());

                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    String date = sdf.format(jDateChooserInicio.getDate());
                    ex.setFechaInicio(date);

                    SimpleDateFormat sdff = new SimpleDateFormat("yyyy-MM-dd");
                    String datef = sdff.format(jDateChooserFinal.getDate());
                    ex.setFechaFinal(date);

                    ex.setOrden(4);
                    ex.setIdTrabajador(Integer.parseInt(txtIdTrabajador.getText()));

                    ex.setIdExperiencia(Integer.parseInt(txtIdExp.getText()));

                    cex.actualizarExperiencia(ex);
//        cex.insertarExperiencia(ex);

                    Muestrame();
                    Limpiame();
                    break;
                }
            }
        }
    }//GEN-LAST:event_btnPos4ActionPerformed

    private void btnPos5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPos5ActionPerformed
        DefaultTableModel df = (DefaultTableModel) jTableExperienciaTrabajador.getModel();
        for (int i = 0; i < df.getRowCount(); i++) {
            if (String.valueOf(df.getValueAt(i, 6)).equals("1") || String.valueOf(df.getValueAt(i, 6)).equals("2") || String.valueOf(df.getValueAt(i, 6)).equals("3")
                    || String.valueOf(df.getValueAt(i, 6)).equals("4") || String.valueOf(df.getValueAt(i, 6)).equals("5")) {
                if (String.valueOf(df.getValueAt(i, 6)).equals("5")) {
                    JOptionPane.showMessageDialog(null, "Esta posicion ya esta ocupada\n"
                            + "Si deseas seleccionar este campo como la nueva posicion 5 "
                            + "\nentonces desmarca la anterior.", "You can do it!", JOptionPane.INFORMATION_MESSAGE);
                    break;
                }
            } else {
                if (txtNombreEmpresa.getText().equals("") || txtCargoOcup.getText().equals("") || txtDescripcion.getText().equals("")
                        || jDateChooserInicio.getDate() == null || jDateChooserFinal.getDate() == null) {
                    JOptionPane.showMessageDialog(null, "Asegurate de rellenar todos los campos!", "You can do it!", JOptionPane.INFORMATION_MESSAGE);
                    Muestrame();
                } else {
                    // BOTON ACTUALIZAR
                    ConsultasExperiencia cex = new ConsultasExperiencia();
                    Experiencia ex = new Experiencia();

                    ex.setNombreEmpresa(txtNombreEmpresa.getText());
                    ex.setCargoOcupado(txtCargoOcup.getText());
                    ex.setDescripcion(txtDescripcion.getText());

                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    String date = sdf.format(jDateChooserInicio.getDate());
                    ex.setFechaInicio(date);

                    SimpleDateFormat sdff = new SimpleDateFormat("yyyy-MM-dd");
                    String datef = sdff.format(jDateChooserFinal.getDate());
                    ex.setFechaFinal(date);

                    ex.setOrden(5);
                    ex.setIdTrabajador(Integer.parseInt(txtIdTrabajador.getText()));

                    ex.setIdExperiencia(Integer.parseInt(txtIdExp.getText()));

                    cex.actualizarExperiencia(ex);
//        cex.insertarExperiencia(ex);

                    Muestrame();
                    Limpiame();
                    break;
                }
            }
        }
    }//GEN-LAST:event_btnPos5ActionPerformed

    private void btnOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarActionPerformed
        btnCancelarOrd.setEnabled(true);
        btnCancelarOrd.setVisible(true);
        btnPos1.setVisible(true);
        btnPos2.setVisible(true);
        btnPos3.setVisible(true);
        btnPos4.setVisible(true);
        btnPos5.setVisible(true);
        btnPos7.setVisible(true);
        txtOrden.setText("");

        jTableExperienciaTrabajador.clearSelection();
        Limpiame();
    }//GEN-LAST:event_btnOrdenarActionPerformed

    void Limpiame() {
        txtNombreEmpresa.setText("");
        txtCargoOcup.setText("");
        txtDescripcion.setText("");
        txtOrden.setText("");
        txtIdExp.setText("");

        jDateChooserInicio.setDate(null);
        jDateChooserFinal.setDate(null);

        btnInsertar.setEnabled(true);
        btnActualizar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnOrdenar.setEnabled(false);
    }

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
            java.util.logging.Logger.getLogger(JDialog_P_Trabajador_Experiencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialog_P_Trabajador_Experiencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialog_P_Trabajador_Experiencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialog_P_Trabajador_Experiencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialog_P_Trabajador_Experiencia dialog = new JDialog_P_Trabajador_Experiencia(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnCancelarOrd;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnOrdenar;
    private javax.swing.JButton btnPos1;
    private javax.swing.JButton btnPos2;
    private javax.swing.JButton btnPos3;
    private javax.swing.JButton btnPos4;
    private javax.swing.JButton btnPos5;
    private javax.swing.JButton btnPos7;
    private com.toedter.calendar.JDateChooser jDateChooserFinal;
    private com.toedter.calendar.JDateChooser jDateChooserInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTableExperienciaTrabajador;
    private javax.swing.JLabel lblMuestra;
    private javax.swing.JTextField txtCargoOcup;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtIdExp;
    private javax.swing.JTextField txtIdTrabajador;
    private javax.swing.JTextField txtNombreEmpresa;
    private javax.swing.JTextField txtOrden;
    // End of variables declaration//GEN-END:variables
}
