package com.mobinming.springboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

@SpringBootTest
class SpringbootApplicationTests {

    @Test
    void contextLoads() {

    }
    //注入Redis
    @Autowired
    private RedisTemplate<String,String> redisTemplate;
    @Test
    public void setRedisTemplate() {
        ValueOperations<String, String> ops= redisTemplate.opsForValue();
        String json=ops.get("json");
        System.out.println(json);
        if(json==null) {
            ops.set("json","{\"name\":\"smith\",\"age\":30,\"sex\":男}");
        }
        json=ops.get("json");
        System.out.println(json);
    }
}
