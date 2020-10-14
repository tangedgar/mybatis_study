package com.tanghui05.dao;

import com.tanghui05.model.UserModel;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @author tanghui
 */
public interface UserMapper {
    /**
     * 注解查询数据
     *
     * @return List<User>
     */
    @Select("select * from user")
    List<UserModel> getUserList();

}
