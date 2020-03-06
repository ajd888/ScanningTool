package com.st.core.service;

import com.st.core.mapper.UserMapper;
import com.st.core.mode.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @description:
 * @auther ajd
 * @date 2020/3/6
 */

@Service
@Transactional
public class UserService {

    @Autowired
    UserMapper userMapper;

    public Test getTest() {
        return userMapper.getTest();
    }
}
