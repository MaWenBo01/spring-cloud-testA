package com.mwb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by admin on 2019/2/1.
 */
@RestController
@RequestMapping(value = "/consumer")
public class ConsumerController {
    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/ribbon", method= RequestMethod.GET)
    public String hellowConsumer(){
        ResponseEntity<String> responseEntity=restTemplate.getForEntity("http://hello-service/user/hello?name={1}", String.class,"张三");
        return responseEntity.getBody();

    }

    @RequestMapping(value = "/ribbons", method= RequestMethod.GET)
    public String hellowConsumers(){
        Map<String,String> map=new HashMap<String,String>();
        map.put("name","李四");
        ResponseEntity<String> responseEntity=restTemplate.getForEntity("http://hello-service/user/hello?name={name}", String.class,map);
        return responseEntity.getBody();
    }
}
