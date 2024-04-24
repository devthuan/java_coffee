
package com.project.GUI;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.project.BUS.*;
import com.project.DTO.*;
import com.project.GUI.*;
import java.awt.Font;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;
import javax.swing.JOptionPane;
public class PrintUser extends javax.swing.JFrame {

    public PrintUser() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jfcPrint = new javax.swing.JFileChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jfcPrint.setDialogType(javax.swing.JFileChooser.SAVE_DIALOG);
        jfcPrint.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jfcPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jfcPrintActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jfcPrint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jfcPrint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jfcPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jfcPrintActionPerformed

            String path = jfcPrint.getSelectedFile().getPath() + ".pdf";
            UserService userService = new UserService();
            try {
                Document document = new Document(PageSize.A3.rotate());
                PdfWriter pdfWriter = PdfWriter.getInstance(document, new FileOutputStream(path));
                document.open();
                com.itextpdf.text.Font font = new com.itextpdf.text.Font(com.itextpdf.text.Font.FontFamily.HELVETICA, 12);

                PdfPTable table = new PdfPTable(9);
                table.setWidthPercentage(100);
                        table.addCell(new PdfPCell(new Phrase("Text", font)));
                float[] columnWidths = { 2f, 2f, 2f, 3f, 2f, 2f, 2f, 2f, 2f };
                table.setWidths(columnWidths);
                table.addCell("Mã nhân viên");
                table.addCell("Họ và tên");
                table.addCell("Ngày sinh");
                table.addCell("Địa chỉ");
                table.addCell("Chức vụ");
                table.addCell("Số điện thoại");
                table.addCell("Lương");
                table.addCell("Ngày tạo");
                table.addCell("Mã tài khoản");

                List<User> users = userService.getAllUser();
                for (User user : users) {
                     table.addCell(String.valueOf(user.getId()));
                    table.addCell(user.getName());
                    table.addCell(String.valueOf(user.getDate()));
                    table.addCell(user.getAddress());
                    table.addCell(user.getPosition());
                    table.addCell(user.getPhone());
                    table.addCell(String.valueOf(user.getSalary()));
                    table.addCell(String.valueOf(user.getDateCreate()));
                    table.addCell(String.valueOf(user.getAccountId()));
                }

                document.add(table);
                document.close();
                JOptionPane.showMessageDialog(this, "Tạo tệp PDF thành công.");
            } catch (DocumentException | FileNotFoundException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Đã xảy ra lỗi khi tạo tệp PDF.");
            } catch (Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Đã xảy ra lỗi khi lưu file.");
            }
    }//GEN-LAST:event_jfcPrintActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser jfcPrint;
    // End of variables declaration//GEN-END:variables
}
