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

    /**
     * 注解和jpa相似的使用
     * @return
     */
    @GetMapping("/test")
    public int test(){
        return userMapper.selectCount();
    }

    /**
     * 常规使用,xml配置sql 进行 CRUD
     * @return
     */
    @GetMapping("/test1")
    public User test1(){
        return userMapper.selectByPrimaryKey(1);
    }

}
