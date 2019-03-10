package cn.hwj.fallback;

// import cn.hwj.constant.Constants;
import cn.hwj.interfaces.MeegoFeign;
import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Component;

/**
 * 降级处理
 *
 * @author: letrain
 * @mail
 * @date: 2018-12-08 14:47
 */
@Component
public class MeegoFeignFallback implements MeegoFeign {
    @Override
    public String meegoN9Like(JSONObject rParams) {
        // return Constants.FALL_BACK_ERROR;
        return "Error";
    }
}
