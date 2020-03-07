package com.mobinming.springboot.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mobinming.springboot.entity.Users;
import com.mobinming.springboot.dao.UsersDao;
import com.mobinming.springboot.service.UsersService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Users)表服务实现类
 *
 * @author makejava
 * @since 2020-03-07 01:35:17
 */
@Service("usersService")
public class UsersServiceImpl extends ServiceImpl<UsersDao,Users> implements UsersService {

}