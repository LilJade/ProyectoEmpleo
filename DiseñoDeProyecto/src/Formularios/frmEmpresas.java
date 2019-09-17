package Formularios;

import org.jdesktop.swingx.prompt.PromptSupport;
import java.awt.Font;

public class frmEmpresas extends javax.swing.JFrame {

    public frmEmpresas() {
        initComponents();
        this.setLocationRelativeTo(null);

        //sms flotantel
        PromptSupport.setPrompt("Nombre Empresa", txtNombreE);
        PromptSupport.setPrompt("Acronimo Empresa", txtAcronimoE);
        PromptSupport.setPrompt("Descrpcion de la Empresa", txtDescripcion);
        PromptSupport.setPrompt("Ubicacion de la Empresa", txtUbicacion);
        PromptSupport.setPrompt("Correo de la Empresa", txtCorreoE);
        PromptSupport.setPrompt("Contraseña", txtContraseñaE);
        PromptSupport.setPrompt("Telefono  de la Empresa", txtTelefono);
        PromptSupport.setPrompt("Categoria de la Empresa", txtCategoria);
       btnActivaA.setToolTipText("Activar");
       btnAyuda.setToolTipText("Ayuda");
       btnCancelar.setToolTipText("Cerrar");
       btnCambiarPerfil.setToolTipText("Editar IMAGEN");

        //fuente y diseño de la letra en cada txt
        Font fuente = new Font("Decker", 3, 15);
        txtAcronimoE.setFont(fuente);
        txtAcronimoE.setForeground(new java.awt.Color(65, 138, 168));
        txtNombreE.setFont(fuente);
        txtNombreE.setForeground(new java.awt.Color(65, 138, 168));
        txtDescripcion.setFont(fuente);
        txtDescripcion.setForeground(new java.awt.Color(65, 138, 168));
        txtUbicacion.setFont(fuente);
        txtUbicacion.setForeground(new java.awt.Color(65, 138, 168));
        txtCorreoE.setFont(fuente);
        txtCorreoE.setForeground(new java.awt.Color(65, 138, 168));
        txtContraseñaE.setFont(fuente);
        txtContraseñaE.setForeground(new java.awt.Color(65, 138, 168));
        txtTelefono.setFont(fuente);
        txtTelefono.setForeground(new java.awt.Color(65, 138, 168));
        txtCategoria.setFont(fuente);
        txtCategoria.setForeground(new java.awt.Color(65, 138, 168));
        btnRegistrarE.setFont(fuente);
        btnRegistrarE.setForeground(new java.awt.Color(65, 138, 168));
        
      

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        txtNombreE = new javax.swing.JTextField();
        txtAcronimoE = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        txtUbicacion = new javax.swing.JTextField();
        txtContraseñaE = new javax.swing.JTextField();
        txtCorreoE = new javax.swing.JTextField();
        cmbDepartamento = new javax.swing.JComboBox<>();
        btnRegistrarE = new javax.swing.JButton();
        txtTelefono = new javax.swing.JTextField();
        txtCategoria = new javax.swing.JTextField();
        btnActivaA = new javax.swing.JButton();
        btnAyuda = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnCambiarPerfil = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(202, 219, 236));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setBackground(new java.awt.Color(99, 130, 191));
        jSeparator1.setForeground(new java.awt.Color(73, 210, 149));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 190, 15));

        jSeparator2.setBackground(new java.awt.Color(99, 130, 191));
        jSeparator2.setForeground(new java.awt.Color(73, 210, 149));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 190, 10));
        getContentPane().add(txtNombreE, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 230, 40));
        getContentPane().add(txtAcronimoE, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 220, 40));
        getContentPane().add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 460, 90));

        txtUbicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUbicacionActionPerformed(evt);
            }
        });
        getContentPane().add(txtUbicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 420, 240, 40));
        getContentPane().add(txtContraseñaE, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 490, 220, 40));
        getContentPane().add(txtCorreoE, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 230, 40));

        cmbDepartamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDepartamentoActionPerformed(evt);
            }
        });
        getContentPane().add(cmbDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 190, 40));

        btnRegistrarE.setBackground(new java.awt.Color(202, 219, 236));
        btnRegistrarE.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btnRegistrarE.setForeground(new java.awt.Color(39, 86, 179));
        btnRegistrarE.setText("REGISTRAR");
        btnRegistrarE.setBorder(null);
        btnRegistrarE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrarE.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRegistrarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarEActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrarE, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 690, 330, 50));
        getContentPane().add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, 220, 40));
        getContentPane().add(txtCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 580, 230, 40));

        btnActivaA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/feliz_24.png"))); // NOI18N
        btnActivaA.setBorder(null);
        btnActivaA.setContentAreaFilled(false);
        btnActivaA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btnActivaA, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 30, 30));

        btnAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AAyuda_24.png"))); // NOI18N
        btnAyuda.setBorder(null);
        btnAyuda.setContentAreaFilled(false);
        btnAyuda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btnAyuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 30, 30));

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir_24.png"))); // NOI18N
        btnCancelar.setBorder(null);
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 30, 30));

        btnCambiarPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/empresa_128.png"))); // NOI18N
        btnCambiarPerfil.setBorder(null);
        btnCambiarPerfil.setContentAreaFilled(false);
        btnCambiarPerfil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btnCambiarPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 150, 150));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 250, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDepartamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbDepartamentoActionPerformed

    private void txtUbicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUbicacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUbicacionActionPerformed

    private void btnRegistrarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarEActionPerformed

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
            java.util.logging.Logger.getLogger(frmEmpresas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmEmpresas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmEmpresas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmEmpresas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmEmpresas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActivaA;
    private javax.swing.JButton btnAyuda;
    private javax.swing.JButton btnCambiarPerfil;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRegistrarE;
    private javax.swing.JComboBox<String> cmbDepartamento;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtAcronimoE;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtContraseñaE;
    private javax.swing.JTextField txtCorreoE;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtNombreE;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUbicacion;
    // End of variables declaration//GEN-END:variables
}
