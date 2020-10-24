package org.example.Android.Controller;

import org.example.Android.Service.MedicineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MedicineController {

    @Autowired
    private MedicineService medicineService;

    @RequestMapping(value = "/getMed",produces = "text/plain;charset=utf-8")
    @ResponseBody
    String getMedicine(String UID){
        System.out.println("medicine++++++");
        return medicineService.getMedicineByUID(UID);
    }
}
