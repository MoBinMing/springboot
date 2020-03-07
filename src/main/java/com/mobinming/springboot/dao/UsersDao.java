package com.mobinming.springboot.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mobinming.springboot.entity.Users;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Component
public interface UsersDao extends BaseMapper<Users> {
    @Select({
            "select ",
            "* from users ",
            "where id = #{id}"
    })
    Users selectByMyIdy(Integer id);
}
