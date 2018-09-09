package com.laiso.blogs.controller;

import com.laiso.blogs.model.Article;
import com.laiso.blogs.model.Blog;
import com.laiso.blogs.service.BlogService;
import com.laiso.blogs.utils.Result;
import com.laiso.blogs.utils.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@CrossOrigin(value = "*")
@RestController
@RequestMapping(value ="/blog")
public class BlogController {
   @Autowired
   private BlogService blogService;

   private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @PostMapping(value ="/likeBlog")
    public Blog likeBlog(String IsLikethis){
        logger.debug("博客点赞数加一");
        int result = blogService.findBlog(1).getLikenum();
        if (IsLikethis.equals("false")){
           result--;
        }else{
            result++;
        }
        Blog blog=new Blog();
        blog.setBlogsid(1);
        blog.setLikenum(result);
        blogService.addLikeNum(blog);
        return blogService.findBlog(1);
    }
    @GetMapping(value ="/findBlog")
    public Blog findBlog(){
        return blogService.findBlog(1);
    }



}
