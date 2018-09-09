package com.laiso.blogs.vo;

import java.util.ArrayList;
import java.util.List;

public class ArticleVo {
    private  String Lable;
    private  int LikeNum;
    private List<ArticleVo> List=new ArrayList<>();

    public String getLable() {
        return Lable;
    }

    public void setLable(String lable) {
        Lable = lable;
    }

    public int getLikeNum() {
        return LikeNum;
    }

    public void setLikeNum(int likeNum) {
        LikeNum = likeNum;
    }

    public java.util.List<ArticleVo> getList() {
        return List;
    }

    public void setList(java.util.List<ArticleVo> list) {
        List = list;
    }
}
