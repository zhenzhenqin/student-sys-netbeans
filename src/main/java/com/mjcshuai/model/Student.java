package com.mjcshuai.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 学生实体类
 * author:mjc
 * data:2025-11-21
 */
/*@Data
@NoArgsConstructor
@AllArgsConstructor*/
public class Student {
    //学生id
    private Integer id;
    //学生姓名
    private String name;
    //学生班级id
    private Integer ClassId;
    //学生密码
    private String password;
    //学生性别
    private String sex;
    
    public Student() {
    }

    public Student(Integer id, String name, Integer classId, String password, String sex) {
        this.id = id;
        this.name = name;
        ClassId = classId;
        this.password = password;
        this.sex = sex;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getClassId() {
        return ClassId;
    }

    public void setClassId(Integer classId) {
        ClassId = classId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
