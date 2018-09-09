package com.laiso.blogs.service;

import com.laiso.blogs.model.Blog;

public interface BlogService {
    public void addLikeNum(Blog blog);
    public Blog findBlog(Integer id);
}
