package com.zqu.ljt.studyplatform.Bean;

import java.time.LocalDateTime;

public class Manager {
    /**
     * 账号id
     */
    private Long id;
    /**
     * 手机号码
     */
    private String phone;
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
     * 地址
     */
    private String address;
    /**
     * 创建时间
     */
    private LocalDateTime createAt;
    /**
     * 最近登录时间
     */
    private LocalDateTime accessAt;
    /**
     * 性别
     */
    private String gender;
    /**
     * 头像
     */
    private String avater;

    public Manager() {
    }

}
