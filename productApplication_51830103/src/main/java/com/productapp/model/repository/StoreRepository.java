package com.productapp.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.productapp.model.entities.Store;

public interface StoreRepository extends JpaRepository<Store, Long>{

}
