package co.com.proteccion.payments;

public class PaymentProcessor {

    private PaymentGateway paymentGateway;

    public boolean makePayment(double amount){
        PaymentResponse response = paymentGateway.requestPayment(new PaymentRequest(amount));
        return response.getStatus() == PaymentResponse.PaymentStatus.OK;
    }

    public PaymentProcessor(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }
}
