package com.learning.Ecommerce.repository;

import java.util.List;

import com.learning.Ecommerce.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CartRepository extends JpaRepository<Cart, Integer> {

	public Cart findByProductIdAndUserId(Integer productId, Integer userId);

	public Integer countByUserId(Integer userId);

	public List<Cart> findByUserId(Integer userId);

}
