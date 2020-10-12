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
 * @Date 2020-10-11 21:40
 */
public class StoredProcedureMapperTest {
    // 以存储过程方式插入数据
    @Test
    public void addUser() {
        //获取SqlSession
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        // 执行Sql
        StoredProcedureMapper storedProcedureMapper = sqlSession.getMapper(StoredProcedureMapper.class);
        Map<String, Object> map = new HashMap<>();
        map.put("code", 1);
        map.put("info", null);
        map.put("userid", 1);
        map.put("username", "赵六");
        map.put("password", "123459");
        storedProcedureMapper.addUser(map);

        System.out.println("状态值：" + map.get("code") + "\n信息：" + map.get("info"));
        // 提交事务
        sqlSession.commit();

        // 关闭SqlSession
        sqlSession.close();
    }

    // 以存储过程方式查询数据
    @Test
    public void queryUser() {
        //获取SqlSession
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        // 执行Sql
        StoredProcedureMapper storedProcedureMapper = sqlSession.getMapper(StoredProcedureMapper.class);
        Map<String, Object> map = new HashMap<>();
        map.put("code", 1);
        map.put("info", null);
        map.put("userid", 0);
        List<User> users = storedProcedureMapper.queryUser(map);

        System.out.println("状态值：" + map.get("code") + "\n信息：" + map.get("info") + "\n结果数量：" + users.size());
        for (User user : users) {
            System.out.println(user);
        }
        // 关闭SqlSession
        sqlSession.close();
    }

    // 以存储过程方式删除数据
    @Test
    public void deleteUser() {
        //获取SqlSession
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        // 执行Sql
        StoredProcedureMapper storedProcedureMapper = sqlSession.getMapper(StoredProcedureMapper.class);
        Map<String, Object> map = new HashMap<>();
        map.put("code", 1);
        map.put("info", null);
        map.put("userid", 4);
        storedProcedureMapper.deleteUser(map);

        System.out.println("状态值：" + map.get("code") + "\n信息：" + map.get("info"));
        // 提交事务
        sqlSession.commit();
        // 关闭SqlSession
        sqlSession.close();
    }

    // 以存储过程方式修改数据
    @Test
    public void updateUser() {
        //获取SqlSession
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        // 执行Sql
        StoredProcedureMapper storedProcedureMapper = sqlSession.getMapper(StoredProcedureMapper.class);
        Map<String, Object> map = new HashMap<>();
        map.put("code", 1);
        map.put("info", null);
        map.put("userid", 1);
        map.put("username", "小张");
        map.put("password", "888888");
        storedProcedureMapper.updateUser(map);

        System.out.println("状态值：" + map.get("code") + "\n信息：" + map.get("info"));
        // 提交事务
        sqlSession.commit();
        // 关闭SqlSession
        sqlSession.close();
    }
}
