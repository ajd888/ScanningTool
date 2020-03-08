package com.st.core.service;

import com.st.core.mapper.UserMapper;
import com.st.core.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @description:
 * @auther ajd
 * @date 2020/3/6
 */

@Service
@Transactional
public class UserService {

    @Autowired
    private UserMapper userMapper ;

    /**
     * 查询雇员信息列表
     * @return
     */
    public List<User> getTest() {
        return userMapper.getTest();
    }

    public void addUserInfo(User user){
        userMapper.addUserInfo(user);
    }

    /**
     * 删除雇员信息
     * @param id
     */
    public void deleteUserInfo(Long id){
        userMapper.deleteUserInfo(id);
    }
}
