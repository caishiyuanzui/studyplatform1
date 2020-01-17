package com.zqu.ljt.studyplatform.Handle;

import java.util.HashMap;
import java.util.Map;

public class Message {
    /**
     * 状态码
     */
    private int code;
    /**
     * 错误信息
     */
    private String message;

    //用户要返回给浏览器的数据
    private Map<String, Object> extend = new HashMap<String, Object>();

    public static Message fail(){
        Message message = new Message();
        message.setCode(400);
        message.setMessage("处理失败");
        return message;
    }

    public static Message success(){
        Message message = new Message();
        message.setCode(200);
        message.setMessage("处理成功");
        return message;
    }

    public Message extend(String key,Object value){
        this.getExtend().put(key, value);
        return this;
    }


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Map<String, Object> getExtend() {
        return extend;
    }

    public void setExtend(Map<String, Object> extend) {
        this.extend = extend;
    }
}
