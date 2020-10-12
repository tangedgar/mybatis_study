package com.tanghui02.dao;

import com.tanghui02.model.UserModel;

import java.util.List;

/**
 * @author 唐煇
 * @Description
 * @Date 2020-10-12 20:59
 */
public interface UserMapper {
    /**
     * 查询数据
     *
     * @return List<User>
     */
    List<UserModel> getUserList();
}
