package com.zifang.demo.mybaits3.dto;

import lombok.Data;

import java.util.Date;

@Data
public class BaseDTO {

    private Date gmtCreated;

    private Date gmtModified;

    private String creator;

    private String modifier;

    private String isDeleted;

}
