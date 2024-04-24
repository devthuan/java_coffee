
package com.project.GUI;
import com.project.BUS.*;
import com.project.DTO.*;
import com.project.DAO.*;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;
public class AddWareHouse extends javax.swing.JFrame {
    WareHouseService wareHouseService;
    UserService userService;
    SupplierService supplierService;
    ReceiptService receiptService;
    DetailReceiptService detailReceiptService;
    DefaultTableModel dtm;
    public AddWareHouse() {
        initComponents();
        dtm = new DefaultTableModel() {
            public boolean isCellEditable(int row, int column) {

                return false;
            }
        };
        jTable1.setModel(dtm);
        dtm.addColumn("Tên nguyên liệu");
        dtm.addColumn("Số lượng");
        dtm.addColumn("Đơn vị");
        dtm.addColumn("Nhân viên");
        dtm.addColumn("Nhà cung cấp");
        dtm.addColumn("Tên phiếu nhập");
        dtm.addColumn("Đơn giá");
        setColumnHeaderProperties(jTable1, 14, Color.BLACK, Font.BOLD);
        centerAlignTableCells(jTable1);
        centerAlignTableHeader(jTable1);
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
        jLabel4 = new javax.swing.JLabel();
        jtfUnit = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jcbbStaff = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jcbbSupplier = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jtfReceipt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtfPrice = new javax.swing.JTextField();
        jbAdd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jbAccept = new javax.swing.JButton();

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
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nhập kho nguyên liệu", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 24))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        jLabel2.setText("Tên nguyên liệu");

        jcbbIngredient.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        jLabel3.setText("Số lượng");

        jtfQuantity.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        jLabel4.setText("Đơn vị");

        jtfUnit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jtfUnit.setText("Kg");
        jtfUnit.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        jLabel5.setText("Tên nhân viên");

        jcbbStaff.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        jLabel6.setText("Nhà cung cấp");

        jcbbSupplier.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        jLabel7.setText("Tên phiếu nhập");

        jtfReceipt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        jLabel8.setText("Giá");

        jtfPrice.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jbAdd.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbAdd.setText("Thêm");
        jbAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAddActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Segoe UI", 2, 13)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.setRowHeight(30);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jbAccept.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbAccept.setText("Nhập");
        jbAccept.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAcceptActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbbIngredient, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbbSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtfQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtfUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jcbbStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jtfReceipt, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jtfPrice))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(523, 523, 523)
                        .addComponent(jbAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jbAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(486, 486, 486))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbbIngredient, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbbStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbbSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfReceipt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jbAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jbAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAddActionPerformed
         String nameIngredient = (String) jcbbIngredient.getSelectedItem();
         int quantity = Integer.parseInt(jtfQuantity.getText());
         String unit = jtfUnit.getText();
         String nameStaff = String.valueOf(jcbbStaff.getSelectedItem());
         String nameSupplier = String.valueOf(jcbbSupplier.getSelectedItem());
         String nameReceipt = jtfReceipt.getText();
         float price = Float.parseFloat(jtfPrice.getText());
         dtm.addRow(new Object[] {nameIngredient, quantity, unit, nameStaff, nameSupplier, nameReceipt, price} );
         jcbbIngredient.setSelectedItem("");
         jtfQuantity.setText("");
         jcbbStaff.setSelectedItem("");
         jcbbSupplier.setSelectedItem("");
         jtfReceipt.setText("");
         jtfPrice.setText("");
    }//GEN-LAST:event_jbAddActionPerformed

    private void jbAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAcceptActionPerformed
         WareHouse warehouse = new WareHouse();
        User user = new User();
        Supplier supplier = new Supplier();
        Receipt receipt = new Receipt();
        DetailReceipt detailReceipt = new DetailReceipt();
        try {
            int rowCount = jTable1.getRowCount();
            for(int i = 0; i < rowCount; i++)
            {
                String selectedNameWareHouse = (String) jTable1.getValueAt(i, 0);
                warehouse = wareHouseService.getNameWareHouse(selectedNameWareHouse);
                int quantityCurrent = warehouse.getQuantity();
                int quantityImport =  (int) jTable1.getValueAt(i, 1);
               int quantityNew = quantityCurrent + quantityImport;
               warehouse.setQuantity(quantityNew);
               warehouse.setName(String.valueOf(selectedNameWareHouse));        
               wareHouseService.updateWareHouse(warehouse);  
               
               String nameReceipt = (String) jTable1.getValueAt(i, 5);
               receipt.setName(nameReceipt);
               String selectedNameStaff = String.valueOf(jTable1.getValueAt(i, 3));
                user = userService.getNameUser(selectedNameStaff);
                int idAccount = user.getAccountId();
                receipt.setIdAccount(idAccount);
                String selectedNameSupplier = String.valueOf(jTable1.getValueAt(i, 4));
                supplier = supplierService.getNameSupplier(selectedNameSupplier);
                int idSupplier = supplier.getId();
                receipt.setIdSupplier(idSupplier);
                receiptService.AddReceipt(receipt);

                List<Receipt> receipts = receiptService.getAllReceipt();
                Receipt lastReceipt = receipts.get(receipts.size() - 1);
                int lastReceiptId = lastReceipt.getId();

                detailReceipt.setIdReceipt(lastReceiptId);
                int idWareHouse = warehouse.getId();
                detailReceipt.setIdIngredient(idWareHouse);
                detailReceipt.setQuantity(quantityImport);
                detailReceipt.setUnit(jtfUnit.getText());
                
                detailReceipt.setPrice((float) jTable1.getValueAt(i, 6));
                detailReceiptService.addDetailReceipt(detailReceipt);
            }
             
            
            
            
        } catch (Exception ex) {
            Logger.getLogger(AddWareHouse.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbAcceptActionPerformed

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed
        if (SwingUtilities.isRightMouseButton(evt)) {
            int row = jTable1.rowAtPoint(evt.getPoint());
             int choice = JOptionPane.showConfirmDialog(null, "Bạn có thực sự muốn hủy?",
        "Xác nhận", JOptionPane.YES_NO_OPTION);
             if(choice == JOptionPane.YES_OPTION)
             {
                 dtm.removeRow(row);
             }
             else 
             {
                JOptionPane.getRootFrame().dispose();
             }
        }
    }//GEN-LAST:event_jTable1MousePressed

    
    private void centerAlignTableHeader(JTable table) {
        JTableHeader header = table.getTableHeader();
        TableCellRenderer defaultRenderer = header.getDefaultRenderer();
        JLabel headerLabel = (JLabel) defaultRenderer;
        headerLabel.setHorizontalAlignment(JLabel.CENTER);
    }
      private void centerAlignTableCells(JTable table) {
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);

        for (int i = 0; i < table.getColumnCount(); i++) {
            table.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
    }
     private void setColumnHeaderProperties(JTable table, int fontSize, Color color, int fontStyle) {
        JTableHeader header = table.getTableHeader();
        Font headerFont = header.getFont();
        header.setFont(new Font(headerFont.getName(), fontStyle, fontSize));
        header.setForeground(color);
        TableColumnModel columnModel = table.getColumnModel();
        for (int columnIndex = 0; columnIndex < columnModel.getColumnCount(); columnIndex++) {
            columnModel.getColumn(columnIndex).setHeaderRenderer(header.getDefaultRenderer());
        }
    }
     private void setColumnWidths(JTable table, double[] percentages) {
    if (table == null || percentages == null || table.getColumnModel().getColumnCount() != percentages.length) {
        return; // Bảng hoặc mảng tỉ lệ không hợp lệ
    }

    TableColumnModel columnModel = table.getColumnModel();
    int totalWidth = table.getWidth();
    for (int i = 0; i < percentages.length; i++) {
        int width = (int) (totalWidth * percentages[i]); // Tính toán độ rộng dựa trên tỉ lệ phần trăm
        columnModel.getColumn(i).setPreferredWidth(width);
    }
     
    }
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbAccept;
    private javax.swing.JButton jbAdd;
    private javax.swing.JComboBox<String> jcbbIngredient;
    private javax.swing.JComboBox<String> jcbbStaff;
    private javax.swing.JComboBox<String> jcbbSupplier;
    private javax.swing.JTextField jtfPrice;
    private javax.swing.JTextField jtfQuantity;
    private javax.swing.JTextField jtfReceipt;
    private javax.swing.JTextField jtfUnit;
    // End of variables declaration//GEN-END:variables
}
