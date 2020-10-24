package org.example.Android.Service.Impl;

import com.alibaba.fastjson.JSON;
import org.example.Android.Mapper.GoodsMapper;
import org.example.Android.Service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsMapper goodsMapper;
    @Override
    public String getAllGoods() {
        return JSON.toJSONString(goodsMapper.getAllGoods());
    }
}
