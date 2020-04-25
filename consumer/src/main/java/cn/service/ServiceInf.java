package cn.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author 喻浩
 * @create 2020-04-24-16:46
 */
@FeignClient("provider")
public interface ServiceInf {
    @GetMapping("/hello")
    String hello(@RequestParam("id") String id);
}
