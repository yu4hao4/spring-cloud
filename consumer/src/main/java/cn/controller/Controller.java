package cn.controller;

import cn.service.ServiceInf;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 喻浩
 * @create 2020-04-24-16:56
 */
@Slf4j
@RestController
public class Controller {
    @Autowired
    ServiceInf service;

    @GetMapping("/hello")
    public String hello(@RequestParam("id") String id){
        return service.hello(id);
    }
}
