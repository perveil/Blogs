package com.laiso.blogs.controller;

import com.laiso.blogs.model.Comment;
import com.laiso.blogs.service.CommentService;
import com.laiso.blogs.utils.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/comment")
public class CommentController {

    @Autowired
    private CommentService service;

    @PostMapping(value = "/getPage")
    public Page<Comment> getPageOfComment(int pageNum, int pageSize){
        return service.getPageOfComment(pageNum,pageSize);
    }
}
