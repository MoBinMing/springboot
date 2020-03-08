package com.mobinming.springboot.service.impl;

import com.mobinming.springboot.entity.Users;
import com.mobinming.springboot.mapper.UsersMapper;
import com.mobinming.springboot.service.UsersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Kirin
 * @since 2020-03-09
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements UsersService {

}
