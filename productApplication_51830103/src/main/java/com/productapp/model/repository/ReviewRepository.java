package com.productapp.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.productapp.model.entities.Review;

public interface ReviewRepository extends JpaRepository<Review, Long> {
public List<Review> findByStoreId(Long id);
}
