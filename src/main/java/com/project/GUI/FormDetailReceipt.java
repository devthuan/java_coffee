/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.project.GUI;

/**
 *
 * @author thuan
 */
public class FormDetailReceipt extends javax.swing.JFrame {

    /**
     * Creates new form FormSupplier
     */
    public FormDetailReceipt() {
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

        Top = new javax.swing.JPanel();
        Ttitle = new javax.swing.JLabel();
        Center = new javax.swing.JPanel();
        BoxInfo = new javax.swing.JPanel();
        ItemIdOrder = new javax.swing.JPanel();
        NameId = new javax.swing.JLabel();
        valueId = new javax.swing.JLabel();
        ItemDateOrder = new javax.swing.JPanel();
        NameDate = new javax.swing.JLabel();
        ValueDate = new javax.swing.JLabel();
        ItemCasher = new javax.swing.JPanel();
        NameCasher = new javax.swing.JLabel();
        ValueCasher = new javax.swing.JLabel();
        ItemPaymentMethod = new javax.swing.JPanel();
        NamePaymentMethod = new javax.swing.JLabel();
        ValuePaymentMethod = new javax.swing.JLabel();
        BoxProduct = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        BoxTitleProduct = new javax.swing.JPanel();
        TitleName = new javax.swing.JLabel();
        TitlePrice = new javax.swing.JLabel();
        TitleQuantity = new javax.swing.JLabel();
        TitleTotalMoney = new javax.swing.JLabel();
        BoxProductItem = new javax.swing.JPanel();
        ValueName = new javax.swing.JLabel();
        ValuePrice = new javax.swing.JLabel();
        ValueQuantity = new javax.swing.JLabel();
        ValueSumMoney = new javax.swing.JLabel();
        BoxProductItem1 = new javax.swing.JPanel();
        ValueName1 = new javax.swing.JLabel();
        ValuePrice1 = new javax.swing.JLabel();
        ValueQuantity1 = new javax.swing.JLabel();
        ValueSumMoney1 = new javax.swing.JLabel();
        BoxProductItem2 = new javax.swing.JPanel();
        ValueName2 = new javax.swing.JLabel();
        ValuePrice2 = new javax.swing.JLabel();
        ValueQuantity2 = new javax.swing.JLabel();
        ValueSumMoney2 = new javax.swing.JLabel();
        BoxProductItem3 = new javax.swing.JPanel();
        ValueName3 = new javax.swing.JLabel();
        ValuePrice3 = new javax.swing.JLabel();
        ValueQuantity3 = new javax.swing.JLabel();
        ValueSumMoney3 = new javax.swing.JLabel();
        BoxProductItem4 = new javax.swing.JPanel();
        ValueName4 = new javax.swing.JLabel();
        ValuePrice4 = new javax.swing.JLabel();
        ValueQuantity4 = new javax.swing.JLabel();
        ValueSumMoney4 = new javax.swing.JLabel();
        BoxTotal = new javax.swing.JPanel();
        ItemTotal = new javax.swing.JPanel();
        NameTotal = new javax.swing.JLabel();
        ValueTotal = new javax.swing.JLabel();
        Bottom = new javax.swing.JPanel();
        BtnPrint = new javax.swing.JButton();
        BtnClose = new javax.swing.JButton();

        // setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(519, 600));

        Top.setMaximumSize(new java.awt.Dimension(600, 505));
        Top.setMinimumSize(new java.awt.Dimension(100, 70));
        Top.setPreferredSize(new java.awt.Dimension(722, 70));

        Ttitle.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Ttitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Ttitle.setText("Chi tiết phiếu nhập");
        Ttitle.setPreferredSize(new java.awt.Dimension(37, 50));

        javax.swing.GroupLayout TopLayout = new javax.swing.GroupLayout(Top);
        Top.setLayout(TopLayout);
        TopLayout.setHorizontalGroup(
                TopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Ttitle, javax.swing.GroupLayout.Alignment.TRAILING,
                                javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE));
        TopLayout.setVerticalGroup(
                TopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Ttitle, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE));

        getContentPane().add(Top, java.awt.BorderLayout.PAGE_START);

        Center.setMaximumSize(new java.awt.Dimension(600, 505));
        Center.setMinimumSize(new java.awt.Dimension(474, 350));
        Center.setPreferredSize(new java.awt.Dimension(474, 350));
        Center.setLayout(new java.awt.BorderLayout());

        BoxInfo.setPreferredSize(new java.awt.Dimension(644, 120));
        BoxInfo.setLayout(new java.awt.GridLayout(4, 0));

        ItemIdOrder.setPreferredSize(new java.awt.Dimension(644, 25));
        ItemIdOrder.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 30, 0));

        NameId.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        NameId.setText("Mã phiếu nhập:");
        NameId.setPreferredSize(new java.awt.Dimension(180, 33));
        ItemIdOrder.add(NameId);

        valueId.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        valueId.setText("jLabel3");
        valueId.setMinimumSize(new java.awt.Dimension(300, 25));
        valueId.setPreferredSize(new java.awt.Dimension(250, 33));
        ItemIdOrder.add(valueId);

        BoxInfo.add(ItemIdOrder);

        ItemDateOrder.setPreferredSize(new java.awt.Dimension(644, 25));
        ItemDateOrder.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 30, 0));

        NameDate.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        NameDate.setText("Ngày nhập:");
        NameDate.setPreferredSize(new java.awt.Dimension(180, 33));
        ItemDateOrder.add(NameDate);

        ValueDate.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        ValueDate.setText("jLabel3");
        ValueDate.setMinimumSize(new java.awt.Dimension(300, 25));
        ValueDate.setPreferredSize(new java.awt.Dimension(250, 33));
        ItemDateOrder.add(ValueDate);

        BoxInfo.add(ItemDateOrder);

        ItemCasher.setPreferredSize(new java.awt.Dimension(644, 25));
        ItemCasher.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 30, 0));

        NameCasher.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        NameCasher.setText("Nhà cung cấp:");
        NameCasher.setPreferredSize(new java.awt.Dimension(180, 33));
        ItemCasher.add(NameCasher);

        ValueCasher.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        ValueCasher.setText("jLabel3");
        ValueCasher.setMinimumSize(new java.awt.Dimension(300, 25));
        ValueCasher.setPreferredSize(new java.awt.Dimension(250, 33));
        ItemCasher.add(ValueCasher);

        BoxInfo.add(ItemCasher);

        ItemPaymentMethod.setPreferredSize(new java.awt.Dimension(644, 25));
        ItemPaymentMethod.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 30, 0));

        NamePaymentMethod.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        NamePaymentMethod.setText("Nhân viên cửa hàng:");
        NamePaymentMethod.setPreferredSize(new java.awt.Dimension(180, 33));
        ItemPaymentMethod.add(NamePaymentMethod);

        ValuePaymentMethod.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        ValuePaymentMethod.setText("jLabel3");
        ValuePaymentMethod.setMinimumSize(new java.awt.Dimension(300, 25));
        ValuePaymentMethod.setPreferredSize(new java.awt.Dimension(250, 33));
        ItemPaymentMethod.add(ValuePaymentMethod);

        BoxInfo.add(ItemPaymentMethod);

        Center.add(BoxInfo, java.awt.BorderLayout.PAGE_START);

        BoxProduct.setLayout(new javax.swing.BoxLayout(BoxProduct, javax.swing.BoxLayout.LINE_AXIS));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.PAGE_AXIS));

        BoxTitleProduct.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BoxTitleProduct.setMaximumSize(new java.awt.Dimension(519, 40));
        BoxTitleProduct.setMinimumSize(new java.awt.Dimension(519, 40));
        BoxTitleProduct.setPreferredSize(new java.awt.Dimension(519, 40));
        BoxTitleProduct.setLayout(new java.awt.GridLayout(1, 4));

        TitleName.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        TitleName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleName.setText("Sản phẩm");
        BoxTitleProduct.add(TitleName);

        TitlePrice.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        TitlePrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitlePrice.setText("Đơn giá");
        BoxTitleProduct.add(TitlePrice);

        TitleQuantity.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        TitleQuantity.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleQuantity.setText("Số lượng");
        BoxTitleProduct.add(TitleQuantity);

        TitleTotalMoney.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        TitleTotalMoney.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleTotalMoney.setText("Tổng tiền");
        BoxTitleProduct.add(TitleTotalMoney);

        jPanel1.add(BoxTitleProduct);

        BoxProductItem.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        BoxProductItem.setMaximumSize(new java.awt.Dimension(519, 40));
        BoxProductItem.setMinimumSize(new java.awt.Dimension(519, 40));
        BoxProductItem.setPreferredSize(new java.awt.Dimension(519, 40));
        BoxProductItem.setLayout(new java.awt.GridLayout(1, 4));

        ValueName.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ValueName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ValueName.setText("test");
        BoxProductItem.add(ValueName);

        ValuePrice.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ValuePrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ValuePrice.setText("0");
        BoxProductItem.add(ValuePrice);

        ValueQuantity.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ValueQuantity.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ValueQuantity.setText("0");
        BoxProductItem.add(ValueQuantity);

        ValueSumMoney.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ValueSumMoney.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ValueSumMoney.setText("0");
        BoxProductItem.add(ValueSumMoney);

        jPanel1.add(BoxProductItem);

        BoxProductItem1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        BoxProductItem1.setMaximumSize(new java.awt.Dimension(519, 40));
        BoxProductItem1.setMinimumSize(new java.awt.Dimension(519, 40));
        BoxProductItem1.setPreferredSize(new java.awt.Dimension(519, 40));
        BoxProductItem1.setLayout(new java.awt.GridLayout(1, 4));

        ValueName1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ValueName1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ValueName1.setText("test");
        BoxProductItem1.add(ValueName1);

        ValuePrice1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ValuePrice1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ValuePrice1.setText("0");
        BoxProductItem1.add(ValuePrice1);

        ValueQuantity1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ValueQuantity1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ValueQuantity1.setText("0");
        BoxProductItem1.add(ValueQuantity1);

        ValueSumMoney1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ValueSumMoney1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ValueSumMoney1.setText("0");
        BoxProductItem1.add(ValueSumMoney1);

        jPanel1.add(BoxProductItem1);

        BoxProductItem2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        BoxProductItem2.setMaximumSize(new java.awt.Dimension(519, 40));
        BoxProductItem2.setMinimumSize(new java.awt.Dimension(519, 40));
        BoxProductItem2.setPreferredSize(new java.awt.Dimension(519, 40));
        BoxProductItem2.setLayout(new java.awt.GridLayout(1, 4));

        ValueName2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ValueName2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ValueName2.setText("test");
        BoxProductItem2.add(ValueName2);

        ValuePrice2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ValuePrice2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ValuePrice2.setText("0");
        BoxProductItem2.add(ValuePrice2);

        ValueQuantity2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ValueQuantity2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ValueQuantity2.setText("0");
        BoxProductItem2.add(ValueQuantity2);

        ValueSumMoney2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ValueSumMoney2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ValueSumMoney2.setText("0");
        BoxProductItem2.add(ValueSumMoney2);

        jPanel1.add(BoxProductItem2);

        BoxProductItem3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        BoxProductItem3.setMaximumSize(new java.awt.Dimension(519, 40));
        BoxProductItem3.setMinimumSize(new java.awt.Dimension(519, 40));
        BoxProductItem3.setPreferredSize(new java.awt.Dimension(519, 40));
        BoxProductItem3.setLayout(new java.awt.GridLayout(1, 4));

        ValueName3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ValueName3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ValueName3.setText("test");
        BoxProductItem3.add(ValueName3);

        ValuePrice3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ValuePrice3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ValuePrice3.setText("0");
        BoxProductItem3.add(ValuePrice3);

        ValueQuantity3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ValueQuantity3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ValueQuantity3.setText("0");
        BoxProductItem3.add(ValueQuantity3);

        ValueSumMoney3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ValueSumMoney3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ValueSumMoney3.setText("0");
        BoxProductItem3.add(ValueSumMoney3);

        jPanel1.add(BoxProductItem3);

        BoxProductItem4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        BoxProductItem4.setMaximumSize(new java.awt.Dimension(519, 40));
        BoxProductItem4.setMinimumSize(new java.awt.Dimension(519, 40));
        BoxProductItem4.setPreferredSize(new java.awt.Dimension(519, 40));
        BoxProductItem4.setLayout(new java.awt.GridLayout(1, 4));

        ValueName4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ValueName4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ValueName4.setText("test");
        BoxProductItem4.add(ValueName4);

        ValuePrice4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ValuePrice4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ValuePrice4.setText("0");
        BoxProductItem4.add(ValuePrice4);

        ValueQuantity4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ValueQuantity4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ValueQuantity4.setText("0");
        BoxProductItem4.add(ValueQuantity4);

        ValueSumMoney4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ValueSumMoney4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ValueSumMoney4.setText("0");
        BoxProductItem4.add(ValueSumMoney4);

        jPanel1.add(BoxProductItem4);

        jScrollPane1.setViewportView(jPanel1);

        BoxProduct.add(jScrollPane1);

        Center.add(BoxProduct, java.awt.BorderLayout.CENTER);

        BoxTotal.setPreferredSize(new java.awt.Dimension(529, 50));

        ItemTotal.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        ItemTotal.setPreferredSize(new java.awt.Dimension(519, 40));
        ItemTotal.setLayout(new java.awt.GridLayout(1, 4));

        NameTotal.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        NameTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NameTotal.setText("Tổng cộng");
        ItemTotal.add(NameTotal);

        ValueTotal.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        ValueTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ValueTotal.setText("0 VNĐ");
        ItemTotal.add(ValueTotal);

        javax.swing.GroupLayout BoxTotalLayout = new javax.swing.GroupLayout(BoxTotal);
        BoxTotal.setLayout(BoxTotalLayout);
        BoxTotalLayout.setHorizontalGroup(
                BoxTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 578, Short.MAX_VALUE)
                        .addGroup(BoxTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(BoxTotalLayout.createSequentialGroup()
                                        .addGap(0, 29, Short.MAX_VALUE)
                                        .addComponent(ItemTotal, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 30, Short.MAX_VALUE))));
        BoxTotalLayout.setVerticalGroup(
                BoxTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 50, Short.MAX_VALUE)
                        .addGroup(BoxTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(BoxTotalLayout.createSequentialGroup()
                                        .addGap(0, 5, Short.MAX_VALUE)
                                        .addComponent(ItemTotal, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 5, Short.MAX_VALUE))));

        Center.add(BoxTotal, java.awt.BorderLayout.PAGE_END);

        getContentPane().add(Center, java.awt.BorderLayout.CENTER);

        Bottom.setMaximumSize(new java.awt.Dimension(600, 505));
        Bottom.setPreferredSize(new java.awt.Dimension(715, 55));
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 20, 0);
        flowLayout1.setAlignOnBaseline(true);
        Bottom.setLayout(flowLayout1);

        BtnPrint.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        BtnPrint.setText("In");
        BtnPrint.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        BtnPrint.setMaximumSize(new java.awt.Dimension(100, 55));
        BtnPrint.setMinimumSize(new java.awt.Dimension(100, 55));
        BtnPrint.setPreferredSize(new java.awt.Dimension(100, 55));
        BtnPrint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnPrintMouseClicked(evt);
            }
        });
        BtnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPrintActionPerformed(evt);
            }
        });
        Bottom.add(BtnPrint);

        BtnClose.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        BtnClose.setText("Đóng");
        BtnClose.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        BtnClose.setMaximumSize(new java.awt.Dimension(100, 55));
        BtnClose.setMinimumSize(new java.awt.Dimension(100, 55));
        BtnClose.setPreferredSize(new java.awt.Dimension(100, 55));
        BtnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnCloseMouseClicked(evt);
            }
        });
        BtnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCloseActionPerformed(evt);
            }
        });
        Bottom.add(BtnClose);

        getContentPane().add(Bottom, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>

    private void BtnPrintMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
    }

    private void BtnPrintActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void BtnCloseMouseClicked(java.awt.event.MouseEvent evt) {
        this.setVisible(false);
    }

    private void BtnCloseActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(FormDetailReceipt.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormDetailReceipt.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormDetailReceipt.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormDetailReceipt.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        }
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormDetailReceipt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JPanel Bottom;
    private javax.swing.JPanel BoxInfo;
    private javax.swing.JPanel BoxProduct;
    private javax.swing.JPanel BoxProductItem;
    private javax.swing.JPanel BoxProductItem1;
    private javax.swing.JPanel BoxProductItem2;
    private javax.swing.JPanel BoxProductItem3;
    private javax.swing.JPanel BoxProductItem4;
    private javax.swing.JPanel BoxTitleProduct;
    private javax.swing.JPanel BoxTotal;
    private javax.swing.JButton BtnClose;
    private javax.swing.JButton BtnPrint;
    private javax.swing.JPanel Center;
    private javax.swing.JPanel ItemCasher;
    private javax.swing.JPanel ItemDateOrder;
    private javax.swing.JPanel ItemIdOrder;
    private javax.swing.JPanel ItemPaymentMethod;
    private javax.swing.JPanel ItemTotal;
    private javax.swing.JLabel NameCasher;
    private javax.swing.JLabel NameDate;
    private javax.swing.JLabel NameId;
    private javax.swing.JLabel NamePaymentMethod;
    private javax.swing.JLabel NameTotal;
    private javax.swing.JLabel TitleName;
    private javax.swing.JLabel TitlePrice;
    private javax.swing.JLabel TitleQuantity;
    private javax.swing.JLabel TitleTotalMoney;
    private javax.swing.JPanel Top;
    private javax.swing.JLabel Ttitle;
    private javax.swing.JLabel ValueCasher;
    private javax.swing.JLabel ValueDate;
    private javax.swing.JLabel ValueName;
    private javax.swing.JLabel ValueName1;
    private javax.swing.JLabel ValueName2;
    private javax.swing.JLabel ValueName3;
    private javax.swing.JLabel ValueName4;
    private javax.swing.JLabel ValuePaymentMethod;
    private javax.swing.JLabel ValuePrice;
    private javax.swing.JLabel ValuePrice1;
    private javax.swing.JLabel ValuePrice2;
    private javax.swing.JLabel ValuePrice3;
    private javax.swing.JLabel ValuePrice4;
    private javax.swing.JLabel ValueQuantity;
    private javax.swing.JLabel ValueQuantity1;
    private javax.swing.JLabel ValueQuantity2;
    private javax.swing.JLabel ValueQuantity3;
    private javax.swing.JLabel ValueQuantity4;
    private javax.swing.JLabel ValueSumMoney;
    private javax.swing.JLabel ValueSumMoney1;
    private javax.swing.JLabel ValueSumMoney2;
    private javax.swing.JLabel ValueSumMoney3;
    private javax.swing.JLabel ValueSumMoney4;
    private javax.swing.JLabel ValueTotal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel valueId;
    // End of variables declaration
}