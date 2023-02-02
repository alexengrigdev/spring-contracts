package dev.alexengrig.sample.producer.service;

import dev.alexengrig.sample.producer.domain.ProducerData;

public interface ProducerDataService {

    ProducerData getDataById(String dataId);

}
