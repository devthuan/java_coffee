
package com.project.GUI;
import com.project.BUS.*;
import com.project.DTO.*;
import com.project.DAO.*;
import java.awt.Color;
import java.awt.Font;
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
public class Outbound extends javax.swing.JFrame {
    WareHouseService wareHouseService;
    UserService userService;
    SupplierService supplierService;
    DeliveryNoteService deliveryNoteService;
    DetailDeliveryNoteService detailDeliveryNoteService;
    DefaultTableModel dtm;
    public Outbound() {
        initComponents();
        dtm = new DefaultTableModel() 
        {
            public boolean isCellEditable(int row, int column) {

                return false;
            }
        };
        jTable1.setModel(dtm);
        dtm.addColumn("Tên nguyên liệu");
        dtm.addColumn("Số lượng");
        dtm.addColumn("Đơn vị");
        dtm.addColumn("Nhân viên");
        dtm.addColumn("Tên phiếu xuất");
        setColumnHeaderProperties(jTable1, 14, Color.BLACK, Font.BOLD);
        centerAlignTableCells(jTable1);
        centerAlignTableHeader(jTable1);
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
            Logger.getLogger(Outbound.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(Outbound.class.getName()).log(Level.SEVERE, null, ex);
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
        jLabel4 = new javax.swing.JLabel();
        jtfUnit = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jcbbStaff = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jtfExport = new javax.swing.JTextField();
        jbAdd = new javax.swing.JButton();
        jbAccept = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Xuất kho nguyên liệu", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 24))); // NOI18N

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

        jLabel7.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        jLabel7.setText("Tên phiếu xuất");

        jtfExport.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jbAdd.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbAdd.setText("Thêm");
        jbAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAddActionPerformed(evt);
            }
        });

        jbAccept.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbAccept.setText("Xuất");
        jbAccept.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAcceptActionPerformed(evt);
            }
        });

        jTable1.setAutoCreateRowSorter(true);
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
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jTable1.setRowHeight(30);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jcbbIngredient, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jtfExport, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtfQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(jLabel4)
                        .addGap(29, 29, 29)
                        .addComponent(jtfUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 83, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jcbbStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(89, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jbAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(389, 389, 389))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jbAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(375, 375, 375))))
            .addComponent(jScrollPane1)
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
                    .addComponent(jtfUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfExport, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbbStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jbAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jbAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAddActionPerformed
        String nameIngredient = (String) jcbbIngredient.getSelectedItem();
        int quantity = Integer.parseInt(jtfQuantity.getText());
        String unit = jtfUnit.getText();
        String nameStaff = String.valueOf(jcbbStaff.getSelectedItem());
        String nameExport = jtfExport.getText();
        dtm.addRow(new Object[] {nameIngredient, quantity, unit, nameStaff, nameExport} );
        jcbbIngredient.setSelectedItem("");
        jtfQuantity.setText("");
        jcbbStaff.setSelectedItem("");
        jtfExport.setText("");
    }//GEN-LAST:event_jbAddActionPerformed

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

    private void jbAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAcceptActionPerformed
        WareHouse warehouse = new WareHouse();
        User user = new User();
        DeliveryNote deliveryNote = new DeliveryNote();
        DetailDeliveryNote detailDeliveryNote = new DetailDeliveryNote();
        try {
            int rowCount = jTable1.getRowCount();
            for(int i = 0; i < rowCount; i++)
            {
                String selectedNameWareHouse = (String) jTable1.getValueAt(i, 0);
                warehouse = wareHouseService.getNameWareHouse(selectedNameWareHouse);
                int quantityCurrent = warehouse.getQuantity();
                int quantityImport =  (int) jTable1.getValueAt(i, 1);
                int quantityNew = quantityCurrent - quantityImport;
                warehouse.setQuantity(quantityNew);
                warehouse.setName(String.valueOf(selectedNameWareHouse));
                wareHouseService.updateWareHouse(warehouse);

                String nameExport = (String) jTable1.getValueAt(i, 4);
                deliveryNote.setName(nameExport);
                String selectedNameStaff = String.valueOf(jTable1.getValueAt(i, 3));
                user = userService.getNameUser(selectedNameStaff);
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
                int idWareHouse = warehouse.getId();
                detailDeliveryNote.setIdDeliveryNote(lastDeliveryNoteId);
                detailDeliveryNote.setIdIngredient(idWareHouse);
                detailDeliveryNote.setQuantity(quantityImport);
                detailDeliveryNote.setUnit(jtfUnit.getText());
                detailDeliveryNoteService.addDetailDeliveryNote(detailDeliveryNote);
            }

        } catch (Exception ex) {
            Logger.getLogger(Outbound.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbAcceptActionPerformed

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbAccept;
    private javax.swing.JButton jbAdd;
    private javax.swing.JComboBox<String> jcbbIngredient;
    private javax.swing.JComboBox<String> jcbbStaff;
    private javax.swing.JTextField jtfExport;
    private javax.swing.JTextField jtfQuantity;
    private javax.swing.JTextField jtfUnit;
    // End of variables declaration//GEN-END:variables
}
