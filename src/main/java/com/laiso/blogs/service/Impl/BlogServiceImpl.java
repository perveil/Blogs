package com.laiso.blogs.service.Impl;

import com.laiso.blogs.dao.BlogMapper;
import com.laiso.blogs.model.Blog;
import com.laiso.blogs.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("blogService")
public class BlogServiceImpl implements BlogService {

    @Resource
    private BlogMapper blogMapper;
    @Override
    public void addLikeNum(Blog blog) {
         blogMapper.updateByPrimaryKey(blog);
    }

    @Override
    public Blog findBlog(Integer id) {
       return  blogMapper.selectByPrimaryKey(id);
    }
}
