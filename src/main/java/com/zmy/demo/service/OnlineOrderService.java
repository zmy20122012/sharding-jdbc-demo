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

    public OnlineOrder search(long id){
        Optional<OnlineOrder> order = onlineOrderRepository.findById(id);
        return order.orElse(null);
    }

    public void create(String name){
        OnlineOrder order = new OnlineOrder();
        order.setName(name);
        order.setDetail("default detail");
        onlineOrderRepository.save(order);
    }

    public void update(long id, String name, String detail){
        Optional<OnlineOrder> onlineOrder = onlineOrderRepository.findById(id);
        if (!onlineOrder.isPresent()) {
            throw new RuntimeException("can not find OnlineOrder by id:"+id);
        }
        OnlineOrder order = onlineOrder.get();
        order.setName(name);
        order.setDetail(detail);
        onlineOrderRepository.save(order);
    }

    public String delete(long id){
        onlineOrderRepository.deleteById(id);
        return "delete succeeded";
    }
}
