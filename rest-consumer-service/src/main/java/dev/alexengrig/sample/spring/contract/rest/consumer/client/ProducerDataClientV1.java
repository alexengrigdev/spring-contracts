package dev.alexengrig.sample.spring.contract.rest.consumer.client;

import dev.alexengrig.sample.spring.contract.rest.producer.dto.v1.ProducerDataResponseV1;

public interface ProducerDataClientV1 {

    ProducerDataResponseV1 getData(String dataId);

}
