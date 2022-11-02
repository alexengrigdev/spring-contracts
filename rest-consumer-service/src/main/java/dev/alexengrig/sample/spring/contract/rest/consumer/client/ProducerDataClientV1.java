package dev.alexengrig.sample.spring.contract.rest.consumer.client;

import dev.alexengrig.sample.spring.contract.rest.consumer.dto.ProducerDataResponse;

public interface ProducerDataClientV1 {

    ProducerDataResponse getData(String dataId);

}
