/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.cafeteria;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Diego
 */
public class Cafeteria extends javax.swing.JFrame {
    
    private final double precioCarne = 2.50; //final es para declarar constantes
    private final double precioPapas = 1.50;
    private final double precioPollo = 1.75;
    private final double precioVegetales = 1.00;
    private double subTotalCarne;
    private double subTotalPapas;
    private double subTotalPollo;
    private double subTotalVegetales;
    private double subTotal; 
    private double total;

    /**
     * Creates new form Cafeteria
     */
    public Cafeteria() {
        initComponents();
        setDefaults();
        limpiar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Clientes = new javax.swing.ButtonGroup();
        Pago = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        spnPapas = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        lblsubtotalpapas = new javax.swing.JLabel();
        lblPapasimg = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        spnCarne = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        lblsubtotalcarne = new javax.swing.JLabel();
        lblCarne = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        spnPollo = new javax.swing.JSpinner();
        jLabel12 = new javax.swing.JLabel();
        lblsubtotalpollo = new javax.swing.JLabel();
        lblPollo = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        spnVegetales = new javax.swing.JSpinner();
        jLabel15 = new javax.swing.JLabel();
        lblsubtotalvegetales = new javax.swing.JLabel();
        lblVegetales = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        rbtEmpleado = new javax.swing.JRadioButton();
        rbtOtros = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        rbtnBitcoin = new javax.swing.JRadioButton();
        rbtnEfectivo1 = new javax.swing.JRadioButton();
        rbtnTarjeta1 = new javax.swing.JRadioButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        btnComprar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 51));

        lblLogo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Diego\\Desktop\\UCA\\01_2023\\POO\\Cafeteria\\src\\main\\java\\com\\mycompany\\imagenes\\logo.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(lblLogo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 16, Short.MAX_VALUE)
                .addComponent(lblLogo))
        );

        jPanel2.setBackground(new java.awt.Color(255, 153, 51));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("$1.50");

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Cantidad:");

        spnPapas.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        spnPapas.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnPapasStateChanged(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Subtotal:");

        lblsubtotalpapas.setForeground(new java.awt.Color(0, 0, 0));
        lblsubtotalpapas.setText("$0.00");

        lblPapasimg.setIcon(new javax.swing.ImageIcon("C:\\Users\\Diego\\Desktop\\UCA\\01_2023\\POO\\Cafeteria\\src\\main\\java\\com\\mycompany\\imagenes\\papasqueso.jpg")); // NOI18N

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Papas con queso");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(spnPapas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblsubtotalpapas))
                    .addComponent(jLabel3))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblPapasimg))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(spnPapas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblsubtotalpapas))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblPapasimg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 153, 51));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("$2.50");

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Cantidad:");

        spnCarne.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        spnCarne.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnCarneStateChanged(evt);
            }
        });

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Subtotal:");

        lblsubtotalcarne.setForeground(new java.awt.Color(0, 0, 0));
        lblsubtotalcarne.setText("$0.00");

        lblCarne.setIcon(new javax.swing.ImageIcon("C:\\Users\\Diego\\Desktop\\UCA\\01_2023\\POO\\Cafeteria\\src\\main\\java\\com\\mycompany\\imagenes\\carne.jpg")); // NOI18N

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Carne deshilada");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(spnCarne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblsubtotalcarne))
                    .addComponent(jLabel9))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblCarne))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(spnCarne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblsubtotalcarne))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lblCarne)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 153, 51));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("$1.75");

        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Cantidad:");

        spnPollo.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        spnPollo.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnPolloStateChanged(evt);
            }
        });

        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Subtotal:");

        lblsubtotalpollo.setForeground(new java.awt.Color(0, 0, 0));
        lblsubtotalpollo.setText("$0.00");

        lblPollo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Diego\\Desktop\\UCA\\01_2023\\POO\\Cafeteria\\src\\main\\java\\com\\mycompany\\imagenes\\pollobarbacoa.jpg")); // NOI18N

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Pollo a la barbacoa");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10)
                    .addComponent(spnPollo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblsubtotalpollo))
                    .addComponent(jLabel12))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblPollo))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(spnPollo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblsubtotalpollo))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lblPollo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(255, 153, 51));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("$1.00");

        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Cantidad:");

        spnVegetales.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        spnVegetales.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnVegetalesStateChanged(evt);
            }
        });

        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Subtotal:");

        lblsubtotalvegetales.setForeground(new java.awt.Color(0, 0, 0));
        lblsubtotalvegetales.setText("$0.00");

        lblVegetales.setIcon(new javax.swing.ImageIcon("C:\\Users\\Diego\\Desktop\\UCA\\01_2023\\POO\\Cafeteria\\src\\main\\java\\com\\mycompany\\imagenes\\vegetales.jpg")); // NOI18N

        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Vegetales al ajillo");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13)
                    .addComponent(spnVegetales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblsubtotalvegetales))
                    .addComponent(jLabel15))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblVegetales))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel16)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(spnVegetales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblsubtotalvegetales))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(lblVegetales)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Clientes.add(rbtEmpleado);
        rbtEmpleado.setText("Empleado");
        rbtEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtEmpleadoActionPerformed(evt);
            }
        });
        jPanel3.add(rbtEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        Clientes.add(rbtOtros);
        rbtOtros.setText("Otros");
        rbtOtros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtOtrosActionPerformed(evt);
            }
        });
        jPanel3.add(rbtOtros, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jSeparator1.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo de cliente"));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 120, 110));

        Pago.add(rbtnBitcoin);
        rbtnBitcoin.setText("Bitcoin");
        jPanel3.add(rbtnBitcoin, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, -1, -1));

        Pago.add(rbtnEfectivo1);
        rbtnEfectivo1.setText("Efectivo");
        rbtnEfectivo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnEfectivo1ActionPerformed(evt);
            }
        });
        jPanel3.add(rbtnEfectivo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, -1, -1));

        Pago.add(rbtnTarjeta1);
        rbtnTarjeta1.setText("Tarjeta");
        jPanel3.add(rbtnTarjeta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, -1, -1));

        jSeparator2.setBorder(javax.swing.BorderFactory.createTitledBorder("Forma de pago"));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 120, 110));

        jLabel17.setText("Nombre:");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, -1, -1));
        jPanel3.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 200, -1));

        jLabel18.setText("Total:");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, -1, -1));

        lblTotal.setText("$0.00");
        jPanel3.add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 60, -1, -1));

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel3.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, -1, -1));

        btnComprar.setText("Comprar");
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });
        jPanel3.add(btnComprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtEmpleadoActionPerformed
        // TODO add your handling code here:
        total = subTotal * 0.6;
        lblTotal.setText("$" + String.valueOf(total));
    }//GEN-LAST:event_rbtEmpleadoActionPerformed

    private void rbtOtrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtOtrosActionPerformed
        // TODO add your handling code here:
        total = subTotal;
        lblTotal.setText("$" + String.valueOf(total));
    }//GEN-LAST:event_rbtOtrosActionPerformed

    private void spnPapasStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnPapasStateChanged
        // TODO add your handling code here:
        
        subTotalPapas = precioPapas * (Integer)spnPapas.getValue();   
        lblsubtotalpapas.setText("$" + String.valueOf(subTotalPapas));
        setTotal();
    }//GEN-LAST:event_spnPapasStateChanged

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here: 
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void spnCarneStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnCarneStateChanged
        // TODO add your handling code here:
        subTotalCarne = precioCarne * (Integer)spnCarne.getValue();   
        lblsubtotalcarne.setText("$" + String.valueOf(subTotalCarne));
        setTotal();
    }//GEN-LAST:event_spnCarneStateChanged

    private void spnPolloStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnPolloStateChanged
        // TODO add your handling code here:
        subTotalPollo = precioPollo * (Integer)spnPollo.getValue();   
        lblsubtotalpollo.setText("$" + String.valueOf(subTotalPollo));
        setTotal();
    }//GEN-LAST:event_spnPolloStateChanged

    private void spnVegetalesStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnVegetalesStateChanged
        // TODO add your handling code here:
        subTotalVegetales = precioVegetales * (Integer)spnVegetales.getValue();   
        lblsubtotalvegetales.setText("$" + String.valueOf(subTotalVegetales));
        setTotal();
    }//GEN-LAST:event_spnVegetalesStateChanged

    private void rbtnEfectivo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnEfectivo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnEfectivo1ActionPerformed

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed
        // TODO add your handling code here:

        if(txtNombre.getText().isEmpty())
            JOptionPane.showMessageDialog(null, "No se puede realizar compra, nombre en blanco");
        else{
            setTotal();
            String tipoCliente = rbtEmpleado.isSelected() ? "Empleado" : "Otro";
            String tipoPago;
            
            if(rbtnEfectivo1.isSelected())
                tipoPago = "Efectivo";
            else if(rbtnTarjeta1.isSelected())
                tipoPago = "Tarjeta";
            else
                tipoPago = "Bitcoin";
            
            JOptionPane.showMessageDialog(null, "Cliente: " + txtNombre.getText() + 
                    "\nTipo de cliente: " + tipoCliente + "\nTipo de pago: " + tipoPago +
                    "\nSubtotal: " + String.valueOf(subTotal) + "\nTotal a pagar: " + String.valueOf(total));
        }
    }//GEN-LAST:event_btnComprarActionPerformed

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
            java.util.logging.Logger.getLogger(Cafeteria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cafeteria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cafeteria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cafeteria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cafeteria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Clientes;
    private javax.swing.ButtonGroup Pago;
    private javax.swing.JButton btnComprar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblCarne;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblPapasimg;
    private javax.swing.JLabel lblPollo;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblVegetales;
    private javax.swing.JLabel lblsubtotalcarne;
    private javax.swing.JLabel lblsubtotalpapas;
    private javax.swing.JLabel lblsubtotalpollo;
    private javax.swing.JLabel lblsubtotalvegetales;
    private javax.swing.JRadioButton rbtEmpleado;
    private javax.swing.JRadioButton rbtOtros;
    private javax.swing.JRadioButton rbtnBitcoin;
    private javax.swing.JRadioButton rbtnEfectivo1;
    private javax.swing.JRadioButton rbtnTarjeta1;
    private javax.swing.JSpinner spnCarne;
    private javax.swing.JSpinner spnPapas;
    private javax.swing.JSpinner spnPollo;
    private javax.swing.JSpinner spnVegetales;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

    private void limpiar(){
        subTotalCarne = 0.00;
        subTotalPapas = 0.00;
        subTotalPollo = 0.00;
        subTotalVegetales = 0.00;
        subTotal = 0.00; 
        total = 0.00;
        spnCarne.setValue(0);
        spnPollo.setValue(0);
        spnPapas.setValue(0);
        spnVegetales.setValue(0);
        rbtEmpleado.setSelected(true);
        rbtnEfectivo1.setSelected(true);
        txtNombre.setText("");
    }
    
    private void setDefaults(){
        lblLogo.setIcon(resizeImage("src/main/java/com/mycompany/imagenes/logo.png"));
        lblPapasimg.setIcon(resizeImage("src/main/java/com/mycompany/imagenes/papasqueso.jpg"));
        lblPollo.setIcon(resizeImage("src/main/java/com/mycompany/imagenes/pollobarbacoa.jpg"));
        lblCarne.setIcon(resizeImage("src/main/java/com/mycompany/imagenes/carne.jpg"));
        lblVegetales.setIcon(resizeImage("src/main/java/com/mycompany/imagenes/vegetales.jpg"));
    }
    
    private ImageIcon resizeImage(String path){
        return new ImageIcon(new ImageIcon(path).getImage());
    }
    
    private void setTotal(){
        subTotal = subTotalPapas + subTotalCarne + subTotalVegetales + subTotalPollo;
        
        total = rbtEmpleado.isSelected() ? subTotal * 0.6 : subTotal;
        
        /*if(rbtEmpleado.isSelected())
            total = subTotal * 0.6;
        else
            total = subTotal;*/
        
        lblTotal.setText("$" + String.valueOf(total));
    }
}