package com.mobinming.springboot.controller;

import com.mobinming.springboot.entity.Users;
import com.mobinming.springboot.service.UsersService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Users)表控制层
 *
 * @author makejava
 * @since 2020-03-06 16:45:07
 */
@RestController
@RequestMapping("users")
public class UsersController {
    /**
     * 服务对象
     */
    @Resource
    private UsersService usersService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Users selectOne(Integer id) {
        return this.usersService.queryById(id);
    }

}