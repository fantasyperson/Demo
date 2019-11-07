package com.taotao;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//加载mapper 接口
//@MapperScan(basePackages = "com.taotao.mapper")
public class WebApplication1 {
    public static void main(String[] args) {
        SpringApplication.run(WebApplication1.class, args);
    }

}
