package poo;


    import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Definição de anotação para informações de configuração do gateway de pagamento
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)

public @interface PaymentGatewayConfig {
    String url();
    String username();
    String password();
}

