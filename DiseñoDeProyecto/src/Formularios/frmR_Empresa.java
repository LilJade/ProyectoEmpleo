package Formularios;

import Consultas.ConsultasEmpresa;
import Entidades.Empresa;
import org.jdesktop.swingx.prompt.PromptSupport;
import java.awt.Font;
import java.awt.Image;
import java.io.File;
import java.nio.file.Files;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class frmR_Empresa extends javax.swing.JFrame {

    public frmR_Empresa() {
        initComponents();
        this.setLocationRelativeTo(null);

        //sms flotantel
        PromptSupport.setPrompt("Giro Comercial", txtGiroComercial);
        PromptSupport.setPrompt("Departamento", txtDepartamento);
        PromptSupport.setPrompt("Nombre Empresa", txtNombreE);
        PromptSupport.setPrompt("Acronimo Empresa", txtAcronimoE);
        PromptSupport.setPrompt("Descrpcion de la Empresa", txtDescripcion);
        PromptSupport.setPrompt("Direccion de la Empresa", txtUbicacion);
        PromptSupport.setPrompt("Correo de la Empresa", txtCorreoE);
        PromptSupport.setPrompt("Contraseña", txtContraseñaE);
        PromptSupport.setPrompt("Telefono  de la Empresa", txtTelefono);
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
        btnRegistrarE.setFont(fuente);
        btnRegistrarE.setForeground(new java.awt.Color(65, 138, 168));
        txtDepartamento.setFont(fuente);
        txtDepartamento.setForeground(new java.awt.Color(65, 138, 168));
        txtGiroComercial.setFont(fuente);
        txtGiroComercial.setForeground(new java.awt.Color(65, 138, 168));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        txtNombreE = new javax.swing.JTextField();
        txtAcronimoE = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        txtUbicacion = new javax.swing.JTextField();
        txtContraseñaE = new javax.swing.JTextField();
        txtCorreoE = new javax.swing.JTextField();
        btnRegistrarE = new javax.swing.JButton();
        txtTelefono = new javax.swing.JTextField();
        btnActivaA = new javax.swing.JButton();
        btnAyuda = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnCambiarPerfil = new javax.swing.JButton();
        txtDepartamento = new javax.swing.JTextField();
        txtGiroComercial = new javax.swing.JTextField();
        txturl = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(202, 219, 236));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator2.setBackground(new java.awt.Color(99, 130, 191));
        jSeparator2.setForeground(new java.awt.Color(73, 210, 149));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 180, 20));
        getContentPane().add(txtNombreE, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 240, 35));
        getContentPane().add(txtAcronimoE, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 240, 35));
        getContentPane().add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 490, 90));

        txtUbicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUbicacionActionPerformed(evt);
            }
        });
        getContentPane().add(txtUbicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 240, 35));
        getContentPane().add(txtContraseñaE, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 470, 240, 35));
        getContentPane().add(txtCorreoE, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 240, 35));

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
        getContentPane().add(btnRegistrarE, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 730, 330, 50));
        getContentPane().add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, 240, 35));

        btnActivaA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/feliz_24.png"))); // NOI18N
        btnActivaA.setBorder(null);
        btnActivaA.setContentAreaFilled(false);
        btnActivaA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btnActivaA, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 30, 30));

        btnAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AAyuda_24.png"))); // NOI18N
        btnAyuda.setBorder(null);
        btnAyuda.setContentAreaFilled(false);
        btnAyuda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAyudaActionPerformed(evt);
            }
        });
        getContentPane().add(btnAyuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 30, 30));

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir_24.png"))); // NOI18N
        btnCancelar.setBorder(null);
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 30, 30));

        btnCambiarPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/añadirfoto_64.png"))); // NOI18N
        btnCambiarPerfil.setBorder(null);
        btnCambiarPerfil.setContentAreaFilled(false);
        btnCambiarPerfil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCambiarPerfil.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/añadirfoto_64.png"))); // NOI18N
        btnCambiarPerfil.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/añadirfoto_128.png"))); // NOI18N
        btnCambiarPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarPerfilActionPerformed(evt);
            }
        });
        getContentPane().add(btnCambiarPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 140, 140));
        getContentPane().add(txtDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, 240, 35));
        getContentPane().add(txtGiroComercial, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 530, 240, 35));
        getContentPane().add(txturl, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 70, 20));

        jSeparator3.setBackground(new java.awt.Color(99, 130, 191));
        jSeparator3.setForeground(new java.awt.Color(73, 210, 149));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 180, 10));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    File file;


    private void txtUbicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUbicacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUbicacionActionPerformed

    private void btnRegistrarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarEActionPerformed
        ConsultasEmpresa cEmp = new ConsultasEmpresa();
        Empresa eEmp = new Empresa();
        try {

            eEmp.setNombre(txtNombreE.getText());
            eEmp.setAcronimo(txtAcronimoE.getText());
            eEmp.setDescripcion(txtDescripcion.getText());

            eEmp.setDepartamento(txtDepartamento.getText());
            eEmp.setDireccion(txtUbicacion.getText());
            eEmp.setTelefono(txtTelefono.getText());
            eEmp.setCorreo(txtCorreoE.getText());
            eEmp.setContraseña(txtContraseñaE.getText());
            
            byte[] sq = Files.readAllBytes(file.toPath());
            eEmp.setImPerfil(sq);
            
            String Girocomercial = String.valueOf(txtGiroComercial.getText());
            int numEntero = Integer.parseInt(Girocomercial);
            eEmp.setIdGiroComercial(numEntero);

            cEmp.insertar(eEmp);
        } catch (Exception ex) {
            Logger.getLogger(frmR_Empresa.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnRegistrarEActionPerformed

    private void btnAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyudaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAyudaActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        frmVisitante V = new frmVisitante();
        V.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnCambiarPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarPerfilActionPerformed
        JFileChooser archivo = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Imagenes", "jpg", "png", "jpeg");
        archivo.setFileFilter(filtro);
        archivo.setDialogTitle("Elegir Imagen de Perfil");
        int ventana = archivo.showOpenDialog(null);
        if (ventana == JFileChooser.APPROVE_OPTION) {
            file = archivo.getSelectedFile();
            txturl.setText(String.valueOf(file));
            Image foto = getToolkit().getImage(txturl.getText());
            foto = foto.getScaledInstance(btnCambiarPerfil.getWidth(), btnCambiarPerfil.getHeight(), Image.SCALE_DEFAULT);

            btnCambiarPerfil.setIcon(new ImageIcon(foto));

        }          // TODO add your handling code here:
    }//GEN-LAST:event_btnCambiarPerfilActionPerformed

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
            java.util.logging.Logger.getLogger(frmR_Empresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmR_Empresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmR_Empresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmR_Empresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmR_Empresa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActivaA;
    private javax.swing.JButton btnAyuda;
    private javax.swing.JButton btnCambiarPerfil;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRegistrarE;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField txtAcronimoE;
    private javax.swing.JTextField txtContraseñaE;
    private javax.swing.JTextField txtCorreoE;
    private javax.swing.JTextField txtDepartamento;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtGiroComercial;
    private javax.swing.JTextField txtNombreE;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUbicacion;
    private javax.swing.JLabel txturl;
    // End of variables declaration//GEN-END:variables
}
