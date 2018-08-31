package com.laiso.blogs.service.Impl;

import com.github.pagehelper.PageHelper;
import com.laiso.blogs.dao.CommentMapper;
import com.laiso.blogs.model.Comment;
import com.laiso.blogs.service.CommentService;
import com.laiso.blogs.utils.Page;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {
    @Resource
    private CommentMapper commentMapper;

    @Override
    public Page<Comment> getPageOfComment(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Comment> list = this.commentMapper.selectAll(); //???
        return new Page<>(list);
    }
}
