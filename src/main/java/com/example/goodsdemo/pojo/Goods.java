package com.example.goodsdemo.pojo;

import java.util.Date;

public class Goods {
    private Long id;

    private String goodsName;

    private String goodsPrice;

    private String goodsProvider;

    private String goodsDesc;

    private String goodsStatus;

    private Long createUserid;

    private Date createTime;

    private Long updateUserid;

    private Date updateTime;

    private Short deleteFlag;

    public Goods(Long id, String goodsName, String goodsPrice, String goodsProvider, String goodsDesc, String goodsStatus, Long createUserid, Date createTime, Long updateUserid, Date updateTime, Short deleteFlag) {
        this.id = id;
        this.goodsName = goodsName;
        this.goodsPrice = goodsPrice;
        this.goodsProvider = goodsProvider;
        this.goodsDesc = goodsDesc;
        this.goodsStatus = goodsStatus;
        this.createUserid = createUserid;
        this.createTime = createTime;
        this.updateUserid = updateUserid;
        this.updateTime = updateTime;
        this.deleteFlag = deleteFlag;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(String goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public String getGoodsProvider() {
        return goodsProvider;
    }

    public void setGoodsProvider(String goodsProvider) {
        this.goodsProvider = goodsProvider;
    }

    public String getGoodsDesc() {
        return goodsDesc;
    }

    public void setGoodsDesc(String goodsDesc) {
        this.goodsDesc = goodsDesc;
    }

    public String getGoodsStatus() {
        return goodsStatus;
    }

    public void setGoodsStatus(String goodsStatus) {
        this.goodsStatus = goodsStatus;
    }

    public Long getCreateUserid() {
        return createUserid;
    }

    public void setCreateUserid(Long createUserid) {
        this.createUserid = createUserid;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getUpdateUserid() {
        return updateUserid;
    }

    public void setUpdateUserid(Long updateUserid) {
        this.updateUserid = updateUserid;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Short getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Short deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", goodsName='" + goodsName + '\'' +
                ", goodsPrice='" + goodsPrice + '\'' +
                ", goodsProvider='" + goodsProvider + '\'' +
                ", goodsDesc='" + goodsDesc + '\'' +
                ", goodsStatus='" + goodsStatus + '\'' +
                ", createUserid=" + createUserid +
                ", createTime=" + createTime +
                ", updateUserid=" + updateUserid +
                ", updateTime=" + updateTime +
                ", deleteFlag=" + deleteFlag +
                '}';
    }
}