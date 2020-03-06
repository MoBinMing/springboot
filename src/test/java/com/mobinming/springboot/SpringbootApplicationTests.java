package com.mobinming.springboot;

import com.mobinming.springboot.entity.Users;
import com.mobinming.springboot.service.UsersService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class SpringbootApplicationTests {

    @Test
    void contextLoads() {
    }
    @Resource
    private UsersService usersService;
    @Test
    public void a(){
        List<Users> users = usersService.queryAllByLimit(0, 1);
        System.out.println(users);
    }

}
