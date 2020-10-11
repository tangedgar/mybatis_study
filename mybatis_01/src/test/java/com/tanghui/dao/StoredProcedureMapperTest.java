package com.tanghui.dao;

import com.tanghui.model.User;
import com.tanghui.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 唐煇
 * @Description
 * @Date 2020-10-11 21:40
 */
public class StoredProcedureMapperTest {
    @Test
    public void addUser() {
        //获取SqlSession
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        // 执行Sql
        StoredProcedureMapper storedProcedureMapper = sqlSession.getMapper(StoredProcedureMapper.class);
        Map<String, Object> map = new HashMap<>();
        map.put("code", 1);
        map.put("info", null);
        map.put("userid", 3);
        map.put("username", "王五");
        map.put("password", "123458");
        storedProcedureMapper.addUser(map);

        System.out.println("状态值：" + map.get("code") + "\n信息：" + map.get("info"));
        // 提交事务
        sqlSession.commit();

        // 关闭SqlSession
        sqlSession.close();
    }
}
