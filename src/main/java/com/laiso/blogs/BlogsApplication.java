package com.laiso.blogs;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@MapperScan("com.laiso.blogs.dao")
@EnableCaching

public class BlogsApplication {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public static void main(String[] args) {

        SpringApplication.run(BlogsApplication.class, args);
    }
}
