/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.project.GUI;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.KeyEvent;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

import com.project.BUS.SupplierBUS;
import com.project.Common.SupplierCommon;
import com.project.DTO.PermissionAccount;
import com.project.DTO.SupplierDTO;

/**
 *
 * @author thuan
 */
public class FormSupplier extends javax.swing.JFrame {
    private PermissionAccount permissionList;
    private int id_supplier = -1;

    public FormSupplier(String titleForm, SupplierDTO data_supplier) {

        initComponents();
        setTitle(titleForm);
        permissionList = PermissionAccount.getInstance();
        jLabel1.setText(titleForm);
        BtnAdd.setText("Thêm");

        if (data_supplier.getId() != 0) {
            BtnAdd.setText("Cập nhật");
            InputAddress.setText(data_supplier.getAddress());
            InputEmail.setText(data_supplier.getEmail());
            InputName.setText(data_supplier.getName_supplier());
            InputPhone.setText(data_supplier.getPhone());
            id_supplier = data_supplier.getId();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {
        setResizable(false);
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        BoxName = new javax.swing.JPanel();
        NameSupplier = new javax.swing.JLabel();
        InputName = new javax.swing.JTextField();
        BoxAddress = new javax.swing.JPanel();
        Address = new javax.swing.JLabel();
        InputAddress = new javax.swing.JTextField();
        BoxPhone = new javax.swing.JPanel();
        Phone = new javax.swing.JLabel();
        InputPhone = new javax.swing.JTextField();
        BoxEmail = new javax.swing.JPanel();
        Email = new javax.swing.JLabel();
        InputEmail = new javax.swing.JTextField();
        BoxBtn = new javax.swing.JPanel();
        BtnClose = new javax.swing.JButton();
        BtnAdd = new javax.swing.JButton();

        // setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1085, 768));
        setMinimumSize(new java.awt.Dimension(722, 453));

        jPanel1.setMinimumSize(new java.awt.Dimension(100, 30));
        jPanel1.setPreferredSize(new java.awt.Dimension(722, 30));
        jPanel1.setBackground(new java.awt.Color(255, 153, 102));


        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Thêm nhà cung cấp");
        jLabel1.setBackground(new java.awt.Color(255, 153, 102));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setPreferredSize(new java.awt.Dimension(37, 50));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING,
                                javax.swing.GroupLayout.DEFAULT_SIZE, 645, Short.MAX_VALUE));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE));

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setMaximumSize(new java.awt.Dimension(474, 350));
        jPanel2.setMinimumSize(new java.awt.Dimension(474, 350));
        jPanel2.setPreferredSize(new java.awt.Dimension(474, 350));
        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 20));

        BoxName.setMinimumSize(new java.awt.Dimension(400, 45));
        BoxName.setPreferredSize(new java.awt.Dimension(400, 45));
        BoxName.setLayout(new java.awt.BorderLayout(10, 0));

        NameSupplier.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        NameSupplier.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        NameSupplier.setText("Tên nhà cung cấp");
        NameSupplier.setMaximumSize(new java.awt.Dimension(130, 40));
        NameSupplier.setMinimumSize(new java.awt.Dimension(130, 40));
        NameSupplier.setPreferredSize(new java.awt.Dimension(130, 40));
        NameSupplier.setVerifyInputWhenFocusTarget(false);
        BoxName.add(NameSupplier, java.awt.BorderLayout.LINE_START);

        InputName.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BoxName.add(InputName, java.awt.BorderLayout.CENTER);

        jPanel2.add(BoxName);

        BoxAddress.setMinimumSize(new java.awt.Dimension(400, 45));
        BoxAddress.setPreferredSize(new java.awt.Dimension(400, 45));
        BoxAddress.setLayout(new java.awt.BorderLayout(10, 0));

        Address.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        Address.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Address.setText("Địa chỉ");
        Address.setMaximumSize(new java.awt.Dimension(130, 40));
        Address.setMinimumSize(new java.awt.Dimension(130, 40));
        Address.setPreferredSize(new java.awt.Dimension(130, 40));
        Address.setVerifyInputWhenFocusTarget(false);
        BoxAddress.add(Address, java.awt.BorderLayout.LINE_START);

        InputAddress.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BoxAddress.add(InputAddress, java.awt.BorderLayout.CENTER);

        jPanel2.add(BoxAddress);

        BoxPhone.setMinimumSize(new java.awt.Dimension(400, 45));
        BoxPhone.setPreferredSize(new java.awt.Dimension(400, 45));
        BoxPhone.setLayout(new java.awt.BorderLayout(10, 0));

        Phone.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        Phone.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Phone.setText("Số điện thoại");
        Phone.setMaximumSize(new java.awt.Dimension(130, 40));
        Phone.setMinimumSize(new java.awt.Dimension(130, 40));
        Phone.setPreferredSize(new java.awt.Dimension(130, 40));
        Phone.setVerifyInputWhenFocusTarget(false);
        BoxPhone.add(Phone, java.awt.BorderLayout.LINE_START);

        InputPhone.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BoxPhone.add(InputPhone, java.awt.BorderLayout.CENTER);

        jPanel2.add(BoxPhone);

        BoxEmail.setMinimumSize(new java.awt.Dimension(400, 45));
        BoxEmail.setPreferredSize(new java.awt.Dimension(400, 45));
        BoxEmail.setLayout(new java.awt.BorderLayout(10, 0));

        Email.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        Email.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Email.setText("Email");
        Email.setMaximumSize(new java.awt.Dimension(130, 40));
        Email.setMinimumSize(new java.awt.Dimension(130, 40));
        Email.setPreferredSize(new java.awt.Dimension(130, 40));
        Email.setVerifyInputWhenFocusTarget(false);
        BoxEmail.add(Email, java.awt.BorderLayout.LINE_START);

        InputEmail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BoxEmail.add(InputEmail, java.awt.BorderLayout.CENTER);

        jPanel2.add(BoxEmail);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        BoxBtn.setPreferredSize(new java.awt.Dimension(715, 55));
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 20, 0);
        flowLayout1.setAlignOnBaseline(true);
        BoxBtn.setLayout(flowLayout1);

        BtnClose.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        BtnClose.setText("Đóng");
        BtnClose.setForeground(new java.awt.Color(255, 255, 255));
        BtnClose.setBackground(java.awt.Color.RED);
        BtnClose.setCursor(new Cursor(Cursor.HAND_CURSOR));
        // BtnClose.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        BtnClose.setMaximumSize(new java.awt.Dimension(100, 55));
        BtnClose.setMinimumSize(new java.awt.Dimension(100, 55));
        BtnClose.setPreferredSize(new java.awt.Dimension(100, 55));
        BtnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnCloseMouseClicked(evt);
            }
        });
        BoxBtn.add(BtnClose);

        BtnAdd.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        BtnAdd.setText("Thêm");
        BtnAdd.setForeground(new java.awt.Color(255, 255, 255));
        BtnAdd.setBackground(new java.awt.Color(0, 191, 255));
        BtnAdd.setCursor(new Cursor(Cursor.HAND_CURSOR));
        // BtnAdd.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        BtnAdd.setMaximumSize(new java.awt.Dimension(100, 55));
        BtnAdd.setMinimumSize(new java.awt.Dimension(100, 55));
        BtnAdd.setPreferredSize(new java.awt.Dimension(100, 55));
        BtnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnAddMouseClicked(evt);
            }
        });

        BoxBtn.add(BtnAdd);
        BoxBtn.setBackground(Color.WHITE);

        getContentPane().add(BoxBtn, java.awt.BorderLayout.PAGE_END);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>

    // event clicked
    private void BtnAddMouseClicked(java.awt.event.MouseEvent evt) {
        String name_supplier = InputName.getText();
        String address = InputAddress.getText();
        String phone = InputPhone.getText();
        String email = InputEmail.getText();

        Boolean checkValidate = SupplierCommon.validateCreateSupplier(name_supplier, address, phone,
                email);

        if (checkValidate == true) {

            SupplierDTO new_supplier = new SupplierDTO(name_supplier, address, phone, email);

            if (id_supplier == -1) {
                try {
                    boolean isSupplierAdded = SupplierBUS.createdSupplier(new_supplier);
                    if (isSupplierAdded) {
                        JOptionPane.showMessageDialog(null, "Tạo nhà cung cấp thành công.");
                        // JOptionPane.showMessageDialog(null, "Tạo nhà cung cấp thành công.");
                        this.setVisible(false);

                    } else {
                        JOptionPane.showMessageDialog(null, "Lỗi khi tạo nhà cung cấp. Vui lòng thử lại.", "Lỗi",
                                JOptionPane.ERROR_MESSAGE);
                    }
                } catch (Exception e) {
                    e.printStackTrace(); // For debugging purposes (remove for production)
                    JOptionPane.showMessageDialog(null, "Có lỗi xảy ra. Vui lòng thử lại sau.", "Lỗi",
                            JOptionPane.ERROR_MESSAGE);
                }

            } else {
                try {
                    SupplierDTO update_supplier = new SupplierDTO(id_supplier, name_supplier, address, phone, email);
                    System.out.println(update_supplier.getId());
                    boolean isSupplierAdded = SupplierBUS.updateSupplier(update_supplier);
                    if (isSupplierAdded) {
                        JOptionPane.showMessageDialog(null, "Cập nhật nhà cung cấp thành công.");
                        // JOptionPane.showMessageDialog(null, "Tạo nhà cung cấp thành công.");
                        this.setVisible(false);

                    } else {
                        JOptionPane.showMessageDialog(null, "Lỗi khi cập nhật nhà cung cấp. Vui lòng thử lại.", "Lỗi",
                                JOptionPane.ERROR_MESSAGE);
                    }
                } catch (Exception e) {
                    e.printStackTrace(); // For debugging purposes (remove for production)
                    JOptionPane.showMessageDialog(null, "Có lỗi xảy ra. Vui lòng thử lại sau.", "Lỗi",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        }

    }

    private void BtnCloseMouseClicked(java.awt.event.MouseEvent evt) {
        this.setVisible(false);
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
            java.util.logging.Logger.getLogger(FormSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        // java.awt.EventQueue.invokeLater(new Runnable() {
        // public void run() {
        // new FormSupplier().setVisible(true);
        // }
        // });
    }

    // Variables declaration - do not modify
    private javax.swing.JLabel Address;
    private javax.swing.JPanel BoxAddress;
    private javax.swing.JPanel BoxBtn;
    private javax.swing.JPanel BoxEmail;
    private javax.swing.JPanel BoxName;
    private javax.swing.JPanel BoxPhone;
    private javax.swing.JButton BtnAdd;
    private javax.swing.JButton BtnClose;
    private javax.swing.JLabel Email;
    private javax.swing.JTextField InputAddress;
    private javax.swing.JTextField InputEmail;
    private javax.swing.JTextField InputName;
    private javax.swing.JTextField InputPhone;
    private javax.swing.JLabel NameSupplier;
    private javax.swing.JLabel Phone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration
}
