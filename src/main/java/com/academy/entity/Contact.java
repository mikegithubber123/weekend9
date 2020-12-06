package com.academy.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * Created by Marcin on 2016-10-23.
 */
@Embeddable
public class Contact {

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "PHONE")
    private String phone;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
