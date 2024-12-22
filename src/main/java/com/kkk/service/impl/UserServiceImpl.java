package com.kkk.service.impl;

import com.kkk.domain.dto.UserDto;
import com.kkk.domain.entity.User;
import com.kkk.mapper.UserMapper;
import com.kkk.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author lonelykkk
 * @email 2765314967@qq.com
 * @date 2024/12/22 20:18
 * @Version V1.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    /**
     * 新增用户
     * @param userDto
     */
    public void addUser(UserDto userDto) {

        User user = new User();
        BeanUtils.copyProperties(userDto, user);
        //user.setEmail("123@qq.com");
        user.setCreateTime(new Date());
        user.setLoginTime(new Date());
        userMapper.insert(user);
    }
}
