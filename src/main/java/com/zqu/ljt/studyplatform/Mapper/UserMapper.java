package com.zqu.ljt.studyplatform.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zqu.ljt.studyplatform.Bean.User;
import org.apache.ibatis.annotations.Select;

public interface UserMapper extends BaseMapper<User> {

    @Select(value = "update account set password = #{password} where id = #{id}")
     int updatePasswordById(String password,int id);

    @Select(value = "update user set status='禁用' where id = #{id}")
    void enable(Long id);
}
