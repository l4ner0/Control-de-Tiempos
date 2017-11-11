/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vista;

import Controlador.ControladorUICT;
import Modelo.EmpleadoDAO;
import java.awt.Color;
import Vista.Ventanas.*;

/**
 *
 * @author diego
 */
public class IUControlTiempos extends javax.swing.JFrame {
    /**
     * Creates new form Principal
     */
    
    public IUControlTiempos() {
        initComponents();
        this.setLocationRelativeTo(this);
        btnInicio.setSelected(true);
        new CambiaPanel(pnlCentral,new pnlInicio());
        setExtendedState(MAXIMIZED_BOTH);       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        pnlPrincipal = new javax.swing.JPanel();
        pnlCabeza = new javax.swing.JPanel();
        btnMenu = new javax.swing.JButton();
        panelMenu = new javax.swing.JPanel();
        pnlTrabajador = new javax.swing.JPanel();
        lblTrabajador = new javax.swing.JLabel();
        btnInicio = new rsbuttom.RSButtonMetro();
        btnControl = new rsbuttom.RSButtonMetro();
        btnNuevoTrabajador = new rsbuttom.RSButtonMetro();
        btnListar = new rsbuttom.RSButtonMetro();
        pnlAsistencia = new javax.swing.JPanel();
        lblAsistencia = new javax.swing.JLabel();
        btnReporte = new rsbuttom.RSButtonMetro();
        btnSalir = new rsbuttom.RSButtonMetro();
        pnlCentral = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(MAXIMIZED_BOTH);

        pnlPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        pnlPrincipal.setLayout(new java.awt.GridBagLayout());

        pnlCabeza.setBackground(new java.awt.Color(0, 102, 204));

        btnMenu.setBackground(new java.awt.Color(0, 102, 204));
        btnMenu.setForeground(new java.awt.Color(0, 102, 204));
        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/img/menu.png"))); // NOI18N
        btnMenu.setToolTipText("");
        btnMenu.setBorderPainted(false);
        btnMenu.setContentAreaFilled(false);
        btnMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCabezaLayout = new javax.swing.GroupLayout(pnlCabeza);
        pnlCabeza.setLayout(pnlCabezaLayout);
        pnlCabezaLayout.setHorizontalGroup(
            pnlCabezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCabezaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1761, Short.MAX_VALUE))
        );
        pnlCabezaLayout.setVerticalGroup(
            pnlCabezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCabezaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnMenu)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 839;
        gridBagConstraints.ipady = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 0.1;
        pnlPrincipal.add(pnlCabeza, gridBagConstraints);

        panelMenu.setBackground(new java.awt.Color(214, 217, 223));
        panelMenu.setPreferredSize(new java.awt.Dimension(150, 230));

        pnlTrabajador.setBackground(new java.awt.Color(214, 217, 223));

        lblTrabajador.setBackground(new java.awt.Color(153, 153, 153));
        lblTrabajador.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTrabajador.setText("TRABAJADOR");

        javax.swing.GroupLayout pnlTrabajadorLayout = new javax.swing.GroupLayout(pnlTrabajador);
        pnlTrabajador.setLayout(pnlTrabajadorLayout);
        pnlTrabajadorLayout.setHorizontalGroup(
            pnlTrabajadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTrabajadorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTrabajador)
                .addGap(23, 23, 23))
        );
        pnlTrabajadorLayout.setVerticalGroup(
            pnlTrabajadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTrabajadorLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(lblTrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        btnInicio.setBackground(new java.awt.Color(204, 204, 204));
        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/img/Inicio.png"))); // NOI18N
        btnInicio.setText("INICIO");
        btnInicio.setColorHover(new java.awt.Color(204, 204, 204));
        btnInicio.setColorNormal(new java.awt.Color(204, 204, 204));
        btnInicio.setColorPressed(new java.awt.Color(204, 204, 204));
        btnInicio.setColorTextHover(new java.awt.Color(126, 126, 131));
        btnInicio.setColorTextNormal(new java.awt.Color(126, 126, 131));
        btnInicio.setColorTextPressed(new java.awt.Color(126, 126, 131));
        btnInicio.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnInicio.setIconTextGap(25);
        btnInicio.setInheritsPopupMenu(true);
        btnInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInicioMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnInicioMousePressed(evt);
            }
        });
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        btnControl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/img/Control.png"))); // NOI18N
        btnControl.setText("Control");
        btnControl.setColorHover(new java.awt.Color(204, 204, 204));
        btnControl.setColorNormal(new java.awt.Color(214, 217, 223));
        btnControl.setColorPressed(new java.awt.Color(214, 217, 223));
        btnControl.setColorTextHover(new java.awt.Color(126, 126, 131));
        btnControl.setColorTextNormal(new java.awt.Color(126, 126, 131));
        btnControl.setColorTextPressed(new java.awt.Color(126, 126, 131));
        btnControl.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnControl.setIconTextGap(25);
        btnControl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnControlMousePressed(evt);
            }
        });
        btnControl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnControlActionPerformed(evt);
            }
        });

        btnNuevoTrabajador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/img/Nuevo Trabajador.png"))); // NOI18N
        btnNuevoTrabajador.setText("Nuevo");
        btnNuevoTrabajador.setColorHover(new java.awt.Color(204, 204, 204));
        btnNuevoTrabajador.setColorNormal(new java.awt.Color(214, 217, 223));
        btnNuevoTrabajador.setColorPressed(new java.awt.Color(214, 217, 223));
        btnNuevoTrabajador.setColorTextHover(new java.awt.Color(126, 126, 131));
        btnNuevoTrabajador.setColorTextNormal(new java.awt.Color(126, 126, 131));
        btnNuevoTrabajador.setColorTextPressed(new java.awt.Color(126, 126, 131));
        btnNuevoTrabajador.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnNuevoTrabajador.setIconTextGap(25);
        btnNuevoTrabajador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnNuevoTrabajadorMousePressed(evt);
            }
        });
        btnNuevoTrabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoTrabajadorActionPerformed(evt);
            }
        });

        btnListar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/img/Listar.png"))); // NOI18N
        btnListar.setText("Listar");
        btnListar.setColorHover(new java.awt.Color(204, 204, 204));
        btnListar.setColorNormal(new java.awt.Color(214, 217, 223));
        btnListar.setColorPressed(new java.awt.Color(214, 217, 223));
        btnListar.setColorTextHover(new java.awt.Color(126, 126, 131));
        btnListar.setColorTextNormal(new java.awt.Color(126, 126, 131));
        btnListar.setColorTextPressed(new java.awt.Color(126, 126, 131));
        btnListar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnListar.setIconTextGap(25);
        btnListar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnListarMousePressed(evt);
            }
        });
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        pnlAsistencia.setBackground(new java.awt.Color(214, 217, 223));
        pnlAsistencia.setPreferredSize(new java.awt.Dimension(154, 72));

        lblAsistencia.setBackground(new java.awt.Color(153, 153, 153));
        lblAsistencia.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblAsistencia.setText("ASISTENCIA");

        javax.swing.GroupLayout pnlAsistenciaLayout = new javax.swing.GroupLayout(pnlAsistencia);
        pnlAsistencia.setLayout(pnlAsistenciaLayout);
        pnlAsistenciaLayout.setHorizontalGroup(
            pnlAsistenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAsistenciaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblAsistencia)
                .addGap(30, 30, 30))
        );
        pnlAsistenciaLayout.setVerticalGroup(
            pnlAsistenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAsistenciaLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(lblAsistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        btnReporte.setBackground(new java.awt.Color(214, 217, 223));
        btnReporte.setForeground(new java.awt.Color(126, 126, 131));
        btnReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/img/Reporte.png"))); // NOI18N
        btnReporte.setText("Reporte");
        btnReporte.setColorHover(new java.awt.Color(204, 204, 204));
        btnReporte.setColorNormal(new java.awt.Color(214, 217, 223));
        btnReporte.setColorPressed(new java.awt.Color(214, 217, 223));
        btnReporte.setColorTextHover(new java.awt.Color(126, 126, 131));
        btnReporte.setColorTextNormal(new java.awt.Color(126, 126, 131));
        btnReporte.setColorTextPressed(new java.awt.Color(126, 126, 131));
        btnReporte.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnReporte.setIconTextGap(25);
        btnReporte.setMaximumSize(new java.awt.Dimension(109, 41));
        btnReporte.setMinimumSize(new java.awt.Dimension(109, 41));
        btnReporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnReporteMousePressed(evt);
            }
        });
        btnReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(214, 217, 223));
        btnSalir.setForeground(new java.awt.Color(126, 126, 131));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/img/Salir.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setColorHover(new java.awt.Color(204, 204, 204));
        btnSalir.setColorNormal(new java.awt.Color(214, 217, 223));
        btnSalir.setColorPressed(new java.awt.Color(214, 217, 223));
        btnSalir.setColorTextHover(new java.awt.Color(126, 126, 131));
        btnSalir.setColorTextNormal(new java.awt.Color(126, 126, 131));
        btnSalir.setColorTextPressed(new java.awt.Color(126, 126, 131));
        btnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnSalir.setIconTextGap(15);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTrabajador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnControl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnListar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlAsistencia, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
            .addComponent(btnInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnReporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNuevoTrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(pnlTrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNuevoTrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnListar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(pnlAsistencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnControl, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 42;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(1, 0, 0, 0);
        pnlPrincipal.add(panelMenu, gridBagConstraints);

        pnlCentral.setBackground(new java.awt.Color(255, 255, 255));
        pnlCentral.setLayout(new javax.swing.BoxLayout(pnlCentral, javax.swing.BoxLayout.LINE_AXIS));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 805;
        gridBagConstraints.ipady = 736;
        gridBagConstraints.weighty = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 2);
        pnlPrincipal.add(pnlCentral, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 1834, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 823, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        int posicion = this.panelMenu.getX();
        
        if(posicion > -1)
        {
            Animacion.Animacion.mover_izquierda(0,-230,2,2,panelMenu);
        }else
        {
            Animacion.Animacion.mover_derecha(-230,0,2,2,panelMenu);
        }
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        new CambiaPanel(pnlCentral,new pnlListar());
        if(this.btnListar.isSelected())
        {
            this.btnListar.setColorNormal(new Color(214,217,223));
            this.btnListar.setColorHover(new Color(204,204,204));
            this.btnListar.setColorPressed(new Color(214,217,223));

            this.btnListar.setColorNormal(new Color(204,204,204));
            this.btnListar.setColorHover(new Color(204,204,204));
            this.btnListar.setColorPressed(new Color(204,204,204));

            this.btnInicio.setColorNormal(new Color(214,217,223));
            this.btnInicio.setColorHover(new Color(204,204,204));
            this.btnInicio.setColorPressed(new Color(214,217,223));

            this.btnNuevoTrabajador.setColorNormal(new Color(214,217,223));
            this.btnNuevoTrabajador.setColorHover(new Color(204,204,204));
            this.btnNuevoTrabajador.setColorPressed(new Color(214,217,223));

            this.btnControl.setColorNormal(new Color(214,217,223));
            this.btnControl.setColorHover(new Color(204,204,204));
            this.btnControl.setColorPressed(new Color(214,217,223));

            this.btnReporte.setColorNormal(new Color(214,217,223));
            this.btnReporte.setColorHover(new Color(204,204,204));
            this.btnReporte.setColorPressed(new Color(214,217,223));
        }
    }//GEN-LAST:event_btnListarActionPerformed

    private void btnListarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnListarMousePressed
        this.btnInicio.setSelected(false);
        this.btnNuevoTrabajador.setSelected(false);
        this.btnListar.setSelected(true);
        this.btnControl.setSelected(false); 
        this.btnReporte.setSelected(false);
        
    }//GEN-LAST:event_btnListarMousePressed

    private void btnNuevoTrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoTrabajadorActionPerformed
        new CambiaPanel(pnlCentral,new pnlNuevoTrabajador());  
        
        
        if(this.btnNuevoTrabajador.isSelected())
        {
            this.btnNuevoTrabajador.setColorNormal(new Color(214,217,223));
            this.btnNuevoTrabajador.setColorHover(new Color(204,204,204));
            this.btnNuevoTrabajador.setColorPressed(new Color(214,217,223));

            this.btnNuevoTrabajador.setColorNormal(new Color(204,204,204));
            this.btnNuevoTrabajador.setColorHover(new Color(204,204,204));
            this.btnNuevoTrabajador.setColorPressed(new Color(204,204,204));

            this.btnInicio.setColorNormal(new Color(214,217,223));
            this.btnInicio.setColorHover(new Color(204,204,204));
            this.btnInicio.setColorPressed(new Color(214,217,223));

            this.btnListar.setColorNormal(new Color(214,217,223));
            this.btnListar.setColorHover(new Color(204,204,204));
            this.btnListar.setColorPressed(new Color(214,217,223));

            this.btnControl.setColorNormal(new Color(214,217,223));
            this.btnControl.setColorHover(new Color(204,204,204));
            this.btnControl.setColorPressed(new Color(214,217,223));

            this.btnReporte.setColorNormal(new Color(214,217,223));
            this.btnReporte.setColorHover(new Color(204,204,204));
            this.btnReporte.setColorPressed(new Color(214,217,223));
        }
    }//GEN-LAST:event_btnNuevoTrabajadorActionPerformed

    private void btnNuevoTrabajadorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoTrabajadorMousePressed
        this.btnInicio.setSelected(false);
        this.btnNuevoTrabajador.setSelected(true);
        this.btnListar.setSelected(false);
        this.btnControl.setSelected(false); 
        this.btnReporte.setSelected(false);
    }//GEN-LAST:event_btnNuevoTrabajadorMousePressed

    private void btnControlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnControlActionPerformed
        new CambiaPanel(pnlCentral,new pnlControl());
        if(this.btnControl.isSelected())
        {
            this.btnControl.setColorNormal(new Color(214,217,223));
            this.btnControl.setColorHover(new Color(204,204,204));
            this.btnControl.setColorPressed(new Color(214,217,223));

            this.btnControl.setColorNormal(new Color(204,204,204));
            this.btnControl.setColorHover(new Color(204,204,204));
            this.btnControl.setColorPressed(new Color(204,204,204));

            this.btnInicio.setColorNormal(new Color(214,217,223));
            this.btnInicio.setColorHover(new Color(204,204,204));
            this.btnInicio.setColorPressed(new Color(214,217,223));

            this.btnNuevoTrabajador.setColorNormal(new Color(214,217,223));
            this.btnNuevoTrabajador.setColorHover(new Color(204,204,204));
            this.btnNuevoTrabajador.setColorPressed(new Color(214,217,223));

            this.btnListar.setColorNormal(new Color(214,217,223));
            this.btnListar.setColorHover(new Color(204,204,204));
            this.btnListar.setColorPressed(new Color(214,217,223));

            this.btnReporte.setColorNormal(new Color(214,217,223));
            this.btnReporte.setColorHover(new Color(204,204,204));
            this.btnReporte.setColorPressed(new Color(214,217,223));
        }
    }//GEN-LAST:event_btnControlActionPerformed

    private void btnControlMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnControlMousePressed
        this.btnInicio.setSelected(false);
        this.btnNuevoTrabajador.setSelected(false);
        this.btnListar.setSelected(false);
        this.btnControl.setSelected(true); 
        this.btnReporte.setSelected(false);

    }//GEN-LAST:event_btnControlMousePressed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        
        if(this.btnInicio.isSelected())
        {
            this.btnInicio.setColorNormal(new Color(214,217,223));
            this.btnInicio.setColorHover(new Color(204,204,204));
            this.btnInicio.setColorPressed(new Color(214,217,223));

            this.btnInicio.setColorNormal(new Color(204,204,204));
            this.btnInicio.setColorHover(new Color(204,204,204));
            this.btnInicio.setColorPressed(new Color(204,204,204));

            this.btnNuevoTrabajador.setColorNormal(new Color(214,217,223));
            this.btnNuevoTrabajador.setColorHover(new Color(204,204,204));
            this.btnNuevoTrabajador.setColorPressed(new Color(214,217,223));

            this.btnListar.setColorNormal(new Color(214,217,223));
            this.btnListar.setColorHover(new Color(204,204,204));
            this.btnListar.setColorPressed(new Color(214,217,223));

            this.btnControl.setColorNormal(new Color(214,217,223));
            this.btnControl.setColorHover(new Color(204,204,204));
            this.btnControl.setColorPressed(new Color(214,217,223));

            this.btnReporte.setColorNormal(new Color(214,217,223));
            this.btnReporte.setColorHover(new Color(204,204,204));
            this.btnReporte.setColorPressed(new Color(214,217,223));
        }
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnInicioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioMousePressed
        this.btnInicio.setSelected(true);
        this.btnNuevoTrabajador.setSelected(false);
        this.btnListar.setSelected(false);
        this.btnControl.setSelected(false); 
        this.btnReporte.setSelected(false);
    }//GEN-LAST:event_btnInicioMousePressed

    private void btnInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInicioMouseClicked

    private void btnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteActionPerformed
        new CambiaPanel(pnlCentral,new pnlReporte());
        if(this.btnReporte.isSelected())
        {
            this.btnReporte.setColorNormal(new Color(214,217,223));
            this.btnReporte.setColorHover(new Color(204,204,204));
            this.btnReporte.setColorPressed(new Color(214,217,223));

            this.btnReporte.setColorNormal(new Color(204,204,204));
            this.btnReporte.setColorHover(new Color(204,204,204));
            this.btnReporte.setColorPressed(new Color(204,204,204));

            this.btnInicio.setColorNormal(new Color(214,217,223));
            this.btnInicio.setColorHover(new Color(204,204,204));
            this.btnInicio.setColorPressed(new Color(214,217,223));

            this.btnNuevoTrabajador.setColorNormal(new Color(214,217,223));
            this.btnNuevoTrabajador.setColorHover(new Color(204,204,204));
            this.btnNuevoTrabajador.setColorPressed(new Color(214,217,223));

            this.btnListar.setColorNormal(new Color(214,217,223));
            this.btnListar.setColorHover(new Color(204,204,204));
            this.btnListar.setColorPressed(new Color(214,217,223));

            this.btnControl.setColorNormal(new Color(214,217,223));
            this.btnControl.setColorHover(new Color(204,204,204));
            this.btnControl.setColorPressed(new Color(214,217,223));
        }
    }//GEN-LAST:event_btnReporteActionPerformed

    private void btnReporteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReporteMousePressed
        this.btnInicio.setSelected(false);
        this.btnNuevoTrabajador.setSelected(false);
        this.btnListar.setSelected(false);
        this.btnControl.setSelected(false); 
        this.btnReporte.setSelected(true);
    }//GEN-LAST:event_btnReporteMousePressed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public rsbuttom.RSButtonMetro btnControl;
    public rsbuttom.RSButtonMetro btnInicio;
    public rsbuttom.RSButtonMetro btnListar;
    private javax.swing.JButton btnMenu;
    public rsbuttom.RSButtonMetro btnNuevoTrabajador;
    public rsbuttom.RSButtonMetro btnReporte;
    private rsbuttom.RSButtonMetro btnSalir;
    private javax.swing.JLabel lblAsistencia;
    private javax.swing.JLabel lblTrabajador;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel pnlAsistencia;
    private javax.swing.JPanel pnlCabeza;
    public javax.swing.JPanel pnlCentral;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JPanel pnlTrabajador;
    // End of variables declaration//GEN-END:variables
}
