package com.matixtechies.paymentsservice.service;

import com.matixtechies.paymentsservice.model.Payment;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public interface PaymentService {

    public Payment savePayment(Payment payment);

    public Optional<Payment> getPaymentById(int paymentId);
}
