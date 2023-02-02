package dev.alexengrig.sample.producer.service;

import dev.alexengrig.sample.producer.domain.ProducerData;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.random.RandomGenerator;

@Service
@RequiredArgsConstructor
public class RandomProducerDataService implements ProducerDataService {

    private final RandomGenerator randomGenerator;

    public RandomProducerDataService() {
        this(RandomGenerator.getDefault());
    }

    @Override
    public ProducerData getDataById(String dataId) {
        String value = getRandomValue(dataId.length() * 2);
        return ProducerData.builder()
                .id(dataId)
                .value(value)
                .build();
    }

    private String getRandomValue(int length) {
        byte[] bytes = new byte[length];
        randomGenerator.nextBytes(bytes);
        return new String(bytes);
    }

}
