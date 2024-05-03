package com.project.GUI;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

import com.project.BUS.ProductBUS;
import com.project.DTO.ProductDTO;

/**
 *
 * @author HP
 */

public class CreateProductForm extends javax.swing.JFrame {

    /**
     * Creates new form DetailProduct
     */
    public CreateProductForm() {
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

        jPanel1 = new javax.swing.JPanel();
        titleForm = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel9 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        InputChooseFile = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        BtnCreate = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(730, 528));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setLayout(new java.awt.BorderLayout());

        titleForm.setBackground(new java.awt.Color(255, 255, 255));
        titleForm.setPreferredSize(new java.awt.Dimension(602, 70));
        titleForm.setLayout(new java.awt.CardLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tạo mới sản phẩm");
        titleForm.add(jLabel1, "card2");

        jPanel1.add(titleForm, java.awt.BorderLayout.PAGE_START);

        jPanel3.setMinimumSize(new java.awt.Dimension(730, 408));
        jPanel3.setPreferredSize(new java.awt.Dimension(730, 408));
        jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 30, 10));

        jPanel6.setPreferredSize(new java.awt.Dimension(320, 40));
        jPanel6.setRequestFocusEnabled(false);
        jPanel6.setLayout(new java.awt.BorderLayout(20, 0));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Tên sản phẩm");
        jPanel6.add(jLabel3, java.awt.BorderLayout.LINE_START);
        jPanel6.add(jTextField2, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel6);

        jPanel7.setPreferredSize(new java.awt.Dimension(250, 40));
        jPanel7.setRequestFocusEnabled(false);
        jPanel7.setLayout(new java.awt.BorderLayout(20, 0));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Giá");
        jLabel4.setPreferredSize(new java.awt.Dimension(85, 17));
        jPanel7.add(jLabel4, java.awt.BorderLayout.LINE_START);
        jPanel7.add(jTextField3, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel7);

        jPanel8.setPreferredSize(new java.awt.Dimension(320, 40));
        jPanel8.setRequestFocusEnabled(false);
        jPanel8.setLayout(new java.awt.BorderLayout(20, 0));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Loại sản phẩm");
        jPanel8.add(jLabel5, java.awt.BorderLayout.LINE_START);

        jComboBox1.setModel(
                new javax.swing.DefaultComboBoxModel<>(new String[] { "Cà phê", "Trà sữa", "Soda" }));
        jPanel8.add(jComboBox1, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel8);

        jPanel9.setPreferredSize(new java.awt.Dimension(250, 40));
        jPanel9.setRequestFocusEnabled(false);
        jPanel9.setLayout(new java.awt.BorderLayout(20, 0));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("Số lượng");
        jLabel6.setPreferredSize(new java.awt.Dimension(85, 17));
        jPanel9.add(jLabel6, java.awt.BorderLayout.LINE_START);
        jPanel9.add(jTextField4, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel9);

        jPanel11.setPreferredSize(new java.awt.Dimension(320, 40));
        jPanel11.setRequestFocusEnabled(false);
        jPanel11.setLayout(new java.awt.BorderLayout(20, 0));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setText("Hình ảnh");
        jLabel8.setPreferredSize(new java.awt.Dimension(90, 17));
        jPanel11.add(jLabel8, java.awt.BorderLayout.LINE_START);

        InputChooseFile.setPreferredSize(new java.awt.Dimension(150, 22));
        InputChooseFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputChooseFileActionPerformed(evt);
            }
        });
        jPanel11.add(InputChooseFile, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel11);

        jToggleButton1.setPreferredSize(new java.awt.Dimension(180, 180));
        jPanel3.add(jToggleButton1);

        jPanel1.add(jPanel3, java.awt.BorderLayout.CENTER);

        jPanel2.setPreferredSize(new java.awt.Dimension(728, 50));
        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 30, 0));

        BtnCreate.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BtnCreate.setText("Tạo mới");
        BtnCreate.setPreferredSize(new java.awt.Dimension(100, 50));
        BtnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCreateActionPerformed(evt);
            }
        });
        jPanel2.add(BtnCreate);

        btnClose.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnClose.setText("Đóng");
        btnClose.setPreferredSize(new java.awt.Dimension(100, 50));
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        jPanel2.add(btnClose);

        jPanel1.add(jPanel2, java.awt.BorderLayout.PAGE_END);

        getContentPane().add(jPanel1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>

    private void BtnCreateActionPerformed(java.awt.event.ActionEvent evt) {
        String nameProduct = jTextField2.getText().trim();
        String urlImage = InputChooseFile.getText().trim();
        String priceString = jTextField3.getText().trim();
        String quantityString = jTextField4.getText().trim();
        String url_image = InputChooseFile.getText().trim();
        int category_id = jComboBox1.getSelectedIndex();

        // validate data
        if (url_image.isEmpty() || nameProduct.isEmpty() || urlImage.isEmpty() || priceString.isEmpty()
                || quantityString.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng điền đầy đủ thông tin", "Thông báo",
                    JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        float price = 0;
        int quantity = 0;
        try {
            price = Float.parseFloat(priceString);
            if (price < 0) {
                JOptionPane.showMessageDialog(null, "Giá phải là số phải là số lớn hơn hoặc bằng 0.");
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Giá trị không hợp lệ");
            return;
        }
        try {
            quantity = Integer.parseInt(quantityString);
            if (quantity < 0) {
                JOptionPane.showMessageDialog(null, "Số lượng phải là số lớn hơn hoặc bằng 0.");
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Giá trị không hợp lệ");
            return;
        }

        boolean check = ProductBUS
                .createProductBUS(new ProductDTO(nameProduct, urlImage, price, quantity, category_id + 1));

        if (check) {
            JOptionPane.showMessageDialog(null, "Tạo mới sản phẩm thành công.");
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "Tạo mới sản phẩm thất bại.");
            this.setVisible(false);
        }
    }

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
    }

    private void InputChooseFileActionPerformed(java.awt.event.ActionEvent evt) {
        JFileChooser fileChooser = new JFileChooser();

        // Thiết lập filter chỉ cho phép chọn các tệp ảnh
        FileNameExtensionFilter imageFilter = new FileNameExtensionFilter(
                "Image files", ImageIO.getReaderFileSuffixes());
        fileChooser.setFileFilter(imageFilter);

        // Hiển thị hộp thoại chọn tệp và kiểm tra xem người dùng đã chọn tệp nào chưa
        int result = fileChooser.showOpenDialog(this); // 'this' ở đây là JFrame hoặc JDialog chứa JTextField

        // Nếu người dùng chọn một tệp ảnh
        if (result == JFileChooser.APPROVE_OPTION) {
            // Lấy đường dẫn của tệp được chọn
            File selectedFile = fileChooser.getSelectedFile();
            String filePath = selectedFile.getAbsolutePath();

            // Lưu tệp vào thư mục trong dự án của bạn
            String destinationPath = "./src/assets/icon/" + selectedFile.getName();
            // Kiểm tra xem tệp đã tồn tại trong dự án hay không
            File destinationFile = new File(destinationPath);

            if (destinationFile.exists()) {
                // Hiển thị cảnh báo cho người dùng
                int option = JOptionPane.showConfirmDialog(this, "Hình ảnh đã tồn tại. Bạn có muốn ghi đè?",
                        "Xác nhận ghi đè", JOptionPane.YES_NO_OPTION);
                if (option == JOptionPane.YES_OPTION) {
                    // Ghi đè nếu người dùng chọn YES
                    try {
                        Files.copy(Paths.get(filePath), Paths.get(destinationPath),
                                StandardCopyOption.REPLACE_EXISTING);
                        InputChooseFile.setText(destinationPath); // Hiển thị đường dẫn mới trong JTextField
                        jToggleButton1.setIcon(new javax.swing.ImageIcon((destinationPath))); // Đặt hình ảnh mới cho
                                                                                              // JToggleButton
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            } else {
                // Copy tệp từ đường dẫn nguồn (đã chọn) vào đường dẫn đích trong dự án của bạn
                try {
                    Files.copy(Paths.get(filePath), Paths.get(destinationPath), StandardCopyOption.REPLACE_EXISTING);
                    InputChooseFile.setText(destinationPath); // Hiển thị đường dẫn mới trong JTextField
                    jToggleButton1.setIcon(new javax.swing.ImageIcon((destinationPath))); // Đặt hình ảnh mới cho
                                                                                          // JToggleButton
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
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
            java.util.logging.Logger.getLogger(CreateProductForm.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateProductForm.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateProductForm.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateProductForm.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        }
        // </editor-fold>
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateProductForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton BtnCreate;
    private javax.swing.JButton InputChooseFile;
    private javax.swing.JButton btnClose;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JPanel titleForm;
    // End of variables declaration
}
