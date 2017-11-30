package com.zhzhgang.cloud.microservicesimpleprovideruser.service;

import com.zhzhgang.cloud.microservicesimpleprovideruser.entity.User;
import org.springframework.stereotype.Service;

/**
 * Created by zhangzhonggang
 * 2017-11-30 20:15
 */
@Service
public interface UserService {

    /**
     * 根据 id 查询用户
     * @param id
     * @return
     */
    User findUserById(Long id);

}
