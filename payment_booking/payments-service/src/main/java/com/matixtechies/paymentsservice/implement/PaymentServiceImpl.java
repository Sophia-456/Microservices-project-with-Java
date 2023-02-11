package com.matixtechies.paymentsservice.implement;

import com.matixtechies.paymentsservice.model.Payment;
import com.matixtechies.paymentsservice.repository.PaymentRepository;
import com.matixtechies.paymentsservice.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentRepository paymentRepository;
    @Override
    public Payment savePayment(Payment payment){

        return paymentRepository.save(payment);
    }
    public Optional <Payment> getPaymentById(int paymentId){
        return Optional.of (paymentRepository.findById(paymentId).get());
    }
}
