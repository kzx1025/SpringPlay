package com.springdemo.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by iceke on 17/6/8.
 */
@XmlRootElement
public class User {

    private int id;
    private String age;
    private String userName;
    public User(){
        super();
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public User(int id, String age, String userName) {
        super();
        this.id = id;
        this.age = age;
        this.userName = userName;
    }
}
