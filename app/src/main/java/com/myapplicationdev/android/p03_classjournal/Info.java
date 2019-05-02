package com.myapplicationdev.android.p03_classjournal;

import java.io.Serializable;

public class Info implements Serializable {
    private String week;
    private String grade;

    public Info(String week, String grade) {
        this.week = week;
        this.grade = grade;
    }

    public String getWeek() {
        return week;
    }

    public String getGrade() {
        return grade;
    }

}
