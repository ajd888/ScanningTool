package com.st.core.controller;

import com.alibaba.fastjson.JSONObject;
import com.st.core.model.User;
import com.st.core.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * @description: 测试是否正常访问
 * @auther ajd
 * @date 2020/3/6
 */
@RestController
@RequestMapping("/user/")
public class TestController
{

    @Autowired
    private UserService userService;

    /**
     * 查询雇员信息列表
     */
    @GetMapping("/listUser")
    public JSONObject listUser() throws Exception {
        JSONObject jsonObject = new JSONObject();
        try {
            List<User> list = userService.getTest();
            jsonObject.put("0","SUCCESS");
            jsonObject.put("obj",list);
        }catch (Exception e){
            jsonObject.put("1","ERROR");
        }
        return jsonObject;
    }

    /**
     * 新增雇员信息
     * @param user
     * @return
     * @throws Exception
     */
    @GetMapping("/addUserInfo")
    public JSONObject addUserInfo(User user) throws Exception{
        JSONObject jsonObject = new JSONObject();
        try {
            userService.addUserInfo(user);
            jsonObject.put("0","SUCCESS");
        }catch (Exception e){
            jsonObject.put("1","ERROR");
        }
        return jsonObject;

    }

    /**
     * 删除雇员信息
     * @param id 雇员id
     */
    @GetMapping("/deleteUserInfo")
    public JSONObject deleteUserInfo(Long id) throws Exception{
        JSONObject jsonObject = new JSONObject();
        try {
            userService.deleteUserInfo(id);
            jsonObject.put("0","SUCCESS");
        }catch (Exception e){
            jsonObject.put("1","ERROR");
        }
        return jsonObject;
    }
}
