/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pkgfinal.project;

/**
 *
 * @author Federico
 */
import java.awt.Color;
import static pkgfinal.project.FinalProject.order;
import static pkgfinal.project.FinalProject.inventory;
import java.util.ArrayList;
import javax.swing.*;
public class GUIGyroJFrame extends javax.swing.JFrame {

    /**
     * Creates new form GUIGyroJFrame
     */
    public GUIGyroJFrame() {
        initComponents();
        checkIngredients();
    }
    private void checkIngredients(){
        if(inventory.getIngredient(0).getAmount()<1){
            gyroRadioButton.setEnabled(false);
            gyroRadioButton.setSelected(false);
            gyroRadioButton.setBackground(Color.red);
        }else{
            gyroRadioButton.setEnabled(true);
            gyroRadioButton.setBackground(Color.white);
        }
        if(inventory.getIngredient(0).getAmount()<2 && gyroRadioButton.isSelected()){
            extraMeatCheckBox.setEnabled(false);
            extraMeatCheckBox.setSelected(false);
            extraMeatCheckBox.setBackground(Color.red);
        }else{
            extraMeatCheckBox.setEnabled(true);
            extraMeatCheckBox.setBackground(Color.white);
        }
        if(inventory.getIngredient(1).getAmount()<2 && chickenRadioButton.isSelected()){
            extraMeatCheckBox.setEnabled(false);
            extraMeatCheckBox.setSelected(false);
            extraMeatCheckBox.setBackground(Color.red);
        }else{
            extraMeatCheckBox.setEnabled(true);
            extraMeatCheckBox.setBackground(Color.white);
        }
        if(inventory.getIngredient(1).getAmount()<1){
            chickenRadioButton.setEnabled(false);
            chickenRadioButton.setSelected(false);
            chickenRadioButton.setBackground(Color.red);
        }else{
            chickenRadioButton.setEnabled(true);
            chickenRadioButton.setBackground(Color.white);
        }
        if(inventory.getIngredient(0).getAmount()<0.5 || inventory.getIngredient(1).getAmount()<0.5){
            mixedRadioButton.setEnabled(false);
            mixedRadioButton.setSelected(false);
            mixedRadioButton.setBackground(Color.red);
        }else{
            mixedRadioButton.setEnabled(true);
            mixedRadioButton.setBackground(Color.white);
        }
        if(inventory.getIngredient(2).getAmount()<1){
            tsatsikiRadioButton.setEnabled(false);
            tsatsikiRadioButton.setSelected(false);
            tsatsikiRadioButton.setBackground(Color.red);
        }else{
            tsatsikiRadioButton.setEnabled(true);
            tsatsikiRadioButton.setBackground(Color.white);
        }
        if(inventory.getIngredient(3).getAmount()<1){
            hummusRadioButton.setEnabled(false);
            hummusRadioButton.setSelected(false);
            hummusRadioButton.setBackground(Color.red);
        }else{
            hummusRadioButton.setEnabled(true);
            hummusRadioButton.setBackground(Color.white);
        }
        if(inventory.getIngredient(4).getAmount()<1){
            lettuceCheckBox.setEnabled(false);
            lettuceCheckBox.setSelected(false);
            lettuceCheckBox.setBackground(Color.red);
        }else{
            lettuceCheckBox.setEnabled(true);
            lettuceCheckBox.setBackground(Color.white);
        }
        if(inventory.getIngredient(5).getAmount()<1){
            tomatoCheckBox.setEnabled(false);
            tomatoCheckBox.setSelected(false);
            tomatoCheckBox.setBackground(Color.red);
        }else{
            tomatoCheckBox.setEnabled(true);
            tomatoCheckBox.setBackground(Color.white);
        }
        if(inventory.getIngredient(6).getAmount()<1){
            cucumberCheckBox.setEnabled(false);
            cucumberCheckBox.setSelected(false);
            cucumberCheckBox.setBackground(Color.red);
        }else{
            cucumberCheckBox.setEnabled(true);
            cucumberCheckBox.setBackground(Color.white);
        }
        if(inventory.getIngredient(7).getAmount()<1){
            onionCheckBox.setEnabled(false);
            onionCheckBox.setSelected(false);
            onionCheckBox.setBackground(Color.red);
        }else{
            onionCheckBox.setEnabled(true);
            onionCheckBox.setBackground(Color.white);
        }
    }
    private int mostGyros(){
        int most = (int)inventory.getIngredient(8).getAmount();
        if(gyroRadioButton.isSelected()){
            most = Math.min(most,(int)inventory.getIngredient(0).getAmount());
        }
        if(chickenRadioButton.isSelected()){
            most = Math.min(most,(int)inventory.getIngredient(1).getAmount());
        }
        if(mixedRadioButton.isSelected()){
            most = Math.min(most,Math.min((int)inventory.getIngredient(0).getAmount(),(int)inventory.getIngredient(0).getAmount()));
        }
        if(tsatsikiRadioButton.isSelected()){
            most = Math.min(most,(int)inventory.getIngredient(2).getAmount());
        }
        if(hummusRadioButton.isSelected()){
            most = Math.min(most,(int)inventory.getIngredient(3).getAmount());
        }
        if(lettuceCheckBox.isSelected()){
            most = Math.min(most,(int)inventory.getIngredient(4).getAmount());
        }
        if(tomatoCheckBox.isSelected()){
            most = Math.min(most,(int)inventory.getIngredient(5).getAmount());
        }
        if(cucumberCheckBox.isSelected()){
            most = Math.min(most,(int)inventory.getIngredient(6).getAmount());
        }
        if(onionCheckBox.isSelected()){
            most = Math.min(most,(int)inventory.getIngredient(7).getAmount());
        }
        
        
        return most;
    }
        
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        meatButtonGroup = new javax.swing.ButtonGroup();
        sauceButtonGroup = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        gyroTitleLabel = new javax.swing.JLabel();
        traditionalLabel = new javax.swing.JLabel();
        traditionalCheckBox = new javax.swing.JCheckBox();
        meatLabel = new javax.swing.JLabel();
        gyroRadioButton = new javax.swing.JRadioButton();
        chickenRadioButton = new javax.swing.JRadioButton();
        mixedRadioButton = new javax.swing.JRadioButton();
        extraMeatLabel = new javax.swing.JLabel();
        extraMeatCheckBox = new javax.swing.JCheckBox();
        sauceLabel = new javax.swing.JLabel();
        tsatsikiRadioButton = new javax.swing.JRadioButton();
        hummusRadioButton = new javax.swing.JRadioButton();
        noSauceRadioButton = new javax.swing.JRadioButton();
        toppingsLabel = new javax.swing.JLabel();
        lettuceCheckBox = new javax.swing.JCheckBox();
        tomatoCheckBox = new javax.swing.JCheckBox();
        cucumberCheckBox = new javax.swing.JCheckBox();
        onionCheckBox = new javax.swing.JCheckBox();
        gyroAmountLabel = new javax.swing.JLabel();
        gyroAmountSpinner = new javax.swing.JSpinner(new SpinnerNumberModel(0,0,mostGyros(),1));
        totalLabel = new javax.swing.JLabel();
        totalNumLabel = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        gyroTitleLabel.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        gyroTitleLabel.setText("Gyro");

        traditionalLabel.setFont(new java.awt.Font("Noto Mono", 0, 14)); // NOI18N
        traditionalLabel.setText("Traditional:");

        traditionalCheckBox.setSelected(true);
        traditionalCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                traditionalCheckBoxActionPerformed(evt);
            }
        });

        meatLabel.setFont(new java.awt.Font("Noto Mono", 0, 14)); // NOI18N
        meatLabel.setText("Meat:");

        meatButtonGroup.add(gyroRadioButton);
        gyroRadioButton.setSelected(true);
        gyroRadioButton.setText("Gyro");
        gyroRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gyroRadioButtonActionPerformed(evt);
            }
        });

        meatButtonGroup.add(chickenRadioButton);
        chickenRadioButton.setText("Chicken");
        chickenRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chickenRadioButtonActionPerformed(evt);
            }
        });

        meatButtonGroup.add(mixedRadioButton);
        mixedRadioButton.setText("Mixed ");
        mixedRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mixedRadioButtonActionPerformed(evt);
            }
        });

        extraMeatLabel.setFont(new java.awt.Font("Noto Mono", 0, 14)); // NOI18N
        extraMeatLabel.setText("Extra Meat:");

        extraMeatCheckBox.setText(" +$2.50");
        extraMeatCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extraMeatCheckBoxActionPerformed(evt);
            }
        });

        sauceLabel.setFont(new java.awt.Font("Noto Mono", 0, 14)); // NOI18N
        sauceLabel.setText("Sauce:");

        sauceButtonGroup.add(tsatsikiRadioButton);
        tsatsikiRadioButton.setSelected(true);
        tsatsikiRadioButton.setText("Tsatsiki");
        tsatsikiRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tsatsikiRadioButtonActionPerformed(evt);
            }
        });

        sauceButtonGroup.add(hummusRadioButton);
        hummusRadioButton.setText("Hummus");
        hummusRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hummusRadioButtonActionPerformed(evt);
            }
        });

        sauceButtonGroup.add(noSauceRadioButton);
        noSauceRadioButton.setText("No Sauce");
        noSauceRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noSauceRadioButtonActionPerformed(evt);
            }
        });

        toppingsLabel.setFont(new java.awt.Font("Noto Mono", 0, 14)); // NOI18N
        toppingsLabel.setText("Toppings:");

        lettuceCheckBox.setSelected(true);
        lettuceCheckBox.setText("Lettuce");
        lettuceCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lettuceCheckBoxActionPerformed(evt);
            }
        });

        tomatoCheckBox.setSelected(true);
        tomatoCheckBox.setText("Tomato");
        tomatoCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tomatoCheckBoxActionPerformed(evt);
            }
        });

        cucumberCheckBox.setSelected(true);
        cucumberCheckBox.setText("Cucumber");
        cucumberCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cucumberCheckBoxActionPerformed(evt);
            }
        });

        onionCheckBox.setSelected(true);
        onionCheckBox.setText("Onion");
        onionCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onionCheckBoxActionPerformed(evt);
            }
        });

        gyroAmountLabel.setFont(new java.awt.Font("Noto Mono", 0, 14)); // NOI18N
        gyroAmountLabel.setText("Amount:");

        gyroAmountSpinner.setToolTipText("");
        gyroAmountSpinner.setMinimumSize(new java.awt.Dimension(72, 22));
        gyroAmountSpinner.setRequestFocusEnabled(false);
        gyroAmountSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                gyroAmountSpinnerStateChanged(evt);
            }
        });

        totalLabel.setFont(new java.awt.Font("Noto Mono", 0, 14)); // NOI18N
        totalLabel.setText("Total:");

        totalNumLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        totalNumLabel.setText("$12.50");

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("+$2.50");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(lettuceCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(tomatoCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cucumberCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(gyroAmountLabel)
                                            .addComponent(totalLabel))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(onionCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(19, 19, 19)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(totalNumLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(gyroAmountSpinner, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE))))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(traditionalLabel)
                                        .addGap(5, 5, 5)
                                        .addComponent(traditionalCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(gyroTitleLabel)
                                    .addComponent(meatLabel)
                                    .addComponent(sauceLabel)
                                    .addComponent(toppingsLabel)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(extraMeatLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(extraMeatCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(gyroRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(chickenRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(mixedRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(1, 1, 1)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 3, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(addButton)
                                .addGap(270, 270, 270))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(tsatsikiRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hummusRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(noSauceRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gyroTitleLabel)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(traditionalCheckBox)
                    .addComponent(traditionalLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(meatLabel)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gyroRadioButton)
                    .addComponent(chickenRadioButton)
                    .addComponent(mixedRadioButton)
                    .addComponent(jLabel1))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(extraMeatLabel)
                    .addComponent(extraMeatCheckBox))
                .addGap(12, 12, 12)
                .addComponent(sauceLabel)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tsatsikiRadioButton)
                    .addComponent(hummusRadioButton)
                    .addComponent(noSauceRadioButton))
                .addGap(12, 12, 12)
                .addComponent(toppingsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lettuceCheckBox)
                    .addComponent(tomatoCheckBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cucumberCheckBox)
                    .addComponent(onionCheckBox))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gyroAmountSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gyroAmountLabel))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalLabel)
                    .addComponent(totalNumLabel))
                .addGap(12, 12, 12)
                .addComponent(addButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    boolean extraMeat;
    String meats="", sauce="";
    ArrayList<String> toppings = new ArrayList<>();
    double total = 12.50;
    
    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
            meats = GroupButtonUtils.getSelectedButtonText(meatButtonGroup);
            sauce = GroupButtonUtils.getSelectedButtonText(sauceButtonGroup);
            extraMeat = extraMeatCheckBox.isSelected();
            if(lettuceCheckBox.isSelected()) toppings.add("Lettuce");
            if(tomatoCheckBox.isSelected()) toppings.add("tomato");
            if(cucumberCheckBox.isSelected()) toppings.add("cucumber");
            if(onionCheckBox.isSelected()) toppings.add("onion");
            order.addItems(new Gyro(meats, extraMeat, sauce, new ArrayList<>(toppings)),(Integer) gyroAmountSpinner.getValue());
            this.setVisible(false);
            order.calcCost();
            GUIHomeJFrame.amountDueNumLabel.setText(String.format("$%.2f", order.total));
            traditionalCheckBox.setSelected(true);
            gyroRadioButton.setSelected(true);    
            tsatsikiRadioButton.setSelected(true);
            extraMeatCheckBox.setSelected(false);
            lettuceCheckBox.setSelected(true);
            tomatoCheckBox.setSelected(true);
            cucumberCheckBox.setSelected(true);
            onionCheckBox.setSelected(true);
            checkIngredients();
    }//GEN-LAST:event_addButtonActionPerformed

    private void gyroRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gyroRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gyroRadioButtonActionPerformed

    private void tsatsikiRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tsatsikiRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tsatsikiRadioButtonActionPerformed

    private void traditionalCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_traditionalCheckBoxActionPerformed
    if (traditionalCheckBox.isSelected()){
    gyroRadioButton.setSelected(true);    
    tsatsikiRadioButton.setSelected(true);
    extraMeatCheckBox.setSelected(false);
    lettuceCheckBox.setSelected(true);
    tomatoCheckBox.setSelected(true);
    cucumberCheckBox.setSelected(true);
    onionCheckBox.setSelected(true);
    }
    }//GEN-LAST:event_traditionalCheckBoxActionPerformed

    private void chickenRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chickenRadioButtonActionPerformed
        if(chickenRadioButton.isSelected()) traditionalCheckBox.setSelected(false);
    }//GEN-LAST:event_chickenRadioButtonActionPerformed

    private void mixedRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mixedRadioButtonActionPerformed
        if(mixedRadioButton.isSelected()){ 
        traditionalCheckBox.setSelected(false);
        total+=2.5;
        }else{
        total-=2.5;
        }
        totalNumLabel.setText(String.format("$%.2f", total*((Integer)gyroAmountSpinner.getValue() )));
    }//GEN-LAST:event_mixedRadioButtonActionPerformed

    private void extraMeatCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_extraMeatCheckBoxActionPerformed
        if(extraMeatCheckBox.isSelected()) { 
        traditionalCheckBox.setSelected(false);
        total+=2.5;
        }else{
        total-=2.5;
        }
        totalNumLabel.setText(String.format("$%.2f", total*((Integer)gyroAmountSpinner.getValue() )));
    }//GEN-LAST:event_extraMeatCheckBoxActionPerformed

    private void hummusRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hummusRadioButtonActionPerformed
        if(hummusRadioButton.isSelected()) traditionalCheckBox.setSelected(false);
    }//GEN-LAST:event_hummusRadioButtonActionPerformed

    private void noSauceRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noSauceRadioButtonActionPerformed
        if(noSauceRadioButton.isSelected()) traditionalCheckBox.setSelected(false);
    }//GEN-LAST:event_noSauceRadioButtonActionPerformed

    private void lettuceCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lettuceCheckBoxActionPerformed
    if(!lettuceCheckBox.isSelected()) traditionalCheckBox.setSelected(false);
    }//GEN-LAST:event_lettuceCheckBoxActionPerformed

    private void tomatoCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tomatoCheckBoxActionPerformed
        if(!tomatoCheckBox.isSelected()) traditionalCheckBox.setSelected(false);
    }//GEN-LAST:event_tomatoCheckBoxActionPerformed

    private void cucumberCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cucumberCheckBoxActionPerformed
        if(!cucumberCheckBox.isSelected()) traditionalCheckBox.setSelected(false);
    }//GEN-LAST:event_cucumberCheckBoxActionPerformed

    private void onionCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onionCheckBoxActionPerformed
        if(!onionCheckBox.isSelected()) traditionalCheckBox.setSelected(false);
    }//GEN-LAST:event_onionCheckBoxActionPerformed

    private void gyroAmountSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_gyroAmountSpinnerStateChanged
         totalNumLabel.setText(String.format("$%.2f", total*((Integer)gyroAmountSpinner.getValue() )));
    }//GEN-LAST:event_gyroAmountSpinnerStateChanged

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        int x =(Integer) gyroAmountSpinner.getValue();
        gyroAmountSpinner.setModel(new SpinnerNumberModel(x ,0,mostGyros(),1));
        checkIngredients();
    }//GEN-LAST:event_formMouseClicked

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
       
    }//GEN-LAST:event_formMouseMoved
    
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
            java.util.logging.Logger.getLogger(GUIGyroJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIGyroJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIGyroJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIGyroJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIGyroJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JRadioButton chickenRadioButton;
    private javax.swing.JCheckBox cucumberCheckBox;
    private javax.swing.JCheckBox extraMeatCheckBox;
    private javax.swing.JLabel extraMeatLabel;
    private javax.swing.JLabel gyroAmountLabel;
    private javax.swing.JSpinner gyroAmountSpinner;
    private javax.swing.JRadioButton gyroRadioButton;
    private javax.swing.JLabel gyroTitleLabel;
    private javax.swing.JRadioButton hummusRadioButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JCheckBox lettuceCheckBox;
    private javax.swing.ButtonGroup meatButtonGroup;
    private javax.swing.JLabel meatLabel;
    private javax.swing.JRadioButton mixedRadioButton;
    private javax.swing.JRadioButton noSauceRadioButton;
    private javax.swing.JCheckBox onionCheckBox;
    private javax.swing.ButtonGroup sauceButtonGroup;
    private javax.swing.JLabel sauceLabel;
    private javax.swing.JCheckBox tomatoCheckBox;
    private javax.swing.JLabel toppingsLabel;
    private javax.swing.JLabel totalLabel;
    private javax.swing.JLabel totalNumLabel;
    private javax.swing.JCheckBox traditionalCheckBox;
    private javax.swing.JLabel traditionalLabel;
    private javax.swing.JRadioButton tsatsikiRadioButton;
    // End of variables declaration//GEN-END:variables
}
