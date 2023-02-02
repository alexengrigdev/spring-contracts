package dev.alexengrig.sample.producer.rest.client.v2;

import dev.alexengrig.sample.producer.rest.dto.v2.ProducerDataRequestV2;
import dev.alexengrig.sample.producer.rest.dto.v2.ProducerDataResponseV2;

public interface ProducerDataClientV2 {

    ProducerDataResponseV2 getData(ProducerDataRequestV2 request);

}
