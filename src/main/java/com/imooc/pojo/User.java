package com.imooc.pojo;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

import javax.validation.constraints.Null;
import java.util.Date;
public class User {
    private String name;
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss a",locale = "zh",timezone = "GMT+8")
    private Date birthday;
    //@JsonIgnore
    private Integer age;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer ok;

    public Integer getOk() {
        return ok;
    }

    public void setOk(Integer ok) {
        this.ok = ok;
    }

    public User(User data) {
        this.age=data.getAge();
        this.name=data.getName();
        this.birthday=data.getBirthday();
        this.ok= null;
    }

    public User() {
    }

    public static User ok(User data){
        return new User(data);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
