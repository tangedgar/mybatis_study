package com.tanghui03.dao;

import com.tanghui03.model.UserModel;
import com.tanghui03.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author 唐煇
 * @Description
 * @Date 2020-10-12 22:26
 */
public class UserMapperTest {
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
