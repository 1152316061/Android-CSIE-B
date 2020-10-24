package org.example.Android.Controller;

import com.alibaba.fastjson.JSON;
import org.example.Android.Service.LocService;
import org.example.Android.pojo.Myloc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LocController {
    @Autowired
    private LocService locService;

    @RequestMapping(value = "/uploadLoc")
    public String uploadLoc(String loc){
        Myloc locObject = (Myloc) JSON.parse(loc);
        locService.insertLoc(locObject);
        return "SUCCESS";
    }
}
