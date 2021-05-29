package cn.spectrumrpc.springcloud.service;

import cn.spectrumrpc.springcloud.entities.Payment;

public interface PaymentService {
    int create(Payment payment);

    Payment getPaymentById(Long id);
}
