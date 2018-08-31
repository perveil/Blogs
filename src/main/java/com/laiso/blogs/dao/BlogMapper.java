package com.laiso.blogs.dao;

import com.laiso.blogs.model.Blog;
import java.util.List;

public interface BlogMapper {

    int deleteByPrimaryKey(Integer blogsid);

    int insert(Blog record);

    Blog selectByPrimaryKey(Integer blogsid);

    List<Blog> selectAll();

    int updateByPrimaryKey(Blog record);
}