package com.mobinming.springboot.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.io.Serializable;
import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
public class Users extends Model<Users> {
    @TableId(value = "id",type = IdType.INPUT)
    private Integer id;
    private String name;
    private Date date;
    /**
     * @return 返回当前表的主键
     */
    @Override
    protected Serializable pkVal() {
        return id;
    }


}
