package com.cdd.service;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    //想拿到provider-server提供的票,要去注册中心拿服务
    @Reference  //引用的两种方式:  1.pom坐标  2.定义路径相同的接口名
    TicketService ticketService;


    public void buyTicket(){
        String tickets = ticketService.getTickets();
        System.out.println("注册中心的票+++"+tickets);
    }
}
