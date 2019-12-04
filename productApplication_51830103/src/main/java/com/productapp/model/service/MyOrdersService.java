package com.productapp.model.service;

import java.util.List;

import org.springframework.security.core.userdetails.User;

import com.productapp.model.entities.MyOrders;
import com.productapp.model.entities.Product;

public interface MyOrdersService  {
public List<MyOrders> saveOrder(Product product,User user,Long storeId);
}
