/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package juegosdeportivos;

/**
 *
 * @author jhoel_000
 */
public class FrmMenuPrincipal extends javax.swing.JFrame {


    public FrmMenuPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMenu = new javax.swing.JLabel();
        btnCrearEvento = new javax.swing.JButton();
        btnInsertarEntrenador = new javax.swing.JButton();
        btnInsertarAlojamiento = new javax.swing.JButton();
        btnCompetidores = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblMenu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblMenu.setText("Menu");

        btnCrearEvento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCrearEvento.setText("Eventos");
        btnCrearEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearEventoActionPerformed(evt);
            }
        });

        btnInsertarEntrenador.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnInsertarEntrenador.setText("Registrar Entrenador");
        btnInsertarEntrenador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarEntrenadorActionPerformed(evt);
            }
        });

        btnInsertarAlojamiento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnInsertarAlojamiento.setText("Registrar Alojamiento");
        btnInsertarAlojamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarAlojamientoActionPerformed(evt);
            }
        });

        btnCompetidores.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCompetidores.setText("Competidores");
        btnCompetidores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompetidoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMenu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCrearEvento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCompetidores, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnInsertarAlojamiento)
                    .addComponent(btnInsertarEntrenador))
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnInsertarEntrenador, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(btnCrearEvento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsertarAlojamiento, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(btnCompetidores, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                .addGap(130, 130, 130))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertarEntrenadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarEntrenadorActionPerformed
        FrmInsertarEntrenador frm = new FrmInsertarEntrenador();
        frm.setVisible(true);
    }//GEN-LAST:event_btnInsertarEntrenadorActionPerformed

    private void btnCrearEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearEventoActionPerformed
        FrmMenuEvento frm = new FrmMenuEvento();
        frm.setVisible(true);
    }//GEN-LAST:event_btnCrearEventoActionPerformed

    private void btnInsertarAlojamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarAlojamientoActionPerformed
        FrmInsertarAlojamiento frm = new FrmInsertarAlojamiento();
        frm.setVisible(true);
    }//GEN-LAST:event_btnInsertarAlojamientoActionPerformed

    private void btnCompetidoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompetidoresActionPerformed
        FrmMenuCompetidor frm = new FrmMenuCompetidor();
        frm.setVisible(true);
    }//GEN-LAST:event_btnCompetidoresActionPerformed

  
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
            java.util.logging.Logger.getLogger(FrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenuPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCompetidores;
    private javax.swing.JButton btnCrearEvento;
    private javax.swing.JButton btnInsertarAlojamiento;
    private javax.swing.JButton btnInsertarEntrenador;
    private javax.swing.JLabel lblMenu;
    // End of variables declaration//GEN-END:variables
}
