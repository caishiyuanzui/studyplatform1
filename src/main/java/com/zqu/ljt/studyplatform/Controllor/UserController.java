package com.zqu.ljt.studyplatform.Controllor;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zqu.ljt.studyplatform.Bean.Account;
import com.zqu.ljt.studyplatform.Bean.User;
import com.zqu.ljt.studyplatform.Handle.Message;
import com.zqu.ljt.studyplatform.Handle.ServiceException;
import com.zqu.ljt.studyplatform.Mapper.UserMapper;
import com.zqu.ljt.studyplatform.Service.AccountService;
import com.zqu.ljt.studyplatform.Service.UserService;
import com.zqu.ljt.studyplatform.Untils.CodeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.time.LocalDateTime;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    @Autowired
    UserMapper userMapper;
    @Autowired
    AccountService accountService;

    /**
     * 手机密码登录
     * @param phone  手机号码
     * @param password  账号密码
     * @return 用户个人信息
     */
    @PostMapping("/login")
    public Message loginByPhoneAndPassword(String phone,String password){
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        userQueryWrapper.eq("phone",phone).eq("password",password);
        User user = userService.getOne(userQueryWrapper);
        if (user == null){
            return Message.fail().extend("message","账号或密码错误");
        }
        return Message.success().extend("user",user);
    }

    /**
     * 发送验证码
     * @param phone 手机号码
     * @return Message
     */
    public Message sentCode(String phone){
        String code = CodeUtil.generate6BitDigital();
        return Message.success().extend("code",code);
    }

    /**
     * 忘记密码
     * @param password 新密码
     * @return Message
     */
    public Message updatePasswordByPhone(String password,int id){
        userMapper.updatePasswordById(password,id);
        return Message.success();
    }

    /**
     * 修改密码
     * @param password 新密码
     * @return Message
     */
    public Message updatePasswordByPassword(String password){
        return null;
    }

    /**
     * 修改用户信息
     * @param user
     */
    public void update(User user){
        userService.updateById(user);
    }

    /**
     * 获取用户信息
     * @param id
     * @return
     */
    @PostMapping("/get")
    public User get(int id){
       return userService.getById(id);
    }

    /**
     * 注册账号
     * @param user 用户信息
     * @return
     */
    @PostMapping("/register")
    public User registerByPhone(User user){
        if (user == null){
            throw new ServiceException("传入信息不能为空");
        }
        System.out.println(user);
        Account account = new Account();
        account.setPhone(user.getPhone());
        account.setPassword(user.getPhone());
        account.setAddress(user.getAddress());
        account.setCreateAt(LocalDateTime.now());
        accountService.save(account);
        user.setId(account.getId());
        userService.save(user);
        return user;
    }
}
