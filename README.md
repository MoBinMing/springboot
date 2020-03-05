# idea SpringBoot实例
整合Redis
****
## 目录
* [使用SpringInitializr创建SpringBoot项目](#使用SpringInitializr创建SpringBoot项目) 
* [整合Redis](#整合Redis)
****
使用SpringInitializr创建SpringBoot项目
------
1、File→New→Project 

![图片1](assets/1.png)

2、选择Spring Initializr，选择JDK版本→Next  

![图片2](assets/2.png)

3、填写项目名称，java版本，其他描述信息→Next     

![图片3](assets/3.png)

4、选择web依赖→Next   

![图片4](assets/4.png)

5、选择项目存放路径→Fiinsh

![图片5](assets/5.png)

6、This Window在当前打开项目，New Window新开窗口打开项目，选其一

![图片6](assets/6.png)

7、右下角弹出窗口选着Enable Auto-import自动引入依赖，进度条加载完成SpringBoot项目的创建

![图片7](assets/7.png)

****
整合Redis
------

1、 引入Redis依赖  

```xml
		<!-- redis依赖 -->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-redis</artifactId>
            <version>2.2.5.RELEASE</version>
        </dependency>
```

2、application.properties添加Redis配置  

```properties
spring.redis.host=127.0.0.1
# Redis服务器连接端口
spring.redis.port=6379
# Redis服务器连接密码（默认为空）
spring.redis.password=Kirin666
# 连接池最大连接数（使用负值表示没有限制）
spring.redis.jedis.pool.max-active=20
# 连接池最大阻塞等待时间（使用负值表示没有限制）
spring.redis.jedis.pool.max-wait=
# 连接池中的最大空闲连接
spring.redis.jedis.pool.max-idle=8
# 连接池中的最小空闲连接
spring.redis.jedis.pool.min-idle=0
# 连接超时时间（毫秒）
spring.redis.timeout=500
```

3、编写测试类测试  

![8](assets/8.png)

```java
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
```

