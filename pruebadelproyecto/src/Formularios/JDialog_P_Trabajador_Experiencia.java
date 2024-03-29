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
        Muestrame();
        RSAnimation.setMoverDerecha(-700, 500, 0, 2, this);
        btnInsertar.setEnabled(true);
        btnActualizar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnOrdenar.setEnabled(false);
    }
//MOSTRAR DATOS EN LA JTABLE

    void Muestrame() {
        String Titulos[] = {"idExp", "Nombre de la Empresa", "Cargo Ocupado", "Descripcion", "Fecha Inicial", "Fecha Final", "orden", "idTrabajador"};
        DefaultTableModel model = new DefaultTableModel(null, Titulos);
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
        txtIdExp = new javax.swing.JTextField();
        txtOrden = new javax.swing.JTextField();
        txtIdTrabajador = new javax.swing.JTextField();
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

        txtIdExp.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jPanel1.add(txtIdExp, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, 36, 30));

        txtOrden.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jPanel1.add(txtOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, 47, 30));
        jPanel1.add(txtIdTrabajador, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 20, 51, 30));

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                    .addComponent(jDateChooserInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jDateChooserFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNombreEmpresa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCargoOcup)
                                .addGap(22, 22, 22))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jDateChooserInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDateChooserFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        try {
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
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnOrdenar;
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
    private javax.swing.JTextField txtCargoOcup;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtIdExp;
    private javax.swing.JTextField txtIdTrabajador;
    private javax.swing.JTextField txtNombreEmpresa;
    private javax.swing.JTextField txtOrden;
    // End of variables declaration//GEN-END:variables
}
