package dev.alexengrig.sample.spring.contract.rest.consumer.client;

import dev.alexengrig.sample.spring.contract.rest.consumer.dto.ProducerDataRequest;
import dev.alexengrig.sample.spring.contract.rest.consumer.dto.ProducerDataResponse;

public interface ProducerDataClientV2 {

    ProducerDataResponse getData(ProducerDataRequest request);

}
