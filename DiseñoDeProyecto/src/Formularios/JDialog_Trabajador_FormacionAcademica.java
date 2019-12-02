package Formularios;

import Consultas.ConsultasEstudio;
import Entidades.Estudio;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import rojerusan.RSAnimation;

/**
 *
 * @author Admin
 */
public class JDialog_Trabajador_FormacionAcademica extends javax.swing.JDialog {

    public JDialog_Trabajador_FormacionAcademica(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        txtIdTrabajador.setText(String.valueOf(frmVisitante.id));
        txtIdTrabajador.setVisible(false);
        txtIdEstudio.setVisible(false);
        txtOrden.setVisible(false);
        lblMuestra.setVisible(false);
        this.setLocationRelativeTo(null);
        Muestrame();
        Limpiame();
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
        btnPos6.setVisible(false);

        btnPos7.setVisible(false);
    }

    void Limpiame() {
        txtInstitucion.setText("");
        txtTitulo.setText("");
        txtCiudad.setText("");
        jDate_Chooser.setDate(null);
    }

    //METODO PARA VER LOS DATOS EN UNA JTABLE
    void Muestrame() {
        String Titulos[] = {"idEst", "Institucion", "Titulo", "Año de finalizacion", "Ciudad", "orden", "idTrabajador"};
        DefaultTableModel model = new DefaultTableModel(null, Titulos){

            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        ConsultasEstudio estu = new ConsultasEstudio();
        Estudio es = new Estudio();
        ArrayList<Estudio> PS = estu.mostrarEstudiosCrud(frmVisitante.id);
        Iterator i = PS.iterator();
        String filas[] = new String[7];
        while (i.hasNext()) {
            Estudio ps;
            es = (Estudio) i.next();
            filas[0] = String.valueOf(es.getIdEstudio());
            filas[1] = es.getInstitucion();
            filas[2] = es.getTitulo();
            filas[3] = String.valueOf(es.getAñoTerminado());
            filas[4] = es.getCuidad();
            filas[5] = String.valueOf(es.getOrden());
            filas[6] = String.valueOf(es.getIdTrabajador());
            model.addRow(filas);
        }
        jTableFormacionAcademina.setModel(model);
        //CODIGO PARA OCULTAR COLUMNAS EN UNA JTABLE
        jTableFormacionAcademina.getColumnModel().getColumn(0).setMaxWidth(0);
        //jTableFormacionAcademina.getColumnModel().getColumn(5).setMaxWidth(0);
        jTableFormacionAcademina.getColumnModel().getColumn(6).setMaxWidth(0);
        jTableFormacionAcademina.getTableHeader().setReorderingAllowed(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnCancelarOrd = new javax.swing.JButton();
        btnPos1 = new javax.swing.JButton();
        btnPos2 = new javax.swing.JButton();
        btnPos3 = new javax.swing.JButton();
        btnPos4 = new javax.swing.JButton();
        btnPos5 = new javax.swing.JButton();
        btnPos6 = new javax.swing.JButton();
        btnPos7 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableFormacionAcademina = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnInsertar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnOrdenar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        txtInstitucion = new javax.swing.JTextField();
        txtTitulo = new javax.swing.JTextField();
        txtCiudad = new javax.swing.JTextField();
        jDate_Chooser = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtIdEstudio = new javax.swing.JTextField();
        txtOrden = new javax.swing.JTextField();
        txtIdTrabajador = new javax.swing.JTextField();
        lblMuestra = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(48, 62, 71));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(247, 211, 3), 2));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("FORMACIÓN ACADÉMICA");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/formacion_academica_64.png"))); // NOI18N

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

        btnPos1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnPos1.setText("POSICIÓN 1");
        btnPos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPos1ActionPerformed(evt);
            }
        });

        btnPos2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnPos2.setText("POSICIÓN 2");
        btnPos2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPos2ActionPerformed(evt);
            }
        });

        btnPos3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnPos3.setText("POSICIÓN 3");
        btnPos3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPos3ActionPerformed(evt);
            }
        });

        btnPos4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnPos4.setText("POSICIÓN 4");
        btnPos4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPos4ActionPerformed(evt);
            }
        });

        btnPos5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnPos5.setText("POSICIÓN 5");
        btnPos5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPos5ActionPerformed(evt);
            }
        });

        btnPos6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnPos6.setText("POSICIÓN 6");
        btnPos6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPos6ActionPerformed(evt);
            }
        });

        btnPos7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnPos7.setText("DESMARCAR");
        btnPos7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPos7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnPos1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPos3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPos5, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnPos2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPos4, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPos6, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPos7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(btnCancelarOrd)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnPos1)
                                    .addComponent(btnPos3)
                                    .addComponent(btnPos5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnPos2)
                                    .addComponent(btnPos4)
                                    .addComponent(btnPos6)
                                    .addComponent(btnPos7)))
                            .addComponent(btnCancelarOrd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(11, 11, 11))))
        );

        jTableFormacionAcademina.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID_ESTUDIO", "INSTITUCIÓN", "TÍTULO", "AÑO_TERMINADO", "CIUDAD", "ORDEN", "ID_TRABAJADOR"
            }
        ));
        jTableFormacionAcademina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableFormacionAcademinaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableFormacionAcademina);

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
        btnAtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAtrasMouseClicked(evt);
            }
        });
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(btnInsertar)
                .addGap(69, 69, 69)
                .addComponent(btnActualizar)
                .addGap(61, 61, 61)
                .addComponent(btnOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnOrdenar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAtras, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnInsertar)
                        .addComponent(btnActualizar)))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel3.setText("INSTITUCIÓN");

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel4.setText("TÍTULO");

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel5.setText("AÑO TERMINADO");

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel6.setText("CIUDAD");

        lblMuestra.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        lblMuestra.setText("Este registro se muestra");

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
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtInstitucion, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(jLabel4)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDate_Chooser, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jLabel6))
                            .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtIdEstudio, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtIdTrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblMuestra, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMuestra)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtIdEstudio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtIdTrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDate_Chooser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtInstitucion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6))
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAtrasMouseClicked

    }//GEN-LAST:event_btnAtrasMouseClicked

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        if (txtInstitucion.getText().equals("") || txtTitulo.getText().equals("") || txtCiudad.getText().equals("") || jDate_Chooser.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Asegurate de rellenar todos los campos!", "You can do it!", JOptionPane.INFORMATION_MESSAGE);
            Muestrame();
        } else {
//insertar Formacion Academica
            ConsultasEstudio estu = new ConsultasEstudio();
            Estudio Es = new Estudio();

            Es.setInstitucion(txtInstitucion.getText());
            Es.setTitulo(txtTitulo.getText());

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String date = sdf.format(jDate_Chooser.getDate());
            Es.setAñoTerminado(date);

            Es.setCuidad(txtCiudad.getText());
            Es.setIdTrabajador(Integer.parseInt(txtIdTrabajador.getText()));
            estu.insertarEstudios(Es);
            Muestrame();
            Limpiame();
        }
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        if (txtInstitucion.getText().equals("") || txtTitulo.getText().equals("") || txtCiudad.getText().equals("") || jDate_Chooser.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Asegurate de rellenar todos los campos!", "You can do it!", JOptionPane.INFORMATION_MESSAGE);
            Muestrame();
        } else {
// BOTON ACTUALIZAR INFORMACION ACADEMICA
            ConsultasEstudio estu = new ConsultasEstudio();
            Estudio Es = new Estudio();

            Es.setInstitucion(txtInstitucion.getText());
            Es.setTitulo(txtTitulo.getText());

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String date = sdf.format(jDate_Chooser.getDate());
            Es.setAñoTerminado(date);

            Es.setCuidad(txtCiudad.getText());
            Es.setOrden(Integer.parseInt(txtOrden.getText()));
            Es.setIdTrabajador(Integer.parseInt(txtIdTrabajador.getText()));
            Es.setIdEstudio(Integer.parseInt(txtIdEstudio.getText()));

            estu.actualizarEstudios(Es);
            Muestrame();
            Limpiame();
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        //BOTON ELIMINAR INFORMACION ACADEMICA
        ConsultasEstudio estu = new ConsultasEstudio();
        Estudio Es = new Estudio();
        Es.setIdEstudio(Integer.parseInt(txtIdEstudio.getText()));
        estu.eliminarEstudios(Es);
        Muestrame();
        Limpiame();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void jTableFormacionAcademinaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableFormacionAcademinaMouseClicked
        btnInsertar.setEnabled(true);
        btnActualizar.setEnabled(true);
        btnEliminar.setEnabled(true);
        btnOrdenar.setEnabled(true);

        // CARGUEN MIS DATOS EN LOS TXT
        int seleccionar = jTableFormacionAcademina.rowAtPoint(evt.getPoint());
        txtIdEstudio.setText(String.valueOf(jTableFormacionAcademina.getValueAt(seleccionar, 0)));
        txtInstitucion.setText(String.valueOf(jTableFormacionAcademina.getValueAt(seleccionar, 1)));
        txtTitulo.setText(String.valueOf(jTableFormacionAcademina.getValueAt(seleccionar, 2)));
        try {
            int srow = jTableFormacionAcademina.getSelectedRow();
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse((String) jTableFormacionAcademina.getValueAt(srow, 3));
            jDate_Chooser.setDate(date);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        txtCiudad.setText(String.valueOf(jTableFormacionAcademina.getValueAt(seleccionar, 4)));
        txtOrden.setText(String.valueOf(jTableFormacionAcademina.getValueAt(seleccionar, 5)));
        txtIdTrabajador.setText(String.valueOf(jTableFormacionAcademina.getValueAt(seleccionar, 6)));

        if (txtOrden.getText().equals("1")) {
            btnPos1.setEnabled(false);
            btnPos2.setEnabled(true);
            btnPos3.setEnabled(true);
            btnPos4.setEnabled(true);
            btnPos5.setEnabled(true);
            btnPos6.setEnabled(true);
        }
        if (txtOrden.getText().equals("2")) {
            btnPos1.setEnabled(true);
            btnPos2.setEnabled(false);
            btnPos3.setEnabled(true);
            btnPos4.setEnabled(true);
            btnPos5.setEnabled(true);
            btnPos6.setEnabled(true);
        }
        if (txtOrden.getText().equals("3")) {
            btnPos1.setEnabled(true);
            btnPos2.setEnabled(true);
            btnPos3.setEnabled(false);
            btnPos4.setEnabled(true);
            btnPos5.setEnabled(true);
            btnPos6.setEnabled(true);
        }
        if (txtOrden.getText().equals("4")) {
            btnPos1.setEnabled(true);
            btnPos2.setEnabled(true);
            btnPos3.setEnabled(true);
            btnPos4.setEnabled(false);
            btnPos5.setEnabled(true);
            btnPos6.setEnabled(true);
        }
        if (txtOrden.getText().equals("5")) {
            btnPos1.setEnabled(true);
            btnPos2.setEnabled(true);
            btnPos3.setEnabled(true);
            btnPos4.setEnabled(true);
            btnPos5.setEnabled(false);
            btnPos6.setEnabled(true);
        }
        if (txtOrden.getText().equals("6")) {
            btnPos1.setEnabled(true);
            btnPos2.setEnabled(true);
            btnPos3.setEnabled(true);
            btnPos4.setEnabled(true);
            btnPos5.setEnabled(true);
            btnPos6.setEnabled(false);
        }

        if (txtOrden.getText().equals("") || txtOrden.getText().equals("0")) {
            lblMuestra.setVisible(false);
            btnPos1.setEnabled(true);
            btnPos2.setEnabled(true);
            btnPos3.setEnabled(true);
            btnPos4.setEnabled(true);
            btnPos5.setEnabled(true);
            btnPos6.setEnabled(true);
        } else {
            lblMuestra.setVisible(true);
            lblMuestra.setText("Este registro se muestra en la posicion: " + txtOrden.getText());
        }
    }//GEN-LAST:event_jTableFormacionAcademinaMouseClicked

    private void btnCancelarOrdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarOrdMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarOrdMouseClicked

    private void btnOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarActionPerformed
        btnCancelarOrd.setEnabled(true);
        btnCancelarOrd.setVisible(true);
        btnPos1.setVisible(true);
        btnPos2.setVisible(true);
        btnPos3.setVisible(true);
        btnPos4.setVisible(true);
        btnPos5.setVisible(true);
        btnPos6.setVisible(true);
        btnPos7.setVisible(true);
        txtOrden.setText("");

        jTableFormacionAcademina.clearSelection();
        Limpiame();
    }//GEN-LAST:event_btnOrdenarActionPerformed

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
        btnPos6.setEnabled(false);
        btnPos6.setVisible(false);
        btnPos7.setEnabled(false);
        btnPos7.setVisible(false);
    }//GEN-LAST:event_btnCancelarOrdActionPerformed

    private void btnPos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPos1ActionPerformed
        DefaultTableModel df = (DefaultTableModel) jTableFormacionAcademina.getModel();
        for (int i = 0; i < df.getRowCount(); i++) {
            if (String.valueOf(df.getValueAt(i, 5)).equals("1") || String.valueOf(df.getValueAt(i, 5)).equals("2") || String.valueOf(df.getValueAt(i, 5)).equals("3")
                    || String.valueOf(df.getValueAt(i, 5)).equals("4") || String.valueOf(df.getValueAt(i, 5)).equals("5") || String.valueOf(df.getValueAt(i, 5)).equals("6")) {
                if (String.valueOf(df.getValueAt(i, 5)).equals("1")) {
                    JOptionPane.showMessageDialog(null, "Esta posicion ya esta ocupada\n"
                            + "Si deseas seleccionar este campo como la nueva posicion 1 entonces desmarca la anterior.", "You can do it!", JOptionPane.INFORMATION_MESSAGE);
                    break;
                }
            } else {
                if (txtInstitucion.getText().equals("") || txtTitulo.getText().equals("") || txtCiudad.getText().equals("") || jDate_Chooser.getDate() == null) {
                    JOptionPane.showMessageDialog(null, "Asegurate de rellenar todos los campos!", "You can do it!", JOptionPane.INFORMATION_MESSAGE);
                    Muestrame();
//                    break;
                } else {
// BOTON ACTUALIZAR INFORMACION ACADEMICA
                    ConsultasEstudio estu = new ConsultasEstudio();
                    Estudio Es = new Estudio();

                    Es.setInstitucion(txtInstitucion.getText());
                    Es.setTitulo(txtTitulo.getText());

                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    String date = sdf.format(jDate_Chooser.getDate());
                    Es.setAñoTerminado(date);

                    Es.setCuidad(txtCiudad.getText());
                    Es.setOrden(1);
                    Es.setIdTrabajador(Integer.parseInt(txtIdTrabajador.getText()));
                    Es.setIdEstudio(Integer.parseInt(txtIdEstudio.getText()));

                    estu.actualizarEstudios(Es);
                    Muestrame();
                    Limpiame();
                    break;
                }
            }
        }
    }//GEN-LAST:event_btnPos1ActionPerformed

    private void btnPos2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPos2ActionPerformed
        DefaultTableModel df = (DefaultTableModel) jTableFormacionAcademina.getModel();
        for (int i = 0; i < df.getRowCount(); i++) {
            if (String.valueOf(df.getValueAt(i, 5)).equals("1") || String.valueOf(df.getValueAt(i, 5)).equals("2") || String.valueOf(df.getValueAt(i, 5)).equals("3")
                    || String.valueOf(df.getValueAt(i, 5)).equals("4") || String.valueOf(df.getValueAt(i, 5)).equals("5") || String.valueOf(df.getValueAt(i, 5)).equals("6")) {
                if (String.valueOf(df.getValueAt(i, 5)).equals("2")) {
                    JOptionPane.showMessageDialog(null, "Esta posicion ya esta ocupada\n"
                            + "Si deseas seleccionar este campo como la nueva posicion 2 entonces desmarca la anterior.", "You can do it!", JOptionPane.INFORMATION_MESSAGE);
                    break;
                }
            } else {
                if (txtInstitucion.getText().equals("") || txtTitulo.getText().equals("") || txtCiudad.getText().equals("") || jDate_Chooser.getDate() == null) {
                    JOptionPane.showMessageDialog(null, "Asegurate de rellenar todos los campos!", "You can do it!", JOptionPane.INFORMATION_MESSAGE);
                    Muestrame();
//                    break;
                } else {
// BOTON ACTUALIZAR INFORMACION ACADEMICA
                    ConsultasEstudio estu = new ConsultasEstudio();
                    Estudio Es = new Estudio();

                    Es.setInstitucion(txtInstitucion.getText());
                    Es.setTitulo(txtTitulo.getText());

                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    String date = sdf.format(jDate_Chooser.getDate());
                    Es.setAñoTerminado(date);

                    Es.setCuidad(txtCiudad.getText());
                    Es.setOrden(2);
                    Es.setIdTrabajador(Integer.parseInt(txtIdTrabajador.getText()));
                    Es.setIdEstudio(Integer.parseInt(txtIdEstudio.getText()));

                    estu.actualizarEstudios(Es);
                    Muestrame();
                    Limpiame();
                    break;
                }
            }
        }
    }//GEN-LAST:event_btnPos2ActionPerformed

    private void btnPos3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPos3ActionPerformed
        DefaultTableModel df = (DefaultTableModel) jTableFormacionAcademina.getModel();
        for (int i = 0; i < df.getRowCount(); i++) {
            if (String.valueOf(df.getValueAt(i, 5)).equals("1") || String.valueOf(df.getValueAt(i, 5)).equals("2") || String.valueOf(df.getValueAt(i, 5)).equals("3")
                    || String.valueOf(df.getValueAt(i, 5)).equals("4") || String.valueOf(df.getValueAt(i, 5)).equals("5") || String.valueOf(df.getValueAt(i, 5)).equals("6")) {
                if (String.valueOf(df.getValueAt(i, 5)).equals("3")) {
                    JOptionPane.showMessageDialog(null, "Esta posicion ya esta ocupada\n"
                            + "Si deseas seleccionar este campo como la nueva posicion 3 entonces desmarca la anterior.", "You can do it!", JOptionPane.INFORMATION_MESSAGE);
                    break;
                }
            } else {
                if (txtInstitucion.getText().equals("") || txtTitulo.getText().equals("") || txtCiudad.getText().equals("") || jDate_Chooser.getDate() == null) {
                    JOptionPane.showMessageDialog(null, "Asegurate de rellenar todos los campos!", "You can do it!", JOptionPane.INFORMATION_MESSAGE);
                    Muestrame();
//                    break;
                } else {
// BOTON ACTUALIZAR INFORMACION ACADEMICA
                    ConsultasEstudio estu = new ConsultasEstudio();
                    Estudio Es = new Estudio();

                    Es.setInstitucion(txtInstitucion.getText());
                    Es.setTitulo(txtTitulo.getText());

                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    String date = sdf.format(jDate_Chooser.getDate());
                    Es.setAñoTerminado(date);

                    Es.setCuidad(txtCiudad.getText());
                    Es.setOrden(3);
                    Es.setIdTrabajador(Integer.parseInt(txtIdTrabajador.getText()));
                    Es.setIdEstudio(Integer.parseInt(txtIdEstudio.getText()));

                    estu.actualizarEstudios(Es);
                    Muestrame();
                    Limpiame();
                    break;
                }
            }
        }
    }//GEN-LAST:event_btnPos3ActionPerformed

    private void btnPos4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPos4ActionPerformed
        DefaultTableModel df = (DefaultTableModel) jTableFormacionAcademina.getModel();
        for (int i = 0; i < df.getRowCount(); i++) {
            if (String.valueOf(df.getValueAt(i, 5)).equals("1") || String.valueOf(df.getValueAt(i, 5)).equals("2") || String.valueOf(df.getValueAt(i, 5)).equals("3")
                    || String.valueOf(df.getValueAt(i, 5)).equals("4") || String.valueOf(df.getValueAt(i, 5)).equals("5") || String.valueOf(df.getValueAt(i, 5)).equals("6")) {
                if (String.valueOf(df.getValueAt(i, 5)).equals("4")) {
                    JOptionPane.showMessageDialog(null, "Esta posicion ya esta ocupada\n"
                            + "Si deseas seleccionar este campo como la nueva posicion 4 entonces desmarca la anterior.", "You can do it!", JOptionPane.INFORMATION_MESSAGE);
                    break;
                }
            } else {
                if (txtInstitucion.getText().equals("") || txtTitulo.getText().equals("") || txtCiudad.getText().equals("") || jDate_Chooser.getDate() == null) {
                    JOptionPane.showMessageDialog(null, "Asegurate de rellenar todos los campos!", "You can do it!", JOptionPane.INFORMATION_MESSAGE);
                    Muestrame();
//                    break;
                } else {
// BOTON ACTUALIZAR INFORMACION ACADEMICA
                    ConsultasEstudio estu = new ConsultasEstudio();
                    Estudio Es = new Estudio();

                    Es.setInstitucion(txtInstitucion.getText());
                    Es.setTitulo(txtTitulo.getText());

                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    String date = sdf.format(jDate_Chooser.getDate());
                    Es.setAñoTerminado(date);

                    Es.setCuidad(txtCiudad.getText());
                    Es.setOrden(4);
                    Es.setIdTrabajador(Integer.parseInt(txtIdTrabajador.getText()));
                    Es.setIdEstudio(Integer.parseInt(txtIdEstudio.getText()));

                    estu.actualizarEstudios(Es);
                    Muestrame();
                    Limpiame();
                    break;
                }
            }
        }
    }//GEN-LAST:event_btnPos4ActionPerformed

    private void btnPos5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPos5ActionPerformed
        DefaultTableModel df = (DefaultTableModel) jTableFormacionAcademina.getModel();
        for (int i = 0; i < df.getRowCount(); i++) {
            if (String.valueOf(df.getValueAt(i, 5)).equals("1") || String.valueOf(df.getValueAt(i, 5)).equals("2") || String.valueOf(df.getValueAt(i, 5)).equals("3")
                    || String.valueOf(df.getValueAt(i, 5)).equals("4") || String.valueOf(df.getValueAt(i, 5)).equals("5") || String.valueOf(df.getValueAt(i, 5)).equals("6")) {
                if (String.valueOf(df.getValueAt(i, 5)).equals("5")) {
                    JOptionPane.showMessageDialog(null, "Esta posicion ya esta ocupada\n"
                            + "Si deseas seleccionar este campo como la nueva posicion 5 entonces desmarca la anterior.", "You can do it!", JOptionPane.INFORMATION_MESSAGE);
                    break;
                }
            } else {
                if (txtInstitucion.getText().equals("") || txtTitulo.getText().equals("") || txtCiudad.getText().equals("") || jDate_Chooser.getDate() == null) {
                    JOptionPane.showMessageDialog(null, "Asegurate de rellenar todos los campos!", "You can do it!", JOptionPane.INFORMATION_MESSAGE);
                    Muestrame();
//                    break;
                } else {
// BOTON ACTUALIZAR INFORMACION ACADEMICA
                    ConsultasEstudio estu = new ConsultasEstudio();
                    Estudio Es = new Estudio();

                    Es.setInstitucion(txtInstitucion.getText());
                    Es.setTitulo(txtTitulo.getText());

                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    String date = sdf.format(jDate_Chooser.getDate());
                    Es.setAñoTerminado(date);

                    Es.setCuidad(txtCiudad.getText());
                    Es.setOrden(5);
                    Es.setIdTrabajador(Integer.parseInt(txtIdTrabajador.getText()));
                    Es.setIdEstudio(Integer.parseInt(txtIdEstudio.getText()));

                    estu.actualizarEstudios(Es);
                    Muestrame();
                    Limpiame();
                    break;
                }
            }
        }
    }//GEN-LAST:event_btnPos5ActionPerformed

    private void btnPos6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPos6ActionPerformed
        DefaultTableModel df = (DefaultTableModel) jTableFormacionAcademina.getModel();
        for (int i = 0; i < df.getRowCount(); i++) {
            if (String.valueOf(df.getValueAt(i, 5)).equals("1") || String.valueOf(df.getValueAt(i, 5)).equals("2") || String.valueOf(df.getValueAt(i, 5)).equals("3")
                    || String.valueOf(df.getValueAt(i, 5)).equals("4") || String.valueOf(df.getValueAt(i, 5)).equals("5") || String.valueOf(df.getValueAt(i, 5)).equals("6")) {
                if (String.valueOf(df.getValueAt(i, 5)).equals("6")) {
                    JOptionPane.showMessageDialog(null, "Esta posicion ya esta ocupada\n"
                            + "Si deseas seleccionar este campo como la nueva posicion 6 entonces desmarca la anterior.", "You can do it!", JOptionPane.INFORMATION_MESSAGE);
                    break;
                }
            } else {
                if (txtInstitucion.getText().equals("") || txtTitulo.getText().equals("") || txtCiudad.getText().equals("") || jDate_Chooser.getDate() == null) {
                    JOptionPane.showMessageDialog(null, "Asegurate de rellenar todos los campos!", "You can do it!", JOptionPane.INFORMATION_MESSAGE);
                    Muestrame();
//                    break;
                } else {
// BOTON ACTUALIZAR INFORMACION ACADEMICA
                    ConsultasEstudio estu = new ConsultasEstudio();
                    Estudio Es = new Estudio();

                    Es.setInstitucion(txtInstitucion.getText());
                    Es.setTitulo(txtTitulo.getText());

                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    String date = sdf.format(jDate_Chooser.getDate());
                    Es.setAñoTerminado(date);

                    Es.setCuidad(txtCiudad.getText());
                    Es.setOrden(6);
                    Es.setIdTrabajador(Integer.parseInt(txtIdTrabajador.getText()));
                    Es.setIdEstudio(Integer.parseInt(txtIdEstudio.getText()));

                    estu.actualizarEstudios(Es);
                    Muestrame();
                    Limpiame();
                    break;
                }
            }
        }
    }//GEN-LAST:event_btnPos6ActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        try {
            //btnAtras
            frmP_Trabajador.Estudio(Integer.parseInt(txtIdTrabajador.getText()));
            RSAnimation.setMoverIzquierda(500, -900, 0, 2, this);
            Thread.sleep(1000);
            this.dispose();
        } catch (InterruptedException ex) {
            Logger.getLogger(JDialog_Trabajador_FormacionAcademica.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnPos7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPos7ActionPerformed
        if (txtInstitucion.getText().equals("") || txtTitulo.getText().equals("") || txtCiudad.getText().equals("") || jDate_Chooser.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Asegurate de rellenar todos los campos!", "You can do it!", JOptionPane.INFORMATION_MESSAGE);
            Muestrame();
        } else {
// BOTON ACTUALIZAR INFORMACION ACADEMICA
            ConsultasEstudio estu = new ConsultasEstudio();
            Estudio Es = new Estudio();

            Es.setInstitucion(txtInstitucion.getText());
            Es.setTitulo(txtTitulo.getText());

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String date = sdf.format(jDate_Chooser.getDate());
            Es.setAñoTerminado(date);

            Es.setCuidad(txtCiudad.getText());
            Es.setOrden(0);
            Es.setIdTrabajador(Integer.parseInt(txtIdTrabajador.getText()));
            Es.setIdEstudio(Integer.parseInt(txtIdEstudio.getText()));

            estu.actualizarEstudios(Es);
            Muestrame();
            Limpiame();
        }
    }//GEN-LAST:event_btnPos7ActionPerformed

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
            java.util.logging.Logger.getLogger(JDialog_Trabajador_FormacionAcademica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialog_Trabajador_FormacionAcademica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialog_Trabajador_FormacionAcademica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialog_Trabajador_FormacionAcademica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialog_Trabajador_FormacionAcademica dialog = new JDialog_Trabajador_FormacionAcademica(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnPos6;
    private javax.swing.JButton btnPos7;
    private com.toedter.calendar.JDateChooser jDate_Chooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableFormacionAcademina;
    private javax.swing.JLabel lblMuestra;
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JTextField txtIdEstudio;
    private javax.swing.JTextField txtIdTrabajador;
    private javax.swing.JTextField txtInstitucion;
    private javax.swing.JTextField txtOrden;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
