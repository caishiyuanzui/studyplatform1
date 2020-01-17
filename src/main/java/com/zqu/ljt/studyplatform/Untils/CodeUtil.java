package com.zqu.ljt.studyplatform.Untils;

import java.time.LocalDateTime;

public class CodeUtil {

    /**
     * 生成6位随机数字的字符串
     *
     * @return String 6位数字字符串
     */
    public static String generate6BitDigital() {
        return ("" + (Math.random() + 0.1) * 1000000).substring(0, 6);
    }

    /**
     * 生成产品编号
     *
     * @return
     */
    public static String generateOrderNumber() {
        LocalDateTime now = LocalDateTime.now();
        String code = "";
        code += now.getYear()+now.getMonthValue()+now.getDayOfMonth()+now.getHour()+now.getMinute()+now.getSecond();
        code += generate6BitDigital();
        return code;
    }
}
