/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pkgfinal.project;

/**
 *
 * @author Federico
 */

import static pkgfinal.project.FinalProject.*;
import java.io.FileWriter;
import java.io.IOException;

public class GUIHomeJFrame extends javax.swing.JFrame {

    /**
     * Creates new form GUIJFrame
     */
    public GUIHomeJFrame() {
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

        titleLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        amountDueNumLabel = new javax.swing.JLabel();
        addItemLabel = new javax.swing.JLabel();
        addItemComboBox = new javax.swing.JComboBox<>();
        selectButton = new javax.swing.JButton();
        checkOutButton = new javax.swing.JButton();
        nameTextField = new javax.swing.JTextField();
        amountDueLabel = new javax.swing.JLabel();
        mDiscountCheckBox = new javax.swing.JCheckBox();
        mDiscountLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(13, 94, 175));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        titleLabel.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        titleLabel.setText("Giannis's Gyros");

        nameLabel.setFont(new java.awt.Font("Noto Mono", 0, 14)); // NOI18N
        nameLabel.setText("Name:");

        amountDueNumLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        amountDueNumLabel.setText("$0.00");

        addItemLabel.setFont(new java.awt.Font("Noto Mono", 0, 14)); // NOI18N
        addItemLabel.setText("Add Item:");

        addItemComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Drink","Gyro" }));
        addItemComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addItemComboBoxActionPerformed(evt);
            }
        });

        selectButton.setText("Select");
        selectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectButtonActionPerformed(evt);
            }
        });

        checkOutButton.setText("Check Out");
        checkOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkOutButtonActionPerformed(evt);
            }
        });

        nameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextFieldActionPerformed(evt);
            }
        });

        amountDueLabel.setFont(new java.awt.Font("Noto Mono", 0, 14)); // NOI18N
        amountDueLabel.setText("Amount due:");

        mDiscountCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mDiscountCheckBoxActionPerformed(evt);
            }
        });

        mDiscountLabel.setFont(new java.awt.Font("Noto Mono", 0, 14)); // NOI18N
        mDiscountLabel.setText("Military Discount:");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/project/1280px-Flag_of_Greece.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkOutButton)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nameLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(titleLabel)
                            .addComponent(selectButton)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addItemLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(addItemComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(amountDueLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(amountDueNumLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(mDiscountLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(mDiscountCheckBox))))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(mDiscountLabel)
                            .addComponent(mDiscountCheckBox))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addItemComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addItemLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(selectButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(amountDueLabel)
                            .addComponent(amountDueNumLabel)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(checkOutButton)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectButtonActionPerformed
        if (addItemComboBox.getSelectedItem().toString().equals("Drink")){
            FinalProject.drinkFrame.setVisible(true);
        }else{
            FinalProject.gyroFrame.setVisible(true);
        }
        
    }//GEN-LAST:event_selectButtonActionPerformed

    private void addItemComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addItemComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addItemComboBoxActionPerformed

    private void nameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextFieldActionPerformed

    private void mDiscountCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mDiscountCheckBoxActionPerformed
        order.militaryDiscount = mDiscountCheckBox.isSelected();
        order.calcCost();
        amountDueNumLabel.setText(String.format("$%.2f", order.total));
    }//GEN-LAST:event_mDiscountCheckBoxActionPerformed

    private void checkOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkOutButtonActionPerformed
    order.name = nameTextField.getText();
    order.calcCost();
    checkOutListModel = new javax.swing.DefaultListModel<>();
    try{
    FileWriter fw = new FileWriter(order.name+"OrderData.txt");
    
    fw.write("Giannis's Gyros\n");
    checkOutListModel.addElement("Giannis's Gyros\n");
    fw.write(String.format("Order name: %s\n", order.name));
    checkOutListModel.addElement(String.format("Order name: %s\n", order.name));
    for (Item i : order.items.keySet()) {
      fw.write(String.format("%s  :%d  $%.2f\n\n", i,order.items.get(i), i.price));
     for(String j: String.format("%s  :%d  $%.2f\n\n", i,order.items.get(i), i.price).split("\n")){
          checkOutListModel.addElement(j+"\n");
     }
	}
    fw.write(String.format("Number of items: %d\n", order.numItems));
    checkOutListModel.addElement(String.format("Number of items: %d\n", order.numItems));
    fw.write(String.format("10 Percent Military Discount: %b\n",order.militaryDiscount));
    checkOutListModel.addElement(String.format("10 Percent Military Discount: %b\n",order.militaryDiscount));
    fw.write(String.format("Subtotal: %.2f\n", order.total));
    checkOutListModel.addElement(String.format("Subtotal: %.2f\n", order.total));
    fw.write(String.format("FL 7 Percent Sales Tax: $%.2f\n", order.total * 0.07));
    checkOutListModel.addElement(String.format("FL 7 Percent Sales Tax: $%.2f\n", order.total * 0.07));
    fw.write(String.format("Total: $%.2f\n", order.total * 1.07));
    checkOutListModel.addElement(String.format("Total: $%.2f\n", order.total * 1.07));

    fw.close();
    
    this.setVisible(false);
    receiptFrame.setList(checkOutListModel);
    receiptFrame.setVisible(true);
    }catch(IOException e){
        e.printStackTrace();
        
    }
    
    }//GEN-LAST:event_checkOutButtonActionPerformed

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
            java.util.logging.Logger.getLogger(GUIHomeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIHomeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIHomeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIHomeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIHomeJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> addItemComboBox;
    private javax.swing.JLabel addItemLabel;
    private javax.swing.JLabel amountDueLabel;
    public static javax.swing.JLabel amountDueNumLabel;
    private javax.swing.JButton checkOutButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JCheckBox mDiscountCheckBox;
    private javax.swing.JLabel mDiscountLabel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JButton selectButton;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
    private javax.swing.DefaultListModel<String> checkOutListModel;
}