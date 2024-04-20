
package com.project.DAO;
import com.project.BUS.*;
import com.project.DTO.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Outbound extends javax.swing.JFrame {
    WareHouseService wareHouseService;
    UserService userService;
    SupplierService supplierService;
    DeliveryNoteService deliveryNoteService;
    DetailDeliveryNoteService detailDeliveryNoteService;
    public Outbound() {
        initComponents();
        wareHouseService = new WareHouseService();    
        userService = new UserService();
        supplierService = new SupplierService();
        deliveryNoteService = new DeliveryNoteService();
        detailDeliveryNoteService = new DetailDeliveryNoteService();
        DisplayName();
        DisplayAccount();
    }
    private void DisplayName() 
    {
        try {
            List<WareHouse> warehouses = wareHouseService.getAllWareHouse();
            for(WareHouse warehouse : warehouses)
            {
                jcbbIngredient.addItem(warehouse.getName());
            }
        } catch (Exception ex) {
            Logger.getLogger(AddWareHouse.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void DisplayAccount() 
    {
        try {
            List<User> users = userService.getAllUser();
            for(User user : users)
            {
                jcbbStaff.addItem(user.getName());
            }
        } catch (Exception ex) {
            Logger.getLogger(AddWareHouse.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jcbbIngredient = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jtfQuantity = new javax.swing.JTextField();
        jbOutbound = new javax.swing.JButton();
        jcbbStaff = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jtfUnit = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtfDeliveryNote = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Xuất kho", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semibold", 1, 24))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Microsoft Sans Serif", 2, 18)); // NOI18N
        jLabel2.setText("Tên nguyên liệu");

        jcbbIngredient.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jcbbIngredient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbbIngredientActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Microsoft Sans Serif", 2, 18)); // NOI18N
        jLabel3.setText("Số lượng");

        jtfQuantity.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jbOutbound.setFont(new java.awt.Font("Segoe UI Semilight", 1, 22)); // NOI18N
        jbOutbound.setText("Xuất kho");
        jbOutbound.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbOutbound.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbOutboundActionPerformed(evt);
            }
        });

        jcbbStaff.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jcbbStaff.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        jcbbStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbbStaffActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Microsoft Sans Serif", 2, 18)); // NOI18N
        jLabel5.setText("Đơn vị");

        jtfUnit.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jtfUnit.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfUnit.setText("Kg");
        jtfUnit.setEnabled(false);
        jtfUnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfUnitActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Microsoft Sans Serif", 2, 18)); // NOI18N
        jLabel6.setText("Nhân viên");

        jLabel8.setFont(new java.awt.Font("Microsoft Sans Serif", 2, 18)); // NOI18N
        jLabel8.setText("Tên phiếu xuất");

        jtfDeliveryNote.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jtfDeliveryNote, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jcbbStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jtfQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtfUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jcbbIngredient, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(39, 39, 39))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbOutbound)
                .addGap(191, 191, 191))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbbIngredient, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbbStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfDeliveryNote, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jbOutbound, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbbIngredientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbbIngredientActionPerformed

    }//GEN-LAST:event_jcbbIngredientActionPerformed

    private void jbOutboundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbOutboundActionPerformed
        WareHouse warehouse = new WareHouse();
        User user = new User();
        DeliveryNote deliveryNote = new DeliveryNote();
        DetailDeliveryNote detailDeliveryNote = new DetailDeliveryNote();
        try {
            warehouse = wareHouseService.getNameWareHouse((String) jcbbIngredient.getSelectedItem());
            int idWareHouse = warehouse.getId();
            int quantityCurrent = warehouse.getQuantity();
            int quantityImport = Integer.parseInt(jtfQuantity.getText());
            int quantityNew = quantityCurrent - quantityImport;
            warehouse.setQuantity(quantityNew);
            warehouse.setName(String.valueOf(jcbbIngredient.getSelectedItem()));
            wareHouseService.updateWareHouse(warehouse);

            deliveryNote.setName(jtfDeliveryNote.getText());
            user = userService.getNameUser((String) jcbbStaff.getSelectedItem());
            int idAccount = user.getAccountId();
            
            deliveryNote.setIdAccount(idAccount);
            deliveryNoteService.AddDeliveryNote(deliveryNote);
            
            int lastDeliveryNoteId = 0;
            List<DeliveryNote> deliveryNotes = deliveryNoteService.getAllDeliveryNote();
            if(deliveryNotes.size() <= 1)
            {
                DeliveryNote firstDeliveryNote = deliveryNotes.get(0);
                lastDeliveryNoteId = firstDeliveryNote.getId();
            }
            else 
            {
                DeliveryNote lastDeliveryNote= deliveryNotes.get(deliveryNotes.size() - 1);
                lastDeliveryNoteId = lastDeliveryNote.getId();
            }
            detailDeliveryNote.setIdReceipt(lastDeliveryNoteId);
            detailDeliveryNote.setIdIngredient(idWareHouse);
            detailDeliveryNote.setQuantity(quantityImport);
            detailDeliveryNote.setUnit(jtfUnit.getText());
            detailDeliveryNoteService.addDetailDeliveryNote(detailDeliveryNote);
        } catch (Exception ex) {
            Logger.getLogger(AddWareHouse.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbOutboundActionPerformed

    private void jcbbStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbbStaffActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbbStaffActionPerformed

    private void jtfUnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfUnitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfUnitActionPerformed

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
            java.util.logging.Logger.getLogger(Outbound.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Outbound.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Outbound.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Outbound.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Outbound().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbOutbound;
    private javax.swing.JComboBox<String> jcbbIngredient;
    private javax.swing.JComboBox<String> jcbbStaff;
    private javax.swing.JTextField jtfDeliveryNote;
    private javax.swing.JTextField jtfQuantity;
    private javax.swing.JTextField jtfUnit;
    // End of variables declaration//GEN-END:variables
}
