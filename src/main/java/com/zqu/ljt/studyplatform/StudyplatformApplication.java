package com.zqu.ljt.studyplatform;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan(value = "com.zqu.ljt.studyplatform.Mapper")
@MapperScan("com.zqu.ljt.studyplatform.Mapper")
public class StudyplatformApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudyplatformApplication.class, args);
    }

}
