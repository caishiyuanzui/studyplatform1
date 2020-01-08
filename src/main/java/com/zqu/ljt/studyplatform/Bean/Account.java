package com.zqu.ljt.studyplatform.Bean;

import java.time.LocalDateTime;

public class Account {
    /**
     * 用户ID
     */
    private Long id;
    /**
     * 类型
     */
    private String type;
    /**
     * 微信Id
     */
    private String wechatId;
    /**
     * 手机号
     */
    private String phone;
    /**
     * 密码
     */
    private String password;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 姓名
     */
    private String name;
    /**
     * 昵称
     */
    private String nickname;
    /**
     * 性别
     */
    private String gender;
    /**
     * 头像
     */
    private String avater;
    /**
     * 地址
     */
    private String address;
    /**
     * 学校
     */
    private String school;
    /**
     * 账号创建时间
     */
    private LocalDateTime createAt;
    /**
     * 用户最近活跃时间
     */
    private LocalDateTime accessAt;

    public Account() {
    }

}
