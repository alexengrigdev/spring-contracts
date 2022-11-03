package dev.alexengrig.sample.spring.contract.rest.producer.client.openfeign;

import dev.alexengrig.sample.spring.contract.rest.producer.client.openfeign.config.OpenFeignProducerFeignClientConfiguration;
import dev.alexengrig.sample.spring.contract.rest.producer.client.v1.ProducerDataClientV1;
import dev.alexengrig.sample.spring.contract.rest.producer.dto.v1.ProducerDataResponseV1;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(
        name = "producerDataV1",
        url = "${services.producer.url}/api/v1/datum",
        configuration = OpenFeignProducerFeignClientConfiguration.class)
public interface OpenFeignProducerDataClientV1 extends ProducerDataClientV1 {

    @GetMapping("/{dataId}")
    @Override
    ProducerDataResponseV1 getData(@PathVariable("dataId") String dataId);

}
