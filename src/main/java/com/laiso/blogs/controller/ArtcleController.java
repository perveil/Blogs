package com.laiso.blogs.controller;

import com.alibaba.fastjson.JSON;
import com.laiso.blogs.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/article")
public class ArtcleController {
    @Autowired
    private ArticleService articleService;

    @RequestMapping(value ="/getAll")
    public String GetAll(){
        return JSON.toJSONString(articleService.getAll());
    }

}
