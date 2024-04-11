/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.project.GUI;

/**
 *
 * @author thuan
 */
public class Warehouses extends javax.swing.JPanel {

    /**
     * Creates new form Supplier
     */
    public Warehouses() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        ReceiptTop = new javax.swing.JPanel();
        BoxBtn = new javax.swing.JPanel();
        BtnCreate = new javax.swing.JButton();
        BtnImport = new javax.swing.JButton();
        BtnExport = new javax.swing.JButton();
        BtnDetail = new javax.swing.JButton();
        BtnDelete = new javax.swing.JButton();
        BtnExportExcel = new javax.swing.JButton();
        BoxSearch = new javax.swing.JPanel();
        Filter = new javax.swing.JComboBox<>();
        BtnRefresh = new javax.swing.JButton();
        InputSearch = new javax.swing.JTextField();
        BoxTitle = new javax.swing.JPanel();
        TitleReceipt = new javax.swing.JLabel();
        ReceiptCenter = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableReceipt = new javax.swing.JTable();

        setMinimumSize(new java.awt.Dimension(1085, 768));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(1085, 768));
        setLayout(new java.awt.BorderLayout(0, 5));

        ReceiptTop.setBackground(new java.awt.Color(255, 255, 255));
        ReceiptTop.setPreferredSize(new java.awt.Dimension(608, 160));

        BoxBtn.setBackground(new java.awt.Color(255, 255, 255));
        BoxBtn.setPreferredSize(new java.awt.Dimension(480, 40));
        BoxBtn.setLayout(new java.awt.GridLayout(1, 6, 10, 20));

        BtnCreate.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BtnCreate.setIcon(new javax.swing.ImageIcon("./src/assets/icon/plus.png")); // NOI18N
        BtnCreate.setText("Tạo");
        BtnCreate.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnCreate.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnCreate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnCreateMouseClicked(evt);
            }
        });
        BtnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCreateActionPerformed(evt);
            }
        });
        BoxBtn.add(BtnCreate);

        BtnImport.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BtnImport.setIcon(new javax.swing.ImageIcon("./src/assets/icon/import.png")); // NOI18N
        BtnImport.setText("Nhập");
        BtnImport.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnImport.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnImport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnImportMouseClicked(evt);
            }
        });
        BoxBtn.add(BtnImport);

        BtnExport.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BtnExport.setIcon(new javax.swing.ImageIcon("./src/assets/icon/export.png")); // NOI18N
        BtnExport.setText("Xuất");
        BtnExport.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnExport.setMargin(new java.awt.Insets(2, 1, 2, 1));
        BtnExport.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnExport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnExportMouseClicked(evt);
            }
        });
        BoxBtn.add(BtnExport);

        BtnDetail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BtnDetail.setIcon(new javax.swing.ImageIcon("./src/assets/icon/info-rgb.png")); // NOI18N
        BtnDetail.setText("Chi tiết");
        BtnDetail.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnDetail.setMargin(new java.awt.Insets(2, 1, 2, 1));
        BtnDetail.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnDetail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnDetailMouseClicked(evt);
            }
        });
        BoxBtn.add(BtnDetail);

        BtnDelete.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BtnDelete.setIcon(new javax.swing.ImageIcon("./src/assets/icon/cancel.png")); // NOI18N
        BtnDelete.setText("Xoá");
        BtnDelete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnDelete.setMargin(new java.awt.Insets(2, 1, 2, 1));
        BtnDelete.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnDeleteMouseClicked(evt);
            }
        });
        BoxBtn.add(BtnDelete);

        BtnExportExcel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BtnExportExcel.setIcon(new javax.swing.ImageIcon("./src/assets/icon/excel.png")); // NOI18N
        BtnExportExcel.setText("export");
        BtnExportExcel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnExportExcel.setMargin(new java.awt.Insets(2, 1, 2, 1));
        BtnExportExcel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnExportExcel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnExportExcelMouseClicked(evt);
            }
        });
        BoxBtn.add(BtnExportExcel);

        BoxSearch.setBackground(new java.awt.Color(255, 255, 255));

        Filter.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Filter.setModel(
                new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Filter.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Filter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FilterActionPerformed(evt);
            }
        });

        BtnRefresh.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BtnRefresh.setIcon(new javax.swing.ImageIcon("./src/assets/icon/refresh.png")); // NOI18N
        BtnRefresh.setText("Làm mới");
        BtnRefresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnRefreshMouseClicked(evt);
            }
        });
        BtnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRefreshActionPerformed(evt);
            }
        });

        InputSearch.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        InputSearch.setText("Tìm kiếm....");
        InputSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BoxSearchLayout = new javax.swing.GroupLayout(BoxSearch);
        BoxSearch.setLayout(BoxSearchLayout);
        BoxSearchLayout.setHorizontalGroup(
                BoxSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BoxSearchLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Filter, javax.swing.GroupLayout.PREFERRED_SIZE, 130,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(InputSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 221,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(BtnRefresh)));
        BoxSearchLayout.setVerticalGroup(
                BoxSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(BoxSearchLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(BoxSearchLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(InputSearch, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Filter, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(BtnRefresh, javax.swing.GroupLayout.DEFAULT_SIZE, 47,
                                                Short.MAX_VALUE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        BoxTitle.setBackground(new java.awt.Color(255, 255, 255));
        BoxTitle.setLayout(new java.awt.CardLayout());

        TitleReceipt.setBackground(new java.awt.Color(255, 255, 255));
        TitleReceipt.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        TitleReceipt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleReceipt.setIcon(new javax.swing.ImageIcon("./src/assets/icon/warehouse-rgb.png")); // NOI18N
        TitleReceipt.setText("Quản lý kho");
        TitleReceipt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        TitleReceipt.setIconTextGap(10);
        BoxTitle.add(TitleReceipt, "card2");

        javax.swing.GroupLayout ReceiptTopLayout = new javax.swing.GroupLayout(ReceiptTop);
        ReceiptTop.setLayout(ReceiptTopLayout);
        ReceiptTopLayout.setHorizontalGroup(
                ReceiptTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(ReceiptTopLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(BoxBtn, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72,
                                        Short.MAX_VALUE)
                                .addComponent(BoxSearch, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14))
                        .addComponent(BoxTitle, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        ReceiptTopLayout.setVerticalGroup(
                ReceiptTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ReceiptTopLayout.createSequentialGroup()
                                .addComponent(BoxTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 72,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ReceiptTopLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(BoxBtn, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(BoxSearch, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(13, Short.MAX_VALUE)));

        add(ReceiptTop, java.awt.BorderLayout.PAGE_START);

        ReceiptCenter.setLayout(new javax.swing.BoxLayout(ReceiptCenter, javax.swing.BoxLayout.LINE_AXIS));

        TableReceipt.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TableReceipt.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {
                        { "test", "test", "test", "test", "test", null },
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null }
                },
                new String[] {
                        "ID", "Tên nguyên liệu", "Số lượng", "Đơn vị", "Ngày tạo", "Cập nhật cuối"
                }));
        TableReceipt.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(TableReceipt);

        ReceiptCenter.add(jScrollPane1);

        add(ReceiptCenter, java.awt.BorderLayout.CENTER);
    }// </editor-fold>

    private void BtnImportMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
    }

    private void BtnRefreshMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
    }

    private void BtnExportMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
    }

    private void BtnDetailMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
    }

    private void BtnCreateMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
    }

    private void InputSearchActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void BtnRefreshActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void BtnDeleteMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
    }

    private void BtnExportExcelMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
    }

    private void BtnCreateActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void FilterActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    // Variables declaration - do not modify
    private javax.swing.JPanel BoxBtn;
    private javax.swing.JPanel BoxSearch;
    private javax.swing.JPanel BoxTitle;
    private javax.swing.JButton BtnCreate;
    private javax.swing.JButton BtnDelete;
    private javax.swing.JButton BtnDetail;
    private javax.swing.JButton BtnExport;
    private javax.swing.JButton BtnExportExcel;
    private javax.swing.JButton BtnImport;
    private javax.swing.JButton BtnRefresh;
    private javax.swing.JComboBox<String> Filter;
    private javax.swing.JTextField InputSearch;
    private javax.swing.JPanel ReceiptCenter;
    private javax.swing.JPanel ReceiptTop;
    private javax.swing.JTable TableReceipt;
    private javax.swing.JLabel TitleReceipt;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration
}
