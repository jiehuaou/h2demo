package com.example.h2demo;

import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@Entity
@DynamicUpdate
public class Emp {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    public Long getVersion() {
        return version;
    }

//    public void setVersion(Long version) {
//        this.version = version;
//    }

    @Version
    private Long version;

    private String firstName;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    private String lastName;
    private String career;
    private String tel;
    private String addr;

}
