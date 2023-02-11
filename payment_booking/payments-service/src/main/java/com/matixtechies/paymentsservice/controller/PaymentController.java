package com.matixtechies.paymentsservice.controller;

import com.matixtechies.paymentsservice.model.Payment;
import com.matixtechies.paymentsservice.service.PaymentService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("api/payments")
@AllArgsConstructor
public class PaymentController {
    private PaymentService paymentService;

    @PostMapping
    public ResponseEntity<Payment> savePayment(@RequestBody Payment payment){
        Payment savedPayment = paymentService.savePayment(payment);
        return new ResponseEntity<>(savedPayment, HttpStatus.CREATED);
    }
    @GetMapping("{id}")
    public ResponseEntity<Optional<Payment>> getPaymentById(@PathVariable("id") int paymentId){
        Optional<Payment> payment = paymentService.getPaymentById(paymentId);
        return ResponseEntity.ok(payment);
    }
}
