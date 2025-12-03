package com.mjcshuai.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 选择课程实体类
 * author:mjc
 * date:2025-11-21
 */
/*@Data
@NoArgsConstructor
@AllArgsConstructor*/
public class SelectedCourse {
    //选课id
    private Integer id;
    //学生id
    private Integer student_id;
    //课程id
    private Integer course_id;

    public SelectedCourse() {
    }

    public SelectedCourse(Integer id, Integer student_id, Integer course_id) {
        this.id = id;
        this.student_id = student_id;
        this.course_id = course_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStudent_id() {
        return student_id;
    }

    public void setStudent_id(Integer student_id) {
        this.student_id = student_id;
    }

    public Integer getCourse_id() {
        return course_id;
    }

    public void setCourse_id(Integer course_id) {
        this.course_id = course_id;
    }
}