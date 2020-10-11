package com.tanghui.dao;

import com.tanghui.model.User;

import java.util.List;

/**
 * @author 唐煇
 */
public interface UserDao {
    /**
     * 查询数据
     *
     * @return List<User>
     */
    List<User> getUserList();
}
