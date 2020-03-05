# idea SpringBoot实例
spring主分支
****
## 目录
* [使用SpringInitializr创建SpringBoot项目](#使用SpringInitializr创建SpringBoot项目)
* [使用Thymeleaf模板](#使用Thymeleaf模板)  
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
使用Thymeleaf模板
------

1、 添加Thymeleaf依赖

```xml
        <!-- html模板引擎：thymeleaf -->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-thymeleaf</artifactId>
        </dependency>
```

2、设置版本号（可选）

```xm
	<properties>
        <java.version>1.8</java.version>
        
        <!--设置thymeleaf版本-->
        <thymeleaf.version>3.0.11.RELEASE</thymeleaf.version>
        <thymeleaf.layout.dialect.version>2.4.1</thymeleaf.layout.dialect.version>
    </properties>
```

3、src/main/resources/templates创建下存放html文件（Thymeleaf模板默认存放位置）

```html
<!DOCTYPE html>
<!--Thymeleaf联想-->
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <title>使用Thymeleaf模板</title>
</head>
<body >
<span th:text="${text}"></span>
<span th:utext="${utext}"></span>
<span >[[${v}]]</span>
<span >[(${v})]</span>

<h3 th:text="each循环" th:each="user:${users}"></h3>
<br>
<h4  th:each="user:${users}">[[${user}]]</h4>
<br>
</body>
</html>
```

4、报名下新建controller包，新建控制器类

```java
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Arrays;
import java.util.Map;

@Controller
public class HitchController {
    @RequestMapping("/")
    public String indexUrl(Map<String,Object> map) {
        map.put("text","<h1>这是th:text=\"${text}\"</h1>");
        map.put("utext","<h1>这是th:text=\"${utext}\"</h1>");
        map.put("v","<h1>这是[[${v}]]取值</h1>");
        map.put("v1","<h1>这是[(${v})]取值</h1>");
        map.put("users", Arrays.asList("张三","李四","仙五"));
        return "thymeleaf";
    }
}
```

