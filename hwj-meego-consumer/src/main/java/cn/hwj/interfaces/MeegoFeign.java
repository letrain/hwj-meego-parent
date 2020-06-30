package cn.hwj.interfaces;

import cn.hwj.fallback.MeegoFeignFallback;
import com.alibaba.fastjson.JSONObject;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * 测试客户端
 *
 * @author: letrain
 * @mail
 * @date: 2018-12-08 14:45
 */
@FeignClient(value = "hwj-meego-provider-dev", fallback = MeegoFeignFallback.class)
public interface MeegoFeign {
    @PostMapping("/meego/N9")
    String meegoN9Like(@RequestBody JSONObject rParams);
}
