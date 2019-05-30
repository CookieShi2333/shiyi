package com.example.goodsdemo.service;

import com.example.goodsdemo.pojo.Goods;

import java.util.List;

public interface GoodsService {
    Boolean addGoods(Goods goods);
    Boolean deleteGoodsByName(Goods goods);
    Boolean updateGoodsByName(Goods goods);
    Goods selectGoodsByName(Goods goods);
    List<Goods> selectAllGoods();
}
