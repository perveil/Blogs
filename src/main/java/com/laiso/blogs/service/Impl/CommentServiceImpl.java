package com.laiso.blogs.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.laiso.blogs.dao.CommentMapper;
import com.laiso.blogs.model.Comment;
import com.laiso.blogs.service.CommentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {
    @Resource
    private CommentMapper commentMapper;

    @Override
    public  PageInfo<Comment> getPageOfComment(String articleId,int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,  pageSize);
        List<Comment> list = this.commentMapper.selectByArticleId(Integer.parseInt(articleId));
        PageInfo<Comment> pageInfos=new PageInfo<>(list);
        return pageInfos;
    }

    @Override
    public void addComment(Comment comment) {
         this.commentMapper.insert(comment);
    }

    @Override
    public List<Comment> findComment(Integer articleId) {
        return commentMapper.selectByArticleId(articleId);
    }


}
