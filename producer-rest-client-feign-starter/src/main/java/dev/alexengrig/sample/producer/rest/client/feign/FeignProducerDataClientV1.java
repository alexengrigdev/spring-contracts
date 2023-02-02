package dev.alexengrig.sample.producer.rest.client.feign;

import dev.alexengrig.sample.producer.rest.client.v1.ProducerDataClientV1;
import dev.alexengrig.sample.producer.rest.dto.v1.ProducerDataResponseV1;
import feign.Param;
import feign.RequestLine;

public interface FeignProducerDataClientV1 extends ProducerDataClientV1 {

    @RequestLine("GET /{dataId}")
    @Override
    ProducerDataResponseV1 getData(@Param("dataId") String dataId);

}
