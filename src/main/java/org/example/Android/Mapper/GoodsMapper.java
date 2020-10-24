package org.example.Android.Mapper;

import org.example.Android.pojo.Goods;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GoodsMapper {
    List<Goods> getAllGoods();
}
