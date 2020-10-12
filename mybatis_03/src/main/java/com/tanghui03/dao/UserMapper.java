package com.tanghui03.dao;

import com.tanghui03.model.UserModel;

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
