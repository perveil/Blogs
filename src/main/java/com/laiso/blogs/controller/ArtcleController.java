package com.laiso.blogs.controller;

import com.alibaba.fastjson.JSON;
import com.laiso.blogs.model.Article;
import com.laiso.blogs.service.ArticleService;
import com.laiso.blogs.service.RedisService;
import com.laiso.blogs.utils.Result;
import com.laiso.blogs.utils.ResultUtil;
import com.laiso.blogs.vo.ArticleVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(value = "*")
@RestController
@RequestMapping(value ="/article")
public class ArtcleController {
    @Autowired
    private ArticleService articleService;
    @Autowired
    private RedisService redisService;

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping(value ="/getAll")
    public List<ArticleVo> GetAll(){
        logger.debug("获取了所有的文章");
        return articleService.getArtcleList();
    }
    @PostMapping(value ="/getOneArticle")
    public Article getOneArticle(String id){
        logger.debug("获取id为特定值的文章");
        return articleService.getOneArticleById(Integer.parseInt(id));

    }
    @PostMapping(value ="/likeArticle")
    public Result likeArticle(String articleId){
        logger.debug("文章点赞数加一");
        Article article=new Article();
        article.setArticleId(Integer.parseInt(articleId));
        article.setArticleLikenum(articleService.getOneArticleById(Integer.parseInt(articleId)).getArticleLikenum()+1);
        articleService.UpdateArticle(article);
        return ResultUtil.Success();
    }
    @PostMapping(value ="/blurFindArticle")
    public Article blurFindArticle(String keyword){

      return articleService.blurFindArticle(keyword);
    }

}
