package dev.alexengrig.sample.spring.contract.rest.producer.client.v1;

import dev.alexengrig.sample.spring.contract.rest.producer.dto.v1.ProducerDataResponseV1;

public interface ProducerDataClientV1 {

    ProducerDataResponseV1 getData(String dataId);

}
