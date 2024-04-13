package poo;

public class ExemploPaymentGateway implements PaymentGateway {
    private String url;
    private String username;
    private String password;

    public ExemploPaymentGateway() {
        PaymentGatewayConfig config = ExemploPaymentGateway.class.getAnnotation(PaymentGatewayConfig.class);
        if (config != null) {
            this.url = config.url();
            this.username = config.username();
            this.password = config.password();
        } else {
            throw new RuntimeException("Configuração do gateway não encontrada");
        }
    }

    public boolean processPayment(double amount) {
        // Lógica de processamento do pagamento com o gateway Exemplo
        System.out.println("Processando pagamento de " + amount + " via Exemplo Payment Gateway");
        // Lógica de comunicação com o gateway usando this.url, this.username, this.password
        return true;
    }
}
   