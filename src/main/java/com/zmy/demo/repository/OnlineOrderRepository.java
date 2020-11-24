package com.zmy.demo.repository;

import com.zmy.demo.entity.OnlineOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OnlineOrderRepository extends JpaRepository<OnlineOrder, Long> {
}
