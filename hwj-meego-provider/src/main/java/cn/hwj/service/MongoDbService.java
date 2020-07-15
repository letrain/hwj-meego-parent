package cn.hwj.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

@Service
public class MongoDbService {
    @Autowired
    private MongoTemplate mongoTemplate;

    public void testMongoDb() {
        DBCollection collection = mongoTemplate.getCollection("just.miss");
        DBObject query = new BasicDBObject();
        JSONObject js = new JSONObject();
        js.put("$ne", "hwj3");// 不是hwj3的数据
        query.put("name", js);
        DBCursor res = collection.find(query);
        while (res.hasNext()) {
            System.out.println(JSON.toJSONString(res.next()));
        }
    }
}
