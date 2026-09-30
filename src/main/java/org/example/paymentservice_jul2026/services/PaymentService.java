package org.example.paymentservice_jul2026.services;

import org.example.paymentservice_jul2026.paymentgateways.IPaymentGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    private IPaymentGateway paymentGateway;

    public String getPaymentLink(Long amount, String orderId, String phone, String name, String email) {
        return paymentGateway.getPaymentLink(amount, orderId, phone, name, email);

    }
}