
package com.project.DAO;
import com.project.BUS.*;
import com.project.DTO.*;
import com.project.DTO.*;
import com.project.BUS.UserService;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.TableColumnModel;

public class EditUser extends javax.swing.JFrame {
    UserService userService;
    User user;
    public EditUser(int userId) {
        initComponents();
        try {
            displayPosition();
        } catch (Exception ex) {
            Logger.getLogger(EditUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        userService = new UserService();
        try {
            user = userService.getIdUser(userId);
            jtfCode.setText(String.valueOf(user.getId()));
            jtfCode.setEnabled(false);
            jtfname.setText(user.getName());
            Date date = user.getDate();
            jdcdate.setDate(date);
            jtfaddress.setText(user.getAddress());
            jcbbposition.setSelectedItem(user.getPosition());
            jtfphone.setText(user.getPhone());
            jtfsalary.setText(String.valueOf(user.getSalary()));
            Timestamp timestamp = user.getDateCreate();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String formattedDateTime = dateFormat.format(timestamp);
            jtfCreate.setText(formattedDateTime);
            jtfCreate.setEnabled(false);
            Connection con = mysqlConnect.getConnection();
            String sql = "SELECT * FROM TaiKhoan WHERE id = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, Integer.parseInt(jtfCode.getText()));
            ResultSet rs = ps.executeQuery();
            if(rs.next())
            {   
                
                jcbbEmail.setSelectedItem(rs.getString("email"));
            }
        } catch (Exception ex) {
            Logger.getLogger(EditUser1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jtfCode = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jtfname = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jdcdate = new com.toedter.calendar.JDateChooser();
        jLabel24 = new javax.swing.JLabel();
        jtfphone = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jtfaddress = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jtfsalary = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jtfCreate = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jcbbposition = new javax.swing.JComboBox<>();
        jbEdit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jcbbEmail = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Chỉnh sửa nhân viên", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 24))); // NOI18N

        jLabel21.setFont(new java.awt.Font("Leelawadee UI Semilight", 2, 18)); // NOI18N
        jLabel21.setText("Id");

        jtfCode.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfCode.setToolTipText("");
        jtfCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCodeActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Leelawadee UI Semilight", 2, 18)); // NOI18N
        jLabel22.setText("Name");

        jtfname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfnameActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Leelawadee UI Semilight", 2, 18)); // NOI18N
        jLabel23.setText("Ngày sinh");

        jdcdate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel24.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        jLabel24.setText("Số điện thoại");

        jtfphone.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel25.setFont(new java.awt.Font("Leelawadee UI Semilight", 2, 18)); // NOI18N
        jLabel25.setText("Địa chỉ");

        jtfaddress.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel26.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        jLabel26.setText("Lương");

        jtfsalary.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfsalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfsalaryActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        jLabel27.setText("Ngày tạo");

        jtfCreate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel28.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        jLabel28.setText("Chức vụ");

        jcbbposition.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jcbbposition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbbpositionActionPerformed(evt);
            }
        });

        jbEdit.setFont(new java.awt.Font("Segoe UI Semibold", 2, 18)); // NOI18N
        jbEdit.setText("Sửa");
        jbEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Leelawadee UI Semilight", 2, 18)); // NOI18N
        jLabel1.setText("Email");

        jcbbEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jcbbEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbbEmailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jdcdate, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                            .addComponent(jtfCode))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfphone, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                            .addComponent(jtfname)))
                    .addComponent(jtfaddress)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfsalary, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbbposition, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jbEdit)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfCreate, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                                    .addComponent(jcbbEmail, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addGap(35, 35, 35))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtfname, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtfCode, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jdcdate, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtfphone))
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jtfaddress))
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jtfsalary)
                    .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jtfCreate))
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                        .addComponent(jcbbposition)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jcbbEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jbEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCodeActionPerformed

    private void jtfnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfnameActionPerformed

    private void jcbbpositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbbpositionActionPerformed
        try {
            Connection con = mysqlConnect.getConnection();
            String sql = "SELECT * FROM TaiKhoan INNER JOIN Quyen ON TaiKhoan.Quyen_id = Quyen.id WHERE ten_quyen = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, (String) jcbbposition.getSelectedItem());
            ResultSet rs = ps.executeQuery();
            jcbbEmail.removeAllItems();
            jcbbEmail.addItem("");
            while(rs.next())
            {
                jcbbEmail.addItem(rs.getString("email"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(AddUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jcbbpositionActionPerformed

    private void jbEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditActionPerformed
        try 
        {
            user.setName(jtfname.getText());
            user.setDate(jdcdate.getDate());
            user.setAddress(jtfaddress.getText());
            user.setPosition((String) jcbbposition.getSelectedItem());
            user.setPhone(jtfphone.getText());
            user.setSalary(Float.parseFloat(jtfsalary.getText()));
            Connection con = mysqlConnect.getConnection();
            String sql = "SELECT * FROM TaiKhoan WHERE email = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, (String) jcbbEmail.getSelectedItem());
            ResultSet rs = ps.executeQuery();
            if(rs.next())
            {
                user.setAccountId(rs.getInt("id"));
            }
            try {
                userService.updateUser(user);
                new EditUser(Integer.parseInt(jtfCode.getText())).setVisible(false);
            } catch (Exception ex) {
                Logger.getLogger(EditUser.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jbEditActionPerformed

    private void jtfsalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfsalaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfsalaryActionPerformed

    private void jcbbEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbbEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbbEmailActionPerformed

   private void displayPosition() throws Exception 
    {
        Connection con = mysqlConnect.getConnection();
        String sql = "SELECT * FROM Quyen";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        jcbbposition.addItem("");
        while(rs.next())
        {
            jcbbposition.addItem(rs.getString("ten_quyen"));
        }
    }
   


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbEdit;
    private javax.swing.JComboBox<String> jcbbEmail;
    private javax.swing.JComboBox<String> jcbbposition;
    private com.toedter.calendar.JDateChooser jdcdate;
    private javax.swing.JTextField jtfCode;
    private javax.swing.JTextField jtfCreate;
    private javax.swing.JTextField jtfaddress;
    private javax.swing.JTextField jtfname;
    private javax.swing.JTextField jtfphone;
    private javax.swing.JTextField jtfsalary;
    // End of variables declaration//GEN-END:variables
}
