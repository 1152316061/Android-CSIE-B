package org.example.Android.Controller;

import org.example.Android.Mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        String t = userMapper.getAllUsers().get(0).toString();
        System.out.println("====>>"+t);
        return t;
    }
}
