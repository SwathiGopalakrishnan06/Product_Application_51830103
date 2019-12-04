package com.productapp;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.productapp.model.entities.AppUser;
import com.productapp.model.entities.MyOrders;
import com.productapp.model.entities.Product;
import com.productapp.model.entities.Review;
import com.productapp.model.entities.Store;
import com.productapp.model.repository.AppUserRepository;
import com.productapp.model.repository.ProductRepository;
import com.productapp.model.repository.StoreRepository;
import com.productapp.model.service.ProductService;

@SpringBootApplication
public class ProductApplication51830103Application implements CommandLineRunner{
	@Autowired
	private AppUserRepository appUserRepository;
	@Autowired
	private StoreRepository storeRepository;
	@Autowired
	private ProductRepository productRepository;
	@Autowired
	private ProductService productService;
	public static void main(String[] args) {
		SpringApplication.run(ProductApplication51830103Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		AppUser appUser=new AppUser("swathi", "gopal", "madurai", "g@g.com", "890583050", new String[]{"ROLE_CUSTOMER"});

		
		MyOrders myOrders1=new MyOrders("Eyeliner", 200.00, LocalDateTime.now(),2l);
		MyOrders myOrders2=new MyOrders("Mascara", 300.00, LocalDateTime.now(),1l);
		MyOrders myOrders3=new MyOrders("Moisturizer", 500.00, LocalDateTime.now(),3l);
	
		
		
		appUserRepository.save(appUser);
		
		
		Product product1=new Product("Eyeliner", 200.00);
		Product product2=new Product("Mascara", 300.00);
		Product product3=new Product("Moisturizer", 500.00);
		
		Store store1=new Store("Kannan dept store", "68967986969", "m@M.com",4.5,2l);
		Store store2=new Store("Radha store", "8789986969", "b@b.com",4.6,3l);
		Store store3=new Store("Sita store", "987686969", "l@M.com",3.9,5l);
		
		store1.addProduct(product1);
		store1.addProduct(product2);
		store2.addProduct(product1);
		store2.addProduct(product3);
		store3.addProduct(product3);
		store3.addProduct(product2);
		

		Review review1=new Review(4.0, "good");
		Review review2=new Review(3.0, "bad");
		Review review3=new Review(7.0, "bumper");
		
		store1.addReview(review1);

		store1.addReview(review2);

		store2.addReview(review3);

		store3.addReview(review1);
		
review1.setStore(store1);
review1.setStore(store3);
review2.setStore(store1);
review3.setStore(store2);
		storeRepository.save(store1);
		storeRepository.save(store2);
		storeRepository.save(store3);
		
		
	
	/*List<Product> products=	productRepository.findByNameContaining("poco");
	System.out.println(products);*/
		Product product4=new Product("Kajal", 150.00);
		Store store4=new Store("kannanStore", "68967986969", "s@s.com",0.0,0l);
		store4.addProduct(product4);
		storeRepository.save(store4);
	
	}
}
