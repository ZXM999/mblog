package com.zxm.mblog.controller;

import com.zxm.mblog.service.SoftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Map;

@Controller
public class SoftController {
    @Autowired
    SoftService softService;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/get")
    @ResponseBody
    public ArrayList<Map<String, Object>> get(){
        return softService.getList();
    }

}
