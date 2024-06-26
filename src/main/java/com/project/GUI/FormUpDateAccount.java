/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.project.GUI;

import com.project.DTO.AccountDTO;

/**
 *
 * @author admin
 */
public class FormUpDateAccount extends javax.swing.JFrame {

    /**
     * Creates new form DangKi
     */
    public FormUpDateAccount(AccountDTO account) {
        initComponents();
        jTextField1.setText(account.getEmail());
        // jComboBox1.setSelectedItem(account.getRole());
       
    // Đặt giá trị ban đầu cho JComboBox dựa trên role của account
    String role = account.getRole();
    if ("Admin".equals(role)) {
        jComboBox1.setSelectedIndex(0);
    } else if ("Manager".equals(role)) {
        jComboBox1.setSelectedIndex(1);
    } else {
        jComboBox1.setSelectedIndex(2);
    }
    }

    /*
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        signup = new javax.swing.JPanel();
        title_signUp = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        main_signUp = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        btn_signUp = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        label_daCoTK = new javax.swing.JLabel();

        // setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.FlowLayout());

        signup.setMaximumSize(null);
        signup.setOpaque(false);
        signup.setPreferredSize(new java.awt.Dimension(600, 350));
        signup.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 10));

        title_signUp.setLayout(new java.awt.CardLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("./src/assets/icon/add(1).png")); // NOI18N
        jLabel1.setText("Cập nhật");
        jLabel1.setPreferredSize(new java.awt.Dimension(400, 25));
        title_signUp.add(jLabel1, "card2");

        signup.add(title_signUp);

        main_signUp.setMinimumSize(new java.awt.Dimension(400, 96));
        main_signUp.setPreferredSize(new java.awt.Dimension(400, 150));
        main_signUp.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 30));

        jPanel2.setPreferredSize(new java.awt.Dimension(400, 22));
        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.X_AXIS));

        jLabel2.setIcon(new javax.swing.ImageIcon("./src/assets/icon/mail(1).png")); // NOI18N
        jLabel2.setText("Email");
        jLabel2.setPreferredSize(new java.awt.Dimension(100, 16));
        jPanel2.add(jLabel2);
        jPanel2.add(jTextField1);
        

        main_signUp.add(jPanel2);

        jPanel4.setPreferredSize(new java.awt.Dimension(400, 22));
        jPanel4.setLayout(new javax.swing.BoxLayout(jPanel4, javax.swing.BoxLayout.LINE_AXIS));

        jLabel3.setIcon(new javax.swing.ImageIcon("./src/assets/icon/padlock.png")); // NOI18N
        jLabel3.setText("Quyền");
        jLabel3.setPreferredSize(new java.awt.Dimension(100, 16));
        jPanel4.add(jLabel3);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Manager", "Staff" }));
        jPanel4.add(jComboBox1);

        main_signUp.add(jPanel4);

        signup.add(main_signUp);

        jPanel3.setPreferredSize(new java.awt.Dimension(400, 31));
        jPanel3.setLayout(new java.awt.CardLayout());

        btn_signUp.setBackground(new java.awt.Color(102, 204, 255));
        btn_signUp.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn_signUp.setIcon(new javax.swing.ImageIcon("./src/assets/icon/add-friend.png")); // NOI18N
        btn_signUp.setText("ĐĂNG KÝ");
        btn_signUp.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_signUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_signUpMouseClicked(evt);
            }
        });
        jPanel3.add(btn_signUp, "card2");

        signup.add(jPanel3);

        jPanel10.setPreferredSize(new java.awt.Dimension(400, 30));
        jPanel10.setLayout(new java.awt.CardLayout());

        label_daCoTK.setForeground(new java.awt.Color(102, 204, 255));
        label_daCoTK.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_daCoTK.setText("Bạn đã có tài khoản?");
        label_daCoTK.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        label_daCoTK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_daCoTKMouseClicked(evt);
            }
        });
        jPanel10.add(label_daCoTK, "card2");

        signup.add(jPanel10);

        getContentPane().add(signup);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void btn_signUpMouseClicked(java.awt.event.MouseEvent evt) {                                        
        // TODO add your handling code here:

    }                                       

    private void label_daCoTKMouseClicked(java.awt.event.MouseEvent evt) {                                          
        // TODO add your handling code here:
        signup.setVisible(false);
    }                                         

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormUpDateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormUpDateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormUpDateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormUpDateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // new FormUpDateAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btn_signUp;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel label_daCoTK;
    private javax.swing.JPanel main_signUp;
    private javax.swing.JPanel signup;
    private javax.swing.JPanel title_signUp;
    // End of variables declaration                   
}
