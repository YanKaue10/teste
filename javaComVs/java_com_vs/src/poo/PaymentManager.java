package poo;

import java.util.HashMap;
import java.util.Map;

// Gerenciador de pagamento
public class PaymentManager {
    private Map<Class<? extends PaymentGateway>, PaymentGateway> gateways = new HashMap<>();

    public void registerGateway(Class<? extends PaymentGateway> gatewayClass, PaymentGateway gateway) {
        gateways.put(gatewayClass, gateway);
    }

    public boolean processPayment(Class<? extends PaymentGateway> gatewayClass, double amount) {
        PaymentGateway gateway = gateways.get(gatewayClass);
        if (gateway != null) {
            return gateway.processPayment(amount);
        } else {
            System.err.println("Gateway de pagamento não encontrado");
            return false;
        }
    }
}
 

