/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.project.GUI;

import java.awt.Cursor;
import java.util.ArrayList;
import java.awt.*;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;

// import org.apache.poi.ss.usermodel.Color;


public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        SwitchControl();
        Right.add(new BuyProduct()).setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        Left = new javax.swing.JPanel();
        Profile = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        menu = new javax.swing.JPanel();
        ItemHome = new javax.swing.JPanel();
        HomeLabel = new javax.swing.JLabel();
        ItemProduct = new javax.swing.JPanel();
        ProductLabel = new javax.swing.JLabel();
        ItemOrder = new javax.swing.JPanel();
        OrderLabel = new javax.swing.JLabel();
        ItemAccount = new javax.swing.JPanel();
        AccountLabel = new javax.swing.JLabel();
        ItemEmployee = new javax.swing.JPanel();
        EmployeeLabel = new javax.swing.JLabel();
        ItemWarehouse = new javax.swing.JPanel();
        WarehouseLabel = new javax.swing.JLabel();
        ItemReceipt = new javax.swing.JPanel();
        ReceiptLabel = new javax.swing.JLabel();
        ItemSupplier = new javax.swing.JPanel();
        SupplierLabel = new javax.swing.JLabel();
        ItemStatistical = new javax.swing.JPanel();
        StatisticalLabel = new javax.swing.JLabel();
        ItemLogout = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        Right = new javax.swing.JPanel();
        HoverCusorMenu();
        HoverMenu();
        addClickEffectElement();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1270, 768));
        setPreferredSize(new java.awt.Dimension(1290, 768));
        setType(java.awt.Window.Type.POPUP);

        Left.setBackground(new java.awt.Color(248, 249, 250));
        Left.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED,
                java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        Left.setMaximumSize(new java.awt.Dimension(185, 768));
        Left.setMinimumSize(new java.awt.Dimension(185, 768));
        Left.setPreferredSize(new java.awt.Dimension(185, 768));

        Profile.setBackground(new java.awt.Color(255, 255, 255));
        Profile.setMinimumSize(new java.awt.Dimension(128, 110));

        jLabel6.setIcon(new javax.swing.ImageIcon("./src/assets/icon/profile-64.png")); // NOI18N

        jLabel13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel13.setText("Admin");

        javax.swing.GroupLayout ProfileLayout = new javax.swing.GroupLayout(Profile);
        Profile.setLayout(ProfileLayout);
        ProfileLayout.setHorizontalGroup(
                ProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(ProfileLayout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addGroup(ProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 53,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        ProfileLayout.setVerticalGroup(
                ProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(ProfileLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                                .addGap(12, 12, 12)));

        menu.setBackground(new java.awt.Color(248, 249, 250));
        menu.setMaximumSize(null);
        menu.setMinimumSize(new java.awt.Dimension(160, 402));
        menu.setPreferredSize(new java.awt.Dimension(160, 402));

        ItemHome.setBackground(new java.awt.Color(248, 249, 250));
        ItemHome.setAutoscrolls(true);
        ItemHome.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ItemHome.setInheritsPopupMenu(true);
        ItemHome.setMinimumSize(new java.awt.Dimension(182, 55));
        ItemHome.setPreferredSize(new java.awt.Dimension(182, 55));
        ItemHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ItemHomeMouseClicked(evt);
            }
        });
        ItemHome.setLayout(new java.awt.CardLayout(7, 0));

        HomeLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        HomeLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        HomeLabel.setIcon(new javax.swing.ImageIcon("./src/assets/icon/home.png")); // NOI18N
        HomeLabel.setText("Trang chủ");
        HomeLabel.setAutoscrolls(true);
        HomeLabel.setFocusable(false);
        HomeLabel.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        HomeLabel.setIconTextGap(12);
        HomeLabel.setName(""); // NOI18N
        HomeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeLabelMouseClicked(evt);
            }
        });
        ItemHome.add(HomeLabel, "card2");
        HomeLabel.getAccessibleContext().setAccessibleName("");

        menu.add(ItemHome);
        ItemHome.getAccessibleContext().setAccessibleName("");

        ItemProduct.setBackground(new java.awt.Color(248, 249, 250));
        ItemProduct.setMinimumSize(new java.awt.Dimension(182, 55));
        ItemProduct.setPreferredSize(new java.awt.Dimension(182, 55));
        ItemProduct.setLayout(new java.awt.CardLayout(7, 0));

        ProductLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ProductLabel.setIcon(new javax.swing.ImageIcon("./src/assets/icon/product.png")); // NOI18N
        ProductLabel.setText("Sản phẩm");
        ProductLabel.setIconTextGap(12);
        ProductLabel.setName(""); // NOI18N
        ProductLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductLabelMouseClicked(evt);
            }
        });
        ItemProduct.add(ProductLabel, "card2");

        menu.add(ItemProduct);

        ItemOrder.setBackground(new java.awt.Color(248, 249, 250));
        ItemOrder.setMaximumSize(new java.awt.Dimension(182, 55));
        ItemOrder.setMinimumSize(new java.awt.Dimension(182, 55));
        ItemOrder.setPreferredSize(new java.awt.Dimension(182, 55));
        ItemOrder.setLayout(new java.awt.CardLayout(7, 0));

        OrderLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        OrderLabel.setIcon(new javax.swing.ImageIcon("./src/assets/icon/checkout.png")); // NOI18N
        OrderLabel.setText("Đơn hàng");
        OrderLabel.setIconTextGap(12);
        OrderLabel.setMaximumSize(new java.awt.Dimension(124, 32));
        OrderLabel.setMinimumSize(new java.awt.Dimension(124, 32));
        OrderLabel.setName(""); // NOI18N
        OrderLabel.setPreferredSize(new java.awt.Dimension(124, 32));
        OrderLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OrderLabelMouseClicked(evt);
            }
        });
        ItemOrder.add(OrderLabel, "card2");

        menu.add(ItemOrder);

        ItemAccount.setBackground(new java.awt.Color(248, 249, 250));
        ItemAccount.setMinimumSize(new java.awt.Dimension(182, 55));
        ItemAccount.setPreferredSize(new java.awt.Dimension(182, 55));

        ItemAccount.setLayout(new java.awt.CardLayout(7, 0));

        AccountLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        AccountLabel.setIcon(new javax.swing.ImageIcon("./src/assets/icon/user.png")); // NOI18N
        AccountLabel.setText("Tài khoản");
        AccountLabel.setAutoscrolls(true);
        AccountLabel.setIconTextGap(12);
        AccountLabel.setMinimumSize(new java.awt.Dimension(182, 55));
        AccountLabel.setPreferredSize(new java.awt.Dimension(182, 55));
        AccountLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AccountLabelMouseClicked(evt);
            }
        });
        ItemAccount.add(AccountLabel, "card2");

        menu.add(ItemAccount);

        ItemEmployee.setBackground(new java.awt.Color(248, 249, 250));
        ItemEmployee.setMinimumSize(new java.awt.Dimension(182, 55));
        ItemEmployee.setPreferredSize(new java.awt.Dimension(182, 55));
        ItemEmployee.setLayout(new java.awt.CardLayout(7, 0));

        EmployeeLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        EmployeeLabel.setIcon(new javax.swing.ImageIcon("./src/assets/icon/employee.png")); // NOI18N
        EmployeeLabel.setText("Nhân viên");
        EmployeeLabel.setIconTextGap(12);
        EmployeeLabel.setMaximumSize(new java.awt.Dimension(124, 32));
        EmployeeLabel.setMinimumSize(new java.awt.Dimension(124, 32));
        EmployeeLabel.setName(""); // NOI18N
        EmployeeLabel.setPreferredSize(new java.awt.Dimension(124, 32));
        EmployeeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EmployeeLabelMouseClicked(evt);
            }
        });
        ItemEmployee.add(EmployeeLabel, "card2");

        menu.add(ItemEmployee);

        ItemWarehouse.setBackground(new java.awt.Color(248, 249, 250));
        ItemWarehouse.setMinimumSize(new java.awt.Dimension(182, 55));
        ItemWarehouse.setPreferredSize(new java.awt.Dimension(182, 55));

        ItemWarehouse.setLayout(new java.awt.CardLayout(7, 0));

        WarehouseLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        WarehouseLabel.setIcon(new javax.swing.ImageIcon("./src/assets/icon/warehouse.png")); // NOI18N
        WarehouseLabel.setText("Kho");
        WarehouseLabel.setAutoscrolls(true);
        WarehouseLabel.setIconTextGap(12);
        WarehouseLabel.setMaximumSize(new java.awt.Dimension(124, 32));
        WarehouseLabel.setMinimumSize(new java.awt.Dimension(124, 32));
        WarehouseLabel.setName(""); // NOI18N
        WarehouseLabel.setPreferredSize(new java.awt.Dimension(124, 32));
        WarehouseLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                WarehouseLabelMouseClicked(evt);
            }
        });
        ItemWarehouse.add(WarehouseLabel, "card2");

        menu.add(ItemWarehouse);

        ItemReceipt.setBackground(new java.awt.Color(248, 249, 250));
        ItemReceipt.setMinimumSize(new java.awt.Dimension(182, 55));
        ItemReceipt.setPreferredSize(new java.awt.Dimension(182, 55));

        ItemReceipt.setLayout(new java.awt.CardLayout(7, 0));

        ReceiptLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ReceiptLabel.setIcon(new javax.swing.ImageIcon("./src/assets/icon/receipt.png")); // NOI18N
        ReceiptLabel.setText("Nhập, Xuất");
        ReceiptLabel.setAutoscrolls(true);
        ReceiptLabel.setIconTextGap(12);
        ReceiptLabel.setMaximumSize(new java.awt.Dimension(124, 32));
        ReceiptLabel.setMinimumSize(new java.awt.Dimension(124, 32));
        ReceiptLabel.setName(""); // NOI18N
        ReceiptLabel.setPreferredSize(new java.awt.Dimension(124, 32));
        ReceiptLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReceiptLabelMouseClicked(evt);
            }
        });
        ItemReceipt.add(ReceiptLabel, "card2");

        menu.add(ItemReceipt);

        ItemSupplier.setBackground(new java.awt.Color(248, 249, 250));
        ItemSupplier.setMinimumSize(new java.awt.Dimension(182, 55));
        ItemSupplier.setPreferredSize(new java.awt.Dimension(182, 55));

        ItemSupplier.setLayout(new java.awt.CardLayout(7, 0));

        SupplierLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        SupplierLabel.setIcon(new javax.swing.ImageIcon("./src/assets/icon/supplier.png")); // NOI18N
        SupplierLabel.setText("Nhà cung cấp");
        SupplierLabel.setAutoscrolls(true);
        SupplierLabel.setIconTextGap(12);
        SupplierLabel.setMaximumSize(new java.awt.Dimension(124, 32));
        SupplierLabel.setMinimumSize(new java.awt.Dimension(124, 32));
        SupplierLabel.setName(""); // NOI18N
        SupplierLabel.setPreferredSize(new java.awt.Dimension(124, 32));
        SupplierLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SupplierLabelMouseClicked(evt);
            }
        });
        ItemSupplier.add(SupplierLabel, "card2");

        menu.add(ItemSupplier);

        ItemStatistical.setBackground(new java.awt.Color(248, 249, 250));
        ItemStatistical.setMinimumSize(new java.awt.Dimension(182, 55));
        ItemStatistical.setPreferredSize(new java.awt.Dimension(182, 55));

        ItemStatistical.setLayout(new java.awt.CardLayout(7, 0));

        StatisticalLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        StatisticalLabel.setIcon(new javax.swing.ImageIcon("./src/assets/icon/pie-chart.png")); // NOI18N
        StatisticalLabel.setText("Thống kê");
        StatisticalLabel.setAutoscrolls(true);
        StatisticalLabel.setIconTextGap(12);
        StatisticalLabel.setMaximumSize(new java.awt.Dimension(124, 32));
        StatisticalLabel.setMinimumSize(new java.awt.Dimension(124, 32));
        StatisticalLabel.setName(""); // NOI18N
        StatisticalLabel.setPreferredSize(new java.awt.Dimension(124, 32));
        StatisticalLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StatisticalLabelMouseClicked(evt);
            }
        });
        ItemStatistical.add(StatisticalLabel, "card2");

        menu.add(ItemStatistical);

        ItemLogout.setBackground(new java.awt.Color(248, 249, 250));
        ItemLogout.setMinimumSize(new java.awt.Dimension(182, 55));
        ItemLogout.setPreferredSize(new java.awt.Dimension(182, 55));
        ItemLogout.setLayout(new java.awt.CardLayout(7, 0));

        jLabel12.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel12.setIcon(new javax.swing.ImageIcon("./src/assets/icon/logout.png")); // NOI18N
        jLabel12.setText("Đăng xuất");
        jLabel12.setIconTextGap(12);
        jLabel12.setName(""); // NOI18N
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        ItemLogout.add(jLabel12, "card2");

        menu.add(ItemLogout);

        javax.swing.GroupLayout LeftLayout = new javax.swing.GroupLayout(Left);
        Left.setLayout(LeftLayout);
        LeftLayout.setHorizontalGroup(
                LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(LeftLayout.createSequentialGroup()
                                .addGroup(LeftLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                                        .addComponent(Profile, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE)));
        LeftLayout.setVerticalGroup(
                LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(LeftLayout.createSequentialGroup()
                                .addComponent(Profile, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE)));

        getContentPane().add(Left, java.awt.BorderLayout.LINE_START);

        Right.setMinimumSize(new java.awt.Dimension(1085, 768));
        Right.setPreferredSize(new java.awt.Dimension(1085, 768));
        Right.setRequestFocusEnabled(false);
        Right.setLayout(new java.awt.CardLayout());
        getContentPane().add(Right, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>

    private void addHoverCursorListener(JLabel label) {
        label.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                label.setCursor(new Cursor(Cursor.HAND_CURSOR)); // Thiết lập loại con trỏ chuột
                                                                 // thành bàn tay khi di chuột vào
                                                                 // label
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                label.setCursor(new Cursor(Cursor.DEFAULT_CURSOR)); // Thiết lập loại con trỏ chuột
                                                                    // mặc định khi di chuột ra khỏi
                                                                    // label
            }
        });
    }

    private void addHoverMenu(JLabel label, JPanel panel) {
        label.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if (!label.getForeground().equals(Color.RED)) {
                    panel.setBackground(Color.WHITE);
                    // label.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N


                }
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                if (!label.getForeground().equals(Color.RED)) {
                    panel.setBackground(new Color(248, 249, 250));
                    // label.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

                }
            }
        });
    }

    private JLabel selectedLabel = null;
    private JPanel selectedPanel = null;

    private void addClickEffect(JLabel label, JPanel panel) {
        label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (selectedLabel != null) {
                    selectedLabel.setFont(new java.awt.Font("Arial", 0, 18));
                    selectedLabel.setForeground(Color.BLACK);
                    selectedPanel.setBackground(new Color(248, 249, 250));
                }
                label.setForeground(Color.RED);
                label.setFont(new java.awt.Font("Arial", 1, 18));

                panel.setBackground(Color.WHITE);

                selectedLabel = label;
                selectedPanel = panel;
            }
        });
    }

    private void HoverCusorMenu() {
        addHoverCursorListener(HomeLabel);
        addHoverCursorListener(ProductLabel);
        addHoverCursorListener(OrderLabel);
        addHoverCursorListener(AccountLabel);
        addHoverCursorListener(EmployeeLabel);
        addHoverCursorListener(WarehouseLabel);
        addHoverCursorListener(ReceiptLabel);
        addHoverCursorListener(SupplierLabel);
        addHoverCursorListener(StatisticalLabel);
        addHoverCursorListener(jLabel12);

    }

    private void HoverMenu() {
        addHoverMenu(HomeLabel, ItemHome);
        addHoverMenu(ProductLabel, ItemProduct);
        addHoverMenu(OrderLabel, ItemOrder);
        addHoverMenu(AccountLabel, ItemAccount);
        addHoverMenu(EmployeeLabel, ItemEmployee);
        addHoverMenu(WarehouseLabel, ItemWarehouse);
        addHoverMenu(ReceiptLabel, ItemReceipt);
        addHoverMenu(SupplierLabel, ItemSupplier);
        addHoverMenu(StatisticalLabel, ItemStatistical);

    }

    private void addClickEffectElement() {
        addClickEffect(HomeLabel, ItemHome);
        addClickEffect(ProductLabel, ItemProduct);
        addClickEffect(OrderLabel, ItemOrder);
        addClickEffect(AccountLabel, ItemAccount);
        addClickEffect(EmployeeLabel, ItemEmployee);
        addClickEffect(WarehouseLabel, ItemWarehouse);
        addClickEffect(ReceiptLabel, ItemReceipt);
        addClickEffect(SupplierLabel, ItemSupplier);
        addClickEffect(StatisticalLabel, ItemStatistical);
    }

    private void SwitchControl() {
        Right.removeAll();
        Right.revalidate();
        Right.repaint();
    }

    // event onclick sidebar
    private void ItemHomeMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
    }

    private void HomeLabelMouseClicked(java.awt.event.MouseEvent evt) {
        SwitchControl();
        Right.add(new BuyProduct()).setVisible(true);
    }

    private void ProductLabelMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
    }

    private void OrderLabelMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
    }

    private void AccountLabelMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
    }

    private void EmployeeLabelMouseClicked(java.awt.event.MouseEvent evt) {
          
    }

    private void ReceiptLabelMouseClicked(java.awt.event.MouseEvent evt) {
        SwitchControl();
        Right.add(new ReceiptDeliveryBill()).setVisible(true);
    }

    private void SupplierLabelMouseClicked(java.awt.event.MouseEvent evt) {
        SwitchControl();
        Right.add(new Supplier()).setVisible(true);
    }

    private void StatisticalLabelMouseClicked(java.awt.event.MouseEvent evt) {
        SwitchControl();
        Right.add(new Statistical()).setVisible(true);
    }

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
    }

    private void WarehouseLabelMouseClicked(java.awt.event.MouseEvent evt) {
            SwitchControl();
            Right.add(new Warehouses()).setVisible(true);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JLabel AccountLabel;
    private javax.swing.JLabel EmployeeLabel;
    private javax.swing.JLabel HomeLabel;
    private javax.swing.JPanel ItemAccount;
    private javax.swing.JPanel ItemEmployee;
    private javax.swing.JPanel ItemHome;
    private javax.swing.JPanel ItemLogout;
    private javax.swing.JPanel ItemOrder;
    private javax.swing.JPanel ItemProduct;
    private javax.swing.JPanel ItemReceipt;
    private javax.swing.JPanel ItemStatistical;
    private javax.swing.JPanel ItemSupplier;
    private javax.swing.JPanel ItemWarehouse;
    private javax.swing.JPanel Left;
    private javax.swing.JLabel OrderLabel;
    private javax.swing.JLabel ProductLabel;
    private javax.swing.JPanel Profile;
    private javax.swing.JLabel ReceiptLabel;
    private javax.swing.JPanel Right;
    private javax.swing.JLabel StatisticalLabel;
    private javax.swing.JLabel SupplierLabel;
    private javax.swing.JLabel WarehouseLabel;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel menu;
    // End of variables declaration
}
