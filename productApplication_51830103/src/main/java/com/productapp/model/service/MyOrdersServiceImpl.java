package com.productapp.model.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

import com.productapp.model.entities.AppUser;
import com.productapp.model.entities.MyOrders;
import com.productapp.model.entities.Product;
import com.productapp.model.repository.AppUserRepository;
import com.productapp.model.repository.MyOrdersRepository;
@Service
public class MyOrdersServiceImpl implements MyOrdersService{
	@Autowired
public MyOrdersRepository myOrdersRepository;
	@Autowired
	private AppUserRepository appUserRepository ;
	@Override
	public List<MyOrders> saveOrder(Product product,User user,Long storeId) {
		MyOrders orders=new MyOrders(product.getName(), product.getPrice(),LocalDateTime.now(),storeId);
		AppUser appUser=appUserRepository.findByEmail(user.getUsername());
		appUser.addMyOrders(orders);
		appUserRepository.save(appUser);
		List<MyOrders> myOrders=myOrdersRepository.findAll();
			return myOrders;
	}

}
