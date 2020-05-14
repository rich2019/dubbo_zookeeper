package com.cdd.service;


import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

//zookeeper服务注册与发现

@Service  //dubbo的注解,可以被扫描到,在项目一启动就自动注册到注册中心
@Component  //使用了dubbo后尽量不要用service注解,会冲突
public class TicketServiceImpl implements TicketService {

    @Override
    public String getTickets() {
        return "rich";
    }
}
