package org.example.Android.Service.Impl;

import com.alibaba.fastjson.JSON;
import org.example.Android.Mapper.GoodsMapper;
import org.example.Android.Service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;

public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsMapper goodsMapper;
    @Override
    public String getAllGoods() {
        return JSON.toJSONString(goodsMapper.getAllGoods());
    }
}
