package cn.hwj.constant;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

/**
 * 常量定义类
 *
 * @author: letrain
 * @mail
 * @date: 2018-12-08 14:49
 */
public class Constants {
    private static String error;

    static {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code", -1);
        jsonObject.put("message", "请求失败，请重试！");
        error = JSON.toJSONString(jsonObject);
    }
    public final static String FALL_BACK_ERROR = error;

}
