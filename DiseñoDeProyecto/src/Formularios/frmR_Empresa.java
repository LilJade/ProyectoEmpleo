package Formularios;

import Consultas.ConsultasEmpresa;
import Entidades.Empresa;
import Entidades.GiroComercial;
import org.jdesktop.swingx.prompt.PromptSupport;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class frmR_Empresa extends javax.swing.JFrame {
    
    public frmR_Empresa() {
        initComponents();
        this.setLocationRelativeTo(null);
        btnRegistrarE.setEnabled(false);
        txtDescripcion.setLineWrap(true);
        txtUbicacion.setLineWrap(true);
        //sms flotantel
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
        
        cargarcombo();
    }
    
    String filasCombo[] = new String[13];
    
    String array[] = new String[6];
    int contadors = 0;
    
    public void cargarcombo() {
        ConsultasEmpresa mo = new ConsultasEmpresa();
        ArrayList<GiroComercial> PS = mo.mostrargiros();
        Iterator i = PS.iterator();
        DefaultComboBoxModel DefaultComboBoxModel = new DefaultComboBoxModel();
        DefaultComboBoxModel.removeAllElements();
        while (i.hasNext()) {
            GiroComercial p;
            p = (GiroComercial) i.next();
            array[contadors] = String.valueOf(p.getIdGiroComercial());
            filasCombo[1] = p.getCategoriaNombre();
            DefaultComboBoxModel.addElement(p.getCategoriaNombre());
            contadors++;
        }
        
        cmb_girocomercial.setModel(DefaultComboBoxModel);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        txtNombreE = new javax.swing.JTextField();
        txtAcronimoE = new javax.swing.JTextField();
        txtContraseñaE = new javax.swing.JTextField();
        txtCorreoE = new javax.swing.JTextField();
        btnRegistrarE = new javax.swing.JButton();
        txtTelefono = new javax.swing.JTextField();
        btnActivaA = new javax.swing.JButton();
        btnAyuda = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnCambiarPerfil = new javax.swing.JButton();
        txturl = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        cmb_girocomercial = new javax.swing.JComboBox();
        cmbt_Departamento = new javax.swing.JComboBox();
        lblNombreE = new javax.swing.JLabel();
        lblAcronimoE = new javax.swing.JLabel();
        lblDescripcionE = new javax.swing.JLabel();
        lblUbicacionE = new javax.swing.JLabel();
        lblCorreoE = new javax.swing.JLabel();
        lblContraseñaE = new javax.swing.JLabel();
        lblTelefonoE = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        txtConfirmarC = new javax.swing.JTextField();
        lblConfirmarC = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtUbicacion = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(202, 219, 236));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator2.setBackground(new java.awt.Color(99, 130, 191));
        jSeparator2.setForeground(new java.awt.Color(73, 210, 149));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 180, -1));

        txtNombreE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreEKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreEKeyTyped(evt);
            }
        });
        getContentPane().add(txtNombreE, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 500, 35));

        txtAcronimoE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAcronimoEKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAcronimoEKeyTyped(evt);
            }
        });
        getContentPane().add(txtAcronimoE, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 240, 35));

        txtContraseñaE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtContraseñaEKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContraseñaEKeyTyped(evt);
            }
        });
        getContentPane().add(txtContraseñaE, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 630, 240, 35));

        txtCorreoE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoEActionPerformed(evt);
            }
        });
        txtCorreoE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCorreoEKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCorreoEKeyTyped(evt);
            }
        });
        getContentPane().add(txtCorreoE, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, 240, 35));

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
        getContentPane().add(btnRegistrarE, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 710, 330, 50));

        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });
        getContentPane().add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 560, 230, 35));

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
        getContentPane().add(btnCambiarPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 150, 140));
        getContentPane().add(txturl, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 70, 20));

        jSeparator3.setBackground(new java.awt.Color(99, 130, 191));
        jSeparator3.setForeground(new java.awt.Color(73, 210, 149));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 180, 10));

        cmb_girocomercial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_girocomercialActionPerformed(evt);
            }
        });
        getContentPane().add(cmb_girocomercial, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 140, 30));

        cmbt_Departamento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ahuachapán", "Cabañas", "Chalatenango", "Cuscatlán", "La Libertad", "La Paz", "La Unión", "Morazán", "San Miguel", "San Salvador", "San Vicente", "Santa Ana", "Sonsonate", "Usulután" }));
        getContentPane().add(cmbt_Departamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 440, 140, -1));

        lblNombreE.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(lblNombreE, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 500, 20));

        lblAcronimoE.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(lblAcronimoE, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 240, 20));

        lblDescripcionE.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(lblDescripcionE, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 370, 20));

        lblUbicacionE.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(lblUbicacionE, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 240, 20));

        lblCorreoE.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(lblCorreoE, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 600, 240, 20));

        lblContraseñaE.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(lblContraseñaE, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 670, 230, 20));

        lblTelefonoE.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(lblTelefonoE, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 600, 230, 20));

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        txtDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDescripcionKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(txtDescripcion);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 490, 70));

        txtConfirmarC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtConfirmarCKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtConfirmarCKeyTyped(evt);
            }
        });
        getContentPane().add(txtConfirmarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 630, 230, 35));

        lblConfirmarC.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(lblConfirmarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 670, 230, 20));

        txtUbicacion.setColumns(20);
        txtUbicacion.setRows(5);
        txtUbicacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUbicacionKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(txtUbicacion);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 320, 110));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    File file;
    

    private void btnRegistrarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarEActionPerformed
        if (txtContraseñaE.getText().equals(txtConfirmarC.getText())) {
            
            ConsultasEmpresa cEmp = new ConsultasEmpresa();
            Empresa eEmp = new Empresa();
            try {
                
                eEmp.setNombre(txtNombreE.getText());
                eEmp.setAcronimo(txtAcronimoE.getText());
                eEmp.setDescripcion(txtDescripcion.getText());
                
                eEmp.setDepartamento((String) cmbt_Departamento.getSelectedItem());
                eEmp.setDireccion(txtUbicacion.getText());
                eEmp.setTelefono(txtTelefono.getText());
                eEmp.setCorreo(txtCorreoE.getText());
                eEmp.setContraseña(txtContraseñaE.getText());
                
                byte[] sq = Files.readAllBytes(file.toPath());
                eEmp.setImPerfil(sq);
                
                int indice, otro;
                String valor;
                indice = cmb_girocomercial.getSelectedIndex();
                valor = array[indice];
                otro = Integer.parseInt(valor);
                eEmp.setIdGiroComercial(otro);
                
                cEmp.insertar(eEmp);
            } catch (Exception ex) {
                Logger.getLogger(frmR_Empresa.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } else {
            lblConfirmarC.setText("La contraseña no coinciden");
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

    private void txtNombreEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreEKeyTyped
        if (txtNombreE.getText().length() >= 100) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
            lblNombreE.setText("Limite permitido de caracteres 100");
        } else {
            lblNombreE.setText("");
        }
    }//GEN-LAST:event_txtNombreEKeyTyped

    private void txtAcronimoEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAcronimoEKeyTyped
        if (txtAcronimoE.getText().length() >= 25) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
            lblAcronimoE.setText("Limite permitido de caraceteres 25");
        } else {
            lblAcronimoE.setText("");
        }
    }//GEN-LAST:event_txtAcronimoEKeyTyped

    private void txtCorreoEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoEKeyTyped
        if (txtCorreoE.getText().length() >= 150) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
            lblCorreoE.setText("Limite permitido de caracteres 150");
        } else {
            lblCorreoE.setText("");
        }
        if (!Character.isLetter(evt.getKeyChar()) && evt.getKeyChar() != '.' && !Character.isDigit(evt.getKeyChar())
                && evt.getKeyChar() != '@') {
            evt.consume();
        }
        if (evt.getKeyChar() == '.' && txtCorreoE.getText().contains(".")) {
            evt.consume();
        }
        if (evt.getKeyChar() == '@' && txtCorreoE.getText().contains("@")) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCorreoEKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        if (txtTelefono.getText().length() == 4) {
            evt.consume();
            String nombre = txtTelefono.getText() + "-";
            txtTelefono.setText(nombre);
            Toolkit.getDefaultToolkit().beep();
            
        } else if (txtTelefono.getText().length() >= 9) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
            lblTelefonoE.setText("Maximo de numeros alcanzados");
        }
        if (!Character.isDigit(evt.getKeyChar())
                && evt.getKeyChar() != ' ') {
            evt.consume();
        }
        if (evt.getKeyChar() == ' ' && txtTelefono.getText().contains(" ")) {
            evt.consume();
    }//GEN-LAST:event_txtTelefonoKeyTyped
    }
    private void txtNombreEKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreEKeyReleased
        ValidacionRegistroE();
    }//GEN-LAST:event_txtNombreEKeyReleased

    private void txtAcronimoEKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAcronimoEKeyReleased
        ValidacionRegistroE();
    }//GEN-LAST:event_txtAcronimoEKeyReleased

    private void txtCorreoEKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoEKeyReleased
        ValidacionRegistroE();
    }//GEN-LAST:event_txtCorreoEKeyReleased

    private void txtTelefonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyReleased
        ValidacionRegistroE();
    }//GEN-LAST:event_txtTelefonoKeyReleased

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void txtContraseñaEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContraseñaEKeyTyped
        if (txtContraseñaE.getText().length() >= 50) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
            lblContraseñaE.setText("Limite permitido de caracteres 50");
        } else {
            lblContraseñaE.setText("");
        }
    }//GEN-LAST:event_txtContraseñaEKeyTyped

    private void txtContraseñaEKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContraseñaEKeyReleased
        ValidacionRegistroE();
    }//GEN-LAST:event_txtContraseñaEKeyReleased

    private void txtConfirmarCKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConfirmarCKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConfirmarCKeyReleased

    private void txtConfirmarCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConfirmarCKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConfirmarCKeyTyped

    private void cmb_girocomercialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_girocomercialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_girocomercialActionPerformed

    private void txtCorreoEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoEActionPerformed

    private void txtDescripcionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripcionKeyReleased
        ValidacionRegistroE();
    }//GEN-LAST:event_txtDescripcionKeyReleased

    private void txtUbicacionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUbicacionKeyReleased
        ValidacionRegistroE();
    }//GEN-LAST:event_txtUbicacionKeyReleased
    public void ValidacionRegistroE() {
        if (txtNombreE.getText().isEmpty()) {
            lblNombreE.setText("Campo requerido");
        } else {
            lblNombreE.setText("");
        }
        if (txtAcronimoE.getText().isEmpty()) {
            lblAcronimoE.setText("Campo requerido");
        } else {
            lblAcronimoE.setText("");
        }
        if (txtDescripcion.getText().isEmpty()) {
            lblDescripcionE.setText("Campo requerido");
        } else {
            lblDescripcionE.setText("");
        }
        if (txtUbicacion.getText().isEmpty()) {
            lblUbicacionE.setText("Campo requerido");
        } else {
            lblUbicacionE.setText("");
        }
        if (txtCorreoE.getText().isEmpty()) {
            lblCorreoE.setText("Campo requerido");
        } else if (!txtCorreoE.getText().contains("@") || !txtCorreoE.getText().contains(".com")) {
            lblCorreoE.setText("Correo invalido");
        } else {
            lblCorreoE.setText("");
        }
        if (txtContraseñaE.getText().isEmpty()) {
            lblContraseñaE.setText("Campo requerido");
        } else {
            lblContraseñaE.setText("");
        }
        if (txtTelefono.getText().isEmpty()) {
            lblTelefonoE.setText("Campo requerido");
        } else {
            lblTelefonoE.setText("");
        }
        if (txtContraseñaE.getText().length() < 8) {
            lblContraseñaE.setText("La contraseña debe contener entre 8~50 caracteres");
            btnRegistrarE.setEnabled(false);
        } else {
            btnRegistrarE.setEnabled(true);
        }if(txtConfirmarC.getText().isEmpty()){
            lblConfirmarC.setText("Campo requerido");
        }else{
            lblConfirmarC.setText("");
        }
        if (txtNombreE.getText().isEmpty() || txtAcronimoE.getText().isEmpty()
                || txtDescripcion.getText().isEmpty() || txtUbicacion.getText().isEmpty()
                || txtCorreoE.getText().isEmpty() || txtContraseñaE.getText().isEmpty()
                || txtTelefono.getText().isEmpty() || !lblNombreE.getText().isEmpty()
                || !lblAcronimoE.getText().isEmpty() || !lblDescripcionE.getText().isEmpty()
                || !lblUbicacionE.getText().isEmpty() || !lblCorreoE.getText().isEmpty()
                || !lblContraseñaE.getText().isEmpty() || !lblTelefonoE.getText().isEmpty()
                || txtConfirmarC.getText().isEmpty() || !lblConfirmarC.getText().isEmpty()) {
            btnRegistrarE.setEnabled(false);
        } else {
            btnRegistrarE.setEnabled(true);
        }
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
    private javax.swing.JComboBox cmb_girocomercial;
    private javax.swing.JComboBox cmbt_Departamento;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblAcronimoE;
    private javax.swing.JLabel lblConfirmarC;
    private javax.swing.JLabel lblContraseñaE;
    private javax.swing.JLabel lblCorreoE;
    private javax.swing.JLabel lblDescripcionE;
    private javax.swing.JLabel lblNombreE;
    private javax.swing.JLabel lblTelefonoE;
    private javax.swing.JLabel lblUbicacionE;
    private javax.swing.JTextField txtAcronimoE;
    private javax.swing.JTextField txtConfirmarC;
    private javax.swing.JTextField txtContraseñaE;
    private javax.swing.JTextField txtCorreoE;
    public javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtNombreE;
    private javax.swing.JTextField txtTelefono;
    public javax.swing.JTextArea txtUbicacion;
    private javax.swing.JLabel txturl;
    // End of variables declaration//GEN-END:variables
}
