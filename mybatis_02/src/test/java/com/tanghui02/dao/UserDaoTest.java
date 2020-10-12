package com.tanghui02.dao;

import com.tanghui02.model.UserModel;
import com.tanghui02.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author 唐煇
 * @Description
 * @Date 2020-10-12 21:12
 */
public class UserDaoTest {
    // 查询所有用户
    @Test
    public void getUserList() {
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
