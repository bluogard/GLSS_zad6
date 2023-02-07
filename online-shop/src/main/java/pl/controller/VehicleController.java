package pl.controller;

import lombok.RequiredArgsConstructor;

import pl.model.Vehicle;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.service.KafkaProducer;

@RestController
@RequestMapping("/vehicles")
@RequiredArgsConstructor
public class VehicleController {

    private final KafkaProducer kafkaProducer;

    @PostMapping
    public ResponseEntity<String> addVehicle(@RequestBody Vehicle vehicle){
        kafkaProducer.produceVehicle(vehicle);
        return ResponseEntity.ok("ok");
    }


}