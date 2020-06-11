package com.sampleplus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sampleplus.model.User;
import org.springframework.stereotype.Repository;

/**
 * mapper 接口
 */
@Repository
public interface UserMapper extends BaseMapper<User> {
    Integer randomSelectAge();
}