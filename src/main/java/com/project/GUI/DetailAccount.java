package com.project.GUI;

import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;

import com.itextpdf.awt.geom.Dimension;
import com.project.BUS.AccountBUS;
import com.project.Common.Common;
import com.project.DTO.AccountDTO;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import com.project.DTO.PermissionAccount;

public class DetailAccount extends javax.swing.JFrame {
    private PermissionAccount permissionList;

    /**
     * Creates new form DetailProduct
     */
    public DetailAccount() {
        initComponents();
        permissionList = PermissionAccount.getInstance();
        int account_id = permissionList.getAccountId();
        AccountDTO data = AccountBUS.getDetailAccountBUS(account_id);
        loadData(data);

    }

    private void loadData(AccountDTO data) {
        jTextField1.setText(String.valueOf(data.getId()));
        jTextField3.setText(String.valueOf(data.getEmail()));
        jTextField4.setText(String.valueOf(data.getRole()));
        jTextField6.setText(String.valueOf(Common.formatedDateTime(data.getCreatedAt())));
        jTextField9.setText(String.valueOf(Common.formatedDateTime(data.getUpdatedAt())));

        jTextField2.setText(String.valueOf(data.getEmployee().getName()));
        jTextField8.setText(String.valueOf(data.getEmployee().getBirthDate()));
        jTextField5.setText(String.valueOf(data.getEmployee().getAddress()));
        jTextField7.setText(String.valueOf(data.getEmployee().getPhone()));
        jTextField10.setText(String.valueOf(data.getEmployee().getPosition()));
        jTextField12.setText(Common.formatMoney(data.getEmployee().getSalary()));

        jTextField1.setEditable(false);
        jTextField3.setEditable(false);
        jTextField4.setEditable(false);
        jTextField6.setEditable(false);
        jTextField9.setEditable(false);
        jTextField2.setEditable(false);
        jTextField8.setEditable(false);
        jTextField5.setEditable(false);
        jTextField7.setEditable(false);
        jTextField10.setEditable(false);
        jTextField12.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titleForm = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jPanel14 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jPanel15 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jPanel16 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jPanel17 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPanel20 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        jPanel22 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jPasswordField3 = new javax.swing.JPasswordField();
        jPanel24 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(807, 646));
        setPreferredSize(new java.awt.Dimension(756, 654));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));
        setLocationRelativeTo(null);

        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(807, 646));
        jPanel1.setLayout(new java.awt.BorderLayout());

        titleForm.setBackground(new java.awt.Color(255, 255, 255));
        titleForm.setPreferredSize(new java.awt.Dimension(602, 70));
        titleForm.setLayout(new java.awt.CardLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Chi tiết tài khoản");
        jLabel1.setPreferredSize(new java.awt.Dimension(180, 25));
        titleForm.add(jLabel1, "card2");

        jPanel1.add(titleForm, java.awt.BorderLayout.PAGE_START);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setMinimumSize(new java.awt.Dimension(730, 408));
        jPanel3.setPreferredSize(new java.awt.Dimension(730, 408));
        jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 30, 10));

        jPanel5.setPreferredSize(new java.awt.Dimension(300, 40));
        jPanel5.setRequestFocusEnabled(false);
        jPanel5.setLayout(new java.awt.BorderLayout(20, 0));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Mã tài khoản");
        jLabel2.setPreferredSize(new java.awt.Dimension(120, 30));
        jPanel5.add(jLabel2, java.awt.BorderLayout.LINE_START);
        jPanel5.add(jTextField1, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel5);

        jPanel6.setPreferredSize(new java.awt.Dimension(350, 40));
        jPanel6.setRequestFocusEnabled(false);
        jPanel6.setLayout(new java.awt.BorderLayout(20, 0));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Họ và tên");
        jLabel3.setPreferredSize(new java.awt.Dimension(100, 30));
        jPanel6.add(jLabel3, java.awt.BorderLayout.LINE_START);

        jTextField2.setPreferredSize(new java.awt.Dimension(300, 22));
        jPanel6.add(jTextField2, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel6);

        jPanel7.setPreferredSize(new java.awt.Dimension(300, 40));
        jPanel7.setRequestFocusEnabled(false);
        jPanel7.setLayout(new java.awt.BorderLayout(20, 0));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Email");
        jLabel4.setPreferredSize(new java.awt.Dimension(120, 30));
        jPanel7.add(jLabel4, java.awt.BorderLayout.LINE_START);
        jPanel7.add(jTextField3, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel7);

        jPanel8.setPreferredSize(new java.awt.Dimension(350, 40));
        jPanel8.setRequestFocusEnabled(false);
        jPanel8.setLayout(new java.awt.BorderLayout(20, 0));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Ngày sinh");
        jLabel5.setPreferredSize(new java.awt.Dimension(100, 30));
        jPanel8.add(jLabel5, java.awt.BorderLayout.LINE_START);

        jTextField8.setPreferredSize(new java.awt.Dimension(300, 22));
        jPanel8.add(jTextField8, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel8);

        jPanel9.setPreferredSize(new java.awt.Dimension(300, 40));
        jPanel9.setRequestFocusEnabled(false);
        jPanel9.setLayout(new java.awt.BorderLayout(20, 0));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("Quyền tài khoản");
        jLabel6.setPreferredSize(new java.awt.Dimension(120, 30));
        jPanel9.add(jLabel6, java.awt.BorderLayout.LINE_START);
        jPanel9.add(jTextField4, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel9);

        jPanel10.setPreferredSize(new java.awt.Dimension(350, 40));
        jPanel10.setRequestFocusEnabled(false);
        jPanel10.setLayout(new java.awt.BorderLayout(20, 0));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("Địa chỉ");
        jLabel7.setPreferredSize(new java.awt.Dimension(100, 30));
        jPanel10.add(jLabel7, java.awt.BorderLayout.LINE_START);

        jTextField5.setPreferredSize(new java.awt.Dimension(300, 22));
        jPanel10.add(jTextField5, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel10);

        jPanel11.setPreferredSize(new java.awt.Dimension(300, 40));
        jPanel11.setRequestFocusEnabled(false);
        jPanel11.setLayout(new java.awt.BorderLayout(20, 0));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setText("Ngày tạo");
        jLabel8.setPreferredSize(new java.awt.Dimension(120, 30));
        jPanel11.add(jLabel8, java.awt.BorderLayout.LINE_START);

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jPanel11.add(jTextField6, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel11);

        jPanel12.setPreferredSize(new java.awt.Dimension(350, 40));
        jPanel12.setRequestFocusEnabled(false);
        jPanel12.setLayout(new java.awt.BorderLayout(20, 0));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setText("Số điện thoại");
        jLabel9.setPreferredSize(new java.awt.Dimension(100, 30));
        jPanel12.add(jLabel9, java.awt.BorderLayout.LINE_START);

        jTextField7.setPreferredSize(new java.awt.Dimension(300, 22));
        jPanel12.add(jTextField7, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel12);

        jPanel13.setPreferredSize(new java.awt.Dimension(300, 40));
        jPanel13.setRequestFocusEnabled(false);
        jPanel13.setLayout(new java.awt.BorderLayout(20, 0));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setText("Cập nhật cuối");
        jLabel10.setPreferredSize(new java.awt.Dimension(120, 30));
        jPanel13.add(jLabel10, java.awt.BorderLayout.LINE_START);

        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        jPanel13.add(jTextField9, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel13);

        jPanel14.setPreferredSize(new java.awt.Dimension(350, 40));
        jPanel14.setRequestFocusEnabled(false);
        jPanel14.setLayout(new java.awt.BorderLayout(20, 0));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setText("Chức vụ");
        jLabel11.setPreferredSize(new java.awt.Dimension(100, 30));
        jPanel14.add(jLabel11, java.awt.BorderLayout.LINE_START);

        jTextField10.setPreferredSize(new java.awt.Dimension(300, 22));
        jPanel14.add(jTextField10, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel14);

        jPanel15.setPreferredSize(new java.awt.Dimension(300, 40));
        jPanel15.setRequestFocusEnabled(false);
        jPanel15.setLayout(new java.awt.BorderLayout(20, 0));

        jLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel12.setText("Cập nhật cuối");
        jLabel12.setPreferredSize(new java.awt.Dimension(120, 30));
        // jPanel15.add(jLabel12, java.awt.BorderLayout.LINE_START);

        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });
        // jPanel15.add(jTextField11, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel15);

        jPanel16.setPreferredSize(new java.awt.Dimension(350, 40));
        jPanel16.setRequestFocusEnabled(false);
        jPanel16.setLayout(new java.awt.BorderLayout(20, 0));

        jLabel13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel13.setText("Lương");
        jLabel13.setPreferredSize(new java.awt.Dimension(100, 30));
        jPanel16.add(jLabel13, java.awt.BorderLayout.LINE_START);

        jTextField12.setPreferredSize(new java.awt.Dimension(300, 22));
        jPanel16.add(jTextField12, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel16);

        jPanel17.setPreferredSize(new java.awt.Dimension(600, 25));
        jPanel17.setRequestFocusEnabled(false);
        jPanel17.setLayout(new java.awt.BorderLayout(20, 0));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel14.setText("Đổi mật khẩu");
        jLabel14.setPreferredSize(new java.awt.Dimension(120, 30));
        jPanel17.add(jLabel14, java.awt.BorderLayout.LINE_START);

        jPanel3.add(jPanel17);

        jPanel18.setPreferredSize(new java.awt.Dimension(300, 40));
        jPanel18.setRequestFocusEnabled(false);
        jPanel18.setLayout(new java.awt.BorderLayout(20, 0));

        jLabel15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel15.setText("Mật khẩu cũ");
        jLabel15.setPreferredSize(new java.awt.Dimension(120, 30));
        jPanel18.add(jLabel15, java.awt.BorderLayout.LINE_START);

        jPanel18.add(jPasswordField1, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel18);

        jPanel20.setPreferredSize(new java.awt.Dimension(300, 40));
        jPanel20.setRequestFocusEnabled(false);
        jPanel20.setLayout(new java.awt.BorderLayout(20, 0));

        jLabel17.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel17.setPreferredSize(new java.awt.Dimension(120, 30));
        jPanel20.add(jLabel17, java.awt.BorderLayout.LINE_START);

        jPanel3.add(jPanel20);

        jPanel21.setPreferredSize(new java.awt.Dimension(300, 40));
        jPanel21.setRequestFocusEnabled(false);
        jPanel21.setLayout(new java.awt.BorderLayout(20, 0));

        jLabel18.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel18.setText("Mật khẩu mới");
        jLabel18.setPreferredSize(new java.awt.Dimension(120, 30));
        jPanel21.add(jLabel18, java.awt.BorderLayout.LINE_START);

        jPanel21.add(jPasswordField2, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel21);

        jPanel22.setPreferredSize(new java.awt.Dimension(300, 40));
        jPanel22.setRequestFocusEnabled(false);
        jPanel22.setLayout(new java.awt.BorderLayout(20, 0));
        jPanel3.add(jPanel22);

        jPanel23.setPreferredSize(new java.awt.Dimension(300, 40));
        jPanel23.setRequestFocusEnabled(false);
        jPanel23.setLayout(new java.awt.BorderLayout(20, 0));

        jLabel20.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel20.setText("Nhập lại mật khẩu");
        jLabel20.setPreferredSize(new java.awt.Dimension(120, 30));
        jPanel23.add(jLabel20, java.awt.BorderLayout.LINE_START);

        jPanel23.add(jPasswordField3, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel23);

        jPanel24.setPreferredSize(new java.awt.Dimension(300, 40));
        jPanel24.setRequestFocusEnabled(false);
        jPanel24.setLayout(new java.awt.BorderLayout(20, 0));

        jButton4.setText("Đổi mật khẩu");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }

        });
        jPanel24.add(jButton4, java.awt.BorderLayout.LINE_START);

        jPanel3.add(jPanel24);

        jPanel1.add(jPanel3, java.awt.BorderLayout.CENTER);

        jPanel2.setPreferredSize(new java.awt.Dimension(728, 50));
        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 30, 0));

        jButton2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton2.setText("Đóng");
        jButton2.setPreferredSize(new java.awt.Dimension(100, 50));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);

        jPanel1.add(jPanel2, java.awt.BorderLayout.PAGE_END);

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
    }

    private void jButton4ActionPerformed(ActionEvent evt) {
        // change password
        String oldPassword = String.valueOf(jPasswordField1.getPassword());
        String newPassword = String.valueOf(jPasswordField2.getPassword());
        String confirmPassword = String.valueOf(jPasswordField3.getPassword());

        if (oldPassword.isEmpty() || newPassword.isEmpty() || confirmPassword.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin");
            return;

        } else if (!newPassword.equals(confirmPassword)) {
            JOptionPane.showMessageDialog(this, "Mật khẩu không khớp");
            return;

        } else if (newPassword.length() < 6) {
            JOptionPane.showMessageDialog(this, "Mật khẩu phải lớn hơn 6 ký tự");
            return;
        }

        boolean checkUpdatePassword = AccountBUS.changePassword(permissionList.getAccountId(), oldPassword,
                newPassword);

        if (checkUpdatePassword) {
            JOptionPane.showMessageDialog(this, "Đổi mật khẩu thành công");
            jPasswordField1.setText("");
            jPasswordField2.setText("");
            jPasswordField3.setText("");
            return;
        }

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DetailAccount.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetailAccount.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetailAccount.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetailAccount.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DetailAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPasswordField jPasswordField3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JPanel titleForm;
    // End of variables declaration
}
