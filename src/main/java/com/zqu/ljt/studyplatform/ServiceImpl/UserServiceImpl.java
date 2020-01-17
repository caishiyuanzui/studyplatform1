package com.zqu.ljt.studyplatform.ServiceImpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zqu.ljt.studyplatform.Bean.Account;
import com.zqu.ljt.studyplatform.Bean.User;
import com.zqu.ljt.studyplatform.Handle.Message;
import com.zqu.ljt.studyplatform.Mapper.UserMapper;
import com.zqu.ljt.studyplatform.Service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import javax.annotation.Resource;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Resource
    UserService userService;
    @Resource
    AccountServiceImpl accountService;

//    public Message loginWithPhoneAndPassword(String phone,String password){
//        Account account = accountService.findByPhoneAndPassword(phone,password);
//        if (account!=null){
//            return Message.success().extend("account",account);
//        }
//        return Message.fail();
//    }

}
