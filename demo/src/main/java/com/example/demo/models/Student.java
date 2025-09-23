package com.example.demo.models;


import lombok.Data;

@Data
public class Student {
    private Long id;
    private String firstName;
    private String lastName;
    private String middleName;
    private String email;
    private Integer admissionYear;

    // Вычисляемые поля
    public String getGroup() {
        if (admissionYear == null) return "";
        String yearSuffix = String.valueOf(admissionYear).substring(2);
        return "ПИНз-1" + yearSuffix;
    }

    public String getPortalLogin() {
        if (id == null || admissionYear == null) return "";
        return "student-pinz1" + String.valueOf(admissionYear).substring(2) + "-" + id;
    }
}
