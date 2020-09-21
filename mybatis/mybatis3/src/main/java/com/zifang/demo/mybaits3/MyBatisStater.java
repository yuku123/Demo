package com.zifang.demo.mybaits3;

import com.zifang.demo.mybaits3.dao.UserDao;
import com.zifang.demo.mybaits3.dto.UserDTO;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class MyBatisStater {

    @Test
    public void selectAll() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        List<UserDTO> userDTOS = userDao.selectAll();
        System.out.println(userDTOS);
    }

    @Test
    public void selectOne() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        UserDTO userDTO = userDao.selectById(10000L);
        System.out.println(userDTO);
    }

    @Test
    public void selectByParam(){

    }
//
//    public static void selectByParam() {
//        sqlSession.ifPresent(r -> {
//            UserDao mapper = r.getMapper(UserDao.class);
//            Map<String, Object> param = new HashMap<>();
//            param.put("user_name", "张三");
//            List<UserDTO> userDTOS1 = mapper.selectByParam(param);
//            logger.info(String.format("selectByParam : %s", JSONObject.toJSONString(userDTOS1)).toString());
//        });
//    }
//
//    public static void selectIn() {
//
//        sqlSession.ifPresent(r -> {
//
//            UserDao mapper = r.getMapper(UserDao.class);
//            List<String> ids = Arrays.asList("18779880000", "440812199102169182");
//
//            List<UserDTO> dtoList = mapper.selectIn(ids);
//
//            dtoList.forEach(dto ->logger.info(JSONObject.toJSONString(dto)));
//
//        });
//
//    }
//
//    public static void selectByUserNameOrUserNo() {
//
//        sqlSession.ifPresent(r -> {
//
//            UserDao mapper = r.getMapper(UserDao.class);
//
//            UserDTO userDTO = mapper.selectByUserNameOrUserNo("张三", "18779880000");
//
//            logger.info(JSONObject.toJSONString(userDTO));
//
//        });
//
//    }
//
//    public static void insertOne() {
//
//        UserDTO userDTO = createUser();
//
//        sqlSession.ifPresent(r -> {
//            UserDao mapper = r.getMapper(UserDao.class);
//            try {
//                mapper.insertOne(userDTO);
//                r.commit();
//            } catch (Exception e) {
//                logger.error("", e);
//            }
//        });
//
//    }
//
//    public static void batchInsert() {
//
//        sqlSession.ifPresent(r -> {
//            UserDao mapper = r.getMapper(UserDao.class);
//            try {
//
//                List<UserDTO> userDTOS = Arrays.asList(createUser(), createUser(), createUser());
//                mapper.batchInsert(userDTOS);
//                r.commit();
//            } catch (Exception e) {
//                logger.error("", e);
//            }
//        });
//
//    }
//
//    public static void updateById() {
//
//        sqlSession.ifPresent(r -> {
//            UserDao mapper = r.getMapper(UserDao.class);
//            try {
//                UserDTO userDTO = new UserDTO();
//                userDTO.setIsDeleted("Y");
//                mapper.updateById(userDTO,10000L);
//                r.commit();
//            } catch (Exception e) {
//                logger.error("", e);
//            }
//        });
//
//    }
//
//    private static UserDTO createUser() {
//
//        UserDTO userDTO = new UserDTO();
//        userDTO.setUserName(NameUtils.getName());
//        userDTO.setUserNo(IDCardNoUtils.getRandomID());
//        userDTO.setUserType(1);
//        userDTO.setStatus(1);
//
//        return userDTO;
//
//    }

}
