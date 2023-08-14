package jython_demo;

import java.util.Date;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

public class DateAndLocalDate {
    public static void main(String[] args) {
        // Tạo một đối tượng Date
        Date date = new Date();

        // Chuyển đổi từ Date thành Instant
        Instant instant = date.toInstant();

        // Chuyển đổi từ Instant thành LocalDate sử dụng ZoneId.systemDefault()
        LocalDate localDate = instant.atZone(ZoneId.systemDefault()).toLocalDate();

        System.out.println("Date: " + date.toString());
        System.out.println("LocalDate: " + localDate);
    }
}

