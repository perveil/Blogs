package com.laiso.blogs.service.Impl;

import com.github.pagehelper.PageHelper;
import com.laiso.blogs.dao.ArticleMapper;
import com.laiso.blogs.model.Article;
import com.laiso.blogs.service.ArticleService;
import com.laiso.blogs.utils.Page;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("ArticleService")
@Component
public class ArticleServiceImpl implements ArticleService {
    @Resource
    private ArticleMapper articleMapper;

    public List<Article> getAll() {

        return articleMapper.selectAll();
    }

}
