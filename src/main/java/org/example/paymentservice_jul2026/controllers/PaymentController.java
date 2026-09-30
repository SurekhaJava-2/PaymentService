package org.example.paymentservice_jul2026.controllers;

import org.example.paymentservice_jul2026.dtos.InitiatePaymentRequestDto;
import org.example.paymentservice_jul2026.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping
    public String initiatePayment(@RequestBody InitiatePaymentRequestDto initiatePaymentRequestDto) {
        return paymentService.getPaymentLink(initiatePaymentRequestDto.getAmount(),
                initiatePaymentRequestDto.getOrderId(),
                initiatePaymentRequestDto.getPhone(),
                initiatePaymentRequestDto.getName(),
                initiatePaymentRequestDto.getEmail());
    }
}