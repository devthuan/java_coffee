package com.project.GUI;
import java.awt.Color;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import com.project.BUS.*;
import com.project.DAO.*;
import com.project.DTO.*;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
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
    }// </editor-fold>                        

    private void addUserActionPerformed(java.awt.event.ActionEvent evt) {                                        
        new AddUser().setVisible(true);
    }                                       

    private void jtSearchActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
    }                                        
    
    private void deleteUserActionPerformed(java.awt.event.ActionEvent evt) {                                           
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
    }                                          

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {                                     
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
    }                                    

    private void SearchTextField(java.awt.event.KeyEvent evt) {                                 
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
    }                                

    private void jcbSearchActionPerformed(java.awt.event.ActionEvent evt) {                                          
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
    }                                         

    private void jbExportActionPerformed(java.awt.event.ActionEvent evt) {                                         
    }                                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
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
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
    }                                        


    // Variables declaration - do not modify                     
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
    // End of variables declaration                   
}
