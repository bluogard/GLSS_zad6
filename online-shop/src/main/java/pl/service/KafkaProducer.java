package pl.service;

import lombok.RequiredArgsConstructor;
import pl.model.Vehicle;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class KafkaProducer {

    private final StreamBridge streamBridge;

    public void produceVehicle(Vehicle vehicle) {
        streamBridge.send("vehicle-create", vehicle);
    }
}
