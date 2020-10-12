package com.tanghui04.dao;

import com.tanghui04.model.UserModel;

import java.util.List;

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
}
