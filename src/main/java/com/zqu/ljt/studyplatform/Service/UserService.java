package com.zqu.ljt.studyplatform.Service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zqu.ljt.studyplatform.Bean.User;
import org.apache.ibatis.annotations.Select;

public interface UserService extends IService<User> {

    void enable(Long id);
}
