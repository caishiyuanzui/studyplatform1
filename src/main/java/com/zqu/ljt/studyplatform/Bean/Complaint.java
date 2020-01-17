package com.zqu.ljt.studyplatform.Bean;

import java.time.LocalDateTime;

/**
 * 投诉
 */
public class Complaint {
    public static String STATUS_OPEN = "待处理";
    public static String STATUS_CLOSE = "待处理";

    public static String TYPE_TORT = "侵权";
    public static String TYPE_DECEPTION = "欺骗";
    public static String TYPE_OTHER = "其他";

    /**
     * 投诉
     */
    private Long id;
    /**
     * 内容
     */
    private String content;
    /**
     * 投诉类型
     */
    private String type;
    /**
     * 创建时间
     */
    private LocalDateTime createAt;
    /**
     * 投诉用户
     */
    private User user;
    /**
     * 处理结果
     */
    private String status;

    public static String getStatusOpen() {
        return STATUS_OPEN;
    }

    public static void setStatusOpen(String statusOpen) {
        STATUS_OPEN = statusOpen;
    }

    public static String getStatusClose() {
        return STATUS_CLOSE;
    }

    public static void setStatusClose(String statusClose) {
        STATUS_CLOSE = statusClose;
    }

    public static String getTypeTort() {
        return TYPE_TORT;
    }

    public static void setTypeTort(String typeTort) {
        TYPE_TORT = typeTort;
    }

    public static String getTypeDeception() {
        return TYPE_DECEPTION;
    }

    public static void setTypeDeception(String typeDeception) {
        TYPE_DECEPTION = typeDeception;
    }

    public static String getTypeOther() {
        return TYPE_OTHER;
    }

    public static void setTypeOther(String typeOther) {
        TYPE_OTHER = typeOther;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDateTime getCreateAt() {
        return createAt;
    }

    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
