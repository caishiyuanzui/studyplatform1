package com.zqu.ljt.studyplatform.Bean;

import java.time.LocalDateTime;

public class Comment {
    /**
     * 评论id
     */
    private Long id;
    /**
     * 评论内容
     */
    private String conten;
    /**
     * 评论时间
     */
    private LocalDateTime createAt;
    /**
     * 关联的文章
     */
    private Article article;
    /**
     * 关联的问题
     */
    private Problem problem;
}
