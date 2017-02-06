package com.example.core.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

/**
 * Created by GAO on 2016/12/6.
 */
//@Builder
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
