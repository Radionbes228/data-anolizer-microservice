package com.radion.ru.dataanolizermicroservice.service;

import com.radion.ru.dataanolizermicroservice.model.Data;
import org.springframework.stereotype.Service;

@Service
public class KafkaDataServoceImpl implements KafkaDataService {
    @Override
    public void hundle(Data data) {
        System.out.println("Data object is received: " + data.toString());
    }
}
