/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.project.GUI;

public class Main extends javax.swing.JFrame {

        public Main() {
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

                Right = new javax.swing.JPanel();
                Left = new javax.swing.JPanel();
                menu = new javax.swing.JPanel();
                ItemHome = new javax.swing.JPanel();
                HomeLabel = new javax.swing.JLabel();
                ItemProduct = new javax.swing.JPanel();
                ProductLabel = new javax.swing.JLabel();
                ItemAccount = new javax.swing.JPanel();
                AccountLabel = new javax.swing.JLabel();
                ItemEmployee = new javax.swing.JPanel();
                EmployeeLabel = new javax.swing.JLabel();
                ItemOrder = new javax.swing.JPanel();
                jLabel11 = new javax.swing.JLabel();
                ItemStatistical = new javax.swing.JPanel();
                StatisticalLabel = new javax.swing.JLabel();
                ItemLogout = new javax.swing.JPanel();
                jLabel12 = new javax.swing.JLabel();
                Profile = new javax.swing.JPanel();
                jLabel6 = new javax.swing.JLabel();
                jLabel13 = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setMinimumSize(new java.awt.Dimension(1270, 768));
                setType(java.awt.Window.Type.POPUP);

                Right.setMinimumSize(new java.awt.Dimension(1085, 768));
                Right.setPreferredSize(new java.awt.Dimension(1085, 768));
                Right.setRequestFocusEnabled(false);
                Right.setLayout(new java.awt.CardLayout());
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
                menu.setLayout(new java.awt.GridLayout(7, 1, 0, 20));

                ItemHome.setBackground(new java.awt.Color(248, 249, 250));
                ItemHome.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                ItemHomeMouseClicked(evt);
                        }
                });

                HomeLabel.setFont(new java.awt.Font("Arial", 0, 18)); //
                HomeLabel.setIcon(new javax.swing.ImageIcon("./src/assets/icon/home.png"));
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
                ItemProduct.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                ItemProductMouseClicked(evt);
                        }
                });

                ProductLabel.setFont(new java.awt.Font("Arial", 0, 18)); //
                ProductLabel.setIcon(new javax.swing.ImageIcon("./src/assets/icon/brand-identity.png")); //
                ProductLabel.setText("Sản phẩm");
                ProductLabel.setAutoscrolls(true);
                ProductLabel.setIconTextGap(10);
                ProductLabel.setPreferredSize(new java.awt.Dimension(124, 32));

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
                                                                                55, Short.MAX_VALUE)));

                ProductLabel.getAccessibleContext().setAccessibleName("");

                menu.add(ItemProduct);

                ItemAccount.setBackground(new java.awt.Color(248, 249, 250));
                ItemAccount.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                ItemAccountMouseClicked(evt);
                        }
                });

                AccountLabel.setFont(new java.awt.Font("Arial", 0, 18)); //
                AccountLabel.setIcon(new javax.swing.ImageIcon("./src/assets/icon/user.png"));
                AccountLabel.setText("Tài khoản");
                AccountLabel.setAutoscrolls(true);
                AccountLabel.setIconTextGap(10);
                AccountLabel.setPreferredSize(new java.awt.Dimension(124, 32));

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

                ItemEmployee.setBackground(new java.awt.Color(248, 249, 250));

                EmployeeLabel.setFont(new java.awt.Font("Arial", 0, 18)); //
                EmployeeLabel.setIcon(new javax.swing.ImageIcon("./src/assets/icon/employee.png"));
                EmployeeLabel.setText("Nhân viên");
                EmployeeLabel.setIconTextGap(10);
                EmployeeLabel.setMaximumSize(new java.awt.Dimension(124, 32));
                EmployeeLabel.setMinimumSize(new java.awt.Dimension(124, 32));
                EmployeeLabel.setPreferredSize(new java.awt.Dimension(124, 32));

                javax.swing.GroupLayout ItemEmployeeLayout = new javax.swing.GroupLayout(ItemEmployee);
                ItemEmployee.setLayout(ItemEmployeeLayout);
                ItemEmployeeLayout.setHorizontalGroup(
                                ItemEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 182, Short.MAX_VALUE)
                                                .addGroup(ItemEmployeeLayout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                ItemEmployeeLayout
                                                                                                .createSequentialGroup()
                                                                                                .addContainerGap(15,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addComponent(EmployeeLabel,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                161,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addContainerGap())));
                ItemEmployeeLayout.setVerticalGroup(
                                ItemEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 61, Short.MAX_VALUE)
                                                .addGroup(ItemEmployeeLayout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                ItemEmployeeLayout
                                                                                                .createSequentialGroup()
                                                                                                .addContainerGap()
                                                                                                .addComponent(EmployeeLabel,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                49,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addContainerGap())));

                menu.add(ItemEmployee);

                ItemOrder.setBackground(new java.awt.Color(248, 249, 250));
                ItemOrder.setMaximumSize(new java.awt.Dimension(118, 32));
                ItemOrder.setMinimumSize(new java.awt.Dimension(118, 32));

                jLabel11.setFont(new java.awt.Font("Arial", 0, 18)); //
                jLabel11.setIcon(new javax.swing.ImageIcon("./src/assets/icon/checkout.png"));
                jLabel11.setText("Đơn hàng");
                jLabel11.setIconTextGap(10);
                jLabel11.setMaximumSize(new java.awt.Dimension(124, 32));
                jLabel11.setMinimumSize(new java.awt.Dimension(124, 32));
                jLabel11.setPreferredSize(new java.awt.Dimension(124, 32));

                javax.swing.GroupLayout ItemOrderLayout = new javax.swing.GroupLayout(ItemOrder);
                ItemOrder.setLayout(ItemOrderLayout);
                ItemOrderLayout.setHorizontalGroup(
                                ItemOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ItemOrderLayout
                                                                .createSequentialGroup()
                                                                .addContainerGap(16, Short.MAX_VALUE)
                                                                .addComponent(jLabel11,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                160,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap()));
                ItemOrderLayout.setVerticalGroup(
                                ItemOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ItemOrderLayout
                                                                .createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(jLabel11,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                49, Short.MAX_VALUE)
                                                                .addContainerGap()));

                menu.add(ItemOrder);

                ItemStatistical.setBackground(new java.awt.Color(248, 249, 250));
                ItemStatistical.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                ItemStatisticalMouseClicked(evt);
                        }
                });

                StatisticalLabel.setFont(new java.awt.Font("Arial", 0, 18)); //
                StatisticalLabel.setIcon(new javax.swing.ImageIcon("./src/assets/icon/pie-chart.png")); //
                StatisticalLabel.setText("Thống kê");
                StatisticalLabel.setAutoscrolls(true);
                StatisticalLabel.setIconTextGap(10);
                StatisticalLabel.setMaximumSize(new java.awt.Dimension(124, 32));
                StatisticalLabel.setMinimumSize(new java.awt.Dimension(124, 32));
                StatisticalLabel.setName(""); //
                StatisticalLabel.setPreferredSize(new java.awt.Dimension(124, 32));

                javax.swing.GroupLayout ItemStatisticalLayout = new javax.swing.GroupLayout(ItemStatistical);
                ItemStatistical.setLayout(ItemStatisticalLayout);
                ItemStatisticalLayout.setHorizontalGroup(
                                ItemStatisticalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(ItemStatisticalLayout.createSequentialGroup()
                                                                .addGap(15, 15, 15)
                                                                .addComponent(StatisticalLabel,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                161, Short.MAX_VALUE)
                                                                .addContainerGap()));
                ItemStatisticalLayout.setVerticalGroup(
                                ItemStatisticalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(StatisticalLabel, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                61, Short.MAX_VALUE));

                StatisticalLabel.getAccessibleContext().setAccessibleName("");

                menu.add(ItemStatistical);

                ItemLogout.setBackground(new java.awt.Color(248, 249, 250));

                jLabel12.setFont(new java.awt.Font("Arial", 0, 18)); //
                jLabel12.setIcon(new javax.swing.ImageIcon("./src/assets/icon/logout.png"));
                jLabel12.setText("Đăng xuất");
                jLabel12.setIconTextGap(10);

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
                                                                                                .addComponent(jLabel12,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                164,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))));
                ItemLogoutLayout.setVerticalGroup(
                                ItemLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 61, Short.MAX_VALUE)
                                                .addGroup(ItemLogoutLayout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel12,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                61, Short.MAX_VALUE)));

                menu.add(ItemLogout);

                Profile.setBackground(new java.awt.Color(255, 255, 255));

                jLabel6.setIcon(new javax.swing.ImageIcon("./src/assets/icon/profile-64.png")); //

                jLabel13.setFont(new java.awt.Font("Arial", 0, 14)); //
                jLabel13.setText("Admin");

                javax.swing.GroupLayout ProfileLayout = new javax.swing.GroupLayout(Profile);
                Profile.setLayout(ProfileLayout);
                ProfileLayout.setHorizontalGroup(
                                ProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(ProfileLayout.createSequentialGroup()
                                                                .addGap(58, 58, 58)
                                                                .addGroup(ProfileLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(jLabel13,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                53,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel6))
                                                                .addContainerGap(60, Short.MAX_VALUE)));
                ProfileLayout.setVerticalGroup(
                                ProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(ProfileLayout.createSequentialGroup()
                                                                .addComponent(jLabel6)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel13,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                28, Short.MAX_VALUE)
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

        private void ItemStatisticalMouseClicked(java.awt.event.MouseEvent evt) {
                // TODO add your handling code here:

        }

        private void ItemAccountMouseClicked(java.awt.event.MouseEvent evt) {
                // TODO add your handling code here:
        }

        private void ItemProductMouseClicked(java.awt.event.MouseEvent evt) {

        }

        // event onclick sidebar
        private void ItemHomeMouseClicked(java.awt.event.MouseEvent evt) {
                // TODO add your handling code here:
        }

        private void HomeLabelMouseClicked(java.awt.event.MouseEvent evt) {
                Right.add(new BuyProduct()).setVisible(true);

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
        private javax.swing.JLabel EmployeeLabel;
        private javax.swing.JLabel HomeLabel;
        private javax.swing.JPanel ItemAccount;
        private javax.swing.JPanel ItemEmployee;
        private javax.swing.JPanel ItemHome;
        private javax.swing.JPanel ItemLogout;
        private javax.swing.JPanel ItemOrder;
        private javax.swing.JPanel ItemProduct;
        private javax.swing.JPanel ItemStatistical;
        private javax.swing.JPanel Left;
        private javax.swing.JLabel ProductLabel;
        private javax.swing.JPanel Profile;
        private javax.swing.JPanel Right;
        private javax.swing.JLabel StatisticalLabel;
        private javax.swing.JLabel jLabel11;
        private javax.swing.JLabel jLabel12;
        private javax.swing.JLabel jLabel13;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JPanel menu;
        // End of variables declaration
}
