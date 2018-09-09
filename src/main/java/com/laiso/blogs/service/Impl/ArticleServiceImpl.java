package com.laiso.blogs.service.Impl;

import com.laiso.blogs.dao.ArticleMapper;
import com.laiso.blogs.model.Article;
import com.laiso.blogs.service.ArticleService;
import com.laiso.blogs.vo.ArticleVo;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service("ArticleService")
@Component
public class ArticleServiceImpl implements ArticleService {
    @Resource
    private ArticleMapper articleMapper;

    public List<Article> getAll() {

        return articleMapper.selectAll();
    }

    @Override
    public Article getOneArticleById(Integer id) {
        return articleMapper.selectByPrimaryKey(id);
    }
    /*
    *首先全部选中，
    *
    * */
    @Override
    public List<ArticleVo> getArtcleList() {
       List<ArticleVo> resultList=new ArrayList<>();
       List<Article> articleList=articleMapper.selectAll();
       List<Article> fatherArticles=new ArrayList<>();
       /*
       * 找到所有的父级
       * */
       for (int i=0;i<articleList.size();i++){
            if (articleList.get(i).getArticleSuperarticleid()==null)
                fatherArticles.add(articleList.get(i));
       }
       for (int j=0;j<fatherArticles.size();j++){
           int Likenum=0;
           List<Article> sonList=articleMapper.selectBysuperid(fatherArticles.get(j).getArticleId());
           ArticleVo articleVo=new ArticleVo();
           articleVo.setLable(fatherArticles.get(j).getArticleLabel());
           for (int f=0;f<sonList.size();f++){
               ArticleVo sonArticleVo=new ArticleVo();
               sonArticleVo.setLable(sonList.get(f).getArticleLabel());
               sonArticleVo.setList(null);
               sonArticleVo.setLikeNum(sonList.get(f).getArticleLikenum());
               articleVo.getList().add(sonArticleVo);
               Likenum+=sonList.get(f).getArticleLikenum();
           }
           articleVo.setLikeNum(Likenum);
           resultList.add(articleVo);
       }
        return resultList;
    }

    @Override
    public void UpdateArticle(Article article) {
          articleMapper.UpdateArticle(article);
    }

    @Override
    public Article blurFindArticle(String keyword) {
        return articleMapper.blurFindArticle(keyword);
    }

}
