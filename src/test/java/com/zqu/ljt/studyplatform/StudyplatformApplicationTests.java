package com.zqu.ljt.studyplatform;

import com.zqu.ljt.studyplatform.Bean.Account;
import com.zqu.ljt.studyplatform.Bean.User;
import com.zqu.ljt.studyplatform.Mapper.AccountMapper;
import com.zqu.ljt.studyplatform.Service.AccountService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
class StudyplatformApplicationTests {
    @Autowired
    AccountMapper accountMapper;
    @Autowired
    AccountService accountService;

    @Test
    void contextLoads(){

    }

    @Test
    void save(){
//        Account account = new Account();
//        account.setPhone("15994992846");
//        account.setNickname("江小白");
//        account.setPassword("123456");
//        account.setAddress("广东省天河区");
//        account.setCreateAt(LocalDateTime.now());
//        account.setType(User.class.getSimpleName());
//        account.setGender("男");
//        account.setSchool("肇庆学院");
//
//        accountMapper.insert(account);
        System.out.println(accountService.getById(1));
    }

    @Test
    public Account get(){
        return accountService.getById(1);
    }
}
