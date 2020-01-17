package com.zqu.ljt.studyplatform.ServiceImpl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zqu.ljt.studyplatform.Bean.Account;
import com.zqu.ljt.studyplatform.Mapper.AccountMapper;
import com.zqu.ljt.studyplatform.Service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AccountServiceImpl extends ServiceImpl<AccountMapper,Account> implements AccountService {

    @Autowired
    AccountMapper accountMapper;
    @Autowired
    AccountService accountService;

    public Account findByPhoneAndPassword(String phone,String password){
        if (phone == null || password == null){
            throw new RuntimeException("手机号不能为空");
        }
        QueryWrapper<Account> accountQueryWrapper = new QueryWrapper<>();
        accountQueryWrapper.eq("phone",phone).eq("password",password);
        Account account = accountMapper.selectOne(accountQueryWrapper);
        return account;
    }

    public boolean insert(Account account){
        return accountService.save(account);
    }

    public Account get(int id){
        return accountService.getById(id);
    }

    public Account findByTypeAndWechatId(String type,String wechatId){
        QueryWrapper<Account> accountQueryWrapper = new QueryWrapper<>();
        accountQueryWrapper.eq("type",type).eq("wechat_id",wechatId);
        Account account = accountService.getOne(accountQueryWrapper);
        if (account == null){
            throw new RuntimeException("用户不存在");
        }
        return account;
    }

    public void update(Account account){
        accountMapper.updateById(account);
    }

    public void delete(int id){
        accountService.removeById(id);
    }
}
