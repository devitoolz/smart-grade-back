package com.green.smartgradever2.admin.grade_mngmn.model;

import lombok.Data;

@Data
public class GradeMngmnVo {
    private int grade;
    private int semester;
    private String lectureName;
    private String professorName;
    private int lectureScore;
    private int totalScore;
    private String rating;
}
