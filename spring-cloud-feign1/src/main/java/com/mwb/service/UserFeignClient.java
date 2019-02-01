package com.mwb.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by admin on 2019/2/1.
 */
@FeignClient(name="hello-service")
public interface UserFeignClient {
    @RequestMapping(value = "/user/hello",method = RequestMethod.GET)
    public String greet(@PathVariable("name") String name);

    @RequestMapping(value = "/user/hellos",method = RequestMethod.GET)
    public String greets();

}
