package com.laiso.blogs.service;

import com.laiso.blogs.model.Comment;
import com.laiso.blogs.utils.Page;

public interface CommentService {
    Page<Comment> getPageOfComment(int pageNum,int pageSize);

}
