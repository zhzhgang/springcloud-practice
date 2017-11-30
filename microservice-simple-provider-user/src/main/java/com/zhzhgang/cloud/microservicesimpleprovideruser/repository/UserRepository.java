package com.zhzhgang.cloud.microservicesimpleprovideruser.repository;

import com.zhzhgang.cloud.microservicesimpleprovideruser.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by zhangzhonggang
 * 2017-11-28 22:01
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
