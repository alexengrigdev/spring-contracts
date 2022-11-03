package dev.alexengrig.sample.spring.contract.rest.producer.client.openfeign;

import dev.alexengrig.sample.spring.contract.rest.producer.client.v2.ProducerDataClientV2;
import dev.alexengrig.sample.spring.contract.rest.producer.dto.v2.ProducerDataRequestV2;
import dev.alexengrig.sample.spring.contract.rest.producer.dto.v2.ProducerDataResponseV2;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "producerDataV2", url = "${services.producer.url}/api/v2/datum")
public interface OpenFeignProducerDataClientV2 extends ProducerDataClientV2 {

    @PostMapping
    @Override
    ProducerDataResponseV2 getData(@RequestBody ProducerDataRequestV2 request);

}
