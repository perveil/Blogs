package com.laiso.blogs.model;

public class Comment {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.comment_id
     *
     * @mbg.generated Fri Aug 24 19:07:37 CST 2018
     */
    private Integer commentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.comment_content
     *
     * @mbg.generated Fri Aug 24 19:07:37 CST 2018
     */
    private String commentContent;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.comment_Likenum
     *
     * @mbg.generated Fri Aug 24 19:07:37 CST 2018
     */
    private Integer commentLikenum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.article_id
     *
     * @mbg.generated Fri Aug 24 19:07:37 CST 2018
     */
    private Integer articleId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.comment_id
     *
     * @return the value of comment.comment_id
     *
     * @mbg.generated Fri Aug 24 19:07:37 CST 2018
     */
    public Integer getCommentId() {
        return commentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.comment_id
     *
     * @param commentId the value for comment.comment_id
     *
     * @mbg.generated Fri Aug 24 19:07:37 CST 2018
     */
    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.comment_content
     *
     * @return the value of comment.comment_content
     *
     * @mbg.generated Fri Aug 24 19:07:37 CST 2018
     */
    public String getCommentContent() {
        return commentContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.comment_content
     *
     * @param commentContent the value for comment.comment_content
     *
     * @mbg.generated Fri Aug 24 19:07:37 CST 2018
     */
    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent == null ? null : commentContent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.comment_Likenum
     *
     * @return the value of comment.comment_Likenum
     *
     * @mbg.generated Fri Aug 24 19:07:37 CST 2018
     */
    public Integer getCommentLikenum() {
        return commentLikenum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.comment_Likenum
     *
     * @param commentLikenum the value for comment.comment_Likenum
     *
     * @mbg.generated Fri Aug 24 19:07:37 CST 2018
     */
    public void setCommentLikenum(Integer commentLikenum) {
        this.commentLikenum = commentLikenum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.article_id
     *
     * @return the value of comment.article_id
     *
     * @mbg.generated Fri Aug 24 19:07:37 CST 2018
     */
    public Integer getArticleId() {
        return articleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.article_id
     *
     * @param articleId the value for comment.article_id
     *
     * @mbg.generated Fri Aug 24 19:07:37 CST 2018
     */
    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }
}