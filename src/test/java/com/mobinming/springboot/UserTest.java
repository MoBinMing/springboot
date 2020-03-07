package com.mobinming.springboot;

import com.mobinming.springboot.dao.UsersDao;
import com.mobinming.springboot.entity.Users;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

@SpringBootTest
public class UserTest {
    @Autowired
    private UsersDao usersDao;

    @Test
    void testMybatis() {
        List<Users> users = usersDao.selectList(null);
        for (Users u : users) {
            System.out.println(u.toString());
        }
        Users user1= usersDao.selectByMyIdy(1);
        System.out.println(user1.getName());

        Users user=new Users();
        user.setDate(new Date());
        user.setId(9);
        user.setName("666");
        System.out.println("插入成功："+user.insert());

    }
}