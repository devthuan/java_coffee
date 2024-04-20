
package com.project.DAO;
import com.project.BUS.*;
import com.project.DTO.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
public class AddWareHouse extends javax.swing.JFrame {
    WareHouseService wareHouseService;
    UserService userService;
    SupplierService supplierService;
    ReceiptService receiptService;
    DetailReceiptService detailReceiptService;
    public AddWareHouse() {
        initComponents();
        wareHouseService = new WareHouseService();    
        userService = new UserService();
        supplierService = new SupplierService();
        receiptService = new ReceiptService();
        detailReceiptService = new DetailReceiptService();
        DisplayName();
        DisplayAccount();
        DisplaySupplier();
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
    private void DisplaySupplier()
    {
        try {
            List<Supplier> suppliers = supplierService.getAllSupplier();
            for(Supplier supplier : suppliers)
            {
                jcbbSupplier.addItem(supplier.getName());
            }
        } catch (Exception ex) {
            Logger.getLogger(AddWareHouse.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jcbbIngredient = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jtfQuantity = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jcbbStaff = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jtfUnit = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jcbbSupplier = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jtfPrice = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtfReceipt = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nhập kho", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semibold", 1, 24))); // NOI18N

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

        jButton1.setFont(new java.awt.Font("Segoe UI Semilight", 1, 24)); // NOI18N
        jButton1.setText("Nhập");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Microsoft Sans Serif", 2, 18)); // NOI18N
        jLabel4.setText("Nhà cung cấp");

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

        jcbbSupplier.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        jLabel7.setText("Giá");
        jLabel7.setToolTipText("");

        jtfPrice.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Microsoft Sans Serif", 2, 18)); // NOI18N
        jLabel8.setText("Tên phiếu nhập");

        jtfReceipt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(53, 53, 53)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcbbSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcbbStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(29, 29, 29)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jtfQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(62, 62, 62)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                                        .addComponent(jtfUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jcbbIngredient, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(39, 39, 39))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(37, 37, 37)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jtfReceipt, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                                    .addComponent(jtfPrice)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(63, 63, 63))))
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbbSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbbStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfReceipt, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        WareHouse warehouse = new WareHouse();
        User user = new User();
        Supplier supplier = new Supplier();
        Receipt receipt = new Receipt();
        DetailReceipt detailReceipt = new DetailReceipt();
        try {
             warehouse = wareHouseService.getNameWareHouse((String) jcbbIngredient.getSelectedItem());
             int idWareHouse = warehouse.getId();
             int quantityCurrent = warehouse.getQuantity();
             int quantityImport = Integer.parseInt(jtfQuantity.getText());
            int quantityNew = quantityCurrent + quantityImport;
            warehouse.setQuantity(quantityNew);
            warehouse.setName(String.valueOf(jcbbIngredient.getSelectedItem()));        
            wareHouseService.updateWareHouse(warehouse);   
            
            
            receipt.setName(jtfReceipt.getText());
            user = userService.getNameUser((String) jcbbStaff.getSelectedItem());
            int idAccount = user.getAccountId();
            receipt.setIdAccount(idAccount);
            supplier = supplierService.getNameSupplier((String) jcbbSupplier.getSelectedItem());
            int idSupplier = supplier.getId();
            receipt.setIdSupplier(idSupplier);
            receiptService.AddReceipt(receipt);
            
            List<Receipt> receipts = receiptService.getAllReceipt();
            Receipt lastReceipt = receipts.get(receipts.size() - 1);
            int lastReceiptId = lastReceipt.getId();
            
            detailReceipt.setIdReceipt(lastReceiptId);
            detailReceipt.setIdIngredient(idWareHouse);
            detailReceipt.setQuantity(quantityImport);
            detailReceipt.setUnit(jtfUnit.getText());
            detailReceipt.setPrice(Float.parseFloat(jtfPrice.getText()));
            detailReceiptService.addDetailReceipt(detailReceipt);
        } catch (Exception ex) {
            Logger.getLogger(AddWareHouse.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jcbbIngredientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbbIngredientActionPerformed
        
    }//GEN-LAST:event_jcbbIngredientActionPerformed

    private void jtfUnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfUnitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfUnitActionPerformed

    private void jcbbStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbbStaffActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbbStaffActionPerformed

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
            java.util.logging.Logger.getLogger(AddWareHouse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddWareHouse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddWareHouse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddWareHouse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddWareHouse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> jcbbIngredient;
    private javax.swing.JComboBox<String> jcbbStaff;
    private javax.swing.JComboBox<String> jcbbSupplier;
    private javax.swing.JTextField jtfPrice;
    private javax.swing.JTextField jtfQuantity;
    private javax.swing.JTextField jtfReceipt;
    private javax.swing.JTextField jtfUnit;
    // End of variables declaration//GEN-END:variables
}
