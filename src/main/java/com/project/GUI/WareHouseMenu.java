
package com.project.GUI;

import com.project.BUS.WareHouseService;
import com.project.DTO.WareHouse;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class WareHouseMenu extends javax.swing.JPanel {
    DefaultTableModel dtm;
    WareHouseService wareHouseService;
    public WareHouseMenu(){
        initComponents();
        wareHouseService = new WareHouseService();
        dtm = new DefaultTableModel()
        {
            public boolean isCellEditable(int row, int column)
            {

                return false;
            }
        };
        jTable1.setModel(dtm);
        dtm.addColumn("Id");
        dtm.addColumn("Name");
        dtm.addColumn("Unit");
        dtm.addColumn("Quantity");
        dtm.addColumn("Price");
        dtm.addColumn("Id Invoice");
        dtm.addColumn("Id Supplier");
        List<WareHouse> warehouses = null;
        try 
        {
            warehouses = wareHouseService.getAllWareHouse();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        for(WareHouse warehouse : warehouses)
        {
            dtm.addRow(new Object[] {warehouse.getId(), warehouse.getName(), warehouse.getUnit(), warehouse.getQuantity(), warehouse.getPrice(), warehouse.getIdInvoice(), warehouse.getIdSupplier()});
 
        }
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(1085, 768));
        setPreferredSize(new java.awt.Dimension(1085, 768));

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
        jTable1.setPreferredSize(new java.awt.Dimension(1085, 768));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setFont(new java.awt.Font("Arial", 2, 16)); // NOI18N
        jButton1.setText("Nhập hàng");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 723, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(188, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(234, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
