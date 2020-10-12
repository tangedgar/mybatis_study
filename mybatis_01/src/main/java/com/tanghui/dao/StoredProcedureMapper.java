package com.tanghui.dao;

import com.tanghui.model.User;

import java.util.List;
import java.util.Map;

/**
 * Demo class
 *
 * @author tanghui
 * @date 2020/10/11
 */
public interface StoredProcedureMapper {
    /**
     * 以存储过程方式插入数据
     *
     * @param map Map
     */
    void addUser(Map<String, Object> map);

    /**
     * 以存储过程方式删除数据
     *
     * @param map Map
     */
    void deleteUser(Map<String, Object> map);

    /**
     * 以存储过程方式修改数据
     *
     * @param map Map
     */
    void updateUser(Map<String, Object> map);

    /**
     * 以存储过程方式查询数据，根据是否传入id判断查询条件
     *
     * @param map Map
     * @return List<User>
     */
    List<User> queryUser(Map<String, Object> map);
}
