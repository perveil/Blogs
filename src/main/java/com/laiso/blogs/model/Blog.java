package com.laiso.blogs.model;

import java.io.Serializable;

public class Blog implements Serializable {

    private Integer blogsid;

    private Integer likenum;

    public Integer getBlogsid() {
        return blogsid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blogs.blogsId
     *
     * @param blogsid the value for blogs.blogsId
     *
     * @mbg.generated Fri Aug 24 19:07:37 CST 2018
     */
    public void setBlogsid(Integer blogsid) {
        this.blogsid = blogsid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blogs.LikeNum
     *
     * @return the value of blogs.LikeNum
     *
     * @mbg.generated Fri Aug 24 19:07:37 CST 2018
     */
    public Integer getLikenum() {
        return likenum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blogs.LikeNum
     *
     * @param likenum the value for blogs.LikeNum
     *
     * @mbg.generated Fri Aug 24 19:07:37 CST 2018
     */
    public void setLikenum(Integer likenum) {
        this.likenum = likenum;
    }
}