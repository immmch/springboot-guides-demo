package basic.template.controller;

import basic.template.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test1Controller {
    Logger logger = LoggerFactory.getLogger(Test1Controller.class);

    @GetMapping("/user")
    public User getUser(){
        User u = new User();
        u.setEmail("919458465@qq.com");
        u.setId(1);
        u.setName("renchenhao");
        logger.info("getUser over!");
        return u;
    }
}
