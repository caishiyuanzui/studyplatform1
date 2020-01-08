package com.zqu.ljt.studyplatform.Bean;

import java.time.LocalDateTime;

public class Problem {
    /**
     * 问题id
     */
    private Long id;
    /**
     * 内容
     */
    private String content;
    /**
     * 创建时间
     */
    private LocalDateTime createAt;
    /**
     * 关联用户
     */
    private User user;
    /**
     * 问题回复数
     */
    private Long answerNumber;
}
