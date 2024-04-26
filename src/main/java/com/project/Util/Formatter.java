package com.project.Util;

import java.awt.Component;
import java.awt.Font;
import java.text.NumberFormat;
import java.util.Locale;

import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

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

}
