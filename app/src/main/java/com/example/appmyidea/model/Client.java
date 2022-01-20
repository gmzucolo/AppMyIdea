package com.example.appmyidea.model;

public class Client {

    private String name;
    private String email;
    private String phone;
    private int age;
    private boolean sex;

    public Client(
            String name,
            String email,
            String phone,
            int age,
            boolean sex
    ) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail() {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone() {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge() {
        this.age = age;
    }

    public boolean getSex() {
        return sex;
    }

    public void setSex() {
        this.sex = sex;
    }

}
