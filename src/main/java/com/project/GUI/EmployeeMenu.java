
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
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
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
        dtm.addColumn("Date");
        dtm.addColumn("address");
        dtm.addColumn("position");
        dtm.addColumn("phone");
        dtm.addColumn("salary");
        dtm.addColumn("created_date");
        dtm.addColumn("Account Id");
        setColumnHeaderProperties(jTable1, 14, Color.BLACK, Font.BOLD);
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
         centerAlignTableCells(jTable1);
        centerAlignTableHeader(jTable1);

        jTable1.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                double[] columnPercentages = {0.05, 0.1, 0.1, 0.15, 0.15, 0.1, 0.1, 0.15, 0.1}; // Phần trăm độ rộng cho từng cột
                setColumnWidths(jTable1, columnPercentages);
        }        
        });
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
        jcbbSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tìm kiếm theo mã", "Tìm kiếm theo tên", "Tìm kiếm theo số điện thoại", " " }));
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
        jtfSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfSearchKeyReleased(evt);
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
            JOptionPane.showMessageDialog(this, "Vui lòng chọn nhân viên muốn cập nhật");
        } else {
            int userId = Integer.parseInt(String.valueOf(jTable1.getValueAt(selectedRow, 0)));
            try {
                new EditUser(userId).setVisible(true);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_jbEditActionPerformed

    private void jbDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDeleteActionPerformed
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn nhân viên muốn xóa");
        } else {
            int choice = JOptionPane.showConfirmDialog(this, "Bạn có thực sự muốn xóa nhân viên này ?");
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
        File excelFile;
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
        if (excelChooser == JFileChooser.APPROVE_OPTION) {
            try {
                excelFile = excelFileChooser.getSelectedFile();
                excelFIS = new FileInputStream(excelFile);
                excelBIS = new BufferedInputStream(excelFIS);
                excelJTableImport = new XSSFWorkbook(excelBIS);
                XSSFSheet excelSheet = excelJTableImport.getSheetAt(0);
                for (int row = 1; row <= excelSheet.getLastRowNum(); row++) {
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

                    dtm.addRow(new Object[] { idValue, excelName, excelDate, excelAddress, excelPosition, excelPhone,
                            excelSalary, formattedDate, idAccountValue });
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jbImportActionPerformed

    private void jbExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExportActionPerformed
        new ExportUser().setVisible(true);
    }//GEN-LAST:event_jbExportActionPerformed

    private void jbPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPrintActionPerformed

            new PrintUser().setVisible(true);
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

    private void jtfSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfSearchKeyReleased
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
                if (jcbbSelect.getSelectedItem().equals("Tìm kiếm theo mã")) {
                    int id = Integer.parseInt(keyword);
                    users = userservice.searchAllUserById(id);
                }

                else if (jcbbSelect.getSelectedItem().equals("Tìm kiếm theo tên")) {
                    users = userservice.searchAllUserByName(keyword);
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
    }//GEN-LAST:event_jtfSearchKeyReleased
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
