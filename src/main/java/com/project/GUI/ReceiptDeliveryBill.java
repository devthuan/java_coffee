package com.project.GUI;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author thuan
 */
public class ReceiptDeliveryBill extends javax.swing.JPanel {

    /**
     * Creates new form ReceiptDeliveryBill
     */
    public ReceiptDeliveryBill() {
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        ReceiptComponent = new Receipt();
        deliveryBill = new DeliveryBill();

        setMinimumSize(new java.awt.Dimension(1085, 768));
        setPreferredSize(new java.awt.Dimension(1085, 768));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        jTabbedPane1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTabbedPane1.addTab("Phiếu nhập", ReceiptComponent);
        jTabbedPane1.addTab("Phiếu xuất", deliveryBill);

        add(jTabbedPane1);
    }// </editor-fold>

    // Variables declaration - do not modify
    private Receipt ReceiptComponent;
    private DeliveryBill deliveryBill;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration
}