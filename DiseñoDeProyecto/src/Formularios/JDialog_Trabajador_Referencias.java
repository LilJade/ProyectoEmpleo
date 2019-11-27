package Formularios;

import Consultas.ConsultasReferencia;
import Entidades.Referencia;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import rojerusan.RSAnimation;

/**
 *
 * @author Admin
 */
public class JDialog_Trabajador_Referencias extends javax.swing.JDialog {

    public JDialog_Trabajador_Referencias(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        RSAnimation.setMoverDerecha(-700, 500, 0, 2, this);
        Muestrame();
        //CODIGO PARA OCULTAR COLUMNAS EN UNA JTABLE
        jTableReferencias.getColumnModel().getColumn(0).setMaxWidth(0);
        jTableReferencias.getColumnModel().getColumn(7).setMaxWidth(0);
        jTableReferencias.getColumnModel().getColumn(8).setMaxWidth(0);
    }

    //METODO PARA VER LOS DATOS EN UNA JTABLE
    void Muestrame() {
        String Titulos[] = {"idReferencia", "nombreReferente", "apellidoReferente", "empresaReferente", "cargoReferente", "telefonoReferente", "correoReferente", "orden", "idTrabajador"};
        DefaultTableModel modelo = new DefaultTableModel(null, Titulos);
        ConsultasReferencia CoRe = new ConsultasReferencia();
        Referencia re = new Referencia();
        ArrayList<Referencia> PS = CoRe.mostrarReferenciasCrud(frmVisitante.id);
        Iterator i = PS.iterator();
        String Filas[] = new String[9];
        while (i.hasNext()) {
            Referencia ps;

            re = (Referencia) i.next();
            Filas[0] = String.valueOf(re.getIdreferencia());
            Filas[1] = re.getNombrereferente();
            Filas[2] = re.getApellidorefrente();
            Filas[3] = re.getEmpresareferente();
            Filas[4] = re.getCargoReferente();
            Filas[5] = re.getTelefonoReferente();
            Filas[6] = re.getCorreoReferente();
            Filas[7] = String.valueOf(re.getOrden());
            Filas[8] = String.valueOf(re.getIdTrabajador());
            modelo.addRow(Filas);

        }
        jTableReferencias.setModel(modelo);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableReferencias = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnInsertar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnOrdenar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        txtIdRef = new javax.swing.JTextField();
        txtNombRef = new javax.swing.JTextField();
        txtApelliRef = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtEntidadRef = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCarRef = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTelRef = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCorreoRef = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtOrdenRef = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtIdTrabajador = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(48, 62, 71));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(247, 211, 3), 2));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("REFERENCIAS PERSONALES");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/referencias_64.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(451, 451, 451)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9))
        );

        jTableReferencias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID_REFERENCIAS", "NOMBRE_REFERENCIANTE", "APELLIDO_REFERENCIADOR", "EMPRESA_REFERENCIADORA", "CARGO_REFERENCIANTE", "TEL_REFERENCIANTE", "CORREO_REFERENCIANTE", "ORDEN", "ID_TRABAJADOR"
            }
        ));
        jTableReferencias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableReferenciasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableReferencias);

        jPanel2.setBackground(new java.awt.Color(48, 62, 71));

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

        jButton5.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(240, 240, 240));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/regresar_24.png"))); // NOI18N
        jButton5.setText("ATRÁS");
        jButton5.setContentAreaFilled(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnInsertar)
                .addGap(148, 148, 148)
                .addComponent(btnActualizar)
                .addGap(143, 143, 143)
                .addComponent(btnOrdenar)
                .addGap(132, 132, 132)
                .addComponent(btnEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(47, 47, 47))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnActualizar)
                    .addComponent(btnOrdenar)
                    .addComponent(btnEliminar)
                    .addComponent(jButton5)
                    .addComponent(btnInsertar))
                .addGap(26, 26, 26))
        );

        txtIdRef.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N

        txtNombRef.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N

        txtApelliRef.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jLabel3.setText("ID_REFEREN..");

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jLabel4.setText("NOMB. REFEREN...");

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jLabel5.setText("APELLI.. REFEREN..");

        txtEntidadRef.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jLabel6.setText("ENTIDAD_REFEREN..");

        txtCarRef.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jLabel7.setText("CARGO_DEL REFREN..");

        txtTelRef.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jLabel8.setText("TEL: REFEREN..");

        txtCorreoRef.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jLabel9.setText("Em@il. REFEREN..");

        txtOrdenRef.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jLabel10.setText("ORDEN");

        txtIdTrabajador.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jLabel11.setText("ID_TRABAJADOR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(txtIdRef, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel3)))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombRef, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtApelliRef, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel5)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtEntidadRef)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCarRef, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTelRef, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtCorreoRef, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(46, 46, 46)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(txtOrdenRef, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(txtIdTrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIdRef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombRef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(363, 363, 363)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtApelliRef, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEntidadRef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCarRef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelRef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCorreoRef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtOrdenRef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdTrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addGap(40, 40, 40)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        try {
            //btnAtras
            RSAnimation.setMoverIzquierda(500, -900, 0, 2, this);
            Thread.sleep(1000);
            this.dispose();
        } catch (InterruptedException ex) {
            Logger.getLogger(JDialog_Trabajador_Referencias.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jButton5MouseClicked
    // BOTON INSERTAR REFERENCIA
    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        ConsultasReferencia ref = new ConsultasReferencia();
        Referencia re = new Referencia();
        re.setNombrereferente(txtNombRef.getText());
        re.setApellidorefrente(txtApelliRef.getText());
        re.setEmpresareferente(txtEntidadRef.getText());
        re.setCargoReferente(txtCorreoRef.getText());
        re.setTelefonoReferente(txtTelRef.getText());
        re.setCorreoReferente(txtCorreoRef.getText());

        if (txtOrdenRef.getText().isEmpty()) {

        } else {
            re.setOrden(Integer.parseInt(txtOrdenRef.getText()));
        }
        re.setIdTrabajador(Integer.parseInt(txtIdTrabajador.getText()));

        ref.insertarReferencia(re);
        Muestrame();


    }//GEN-LAST:event_btnInsertarActionPerformed

    //BOTON ACTUALIZAR REFERENCIA
    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        ConsultasReferencia ref = new ConsultasReferencia();
        Referencia re = new Referencia();
        re.setNombrereferente(txtNombRef.getText());
        re.setNombrereferente(txtNombRef.getText());
        re.setApellidorefrente(txtApelliRef.getText());
        re.setEmpresareferente(txtEntidadRef.getText());
        re.setCargoReferente(txtCorreoRef.getText());
        re.setTelefonoReferente(txtTelRef.getText());
        re.setCorreoReferente(txtCorreoRef.getText());
        re.setOrden(Integer.parseInt(txtOrdenRef.getText()));
        re.setIdTrabajador(Integer.parseInt(txtIdTrabajador.getText()));
        re.setIdreferencia(Integer.parseInt(txtIdRef.getText()));
        
        ref.actualizarReferencia(re);
        Muestrame();


    }//GEN-LAST:event_btnActualizarActionPerformed

    // BOTON ELIMINAR REFRENCIA
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        ConsultasReferencia ref = new ConsultasReferencia();
        Referencia re = new Referencia();

        re.setIdreferencia(Integer.parseInt(txtIdRef.getText()));
        ref.eliminarReferencia(re);
        Muestrame();
    }//GEN-LAST:event_btnEliminarActionPerformed

    //MOSTRAR LOS DATOS DE LA JTABLE EN LOS TXT
    private void jTableReferenciasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableReferenciasMouseClicked
        int selec = jTableReferencias.rowAtPoint(evt.getPoint());
        txtIdRef.setText(String.valueOf(jTableReferencias.getValueAt(selec, 0)));
        txtNombRef.setText(String.valueOf(jTableReferencias.getValueAt(selec, 1)));
        txtApelliRef.setText(String.valueOf(jTableReferencias.getValueAt(selec, 2)));
        txtEntidadRef.setText(String.valueOf(jTableReferencias.getValueAt(selec, 3)));
        txtCarRef.setText(String.valueOf(jTableReferencias.getValueAt(selec, 4)));
        txtTelRef.setText(String.valueOf(jTableReferencias.getValueAt(selec, 5)));
        txtCorreoRef.setText(String.valueOf(jTableReferencias.getValueAt(selec, 6)));
        txtOrdenRef.setText(String.valueOf(jTableReferencias.getValueAt(selec, 7)));
        txtIdTrabajador.setText(String.valueOf(jTableReferencias.getValueAt(selec, 8)));

    }//GEN-LAST:event_jTableReferenciasMouseClicked

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
            java.util.logging.Logger.getLogger(JDialog_Trabajador_Referencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialog_Trabajador_Referencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialog_Trabajador_Referencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialog_Trabajador_Referencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialog_Trabajador_Referencias dialog = new JDialog_Trabajador_Referencias(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnOrdenar;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableReferencias;
    private javax.swing.JTextField txtApelliRef;
    private javax.swing.JTextField txtCarRef;
    private javax.swing.JTextField txtCorreoRef;
    private javax.swing.JTextField txtEntidadRef;
    private javax.swing.JTextField txtIdRef;
    private javax.swing.JTextField txtIdTrabajador;
    private javax.swing.JTextField txtNombRef;
    private javax.swing.JTextField txtOrdenRef;
    private javax.swing.JTextField txtTelRef;
    // End of variables declaration//GEN-END:variables
}
