package com.laiso.blogs.controller;

import com.github.pagehelper.PageInfo;
import com.laiso.blogs.model.Comment;
import com.laiso.blogs.service.CommentService;
import com.laiso.blogs.utils.BaiDuUtils;
import com.laiso.blogs.utils.Result;
import com.laiso.blogs.utils.ResultUtil;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(value = "*")
@RestController
@RequestMapping(value ="/comment")
public class CommentController {

    @Autowired
    private CommentService service;

    @PostMapping(value = "/getCommentPage")
    public PageInfo<Comment> getPageOfComment(String articleId,String  pageNum, String pageSize){
        return service.getPageOfComment(articleId,Integer.parseInt(pageNum),Integer.parseInt(pageSize));
    }

    @PostMapping(value = "/getComments")
    public List<Comment> getComments(String  articleId){
        return service.findComment(Integer.parseInt(articleId));
    }


    @PostMapping(value = "/addComment")
    public Result addComment(String  commitContent, String articleId){

        JSONObject re=BaiDuUtils.wordFilter(commitContent);
        JSONObject result= (JSONObject) re.get("result");
        if (Integer.parseInt(result.get("spam").toString())==1||Integer.parseInt(result.get("spam").toString())==2){
            return ResultUtil.fail(-3,"评论含敏感词汇,评论失败");
        }
        Comment comment=new Comment();
        comment.setArticleId(Integer.parseInt(articleId));
        comment.setCommentContent(commitContent);
        comment.setCommentLikenum(0);
        service.addComment(comment);
        return ResultUtil.Success();
    }
}
