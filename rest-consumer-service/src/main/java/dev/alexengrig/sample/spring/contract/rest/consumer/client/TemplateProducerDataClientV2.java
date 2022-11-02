package dev.alexengrig.sample.spring.contract.rest.consumer.client;

import dev.alexengrig.sample.spring.contract.rest.producer.dto.v2.ProducerDataRequestV2;
import dev.alexengrig.sample.spring.contract.rest.producer.dto.v2.ProducerDataResponseV2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class TemplateProducerDataClientV2 implements ProducerDataClientV2 {

    private final RestTemplate template;

    public TemplateProducerDataClientV2(
            RestTemplateBuilder templateBuilder,
            @Value("${services.producer.url}")
            String producerServiceUrl
    ) {
        this.template = templateBuilder
                .rootUri(producerServiceUrl)
                .build();
    }

    @Override
    public ProducerDataResponseV2 getData(ProducerDataRequestV2 request) {
        return template.postForObject("/api/v2/datum", request, ProducerDataResponseV2.class);
    }

}
