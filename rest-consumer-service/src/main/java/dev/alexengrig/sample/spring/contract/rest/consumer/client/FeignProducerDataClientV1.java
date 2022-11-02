package dev.alexengrig.sample.spring.contract.rest.consumer.client;

import dev.alexengrig.sample.spring.contract.rest.producer.dto.v1.ProducerDataResponseV1;
import feign.Headers;
import feign.Param;
import feign.RequestLine;

@Headers("Content-Type: application/json")
public interface FeignProducerDataClientV1 extends ProducerDataClientV1 {

    @RequestLine("GET /{dataId}")
    @Override
    ProducerDataResponseV1 getData(@Param String dataId);

}
