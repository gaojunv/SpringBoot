package com.example.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * Created by GAO on 2016/12/11.
 */
//@Builder
@Getter
@Setter
public class Authority {
    private BigDecimal id;
    private String  name;
}
