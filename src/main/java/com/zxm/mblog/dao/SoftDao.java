package com.zxm.mblog.dao;


import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SoftDao {
    //获取一个产品名称每年的价格
    List<Integer> getPrice(String name);
    //获取一个二级目录下的所有产品
    List<String> getAllProduct(String ejml);
}
