package com.zgy.gmall.gmallusermangae;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.zgy.gmall.gmallusermangae.mapper")
public class GmallUserMangaeApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmallUserMangaeApplication.class, args);
    }

}
