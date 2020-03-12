package com.wang.myvhr;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wang.myvhr.mapper")
public class MyvhrApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyvhrApplication.class, args);
    }

}
