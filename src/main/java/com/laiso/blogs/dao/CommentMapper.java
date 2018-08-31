package com.laiso.blogs.dao;

import com.laiso.blogs.model.Comment;
import java.util.List;

public interface CommentMapper {

    int deleteByPrimaryKey(Integer commentId);


    int insert(Comment record);


    Comment selectByPrimaryKey(Integer commentId);

    List<Comment> selectAll();

    int updateByPrimaryKey(Comment record);
}