package com.zqu.ljt.studyplatform.Bean;

import java.time.LocalDateTime;

public class Data {
    public static String TYPE_PPT = "PPT文件";
    public static String TYPE_PDF= "PDF文件";
    public static String TYPE_JPG = "JPG文件";
    public static String TYPE_PNG = "PPG文件";

    private Long id;
    /**
     * 资料类型
     */
    private String type;
    /**
     * 资料标签
     */
    private String tag;
    /**
     * 上传时间
     */
    private LocalDateTime createAt;
    /**
     * 关联账户
     */
    private User user;
    /**
     * 下载数
     */
    private Long downloadNumber;

}
