package vista;

import controlador.MaterialesControl;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.RowSorter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import modelo.Materiales;

public class FrmMateriales extends javax.swing.JFrame {

    MaterialesControl materialesControl = new MaterialesControl();
    int t;
    Materiales materialesObj;
    ArrayList<Materiales> materialesLista;
    String[] categoria = new String[]{"**Seleccione", "Espumas", "Telas", "Maderas", "Otros"};
    String factura = null;
    String ma_filtro = "";
    FrmPrincipal frmPrincipal = new FrmPrincipal();

    public FrmMateriales() {

        initComponents();
        Refresh();
        this.setLocationRelativeTo(null);
        /*ImageIcon imagen=new ImageIcon("src/imagenes/atras.png");
        Icon icono=new ImageIcon(imagen.getImage().getScaledInstance(jlbAtras.getWidth(), jlbAtras.getHeight(),Image.SCALE_DEFAULT));
        jlbAtras.setIcon(icono);
        this.repaint();*/
        
    }

    public void Refresh() {
        DefaultTableModel modelo = new DefaultTableModel();

        modelo.addColumn("Codigo");
        modelo.addColumn("Material");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Precio");
        modelo.addColumn("Fecha de Compra");
        modelo.addColumn("Factura");
        modelo.addColumn("Categoria");
        modelo.addColumn("Precio Total");
        if (txtBuscarMaterial.getText().equals("") || txtBuscarMaterial.getText() == null) {
            materialesLista = materialesControl.listarMaterial("");
        } else {
            String ssql = " where ma_nombre like '%" + txtBuscarMaterial.getText() + "%'";
            materialesLista = materialesControl.listarMaterial(ssql);
        }
        Object[] fila = new Object[8];
        for (int i = 0; i < materialesLista.size(); i++) {
            materialesObj = materialesLista.get(i);
            fila[0] = materialesObj.getMa_codigo();
            fila[1] = materialesObj.getMa_nombre();
            fila[2] = materialesObj.getMa_cantidad();
            fila[3] = materialesObj.getPrecio();
            fila[4] = materialesObj.getMa_fecha_compra();
            fila[5] = materialesObj.getMa_factura();
            fila[6] = categoria[materialesObj.getMa_categoria()];
            fila[7] = materialesObj.getMa_precio_total();
            modelo.addRow(fila);
        }
        tblMateriales.setModel(modelo);

        RowSorter<TableModel> ordenar = new TableRowSorter<TableModel>(modelo);
        tblMateriales.setRowSorter(ordenar);

        cbxCategoriaMaterial.setModel(new DefaultComboBoxModel<>(categoria));
        txtMaterial.setText("");
        txtCantidad.setText("");
        txtF_CompraM.setText("");
        txtPrecioMaterial.setText("");
        checkNo.setSelected(false);
        checkSi.setSelected(false);
        txtID.setText("");
        jlbGrabar.setText("      Grabar");
    }

    /*
    public Class getColumnClass(int column) {
                Class Value;
                if (column >= 0 && column < getColumnCount()) {
                    Value = getValueAt(0, column).getClass();
                } else {
                    Value = Object.class;
                }
                return Value;
            }*/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        txtMaterial = new javax.swing.JTextField();
        txtF_CompraM = new javax.swing.JTextField();
        txtPrecioMaterial = new javax.swing.JTextField();
        cbxCategoriaMaterial = new javax.swing.JComboBox<>();
        checkSi = new javax.swing.JCheckBox();
        checkNo = new javax.swing.JCheckBox();
        txtID = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jlGrabar = new javax.swing.JPanel();
        jlbGrabar = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jlbAtras = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtBuscarMaterial = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMateriales = new javax.swing.JTable();
        btnGenerarInformesMateriales = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmiModificar = new javax.swing.JMenuItem();
        jmiEliminar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(71, 179, 250));

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 1, 12)); // NOI18N
        jLabel1.setText("Material");

        jLabel2.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        jLabel2.setText("Cantidad");

        jLabel3.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        jLabel3.setText("Categoria");

        jLabel5.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        jLabel5.setText("Precio Unitario");

        jLabel6.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        jLabel6.setText("Fecha de Compra");

        jLabel8.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        jLabel8.setText("Factura");

        txtCantidad.setBorder(null);

        txtMaterial.setBorder(null);
        txtMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaterialActionPerformed(evt);
            }
        });

        txtF_CompraM.setBorder(null);

        txtPrecioMaterial.setBorder(null);
        txtPrecioMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioMaterialActionPerformed(evt);
            }
        });

        cbxCategoriaMaterial.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        cbxCategoriaMaterial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Espuma", "Tela", "Madera" }));

        checkSi.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        checkSi.setText("Si");
        checkSi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        checkNo.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        checkNo.setText("No");
        checkNo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jlGrabar.setBackground(new java.awt.Color(0, 153, 51));
        jlGrabar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlGrabarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlGrabarMouseEntered(evt);
            }
        });

        jlbGrabar.setBackground(new java.awt.Color(255, 255, 255));
        jlbGrabar.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        jlbGrabar.setForeground(new java.awt.Color(255, 255, 255));
        jlbGrabar.setText("      Grabar");
        jlbGrabar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlbGrabar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbGrabarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jlGrabarLayout = new javax.swing.GroupLayout(jlGrabar);
        jlGrabar.setLayout(jlGrabarLayout);
        jlGrabarLayout.setHorizontalGroup(
            jlGrabarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlbGrabar, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
        );
        jlGrabarLayout.setVerticalGroup(
            jlGrabarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlbGrabar, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(255, 102, 51));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("   Limpiar");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
        );

        jlbAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/atras.png"))); // NOI18N
        jlbAtras.setText("jLabel11");
        jlbAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlbAtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbAtrasMouseClicked(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(0, 113, 188));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cargar Material");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(23, 23, 23))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlGrabar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(206, 206, 206)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(199, 199, 199))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel1))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtMaterial, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                                                .addComponent(txtCantidad)
                                                .addComponent(jSeparator1)
                                                .addComponent(jSeparator2))
                                            .addComponent(cbxCategoriaMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(63, 63, 63)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel5))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtPrecioMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtF_CompraM, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                                            .addComponent(jSeparator4)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(40, 40, 40)
                                        .addComponent(checkSi)
                                        .addGap(18, 18, 18)
                                        .addComponent(checkNo))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jlbAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(280, 280, 280)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtID)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtID))
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(45, 45, 45)
                                .addComponent(jLabel6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cbxCategoriaMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(checkSi)
                                .addComponent(checkNo)
                                .addComponent(jLabel8))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtPrecioMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(txtF_CompraM, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jlGrabar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(72, 181, 249));

        jLabel9.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        jLabel9.setText("Nombre del material");

        txtBuscarMaterial.setBorder(null);
        txtBuscarMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarMaterialActionPerformed(evt);
            }
        });
        txtBuscarMaterial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarMaterialKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(63, 63, 63))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSeparator5)
                            .addComponent(txtBuscarMaterial, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE))
                        .addGap(21, 21, 21))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(txtBuscarMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblMateriales.setBackground(new java.awt.Color(72, 181, 249));
        tblMateriales.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        tblMateriales.setForeground(new java.awt.Color(0, 0, 0));
        tblMateriales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Material", "Categoria", "Cantidad", "Fecha de Compra", "Factura", "Precio Total"
            }
        ));
        tblMateriales.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tblMateriales);

        btnGenerarInformesMateriales.setText("Generar Informes");
        btnGenerarInformesMateriales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarInformesMaterialesActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(72, 181, 249));

        jLabel7.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jLabel7.setText("Listado de Materiales");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(384, 384, 384))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnGenerarInformesMateriales))
                        .addGap(0, 6, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnGenerarInformesMateriales)
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

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPrecioMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioMaterialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioMaterialActionPerformed

    private void jmiModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiModificarActionPerformed
        jlbGrabar.setText("    Modificar");
        Integer filaNum = tblMateriales.getSelectedRow();
        if (filaNum < 0) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un registro");
        } else {
            DefaultTableModel modelo = (DefaultTableModel) tblMateriales.getModel();
            Integer ma_codigo = (Integer) modelo.getValueAt(filaNum, 0);
            String whereTmp = " where ma_codigo='" + ma_codigo + "'";
            materialesLista = materialesControl.listarMaterial(whereTmp);
            materialesObj = materialesLista.get(0);

            txtMaterial.setText(materialesObj.getMa_nombre());
            txtID.setText(materialesObj.getMa_codigo().toString());
            JOptionPane.showMessageDialog(null, "El codigo es: "+materialesObj.getMa_codigo());
            txtCantidad.setText(String.valueOf(materialesObj.getMa_cantidad()));
            txtPrecioMaterial.setText(String.valueOf(materialesObj.getPrecio()));
            txtF_CompraM.setText(materialesObj.getMa_fecha_compra());
            factura = materialesObj.getMa_factura();
            //JOptionPane.showMessageDialog(null, factura);
            if (factura.equals("Si")) {
                checkSi.setSelected(true);
                checkNo.setSelected(false);
            } else {
                checkNo.setSelected(true);
                checkSi.setSelected(false);
            }
            cbxCategoriaMaterial.setSelectedIndex(materialesObj.getMa_categoria());

        }

    }//GEN-LAST:event_jmiModificarActionPerformed

    private void jmiEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiEliminarActionPerformed
        Integer filaNum = tblMateriales.getSelectedRow();
        if (filaNum < 0) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un registro");
        } else {
            DefaultTableModel modelo = (DefaultTableModel) tblMateriales.getModel();
            Integer ma_codigo = (Integer) modelo.getValueAt(filaNum, 0);
            materialesObj = new Materiales(ma_codigo);
            Integer opc = JOptionPane.showConfirmDialog(null, "Estas Seguro?");
            if (opc == 0) {
                materialesControl.eliminarMAterial(materialesObj);
            }
            this.Refresh();

        }
    }//GEN-LAST:event_jmiEliminarActionPerformed

    private void btnGenerarInformesMaterialesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarInformesMaterialesActionPerformed
        GenerarInformeMateriales g_informes = new GenerarInformeMateriales();
        g_informes.setVisible(true);
    }//GEN-LAST:event_btnGenerarInformesMaterialesActionPerformed

    private void txtBuscarMaterialKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarMaterialKeyReleased
        this.Refresh();
    }//GEN-LAST:event_txtBuscarMaterialKeyReleased

    private void txtBuscarMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarMaterialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarMaterialActionPerformed

    private void txtMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaterialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaterialActionPerformed

    private void jlGrabarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlGrabarMouseClicked
        
    }//GEN-LAST:event_jlGrabarMouseClicked

    private void jlbGrabarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbGrabarMouseClicked
        try {
            factura=null;
            Integer categoriaSelecc = cbxCategoriaMaterial.getSelectedIndex();

            if (checkNo.isSelected()) {
                factura = "No";
                //JOptionPane.showMessageDialog(null, "NO");

            } else if (checkSi.isSelected()) {
                factura = "Si";
                //JOptionPane.showMessageDialog(null, "SI");

            }
            if (factura == null) {
                JOptionPane.showMessageDialog(null, "Debe seleccionar una opcion de factura");
            }
            if (checkNo.isSelected() && checkSi.isSelected()) {
                JOptionPane.showMessageDialog(null, "Debe seleccionar solo una opcion de factura");
                categoriaSelecc = 0;
            }

            if (factura != null) {
                Integer id = null;

                if (txtID.getText() != null && txtID.getText() != "") {
                    id = Integer.parseInt(txtID.getText());
                }

                String material = txtMaterial.getText();
                if ((categoriaSelecc != 0 && factura != null)&&(!txtMaterial.getText().equals("")) ){

                    Double cantidad = Double.parseDouble(txtCantidad.getText());
                    Double precio = Double.parseDouble(txtPrecioMaterial.getText());
                    String f_compra = txtF_CompraM.getText();
                    Double precio_total = cantidad * precio;

                    materialesObj = new Materiales(id, material, cantidad, precio, f_compra, factura, categoriaSelecc, precio_total);

                    if (id == null) {
                        //JOptionPane.showMessageDialog(null, "Aqui");
                        materialesControl.insertarMaterial(materialesObj);
                        //JOptionPane.showMessageDialog(null, "Material Agregado con Exito!");
                        this.Refresh();
                    } else {
                        materialesControl.modificarMaterial(materialesObj);
                        JOptionPane.showMessageDialog(null, "Material Modificado con Exito!");
                        this.Refresh();
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Debe completar todos los campos");
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Precio y Cantidad deben ser numericos");
        }
    }//GEN-LAST:event_jlbGrabarMouseClicked

    private void jlGrabarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlGrabarMouseEntered
        
    }//GEN-LAST:event_jlGrabarMouseEntered

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        this.Refresh();
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jlbAtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbAtrasMouseClicked
        frmPrincipal.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jlbAtrasMouseClicked

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
            java.util.logging.Logger.getLogger(FrmMateriales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMateriales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMateriales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMateriales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMateriales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerarInformesMateriales;
    private javax.swing.JComboBox<String> cbxCategoriaMaterial;
    private javax.swing.JCheckBox checkNo;
    private javax.swing.JCheckBox checkSi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JPanel jlGrabar;
    private javax.swing.JLabel jlbAtras;
    private javax.swing.JLabel jlbGrabar;
    private javax.swing.JMenuItem jmiEliminar;
    private javax.swing.JMenuItem jmiModificar;
    private javax.swing.JTable tblMateriales;
    private javax.swing.JTextField txtBuscarMaterial;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtF_CompraM;
    private javax.swing.JLabel txtID;
    private javax.swing.JTextField txtMaterial;
    private javax.swing.JTextField txtPrecioMaterial;
    // End of variables declaration//GEN-END:variables
}
