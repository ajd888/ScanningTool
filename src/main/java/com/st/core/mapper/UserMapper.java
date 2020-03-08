package com.st.core.mapper;

import com.st.core.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @description:
 * @auther ajd
 * @date 2020/3/6
 */
@Mapper
public interface UserMapper {
    /**
     * 查询雇员信息列表
     * @return
     */
    List<User> getTest();

    /**
     * 新增雇员信息
     * @param user
     */
    void addUserInfo(User user);

    /**
     * 删除雇员信息
     * @param id 雇员id
     */
    void deleteUserInfo(Long id);
}
