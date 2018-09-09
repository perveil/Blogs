package com.laiso.blogs.dao;

import com.laiso.blogs.model.Article;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;

@Mapper
@CacheConfig(cacheNames = "ArticleCache")
public interface ArticleMapper {
    @CacheEvict(key = "#p0",allEntries = true)
    int deleteByPrimaryKey(Integer articleId);

    int insert(Article record);

    @Cacheable(key = "#p0")
    Article selectByPrimaryKey(Integer articleId);


    List<Article> selectAll();

    @CachePut(key = "record.articleId")
    int updateByPrimaryKey(Article record);

    List<Article> selectBysuperid(Integer superid);

    void UpdateArticle(Article article);

    @Cacheable(key = "#p0",value = "KeyWordBlur")
    public Article blurFindArticle(String keyword);
}