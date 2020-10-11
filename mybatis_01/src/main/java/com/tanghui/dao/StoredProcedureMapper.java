package com.tanghui.dao;

import com.tanghui.model.User;

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
}
