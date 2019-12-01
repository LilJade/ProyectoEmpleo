package Formularios;

import Consultas.ConsultasHabilidades;
import Entidades.Habilidad;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import rojerusan.RSAnimation;

public class JDialog_Trabajador_Habilidades extends javax.swing.JDialog {

    public JDialog_Trabajador_Habilidades(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        txtIdTrabajador.setText(String.valueOf(frmVisitante.id));
//        txtIdTrabajador.setVisible(false);
        //       txtIdHabil.setVisible(false);

        this.setLocationRelativeTo(null);
        RSAnimation.setMoverDerecha(-700, 500, 0, 2, this);

        btnInsertar.setEnabled(true);
        btnActualizar.setEnabled(false);
        btnEliminar.setEnabled(false);
        Muestrame();
        Limpiame();
    }

    void Limpiame() {
        txtHabilidad.setText("");
        txtIdHabil.setText("");
    }

    //METODO PARA VER LOS DATOS EN UNA JTABLE

    void Muestrame() {
        String Titulos[] = {"idHabil", "Habilidad", "idTrab"};
        DefaultTableModel modelo = new DefaultTableModel(null, Titulos);
        ConsultasHabilidades cHab = new ConsultasHabilidades();
        Habilidad h = new Habilidad();
        ArrayList<Habilidad> PS = cHab.mostrarHabilidadesCrud(frmVisitante.id);
        Iterator i = PS.iterator();
        String Filas[] = new String[3];
        while (i.hasNext()) {
            Habilidad ps;

            h = (Habilidad) i.next();
            Filas[0] = String.valueOf(h.getIdHabilidad());
            Filas[1] = h.getHabilidad();
            Filas[2] = String.valueOf(h.getIdTrabajador());
            modelo.addRow(Filas);

        }
        jTableHabilidades.setModel(modelo);
        //CODIGO PARA OCULTAR COLUMNAS EN UNA JTABLE
        jTableHabilidades.getColumnModel().getColumn(0).setMaxWidth(0);
        jTableHabilidades.getColumnModel().getColumn(2).setMaxWidth(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtIdHabil = new javax.swing.JTextField();
        txtIdTrabajador = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableHabilidades = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnInsertar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        txtHabilidad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(48, 62, 71));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(247, 211, 3), 2));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("HABILIDADES PERSONALES");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/referencias_64.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        txtIdHabil.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N

        txtIdTrabajador.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtIdHabil, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addComponent(txtIdTrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(559, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtIdTrabajador)
                    .addComponent(txtIdHabil))
                .addContainerGap())
        );

        jTableHabilidades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID_REFERENCIAS", "NOMBRE_REFERENCIANTE", "APELLIDO_REFERENCIADOR", "EMPRESA_REFERENCIADORA", "CARGO_REFERENCIANTE", "TEL_REFERENCIANTE", "CORREO_REFERENCIANTE", "ORDEN", "ID_TRABAJADOR"
            }
        ));
        jTableHabilidades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableHabilidadesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableHabilidades);

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
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
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
                .addGap(392, 392, 392)
                .addComponent(btnEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(47, 47, 47))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnActualizar)
                    .addComponent(btnEliminar)
                    .addComponent(jButton5)
                    .addComponent(btnInsertar))
                .addGap(26, 26, 26))
        );

        txtHabilidad.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Escribe tu habilidad: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHabilidad, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtHabilidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
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
            Logger.getLogger(JDialog_Trabajador_Habilidades.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jButton5MouseClicked
    // BOTON INSERTAR REFERENCIA
    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        if (txtHabilidad.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Asegurate de rellenar todos los campos!", "You can do it!", JOptionPane.INFORMATION_MESSAGE);
            Muestrame();
        } else {
            ConsultasHabilidades cHab = new ConsultasHabilidades();
            Habilidad h = new Habilidad();
            h.setHabilidad(txtHabilidad.getText());
            h.setIdTrabajador(Integer.parseInt(txtIdTrabajador.getText()));

            cHab.insertarHabilidades(h);
            Muestrame();
            Limpiame();
        }
    }//GEN-LAST:event_btnInsertarActionPerformed

    //BOTON ACTUALIZAR REFERENCIA
    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        if (txtHabilidad.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Asegurate de rellenar todos los campos!", "You can do it!", JOptionPane.INFORMATION_MESSAGE);
            Muestrame();
        } else {
            ConsultasHabilidades cHab = new ConsultasHabilidades();
            Habilidad h = new Habilidad();
            h.setIdHabilidad(Integer.parseInt(txtIdHabil.getText()));
            h.setHabilidad(txtHabilidad.getText());
            h.setIdTrabajador(Integer.parseInt(txtIdTrabajador.getText()));

            cHab.actualizarHabilidades(h);
            Muestrame();
            Limpiame();
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    // BOTON ELIMINAR REFRENCIA
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        ConsultasHabilidades cHab = new ConsultasHabilidades();
        Habilidad h = new Habilidad();
        h.setIdHabilidad(Integer.parseInt(txtIdHabil.getText()));

        cHab.eliminarHabilidades(h);
        Muestrame();
        Limpiame();
    }//GEN-LAST:event_btnEliminarActionPerformed

    //MOSTRAR LOS DATOS DE LA JTABLE EN LOS TXT
    private void jTableHabilidadesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableHabilidadesMouseClicked
        btnInsertar.setEnabled(true);
        btnActualizar.setEnabled(true);
        btnEliminar.setEnabled(true);

        int selec = jTableHabilidades.rowAtPoint(evt.getPoint());
        txtIdHabil.setText(String.valueOf(jTableHabilidades.getValueAt(selec, 0)));
        txtHabilidad.setText(String.valueOf(jTableHabilidades.getValueAt(selec, 1)));
        txtIdTrabajador.setText(String.valueOf(jTableHabilidades.getValueAt(selec, 2)));
    }//GEN-LAST:event_jTableHabilidadesMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        frmP_Trabajador.Habilidades(Integer.parseInt(txtIdTrabajador.getText()));
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(JDialog_Trabajador_Habilidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialog_Trabajador_Habilidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialog_Trabajador_Habilidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialog_Trabajador_Habilidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialog_Trabajador_Habilidades dialog = new JDialog_Trabajador_Habilidades(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableHabilidades;
    private javax.swing.JTextField txtHabilidad;
    private javax.swing.JTextField txtIdHabil;
    private javax.swing.JTextField txtIdTrabajador;
    // End of variables declaration//GEN-END:variables
}
