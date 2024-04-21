package com.project.Common;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Common {

    public static String formatedDateTime(Date date) {
        // Định dạng mong muốn (ví dụ: "dd/MM/yyyy HH:mm:ss")
        String pattern = "dd/MM/yyyy HH:mm:ss";

        // Tạo một đối tượng SimpleDateFormat với định dạng đã cho
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);

        // Định dạng đối tượng Date thành chuỗi
        String formattedDate = sdf.format(date);

        // In ra chuỗi đã định dạng
        return formattedDate;
    }

    public static String formateDate(Date date){
        // Tạo một đối tượng Calendar và đặt giá trị của ngày bằng ngày của startDate
                Calendar calendarStart = Calendar.getInstance();
                calendarStart.setTime(date);

                // Lấy ngày, tháng và năm từ startDate
                int startDay = calendarStart.get(Calendar.DAY_OF_MONTH);
                int startMonth = calendarStart.get(Calendar.MONTH) + 1; // Tháng bắt đầu từ 0 nên cần cộng thêm 1
                int startYear = calendarStart.get(Calendar.YEAR);

                return startYear + "-" + startMonth + "-" + startDay;
    }
}
