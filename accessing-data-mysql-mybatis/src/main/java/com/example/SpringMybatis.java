package com.example;

import com.example.mapper.UserMapper;
import com.example.model.User;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@MapperScan("com.example.mapper")
@RestController
public class SpringMybatis {

    @Autowired
    public UserMapper userMapper;

    public static void main(String[] args) {
        SpringApplication.run(SpringMybatis.class, args);
    }

    @GetMapping("/test")
    public User test(){
        return userMapper.selectByPrimaryKey(1);
    }

}
