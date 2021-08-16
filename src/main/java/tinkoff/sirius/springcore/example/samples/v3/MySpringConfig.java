package tinkoff.sirius.springcore.example.samples.v3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "tinkoff.sirius.springcore.example.samples.v3")
public class MySpringConfig {

    @Bean
    public WhatsAppMessenger whatsAppMessenger() {
        return new WhatsAppMessenger();
    }
}
