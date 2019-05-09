package com.cosyit.entities;


import javax.persistence.*;

// 首先告诉他一声，他是一个实体化类的entity.
@Entity
@Table(name = "tb_student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int age;

    //@Column(name = "") 列名和字段名一样，可以不需要写Column注解。
    private int youClass;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYouClass() {
        return youClass;
    }

    public void setYouClass(int youClass) {
        this.youClass = youClass;
    }
}
