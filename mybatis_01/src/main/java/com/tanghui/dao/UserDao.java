package com.tanghui.dao;

import com.tanghui.model.User;

import java.util.List;
import java.util.Map;

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
     * @param id int
     * @return User
     */
    User getUserById(int id);

    /**
     * 插入数据
     *
     * @param user User
     * @return User
     */
    int addUser(User user);

    /**
     * 修改数据
     *
     * @param user User
     * @return int
     */
    int updateUser(User user);

    /**
     * 根据ID删除数据
     *
     * @param id int
     * @return int
     */
    int deleteUser(int id);

    /**
     * 通过Map传入参数
     *
     * @param map Map
     * @return User
     */
    User getUserByIdMap(Map<String, Object> map);

    /**
     * 模糊查询数据
     *
     * @param value String
     * @return List<User>
     */
    List<User> getUserLike(String value);
}
