package dev.alexengrig.sample.spring.contract.rest.producer.service;

import dev.alexengrig.sample.spring.contract.rest.producer.domain.ProducerData;

public interface ProducerDataService {

    ProducerData getDataById(String dataId);

}
