package cn.hwj.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: letrain
 * @mail
 * @date: 2018-12-08 15:00
 */
@RestController
@RequestMapping("/meego")
public class MeegoController {

    private Logger logger = LoggerFactory.getLogger(MeegoController.class);

    @PostMapping("/N9")
    public String meegoN9Like(@RequestBody JSONObject params){
        logger.info("请求参数：{}", JSONObject.toJSONString(params));
        JSONObject result = new JSONObject();
        result.put("model", "Meego-N9");
        logger.info("返回结果：{}", JSONObject.toJSONString(result));
        return JSON.toJSONString(result);
    }
}
