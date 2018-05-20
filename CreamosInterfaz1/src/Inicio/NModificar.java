/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inicio;

import Conexion.ConexionBD;
import static Conexion.ConexionBD.conexion;
import static java.lang.Integer.parseInt;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rubén
 */
public class NModificar extends javax.swing.JDialog {

    /**
     * Creates new form NModificar
     */
    Connection conexion = ConexionBD.conexion();
    PrincipalGestion pg = null;
    Statement s = conexion.createStatement();
    int fila = 0;

    public NModificar(java.awt.Frame parent, String titulo, boolean modal) throws SQLException {
        super(parent, titulo, modal);
        pg = new PrincipalGestion();
        initComponents();
        visualizar();
        if (titulo == "Añadir") {
            rellenarJC();
            btnMoModificar.setVisible(false);
            btnMaModificar.setVisible(false);
            btnPModificar.setVisible(false);
            btnTModificar.setVisible(false);

        } else {
            if (titulo == "Modificar") {
                rellenarJCM();
                btnMoIntro.setVisible(false);
                btnMaIntro.setVisible(false);
                btnPIntroducir.setVisible(false);
                btnTIntro.setVisible(false);
            }
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        pnlPieza = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cbTipo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        btnPIntroducir = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        btnPModificar = new javax.swing.JButton();
        pnlTipos = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtPNombre = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        btnTIntro = new javax.swing.JButton();
        btnTModificar = new javax.swing.JButton();
        pnlModelo = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnMoIntro = new javax.swing.JButton();
        txtMName = new javax.swing.JTextField();
        cbMarca = new javax.swing.JComboBox<>();
        txtAS = new javax.swing.JTextField();
        txtAR = new javax.swing.JTextField();
        btnMoModificar = new javax.swing.JButton();
        pnlMarca = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtMNombre = new javax.swing.JTextField();
        txtPais = new javax.swing.JTextField();
        btnMaIntro = new javax.swing.JButton();
        btnMaModificar = new javax.swing.JButton();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Nombre");

        jLabel2.setText("Tipo");

        jLabel3.setText("Precio");

        btnPIntroducir.setText("Introducir");
        btnPIntroducir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPIntroducirActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Pieza");

        btnPModificar.setText("Modificar");
        btnPModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPiezaLayout = new javax.swing.GroupLayout(pnlPieza);
        pnlPieza.setLayout(pnlPiezaLayout);
        pnlPiezaLayout.setHorizontalGroup(
            pnlPiezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPiezaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPiezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPiezaLayout.createSequentialGroup()
                        .addGroup(pnlPiezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlPiezaLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(17, 17, 17))
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pnlPiezaLayout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(8, 8, 8)))
                        .addGap(23, 23, 23)
                        .addGroup(pnlPiezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre)
                            .addComponent(cbTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPrecio)))
                    .addComponent(jLabel12)
                    .addGroup(pnlPiezaLayout.createSequentialGroup()
                        .addComponent(btnPIntroducir)
                        .addGap(18, 18, 18)
                        .addComponent(btnPModificar)))
                .addContainerGap())
        );
        pnlPiezaLayout.setVerticalGroup(
            pnlPiezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPiezaLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addGroup(pnlPiezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlPiezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(pnlPiezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlPiezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPIntroducir)
                    .addComponent(btnPModificar)))
        );

        jLabel4.setText("Nombre");

        txtPNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPNombreActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Tipos de Piezas");

        btnTIntro.setText("Introducir");
        btnTIntro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTIntroActionPerformed(evt);
            }
        });

        btnTModificar.setText("Modificar");
        btnTModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlTiposLayout = new javax.swing.GroupLayout(pnlTipos);
        pnlTipos.setLayout(pnlTiposLayout);
        pnlTiposLayout.setHorizontalGroup(
            pnlTiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTiposLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addGroup(pnlTiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlTiposLayout.createSequentialGroup()
                            .addComponent(btnTIntro)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnTModificar))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlTiposLayout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtPNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        pnlTiposLayout.setVerticalGroup(
            pnlTiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTiposLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addGroup(pnlTiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtPNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlTiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTIntro)
                    .addComponent(btnTModificar)))
        );

        jLabel5.setText("Nombre");

        jLabel6.setText("Marca");

        jLabel7.setText("Año de Salida");

        jLabel8.setText("Año de Retirada");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Modelo");

        btnMoIntro.setText("Introducir");
        btnMoIntro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoIntroActionPerformed(evt);
            }
        });

        btnMoModificar.setText("Modificar");
        btnMoModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlModeloLayout = new javax.swing.GroupLayout(pnlModelo);
        pnlModelo.setLayout(pnlModeloLayout);
        pnlModeloLayout.setHorizontalGroup(
            pnlModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlModeloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlModeloLayout.createSequentialGroup()
                        .addGroup(pnlModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(55, 55, 55)
                        .addGroup(pnlModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbMarca, 0, 100, Short.MAX_VALUE)
                            .addComponent(txtMName)))
                    .addGroup(pnlModeloLayout.createSequentialGroup()
                        .addGroup(pnlModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(14, 14, 14)
                        .addGroup(pnlModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAR)
                            .addComponent(txtAS)))
                    .addGroup(pnlModeloLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlModeloLayout.createSequentialGroup()
                        .addComponent(btnMoIntro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMoModificar)))
                .addContainerGap())
        );
        pnlModeloLayout.setVerticalGroup(
            pnlModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlModeloLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addGroup(pnlModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtMName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtAS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMoIntro)
                    .addComponent(btnMoModificar)))
        );

        jLabel9.setText("Nombre");

        jLabel10.setText("Pais");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("Marcas");

        btnMaIntro.setText("Introducir");
        btnMaIntro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaIntroActionPerformed(evt);
            }
        });

        btnMaModificar.setText("Modificar");
        btnMaModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMarcaLayout = new javax.swing.GroupLayout(pnlMarca);
        pnlMarca.setLayout(pnlMarcaLayout);
        pnlMarcaLayout.setHorizontalGroup(
            pnlMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMarcaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMarcaLayout.createSequentialGroup()
                        .addGroup(pnlMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(pnlMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMNombre)
                            .addComponent(txtPais)))
                    .addComponent(jLabel14)
                    .addGroup(pnlMarcaLayout.createSequentialGroup()
                        .addComponent(btnMaIntro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnMaModificar)))
                .addContainerGap())
        );
        pnlMarcaLayout.setVerticalGroup(
            pnlMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMarcaLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addGroup(pnlMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtMNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMaIntro)
                    .addComponent(btnMaModificar)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(pnlModelo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlPieza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(pnlTipos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlMarca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(91, 91, 91))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlPieza, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlModelo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlMarca, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlTipos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPIntroducirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPIntroducirActionPerformed
        try {
            // TODO add your handling code here:
            //Statement s = conexion.createStatement();
            int precio = parseInt(txtPrecio.getText());
            int A_Tipo = 0;

            ResultSet rs = s.executeQuery("SELECT  ma.P_Tipo "
                    + "                    FROM tipo ma "
                    + "                    WHERE  ma.Nombre = '" + cbTipo.getSelectedItem().toString() + "'");
            while (rs.next()) {
                A_Tipo = rs.getInt(1);
            }
            if (A_Tipo != 0) {
                String insertinto = "INSERT INTO pieza VALUES(null ,'" + txtNombre.getText() + "'," + A_Tipo + "," + precio + "  );";
                System.out.println(insertinto);
                s.executeUpdate(insertinto);
            }

        } catch (SQLException ex) {
            Logger.getLogger(NModificar.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_btnPIntroducirActionPerformed

    private void txtPNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPNombreActionPerformed

    private void btnMoIntroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoIntroActionPerformed
        // TODO add your handling code here:
        try {
            //Statement s = conexion.createStatement();
            int A_Marca = 0;
            ResultSet rs = s.executeQuery("SELECT  ma.P_Marca "
                    + "                    FROM marca ma "
                    + "                    WHERE  ma.Nombre = '" + cbMarca.getSelectedItem().toString() + "'");
            while (rs.next()) {
                A_Marca = rs.getInt(1);
            }
            if (A_Marca != 0) {
                String insertinto = "INSERT INTO modelo VALUES(null ,'" + txtMName.getText() + "'," + A_Marca + ",'" + txtAS.getText() + "', '" + txtAR.getText() + "'  );";
                System.out.println(insertinto);
                s.executeUpdate(insertinto);
            }

        } catch (SQLException ex) {
            Logger.getLogger(NModificar.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_btnMoIntroActionPerformed

    private void btnTIntroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTIntroActionPerformed
        // TODO add your handling code here:
        try {

            String insertinto = "INSERT INTO tipo VALUES(null ,'" + txtPNombre.getText() + "'  );";
            System.out.println(insertinto);
            s.executeUpdate(insertinto);
        } catch (SQLException ex) {
            Logger.getLogger(NModificar.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();

    }//GEN-LAST:event_btnTIntroActionPerformed

    private void btnMaIntroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaIntroActionPerformed
        // TODO add your handling code here:
        try {
            //Statement s = conexion.createStatement();
            //int precio = parseInt(txtPrecio.getText());
            String insertinto = "INSERT INTO marca VALUES(null ,'" + txtMNombre.getText() + "','" + txtPais.getText() + "'  );";
            System.out.println(insertinto);
            s.executeUpdate(insertinto);
        } catch (SQLException ex) {
            Logger.getLogger(NModificar.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_btnMaIntroActionPerformed

    private void btnPModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPModificarActionPerformed
        // TODO add your handling code here:
        try {
            float precio = Float.parseFloat(txtPrecio.getText());
            System.out.println(precio);
            String sentencias = "Nombre='" + txtNombre.getText() + "' , A_Tipo=" + cbTipo.getSelectedIndex() + " , Precio=" + precio;
            System.out.println(sentencias);
            System.out.println(this.getFila());
            String modificar = "UPDATE pieza SET " + sentencias + " WHERE P_Pieza=" + this.getFila() + "";
            s.executeUpdate(modificar);
            s.close();
        } catch (SQLException ex) {
            Logger.getLogger(NModificar.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_btnPModificarActionPerformed

    private void btnMoModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoModificarActionPerformed
        // TODO add your handling code here:
        try {
            String sentencias = "Nombre='" + txtPNombre.getText() + "', A_Marca=" + cbMarca.getSelectedIndex() + " , AnoSalida='" + txtAS.getText() + "' , AnoExtincion='" + txtAR.getText() + "'";
            System.out.println(sentencias);
            String modificar = "UPDATE modelo SET " + sentencias + " WHERE P_Modelo=" + this.getFila() + "";
            s.executeUpdate(modificar);
            s.close();
        } catch (SQLException ex) {
            Logger.getLogger(NModificar.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();

    }//GEN-LAST:event_btnMoModificarActionPerformed

    private void btnTModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTModificarActionPerformed
        // TODO add your handling code here:
        try {
            String sentencias = "Nombre='" + txtPNombre.getText() + "'";
            System.out.println(sentencias);
            String modificar = "UPDATE tipo SET " + sentencias + " WHERE P_Tipo=" + this.getFila() + "";
            s.executeUpdate(modificar);
            s.close();
        } catch (SQLException ex) {
            Logger.getLogger(NModificar.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_btnTModificarActionPerformed

    private void btnMaModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaModificarActionPerformed
        // TODO add your handling code here:
        try {
            String sentencias = "Nombre='" + txtMNombre.getText() + "' , Pais='" + txtPais.getText() + "'";
            System.out.println(sentencias);
            String modificar = "UPDATE marca SET " + sentencias + " WHERE P_Marca=" + this.getFila() + "";
            s.executeUpdate(modificar);
            s.close();
        } catch (SQLException ex) {
            Logger.getLogger(NModificar.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_btnMaModificarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMaIntro;
    private javax.swing.JButton btnMaModificar;
    private javax.swing.JButton btnMoIntro;
    private javax.swing.JButton btnMoModificar;
    private javax.swing.JButton btnPIntroducir;
    private javax.swing.JButton btnPModificar;
    private javax.swing.JButton btnTIntro;
    private javax.swing.JButton btnTModificar;
    private javax.swing.JComboBox<String> cbMarca;
    private javax.swing.JComboBox<String> cbTipo;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel pnlMarca;
    private javax.swing.JPanel pnlModelo;
    private javax.swing.JPanel pnlPieza;
    private javax.swing.JPanel pnlTipos;
    private javax.swing.JTextField txtAR;
    private javax.swing.JTextField txtAS;
    private javax.swing.JTextField txtMName;
    private javax.swing.JTextField txtMNombre;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPNombre;
    private javax.swing.JTextField txtPais;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
    public void rellenarJC() throws SQLException {
        int i = 0;
        int num = 0;
        Statement s = conexion.createStatement();
        ResultSet rs = s.executeQuery("SELECT  ma.Nombre "
                + "                    FROM tipo ma ");
        while (rs.next()) {
            num++;
        }
        ResultSet query = s.executeQuery("SELECT  ma.Nombre "
                + "                    FROM  tipo ma ");
        String[] tipos = new String[num];

        while (query.next()) {
            //System.out.println(" " + query.getString(1));
            tipos[i] = query.getString(1);
            i++;

        }
        for (int j = 0; j < tipos.length; j++) {
            //System.out.println(marcas[j]);
            cbTipo.addItem(tipos[j]);
        }

        i = 0;
        num = 0;

        ResultSet rs2 = s.executeQuery("SELECT  ma.Nombre "
                + "                    FROM marca ma ");
        while (rs2.next()) {
            num++;
        }
        ResultSet query2 = s.executeQuery("SELECT  ma.Nombre "
                + "                    FROM  marca ma ");
        String[] marcas = new String[num];

        while (query2.next()) {
            //System.out.println(" " + query.getString(1));
            marcas[i] = query2.getString(1);
            i++;

        }
        for (int j = 0; j < marcas.length; j++) {
            //System.out.println(marcas[j]);
            cbMarca.addItem(marcas[j]);
        }

    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getFila() {
        return fila;
    }

    public void rellenarJCM() throws SQLException {
        int i = 0;
        int num = 0;
        Statement s = conexion.createStatement();

        if (pg.getTipo() == "pieza") {
            //System.out.println("Relleno pieza");
            int p_p = 0;
            String nombre = null;
            int a_tipo = 0;
            float precio = 0;

            ResultSet resultRell = s.executeQuery("SELECT * "
                    + "                    FROM pieza p "
                    + "                    WHERE p.Nombre = '" + pg.getNombre() + "'");
            while (resultRell.next()) {
                p_p = resultRell.getInt(1);
                nombre = resultRell.getString(2);
                a_tipo = resultRell.getInt(3);
                precio = resultRell.getFloat(4);

            }
            ResultSet rs = s.executeQuery("SELECT  ma.Nombre "
                    + "                    FROM tipo ma ");
            while (rs.next()) {
                num++;
            }
            ResultSet query = s.executeQuery("SELECT  ma.Nombre "
                    + "                    FROM  tipo ma ");
            String[] tipos = new String[num];

            while (query.next()) {
                //System.out.println(" " + query.getString(1));
                tipos[i] = query.getString(1);
                i++;

            }
            for (int j = 0; j < tipos.length; j++) {
                //System.out.println(marcas[j]);
                cbTipo.addItem(tipos[j]);
            }
            //System.out.println("Relleno--> " + p_p + "-" + nombre + "-" + a_tipo + "-" + precio);
            txtNombre.setText(nombre);
            String valor = precio + "";
            txtPrecio.setText(valor);
            setFila(p_p);
            cbTipo.setSelectedIndex(a_tipo - 1);
        }
        if (pg.getTipo() == "marca") {
            int pm = 0;
            String nombre = null;
            String pais = null;
            ResultSet resultRell = s.executeQuery("SELECT * "
                    + "                    FROM marca m "
                    + "                    WHERE m.Nombre = '" + pg.getNombre() + "'");
            while (resultRell.next()) {
                pm = resultRell.getInt(1);
                nombre = resultRell.getString(2);
                pais = resultRell.getString(3);
            }
            txtMNombre.setText(nombre);
            txtPais.setText(pais);
            setFila(pm);
        }
        if (pg.getTipo() == "modelo") {
            System.out.println("Relleno pieza");
            int pM = 0;
            String nombre = null;
            int aMarca = 0;
            String anoSalida = null;
            String anoExtincion = null;

            ResultSet resultRell = s.executeQuery("SELECT * "
                    + "                    FROM modelo p "
                    + "                    WHERE p.Nombre = '" + pg.getNombre() + "'");
            while (resultRell.next()) {
                pM = resultRell.getInt(1);
                nombre = resultRell.getString(2);
                aMarca = resultRell.getInt(3);
                anoSalida = resultRell.getString(4);
                anoExtincion = resultRell.getString(5);

            }
            //System.out.println(pM +"-"+nombre+"-"+aMarca);

            ResultSet rs = s.executeQuery("SELECT  ma.Nombre "
                    + "                    FROM marca ma ");
            while (rs.next()) {
                num++;
            }
            //System.out.println(num);
            ResultSet query = s.executeQuery("SELECT  ma.Nombre "
                    + "                    FROM  marca ma ");
            String[] marca = new String[num];

            while (query.next()) {
                marca[i] = query.getString(1);
                i++;
            }
            for (int j = 0; j < marca.length; j++) {
                cbMarca.addItem(marca[j]);
            }
            setFila(pM);
            txtMName.setText(nombre);
            txtAS.setText(anoSalida);
            txtAR.setText(anoExtincion);
            cbMarca.setSelectedIndex(aMarca - 1);
        }
        if (pg.getTipo() == "tipo") {
            int pt = 0;
            String nombre = "";
            System.out.println("pgNombre= " + pg.getNombre());
            ResultSet ese = s.executeQuery("SELECT * "
                    + "                    FROM tipo t "
                    + "                    WHERE t.Nombre = '" + pg.getNombre() + "'");
            while (ese.next()) {
                System.out.println("1Resultado");
                pt = ese.getInt(1);
                nombre = ese.getString(2);
            }
            System.out.println(nombre);
            setFila(pt);
            txtPNombre.setText(nombre);
        }

    }

    public void visualizar() {
        if (pg.getTipo() == "pieza") {
            pnlPieza.setVisible(true);
            pnlTipos.setVisible(false);
            pnlModelo.setVisible(false);
            pnlMarca.setVisible(false);
        }
        if (pg.getTipo() == "marca") {
            pnlPieza.setVisible(false);
            pnlTipos.setVisible(false);
            pnlModelo.setVisible(false);
            pnlMarca.setVisible(true);
        }
        if (pg.getTipo() == "modelo") {
            pnlPieza.setVisible(false);
            pnlTipos.setVisible(false);
            pnlModelo.setVisible(true);
            pnlMarca.setVisible(false);
        }
        if (pg.getTipo() == "tipo") {
            pnlPieza.setVisible(false);
            pnlTipos.setVisible(true);
            pnlModelo.setVisible(false);
            pnlMarca.setVisible(false);
        }
    }

}
