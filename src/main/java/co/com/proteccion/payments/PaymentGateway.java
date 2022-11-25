package co.com.proteccion.payments;

public interface PaymentGateway {
    PaymentResponse requestPayment(PaymentRequest request);
}
