package com.zhzhgang.cloud.microservicesimpleprovideruser.service.impl;

import com.zhzhgang.cloud.microservicesimpleprovideruser.entity.User;
import com.zhzhgang.cloud.microservicesimpleprovideruser.repository.UserRepository;
import com.zhzhgang.cloud.microservicesimpleprovideruser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zhangzhonggang
 * 2017-11-30 20:19
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    /**
     * 根据 id 查询用户
     *
     * @param id
     * @return
     */
    @Override
    public User findUserById(Long id) {
        return userRepository.findOne(id);
    }
}
