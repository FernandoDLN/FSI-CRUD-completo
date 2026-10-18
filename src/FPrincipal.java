
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FPrincipal extends javax.swing.JFrame {

    Conexion cnx = new Conexion();

    public FPrincipal() {
        initComponents();
        TQuery.setAutoCreateRowSorter(true);
        TBInfantes.setSelected(true); // <-- Marca el botón de Infantes por defecto

        if (cnx.conectar("127.0.0.1", "kindergarden", "root", "") == 1) {
            cnx.entablar(infante.todos, TQuery);
            JOptionPane.showMessageDialog(this, "CONECTADO CON EXITO");
        } else {
            JOptionPane.showMessageDialog(this, "NO SE ENCONTRO LA BASE DE DAT0S");
            System.exit(0);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jToolBar1 = new javax.swing.JToolBar();
        TBInfantes = new javax.swing.JToggleButton();
        TBeducadores = new javax.swing.JToggleButton();
        TBresponsables = new javax.swing.JToggleButton();
        TBbitacora = new javax.swing.JToggleButton();
        btnNuevo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TQuery = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jToolBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        jToolBar1.setRollover(true);

        buttonGroup1.add(TBInfantes);
        TBInfantes.setText("Infantes");
        TBInfantes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        TBInfantes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        TBInfantes.addActionListener(this::TBInfantesActionPerformed);
        jToolBar1.add(TBInfantes);

        buttonGroup1.add(TBeducadores);
        TBeducadores.setText("educadores");
        TBeducadores.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        TBeducadores.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        TBeducadores.addActionListener(this::TBeducadoresActionPerformed);
        jToolBar1.add(TBeducadores);

        buttonGroup1.add(TBresponsables);
        TBresponsables.setText("responsables");
        TBresponsables.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        TBresponsables.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        TBresponsables.addActionListener(this::TBresponsablesActionPerformed);
        jToolBar1.add(TBresponsables);

        buttonGroup1.add(TBbitacora);
        TBbitacora.setText("Bitacora");
        TBbitacora.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        TBbitacora.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        TBbitacora.addActionListener(this::TBbitacoraActionPerformed);
        jToolBar1.add(TBbitacora);

        btnNuevo.setText("Nuevo");
        btnNuevo.setFocusable(false);
        btnNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNuevo.addActionListener(this::btnNuevoActionPerformed);
        jToolBar1.add(btnNuevo);

        btnEditar.setText("Editar");
        btnEditar.setFocusable(false);
        btnEditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEditar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEditar.addActionListener(this::btnEditarActionPerformed);
        jToolBar1.add(btnEditar);

        TQuery.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TQuery);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TBInfantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBInfantesActionPerformed
        cnx.entablar(infante.todos, TQuery);
    }//GEN-LAST:event_TBInfantesActionPerformed

    private void TBeducadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBeducadoresActionPerformed
        cnx.entablar(educadores.todos, TQuery);
    }//GEN-LAST:event_TBeducadoresActionPerformed

    private void TBresponsablesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBresponsablesActionPerformed
        cnx.entablar(responsables.todos, TQuery);
    }//GEN-LAST:event_TBresponsablesActionPerformed

    private void TBbitacoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBbitacoraActionPerformed
        cnx.entablar(bitacora.todos, TQuery);
    }//GEN-LAST:event_TBbitacoraActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        if (TBInfantes.isSelected()) {
            JDInfantes di = new JDInfantes(this, true);
            di.obtenerConexion(cnx);
            di.setVisible(true);
            cnx.entablar(infante.todos, TQuery);

        } else if (TBeducadores.isSelected()) {
            educador di = new educador(this, true);
            di.obtenerConexion(cnx);
            di.setVisible(true);
            cnx.entablar(educadores.todos, TQuery);
        } else if (TBresponsables.isSelected()) {
            responsable di = new responsable(this, true);
            di.obtenerConexion(cnx);
            di.setVisible(true);
            cnx.entablar(responsables.todos, TQuery);
        } else if (TBbitacora.isSelected()) {
            JDBitacora di = new JDBitacora(this, true);
            di.obtenerConexion(cnx);
            di.setVisible(true);
            cnx.entablar(bitacora.todos, TQuery);
        }
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if (TQuery.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(this, "PRIMERO SELECCIONA UN RENGLON DE LA TABLA PARA EDITAR");
            return;
        }
        if (TBInfantes.isSelected()) {
            JDInfantes di = new JDInfantes(this, true);
            di.obtenerConexion(cnx);
            di.obtenerInfante(crearinfante());
            di.setVisible(true);
            cnx.entablar(infante.todos, TQuery); // <-- Refresca tabla al cerrar
        } else if (TBeducadores.isSelected()) {
            educador di = new educador(this, true);
            di.obtenerConexion(cnx);
            di.obtenereducador(creareducador());
            di.setVisible(true);
            cnx.entablar(educadores.todos, TQuery); // <-- Refresca tabla al cerrar
        } else if (TBresponsables.isSelected()) {
            responsable di = new responsable(this, true);
            di.obtenerConexion(cnx);
            di.obtenerresponsable(crearresponsable());
            di.setVisible(true);
            cnx.entablar(responsables.todos, TQuery); // <-- Refresca tabla al cerrar
        } else if (TBbitacora.isSelected()) {
            JDBitacora di = new JDBitacora(this, true);
            di.obtenerConexion(cnx);
            di.obtenerbitacora(crearbitacora());
            di.setVisible(true);
            cnx.entablar(bitacora.todos, TQuery); // <-- Refresca tabla al cerrar
        }

    }//GEN-LAST:event_btnEditarActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {

        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                FPrincipal dialog = new FPrincipal();
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

    public infante crearinfante() {
        DefaultTableModel modelo = (DefaultTableModel) TQuery.getModel();
        int ren = TQuery.getSelectedRow();
        infante kid = new infante();
        if (ren >= 0) {
            kid.curp = modelo.getValueAt(ren, 0).toString();
            kid.nombre = modelo.getValueAt(ren, 1).toString();
            kid.sexo = modelo.getValueAt(ren, 2).toString();
            kid.fecha = modelo.getValueAt(ren, 3).toString();
            kid.estado = modelo.getValueAt(ren, 4).toString();
        } else {
            JOptionPane.showMessageDialog(this, "Selecciona un renglon de la tabla");
        }
        return kid;
    }

    public responsables crearresponsable() { // Se cambió "infante" por "responsables"
        DefaultTableModel modelo = (DefaultTableModel) TQuery.getModel();
        int ren = TQuery.getSelectedRow();
        responsables res = new responsables();
        if (ren >= 0) {
            res.curpr = modelo.getValueAt(ren, 0).toString();
            res.nombrer = modelo.getValueAt(ren, 1).toString();
            res.sexor = modelo.getValueAt(ren, 2).toString();
            res.telefono = modelo.getValueAt(ren, 3).toString();
            res.parentesco = modelo.getValueAt(ren, 4).toString();
            res.estador = modelo.getValueAt(ren, 5).toString();
        } else {
            JOptionPane.showMessageDialog(this, "Selecciona un renglon de la tabla");
        }
        return res;
    }

    public educadores creareducador() { // Se cambió "infante" por "educadores"
        DefaultTableModel modelo = (DefaultTableModel) TQuery.getModel();
        int ren = TQuery.getSelectedRow();
        educadores edu = new educadores();
        if (ren >= 0) {
            edu.curpe = modelo.getValueAt(ren, 0).toString();
            edu.nombree = modelo.getValueAt(ren, 1).toString();
            edu.sexoe = modelo.getValueAt(ren, 2).toString();
            edu.telefonoe = modelo.getValueAt(ren, 3).toString();
            edu.direccione = modelo.getValueAt(ren, 4).toString();
            edu.estadoe = modelo.getValueAt(ren, 5).toString();
        } else {
            JOptionPane.showMessageDialog(this, "Selecciona un renglon de la tabla");
        }
        return edu;
    }

    public bitacora crearbitacora() { // Se cambió "infante" por "bitacora"
        DefaultTableModel modelo = (DefaultTableModel) TQuery.getModel();
        int ren = TQuery.getSelectedRow();
        bitacora bit = new bitacora();
        if (ren >= 0) {
            bit.folio = modelo.getValueAt(ren, 0).toString();
            bit.tiempo = modelo.getValueAt(ren, 1).toString();
            bit.tipo = modelo.getValueAt(ren, 2).toString();
            bit.observaciones = modelo.getValueAt(ren, 3).toString();
            bit.infante_curp = modelo.getValueAt(ren, 4).toString();
            bit.responsables_curpr = modelo.getValueAt(ren, 5).toString();
            bit.educadores_curp = modelo.getValueAt(ren, 6).toString();
        } else {
            JOptionPane.showMessageDialog(this, "Selecciona un renglon de la tabla");
        }
        return bit;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton TBInfantes;
    private javax.swing.JToggleButton TBbitacora;
    private javax.swing.JToggleButton TBeducadores;
    private javax.swing.JToggleButton TBresponsables;
    private javax.swing.JTable TQuery;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
