package com.matixtechies.paymentsservice.repository;

import com.matixtechies.paymentsservice.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {
}
