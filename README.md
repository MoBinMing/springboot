# idea SpringBoot实例
使用Mybatis-Plus生成代码
****
## 目录
* [使用SpringInitializr创建SpringBoot项目](#使用SpringInitializr创建SpringBoot项目) 
* [使用Mybatis-Plus生成代码](#使用Mybatis-Plus生成代码) 
****
### 使用SpringInitializr创建SpringBoot项目
------
#### 1、File→New→Project 

![图片1](assets/1.png)

#### 2、选择Spring Initializr，选择JDK版本→Next  

![图片2](assets/2.png)

#### 3、填写项目名称，java版本，其他描述信息→Next     

![图片3](assets/3.png)

#### 4、选择web依赖→Next   

![图片4](assets/4.png)

#### 5、选择项目存放路径→Fiinsh

![图片5](assets/5.png)

#### 6、This Window在当前打开项目，New Window新开窗口打开项目，选其一

![图片6](assets/6.png)

#### 7、右下角弹出窗口选着Enable Auto-import自动引入依赖，进度条加载完成SpringBoot项目的创建

![图片7](assets/7.png)

****
### 使用Mybatis-Plus生成代码
------

#### 1、 引入依赖  
```xml
        <!--添加mysql依赖-->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>5.1.48</version>
        </dependency>
        <!-- mybatisPlus 核心库 -->
        <dependency>
            <groupId>com.baomidou</groupId>
            <artifactId>mybatis-plus-boot-starter</artifactId>
            <version>3.3.1</version>
        </dependency>
        <!-- mybatisPlus 代码生成器 -->
        <dependency>
            <groupId>com.baomidou</groupId>
            <artifactId>mybatis-plus-generator</artifactId>
            <version>3.3.1.tmp</version>
        </dependency>
        <!-- 引入阿里数据库连接池 -->
        <dependency>
            <groupId>com.alibaba</groupId>
            <artifactId>druid</artifactId>
            <version>1.1.6</version>
        </dependency>
        <!-- mybatisPlus Freemarker 模版引擎 -->
        <dependency>
            <groupId>org.freemarker</groupId>
            <artifactId>freemarker</artifactId>
            <version>2.3.29</version>
        </dependency>
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <version>1.18.12</version>
        </dependency>
```

#### 2、 编辑application.yml
```yaml
# mybatis-plus相关配置
mybatis-plus:
  # 如果是放在src/main/java目录下 classpath:/com/yourpackage/*/mapper/*.xml
  # 如果是放在resource目录 classpath:mapper/*.xml
  mapper-locations: classpath:mapper/*.xml
  #实体扫描，多个package用逗号或者分号分隔
  typeAliasesPackage: com.mobinming.springvoot.entity
  global-config:
    db-config:
      # AUTO(0)数据库ID自增  NONE(1)该类型为未设置主键类型(将跟随全局)  INPUT(2)用户输入ID
      id-type: INPUT
  configuration:
    map-underscore-to-camel-case: true
    cache-enabled: false
    call-setters-on-nulls: true
    # 这个配置会将执行的sql打印出来，在开发或测试的时候可以用
    log-impl: org.apache.ibatis.logging.stdout.StdOutImpl
spring:
  datasource:
    username: root
    password: 123456
    url: jdbc:mysql://localhost:3306/springboot-demo-db?useUnicode=true&characterEncoding=UTF-8
    driver-class-name: com.mysql.jdbc.Driver #直接打mysql会有提示
    type: com.alibaba.druid.pool.DruidDataSource
```


#### 3、SpringbootApplication启动类添加注释

```java
@SpringBootApplication
@MapperScan("com.mobinming.springboot.mapper")//扫描mapper
public class SpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
    }

}
```

#### 4、使用工具类生成代码（选其一）

##### 工具类一：MysqlGenerator.java
```java

```
##### 工具类二：CodeGenerator.java
```java

```