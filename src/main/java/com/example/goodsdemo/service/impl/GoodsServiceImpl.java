package com.example.goodsdemo.service.impl;

import com.example.goodsdemo.dao.GoodsDao;
import com.example.goodsdemo.pojo.Goods;
import com.example.goodsdemo.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsDao goodsDao;

    @Override
    public Boolean addGoods(Goods goods){
        Boolean i=goodsDao.addGoods(goods);
        return i;
    }

    @Override
    public Boolean deleteGoodsByName(Goods goods) {
        Boolean i=goodsDao.deleteGoodsByName(goods);
        return i;
    }

    @Override
    public Boolean updateGoodsByName(Goods goods) {
        Boolean i=goodsDao.updateGoodsByName(goods);
        return i;
    }

    @Override
    public Goods selectGoodsByName(Goods goods) {
        Goods goods1=goodsDao.selectGoodsByName(goods);
        return goods1;
    }

    @Override
    public List<Goods> selectAllGoods() {
        List<Goods> goodsList=goodsDao.selectAllGoods();
        return goodsList;
    }
}
