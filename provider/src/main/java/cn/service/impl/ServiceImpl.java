package cn.service.impl;

import cn.service.ServiceInf;
import org.springframework.stereotype.Service;

/**
 * @author 喻浩
 * @create 2020-04-24-21:07
 */
@Service
public class ServiceImpl implements ServiceInf {
    @Override
    public String hello(String id) {
        return "Hello "+ id;
    }
}
