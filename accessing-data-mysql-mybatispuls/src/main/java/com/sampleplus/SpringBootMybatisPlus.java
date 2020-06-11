package com.sampleplus;


import com.sampleplus.mapper.UserMapper;
import com.sampleplus.model.User;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@MapperScan("com.sampleplus.mapper")
@RestController
public class SpringBootMybatisPlus {
    @Autowired
    private UserMapper userMapper;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMybatisPlus.class, args);
    }

    /**
     * mybatisplus 写法
     * @return
     */
    @GetMapping("test")
    public int test(){
        System.out.println(("----- selectAll method test ------"));
        int count = userMapper.randomSelectAge();
        return count;
    }

    @GetMapping("test1")
    public int test1(){
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userMapper.selectList(null);
        userList.forEach(System.out::println);
        return 1;
    }
}
