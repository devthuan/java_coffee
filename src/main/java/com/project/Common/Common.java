package com.project.Common;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Common {

    public static String formatedDateTime(LocalDateTime datetime) {

        if (datetime == null) {
            return ""; // Or any other default value or error message you prefer
        }
        // Desired format pattern (e.g., "dd/MM/yyyy HH:mm:ss")
        String pattern = "dd/MM/yyyy HH:mm:ss";

        // Create a SimpleDateFormat object with the given pattern
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);

        // Format the LocalDateTime object to a string
        String formattedDate = sdf.format(java.sql.Timestamp.valueOf(datetime));

        // Return the formatted string
        return formattedDate;
    }

    public static LocalDateTime convertStringtoLocalDateTime(String string) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime localDateTime = LocalDateTime.parse(string, formatter);
        return localDateTime;
    }

    public static String formateDate(Date date) {
        // Tạo một đối tượng Calendar và đặt giá trị của ngày bằng ngày của startDate
        Calendar calendarStart = Calendar.getInstance();
        calendarStart.setTime(date);

        // Lấy ngày, tháng và năm từ startDate
        int startDay = calendarStart.get(Calendar.DAY_OF_MONTH);
        int startMonth = calendarStart.get(Calendar.MONTH) + 1; // Tháng bắt đầu từ 0 nên cần cộng thêm 1
        int startYear = calendarStart.get(Calendar.YEAR);

        return startYear + "-" + startMonth + "-" + startDay;
    }

    public static String formatBigNumber(float f) {
        DecimalFormat df = new DecimalFormat("#");
        return df.format(f);
    }

    public static String formatMoney(double amount) {
        // Create a DecimalFormat object with the desired pattern
        DecimalFormat df = new DecimalFormat("#,##0.00");

        // Format the amount using the DecimalFormat object
        return df.format(amount);
    }
}
