package com.zifang.demo.mybaits3.dao;

import com.zifang.demo.mybaits3.dto.UserDTO;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserDao {

    List<UserDTO> selectAll();

    UserDTO selectById(Long id);

    List<UserDTO> selectByParam(Map<String,Object> param);

    List<UserDTO> selectIn(List<String> ids);

    UserDTO selectByUserNameOrUserNo(String userName,String userNo);

    void insertOne(UserDTO userDTO);

    void batchInsert(List<UserDTO> data);

    long updateById(@Param("record") UserDTO userDTO,@Param("id")Long id);

}
