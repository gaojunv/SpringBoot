package com.example.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.Date;
import java.util.List;

/**
 * Created by GAO on 2016/12/6.
 */
@Builder
@Getter
@Setter
public class User {
    @Id
    private Long id;
    private String username;
    private String password;
    private String firstname;
    private String lastname;
    private String email;
    private Boolean enabled;
    private Date lastPasswordResetDate;
    private List<Authority> authorities;
}
