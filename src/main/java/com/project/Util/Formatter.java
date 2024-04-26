package com.project.Util;

import java.text.NumberFormat;
import java.util.Locale;

import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;

import com.formdev.flatlaf.FlatClientProperties;

public class Formatter {
    public static String getFormatedPrice(Float price) {
        NumberFormat nf = NumberFormat.getInstance(new Locale("vn", "VN"));
        return nf.format(price);
    }

    public static void centerAlignTableCells(JTable table) {
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);

        for (int i = 0; i < table.getColumnCount(); i++) {
            table.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
    }

    public static void setPlaceHolder(JTextField txt, String placeHolderText) {
        txt.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, placeHolderText);
        txt.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
    }

}
