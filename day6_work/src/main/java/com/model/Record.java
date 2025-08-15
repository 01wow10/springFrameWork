package com.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.sql.Date;
@Data
@AllArgsConstructor
public class Record {
    private int id;
    private String account;
    private Date upDateTime;
    private String category;
    private int num;
}
