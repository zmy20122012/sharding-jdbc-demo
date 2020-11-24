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

    @GetMapping("/search")
    public String search(long id){
        OnlineOrder order = onlineOrderService.search(id);
        return "order: "+order;
    }

    @GetMapping("/create")
    public String create(String name){
        onlineOrderService.create(name);
        return "success";
    }

    @GetMapping("/update")
    public String update(long id, String name, String detail){
        onlineOrderService.update(id,name,detail);
        return "success";
    }

    @GetMapping("/delete")
    public String delete(long id){
        return onlineOrderService.delete(id);
    }

}
