package com.laiso.blogs.service;

import com.laiso.blogs.model.Article;
import com.laiso.blogs.utils.Page;

import java.util.List;



public interface ArticleService {
    public List<Article> getAll();
//    Page<Article> selectArticleList(int pageNum, int pageSize);

}
