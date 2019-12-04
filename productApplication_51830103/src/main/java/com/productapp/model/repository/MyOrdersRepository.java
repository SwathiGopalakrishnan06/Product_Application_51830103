package com.productapp.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.productapp.model.entities.MyOrders;

public interface MyOrdersRepository extends JpaRepository<MyOrders, Long> {

}
