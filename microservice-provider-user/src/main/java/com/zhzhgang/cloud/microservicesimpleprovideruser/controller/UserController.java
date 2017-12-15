package com.zhzhgang.cloud.microservicesimpleprovideruser.controller;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import com.zhzhgang.cloud.microservicesimpleprovideruser.entity.User;
import com.zhzhgang.cloud.microservicesimpleprovideruser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhangzhonggang
 * 2017-11-30 20:21
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private EurekaClient eurekaClient;

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public User findById(@PathVariable Long id) {
        return userService.findUserById(id);
    }

    @RequestMapping(value = "eureka-instance", method = RequestMethod.GET)
    public String serviceUrl() {
        InstanceInfo instanceInfo =eurekaClient.getNextServerFromEureka("MICROSERVICE-PROVIDER-USER", false);
        return instanceInfo.getHomePageUrl();
    }
}
