package com.dxc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.dxc.mapper")
public class dxc123456123Application {
    public static void main(String[] args) {
        SpringApplication.run(dxc123456123Application.class,args);
    }

}
