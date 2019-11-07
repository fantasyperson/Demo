package com.taotao;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//加载mapper 接口
@MapperScan(basePackages = "com.taotao.mapper")
public class WebApplication2 {
    public static void main(String[] args) {
        SpringApplication.run(WebApplication2.class, args);
    }

}
