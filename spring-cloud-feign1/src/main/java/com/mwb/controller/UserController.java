package com.mwb.controller;

import com.mwb.service.UserFeignClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import org.apache.log4j.Logger;
/**
 * Created by admin on 2019/2/1.
 */
@RestController
@RequestMapping(value="/user")
/*@SuppressWarnings("SpringJavaAutowiringInspection")*/

public class UserController {
   Logger log=Logger.getLogger(UserController.class);
    @Autowired
    private UserFeignClient userFeignClient;

    @RequestMapping(value = "/name" ,method = RequestMethod.GET)
    public String getUser(String name){
        String result=null;
        log.info("调用接口");
        try{
            result=this.userFeignClient.greet(name);
        }catch(Exception  e){
            log.error(e.getMessage());
        }
        return result;
    }


    @RequestMapping(value = "/names" ,method = RequestMethod.GET)
    public String getUsers(){
        return this.userFeignClient.greets();
    }
}
