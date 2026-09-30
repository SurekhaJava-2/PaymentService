package org.example.paymentservice_jul2026.paymentgateways;

public interface IPaymentGateway {

    String getPaymentLink(Long amount, String orderId, String phone, String name, String email);
}