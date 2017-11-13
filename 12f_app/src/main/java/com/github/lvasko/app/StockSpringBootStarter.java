package com.github.lvasko.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * Created by 38102090301 on 13.11.2017.
 */
@EnableRedisHttpSession
@SpringBootApplication
public class StockSpringBootStarter {
    public static void main(String[] args) {
        SpringApplication.run(StockSpringBootStarter.class, args);
    }
}
