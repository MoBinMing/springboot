//package com.mobinming.springboot;
//
//import com.mobinming.springboot.entity.Users;
//import com.mobinming.springboot.service.UsersService;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import java.time.LocalDate;
//import java.time.LocalDateTime;
//import java.util.Date;
//import java.util.List;
//
//@SpringBootTest
//public class UserTest {
//    @Autowired
//    private UsersService usersService;
//
//    @Test
//    void testMybatis() {
//        Users users=new Users();
//        users.setId(99);
//        users.setDate(LocalDateTime.now());
//        users.setName("sss");
//        users.insert();
//
//        System.out.println("删除成功？ = " + usersService.removeById(users.getId()));
//    }
//}