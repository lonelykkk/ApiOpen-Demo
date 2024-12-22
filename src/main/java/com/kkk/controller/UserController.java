package com.kkk.controller;

import com.kkk.domain.dto.UserDto;
import com.kkk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lonelykkk
 * @email 2765314967@qq.com
 * @date 2024/12/22 18:46
 * @Version V1.0
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    @PostMapping("/register")
    public void register(@RequestBody UserDto userDto) {
        userService.addUser(userDto);
    }

    @PostMapping("/login")
    public void login() {

    }
}
