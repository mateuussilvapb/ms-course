package com.mateuussilvapb.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.mateuussilvapb.hrpayroll.entities.Payment;

@Service
public class PaymentService {

	public Payment getPayment(long workerId, int days) {
		return new Payment("Mateus", 200.0, days);
	}
}
