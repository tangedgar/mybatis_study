package com.tanghui.dao;

import com.tanghui.model.User;
import com.tanghui.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author 唐煇
 * @Description
 * @Date 2020-10-11 16:08
 */
public class UserDaoTest {
    @Test
    public void test() {
        //获取SqlSession
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        // 执行Sql
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        List<User> users = userDao.getUserList();
        for (User user : users) {
            System.out.println(user);
        }
        // 关闭SqlSession
        sqlSession.close();
    }
}
