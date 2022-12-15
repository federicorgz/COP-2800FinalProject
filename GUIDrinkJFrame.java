package pkgfinal.project;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Federico
 */
import static pkgfinal.project.FinalProject.order;
import javax.swing.*;
public class GUIDrinkJFrame extends javax.swing.JFrame {

    /**
     * Creates new form GUIDrinkJFrame
     */
    public GUIDrinkJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        drinkTitleLabel = new javax.swing.JLabel();
        drinkComboBox = new javax.swing.JComboBox<>();
        drinkAmountLabel = new javax.swing.JLabel();
        drinkAmountSpinner = new javax.swing.JSpinner(new SpinnerNumberModel(1,1,20,1));
        drinkAddButton = new javax.swing.JButton();
        drinkPriceLabel = new javax.swing.JLabel();

        drinkTitleLabel.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        drinkTitleLabel.setText("Drink");

        drinkComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(Drink.drinkNames ));
        drinkComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drinkComboBoxActionPerformed(evt);
            }
        });

        drinkAmountLabel.setFont(new java.awt.Font("Noto Mono", 0, 14)); // NOI18N
        drinkAmountLabel.setText("Amount:");

        drinkAmountSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                drinkAmountSpinnerStateChanged(evt);
            }
        });

        drinkAddButton.setText("Add");
        drinkAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drinkAddButtonActionPerformed(evt);
            }
        });

        drinkPriceLabel.setFont(new java.awt.Font("Noto Mono", 0, 14)); // NOI18N
        drinkPriceLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        drinkPriceLabel.setText("$2.80");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(drinkAddButton)
                    .addComponent(drinkTitleLabel)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(drinkAmountLabel)
                            .addGap(30, 30, 30)
                            .addComponent(drinkAmountSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(drinkComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(drinkPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(drinkTitleLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(drinkComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(drinkPriceLabel))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(drinkAmountSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(drinkAmountLabel))
                .addGap(16, 16, 16)
                .addComponent(drinkAddButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    String drinkName = "";
    private void drinkComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drinkComboBoxActionPerformed
        drinkPriceLabel.setText(String.format("$%.2f",Drink.drinks.get(drinkComboBox.getSelectedItem().toString())*((Integer)drinkAmountSpinner.getValue() )));
    }//GEN-LAST:event_drinkComboBoxActionPerformed

    private void drinkAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drinkAddButtonActionPerformed
        drinkName = drinkComboBox.getSelectedItem().toString();
        order.addItems(new Drink(drinkName),(Integer) drinkAmountSpinner.getValue());
        this.setVisible(false);
        order.calcCost();
        GUIHomeJFrame.amountDueNumLabel.setText(String.format("$%.2f", order.total));
        drinkComboBox.setSelectedIndex(0);
        drinkAmountSpinner.setValue(1);
        drinkPriceLabel.setText("$2.80");
    }//GEN-LAST:event_drinkAddButtonActionPerformed

    private void drinkAmountSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_drinkAmountSpinnerStateChanged
         drinkPriceLabel.setText(String.format("$%.2f",Drink.drinks.get(drinkComboBox.getSelectedItem().toString())*((Integer)drinkAmountSpinner.getValue() )));
    }//GEN-LAST:event_drinkAmountSpinnerStateChanged

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
            java.util.logging.Logger.getLogger(GUIDrinkJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIDrinkJFrame.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIDrinkJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIDrinkJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIDrinkJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton drinkAddButton;
    private javax.swing.JLabel drinkAmountLabel;
    private javax.swing.JSpinner drinkAmountSpinner;
    private javax.swing.JComboBox<String> drinkComboBox;
    private javax.swing.JLabel drinkPriceLabel;
    private javax.swing.JLabel drinkTitleLabel;
    // End of variables declaration//GEN-END:variables
}
