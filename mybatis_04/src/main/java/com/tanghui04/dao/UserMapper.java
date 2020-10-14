package com.tanghui04.dao;

import com.tanghui04.model.UserModel;

import java.util.List;
import java.util.Map;

/**
 * @author tanghui
 */
public interface UserMapper {
    /**
     * 查询数据
     *
     * @return List<User>
     */
    List<UserModel> getUserList();

    /**
     * 分页查询数据
     *
     * @param map Map
     * @return List<User>
     */
    List<UserModel> getUserByLimit(Map<String, Integer> map);
}
