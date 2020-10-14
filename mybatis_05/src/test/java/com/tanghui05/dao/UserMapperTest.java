package com.tanghui05.dao;

import com.tanghui05.model.UserModel;
import com.tanghui05.utils.InitLogRecord;
import com.tanghui05.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 唐煇
 * @Description
 * @Date 2020-10-12 22:52
 */
public class UserMapperTest {
    public static void main(String[] args) {
        // 初始化日志
        InitLogRecord.initLog();
        //获取SqlSession
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        // 执行Sql
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        List<UserModel> users = userMapper.getUserList();
        for (UserModel user : users) {
            System.out.println(user);
        }
        // 关闭SqlSession
        sqlSession.close();
    }
}
