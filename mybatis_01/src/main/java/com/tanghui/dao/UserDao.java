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

    /**
     * 根据ID查询数据
     *
     * @param id
     * @return User
     */
    User getUserById(int id);

    /**
     * 插入数据
     *
     * @param user
     * @return User
     */
    int addUser(User user);

    /**
     * 修改数据
     *
     * @param user
     * @return int
     */
    int updateUser(User user);

    /**
     * 根据ID删除数据
     *
     * @param id
     * @return int
     */
    int deleteUser(int id);
}
