package pl.service;

import java.util.function.Consumer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import pl.model.Vehicle;

@Slf4j
@Component
public class KafkaConsumer {

    @Bean
    public Consumer<Vehicle> vehicleCreate() {
        return vehicle -> {
            log.info("received vehicle={}", vehicle);
        };
    }
}