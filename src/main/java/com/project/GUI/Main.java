
package com.project.GUI;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.GroupLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main extends javax.swing.JFrame {

        public Main() {
                initComponents();
               
        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">
        private void initComponents() {

                Right = new javax.swing.JPanel();
                jTabbedPane1 = new javax.swing.JTabbedPane();
                SideOverview = new javax.swing.JPanel();
                BoxProduct = new javax.swing.JPanel();
                jLabel5 = new javax.swing.JLabel();
                jLabel1 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                BoxRevenue = new javax.swing.JPanel();
                jLabel8 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                BoxUser = new javax.swing.JPanel();
                jLabel9 = new javax.swing.JLabel();
                IconUser = new javax.swing.JLabel();
                jLabel10 = new javax.swing.JLabel();
                Left = new javax.swing.JPanel();
                menu = new javax.swing.JPanel();
                ItemHome = new javax.swing.JPanel();
                HomeLabel = new javax.swing.JLabel();
                ItemProduct = new javax.swing.JPanel();
                ProductLabel = new javax.swing.JLabel();
                ItemAccount = new javax.swing.JPanel();
                AccountLabel = new javax.swing.JLabel();
                ItemOrder = new javax.swing.JPanel();
                OrderLabel = new javax.swing.JLabel();
                ItemStatistical = new javax.swing.JPanel();
                StatisticalLabel = new javax.swing.JLabel();
                ItemPermission = new javax.swing.JPanel();
                PermissonLabel = new javax.swing.JLabel();
                ItemLogout = new javax.swing.JPanel();
                LogoutLabel = new javax.swing.JLabel();
                Profile = new javax.swing.JPanel();
                IconLabel = new javax.swing.JLabel();
                NamePermissionLabel = new javax.swing.JLabel();
                ItemWareHouse = new javax.swing.JPanel();
                WareHouseLable = new javax.swing.JLabel();
                HoverMenu();
                HoverCusorMenu();
                addClickEffect(HomeLabel, ItemHome);
                addClickEffect(ProductLabel, ItemProduct);
                addClickEffect(AccountLabel, ItemAccount);
                addClickEffect(OrderLabel, ItemOrder);
                addClickEffect(WareHouseLable, ItemWareHouse);
                addClickEffect(PermissonLabel, ItemPermission);
                addClickEffect(StatisticalLabel, ItemStatistical);
                addClickEffect(LogoutLabel, ItemLogout);

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setMinimumSize(new java.awt.Dimension(1270, 768));
                setType(java.awt.Window.Type.POPUP);

                Right.setMinimumSize(new java.awt.Dimension(1085, 768));
                Right.setPreferredSize(new java.awt.Dimension(1085, 768));
                Right.setLayout(new java.awt.CardLayout());

                jTabbedPane1.setBackground(new java.awt.Color(248, 249, 250));
                jTabbedPane1.setMinimumSize(new java.awt.Dimension(1085, 768));
                jTabbedPane1.setPreferredSize(new java.awt.Dimension(1085, 768));

                SideOverview.setBackground(new java.awt.Color(248, 249, 250));
                SideOverview.setMinimumSize(new java.awt.Dimension(1085, 768));

                BoxProduct.setBackground(new java.awt.Color(255, 255, 255));
                BoxProduct.setForeground(new java.awt.Color(160, 174, 192));
                BoxProduct.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
                BoxProduct.setDoubleBuffered(false);
                BoxProduct.setEnabled(false);
                BoxProduct.setPreferredSize(new java.awt.Dimension(250, 100));

                jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
                jLabel5.setForeground(new java.awt.Color(160, 174, 192));
                jLabel5.setText("Loại sản phẩm");

                jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
                jLabel1.setIcon(new javax.swing.ImageIcon("src/assets/icon/brand-identity-64.png")); // NOI18N

                jLabel3.setFont(new java.awt.Font("Arial", 1, 28)); // NOI18N
                jLabel3.setText("100");
                jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                jLabel3.setVerifyInputWhenFocusTarget(false);

                javax.swing.GroupLayout BoxProductLayout = new javax.swing.GroupLayout(BoxProduct);
                BoxProduct.setLayout(BoxProductLayout);
                BoxProductLayout.setHorizontalGroup(
                                BoxProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BoxProductLayout
                                                                .createSequentialGroup()
                                                                .addContainerGap(24, Short.MAX_VALUE)
                                                                .addComponent(jLabel1)
                                                                .addGap(18, 18, 18)
                                                                .addGroup(
                                                                                BoxProductLayout.createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                .addComponent(jLabel5)
                                                                                                .addGroup(BoxProductLayout
                                                                                                                .createSequentialGroup()
                                                                                                                .addGap(13, 13, 13)
                                                                                                                .addComponent(jLabel3,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                90,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addGap(27, 27, 27)));
                BoxProductLayout.setVerticalGroup(
                                BoxProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(BoxProductLayout.createSequentialGroup()
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addGroup(
                                                                                BoxProductLayout.createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                .addGroup(BoxProductLayout
                                                                                                                .createSequentialGroup()
                                                                                                                .addComponent(jLabel3,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                50,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addGap(3, 3, 3)
                                                                                                                .addComponent(jLabel5))
                                                                                                .addComponent(jLabel1))
                                                                .addGap(15, 15, 15)));

                BoxRevenue.setBackground(new java.awt.Color(255, 255, 255));
                BoxRevenue.setPreferredSize(new java.awt.Dimension(250, 100));

                jLabel8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
                jLabel8.setForeground(new java.awt.Color(160, 174, 192));
                jLabel8.setText("Tổng doanh thu");

                jLabel2.setIcon(new javax.swing.ImageIcon("src/assets/icon/money-bag-64.png")); // NOI18N

                jLabel4.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
                jLabel4.setText("10000000");
                jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

                javax.swing.GroupLayout BoxRevenueLayout = new javax.swing.GroupLayout(BoxRevenue);
                BoxRevenue.setLayout(BoxRevenueLayout);
                BoxRevenueLayout.setHorizontalGroup(
                                BoxRevenueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(BoxRevenueLayout.createSequentialGroup()
                                                                .addGap(22, 22, 22)
                                                                .addComponent(jLabel2)
                                                                .addGap(12, 12, 12)
                                                                .addGroup(
                                                                                BoxRevenueLayout.createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                .addComponent(jLabel8,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                146,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addComponent(jLabel4,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE))
                                                                .addContainerGap()));
                BoxRevenueLayout.setVerticalGroup(
                                BoxRevenueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(BoxRevenueLayout.createSequentialGroup()
                                                                .addContainerGap(17, Short.MAX_VALUE)
                                                                .addGroup(BoxRevenueLayout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                BoxRevenueLayout.createSequentialGroup()
                                                                                                                .addComponent(jLabel2)
                                                                                                                .addGap(15, 15, 15))
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                BoxRevenueLayout
                                                                                                                .createSequentialGroup()
                                                                                                                .addComponent(jLabel4,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                44,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addPreferredGap(
                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                                .addComponent(jLabel8)
                                                                                                                .addGap(15, 15, 15)))));
                // hello
                BoxUser.setBackground(new java.awt.Color(255, 255, 255));
                BoxUser.setPreferredSize(new java.awt.Dimension(250, 100));

                jLabel9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
                jLabel9.setForeground(new java.awt.Color(160, 174, 192));
                jLabel9.setText("Tổng số người dùng");

                IconUser.setIcon(new javax.swing.ImageIcon("src/assets/icon/user-64.png")); // NOI18N

                jLabel10.setFont(new java.awt.Font("Arial", 1, 28)); // NOI18N
                jLabel10.setText("100");
                jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

                javax.swing.GroupLayout BoxUserLayout = new javax.swing.GroupLayout(BoxUser);
                BoxUser.setLayout(BoxUserLayout);
                BoxUserLayout.setHorizontalGroup(
                                BoxUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BoxUserLayout
                                                                .createSequentialGroup()
                                                                .addContainerGap(19, Short.MAX_VALUE)
                                                                .addComponent(IconUser,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                66,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGroup(BoxUserLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(BoxUserLayout
                                                                                                .createSequentialGroup()
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(jLabel9))
                                                                                .addGroup(BoxUserLayout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(42, 42, 42)
                                                                                                .addComponent(jLabel10,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                90,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addContainerGap()));
                BoxUserLayout.setVerticalGroup(
                                BoxUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(BoxUserLayout.createSequentialGroup()
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addGroup(BoxUserLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addGroup(BoxUserLayout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(jLabel10,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                50,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(3, 3, 3)
                                                                                                .addComponent(jLabel9))
                                                                                .addComponent(IconUser))
                                                                .addGap(15, 15, 15)));

                javax.swing.GroupLayout SideOverviewLayout = new javax.swing.GroupLayout(SideOverview);
                SideOverview.setLayout(SideOverviewLayout);
                SideOverviewLayout.setHorizontalGroup(
                                SideOverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(SideOverviewLayout.createSequentialGroup()
                                                                .addGap(75, 75, 75)
                                                                .addComponent(BoxProduct,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(94, 94, 94)
                                                                .addComponent(BoxRevenue,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(82, 82, 82)
                                                                .addComponent(BoxUser,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                261,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap()));
                SideOverviewLayout.setVerticalGroup(
                                SideOverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(SideOverviewLayout.createSequentialGroup()
                                                                .addGap(27, 27, 27)
                                                                .addGroup(SideOverviewLayout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                false)
                                                                                .addComponent(BoxProduct,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                110,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(BoxUser,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                110,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(BoxRevenue,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                110,
                                                                                                Short.MAX_VALUE))
                                                                .addContainerGap()));

                BoxProduct.getAccessibleContext().setAccessibleDescription("");

                getContentPane().add(Right, java.awt.BorderLayout.CENTER);

                Left.setBackground(new java.awt.Color(248, 249, 250));
                Left.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED,
                                java.awt.Color.white, java.awt.Color.white, java.awt.Color.white,
                                java.awt.Color.white));
                Left.setMinimumSize(new java.awt.Dimension(185, 768));
                Left.setPreferredSize(new java.awt.Dimension(185, 768));

                menu.setBackground(new java.awt.Color(248, 249, 250));
                menu.setMaximumSize(new java.awt.Dimension(160, 402));
                menu.setMinimumSize(new java.awt.Dimension(160, 402));
                menu.setPreferredSize(new java.awt.Dimension(160, 402));
                menu.setLayout(new java.awt.GridLayout(8, 1, 100, 20));

                ItemHome.setBackground(new java.awt.Color(248, 249, 250));

                HomeLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
                HomeLabel.setIcon(new javax.swing.ImageIcon("src/assets/icon/home.png")); // NOI18N
                HomeLabel.setText("Trang chủ");
                HomeLabel.setAutoscrolls(true);
                HomeLabel.setIconTextGap(10);
                HomeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                HomeLabelMouseClicked(evt);
                        }
                });

                javax.swing.GroupLayout ItemHomeLayout = new javax.swing.GroupLayout(ItemHome);
                ItemHome.setLayout(ItemHomeLayout);
                ItemHomeLayout.setHorizontalGroup(
                                ItemHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(ItemHomeLayout.createSequentialGroup()
                                                                .addGap(15, 15, 15)
                                                                .addComponent(HomeLabel,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                161, Short.MAX_VALUE)
                                                                .addContainerGap()));
                ItemHomeLayout.setVerticalGroup(
                                ItemHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(ItemHomeLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(HomeLabel,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                49, Short.MAX_VALUE)
                                                                .addContainerGap()));

                HomeLabel.getAccessibleContext().setAccessibleName("");

                menu.add(ItemHome);

                ItemProduct.setBackground(new java.awt.Color(248, 249, 250));
                ItemProduct.setMaximumSize(new java.awt.Dimension(182, 61));
                ItemProduct.setMinimumSize(new java.awt.Dimension(182, 61));

                ProductLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
                ProductLabel.setIcon(new javax.swing.ImageIcon("src/assets/icon/brand-identity.png")); // NOI18N
                ProductLabel.setText("Sản phẩm");
                ProductLabel.setAutoscrolls(true);
                ProductLabel.setIconTextGap(10);
                ProductLabel.setPreferredSize(new java.awt.Dimension(124, 32));
                ProductLabel.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                ProductLabelMouseClicked(evt);
                        }
                });

                javax.swing.GroupLayout ItemProductLayout = new javax.swing.GroupLayout(ItemProduct);
                ItemProduct.setLayout(ItemProductLayout);
                ItemProductLayout.setHorizontalGroup(
                                ItemProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(ItemProductLayout.createSequentialGroup()
                                                                .addGap(15, 15, 15)
                                                                .addComponent(ProductLabel,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                161, Short.MAX_VALUE)
                                                                .addContainerGap()));
                ItemProductLayout.setVerticalGroup(
                                ItemProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(ItemProductLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(ProductLabel,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                55,
                                                                                Short.MAX_VALUE)));

                ProductLabel.getAccessibleContext().setAccessibleName("");

                menu.add(ItemProduct);

                ItemAccount.setBackground(new java.awt.Color(248, 249, 250));

                AccountLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
                AccountLabel.setIcon(new javax.swing.ImageIcon("src/assets/icon/user.png")); // NOI18N
                AccountLabel.setText("Nhân viên");
                AccountLabel.setAutoscrolls(true);
                AccountLabel.setIconTextGap(10);
                AccountLabel.setPreferredSize(new java.awt.Dimension(124, 32));
                AccountLabel.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                EmployeeLabelMouseClicked(evt);
                        }
                });

                javax.swing.GroupLayout ItemAccountLayout = new javax.swing.GroupLayout(ItemAccount);
                ItemAccount.setLayout(ItemAccountLayout);
                ItemAccountLayout.setHorizontalGroup(
                                ItemAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(ItemAccountLayout.createSequentialGroup()
                                                                .addGap(15, 15, 15)
                                                                .addComponent(AccountLabel,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                161, Short.MAX_VALUE)
                                                                .addContainerGap()));
                ItemAccountLayout.setVerticalGroup(
                                ItemAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(AccountLabel, javax.swing.GroupLayout.Alignment.TRAILING,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, 61,
                                                                Short.MAX_VALUE));

                AccountLabel.getAccessibleContext().setAccessibleName("");

                menu.add(ItemAccount);

                ItemOrder.setBackground(new java.awt.Color(248, 249, 250));

                OrderLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
                OrderLabel.setIcon(new javax.swing.ImageIcon("src/assets/icon/checkout.png")); // NOI18N
                OrderLabel.setText("Đơn hàng");
                OrderLabel.setAutoscrolls(true);
                OrderLabel.setIconTextGap(10);
                OrderLabel.setPreferredSize(new java.awt.Dimension(124, 32));
                OrderLabel.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                OrderLabelMouseClicked(evt);
                        }
                });

                javax.swing.GroupLayout ItemOrderLayout = new javax.swing.GroupLayout(ItemOrder);
                ItemOrder.setLayout(ItemOrderLayout);
                ItemOrderLayout.setHorizontalGroup(
                                ItemOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(ItemOrderLayout.createSequentialGroup()
                                                                .addGap(15, 15, 15)
                                                                .addComponent(OrderLabel,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                161, Short.MAX_VALUE)
                                                                .addContainerGap()));
                ItemOrderLayout.setVerticalGroup(
                                ItemOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(OrderLabel, javax.swing.GroupLayout.Alignment.TRAILING,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, 61,
                                                                Short.MAX_VALUE));

                OrderLabel.getAccessibleContext().setAccessibleName("");

                menu.add(ItemOrder);

                ItemStatistical.setBackground(new java.awt.Color(248, 249, 250));

                StatisticalLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
                StatisticalLabel.setIcon(new javax.swing.ImageIcon("src/assets/icon/pie-chart.png")); // NOI18N
                StatisticalLabel.setText("Thống kê");
                StatisticalLabel.setAutoscrolls(true);
                StatisticalLabel.setIconTextGap(10);
                StatisticalLabel.setMaximumSize(new java.awt.Dimension(124, 32));
                StatisticalLabel.setMinimumSize(new java.awt.Dimension(124, 32));
                StatisticalLabel.setName(""); // NOI18N
                StatisticalLabel.setPreferredSize(new java.awt.Dimension(124, 32));
                StatisticalLabel.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                StatisticalLabelMouseClicked(evt);
                        }
                });

                javax.swing.GroupLayout ItemStatisticalLayout = new javax.swing.GroupLayout(ItemStatistical);
                ItemStatistical.setLayout(ItemStatisticalLayout);
                ItemStatisticalLayout.setHorizontalGroup(
                                ItemStatisticalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(ItemStatisticalLayout.createSequentialGroup()
                                                                .addGap(15, 15, 15)
                                                                .addComponent(StatisticalLabel,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                161,
                                                                                Short.MAX_VALUE)
                                                                .addContainerGap()));
                ItemStatisticalLayout.setVerticalGroup(
                                ItemStatisticalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(StatisticalLabel, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                61, Short.MAX_VALUE));

                StatisticalLabel.getAccessibleContext().setAccessibleName("");

                menu.add(ItemStatistical);

                ItemPermission.setBackground(new java.awt.Color(248, 249, 250));

                PermissonLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
                PermissonLabel.setIcon(new javax.swing.ImageIcon("src/assets/icon/security.png")); // NOI18N
                PermissonLabel.setText("Tài khoản");
                PermissonLabel.setIconTextGap(10);
                PermissonLabel.setMaximumSize(new java.awt.Dimension(124, 32));
                PermissonLabel.setMinimumSize(new java.awt.Dimension(124, 32));
                PermissonLabel.setPreferredSize(new java.awt.Dimension(124, 32));
                PermissonLabel.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                PermissionLabelMouseClicked(evt);
                        }
                });

                javax.swing.GroupLayout ItemPermissionLayout = new javax.swing.GroupLayout(ItemPermission);
                ItemPermission.setLayout(ItemPermissionLayout);
                ItemPermissionLayout.setHorizontalGroup(
                                ItemPermissionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 182, Short.MAX_VALUE)
                                                .addGroup(ItemPermissionLayout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                ItemPermissionLayout
                                                                                                .createSequentialGroup()
                                                                                                .addContainerGap(15,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addComponent(PermissonLabel,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                161,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addContainerGap())));
                ItemPermissionLayout.setVerticalGroup(
                                ItemPermissionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 61, Short.MAX_VALUE)
                                                .addGroup(ItemPermissionLayout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                ItemPermissionLayout
                                                                                                .createSequentialGroup()
                                                                                                .addContainerGap()
                                                                                                .addComponent(PermissonLabel,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                49,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addContainerGap())));

                menu.add(ItemPermission);

                ItemWareHouse.setBackground(new java.awt.Color(248, 249, 250));
                WareHouseLable.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
                WareHouseLable.setIcon(new javax.swing.ImageIcon("src/assets/icon/parcel.png")); // NOI18N
                WareHouseLable.setText("Kho hàng");
                WareHouseLable.setIconTextGap(12);

                WareHouseLable.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                WareHouseLabelMouseClicked(evt);
                        }
                });
                javax.swing.GroupLayout ItemWareHouseLayout = new javax.swing.GroupLayout(ItemWareHouse);
                ItemWareHouse.setLayout(ItemWareHouseLayout);
                ItemWareHouseLayout.setHorizontalGroup(
                                ItemWareHouseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 182, Short.MAX_VALUE)
                                                .addGroup(ItemWareHouseLayout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                ItemWareHouseLayout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(0, 18, Short.MAX_VALUE)
                                                                                                .addComponent(WareHouseLable,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                170,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)

                                                                )));
                ItemWareHouseLayout.setVerticalGroup(
                                ItemWareHouseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 61, Short.MAX_VALUE)
                                                .addGroup(ItemWareHouseLayout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(WareHouseLable,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                61, Short.MAX_VALUE)));

                menu.add(ItemWareHouse);
                ItemLogout.setBackground(new java.awt.Color(248, 249, 250));

                LogoutLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
                LogoutLabel.setIcon(new javax.swing.ImageIcon("src/assets/icon/logout.png")); // NOI18N
                LogoutLabel.setText("Đăng xuất");
                LogoutLabel.setIconTextGap(10);
                LogoutLabel.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                LogoutLabelMouseClicked(evt);
                        }
                });

                javax.swing.GroupLayout ItemLogoutLayout = new javax.swing.GroupLayout(ItemLogout);
                ItemLogout.setLayout(ItemLogoutLayout);
                ItemLogoutLayout.setHorizontalGroup(
                                ItemLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 182, Short.MAX_VALUE)
                                                .addGroup(ItemLogoutLayout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                ItemLogoutLayout.createSequentialGroup()
                                                                                                .addGap(0, 18, Short.MAX_VALUE)
                                                                                                .addComponent(LogoutLabel,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                164,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))));
                ItemLogoutLayout.setVerticalGroup(
                                ItemLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 61, Short.MAX_VALUE)
                                                .addGroup(ItemLogoutLayout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(LogoutLabel,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                61, Short.MAX_VALUE)));

                menu.add(ItemLogout);

                IconLabel.setIcon(new javax.swing.ImageIcon("src/assets/icon/profile-64.png")); // NOI18N

                NamePermissionLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
                NamePermissionLabel.setText("Admin");

                javax.swing.GroupLayout ProfileLayout = new javax.swing.GroupLayout(Profile);
                Profile.setLayout(ProfileLayout);
                ProfileLayout.setHorizontalGroup(
                                ProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(ProfileLayout.createSequentialGroup()
                                                                .addGap(58, 58, 58)
                                                                .addGroup(ProfileLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(NamePermissionLabel,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                53,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(IconLabel))
                                                                .addContainerGap(60, Short.MAX_VALUE)));
                ProfileLayout.setVerticalGroup(
                                ProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(ProfileLayout.createSequentialGroup()
                                                                .addComponent(IconLabel)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(NamePermissionLabel,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                28,
                                                                                Short.MAX_VALUE)
                                                                .addGap(12, 12, 12)));

                javax.swing.GroupLayout LeftLayout = new javax.swing.GroupLayout(Left);
                Left.setLayout(LeftLayout);
                LeftLayout.setHorizontalGroup(
                                LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, 182,
                                                                Short.MAX_VALUE)
                                                .addGroup(LeftLayout.createSequentialGroup()
                                                                .addComponent(Profile,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, Short.MAX_VALUE)));
                LeftLayout.setVerticalGroup(
                                LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(LeftLayout.createSequentialGroup()
                                                                .addComponent(Profile,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(menu,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                552,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap()));

                getContentPane().add(Left, java.awt.BorderLayout.LINE_START);

                pack();
        }// </editor-fold>

        private void HoverMenu() {
                HomeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
                        @Override
                        public void mouseEntered(java.awt.event.MouseEvent evt) {
                                if (!HomeLabel.getForeground().equals(Color.RED)) {
                                        ItemHome.setBackground(Color.GREEN);
                                }
                        }

                        @Override
                        public void mouseExited(java.awt.event.MouseEvent evt) {
                                if (!HomeLabel.getForeground().equals(Color.RED)) {
                                        ItemHome.setBackground(new Color(248, 249, 250));
                                }
                        }
                });
                ProductLabel.addMouseListener(new java.awt.event.MouseAdapter() {
                        @Override
                        public void mouseEntered(java.awt.event.MouseEvent evt) {
                                if (!ProductLabel.getForeground().equals(Color.RED)) {
                                        ItemProduct.setBackground(Color.GREEN);
                                }
                        }

                        @Override
                        public void mouseExited(java.awt.event.MouseEvent evt) {
                                if (!ProductLabel.getForeground().equals(Color.RED)) {
                                        ItemProduct.setBackground(new Color(248, 249, 250));
                                }
                        }
                });
                AccountLabel.addMouseListener(new java.awt.event.MouseAdapter() {
                        @Override
                        public void mouseEntered(java.awt.event.MouseEvent evt) {
                                if (!AccountLabel.getForeground().equals(Color.RED)) {
                                        ItemAccount.setBackground(Color.GREEN);
                                }
                        }

                        @Override
                        public void mouseExited(java.awt.event.MouseEvent evt) {
                                if (!AccountLabel.getForeground().equals(Color.RED)) {
                                        ItemAccount.setBackground(new Color(248, 249, 250));
                                }
                        }
                });
                OrderLabel.addMouseListener(new java.awt.event.MouseAdapter() {
                        @Override
                        public void mouseEntered(java.awt.event.MouseEvent evt) {
                                if (!OrderLabel.getForeground().equals(Color.RED)) {
                                        ItemOrder.setBackground(Color.GREEN);
                                }
                        }

                        @Override
                        public void mouseExited(java.awt.event.MouseEvent evt) {
                                if (!OrderLabel.getForeground().equals(Color.RED)) {
                                        ItemOrder.setBackground(new Color(248, 249, 250));
                                }
                        }
                });
                WareHouseLable.addMouseListener(new java.awt.event.MouseAdapter() {
                        @Override
                        public void mouseEntered(java.awt.event.MouseEvent evt) {
                                if (!WareHouseLable.getForeground().equals(Color.RED)) {
                                        ItemWareHouse.setBackground(Color.GREEN);
                                }
                        }

                        @Override
                        public void mouseExited(java.awt.event.MouseEvent evt) {
                                if (!WareHouseLable.getForeground().equals(Color.RED)) {
                                        ItemWareHouse.setBackground(new Color(248, 249, 250));
                                }
                        }
                });
                PermissonLabel.addMouseListener(new java.awt.event.MouseAdapter() {
                        @Override
                        public void mouseEntered(java.awt.event.MouseEvent evt) {
                                if (!PermissonLabel.getForeground().equals(Color.RED)) {
                                        ItemPermission.setBackground(Color.GREEN);
                                }
                        }

                        @Override
                        public void mouseExited(java.awt.event.MouseEvent evt) {
                                if (!PermissonLabel.getForeground().equals(Color.RED)) {
                                        ItemPermission.setBackground(new Color(248, 249, 250));
                                }
                        }
                });
                StatisticalLabel.addMouseListener(new java.awt.event.MouseAdapter() {
                        @Override
                        public void mouseEntered(java.awt.event.MouseEvent evt) {
                                if (!StatisticalLabel.getForeground().equals(Color.RED)) {
                                        ItemStatistical.setBackground(Color.GREEN);
                                }
                        }

                        @Override
                        public void mouseExited(java.awt.event.MouseEvent evt) {
                                if (!StatisticalLabel.getForeground().equals(Color.RED)) {
                                        ItemStatistical.setBackground(new Color(248, 249, 250));
                                }
                        }
                });
                LogoutLabel.addMouseListener(new java.awt.event.MouseAdapter() {
                        @Override
                        public void mouseEntered(java.awt.event.MouseEvent evt) {
                                if (!LogoutLabel.getForeground().equals(Color.RED)) {
                                        ItemLogout.setBackground(Color.GREEN);
                                }
                        }

                        @Override
                        public void mouseExited(java.awt.event.MouseEvent evt) {
                                if (!LogoutLabel.getForeground().equals(Color.RED)) {
                                        ItemLogout.setBackground(new Color(248, 249, 250));
                                }
                        }
                });
        }

        private void HoverCusorMenu() {
                HomeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
                        @Override
                        public void mouseEntered(java.awt.event.MouseEvent evt) {
                                HomeLabel.setCursor(new Cursor(Cursor.HAND_CURSOR)); // Thiết lập loại con trỏ chuột
                                                                                     // thành bàn tay khi di chuột vào
                                                                                     // label
                        }

                        @Override
                        public void mouseExited(java.awt.event.MouseEvent evt) {
                                HomeLabel.setCursor(new Cursor(Cursor.DEFAULT_CURSOR)); // Thiết lập loại con trỏ chuột
                                                                                        // mặc định khi di chuột ra khỏi
                                                                                        // label
                        }
                });
                ProductLabel.addMouseListener(new java.awt.event.MouseAdapter() {
                        @Override
                        public void mouseEntered(java.awt.event.MouseEvent evt) {
                                ProductLabel.setCursor(new Cursor(Cursor.HAND_CURSOR)); // Thiết lập loại con trỏ chuột
                                                                                        // thành bàn tay khi di chuột
                                                                                        // vào label
                        }

                        @Override
                        public void mouseExited(java.awt.event.MouseEvent evt) {
                                ProductLabel.setCursor(new Cursor(Cursor.DEFAULT_CURSOR)); // Thiết lập loại con trỏ
                                                                                           // chuột mặc định khi di
                                                                                           // chuột ra khỏi label
                        }

                });
                AccountLabel.addMouseListener(new java.awt.event.MouseAdapter() {
                        @Override
                        public void mouseEntered(java.awt.event.MouseEvent evt) {
                                AccountLabel.setCursor(new Cursor(Cursor.HAND_CURSOR)); // Thiết lập loại con trỏ chuột
                                                                                        // thành bàn tay khi di chuột
                                                                                        // vào label
                        }

                        @Override
                        public void mouseExited(java.awt.event.MouseEvent evt) {
                                AccountLabel.setCursor(new Cursor(Cursor.DEFAULT_CURSOR)); // Thiết lập loại con trỏ
                                                                                           // chuột mặc định khi di
                                                                                           // chuột ra khỏi label
                        }

                });
                OrderLabel.addMouseListener(new java.awt.event.MouseAdapter() {
                        @Override
                        public void mouseEntered(java.awt.event.MouseEvent evt) {
                                OrderLabel.setCursor(new Cursor(Cursor.HAND_CURSOR)); // Thiết lập loại con trỏ chuột
                                                                                      // thành bàn tay khi di chuột vào
                                                                                      // label
                        }

                        @Override
                        public void mouseExited(java.awt.event.MouseEvent evt) {
                                OrderLabel.setCursor(new Cursor(Cursor.DEFAULT_CURSOR)); // Thiết lập loại con trỏ chuột
                                                                                         // mặc định khi di chuột ra
                                                                                         // khỏi label
                        }

                });
                StatisticalLabel.addMouseListener(new java.awt.event.MouseAdapter() {
                        @Override
                        public void mouseEntered(java.awt.event.MouseEvent evt) {
                                StatisticalLabel.setCursor(new Cursor(Cursor.HAND_CURSOR)); // Thiết lập loại con trỏ
                                                                                            // chuột thành bàn tay khi
                                                                                            // di chuột vào label
                        }

                        @Override
                        public void mouseExited(java.awt.event.MouseEvent evt) {
                                StatisticalLabel.setCursor(new Cursor(Cursor.DEFAULT_CURSOR)); // Thiết lập loại con trỏ
                                                                                               // chuột mặc định khi di
                                                                                               // chuột ra khỏi label
                        }

                });
                PermissonLabel.addMouseListener(new java.awt.event.MouseAdapter() {
                        @Override
                        public void mouseEntered(java.awt.event.MouseEvent evt) {
                                PermissonLabel.setCursor(new Cursor(Cursor.HAND_CURSOR)); // Thiết lập loại con trỏ
                                                                                          // chuột thành bàn tay khi di
                                                                                          // chuột vào label
                        }

                        @Override
                        public void mouseExited(java.awt.event.MouseEvent evt) {
                                PermissonLabel.setCursor(new Cursor(Cursor.DEFAULT_CURSOR)); // Thiết lập loại con trỏ
                                                                                             // chuột mặc định khi di
                                                                                             // chuột ra khỏi label
                        }

                });
                WareHouseLable.addMouseListener(new java.awt.event.MouseAdapter() {
                        @Override
                        public void mouseEntered(java.awt.event.MouseEvent evt) {
                                WareHouseLable.setCursor(new Cursor(Cursor.HAND_CURSOR)); // Thiết lập loại con trỏ
                                                                                          // chuột thành bàn tay khi di
                                                                                          // chuột vào label
                        }

                        @Override
                        public void mouseExited(java.awt.event.MouseEvent evt) {
                                WareHouseLable.setCursor(new Cursor(Cursor.DEFAULT_CURSOR)); // Thiết lập loại con trỏ
                                                                                             // chuột mặc định khi di
                                                                                             // chuột ra khỏi label
                        }

                });
                LogoutLabel.addMouseListener(new java.awt.event.MouseAdapter() {
                        @Override
                        public void mouseEntered(java.awt.event.MouseEvent evt) {
                                LogoutLabel.setCursor(new Cursor(Cursor.HAND_CURSOR)); // Thiết lập loại con trỏ chuột
                                                                                       // thành bàn tay khi di chuột vào
                                                                                       // label
                        }

                        @Override
                        public void mouseExited(java.awt.event.MouseEvent evt) {
                                LogoutLabel.setCursor(new Cursor(Cursor.DEFAULT_CURSOR)); // Thiết lập loại con trỏ
                                                                                          // chuột mặc định khi di chuột
                                                                                          // ra khỏi label
                        }

                });
        }

        private void SwitchControl() {
                Right.removeAll();
                Right.revalidate();
                Right.repaint();
        }

        private JLabel selectedLabel = null;
        private JPanel selectedPanel = null;

        private void addClickEffect(JLabel label, JPanel panel) {
                label.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                                if (selectedLabel != null) {
                                        selectedLabel.setForeground(Color.BLACK);
                                        selectedPanel.setBackground(new Color(248, 249, 250));
                                }
                                label.setForeground(Color.RED);
                                panel.setBackground(Color.PINK);
                                selectedLabel = label;
                                selectedPanel = panel;
                        }
                });
        }

        // -------------- Hàm sự kiện onclick ở menu sidebar
        // ------------------------------

        private void HomeLabelMouseClicked(java.awt.event.MouseEvent evt) {
                // SwitchControl();
                // HomeMenu homeMenu = new HomeMenu();
                // Right.add(homeMenu);
        }

        public void ProductLabelMouseClicked(java.awt.event.MouseEvent evt) {
                // SwitchControl();
                // ProductMenu productMenu = new ProductMenu();
                // Right.add(productMenu);
        }

        public void WareHouseLabelMouseClicked(java.awt.event.MouseEvent evt) {
                // SwitchControl();
                // WareHouseMenu warehouseMenu = new WareHouseMenu();
                // Right.add(warehouseMenu);
        }

        private void EmployeeLabelMouseClicked(java.awt.event.MouseEvent evt) {
                // SwitchControl();
                // EmployeeMenu employeeMenu = new EmployeeMenu();
                // Right.add(employeeMenu);
        }

        private void OrderLabelMouseClicked(java.awt.event.MouseEvent evt) {
                // SwitchControl();
                // TaiKhoan orderMenu = new TaiKhoan();
                // Right.add(orderMenu);
                
        }

        private void StatisticalLabelMouseClicked(java.awt.event.MouseEvent evt) {
                // SwitchControl();
                // StatisticalMenu statisticalMenu = new StatisticalMenu();
                // Right.add(statisticalMenu);
        }

        private void PermissionLabelMouseClicked(java.awt.event.MouseEvent evt) {
                SwitchControl();
                TaiKhoan orderMenu = new TaiKhoan();
                Right.add(orderMenu);
        }

        private void LogoutLabelMouseClicked(java.awt.event.MouseEvent evt) {

        }

        /**
         * @param args the command line arguments
         */
        public static void main(String args[]) {

                try {
                        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
                                        .getInstalledLookAndFeels()) {
                                if ("Nimbus".equals(info.getName())) {
                                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                                        break;
                                }
                        }
                } catch (ClassNotFoundException ex) {
                        java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE,
                                        null, ex);
                }
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
        private javax.swing.JPanel BoxProduct;
        private javax.swing.JPanel BoxRevenue;
        private javax.swing.JPanel BoxUser;
        private javax.swing.JLabel HomeLabel;
        private javax.swing.JLabel IconLabel;
        private javax.swing.JLabel IconUser;
        private javax.swing.JPanel ItemAccount;
        private javax.swing.JPanel ItemHome;
        private javax.swing.JPanel ItemLogout;
        private javax.swing.JPanel ItemOrder;
        private javax.swing.JPanel ItemPermission;
        private javax.swing.JPanel ItemProduct;
        private javax.swing.JPanel ItemStatistical;
        private javax.swing.JPanel Left;
        private javax.swing.JLabel LogoutLabel;
        private javax.swing.JLabel NamePermissionLabel;
        private javax.swing.JLabel PermissonLabel;
        private javax.swing.JLabel ProductLabel;
        private javax.swing.JPanel Profile;
        private javax.swing.JPanel Right;
        private javax.swing.JPanel SideOverview;
        private javax.swing.JLabel StatisticalLabel;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel10;
        private javax.swing.JLabel OrderLabel;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel8;
        private javax.swing.JLabel jLabel9;
        private javax.swing.JTabbedPane jTabbedPane1;
        private javax.swing.JPanel ItemWareHouse;
        private javax.swing.JLabel WareHouseLable;
        private javax.swing.JPanel menu;
        // End of variables declaration
}
