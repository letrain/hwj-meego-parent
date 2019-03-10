package cn.hwj.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
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

    @PostMapping("/N9")
    public String meegoN9Like(@RequestBody JSONObject params){
        JSONObject result = new JSONObject();
        result.put("model", "Meego-N9");
        return JSON.toJSONString(result);
    }
}
