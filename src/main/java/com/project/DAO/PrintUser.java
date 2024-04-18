
package com.project.DAO;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.project.BUS.*;
import com.project.DTO.*;
import com.project.GUI.*;
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

                PdfPTable table = new PdfPTable(9);
                table.setWidthPercentage(100);
                float[] columnWidths = { 1f, 2f, 2f, 3f, 2f, 2f, 2f, 2f, 1f };
                table.setWidths(columnWidths);
                table.addCell("Id");
                table.addCell("Name");
                table.addCell("Date");
                table.addCell("Address");
                table.addCell("Position");
                table.addCell("Phone");
                table.addCell("Salary");
                table.addCell("DateCreate");
                table.addCell("Id Account");

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
