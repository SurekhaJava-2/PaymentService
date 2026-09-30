package org.example.paymentservice_jul2026.dtos;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class InitiatePaymentRequestDto {
    Long amount;
    String orderId;
    String phone;
    String name;
    String email;
}