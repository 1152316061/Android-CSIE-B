package org.example.Android.Controller;

import com.alibaba.fastjson.JSON;
import org.example.Android.Service.UserService;
import org.example.Android.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login",produces = "text/plain;charset=utf-8")
    @ResponseBody
    public String login(String user){
        User userObj = (User) JSON.parse(user);
        String result = userService.getUserByObject(userObj);
        return JSON.toJSONString(result);
    }
}
