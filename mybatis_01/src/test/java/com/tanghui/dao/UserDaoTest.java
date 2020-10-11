package com.tanghui.dao;

import com.tanghui.model.User;
import com.tanghui.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 唐煇
 * @Description
 * @Date 2020-10-11 16:08
 */
public class UserDaoTest {
    // 查询所有用户
    @Test
    public void getUserList() {
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

    // 根据id查询用户
    @Test
    public void getUserById() {
        //获取SqlSession
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        // 执行Sql
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        User user = userDao.getUserById(1);
        System.out.println(user);
        // 关闭SqlSession
        sqlSession.close();
    }

    // 添加用户
    @Test
    public void addUser() {
        //获取SqlSession
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        // 执行Sql
        UserDao userDao = sqlSession.getMapper(UserDao.class);

        int num = userDao.addUser(new User(4, "赵六", "1233459"));
        if (num > 0) {
            System.out.println("插入成功");
        }
        // 提交事务
        sqlSession.commit();
        // 关闭SqlSession
        sqlSession.close();
    }

    // 修改用户
    @Test
    public void updateUser() {
        //获取SqlSession
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        // 执行Sql
        UserDao userDao = sqlSession.getMapper(UserDao.class);

        int num = userDao.updateUser(new User(4, "赵六", "123459"));
        if (num > 0) {
            System.out.println("修改成功");
        }
        // 提交事务
        sqlSession.commit();
        // 关闭SqlSession
        sqlSession.close();
    }

    // 删除用户
    @Test
    public void deleteUser() {
        //获取SqlSession
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        // 执行Sql
        UserDao userDao = sqlSession.getMapper(UserDao.class);

        int num = userDao.deleteUser(4);
        if (num > 0) {
            System.out.println("删除成功");
        }
        // 提交事务
        sqlSession.commit();
        // 关闭SqlSession
        sqlSession.close();
    }

    @Test
    public void getUserByIdMap() {
        //获取SqlSession
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        // 执行Sql
        UserDao userDao = sqlSession.getMapper(UserDao.class);

        Map<String, Object> map = new HashMap<>();
        map.put("user_id", 3);
        map.put("user_name", "王五");
        User user = userDao.getUserByIdMap(map);
        System.out.println(user);
        // 关闭SqlSession
        sqlSession.close();
    }

    @Test
    public void getUserLike() {
        //获取SqlSession
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        // 执行Sql
        UserDao userDao = sqlSession.getMapper(UserDao.class);

        List<User> users = userDao.getUserLike("%三%");
        for (User user : users) {
            System.out.println(user);
        }
        // 关闭SqlSession
        sqlSession.close();
    }
}
