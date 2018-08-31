package com.laiso.blogs.dao;

import com.laiso.blogs.model.Article;
import com.laiso.blogs.utils.Page;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.Mapping;

import java.util.List;

@Mapper
public interface ArticleMapper {

    int deleteByPrimaryKey(Integer articleId);

    int insert(Article record);

    Article selectByPrimaryKey(Integer articleId);

    List<Article> selectAll();
    int updateByPrimaryKey(Article record);
}