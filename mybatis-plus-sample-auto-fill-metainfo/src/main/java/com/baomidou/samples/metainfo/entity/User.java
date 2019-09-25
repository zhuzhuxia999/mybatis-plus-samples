package com.baomidou.samples.metainfo.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户实体
 * @author nieqiurong 2018-08-10 22:55:21.
 */
@Data
@TableName(value = "user")
@NoArgsConstructor
public class User {
    
    private Long id;

    private String name;

    private Integer age;

    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }



    public User(Long id, String name, Integer age, String email, String operator) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.operator = operator;
    }


    @TableField(fill = FieldFill.INSERT_UPDATE)
    private String operator;
}
