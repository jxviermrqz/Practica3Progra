package vista;

public class Principal extends javax.swing.JFrame {
    
    public Principal() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaReporte = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNombreInsumo = new javax.swing.JTextField();
        txtIdLote = new javax.swing.JTextField();
        txtDescripcionUso = new javax.swing.JTextField();
        txtTipoAyuda = new javax.swing.JTextField();
        txtPesoKg = new javax.swing.JTextField();
        txtListoParaEnvio = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnMostrarFichaLote = new javax.swing.JButton();
        btnRegistrarLote = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtCantidadLotes = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jPanel2.setBackground(new java.awt.Color(0, 102, 153));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jLabel1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel1.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 255));
        jLabel1.setText("Reporte:");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        jPanel2.add(jLabel1, gridBagConstraints);

        tablaReporte.setBackground(new java.awt.Color(255, 255, 255));
        tablaReporte.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID ", "Nombre", "Descripción", "Tipo", "Peso(Kg)", "Envio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaReporte);
        if (tablaReporte.getColumnModel().getColumnCount() > 0) {
            tablaReporte.getColumnModel().getColumn(0).setResizable(false);
            tablaReporte.getColumnModel().getColumn(1).setResizable(false);
            tablaReporte.getColumnModel().getColumn(2).setResizable(false);
            tablaReporte.getColumnModel().getColumn(3).setResizable(false);
        }

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel2.add(jScrollPane1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 341;
        gridBagConstraints.ipady = 524;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 12, 6, 6);
        jPanel1.add(jPanel2, gridBagConstraints);

        jPanel3.setBackground(new java.awt.Color(0, 102, 153));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        jLabel2.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 255));
        jLabel2.setText("Ingresar Lote:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel3.add(jLabel2, gridBagConstraints);

        txtNombreInsumo.setBackground(new java.awt.Color(248, 250, 255));
        txtNombreInsumo.setForeground(new java.awt.Color(0, 0, 0));
        txtNombreInsumo.addActionListener(this::txtNombreInsumoActionPerformed);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel3.add(txtNombreInsumo, gridBagConstraints);

        txtIdLote.setBackground(new java.awt.Color(248, 250, 255));
        txtIdLote.setForeground(new java.awt.Color(0, 0, 0));
        txtIdLote.addActionListener(this::txtIdLoteActionPerformed);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel3.add(txtIdLote, gridBagConstraints);

        txtDescripcionUso.setBackground(new java.awt.Color(248, 250, 255));
        txtDescripcionUso.setForeground(new java.awt.Color(0, 0, 0));
        txtDescripcionUso.addActionListener(this::txtDescripcionUsoActionPerformed);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 1);
        jPanel3.add(txtDescripcionUso, gridBagConstraints);

        txtTipoAyuda.setBackground(new java.awt.Color(248, 250, 255));
        txtTipoAyuda.setForeground(new java.awt.Color(0, 0, 0));
        txtTipoAyuda.addActionListener(this::txtTipoAyudaActionPerformed);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel3.add(txtTipoAyuda, gridBagConstraints);

        txtPesoKg.setBackground(new java.awt.Color(248, 250, 255));
        txtPesoKg.setForeground(new java.awt.Color(0, 0, 0));
        txtPesoKg.addActionListener(this::txtPesoKgActionPerformed);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 18;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel3.add(txtPesoKg, gridBagConstraints);

        txtListoParaEnvio.setBackground(new java.awt.Color(248, 250, 255));
        txtListoParaEnvio.setForeground(new java.awt.Color(0, 0, 0));
        txtListoParaEnvio.addActionListener(this::txtListoParaEnvioActionPerformed);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel3.add(txtListoParaEnvio, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 255));
        jLabel3.setText("ID Lote:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel3.add(jLabel3, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 255));
        jLabel4.setText("Nombre Insumo:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel3.add(jLabel4, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 255));
        jLabel5.setText("Descripcion:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel3.add(jLabel5, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 255));
        jLabel6.setText("Tipo de ayuda:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel3.add(jLabel6, gridBagConstraints);

        jLabel7.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 255));
        jLabel7.setText("Peso (Kg):");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel3.add(jLabel7, gridBagConstraints);

        jLabel8.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 255));
        jLabel8.setText("Listo para envio:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel3.add(jLabel8, gridBagConstraints);

        btnMostrarFichaLote.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        btnMostrarFichaLote.setForeground(new java.awt.Color(102, 102, 102));
        btnMostrarFichaLote.setText("MOSTRAR REGISTRO");
        btnMostrarFichaLote.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.ipadx = 12;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel3.add(btnMostrarFichaLote, gridBagConstraints);

        btnRegistrarLote.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        btnRegistrarLote.setForeground(new java.awt.Color(102, 102, 102));
        btnRegistrarLote.setText("REGISTRAR");
        btnRegistrarLote.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRegistrarLote.addActionListener(this::btnRegistrarLoteActionPerformed);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 12;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel3.add(btnRegistrarLote, gridBagConstraints);

        jLabel9.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 255));
        jLabel9.setText("Inventario General:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 9;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel3.add(jLabel9, gridBagConstraints);

        jLabel10.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 255));
        jLabel10.setText("Cantidad de lotes esta jornada:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel3.add(jLabel10, gridBagConstraints);

        txtCantidadLotes.setBackground(new java.awt.Color(248, 250, 255));
        txtCantidadLotes.setForeground(new java.awt.Color(0, 0, 0));
        txtCantidadLotes.addActionListener(this::txtCantidadLotesActionPerformed);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel3.add(txtCantidadLotes, gridBagConstraints);

        btnAceptar.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(102, 102, 102));
        btnAceptar.setText("ACEPTAR");
        btnAceptar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAceptar.addActionListener(this::btnAceptarActionPerformed);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.ipadx = 18;
        gridBagConstraints.ipady = 18;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel3.add(btnAceptar, gridBagConstraints);

        jLabel11.setText("ㅤㅤ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        jPanel3.add(jLabel11, gridBagConstraints);

        jLabel12.setText("ㅤㅤ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jPanel3.add(jLabel12, gridBagConstraints);

        jLabel13.setText("ㅤㅤ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 15;
        jPanel3.add(jLabel13, gridBagConstraints);

        jLabel14.setText("ㅤㅤ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 15;
        jPanel3.add(jLabel14, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 0);
        jPanel1.add(jPanel3, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1365, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 969, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreInsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreInsumoActionPerformed
        txtDescripcionUso.requestFocusInWindow();
    }//GEN-LAST:event_txtNombreInsumoActionPerformed

    private void txtIdLoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdLoteActionPerformed
        txtNombreInsumo.requestFocusInWindow();
    }//GEN-LAST:event_txtIdLoteActionPerformed

    private void txtDescripcionUsoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescripcionUsoActionPerformed
        txtTipoAyuda.requestFocusInWindow();
    }//GEN-LAST:event_txtDescripcionUsoActionPerformed

    private void txtTipoAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoAyudaActionPerformed
        txtPesoKg.requestFocusInWindow();
    }//GEN-LAST:event_txtTipoAyudaActionPerformed

    private void txtPesoKgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesoKgActionPerformed
        txtListoParaEnvio.requestFocusInWindow();
    }//GEN-LAST:event_txtPesoKgActionPerformed

    private void txtListoParaEnvioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtListoParaEnvioActionPerformed
        btnRegistrarLote.requestFocusInWindow();
    }//GEN-LAST:event_txtListoParaEnvioActionPerformed

    private void btnRegistrarLoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarLoteActionPerformed
        btnMostrarFichaLote.requestFocusInWindow();
    }//GEN-LAST:event_btnRegistrarLoteActionPerformed

    private void txtCantidadLotesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadLotesActionPerformed
        btnAceptar.requestFocusInWindow();
    }//GEN-LAST:event_txtCantidadLotesActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        txtIdLote.requestFocusInWindow();
    }//GEN-LAST:event_btnAceptarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAceptar;
    public javax.swing.JButton btnMostrarFichaLote;
    public javax.swing.JButton btnRegistrarLote;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tablaReporte;
    public javax.swing.JTextField txtCantidadLotes;
    public javax.swing.JTextField txtDescripcionUso;
    public javax.swing.JTextField txtIdLote;
    public javax.swing.JTextField txtListoParaEnvio;
    public javax.swing.JTextField txtNombreInsumo;
    public javax.swing.JTextField txtPesoKg;
    public javax.swing.JTextField txtTipoAyuda;
    // End of variables declaration//GEN-END:variables

    public javax.swing.JButton getBtnAceptar() {
        return btnAceptar;
    }

    public void setBtnAceptar(javax.swing.JButton btnAceptar) {
        this.btnAceptar = btnAceptar;
    }

    public javax.swing.JButton getBtnMostrarFichaLote() {
        return btnMostrarFichaLote;
    }

    public void setBtnMostrarFichaLote(javax.swing.JButton btnMostrarFichaLote) {
        this.btnMostrarFichaLote = btnMostrarFichaLote;
    }

    public javax.swing.JButton getBtnRegistrarLote() {
        return btnRegistrarLote;
    }

    public void setBtnRegistrarLote(javax.swing.JButton btnRegistrarLote) {
        this.btnRegistrarLote = btnRegistrarLote;
    }

    public javax.swing.JTable getTablaReporte() {
        return tablaReporte;
    }

    public void setTablaReporte(javax.swing.JTable tablaReporte) {
        this.tablaReporte = tablaReporte;
    }

    public javax.swing.JTextField getTxtCantidadLotes() {
        return txtCantidadLotes;
    }

    public void setTxtCantidadLotes(javax.swing.JTextField txtCantidadLotes) {
        this.txtCantidadLotes = txtCantidadLotes;
    }

    public javax.swing.JTextField getTxtDescripcionUso() {
        return txtDescripcionUso;
    }

    public void setTxtDescripcionUso(javax.swing.JTextField txtDescripcionUso) {
        this.txtDescripcionUso = txtDescripcionUso;
    }

    public javax.swing.JTextField getTxtIdLote() {
        return txtIdLote;
    }

    public void setTxtIdLote(javax.swing.JTextField txtIdLote) {
        this.txtIdLote = txtIdLote;
    }

    public javax.swing.JTextField getTxtListoParaEnvio() {
        return txtListoParaEnvio;
    }

    public void setTxtListoParaEnvio(javax.swing.JTextField txtListoParaEnvio) {
        this.txtListoParaEnvio = txtListoParaEnvio;
    }

    public javax.swing.JTextField getTxtNombreInsumo() {
        return txtNombreInsumo;
    }

    public void setTxtNombreInsumo(javax.swing.JTextField txtNombreInsumo) {
        this.txtNombreInsumo = txtNombreInsumo;
    }

    public javax.swing.JTextField getTxtPesoKg() {
        return txtPesoKg;
    }

    public void setTxtPesoKg(javax.swing.JTextField txtPesoKg) {
        this.txtPesoKg = txtPesoKg;
    }

    public javax.swing.JTextField getTxtTipoAyuda() {
        return txtTipoAyuda;
    }

    public void setTxtTipoAyuda(javax.swing.JTextField txtTipoAyuda) {
        this.txtTipoAyuda = txtTipoAyuda;
    }

}
