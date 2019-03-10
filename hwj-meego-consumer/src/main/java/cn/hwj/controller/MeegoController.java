package cn.hwj.controller;

import cn.hwj.interfaces.MeegoFeign;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试使用
 *
 * @author: letrain
 * @mail 1432423@qq.com
 * @date: 2018-12-08 14:40
 */
@RestController
@RequestMapping("/meego")
public class MeegoController {
    @Autowired
    private MeegoFeign meegoFeign;
    @PostMapping("/N9")
    public String meegoN9Like(@RequestBody JSONObject params){
        return meegoFeign.meegoN9Like(params);

    }
}
