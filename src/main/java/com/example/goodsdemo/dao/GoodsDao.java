package com.example.goodsdemo.dao;


import com.example.goodsdemo.pojo.Goods;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface GoodsDao {
    @Insert("insert into goods(goodsName,goodsDesc,goodsPrice,goodsStatus) values(#{goodsName}, #{goodsDesc}, #{goodsPrice}, #{goodsStatus})")
    Boolean addGoods(Goods goods);

    @Delete("delete from goods where goodsName=(#{goodsName})")
    Boolean deleteGoodsByName(Goods goods);

    @Update("update goods set goodsName=(#{goodsName}),goodsDesc=(#{goodsDesc}),goodsPrice=(#{goodsPrice}),goodsStatus=(#{goodsStatus}) where goodsName=(#{goodsName})")
    Boolean updateGoodsByName(Goods goods);

    @Select("select * from goods where goodsName=(#{goodsName})")
    Goods selectGoodsByName(Goods goods);

    @Select("select * from goods")
    List<Goods> selectAllGoods();

}

