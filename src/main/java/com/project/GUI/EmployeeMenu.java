
package com.project.GUI;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.project.DAO.*;
import com.project.BUS.*;
import com.project.DTO.*;
import com.project.BUS.UserService;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EmployeeMenu extends javax.swing.JPanel {
    UserService userservice;
    DefaultTableModel dtm;
    public EmployeeMenu() {
        initComponents();
        userservice = new UserService();
        dtm = new DefaultTableModel() {
            public boolean isCellEditable(int row, int column) {

                return false;
            }
        };
        jTable1.setModel(dtm);
        dtm.addColumn("Id");
        dtm.addColumn("full_name");
        dtm.addColumn("date_of_birth");
        dtm.addColumn("address");
        dtm.addColumn("position");
        dtm.addColumn("phone");
        dtm.addColumn("salary");
        dtm.addColumn("created_date");
        dtm.addColumn("Account Id");
        List<User> users = null;
        try {
            users = userservice.getAllUser();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        for (User user : users) {
            dtm.addRow(new Object[] { user.getId(), user.getName(), user.getDate(), user.getAddress(),
                    user.getPosition(), user.getPhone(), user.getSalary(), user.getDateCreate(), user.getAccountId() });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jbAdd = new javax.swing.JButton();
        jbEdit = new javax.swing.JButton();
        jbDelete = new javax.swing.JButton();
        jbImport = new javax.swing.JButton();
        jbExport = new javax.swing.JButton();
        jbPrint = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jcbbSelect = new javax.swing.JComboBox<>();
        jtfSearch = new javax.swing.JTextField();
        jbRefresh = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setMinimumSize(new java.awt.Dimension(1085, 768));
        setPreferredSize(new java.awt.Dimension(1085, 768));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 2, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\ACER\\Desktop\\java_coffee\\src\\assets\\icon\\employee.png")); // NOI18N
        jLabel5.setText("Quản lí nhân viên");
        jLabel5.setToolTipText("");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel5.setIconTextGap(10);
        jLabel5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jbAdd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbAdd.setIcon(new javax.swing.ImageIcon("C:\\Users\\ACER\\Desktop\\java_coffee\\src\\assets\\icon\\plus (1).png")); // NOI18N
        jbAdd.setText("Thêm");
        jbAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbAdd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbAdd.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAddActionPerformed(evt);
            }
        });

        jbEdit.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbEdit.setIcon(new javax.swing.ImageIcon("C:\\Users\\ACER\\Desktop\\java_coffee\\src\\assets\\icon\\edit_user.png")); // NOI18N
        jbEdit.setText("Sửa");
        jbEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbEdit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbEdit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditActionPerformed(evt);
            }
        });

        jbDelete.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbDelete.setIcon(new javax.swing.ImageIcon("C:\\Users\\ACER\\Desktop\\java_coffee\\src\\assets\\icon\\delete_user.png")); // NOI18N
        jbDelete.setText("Xóa");
        jbDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbDelete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbDelete.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDeleteActionPerformed(evt);
            }
        });

        jbImport.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbImport.setIcon(new javax.swing.ImageIcon("C:\\Users\\ACER\\Desktop\\java_coffee\\src\\assets\\icon\\import_user.png")); // NOI18N
        jbImport.setText("Nhập");
        jbImport.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbImport.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbImport.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbImport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbImportActionPerformed(evt);
            }
        });

        jbExport.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbExport.setIcon(new javax.swing.ImageIcon("C:\\Users\\ACER\\Desktop\\java_coffee\\src\\assets\\icon\\export_user.png")); // NOI18N
        jbExport.setText("Xuất");
        jbExport.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbExport.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbExport.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExportActionPerformed(evt);
            }
        });

        jbPrint.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbPrint.setIcon(new javax.swing.ImageIcon("C:\\Users\\ACER\\Desktop\\java_coffee\\src\\assets\\icon\\pdf_user.png")); // NOI18N
        jbPrint.setText("In");
        jbPrint.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbPrint.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbPrint.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPrintActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jbAdd)
                .addGap(18, 18, 18)
                .addComponent(jbEdit)
                .addGap(18, 18, 18)
                .addComponent(jbDelete)
                .addGap(18, 18, 18)
                .addComponent(jbImport)
                .addGap(18, 18, 18)
                .addComponent(jbExport)
                .addGap(18, 18, 18)
                .addComponent(jbPrint)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbEdit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbDelete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbImport, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbExport, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbPrint, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel1.add(jPanel2, gridBagConstraints);

        jcbbSelect.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jcbbSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcbbSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbbSelectActionPerformed(evt);
            }
        });

        jtfSearch.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfSearchActionPerformed(evt);
            }
        });

        jbRefresh.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbRefresh.setIcon(new javax.swing.ImageIcon("C:\\Users\\ACER\\Desktop\\java_coffee\\src\\assets\\icon\\refresh.png")); // NOI18N
        jbRefresh.setText("Load");
        jbRefresh.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbRefresh.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jcbbSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jtfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbRefresh)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jcbbSelect)
                    .addComponent(jtfSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jbRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 0, 0);
        jPanel1.add(jPanel3, gridBagConstraints);

        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
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
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTable1.setRowHeight(40);
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1085, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAddActionPerformed
        new AddUser().setVisible(true);
    }//GEN-LAST:event_jbAddActionPerformed

    private void jbEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditActionPerformed
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn trường muốn update");
        } else {
            int userId = Integer.parseInt(String.valueOf(jTable1.getValueAt(selectedRow, 0)));
            try {
                new EditUser1(userId).setVisible(true);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_jbEditActionPerformed

    private void jbDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDeleteActionPerformed
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please choose value which you want to delete?");
        } else {
            int choice = JOptionPane.showConfirmDialog(this, "Do you really want to delete it?");
            if (choice == JOptionPane.YES_OPTION) {
                int userId = Integer.parseInt(String.valueOf(jTable1.getValueAt(selectedRow, 0)));
                try {
                    userservice.deleteUser(userId);
                } catch (Exception ex) {
                    Logger.getLogger(EmployeeMenu.class.getName()).log(Level.SEVERE, null, ex);
                }
                dtm.setRowCount(0);
                List<User> users = null;
                try {
                    users = userservice.getAllUser();
                } catch (Exception ex) {
                    Logger.getLogger(EmployeeMenu.class.getName()).log(Level.SEVERE, null, ex);
                }
                for (User user : users) {
                    dtm.addRow(new Object[] { user.getId(), user.getName(), user.getDate(), user.getAddress(),
                            user.getPosition(), user.getPhone(), user.getSalary(), user.getDateCreate(),
                            user.getAccountId() });
                }
            }
        }
    }//GEN-LAST:event_jbDeleteActionPerformed

    private void jbImportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbImportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbImportActionPerformed

    private void jbExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbExportActionPerformed

    private void jbPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPrintActionPerformed
        String path = "users.pdf";
        UserService userService = new UserService();
        List<User> users = null;

        try {
            Document document = new Document(PageSize.A3.rotate());
            PdfWriter pdfWriter = PdfWriter.getInstance(document, new FileOutputStream(path));
            document.open();

            PdfPTable table = new PdfPTable(9);
            table.setWidthPercentage(100);

            float[] columnWidths = { 1f, 2f, 2f, 3f, 2f, 2f, 2f, 2f, 1f };
            table.setWidths(columnWidths);
            table.addCell("Id");
            table.addCell("Name");
            table.addCell("Date");
            table.addCell("Address");
            table.addCell("Position");
            table.addCell("Phone");
            table.addCell("Salary");
            table.addCell("DateCreate");
            table.addCell("Id Account");

            try {
                users = userService.getAllUser();
                for (User user : users) {
                    table.addCell(String.valueOf(user.getId()));
                    table.addCell(user.getName());
                    table.addCell(String.valueOf(user.getDate()));
                    table.addCell(user.getAddress());
                    table.addCell(user.getPosition());
                    table.addCell(user.getPhone());
                    table.addCell(String.valueOf(user.getSalary()));
                    table.addCell(String.valueOf(user.getDateCreate()));
                    table.addCell(String.valueOf(user.getAccountId()));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

            document.add(table); // Thêm bảng vào tài liệu PDF

            document.close();
            System.out.println("Tạo tệp PDF thành công.");
        } catch (DocumentException | FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Đã xảy ra lỗi khi tạo tệp PDF.");
        }
    }//GEN-LAST:event_jbPrintActionPerformed

    private void jbRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRefreshActionPerformed
        dtm.setRowCount(0);
        List<User> users = null;
        try {
            users = userservice.getAllUser();
        } catch (Exception ex) {
            Logger.getLogger(EmployeeMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (User user : users) {
            dtm.addRow(new Object[] { user.getId(), user.getName(), user.getDate(), user.getAddress(),
                    user.getPosition(), user.getPhone(),
                    user.getSalary(), user.getDateCreate(), user.getAccountId() });
        }
    }//GEN-LAST:event_jbRefreshActionPerformed

    private void jtfSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfSearchActionPerformed
        String keyword = jtfSearch.getText().trim();
        if (!keyword.isEmpty()) {
            DefaultTableModel dtm = new DefaultTableModel();
            jTable1.setModel(dtm);
            dtm.addColumn("id");
            dtm.addColumn("full_name");
            dtm.addColumn("date_of_birth");
            dtm.addColumn("address");
            dtm.addColumn("position");
            dtm.addColumn("phone");
            dtm.addColumn("salary");
            dtm.addColumn("created_date");
            dtm.addColumn("Id Account");
            try {
                List<User> users = null;
                if (jcbbSelect.getSelectedItem().equals("Tìm kiếm theo mã nhân viên")) {
                    int id = Integer.parseInt(keyword);
                    users = userservice.searchAllUserById(id);
                }

                else if (jcbbSelect.getSelectedItem().equals("Tìm kiếm theo tên nhân viên")) {

                    users = userservice.searchAllUserByName(keyword);
                } else if (jcbbSelect.getSelectedItem().equals("Tìm kiếm theo mã nhân viên")) {
                    int id = Integer.parseInt(keyword);
                    users = userservice.searchAllUserById(id);
                } else if (jcbbSelect.getSelectedItem().equals("Tìm kiếm theo số điện thoại")) {
                    users = userservice.searchAllUserByPhone(keyword);
                }
                for (User user : users) {
                    dtm.addRow(new Object[] { user.getId(), user.getName(), user.getDate(), user.getAddress(),
                            user.getPosition(),
                            user.getPhone(), user.getSalary(), user.getDateCreate(), user.getAccountId() });
                }
            } catch (Exception ex) {
                Logger.getLogger(EmployeeMenu.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            try {
                DefaultTableModel dtm = new DefaultTableModel();
                jTable1.setModel(dtm);
                dtm.addColumn("id");
                dtm.addColumn("full_name");
                dtm.addColumn("date_of_birth");
                dtm.addColumn("address");
                dtm.addColumn("position");
                dtm.addColumn("phone");
                dtm.addColumn("salary");
                dtm.addColumn("created_date");
                dtm.addColumn("Id Account");
                List<User> users = userservice.getAllUser();
                for (User user : users) {
                    dtm.addRow(new Object[] { user.getId(), user.getName(), user.getDate(), user.getAddress(),
                            user.getPosition(),
                            user.getPhone(), user.getSalary(), user.getDateCreate(), user.getAccountId() });
                }
            } catch (Exception ex) {
                Logger.getLogger(EmployeeMenu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jtfSearchActionPerformed

    private void jcbbSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbbSelectActionPerformed
        jtfSearch.setText("");
        jtfSearch.requestFocus();
        try {
            DefaultTableModel dtm = new DefaultTableModel();
            jTable1.setModel(dtm);
            dtm.addColumn("id");
            dtm.addColumn("full_name");
            dtm.addColumn("date_of_birth");
            dtm.addColumn("address");
            dtm.addColumn("position");
            dtm.addColumn("phone");
            dtm.addColumn("salary");
            dtm.addColumn("created_date");
            List<User> users = userservice.getAllUser();
            for (User user : users) {
                dtm.addRow(new Object[] { user.getId(), user.getName(), user.getDate(), user.getAddress(),
                        user.getPosition(),
                        user.getPhone(), user.getSalary(), user.getDateCreate() });
            }
        } catch (Exception ex) {
            Logger.getLogger(EmployeeMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jcbbSelectActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbAdd;
    private javax.swing.JButton jbDelete;
    private javax.swing.JButton jbEdit;
    private javax.swing.JButton jbExport;
    private javax.swing.JButton jbImport;
    private javax.swing.JButton jbPrint;
    private javax.swing.JButton jbRefresh;
    private javax.swing.JComboBox<String> jcbbSelect;
    private javax.swing.JTextField jtfSearch;
    // End of variables declaration//GEN-END:variables
}
