
package com.project.GUI;
import com.project.BUS.*;
import com.project.DAO.AddUser;
import com.project.DTO.*;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;

public class EmployeeMenu extends javax.swing.JPanel {
    DefaultTableModel dtm;
    public UserService userservice;
    public EmployeeMenu() {
        initComponents();
         HoverCusorMenu();
         HoverMenu();
        userservice = new UserService();
        dtm = new DefaultTableModel() {
            public boolean isCellEditable(int row, int column) {

                return false;
            }
        };
        
        jTable1.setModel(dtm);
        dtm.addColumn("Id");
        dtm.addColumn("full_name");
        dtm.addColumn("date");
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
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        cbbSelect = new javax.swing.JComboBox<>();
        jtfSearch = new javax.swing.JTextField();
        jbRefresh = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jbAdd = new javax.swing.JButton();
        jbEdit = new javax.swing.JButton();
        jbDelete = new javax.swing.JButton();
        jbImport = new javax.swing.JButton();
        jbExport = new javax.swing.JButton();
        jbPrint = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(1085, 768));
        setPreferredSize(new java.awt.Dimension(1085, 768));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 2, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ACER\\Desktop\\java_coffee\\src\\assets\\icon\\icon_employee.png")); // NOI18N
        jLabel1.setText("Quản lí nhân viên");
        jLabel1.setIconTextGap(10);

        cbbSelect.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbbSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tìm kiếm theo mã", "Tìm kiếm theo tên", "Tìm kiếm theo số điện thoại" }));
        cbbSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbSelectActionPerformed(evt);
            }
        });

        jtfSearch.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfSearch.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jtfSearch.setScrollOffset(10);

        jbRefresh.setBackground(new java.awt.Color(242, 242, 242));
        jbRefresh.setFont(new java.awt.Font("Segoe UI Semibold", 2, 15)); // NOI18N
        jbRefresh.setIcon(new javax.swing.ImageIcon("C:\\Users\\ACER\\Desktop\\java_coffee\\src\\assets\\icon\\refresh.png")); // NOI18N
        jbRefresh.setText("Refresh");
        jbRefresh.setBorder(null);
        jbRefresh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbRefresh.setIconTextGap(10);
        jbRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(460, Short.MAX_VALUE)
                .addComponent(cbbSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jtfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jbRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel4.setLayout(new java.awt.GridBagLayout());

        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable1.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
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
        jTable1.setRowHeight(40);
        jTable1.setSelectionBackground(new java.awt.Color(102, 153, 0));
        jTable1.setSelectionForeground(new java.awt.Color(242, 242, 242));
        jTable1.setShowGrid(false);
        jScrollPane1.setViewportView(jTable1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 906;
        gridBagConstraints.ipady = 603;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel4.add(jScrollPane1, gridBagConstraints);

        jPanel2.setLayout(null);

        jbAdd.setBackground(new java.awt.Color(242, 242, 242));
        jbAdd.setFont(new java.awt.Font("Segoe UI Semibold", 2, 16)); // NOI18N
        jbAdd.setIcon(new javax.swing.ImageIcon("C:\\Users\\ACER\\Desktop\\java_coffee\\src\\assets\\icon\\plus.png")); // NOI18N
        jbAdd.setText("Thêm");
        jbAdd.setBorder(null);
        jbAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbAdd.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jbAdd.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jbAdd.setIconTextGap(10);
        jbAdd.setPreferredSize(new java.awt.Dimension(112, 32));
        jbAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAddActionPerformed(evt);
            }
        });
        jPanel2.add(jbAdd);
        jbAdd.setBounds(0, 0, 170, 70);

        jbEdit.setBackground(new java.awt.Color(242, 242, 242));
        jbEdit.setFont(new java.awt.Font("Segoe UI Semibold", 2, 16)); // NOI18N
        jbEdit.setIcon(new javax.swing.ImageIcon("C:\\Users\\ACER\\Desktop\\java_coffee\\src\\assets\\icon\\waste.png")); // NOI18N
        jbEdit.setText("Sửa");
        jbEdit.setBorder(null);
        jbEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbEdit.setIconTextGap(10);
        jbEdit.setMinimumSize(new java.awt.Dimension(35, 59));
        jbEdit.setPreferredSize(new java.awt.Dimension(35, 59));
        jPanel2.add(jbEdit);
        jbEdit.setBounds(0, 80, 170, 70);

        jbDelete.setBackground(new java.awt.Color(242, 242, 242));
        jbDelete.setFont(new java.awt.Font("Segoe UI Semibold", 2, 16)); // NOI18N
        jbDelete.setIcon(new javax.swing.ImageIcon("C:\\Users\\ACER\\Desktop\\java_coffee\\src\\assets\\icon\\edit.png")); // NOI18N
        jbDelete.setText("Xóa");
        jbDelete.setBorder(null);
        jbDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbDelete.setIconTextGap(10);
        jbDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDeleteActionPerformed(evt);
            }
        });
        jPanel2.add(jbDelete);
        jbDelete.setBounds(0, 160, 170, 70);

        jbImport.setBackground(new java.awt.Color(242, 242, 242));
        jbImport.setFont(new java.awt.Font("Segoe UI Semibold", 2, 15)); // NOI18N
        jbImport.setIcon(new javax.swing.ImageIcon("C:\\Users\\ACER\\Desktop\\java_coffee\\src\\assets\\icon\\xls-import.png")); // NOI18N
        jbImport.setText("Import Excel");
        jbImport.setBorder(null);
        jbImport.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbImport.setHideActionText(true);
        jbImport.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jbImport.setIconTextGap(10);
        jbImport.setVerifyInputWhenFocusTarget(false);
        jbImport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbImportActionPerformed(evt);
            }
        });
        jPanel2.add(jbImport);
        jbImport.setBounds(0, 240, 170, 70);

        jbExport.setBackground(new java.awt.Color(242, 242, 242));
        jbExport.setFont(new java.awt.Font("Segoe UI Semibold", 2, 15)); // NOI18N
        jbExport.setIcon(new javax.swing.ImageIcon("C:\\Users\\ACER\\Desktop\\java_coffee\\src\\assets\\icon\\excel.png")); // NOI18N
        jbExport.setText("Export Excel");
        jbExport.setBorder(null);
        jbExport.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbExport.setIconTextGap(10);
        jbExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExportActionPerformed(evt);
            }
        });
        jPanel2.add(jbExport);
        jbExport.setBounds(0, 320, 170, 70);

        jbPrint.setBackground(new java.awt.Color(242, 242, 242));
        jbPrint.setFont(new java.awt.Font("Segoe UI Semibold", 2, 15)); // NOI18N
        jbPrint.setIcon(new javax.swing.ImageIcon("C:\\Users\\ACER\\Desktop\\java_coffee\\src\\assets\\icon\\pdf.png")); // NOI18N
        jbPrint.setText("Xuất PDF");
        jbPrint.setBorder(null);
        jbPrint.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbPrint.setIconTextGap(10);
        jPanel2.add(jbPrint);
        jbPrint.setBounds(0, 410, 170, 70);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 170;
        gridBagConstraints.ipady = 640;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 0, 0);
        jPanel4.add(jPanel2, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    private void addHoverMenu(JButton jb) {
                jb.addMouseListener(new java.awt.event.MouseAdapter() {
                        @Override
                        public void mouseEntered(java.awt.event.MouseEvent evt) {
                                if (!jb.getForeground().equals(Color.RED)) {
                                        jb.setBackground(Color.PINK);
                                        // label.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

                                }
                        }

                        @Override
                        public void mouseExited(java.awt.event.MouseEvent evt) {
                                if (!jb.getForeground().equals(Color.RED)) {
                                        jb.setBackground(new Color(248, 249, 250));
                                        // label.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

                                }
                        }
                });
        }
    
    private void addHoverCursorListener(JButton jb) {
                jb.addMouseListener(new java.awt.event.MouseAdapter() {
                        @Override
                        public void mouseEntered(java.awt.event.MouseEvent evt) {
                                jb.setCursor(new Cursor(Cursor.HAND_CURSOR)); 
                        }

                        @Override
                        public void mouseExited(java.awt.event.MouseEvent evt) {
                                jb.setCursor(new Cursor(Cursor.DEFAULT_CURSOR)); 
                        }
                });
    }
    
    private void HoverCusorMenu() {
                addHoverCursorListener(jbRefresh);
                addHoverCursorListener(jbAdd);
                addHoverCursorListener(jbEdit);
                addHoverCursorListener(jbDelete);
                addHoverCursorListener(jbImport);
                addHoverCursorListener(jbExport);
                addHoverCursorListener(jbPrint);

        }

        private void HoverMenu() {
                addHoverMenu(jbRefresh);
                addHoverMenu(jbAdd);
                addHoverMenu(jbEdit);
                addHoverMenu(jbDelete);
                addHoverMenu(jbImport);
                addHoverMenu(jbExport);
                addHoverMenu(jbPrint);

        }
    private void jbDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbDeleteActionPerformed

    private void jbImportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbImportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbImportActionPerformed

    private void cbbSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbSelectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbSelectActionPerformed

    private void jbRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRefreshActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbRefreshActionPerformed

    private void jbExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbExportActionPerformed

    private void jbAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAddActionPerformed
        new AddUser().setVisible(true);

    }//GEN-LAST:event_jbAddActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbbSelect;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbAdd;
    private javax.swing.JButton jbDelete;
    private javax.swing.JButton jbEdit;
    private javax.swing.JButton jbExport;
    private javax.swing.JButton jbImport;
    private javax.swing.JButton jbPrint;
    private javax.swing.JButton jbRefresh;
    private javax.swing.JTextField jtfSearch;
    // End of variables declaration//GEN-END:variables
}
