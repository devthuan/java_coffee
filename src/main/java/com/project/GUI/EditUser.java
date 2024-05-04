
package com.project.GUI;

import java.awt.Cursor;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

import com.project.BUS.AccountBUS;
import com.project.BUS.ActionBUS;
import com.project.BUS.UserService;
import com.project.Common.Common;
import com.project.DTO.AccountDTO;
import com.project.DTO.ActionDTO;
import com.project.DTO.User;

public class EditUser extends javax.swing.JFrame {
        UserService userService;
        User user;
        AccountBUS accountBUS;
        ActionBUS actionBUS;
        ArrayList<AccountDTO> accountDTOs;
        AccountDTO emp_account;
        ArrayList<DefaultComboBoxModel<String>> models;

        public EditUser(int userId) {
                userService = new UserService();
                accountBUS = new AccountBUS();
                actionBUS = new ActionBUS();
                userService = new UserService();
                user = userService.getIdUser(userId);
                emp_account = AccountBUS.getAccountByAccountID(user.getAccountId());
                initComponents();
                // try {
                        jtfCode.setText(String.valueOf(user.getId()));
                        jtfCode.setEnabled(false);
                        jtfname.setText(user.getName());
                        Date date = Common.convertStringtoDate(user.getDate());
                        jdcdate.setDate(date);
                        jtfaddress.setText(user.getAddress());
                        cbPosition.setSelectedItem(user.getPosition());

                        setComboBoxEmail(emp_account.getRoleId(), emp_account.getEmail());
                        cbEmail.setSelectedItem(emp_account.getEmail());

                        jtfphone.setText(user.getPhone());
                        jtfsalary.setText((Common.formatBigNumber(user.getSalary())));
                        Timestamp timestamp = user.getDateCreate();
                        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                        String formattedDateTime = dateFormat.format(timestamp);
                        jtfCreate.setText(formattedDateTime);
                        jtfCreate.setEnabled(false);
                        // Connection con = mysqlConnect.getConnection();
                        // String sql = "SELECT * FROM TaiKhoan WHERE id = ?";
                        // PreparedStatement ps = con.prepareStatement(sql);
                        // ps.setInt(1, Integer.parseInt(jtfCode.getText()));
                        // ResultSet rs = ps.executeQuery();
                        // if (rs.next()) {

                        // cbEmail.setSelectedItem(rs.getString("email"));
                        // }
                // } catch (Exception ex) {
                //         Logger.getLogger(EditUser.class.getName()).log(Level.SEVERE, null, ex);
                // }
        }

        private void initComponents() {
                setTitle("Cập nhật thông tin nhân viên");
                setResizable(false);
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
                cbPosition = new javax.swing.JComboBox<>();
                btnEdit = new javax.swing.JButton();
                jLabel1 = new javax.swing.JLabel();
                cbEmail = new javax.swing.JComboBox<>();
                displayPosition();
                setModels();

                setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

                jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Chỉnh sửa nhân viên",
                                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
                                javax.swing.border.TitledBorder.DEFAULT_POSITION,
                                new java.awt.Font("Arial", 0, 24)));

                jLabel21.setFont(new java.awt.Font("Leelawadee UI Semilight", 2, 18));
                jLabel21.setText("Id");

                jtfCode.setFont(new java.awt.Font("Arial", 0, 14));
                jtfCode.setToolTipText("");

                jLabel22.setFont(new java.awt.Font("Leelawadee UI Semilight", 2, 18));
                jLabel22.setText("Name");

                jtfname.setFont(new java.awt.Font("Arial", 0, 14));

                jLabel23.setFont(new java.awt.Font("Leelawadee UI Semilight", 2, 18));
                jLabel23.setText("Ngày sinh");

                jdcdate.setFont(new java.awt.Font("Arial", 0, 14));

                jLabel24.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18));
                jLabel24.setText("Số điện thoại");

                jtfphone.setFont(new java.awt.Font("Arial", 0, 14));

                jLabel25.setFont(new java.awt.Font("Leelawadee UI Semilight", 2, 18));
                jLabel25.setText("Địa chỉ");

                jtfaddress.setFont(new java.awt.Font("Arial", 0, 14));

                jLabel26.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18));
                jLabel26.setText("Lương");

                jtfsalary.setFont(new java.awt.Font("Arial", 0, 14));

                jLabel27.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18));
                jLabel27.setText("Ngày tạo");

                jtfCreate.setFont(new java.awt.Font("Arial", 0, 14));

                jLabel28.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18));
                jLabel28.setText("Chức vụ");

                cbPosition.setFont(new java.awt.Font("Arial", 0, 14));
                cbPosition.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnPositionActionPerformed(evt);
                        }
                });

                btnEdit.setFont(new java.awt.Font("Arial Semibold", 2, 18));
                btnEdit.setText("Sửa");
                btnEdit.setCursor(new Cursor(Cursor.HAND_CURSOR));
                btnEdit.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnEditActionPerformed(evt);
                        }
                });

                jLabel1.setFont(new java.awt.Font("Leelawadee UI Semilight", 2, 18));
                jLabel1.setText("Email");

                cbEmail.setFont(new java.awt.Font("Arial", 0, 14));

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(14, 14, 14)
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                .addComponent(jLabel23,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                89,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                .createParallelGroup(
                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                .addComponent(jLabel26,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                62,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addComponent(jLabel25,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                80,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addComponent(jLabel28,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                Short.MAX_VALUE))))
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(42, 42, 42)
                                                                                                .addComponent(jLabel21,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                28,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addGap(31, 31, 31)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                false)
                                                                                                                .addComponent(jdcdate,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                132,
                                                                                                                                Short.MAX_VALUE)
                                                                                                                .addComponent(jtfCode))
                                                                                                .addGap(34, 34, 34)
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(jLabel22,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                59,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(jLabel24))
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                false)
                                                                                                                .addComponent(jtfphone,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                192,
                                                                                                                                Short.MAX_VALUE)
                                                                                                                .addComponent(jtfname)))
                                                                                .addComponent(jtfaddress)
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(jtfsalary,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                135,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(cbPosition,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                135,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addGap(37, 37, 37)
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addComponent(btnEdit)
                                                                                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                                .createParallelGroup(
                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                                                false)
                                                                                                                                                .addComponent(jLabel1,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                                .addComponent(jLabel27,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                89,
                                                                                                                                                                Short.MAX_VALUE))
                                                                                                                                .addGap(36, 36, 36)
                                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                                .createParallelGroup(
                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                .addComponent(jtfCreate,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                193,
                                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                                .addComponent(cbEmail,
                                                                                                                                                                0,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                Short.MAX_VALUE))))))
                                                                .addGap(35, 35, 35)));
                jPanel1Layout.setVerticalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(27, 27, 27)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(jtfname,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                35,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGroup(jPanel1Layout
                                                                                                .createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                .addComponent(jtfCode,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                35,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(jLabel22,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                35,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(jLabel21,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                35,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addGap(52, 52, 52)
                                                                .addGroup(jPanel1Layout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                false)
                                                                                .addComponent(jLabel23,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                35,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(jdcdate,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                35,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(jLabel24,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(jtfphone))
                                                                .addGap(51, 51, 51)
                                                                .addGroup(jPanel1Layout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                false)
                                                                                .addComponent(jLabel25,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                35,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(jtfaddress))
                                                                .addGap(51, 51, 51)
                                                                .addGroup(jPanel1Layout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                false)
                                                                                .addComponent(jLabel26,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                35,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(jtfsalary)
                                                                                .addComponent(jLabel27,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                35,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(jtfCreate))
                                                                .addGap(51, 51, 51)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel1Layout
                                                                                                .createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                false)
                                                                                                .addComponent(jLabel28,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                35,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addComponent(cbPosition)
                                                                                                .addComponent(jLabel1,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE))
                                                                                .addComponent(cbEmail,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                35,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                30,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(btnEdit,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                44,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(21, 21, 21)));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                                .createSequentialGroup()
                                                                .addContainerGap(35, Short.MAX_VALUE)
                                                                .addComponent(jPanel1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(30, 30, 30)));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addGap(14, 14, 14)
                                                                .addComponent(jPanel1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(19, Short.MAX_VALUE)));

                pack();
                setLocationRelativeTo(null);
        }

        private void setModels(){
                models = new ArrayList<>();
                ArrayList<AccountDTO> temp_accList;

                int size = cbPosition.getModel().getSize();
                for (int i = 0; i < size; i++) {
                        int roleID = i + 1;
                        temp_accList = accountBUS.getAll_unused(roleID);
                        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
                        for (AccountDTO acc : temp_accList) {
                                model.addElement(acc.getEmail());
                        }
                        models.add(model);
                }
        }

        private void setComboBoxEmail(int roleID, String emp_email){
                int index = roleID - 1;
                cbEmail.setModel(models.get(index));
                cbEmail.insertItemAt(emp_email, 0);
        }

        private void btnPositionActionPerformed(java.awt.event.ActionEvent evt) {
                cbEmail.setModel(models.get(cbPosition.getSelectedIndex()));
        }

        private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {
                if (jtfname.getText().trim().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Họ tên không được để trống!", "Thông báo",
                                        JOptionPane.INFORMATION_MESSAGE);
                        jtfname.requestFocus();
                        return;
                }
                if (jdcdate.getDate() == null) {
                        JOptionPane.showMessageDialog(null, "Ngày sinh không được để trống!", "Thông báo",
                                        JOptionPane.INFORMATION_MESSAGE);
                        return;
                }
                if (jtfaddress.getText().trim().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Địa chỉ không được để trống!", "Thông báo",
                                        JOptionPane.INFORMATION_MESSAGE);
                        jtfaddress.requestFocus();
                        return;
                }
                if (!Common.validateVietnamesePhoneNumber(jtfphone.getText())) {
                        JOptionPane.showMessageDialog(null, "Số điện thoại không hợp lệ!", "Thông báo",
                                        JOptionPane.INFORMATION_MESSAGE);
                        jtfphone.requestFocus();
                        return;
                }
                try {
                        Double salary = Double.parseDouble(jtfsalary.getText());
                        if (salary <= 0) {
                                JOptionPane.showMessageDialog(null, "Số tiền lương không hợp lệ!", "Thông báo",
                                                JOptionPane.INFORMATION_MESSAGE);
                                jtfsalary.requestFocus();
                                return;
                        }
                } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Số tiền lương không hợp lệ!", "Thông báo",
                                        JOptionPane.INFORMATION_MESSAGE);
                        jtfsalary.requestFocus();
                        return;
                }
                if (cbEmail.getSelectedItem() == null) {
                        JOptionPane.showMessageDialog(null, "Vui lòng chọn email!", "Thông báo",
                                        JOptionPane.INFORMATION_MESSAGE);
                        return;
                }
                int choice = JOptionPane.showConfirmDialog(null, "Xác nhận cập nhật thông tin nhân viên", "Xác nhận",
                                JOptionPane.YES_NO_OPTION);
                if (choice == JOptionPane.YES_OPTION) {
                        user.setName(jtfname.getText());
                        user.setDate(Common.formateDate(jdcdate.getDate()));
                        user.setAddress(jtfaddress.getText());
                        user.setPosition((String) cbPosition.getSelectedItem());
                        user.setPhone(jtfphone.getText());
                        user.setSalary(Float.parseFloat(jtfsalary.getText()));

                        for (AccountDTO acc : accountDTOs) {
                                if (acc.getEmail().equals(cbEmail.getSelectedItem())) {
                                        user.setAccountId(acc.getId());
                                        break;
                                }
                        }

                        boolean rs = userService.updateUser(user);
                        if (rs) {
                                JOptionPane.showMessageDialog(null, "Cập nhật thông tin nhân viên thành công",
                                                "Thông báo",
                                                JOptionPane.INFORMATION_MESSAGE);
                                new EmployeeMenu().setVisible(true);
                                this.dispose();
                        } else {
                                JOptionPane.showMessageDialog(null, "Cập nhật thất bại", "Lỗi",
                                                JOptionPane.ERROR_MESSAGE);
                        }
                }

        }

        private void displayPosition() {
                ArrayList<ActionDTO> actions = new ActionBUS().getAll();
                for (ActionDTO a : actions) {
                        cbPosition.addItem(a.getName());
                }
        }

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
        private javax.swing.JButton btnEdit;
        private javax.swing.JComboBox<String> cbEmail;
        private javax.swing.JComboBox<String> cbPosition;
        private com.toedter.calendar.JDateChooser jdcdate;
        private javax.swing.JTextField jtfCode;
        private javax.swing.JTextField jtfCreate;
        private javax.swing.JTextField jtfaddress;
        private javax.swing.JTextField jtfname;
        private javax.swing.JTextField jtfphone;
        private javax.swing.JTextField jtfsalary;
}
