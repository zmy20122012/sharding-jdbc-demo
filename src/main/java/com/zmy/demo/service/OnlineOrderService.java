package com.zmy.demo.service;

import com.zmy.demo.entity.OnlineOrder;
import com.zmy.demo.repository.OnlineOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OnlineOrderService {

    @Autowired
    private OnlineOrderRepository onlineOrderRepository;

    public OnlineOrder getOnlineOrder(long id){
        Optional<OnlineOrder> order = onlineOrderRepository.findById(id);
        return order.orElse(null);
    }

    public void saveOrder(String name){
        OnlineOrder order = new OnlineOrder();
        order.setName(name);
        order.setDetail("detail!!!!!!");
        onlineOrderRepository.save(order);
    }
}
