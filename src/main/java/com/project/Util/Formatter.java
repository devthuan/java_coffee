package com.project.Util;

import java.text.NumberFormat;
import java.util.Locale;

public class Formatter {
    public static String getFormatedPrice(Float price) {
        NumberFormat nf = NumberFormat.getInstance(new Locale("vn", "VN"));
        return nf.format(price) + " VNĐ";
    }
}
