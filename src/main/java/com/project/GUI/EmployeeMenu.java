package com.project.GUI;
import java.awt.Color;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.project.BUS.*;
import com.project.DAO.*;
import com.project.DTO.*;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import javax.management.modelmbean.ModelMBean;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class EmployeeMenu extends javax.swing.JPanel {
    DefaultTableModel dtm;
    public UserService userservice;
    public EmployeeMenu() {
        initComponents();
        userservice = new UserService();
        dtm = new DefaultTableModel()
        {
            public boolean isCellEditable(int row, int column)
            {

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
        for(User user : users)
        {
            dtm.addRow(new Object[] {user.getId(), user.getName(), user.getDate(), user.getAddress(), user.getPosition(), user.getPhone(), user.getSalary(), user.getDateCreate(), user.getAccountId()});
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addUser = new javax.swing.JButton();
        Edit = new javax.swing.JButton();
        deleteUser = new javax.swing.JButton();
        jtSearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jcbSearch = new javax.swing.JComboBox<>();
        jbExport = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jbPrint = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(1085, 768));
        setPreferredSize(new java.awt.Dimension(1085, 768));

        addUser.setFont(new java.awt.Font("Arial", 2, 16)); // NOI18N
        addUser.setIcon(new javax.swing.ImageIcon("C:\\Users\\ACER\\Desktop\\test_javaswing\\src\\assets\\icon\\add.png")); // NOI18N
        addUser.setText("Thêm");
        addUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserActionPerformed(evt);
            }
        });

        Edit.setFont(new java.awt.Font("Arial", 2, 16)); // NOI18N
        Edit.setIcon(new javax.swing.ImageIcon("C:\\Users\\ACER\\Desktop\\test_javaswing\\src\\assets\\icon\\edit.png")); // NOI18N
        Edit.setText("Sửa");
        Edit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });

        deleteUser.setFont(new java.awt.Font("Arial", 2, 16)); // NOI18N
        deleteUser.setIcon(new javax.swing.ImageIcon("C:\\Users\\ACER\\Desktop\\test_javaswing\\src\\assets\\icon\\delete.png")); // NOI18N
        deleteUser.setText("Xóa");
        deleteUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteUserActionPerformed(evt);
            }
        });

        jtSearch.setFont(new java.awt.Font("Arial", 2, 16)); // NOI18N
        jtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtSearchActionPerformed(evt);
            }
        });
        jtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SearchTextField(evt);
            }
        });

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
        jScrollPane1.setViewportView(jTable1);

        jcbSearch.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        jcbSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tìm kiếm theo mã nhân viên", "Tìm kiếm theo tên nhân viên", "Tìm kiếm theo số điện thoại" }));
        jcbSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbSearchActionPerformed(evt);
            }
        });

        jbExport.setFont(new java.awt.Font("Segoe UI Semibold", 2, 16)); // NOI18N
        jbExport.setText("Export to Excel");
        jbExport.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExportActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Arial", 2, 16)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ACER\\Desktop\\test_javaswing\\src\\assets\\icon\\loading.png")); // NOI18N
        jButton1.setText("Refresh");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI Semibold", 2, 16)); // NOI18N
        jButton2.setText("Import from Excel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jbPrint.setFont(new java.awt.Font("Segoe UI Semibold", 2, 16)); // NOI18N
        jbPrint.setText("In Ấn");
        jbPrint.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt)
                {
                    jbPrintActionPerformed(evt);
                }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbExport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Edit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deleteUser, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jcbSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1085, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jcbSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(addUser, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(deleteUser, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                            .addComponent(jbExport, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(69, 69, 69))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(244, 244, 244))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserActionPerformed
        new AddUser().setVisible(true);
    }//GEN-LAST:event_addUserActionPerformed

    private void jtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtSearchActionPerformed
        
    }//GEN-LAST:event_jtSearchActionPerformed
    
    private void deleteUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteUserActionPerformed
        int selectedRow = jTable1.getSelectedRow();
        if(selectedRow == -1)
        {
            JOptionPane.showMessageDialog(this, "Please choose value which you want to delete?");
        }
        else 
        {   
            int choice = JOptionPane.showConfirmDialog(this, "Do you really want to delete it?");
            if(choice == JOptionPane.YES_OPTION)
            {
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
                for(User user : users)
                {
                    dtm.addRow(new Object[] {user.getId(), user.getName(), user.getDate(), user.getAddress(), user.getPosition(), user.getPhone(), user.getSalary(), user.getDateCreate(), user.getAccountId()});
                }
            }   
        }
    }//GEN-LAST:event_deleteUserActionPerformed

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
        int selectedRow = jTable1.getSelectedRow();
        if(selectedRow == -1)
        {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn trường muốn update");
        }
        else 
        {
            int userId = Integer.parseInt(String.valueOf(jTable1.getValueAt(selectedRow, 0)));
            try {
                new EditUser(userId).setVisible(true);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_EditActionPerformed

    private void SearchTextField(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchTextField
        String keyword = jtSearch.getText().trim();
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
                if (jcbSearch.getSelectedItem().equals("Tìm kiếm theo mã nhân viên")) {
                    int id = Integer.parseInt(keyword);
                    users = userservice.searchAllUserById(id);
                }
                
                else if(jcbSearch.getSelectedItem().equals("Tìm kiếm theo tên nhân viên")) {
                    
                    users = userservice.searchAllUserByName(keyword);
                }
                else if (jcbSearch.getSelectedItem().equals("Tìm kiếm theo mã nhân viên")) {
                    int id = Integer.parseInt(keyword);
                    users = userservice.searchAllUserById(id);
                }
                else if (jcbSearch.getSelectedItem().equals("Tìm kiếm theo số điện thoại")) {
                    users = userservice.searchAllUserByPhone(keyword);
                }
                for(User user : users) {
                    dtm.addRow(new Object[] {user.getId(), user.getName(), user.getDate(), user.getAddress(),user.getPosition(),
                        user.getPhone(), user.getSalary(), user.getDateCreate(), user.getAccountId()});
                }
            } catch (Exception ex) {
                Logger.getLogger(EmployeeMenu.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
        else 
        {
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
                for(User user : users) {
                    dtm.addRow(new Object[] {user.getId(), user.getName(), user.getDate(), user.getAddress(),user.getPosition(),
                        user.getPhone(), user.getSalary(), user.getDateCreate(), user.getAccountId()});
                }
            } catch (Exception ex) {
                Logger.getLogger(EmployeeMenu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_SearchTextField

    private void jcbSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbSearchActionPerformed
        jtSearch.setText("");
        jtSearch.requestFocus();
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
            for(User user : users) {
                dtm.addRow(new Object[] {user.getId(), user.getName(), user.getDate(), user.getAddress(),user.getPosition(),
                    user.getPhone(), user.getSalary(), user.getDateCreate()});
                }
            } catch (Exception ex) {
                Logger.getLogger(EmployeeMenu.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_jcbSearchActionPerformed

    private void jbExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExportActionPerformed
        new ExportUser();
    }//GEN-LAST:event_jbExportActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dtm.setRowCount(0);
        List<User> users = null;
        try {
            users = userservice.getAllUser();
        } catch (Exception ex) {
            Logger.getLogger(EmployeeMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        for(User user : users)
        {
            dtm.addRow(new Object[] {user.getId(), user.getName(), user.getDate(), user.getAddress(), user.getPosition(), user.getPhone(),
            user.getSalary(), user.getDateCreate(), user.getAccountId()});
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        File excelFile ;
        FileInputStream excelFIS = null;
        BufferedInputStream excelBIS = null;
        XSSFWorkbook excelJTableImport = null;
        String defaultCurrentDirectoryPath = "C:/Code/books.xlsx";
        JFileChooser excelFileChooser = new JFileChooser(defaultCurrentDirectoryPath);
        FileNameExtensionFilter fnef = new FileNameExtensionFilter("EXCEL FILES", "xls", "xlsx", "xlsm");
        excelFileChooser.setFileFilter(fnef);
        excelFileChooser.setDialogTitle("Select Excel File");
        int excelChooser = excelFileChooser.showOpenDialog(null);
        dtm.setRowCount(0);
        if(excelChooser == JFileChooser.APPROVE_OPTION)
        {
            try 
            {
                excelFile = excelFileChooser.getSelectedFile();
                excelFIS = new FileInputStream(excelFile);
                excelBIS = new BufferedInputStream(excelFIS);
                excelJTableImport = new XSSFWorkbook(excelBIS);
                XSSFSheet excelSheet = excelJTableImport.getSheetAt(0);
                for(int row = 1; row <= excelSheet.getLastRowNum(); row++)
                {
                    XSSFRow excelRow = excelSheet.getRow(row);
                    
                    XSSFCell excelId = excelRow.getCell(0);
                    int idValue = 0;
                    if (excelId != null) {
                        if (excelId.getCellTypeEnum() == CellType.NUMERIC) {
                            idValue = (int) excelId.getNumericCellValue();
                        } else if (excelId.getCellTypeEnum() == CellType.STRING) {
                            String idString = excelId.getStringCellValue();
                            try {
                                idValue = Integer.parseInt(idString);
                            } catch (NumberFormatException e) {
                                e.printStackTrace(); 
                            }
                        }
                    }
                    
                    XSSFCell excelName = excelRow.getCell(1);
                    XSSFCell excelDate = excelRow.getCell(2);
                    XSSFCell excelAddress = excelRow.getCell(3);
                    XSSFCell excelPosition = excelRow.getCell(4);
                    XSSFCell excelPhone = excelRow.getCell(5);
                    XSSFCell excelSalary = excelRow.getCell(6);
                    
                    XSSFCell excelDateCreate = excelRow.getCell(7);
                    SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss a");
                    String formattedDate = sdf.format(excelDateCreate.getDateCellValue());

                    XSSFCell excelIdAccount = excelRow.getCell(8);
                    int idAccountValue = 0;
                    if (excelIdAccount != null) {
                        if (excelIdAccount.getCellTypeEnum() == CellType.NUMERIC) {
                            idAccountValue = (int) excelIdAccount.getNumericCellValue();
                        } else if (excelIdAccount.getCellTypeEnum() == CellType.STRING) {
                            String idAccountString = excelIdAccount.getStringCellValue();
                            try {
                                idAccountValue = Integer.parseInt(idAccountString);
                            } catch (NumberFormatException e) {
                                e.printStackTrace(); 
                            }
                        }
                    }
                    
                    dtm.addRow(new Object[] {idValue, excelName,excelDate, excelAddress, excelPosition, excelPhone, excelSalary, formattedDate, idAccountValue});
                }
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jbPrintActionPerformed(java.awt.event.ActionEvent evt)
    {
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
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Edit;
    private javax.swing.JButton addUser;
    private javax.swing.JButton deleteUser;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbExport;
    private javax.swing.JButton jbPrint;
    private javax.swing.JComboBox<String> jcbSearch;
    private javax.swing.JTextField jtSearch;
    // End of variables declaration//GEN-END:variables
}
