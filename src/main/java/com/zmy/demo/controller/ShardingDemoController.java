package com.zmy.demo.controller;

import com.zmy.demo.entity.OnlineOrder;
import com.zmy.demo.service.OnlineOrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShardingDemoController {

    private final OnlineOrderService onlineOrderService;

    public ShardingDemoController(OnlineOrderService onlineOrderService) {
        this.onlineOrderService = onlineOrderService;
    }

    @GetMapping("/hello")
    public String hello(String user, long id){
        OnlineOrder order = onlineOrderService.getOnlineOrder(id);
        return "hello, "+user+ "order "+order;
    }

    @GetMapping("/order")
    public String order(String name){
        onlineOrderService.saveOrder(name);
        return "success";
    }
}
