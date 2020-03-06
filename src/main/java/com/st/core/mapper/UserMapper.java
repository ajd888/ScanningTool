package com.st.core.mapper;

import com.st.core.mode.Test;
import org.apache.ibatis.annotations.Mapper;

/**
 * @description:
 * @auther ajd
 * @date 2020/3/6
 */
@Mapper
public interface UserMapper {
    Test getTest();
}
