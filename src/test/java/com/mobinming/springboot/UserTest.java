package com.mobinming.springboot;

import com.mobinming.springboot.entity.Users;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@SpringBootTest
public class UserTest {


    @Test
    void testMybatis() {
        Users users=new Users();
        users.setId(88);
        users.setDate(LocalDateTime.now());
        users.setName("sss");
        users.insert();
    }
}