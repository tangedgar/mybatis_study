package com.tanghui04.dao;

import com.tanghui04.model.UserModel;
import com.tanghui04.utils.InitLogRecord;
import com.tanghui04.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

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
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("startIndex", 0);
        map.put("pageSize", 2);
        List<UserModel> users = userMapper.getUserByLimit(map);
        for (UserModel user : users) {
            System.out.println(user);
        }
        // 关闭SqlSession
        sqlSession.close();
    }
}
