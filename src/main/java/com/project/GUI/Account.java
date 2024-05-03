/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.project.GUI;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

import javax.swing.BorderFactory;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.project.BUS.AccountBUS;
import com.project.Common.Common;
import com.project.DTO.AccountDTO;
import com.project.DTO.PermissionAccount;
import com.project.Util.Formatter;

/**
 *
 * @author admin
 */
public class Account extends javax.swing.JPanel {
    private PermissionAccount permissionList;

    private ArrayList<AccountDTO> listAccount;

    /**
     * Creates new form NewJPanel
     */
    public Account() {
        initComponents();
        permissionList = PermissionAccount.getInstance();

        listAccount = AccountBUS.getAllAccount();
        listAccount.sort(Comparator.comparing(AccountDTO::getId));
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Email");
        model.addColumn("Quyền");
        model.addColumn("Ngày tạo");
        model.addColumn("Cập nhật cuối");

        for (AccountDTO account : listAccount) {
            Object[] rowData = {
                    account.getId(),
                    account.getEmail(),
                    account.getRole(),
                    Common.formatedDateTime(account.getCreatedAt()),
                    Common.formatedDateTime(account.getUpdatedAt()),
            };
            model.addRow(rowData);
        }
        TK_Table.setModel(model);
        Formatter.setBoldHeaderTable(TK_Table);
        Formatter.centerAlignTableCells(TK_Table);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        TK_Bot = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TK_Table = new javax.swing.JTable();
        TK_Top = new javax.swing.JPanel();
        Title = new javax.swing.JPanel();
        TK_title = new javax.swing.JLabel();
        BTN = new javax.swing.JPanel();
        btn_left = new javax.swing.JPanel();
        btn_add = new javax.swing.JButton();
        btn_detail = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_exels = new javax.swing.JButton();
        btn_right = new javax.swing.JPanel();
        // jComboBox1 = new javax.swing.JComboBox<>();
        input_search = new javax.swing.JTextField();
        btn_refresh = new javax.swing.JButton();

        btn_add.setCursor(new java.awt.Cursor(Cursor.HAND_CURSOR));
        btn_delete.setCursor(new java.awt.Cursor(Cursor.HAND_CURSOR));
        btn_detail.setCursor(new java.awt.Cursor(Cursor.HAND_CURSOR));
        btn_exels.setCursor(new java.awt.Cursor(Cursor.HAND_CURSOR));
        btn_refresh.setCursor(new java.awt.Cursor(Cursor.HAND_CURSOR));

        setPreferredSize(new java.awt.Dimension(1085, 768));
        setLayout(new java.awt.BorderLayout());
        setBackground(new java.awt.Color(255, 255, 255));

        TK_Bot.setPreferredSize(new java.awt.Dimension(1085, 600));
        TK_Bot.setLayout(new javax.swing.BoxLayout(TK_Bot, javax.swing.BoxLayout.LINE_AXIS));

        TK_Table.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {
                        { null, null, null, null, null },
                        { null, null, null, null, null },
                        { null, null, null, null, null },
                        { null, null, null, null, null }
                },
                new String[] {
                        "id", "Email", "Password", "Quyền", "Ngày tạo", "Lần cuối đăng nhập"
                }));
        jScrollPane2.setViewportView(TK_Table);
        TK_Table.setShowGrid(true);
        TK_Bot.add(jScrollPane2);

        add(TK_Bot, java.awt.BorderLayout.PAGE_END);

        TK_Top.setLayout(new java.awt.GridLayout(2, 0));
        TK_Top.setPreferredSize(new java.awt.Dimension(1085, 160));

        Title.setLayout(new java.awt.CardLayout());

        TK_title.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        TK_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TK_title.setIcon(new javax.swing.ImageIcon("./src/assets/icon/user (1).png")); // NOI18N
        TK_title.setText("QUẢN LÝ TÀI KHOẢN");
        TK_title.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
        TK_title.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        TK_title.setIconTextGap(10);
        TK_title.setBackground(new java.awt.Color(255, 255, 255));
        Title.add(TK_title, "card2");
        Title.setBackground(new java.awt.Color(255, 255, 255));

        TK_Top.add(Title);
        TK_Top.setBackground(new java.awt.Color(255, 255, 255));

        btn_left.setPreferredSize(new java.awt.Dimension(92, 80));
        btn_left.setLayout(new java.awt.GridLayout(1, 0, 5, 0));

        btn_add.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btn_add.setIcon(new javax.swing.ImageIcon("./src/assets/icon/plus.png")); // NOI18N
        btn_add.setText("THÊM");
        btn_add.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_add.setPreferredSize(new java.awt.Dimension(80, 80));
        btn_add.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });
        btn_add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_addMouseClicked(evt);
            }
        });
        btn_left.add(btn_add);

        btn_detail.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btn_detail.setIcon(new javax.swing.ImageIcon("./src/assets/icon/info-rgb.png")); // NOI18N
        btn_detail.setText("CHI TIẾT");
        btn_detail.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_detail.setPreferredSize(new java.awt.Dimension(80, 80));
        btn_detail.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_detail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_detailActionPerformed(evt);
            }
        });
        btn_left.add(btn_detail);

        btn_delete.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btn_delete.setIcon(new javax.swing.ImageIcon("./src/assets/icon/cancel.png")); // NOI18N
        btn_delete.setText("XÓA");
        btn_delete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_delete.setPreferredSize(new java.awt.Dimension(80, 80));
        btn_delete.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_deleteMouseClicked(evt);
            }
        });
        btn_left.add(btn_delete);
        btn_detail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_detailMouseClicked(evt);
            }
        });

        btn_exels.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btn_exels.setIcon(new javax.swing.ImageIcon("./src/assets/icon/xls.png")); // NOI18N
        btn_exels.setText("XUẤT");
        btn_exels.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_exels.setPreferredSize(new java.awt.Dimension(80, 80));
        btn_exels.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_exels.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_exelsMouseClicked(evt);
            }
        });

        btn_left.add(btn_exels);
        btn_left.setBackground(new java.awt.Color(255, 255, 255));

        // jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {
        // "Item 1", "Item 2", "Item 3", "Item 4" }));
        // jComboBox1.setPreferredSize(new java.awt.Dimension(111, 50));

        // input_search.setText("Nhập tìm kiếm");
        Formatter.setPlaceHolder(input_search,"Nhập từ khóa tìm kiếm");
        input_search.setPreferredSize(new java.awt.Dimension(270, 50));
        // input_search.addInputMethodListener(new java.awt.event.InputMethodListener()
        // {
        // public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
        // input_searchCaretPositionChanged(evt);
        // }
        // public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
        // }
        // });

        input_search.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                handleChangeInputSearch();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                handleChangeInputSearch();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                handleChangeInputSearch();
            }

        });
        btn_refresh.setIcon(new javax.swing.ImageIcon("./src/assets/icon/refresh (1).png")); // NOI18N
        btn_refresh.setText("Làm mới");
        btn_refresh.setPreferredSize(new java.awt.Dimension(97, 50));
        btn_refresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_refreshMouseClicked(evt);
            }

        });
        javax.swing.GroupLayout btn_rightLayout = new javax.swing.GroupLayout(btn_right);
        btn_right.setBackground(new java.awt.Color(255, 255, 255));
        btn_right.setLayout(btn_rightLayout);
        btn_rightLayout.setHorizontalGroup(
                btn_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(btn_rightLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                // .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                // javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(input_search, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29,
                                        Short.MAX_VALUE)
                                .addComponent(btn_refresh, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap()));
        btn_rightLayout.setVerticalGroup(
                btn_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(btn_rightLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(
                                        btn_rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                // .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                // javax.swing.GroupLayout.DEFAULT_SIZE,
                                                // javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(input_search, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btn_refresh, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        javax.swing.GroupLayout BTNLayout = new javax.swing.GroupLayout(BTN);
        BTN.setLayout(BTNLayout);
        BTN.setBackground(new java.awt.Color(255, 255, 255));
        // BTN.setPreferredSize(new java.awt.Dimension(97, 200));
        BTNLayout.setHorizontalGroup(
                BTNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(BTNLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btn_left, javax.swing.GroupLayout.PREFERRED_SIZE, 338,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 171,
                                        Short.MAX_VALUE)
                                .addComponent(btn_right, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap()));
        BTNLayout.setVerticalGroup(
                BTNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(BTNLayout.createSequentialGroup()
                                .addGroup(BTNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btn_left, javax.swing.GroupLayout.PREFERRED_SIZE, 75,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn_right, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 9, Short.MAX_VALUE)));

        TK_Top.add(BTN);

        add(TK_Top, java.awt.BorderLayout.CENTER);
    }// </editor-fold>

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btn_addMouseClicked(java.awt.event.MouseEvent evt) {
        if (permissionList.hasPermission("CREATE_USER")) {
            new AddAccountForm().setVisible(true);

        } else {
            JOptionPane.showMessageDialog(null, "Bạn không có quyền truy cập");
            return;
        }

    }

    private void btn_detailActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btn_detailMouseClicked(java.awt.event.MouseEvent evt) {
        if (permissionList.hasPermission("UPDATE_USER")) {
            int selectedRow = TK_Table.getSelectedRow();
            if (selectedRow != -1) {
                try {
                    int id = (int) TK_Table.getValueAt(selectedRow, 0);

                    for (AccountDTO accountDTO : listAccount) {
                        if (id == accountDTO.getId()) {
                            new DetailAccountForm(accountDTO).setVisible(true);

                        }

                    }

                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Lỗi: ID không hợp lệ.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Vui lòng chọn dòng để xem chi tiết.");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Bạn không có quyền truy cập");
            return;
        }
    }

    private void btn_deleteMouseClicked(java.awt.event.MouseEvent evt) {
        if (permissionList.hasPermission("DELETE_USER")) {

            // TODO add your handling code here:
            int selectedRow = TK_Table.getSelectedRow();
            if (selectedRow != -1) {
                try {
                    int id = (int) TK_Table.getValueAt(selectedRow, 0);
                    // Hiển thị hộp thoại xác nhận
                    int option = JOptionPane.showConfirmDialog(null,
                            "Bạn có chắc chắn muốn xoá tài khoản này?", "Xác nhận xoá",
                            JOptionPane.YES_NO_OPTION);
                    if (option == JOptionPane.YES_OPTION) {
                        boolean check_remove = AccountBUS.deleteUser(id);
                        if (check_remove) {
                            JOptionPane.showMessageDialog(null,
                                    "Tài khoản đã được xoá thành công.");
                            // Nếu xoá thành công, cập nhật lại JTable hoặc các thành phần khác cần
                            // thiết
                        } else {
                            JOptionPane.showMessageDialog(null, "Không thể xoá tài khoản này.");
                        }
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Lỗi: ID không hợp lệ.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Vui lòng chọn dòng để xem chi tiết.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Bạn không có quyền truy cập");
            return;
        }

    }

    private void btn_exelsMouseClicked(java.awt.event.MouseEvent evt) {
        if (permissionList.hasPermission("EXPORT_USER")) {

            exportToExcel();

        } else {
            JOptionPane.showMessageDialog(null, "Bạn không có quyền truy cập");
            return;
        }

    }

    private void exportToExcel() {
        JFileChooser fileChooser = new JFileChooser(); // Tạo một JFileChooser

        // Thiết lập hộp thoại để chọn tệp và đặt tiêu đề
        fileChooser.setDialogTitle("Chọn nơi lưu tệp Excel");

        int userSelection = fileChooser.showSaveDialog(this); // Hiển thị hộp thoại và chờ người dùng chọn nơi
                                                              // lưu

        // Kiểm tra xem người dùng đã chọn "Save" hay chưa
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            try {
                File fileToSave = fileChooser.getSelectedFile(); // Lấy đường dẫn được chọn bởi người
                                                                 // dùng

                // Ghi dữ liệu vào tệp Excel
                try (Workbook workbook = new XSSFWorkbook()) {
                    Sheet sheet = workbook.createSheet("Sheet1");

                    // Lấy mô hình của JTable
                    DefaultTableModel model = (DefaultTableModel) TK_Table.getModel();
                    // Viết tiêu đề cột
                    Row headerRow = sheet.createRow(0);
                    for (int col = 0; col < model.getColumnCount(); col++) {
                        headerRow.createCell(col).setCellValue(model.getColumnName(col));
                    }

                    // Viết dữ liệu từ JTable vào tệp Excel
                    for (int row = 0; row < model.getRowCount(); row++) {
                        Row excelRow = sheet.createRow(row + 1); // Bắt đầu từ hàng thứ 2 (hàng
                                                                 // đầu tiên là tiêu đề)
                        for (int col = 0; col < model.getColumnCount(); col++) {
                            Object cellValue = model.getValueAt(row, col);
                            if (cellValue != null) {
                                Cell excelCell = excelRow.createCell(col);
                                if (cellValue instanceof String) {
                                    excelCell.setCellValue((String) cellValue);
                                } else if (cellValue instanceof Integer) {
                                    excelCell.setCellValue((Integer) cellValue);
                                } else if (cellValue instanceof LocalDate) {
                                    // System.out.println(cellValue);
                                    // LocalDate stringValue = ((LocalDate) cellValue);
                                    // excelCell.setCellValue(stringValue);
                                } // Và có thể thêm các kiểu dữ liệu khác tùy theo nhu
                                  // cầu
                            }
                        }
                    }

                    // Ghi vào tệp Excel
                    try (FileOutputStream outputStream = new FileOutputStream(
                            fileToSave + ".xlsx")) {
                        workbook.write(outputStream);
                    }
                    JOptionPane.showMessageDialog(null, "Xuất file excel thành công.");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void handleChangeInputSearch() {
        // System.out.println(input_search.getText());
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) TK_Table.getModel();
        model.setRowCount(0); // Xóa tất cả các hàng

        // Lấy danh sách nhà cung cấp mới từ AccounuBUS
        ArrayList<AccountDTO> list_account = AccountBUS.searchAccount(input_search.getText());

        for (AccountDTO account : list_account) {
            Object[] rowData = {
                    account.getId(),
                    account.getEmail(),
                    account.getRole(),
                    Common.formatedDateTime(account.getCreatedAt()),
                    Common.formatedDateTime(account.getUpdatedAt()),
            };
            model.addRow(rowData);
        }
    }

    private void btn_refreshMouseClicked(MouseEvent evt) {
        // Xóa dữ liệu hiện tại trong JTable
        DefaultTableModel model = (DefaultTableModel) TK_Table.getModel();
        model.setRowCount(0); // Xóa tất cả các hàng
        listAccount = AccountBUS.getAllAccount();
        listAccount.sort(Comparator.comparing(AccountDTO::getId));

        for (AccountDTO account : listAccount) {
            Object[] rowData = {
                    account.getId(),
                    account.getEmail(),
                    account.getRole(),
                    Common.formatedDateTime(account.getCreatedAt()),
                    Common.formatedDateTime(account.getUpdatedAt()),
            };
            model.addRow(rowData);
        }
        input_search.setText("");
    }

    // Variables declaration - do not modify
    private javax.swing.JPanel BTN;
    private javax.swing.JPanel TK_Bot;
    private javax.swing.JTable TK_Table;
    private javax.swing.JPanel TK_Top;
    private javax.swing.JLabel TK_title;
    private javax.swing.JPanel Title;
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_detail;
    private javax.swing.JButton btn_exels;
    private javax.swing.JPanel btn_left;
    private javax.swing.JButton btn_refresh;
    private javax.swing.JPanel btn_right;
    private javax.swing.JTextField input_search;
    // private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration
}
