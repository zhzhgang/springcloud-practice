package com.zhzhgang.cloud.microservicesimpleprovideruser.dao;

import com.zhzhgang.cloud.microservicesimpleprovideruser.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by zhangzhonggang
 * 2017-11-28 22:01
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
