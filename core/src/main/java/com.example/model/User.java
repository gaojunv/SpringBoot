package com.example.model;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

/**
 * Created by GAO on 2016/12/6.
 */
@Getter
@Setter
public class User {
    private String username;
    private BigDecimal id;
    private String password;
    private String firstname;
    private String lastname;
    private String email;
    private Boolean enabled;
    private Timestamp lastPasswordResetDate;
    private List<Authority> authorities;
}
