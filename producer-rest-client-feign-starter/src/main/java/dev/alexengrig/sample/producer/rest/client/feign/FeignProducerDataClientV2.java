package dev.alexengrig.sample.producer.rest.client.feign;

import dev.alexengrig.sample.producer.rest.client.v2.ProducerDataClientV2;
import dev.alexengrig.sample.producer.rest.dto.v2.ProducerDataRequestV2;
import dev.alexengrig.sample.producer.rest.dto.v2.ProducerDataResponseV2;
import feign.Headers;
import feign.RequestLine;

public interface FeignProducerDataClientV2 extends ProducerDataClientV2 {

    @RequestLine("POST")
    @Headers("Content-Type: application/json")
    @Override
    ProducerDataResponseV2 getData(ProducerDataRequestV2 request);

}
