package com.mwb.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by admin on 2019/1/31.
 */
@RestController

@RequestMapping(value="/user")
public class UserController {
    private final Logger logger=Logger.getLogger(UserController.class);

    @Value("${server.port}")
    String port;
    /*
    @Autowired
    private DiscoveryClient discoveryClient;
*/
    @RequestMapping("/hello")
    public String greet(@RequestParam String name){
       // ServiceInstance instance=discoveryClient.getLocalServiceInstance();
        // 打印服务相关内容
        //logger.info("/hello,host:"+instance.getHost()+"service_id:"+instance.getServiceId());
        return "服务提供者client:"+name+"服务端口:"+port;
    }

    @RequestMapping("/hellos")
    public String greets(){
        // ServiceInstance instance=discoveryClient.getLocalServiceInstance();
        // 打印服务相关内容
        //logger.info("/hello,host:"+instance.getHost()+"service_id:"+instance.getServiceId());
        return "服务提供者client:服务端口:"+port;
    }
}
