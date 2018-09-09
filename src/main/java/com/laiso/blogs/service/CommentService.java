package com.laiso.blogs.service;

import com.github.pagehelper.PageInfo;
import com.laiso.blogs.model.Comment;

import java.util.List;

public interface CommentService {
    PageInfo<Comment> getPageOfComment(String articleId,int pageNum, int pageSize);
    void addComment(Comment comment);
    List<Comment> findComment(Integer articleId);

}
