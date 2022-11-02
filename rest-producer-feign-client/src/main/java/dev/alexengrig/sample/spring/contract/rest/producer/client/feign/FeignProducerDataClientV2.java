package dev.alexengrig.sample.spring.contract.rest.producer.client.feign;

import dev.alexengrig.sample.spring.contract.rest.producer.client.v2.ProducerDataClientV2;
import dev.alexengrig.sample.spring.contract.rest.producer.dto.v2.ProducerDataRequestV2;
import dev.alexengrig.sample.spring.contract.rest.producer.dto.v2.ProducerDataResponseV2;
import feign.Headers;
import feign.RequestLine;

@Headers("Content-Type: application/json")
public interface FeignProducerDataClientV2 extends ProducerDataClientV2 {

    @RequestLine("POST")
    @Override
    ProducerDataResponseV2 getData(ProducerDataRequestV2 request);

}
