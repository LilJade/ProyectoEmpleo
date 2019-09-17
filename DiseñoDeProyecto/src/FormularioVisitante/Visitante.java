package FormularioVisitante;
import java.awt.Color;
import java.awt.Font; 
import AppPackage.AnimationClass;
import com.placeholder.PlaceHolder;
import javax.swing.JOptionPane;
import org.jdesktop.swingx.prompt.PromptSupport;



public class Visitante extends javax.swing.JFrame {

    PlaceHolder holder;

    public Visitante() {

        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Modulo Visitabte");
        btnAyuda.setToolTipText("Ayuda");
        btnCancelar.setToolTipText("Cerrar");
        lbMinimizar.setToolTipText("Minimizar");
        holder = new PlaceHolder(txtUsuario, "USUARIO O E-MAIL");
        holder = new PlaceHolder(txtContraseña, "CONTRASEÑA");
        this.lbOjo2.setVisible(false);
        
        /*prueba*/
//        PromptSupport.setPrompt("Escriba aqui", txtUsuario);
//        PromptSupport.setPrompt("Contraseña", txtContraseña);
        
        Font fuente = new Font("Arial Narrow", 3, 19);
        txtUsuario.setFont(fuente);
        txtUsuario.setForeground(new java .awt.Color(26,99,66));
        txtContraseña.setFont(fuente);
        txtContraseña.setForeground(new java.awt.Color(26,99,66));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpOpcion = new javax.swing.JPanel();
        btnEmpresa = new javax.swing.JButton();
        btnAyuda = new javax.swing.JButton();
        lbLista = new javax.swing.JLabel();
        btnAdolescente = new javax.swing.JButton();
        btnAdulto = new javax.swing.JButton();
        lbRegistrarse = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jpVista = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        txtBuscar = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        lbMinimizar = new javax.swing.JLabel();
        pnlSesion = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JPasswordField();
        txtUsuario = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        btnEntrar = new javax.swing.JButton();
        lbOjo1 = new javax.swing.JLabel();
        lbOjo2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpOpcion.setBackground(new java.awt.Color(0, 0, 51));
        jpOpcion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(132, 206, 255), 2));
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
        jpOpcion.add(btnEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(-85, 150, 100, 90));

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
        jpOpcion.add(btnAyuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 40, -1));

        lbLista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lista.png"))); // NOI18N
        lbLista.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbLista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbListaMouseClicked(evt);
            }
        });
        jpOpcion.add(lbLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 50));

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
        jpOpcion.add(btnAdulto, new org.netbeans.lib.awtextra.AbsoluteConstraints(-85, 250, 100, 90));

        lbRegistrarse.setFont(new java.awt.Font("Arial Narrow", 1, 26)); // NOI18N
        lbRegistrarse.setForeground(new java.awt.Color(132, 206, 255));
        lbRegistrarse.setText("REGISTRARSE");
        jpOpcion.add(lbRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 160, 30));

        jSeparator3.setForeground(new java.awt.Color(132, 206, 255));
        jpOpcion.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 260, 20));

        jPanel2.setBackground(new java.awt.Color(132, 206, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jpOpcion.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 260, 40));

        getContentPane().add(jpOpcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 260, 530));

        jpVista.setBackground(new java.awt.Color(0, 0, 51));
        jpVista.setForeground(new java.awt.Color(26, 99, 66));
        jpVista.setToolTipText("");

        javax.swing.GroupLayout jpVistaLayout = new javax.swing.GroupLayout(jpVista);
        jpVista.setLayout(jpVistaLayout);
        jpVistaLayout.setHorizontalGroup(
            jpVistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );
        jpVistaLayout.setVerticalGroup(
            jpVistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );

        getContentPane().add(jpVista, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 610, 530));

        jPanel1.setBackground(new java.awt.Color(93, 0, 93));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtBuscar.setBackground(new java.awt.Color(93, 0, 93));
        txtBuscar.setEditable(false);
        txtBuscar.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        txtBuscar.setForeground(new java.awt.Color(255, 153, 0));
        txtBuscar.setBorder(null);
        jPanel1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 300, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa_24.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, -1, 30));

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
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 0, 50, 40));

        jSeparator4.setBackground(new java.awt.Color(255, 153, 0));
        jSeparator4.setForeground(new java.awt.Color(255, 153, 0));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, 320, 20));

        lbMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/minimizar_24.png"))); // NOI18N
        lbMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbMinimizarMouseClicked(evt);
            }
        });
        jPanel1.add(lbMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 0, 30, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1160, 60));

        pnlSesion.setBackground(new java.awt.Color(248, 248, 244));
        pnlSesion.setDoubleBuffered(false);
        pnlSesion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(26, 99, 66));
        jLabel1.setText("USUARIO:");
        pnlSesion.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(26, 99, 66));
        jLabel2.setText("CONTRASEÑA:");
        pnlSesion.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuarioNEW_128.png"))); // NOI18N
        pnlSesion.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 130, 140));

        jSeparator1.setBackground(new java.awt.Color(26, 99, 66));
        pnlSesion.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 230, 10));

        jSeparator2.setBackground(new java.awt.Color(26, 99, 66));
        pnlSesion.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 230, 10));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuario_24.png"))); // NOI18N
        pnlSesion.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 30, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bloquear_24.png"))); // NOI18N
        pnlSesion.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 30, 30));

        txtContraseña.setBackground(new java.awt.Color(248, 248, 244));
        txtContraseña.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        txtContraseña.setForeground(new java.awt.Color(26, 99, 66));
        txtContraseña.setBorder(null);
        txtContraseña.setDisabledTextColor(new java.awt.Color(26, 99, 66));
        txtContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContraseñaKeyTyped(evt);
            }
        });
        pnlSesion.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 190, 30));

        txtUsuario.setBackground(new java.awt.Color(248, 248, 244));
        txtUsuario.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(26, 99, 66));
        txtUsuario.setBorder(null);
        txtUsuario.setDisabledTextColor(new java.awt.Color(26, 99, 66));
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyTyped(evt);
            }
        });
        pnlSesion.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 200, 30));
        pnlSesion.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, 150, 60, 30));

        jSeparator6.setBackground(new java.awt.Color(26, 99, 66));
        pnlSesion.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 80, 10));

        jSeparator7.setBackground(new java.awt.Color(26, 99, 66));
        pnlSesion.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 70, 10));

        btnEntrar.setBackground(new java.awt.Color(93, 0, 93));
        btnEntrar.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btnEntrar.setForeground(new java.awt.Color(248, 248, 244));
        btnEntrar.setText("REGISTRARSE");
        pnlSesion.add(btnEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 220, 60));

        lbOjo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ojo_16.png"))); // NOI18N
        lbOjo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbOjo1MousePressed(evt);
            }
        });
        pnlSesion.add(lbOjo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, 20, 20));

        lbOjo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ojo.tachado_16.png"))); // NOI18N
        lbOjo2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbOjo2MousePressed(evt);
            }
        });
        pnlSesion.add(lbOjo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, -1, -1));

        getContentPane().add(pnlSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 0, 290, 520));

        jPanel4.setBackground(new java.awt.Color(93, 0, 93));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 520, 290, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyudaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAyudaActionPerformed

    private void lbListaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbListaMouseClicked
        //---------------------->
        AnimationClass empresa = new AnimationClass();
        empresa.jButtonXRight(-85, 15, 10, 5, btnEmpresa);
        AnimationClass adulto = new AnimationClass();
        adulto.jButtonXRight(-85, 15, 20, 5, btnAdulto);
        AnimationClass adolescente = new AnimationClass();
        adolescente.jButtonXRight(-85, 15, 25, 5, btnAdolescente);

        //<---------
        AnimationClass empressa = new AnimationClass();
        empressa.jButtonXLeft(15, -85, 25, 5, btnEmpresa);
        AnimationClass adultoo = new AnimationClass();
        adultoo.jButtonXLeft(15, -85, 20, 5, btnAdulto);
        AnimationClass adolescentee = new AnimationClass();
        adolescentee.jButtonXLeft(15, -85, 10, 5, btnAdolescente);


    }//GEN-LAST:event_lbListaMouseClicked

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
        this.setState(Visitante.ICONIFIED);
    }//GEN-LAST:event_lbMinimizarMouseClicked

    private void btnAyudaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAyudaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAyudaMouseClicked

    private void lbOjo1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbOjo1MousePressed
       lbOjo2.setVisible(true);
       lbOjo1.setVisible(false);
       txtContraseña.setEchoChar((char)0);
    }//GEN-LAST:event_lbOjo1MousePressed

    private void lbOjo2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbOjo2MousePressed
       lbOjo1.setVisible(true);
       lbOjo2.setVisible(false);
       txtContraseña.setEchoChar('*');
    }//GEN-LAST:event_lbOjo2MousePressed

    private void txtUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyTyped
//lbUsuario.setVisible(false);
//if(txtUsuario.getText().isEmpty()){
//    lbUsuario.setVisible(true);
//}
    }//GEN-LAST:event_txtUsuarioKeyTyped

    private void txtContraseñaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContraseñaKeyTyped
//       lbContraseña.setVisible(false);
//       if(txtContraseña.getText().isEmpty()){
//           lbContraseña.setVisible(true);
//           
//       }
    }//GEN-LAST:event_txtContraseñaKeyTyped

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
            java.util.logging.Logger.getLogger(Visitante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Visitante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Visitante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Visitante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Visitante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdolescente;
    private javax.swing.JButton btnAdulto;
    private javax.swing.JButton btnAyuda;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEmpresa;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JPanel jpOpcion;
    private javax.swing.JPanel jpVista;
    private javax.swing.JLabel lbLista;
    private javax.swing.JLabel lbMinimizar;
    private javax.swing.JLabel lbOjo1;
    private javax.swing.JLabel lbOjo2;
    private javax.swing.JLabel lbRegistrarse;
    private javax.swing.JPanel pnlSesion;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
