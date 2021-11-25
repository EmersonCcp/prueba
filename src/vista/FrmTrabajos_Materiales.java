package vista;

import controlador.MaterialesDetalleControl;
import datos.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Filtro_Id_Trabajos;
import modelo.MaterialesDetalle;
import modelo.Trabajos;
import modelo.TrabajosMateriales;

public class FrmTrabajos_Materiales extends javax.swing.JFrame {
    
    MaterialesDetalle mdObj;
    MaterialesDetalleControl mdControl = new MaterialesDetalleControl();
    ArrayList<MaterialesDetalle> mdLista;
    Trabajos trabajosObj = new Trabajos();
    FrmTrabajos frmTrabajos = new FrmTrabajos();
    Filtro_Id_Trabajos filtro_id_trabajoObj= new Filtro_Id_Trabajos();
    
    public FrmTrabajos_Materiales() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.Refresh();
        
    }
    
    public void Refresh() {
        
        String where = " ,filtro_id_trabajo b where b.fi_codigo=a.fk_trabajo";

        //JOptionPane.showMessageDialog(null, "lo que hay en el where: " + where);
        DefaultTableModel modeloTM = new DefaultTableModel();
        modeloTM.addColumn("Codigo");
        modeloTM.addColumn("Material");
        modeloTM.addColumn("Cantidad");
        modeloTM.addColumn("Precio");
        modeloTM.addColumn("Precio Total");

        //JOptionPane.showMessageDialog(null, txtID_TM.getText());
        mdLista = mdControl.listarMD(where,"");
        
        Object[] filaTM = new Object[5];
        for (int t = 0; t < mdLista.size(); t++) {
            mdObj = mdLista.get(t);
            filaTM[0] = mdObj.getMd_codigo();
            filaTM[1] = mdObj.getMd_material();
            filaTM[2] = mdObj.getMd_cantidad();
            filaTM[3] = mdObj.getMd_precio();
            filaTM[4] = mdObj.getMd_precio_total();
            modeloTM.addRow(filaTM);
            
        }
        tblTrabajos_Materiales.setModel(modeloTM);
        
        txtID_TM.setText("");
        txtMaterialTM.setText("");
        txtCantidadTM.setText("");
        txtPrecioTM.setText("");
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCantidadTM = new javax.swing.JTextField();
        txtMaterialTM = new javax.swing.JTextField();
        txtPrecioTM = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTrabajos_Materiales = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JLabel();
        txtID_TM = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmiModificar = new javax.swing.JMenuItem();
        jmiEliminar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));

        jLabel1.setText("Agregar Materiales");

        jLabel2.setText("Material");

        jLabel3.setText("Cantidad");

        jLabel4.setText("Precio Unitario");

        tblTrabajos_Materiales.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tblTrabajos_Materiales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblTrabajos_Materiales);

        jPanel2.setBackground(new java.awt.Color(255, 255, 51));

        btnAgregar.setText("         Agregar");
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        jLabel7.setText("Materiales");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(23, 23, 23))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtCantidadTM, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                                                .addGap(8, 8, 8))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(24, 24, 24)
                                                .addComponent(txtMaterialTM, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)))
                                        .addGap(11, 11, 11)
                                        .addComponent(jLabel4))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtPrecioTM, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                                .addGap(21, 21, 21))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(txtID_TM, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1))
                    .addComponent(txtID_TM, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(txtPrecioTM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaterialTM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCantidadTM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jMenu1.setText("Opciones");

        jmiModificar.setText("Modificar");
        jmiModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiModificarActionPerformed(evt);
            }
        });
        jMenu1.add(jmiModificar);

        jmiEliminar.setText("Eliminar");
        jmiEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiEliminarActionPerformed(evt);
            }
        });
        jMenu1.add(jmiEliminar);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseClicked
        
        Integer id = null;
        if (txtID_TM.getText() != null && txtID_TM.getText() != "") {
            id = Integer.parseInt(txtID_TM.getText());
        }
        String material = txtMaterialTM.getText();
        Double cantidad = Double.parseDouble(txtCantidadTM.getText());
        Double precio = Double.parseDouble(txtPrecioTM.getText());
        Double precio_total = cantidad * precio;
        
        
        int codigo=0;
        String SSQL="select a.fi_codigo from filtro_id_trabajo a";
        PreparedStatement ps;
        ResultSet rs;
        Connection con = null;
        con = new Conexion().Conectar();
        try {
            ps=con.prepareStatement(SSQL);
            rs=ps.executeQuery();
            while(rs.next()){
                codigo=codigo+rs.getInt("fi_codigo");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Entrou");
        }
        
        JOptionPane.showMessageDialog(null,"aca: "+ codigo);
        
        
        
        
        
        if (material.equals("")) {
            JOptionPane.showMessageDialog(null, "Debe completar todos los campos");
            
        } else if (id == null) {
            mdObj = new MaterialesDetalle(id, material, cantidad, precio, precio_total, codigo);
            mdControl.insertarMD(mdObj);
            
        } else {
            mdObj = new MaterialesDetalle(id, material, cantidad, precio, precio_total);
            JOptionPane.showMessageDialog(null, "modificar:" + id);
            mdControl.modificarMD(mdObj);
            
        }
        
        SSQL=""+codigo;
        
        mdControl.ModificarGananciasTrabajos(SSQL);
        this.Refresh();
        
        txtMaterialTM.setText("");
        txtCantidadTM.setText("");
        txtPrecioTM.setText("");
    }//GEN-LAST:event_btnAgregarMouseClicked

    private void jmiModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiModificarActionPerformed
        btnAgregar.setText("        Modificar");
        Integer filaNum = tblTrabajos_Materiales.getSelectedRow();
        if (filaNum < 0) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un registro");
        } else {
            DefaultTableModel modelo = (DefaultTableModel) tblTrabajos_Materiales.getModel();
            Integer ma_codigo = (Integer) modelo.getValueAt(filaNum, 0);
            String whereTmp = " where md_codigo='" + ma_codigo + "'";
            mdLista = mdControl.listarMD(whereTmp,"");
            mdObj = mdLista.get(0);
            
            txtMaterialTM.setText(mdObj.getMd_material());
            txtID_TM.setText(mdObj.getMd_codigo().toString());
            txtCantidadTM.setText(mdObj.getMd_cantidad().toString());
            txtPrecioTM.setText(mdObj.getMd_precio().toString());
            
        }
    }//GEN-LAST:event_jmiModificarActionPerformed

    private void jmiEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiEliminarActionPerformed

        Integer filaNum = tblTrabajos_Materiales.getSelectedRow();
        if (filaNum < 0) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un registro");
        } else {
            DefaultTableModel modelo = (DefaultTableModel) tblTrabajos_Materiales.getModel();
            Integer ma_codigo = (Integer) modelo.getValueAt(filaNum, 0);
            mdObj = new MaterialesDetalle(ma_codigo);
            Integer opc = JOptionPane.showConfirmDialog(null, "Estas Seguro?");
            if (opc == 0) {
                mdControl.eliminarMD(mdObj);
            }
            this.Refresh();
            
        }
    }//GEN-LAST:event_jmiEliminarActionPerformed
    
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
            java.util.logging.Logger.getLogger(FrmTrabajos_Materiales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmTrabajos_Materiales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmTrabajos_Materiales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmTrabajos_Materiales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmTrabajos_Materiales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAgregar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem jmiEliminar;
    private javax.swing.JMenuItem jmiModificar;
    private javax.swing.JTable tblTrabajos_Materiales;
    private javax.swing.JTextField txtCantidadTM;
    private javax.swing.JLabel txtID_TM;
    private javax.swing.JTextField txtMaterialTM;
    private javax.swing.JTextField txtPrecioTM;
    // End of variables declaration//GEN-END:variables
}
