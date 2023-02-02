package dev.alexengrig.sample.producer.rest.client.v1;

import dev.alexengrig.sample.producer.rest.dto.v1.ProducerDataResponseV1;

public interface ProducerDataClientV1 {

    ProducerDataResponseV1 getData(String dataId);

}
