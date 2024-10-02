package com.learning.Ecommerce.repository;

import java.util.List;

import com.learning.Ecommerce.model.ProductOrder;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductOrderRepository extends JpaRepository<ProductOrder, Integer> {

	List<ProductOrder> findByUserId(Integer userId);

	ProductOrder findByOrderId(String orderId);

}
