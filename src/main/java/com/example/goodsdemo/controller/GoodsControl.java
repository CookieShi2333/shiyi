package com.example.goodsdemo.controller;

import com.example.goodsdemo.common.Result;
import com.example.goodsdemo.pojo.Goods;
import com.example.goodsdemo.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/goods")
public class GoodsControl {

    @Autowired
    private GoodsService goodsService;

    @PostMapping("/addGoods")
    public Result addGoods(Goods goods)
    {
        Boolean i=goodsService.addGoods(goods);
        if (i) {
            return new Result(true, "成功添加");
        } else {
            return new Result(false, "未成功添加");
        }
    }

    @PostMapping("/deleteGoods")
    public Result deleteGoods(Goods goods){
        Boolean i=goodsService.deleteGoodsByName(goods);
        if (i) {
            return new Result(true, "成功删除");
        } else {
            return new Result(false, "未成功删除");
        }
    }

    @PostMapping("/updateGoods")
    public Result updateGoods(Goods goods){
        Boolean i=goodsService.updateGoodsByName(goods);
        if (i) {
            return new Result(true, "成功更新");
        } else {
            return new Result(false, "未成功更新");
        }
    }


    @PostMapping("/selectGoods")
    public @ResponseBody Goods selectGoods(Goods goods){
        Goods goods1=goodsService.selectGoodsByName(goods);
        return goods1;
    }
    @PostMapping("/selectAllGoods")
    public Map<String,Object> selectAllGoods(){
        List<Goods> goodsList=goodsService.selectAllGoods();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("goodsList", goodsList);
        return map;
    }


}
