package poo;

    public class Main {
        public static void main(String[] args) {
            // Configuração inicial
            PaymentManager paymentManager = new PaymentManager();
            
            // Registro do gateway de pagamento Exemplo
            ExemploPaymentGateway exemploPaymentGateway = new ExemploPaymentGateway();
            paymentManager.registerGateway(ExemploPaymentGateway.class, exemploPaymentGateway);
            
            // Processamento de pagamento
            double amount = 100.0;
            paymentManager.processPayment(ExemploPaymentGateway.class, amount);
        }
    }
    

