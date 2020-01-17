package com.zqu.ljt.studyplatform.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zqu.ljt.studyplatform.Bean.User;
import org.apache.ibatis.annotations.Select;

public interface UserMapper extends BaseMapper<User> {

    @Select(value = "update user set password :password where id = :id")
     int updatePasswordById(String password,int id);
}
