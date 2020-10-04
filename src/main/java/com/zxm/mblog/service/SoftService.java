package com.zxm.mblog.service;

import com.zxm.mblog.dao.SoftDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SoftService {
    @Autowired
    SoftDao softDao;

    //查询所有数据
    public ArrayList<Map<String, Object>> getList(){
        ArrayList<Map<String, Object>> listAll = new ArrayList<>();
        List<String> products = softDao.getAllProduct("用友");
        //循环赋值
        for (String s:products) {
            //名称加每年价格
            Map<String,Object> map = new HashMap<>();
            map.put("cpmc",s);
            List<Integer> list = softDao.getPrice(s);
            map.put("jg",list);
            listAll.add(map);
        }

        return listAll;
    }
}
