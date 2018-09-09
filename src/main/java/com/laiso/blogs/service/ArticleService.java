package com.laiso.blogs.service;

import com.laiso.blogs.model.Article;
import com.laiso.blogs.vo.ArticleVo;

import java.util.List;



public interface ArticleService {
    public List<Article> getAll();
//    Page<Article> selectArticleList(int pageNum, int pageSize);
    public Article getOneArticleById(Integer id);
    public List<ArticleVo> getArtcleList();
    public void UpdateArticle(Article article);
    public Article blurFindArticle(String keyword);

}
