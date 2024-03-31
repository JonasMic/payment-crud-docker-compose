package com.jonas.repository;


import com.jonas.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment,String> {
}
