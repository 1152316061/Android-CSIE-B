package org.example.Android.Controller;

import org.example.Android.Service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GoodsController {
    @Autowired
    private GoodsService goodsService;

    @RequestMapping(value = "/getAllGoods",produces = "text/plain;charset=utf-8")
    @ResponseBody
    public String getAllGoods(){
        return goodsService.getAllGoods();
    }
}
