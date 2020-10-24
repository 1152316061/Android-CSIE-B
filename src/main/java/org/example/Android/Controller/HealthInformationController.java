package org.example.Android.Controller;

import com.alibaba.fastjson.JSON;
import org.example.Android.Service.HealthInformationService;
import org.example.Android.pojo.HealthInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HealthInformationController {
    @Autowired
    private HealthInformationService HIService;

    @RequestMapping(value = "/UploadHI",produces = "text/plain;charset=utf-8")
    @ResponseBody
    public String UploadHI(String hi){
        HealthInformation hiObject = (HealthInformation) JSON.parse(hi);
        hiObject.Judge();
        HIService.insertHI(hiObject);
        return "SUCCESS";
    }
}
