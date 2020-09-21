package com.zifang.demo.mybaits3.dto;

import lombok.Data;

@Data
public class UserDTO extends BaseDTO{

    private Long id;

    private String userName;

    private String userNo;

    private Integer userType;

    private Integer status;

}
